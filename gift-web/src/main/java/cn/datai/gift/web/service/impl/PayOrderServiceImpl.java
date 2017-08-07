package cn.datai.gift.web.service.impl;

import cn.datai.gift.persist.mapper.PayInfoMapperExt;
import cn.datai.gift.persist.mapper.PayOrderWxMapperExt;
import cn.datai.gift.persist.po.PayInfo;
import cn.datai.gift.persist.po.PayOrderWx;
import cn.datai.gift.utils.DateUtil;
import cn.datai.gift.utils.enums.RespCode;
import cn.datai.gift.utils.exception.BizException;
import cn.datai.gift.utils.exception.PayingException;
import cn.datai.gift.web.contants.enums.PayInfoStatus;
import cn.datai.gift.web.service.PayOrderService;
import cn.datai.gift.web.service.PayService;
import cn.datai.gift.wxpay.bean.response.WxPayOrderQueryResponse;
import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * Created by H.CAAHN on 2017/4/19.
 */
@Service
public class PayOrderServiceImpl implements PayOrderService {

    @Autowired
    private PayInfoMapperExt payInfoMapperExt;

    @Autowired
    private PayOrderWxMapperExt payOrderWxMapperExt;

    @Autowired
    private PayService payService;

    private static final Logger logger = LoggerFactory.getLogger(PayOrderServiceImpl.class);

    @Transactional(isolation = Isolation.READ_COMMITTED)
    public PayOrderWx queryPayOrderAndLockWxById(String payOrderWxId) {
        return payOrderWxMapperExt.selectByPrimaryKeyAndLock(payOrderWxId);
    }

    /**
     * 在主动查询微信支付订单状态以后调用
     * 更新基本支付信息状态和其他信息，更新微信支付渠道订单信息状态和其他信息
     * @param payInfo
     * @param payOrderWx
     * @param rsp
     * @return
     * <pre>
     *      如果基本支付信息状态改为已支付，返回true
     *      如果基本支付信息状态改为支付取消，返回false
     *      其他状态抛 @see {@link PayingException}
     * </pre>
     */
    @Transactional(isolation = Isolation.READ_COMMITTED)
    public boolean updateForQueryPayOrder(PayInfo payInfo, PayOrderWx payOrderWx, WxPayOrderQueryResponse rsp) throws PayingException{
        boolean payInoResult = false;
        payOrderWx.setPayResultCode(rsp.getResultCode());
        payOrderWx.setPayTransactionId(rsp.getTransactionId());
        String tradeState = rsp.getTradeState();
        Date nowtime = new Date();

        logger.info("微信查询支付信息[tradeStatus:{}, 商户订单号:{}]", tradeState, rsp.getOutTradeNo());
        if ("SUCCESS".equalsIgnoreCase(tradeState) || "REFUND".equalsIgnoreCase(tradeState)) {
            // 支付成功
            payInfo.setStatus(PayInfoStatus.SUCCESS.getPersistKey());
            payInfo.setStatusHistory(payInfo.getStatusHistory() + "," + payInfo.getStatus());
            payInfo.setUpdateTime(nowtime);
            payInoResult = true;
            //TODO if tradeState == "REFUND"   异步执行：查询退款明细，并更新
        }else if ("NOTPAY".equalsIgnoreCase(tradeState)) {
            // 未支付
            if (payInfo.getTimeExpire().after(DateUtil.afterNMin(nowtime, -1))) {//和一分钟前时间比较，防止临界问题（此次查询完以后，用户完成了支付操作，而且支付未过期）
                //支付订单还未超时，所以用户还能继续去做支付，不改任何数据
                throw new PayingException();
            }else {
                //支付订单已超时，用户不能再支付，需要将状态改为取消
                payInfo.setStatus(PayInfoStatus.CANCELLED.getPersistKey());
                payInfo.setStatusHistory(payInfo.getStatusHistory() + "," + payInfo.getStatus());
                payInfo.setUpdateTime(nowtime);
                payInoResult = false;
            }
        }else if ("CLOSED".equalsIgnoreCase(tradeState) || "PAYERROR".equalsIgnoreCase(tradeState)) {
            // 已关闭或支付失败
            //检查当前payInfo的过期时间是否超时
            if (payInfo.getTimeExpire().after(nowtime)) {
                // 如果未超时，就将payInfo状态改为 “未选择支付渠道”，等待下次用户重新支付
                payInfo.setStatus(PayInfoStatus.NO_CHANNEL.getPersistKey());
                payInfo.setStatusHistory(payInfo.getStatusHistory() + "," + payInfo.getStatus());
                payInfo.setPayDetailId(null);
                payInfo.setUpdateTime(nowtime);
                payOrderWx.setIsValid("false");
                throw new PayingException();
            } else {
                //如果已超时，用户将不能再针对此payInfo做支付，将payInfo状态改为 “已取消”
                payInfo.setStatus(PayInfoStatus.CANCELLED.getPersistKey());
                payInfo.setStatusHistory(payInfo.getStatusHistory() + "," + payInfo.getStatus());
                payInoResult = false;
            }
        }else if("REVOKED".equalsIgnoreCase(tradeState)){
        // 已撤销（刷卡支付）
            //TODO 暂无刷卡支付，可不需要处理
            throw new BizException(RespCode.PAY_NO_CHANNEL);
        }
        //更新微信付款明细
        payInfo.setQueryTime(nowtime);
        this.buildProperties(payOrderWx, rsp);
        this.payOrderWxMapperExt.updateByPrimaryKeySelective(payOrderWx);
        this.payInfoMapperExt.updateByPrimaryKeySelective(payInfo);
        return payInoResult;
    }

    private void buildProperties(PayOrderWx record, WxPayOrderQueryResponse rsp) {
        String tradeState = rsp.getTradeState();
        if ("SUCCESS".equalsIgnoreCase(tradeState) || "REFUND".equalsIgnoreCase(tradeState)) {
            record.setPayResultCode("SUCCESS");
        }else {
            record.setPayResultCode("FAIL");
        }
        record.setPayResultCode(rsp.getResultCode());
        record.setPayTransactionId(rsp.getTransactionId());
        record.setBankType(rsp.getBankType());
        record.setSettlementTotalFee(rsp.getSettlementTotalFee());
        record.setCashFee(rsp.getCashFee());
        record.setCashFeeType(rsp.getCashFeeType());
        record.setTimeEnd(rsp.getTimeEnd());

        // 代金券详情
        record.setCouponFee(rsp.getCouponFee());
        record.setCouponCount(rsp.getCouponCount());
        if (rsp.getCouponDetails() != null) {
            record.setCouponDetailList(JSON.toJSONString(rsp.getCouponDetails()));
        }
    }
}
