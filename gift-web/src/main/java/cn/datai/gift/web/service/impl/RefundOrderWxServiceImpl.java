package cn.datai.gift.web.service.impl;

import cn.datai.gift.persist.mapper.PayInfoMapperExt;
import cn.datai.gift.persist.mapper.RefundOrderWxMapperExt;
import cn.datai.gift.persist.po.*;
import cn.datai.gift.persist.vo.Page;
import cn.datai.gift.web.contants.enums.PayChannel;
import cn.datai.gift.web.contants.enums.PayInfoRefundStatus;
import cn.datai.gift.web.service.PayService;
import cn.datai.gift.web.service.RefundOrderWxService;
import cn.datai.gift.wxpay.bean.response.WxPayRefundOrderResponse;
import cn.datai.gift.wxpay.bean.response.WxPayRefundQueryResponse;
import com.alibaba.fastjson.JSON;
import org.apache.poi.ss.formula.functions.T;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by H.CAAHN on 2017/4/25.
 */
@Service
public class RefundOrderWxServiceImpl implements RefundOrderWxService {
    @Autowired
    private RefundOrderWxMapperExt refundOrderWxMapperExt;

    @Autowired
    private PayInfoMapperExt payInfoMapperExt;

    @Resource
    private PayService payService;

    private static final Logger logger = LoggerFactory.getLogger(RefundOrderWxServiceImpl.class);

    private List<String> refundStatus;

    {
        refundStatus = new ArrayList<String>(2);
        refundStatus.add("NOTSURE");
        refundStatus.add("PROCESSING");
    }

    public int countProcessingWxRefund(Date querytime) {
        RefundOrderWxExample example = new RefundOrderWxExample();
        example.createCriteria().andRefundStatusIn(refundStatus).andQueryTimeLessThanOrEqualTo(querytime);
        return refundOrderWxMapperExt.countByExample(example);
    }

    public List<RefundOrderWx> pageProcessingWxRefund(Date querytime, int pageNo, int size, int total) {
        RefundOrderWxExample example = new RefundOrderWxExample();
        example.createCriteria().andRefundStatusIn(refundStatus).andQueryTimeLessThanOrEqualTo(querytime);
        Page page = new Page(true, pageNo, size, total);
        example.setPage(page);
        return refundOrderWxMapperExt.selectByExample(example);
    }

    public RefundOrderWx queryByOutTradeNo(String outTradeNo) {
        RefundOrderWxExample example = new RefundOrderWxExample();
        example.createCriteria().andOutTradeNoEqualTo(outTradeNo);
        List<RefundOrderWx> rList = this.refundOrderWxMapperExt.selectByExample(example);
        if (rList != null && !rList.isEmpty()) {
            return rList.get(0);
        }
        return null;
    }

    @Transactional
    public RefundOrderWx insertForRefund(PayOrderWx payOrderWx, String outRefundNo) {
        RefundOrderWx record = new RefundOrderWx();
        record.setOutRefundNo(outRefundNo);
        record.setOutTradeNo(payOrderWx.getPayOrderWxId());
        record.setAppid(payOrderWx.getAppid());
        record.setTotalFee(payOrderWx.getTotalFee() != null ? payOrderWx.getTotalFee().intValue() : 0l);
        record.setRefundFee(payOrderWx.getCashFee() != null ? payOrderWx.getCashFee().intValue() : 0l);
        record.setRefundFeeType(payOrderWx.getFeeType());
        record.setCashFee(payOrderWx.getCashFee() != null ? payOrderWx.getCashFee().intValue(): 0l);
        record.setCashFeeType(payOrderWx.getCashFeeType());
        record.setQueryCount(0);
        record.setCreatetime(new Date());

        this.refundOrderWxMapperExt.insertSelective(record);
        RefundOrderWx refundOrderWx = this.refundOrderWxMapperExt.selectByPrimaryKey(outRefundNo);
        return refundOrderWx;
    }

    @Transactional(propagation = Propagation.NESTED, isolation = Isolation.READ_COMMITTED, rollbackFor = Exception.class)
    public void updateForApplyRefund(WxPayRefundOrderResponse response, String outRefundNo, long payInfoId) {
        //先上锁基本支付信息，更新退款状态
        PayInfo payInfo = payInfoMapperExt.selectByPrimaryKeyAndLock(payInfoId);
        if ("SUCCESS".equals(response.getResultCode())) {
            //确认上报成功才更新为processing
            payInfo.setRefundStatus(PayInfoRefundStatus.PROCESSING.getPersistKey());
        }else {
            //通信成功，但有错误，只将状态改为created
            payInfo.setRefundStatus(PayInfoRefundStatus.CREATED.getPersistKey());
        }
        payInfoMapperExt.updateByPrimaryKeySelective(payInfo);
        logger.info("保存上报商户退款单号信息{}，退款成功后，更新基本支付信息的退款状态为 {}", outRefundNo, payInfo.getRefundStatus());

        logger.debug("上报退款微信响应的对象：{}", response);
        RefundOrderWx refundOrderWx = new RefundOrderWx();
        refundOrderWx.setOutRefundNo(outRefundNo);
        refundOrderWx.setRefundId(response.getRefundId());
        refundOrderWx.setTransactionId(response.getTransactionId());
        refundOrderWx.setSettlementRefundFee(response.getSettlementRefundFee() != null ? response.getSettlementRefundFee().intValue() : 0L);
        refundOrderWx.setSettlementTotalFee(response.getSettlementTotalFee() != null ? response.getSettlementTotalFee().intValue() : 0L);
        refundOrderWx.setCashRefundFee(response.getCashRefundFee() != null ? response.getCashRefundFee().intValue() : 0L);
        refundOrderWx.setCouponRefundFee(response.getCouponRefundFee() != null ? response.getCouponRefundFee().intValue() : 0L);
        refundOrderWx.setCouponRefundCount(response.getCouponRefundCount());
        refundOrderWx.setCouponInfo(JSON.toJSONString(response.getDetailList()));
        refundOrderWx.setResultCode(response.getResultCode());
        refundOrderWx.setQueryCount(0);

        if ("SUCCESS".equals(response.getResultCode())) {
            //确认上报成功才更新为processing
            refundOrderWx.setRefundStatus(PayInfoRefundStatus.PROCESSING.getPersistKey());
        }else {
            //通信成功，但有错误，只将状态改为created
            refundOrderWx.setRefundStatus(PayInfoRefundStatus.CREATED.getPersistKey());
        }
        Calendar calendar = Calendar.getInstance();
        refundOrderWx.setCreatetime(calendar.getTime());
        calendar.add(Calendar.MINUTE, 30);
        refundOrderWx.setQueryTime(calendar.getTime());
        logger.debug("准备更新退款上报成功后的信息：{}", refundOrderWx);
        this.refundOrderWxMapperExt.updateByPrimaryKeySelective(refundOrderWx);
    }

    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, rollbackFor = Exception.class)
    public void updateForQueryRefundOrder(RefundOrderWx refund, WxPayRefundQueryResponse rsp) {
        try {
            int queryCount = refund.getQueryCount() != null ? refund.getQueryCount() + 1 : 1;
            refund.setResultCode(rsp.getResultCode());
            refund.setQueryCount(queryCount);

            // 因该方法采用商户退款单号查询退款信息，因此返回的退款笔数应有且只有一条
            if ("SUCCESS".equalsIgnoreCase(rsp.getResultCode())) {
                if (rsp.getRefundCount() != null && rsp.getRefundCount() == 1) {
                    switch (rsp.getRefundStatus()[0]) {
                        case "SUCCESS"://退款成功
                            this.buildProperties(refund, rsp);
                            refund.setQueryTime(null);
                            break;
                        case "REFUNDCLOSE" :// 退款关闭
                            this.buildProperties(refund, rsp);
                            refund.setQueryTime(null);
                            break;
                        case "NOTSURE" : //未确定，需要商户用原退款单号重新发起退款申请。
                            this.buildNextQuery(refund);
                            break;
                        case "PROCESSING" : // 退款处理中
                            this.buildNextQuery(refund);
                            break;
                        case "CHANGE":  //退款异常，退款到银行发现用户的卡作废或者冻结了，导致原路退款银行卡失败，商户可以发起异常退款处理的申请，可以退款到用户的新卡或者退款商户，商户自行处理。
                            this.buildProperties(refund, rsp);
                            refund.setQueryTime(null);
                            break;
                        default:
                            logger.error("根据商户退款单号查询退款信息错误：退款状态数据异常:{}", refund.getRefundStatus());
                            break;
                    }
                }
                else {
                    this.buildNextQuery(refund);
                    logger.error("根据商户退款单号查询退款信息错误：退款笔数，预期值:1，实际值:{}", rsp.getRefundCount());
                }
            }
            else {
                this.buildNextQuery(refund);
            }

            this.refundOrderWxMapperExt.updateByPrimaryKeySelective(refund);

            // 更新订单信息
            PayInfoExample payInfoExample = new PayInfoExample();
            payInfoExample.createCriteria().andChannelEqualTo(PayChannel.WX.getPersistKey()).andPayDetailIdEqualTo(refund.getOutTradeNo());
            List<PayInfo> list = this.payInfoMapperExt.selectByExample(payInfoExample);
            if (list != null && !list.isEmpty()) {
                PayInfo payInfo = list.get(0);
                payInfo.setRefundStatus(refund.getRefundStatus());
                payInfo.setRefundedPrice(refund.getRefundFee());
                this.payInfoMapperExt.updateByPrimaryKeySelective(payInfo);
            }
        }
        catch (Exception ex) {
            logger.error("微信查询退款信息失败，商户退款单号：" + refund.getOutRefundNo(), ex);
        }
    }

    private void buildNextQuery(RefundOrderWx refund) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MINUTE, 30);
        refund.setQueryTime(calendar.getTime());
    }

    private void buildProperties(RefundOrderWx refund, WxPayRefundQueryResponse rsp) {
        refund.setTransactionId(rsp.getTransactionId());
        refund.setSettlementRefundFee(this.getFirstValue(rsp.getSettlementRefundFee(), Integer.class).longValue());
        refund.setSettlementTotalFee(rsp.getSettlementTotalFee() != null ? rsp.getSettlementTotalFee().intValue() : 0L);
        refund.setCashFee(rsp.getCashFee() != null ? rsp.getCashFee().intValue() : 0L);
        refund.setCashFeeType(rsp.getFeeType());
        refund.setCouponRefundFee(this.getFirstValue(rsp.getCouponRefundFees(), Integer.class).longValue());
        refund.setCashRefundFee(refund.getSettlementRefundFee() - refund.getCouponRefundFee());
        refund.setCouponRefundCount(this.getFirstValue(rsp.getCouponRefundCount(), Integer.class));
        refund.setCouponInfo((rsp.getCouponRefundDetails() != null && !rsp.getCouponRefundDetails().isEmpty()) ? JSON.toJSONString(rsp.getCouponRefundDetails().get(0)) : "");
        refund.setRefundStatus(this.getFirstValue(rsp.getRefundStatus(), String.class));
        refund.setQueryTime(null);
    }

    private <T> T getFirstValue(T[] t, Class<T> clazz) {
        T result = null;
        if (t != null && t.length > 0) {
            result = t[0];
        }

        if (result == null) {
            if (clazz == String.class) {
                result = (T)"";
            }
            else if (clazz == Integer.class || clazz == int.class) {
                result = (T)Integer.valueOf(0);
            }
            else if (clazz == Long.class || clazz == long.class) {
                result = (T)Long.valueOf(0L);
            }
        }
        return result;
    }
}
