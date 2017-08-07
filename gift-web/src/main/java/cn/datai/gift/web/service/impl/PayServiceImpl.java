package cn.datai.gift.web.service.impl;

import cn.datai.gift.persist.mapper.PayInfoMapperExt;
import cn.datai.gift.persist.mapper.PayOrderWxMapperExt;
import cn.datai.gift.persist.mapper.TradeOrderMapperExt;
import cn.datai.gift.persist.po.PayInfo;
import cn.datai.gift.persist.po.PayOrderWx;
import cn.datai.gift.persist.po.RefundOrderWx;
import cn.datai.gift.persist.po.TradeOrder;
import cn.datai.gift.persist.vo.commodity.CommodityVo;
import cn.datai.gift.utils.DateUtil;
import cn.datai.gift.utils.RespResult;
import cn.datai.gift.utils.enums.RespCode;
import cn.datai.gift.utils.exception.BizException;
import cn.datai.gift.utils.exception.PayingException;
import cn.datai.gift.web.contants.enums.*;
import cn.datai.gift.web.plugin.vo.UserLoginInfo;
import cn.datai.gift.web.service.*;
import cn.datai.gift.web.utils.IpUtil;
import cn.datai.gift.wxpay.bean.common.WxPayNetException;
import cn.datai.gift.wxpay.bean.common.WxPayNotifyReceiver;
import cn.datai.gift.wxpay.bean.common.WxPayResponseException;
import cn.datai.gift.wxpay.bean.response.WxPayOrderQueryResponse;
import cn.datai.gift.wxpay.bean.response.WxPayRefundOrderResponse;
import cn.datai.gift.wxpay.bean.response.WxPayRefundQueryResponse;
import cn.datai.gift.wxpay.util.SignUtil;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * Created by zhangyutao on 2017/4/11.
 */
@Service
public class PayServiceImpl extends BasePayService implements PayService {

    private static Logger logger = LoggerFactory.getLogger(PayServiceImpl.class);

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private PayInfoMapperExt payInfoMapperExt;

    @Autowired
    private PayOrderWxMapperExt payOrderWxMapperExt;

    @Autowired
    @Lazy
    private PayOrderService payOrderService;

    @Autowired
    @Lazy
    private RefundOrderWxService refundOrderWxService;

    @Autowired
    @Lazy
    private TakeGoodsService takeGoodsService;

    @Autowired
    private BuyCommodityService buyCommodityService;

    @Autowired
    private TradeOrderMapperExt tradeOrderMapperExt;

    @Autowired
    private CommodityService commodityService;


    /**
     * 下支付渠道订单
     * <pre>
     *      当前方法不加事务
     *      注意：调用此接口前必须保证业务订单信息、基本支付信息已存储在数据库中
     *
     *      微信渠道：
     *              公众号支付：PayChannel.WX
     *                      参数：
     *                          deviceInfo        设备号：自定义参数，可以为终端设备号(门店号或收银设备ID)，PC网页或公众号内支付可以传"WEB"
     *                          body              商品描述：商品简单描述，商品字段规则：商家名称-销售商品类目，  样例：罗辑思维-图书
     *                          detail            商品详情：单品优惠字段(暂未上线)
     *                          attach            附加数据：附加数据，在查询API和支付通知中原样返回，可作为自定义参数使用。
     *                          feeType           标价币种：符合ISO 4217标准的三位字母代码，默认人民币：CNY
     *                          spbillCreateIp    终端IP：提交用户端ip
     *                          goodsTag          商品标记：商品标记，使用代金券或立减优惠功能时需要的参数
     *                          tradeType         交易类型: 取值如下：JSAPI，NATIVE，APP等 @see {@link WxTradeType}
     *                          productId         商品ID：此参数为二维码中包含的商品ID，商户自行定义。
     *                          limitPay          指定支付方式：上传此参数no_credit--可限制用户不能使用信用卡支付
     *                          openid            用户标识：微信用户在商户对应appid下的唯一标识。
     *                      返回：
     *                          Map类型，包含：
     *                          appId             公众号id
     *                          timeStamp         当前时间戳
     *                          nonceStr          用于签名的随机字符串
     *                          package           包含的相关预定单信息
     *                          signType          签名类型
     *                          paySign           签名
     *                      方法内实现的具体步骤：
     *                          1、事务A中完成（存储渠道支付订单信息、修改基本支付信息对应的支付渠道信息、修改相应状态），调用 <code> createWxPayOrder(PayInfo payInfo, WxTradeType wxTradeType, Map<String, String> params)</code>方法
     *                          2、事务B中上报微信服务器相关支付订单信息，返回预付订单信息，并将返回的预订单信息与支付渠道订单信息绑定，调用 <code> callAndBindWxPrepayInfo() </code> 方法
     *                          3、生成前端唤起H5支付窗口需要的参数  调用 <code> genWxPayFrontParams() </code> 方法
     *              APP支付（还没写呢）：
     * </pre>
     *
     * @param payInfo    @see {@link PayInfo}
     * @param payChannel @see {@link PayChannel}
     * @param params     对应支付渠道的下单所需的参数
     */
    @Override
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, rollbackFor = Exception.class)
    public Map payChannelOrder(PayInfo payInfo, PayChannel payChannel, Map params) throws WxPayNetException {
        switch (payChannel) {
            case WX:
                switch (WxTradeType.valueOf(params.get("tradeType").toString())) {
                    case JSAPI:
                        //1、存储渠道支付订单信息、修改基本支付信息对应的支付渠道信息、修改相应状态
                        PayOrderWx payOrderWx = this.createWxPayOrder(payInfo, WxTradeType.JSAPI, params);
                        //2、另起嵌套事务， 上报微信服务器相关支付订单信息，返回预付订单信息
                        try {
                            //捕获异常，不让外层事务回滚
                            payOrderWx = this.callAndBindWxPrepayInfo(payOrderWx);
                        } catch (WxPayNetException e) {
                            //通信异常，上报微信确认失败，必须向上抛异常，让事务回滚
                            logger.error("上报微信支付接口通信失败：", e);
                            throw e;
                        } catch (WxPayResponseException e) {
                            logger.error("上报微信支付接口发生异常，抛弃本次生成的渠道订单", e);
                            throw e;
                        } catch (Exception e) {
                            logger.error("上报微信支付订单时，发生异常，可能上报成功，可能失败,需要回滚本次生成的渠道订单", e);
                            throw e;
                        }
                        Map<String, String> wxPayFrontInfos = this.genWxPayFrontInfo(payOrderWx);
                        return wxPayFrontInfos;
                    default:
                        throw new BizException(RespCode.WX_PAY_NO_TRADE_TYPE);
                }

            default:
                throw new BizException(RespCode.PAY_NO_CHANNEL);
        }
    }

    /**
     * 生成支付订单
     * <pre>
     *      payInfo的状态： A：已创建支付订单，未选择支付渠道  B：已选择绑定支付渠道，如微信，支付宝之类的，未支付  C：支付已取消 D:支付成功
     *      此时并未绑定支付渠道 状态为A
     * </pre>
     * @param userInfoId 用户id
     * @param operatorId 运营商id
     * @param amount     支付金额，分为单位
     * @param payBizType 业务类型
     * @param bizId      业务Id
     * @param timeExpire 超时时间, 留给交易的时间必须大于5分钟
     * @param remark     注释
     */
    @Override
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, rollbackFor = Exception.class)
    public PayInfo createPayOrder(long userInfoId, long operatorId, long amount, PayBizType payBizType, String bizId, Date timeExpire, String remark) {
        PayInfo payInfo = new PayInfo();
        payInfo.setUserInfoId(userInfoId);
        payInfo.setOperatorInfoId(operatorId);
        payInfo.setPayAmount(amount);
        payInfo.setBizType(payBizType.getPersistKey());
        payInfo.setBizId(bizId);
        payInfo.setStatus(PayInfoStatus.NO_CHANNEL.getPersistKey());
        payInfo.setStatusHistory(PayInfoStatus.NO_CHANNEL.getPersistKey());
        payInfo.setBizProcessed("false");
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.MILLISECOND, 0);
        Date createTime = calendar.getTime();
        payInfo.setTimeStart(createTime);
        payInfo.setCreateTime(createTime);
        if (timeExpire == null) {
            //默认超时时间为当前时间为开始，两个小时后超时
            payInfo.setTimeExpire(DateUtils.addHours(createTime, 2));
        }else{
            if (timeExpire.compareTo(DateUtil.afterNMin(createTime, 5)) <= 0) {
                //交易时间必须大于5分钟
                throw new BizException(RespCode.WX_PAY_EXPIRED_TIME_ERROR);
            }
            payInfo.setTimeExpire(timeExpire);
        }
        payInfoMapperExt.insert(payInfo);

        return payInfo;

    }

    /**
     * 支付下单，并直接绑定微信支付，返回微信支付订单信息
     * @param payInfo 基本支付信息
     * @param params 参数
     */
    @Override
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, rollbackFor = Exception.class)
    public PayOrderWx createWxPayOrder(PayInfo payInfo, WxTradeType wxTradeType, Map<String, String> params) {
        PayInfo payInfo1 = payInfoMapperExt.selectByPrimaryKeyAndLock(payInfo.getPayInfoId());
        if (!payInfo.equals(payInfo1)) {
            throw new BizException(RespCode.SERVER_BUSY);
        }

        String currentTime = DateUtil.getGMT8TimeStr("YYMMddHHmmss");
        redisTemplate.boundValueOps("system:pay:wx_pay_id_gen_" + currentTime).expire(10, TimeUnit.SECONDS);
        Long sequence =redisTemplate.boundValueOps("system:pay:wx_pay_id_gen_" + currentTime).increment(1);
        if (sequence > 9999) {
            throw new BizException(RespCode.SERVER_BUSY);
        }
        DecimalFormat decimalFormat = new DecimalFormat("0000");
        String formatSequence = decimalFormat.format(sequence);
        String wxPayOrderId = PayChannel.WX.getPersistKey() + currentTime + formatSequence;//生成形如 wx1704121801239999, wx+时间+4位的序列（不足补零）

        //构建微信支付订单
        PayOrderWx payOrderWx = new PayOrderWx();
        payOrderWx.setPayOrderWxId(wxPayOrderId);
        payOrderWx.setPayInfoId(payInfo.getPayInfoId());
        payOrderWx.setAppid(super.wxAppID);
        payOrderWx.setMchId(super.wxMchID);
        payOrderWx.setDeviceInfo(params.get("deviceInfo"));
        payOrderWx.setBody(params.get("body"));
        payOrderWx.setDetail(params.get("detail"));
        payOrderWx.setAttach(params.get("attach"));
        payOrderWx.setFeeType(params.get("feeType"));
        payOrderWx.setTotalFee(payInfo.getPayAmount().intValue());
        payOrderWx.setSpbillCreateIp(params.get("spbillCreateIp"));
        payOrderWx.setTimeStart(DateUtil.dt2Str(payInfo.getTimeStart(), "yyyyMMddHHmmss"));
        payOrderWx.setTimeEnd(DateUtil.dt2Str(payInfo.getTimeExpire(), "yyyyMMddHHmmss"));
        payOrderWx.setGoodsTag(params.get("goodsTag"));
        payOrderWx.setTradeType(wxTradeType.getPersistKey());
        payOrderWx.setProductId(params.get("productId"));
        payOrderWx.setLimitPay(params.get("limitPay"));
        payOrderWx.setOpenid(params.get("openid"));
        payOrderWx.setIsValid("true");
        payOrderWxMapperExt.insert(payOrderWx);

        payInfo.setChannel(PayChannel.WX.getPersistKey());
        payInfo.setPayDetailId(wxPayOrderId);
        payInfo.setStatus(PayInfoStatus.UNPAYING.getPersistKey());
        payInfo.setStatusHistory(payInfo.getStatusHistory() + "," + PayInfoStatus.UNPAYING.getPersistKey());
        payInfoMapperExt.updateByPrimaryKeySelective(payInfo);
        return payOrderWx;
    }

    /**
     * 获取公众号支付前端需要的参数
     * 提交微信渠道支付信息，将返回的预付订单号存入渠道信息
     * 将预订单签名，返回相关参数
     */
    @Override
    public Map<String, String> genWxPayFrontInfo(PayOrderWx payOrderWx){
        // 有预付订单信息，说明此单已成功上报微信服务器，准备签名等参数用于前台唤起微信支付窗口
        HashMap<String, String> frontPayInfo = new HashMap<>();
        frontPayInfo.put("appId", payOrderWx.getAppid());
        frontPayInfo.put("timeStamp", String.valueOf(System.currentTimeMillis() / 1000));
        frontPayInfo.put("nonceStr", String.valueOf(System.currentTimeMillis()));
        frontPayInfo.put("package", "prepay_id=" + payOrderWx.getPrepayId());
        frontPayInfo.put("signType", "MD5");
        if ("NATIVE".equals(payOrderWx.getTradeType())) {
            frontPayInfo.put("codeUrl", payOrderWx.getCodeUrl());
        }
        frontPayInfo.put("paySign", SignUtil.createSign(frontPayInfo, this.wxApiKey));
        logger.info("生成订单返回微信js前台调用微信支付控件的参数：{}", frontPayInfo);
        return frontPayInfo;
    }


    /**
     * 支付结果反馈回本系统
     * @param wxPayNotifyReceiver 相对应支付渠道反馈的数据
     */
    @Transactional(isolation = Isolation.READ_COMMITTED, rollbackFor = Exception.class)
    public PayInfo wxPayResultNotify(WxPayNotifyReceiver wxPayNotifyReceiver) throws BizException {
        //支付成功，保存相关支付订单数据
        PayOrderWx payOrderWx = payOrderWxMapperExt.selectByPrimaryKey(wxPayNotifyReceiver.getOutTradeNo());
        if (payOrderWx == null) {
            logger.error("严重异常，微信服务器传来的订单未能在系统中查找到， {}", payOrderWx);
            throw new BizException(RespCode.WX_PAY_NOT_FOUND);
        }
        //先不能锁微信渠道信息，否则可能会发生死锁，对支付基本信息上锁以后再锁微信渠道信息
        PayInfo payInfo = this.payInfoMapperExt.selectByPrimaryKeyAndLock(payOrderWx.getPayInfoId());
        PayOrderWx payOrderWx1 = payOrderWxMapperExt.selectByPrimaryKeyAndLock(wxPayNotifyReceiver.getOutTradeNo());
        if (!payOrderWx1.equals(payOrderWx)) {
            throw new BizException(RespCode.SERVER_BUSY);
        }
        if ("SUCCESS".equals(payOrderWx.getPayResultCode())) {
            //已处理过此订单，抛异常rollback数据
            throw new BizException(RespCode.WX_PAY_ALREADY_SUCCESS);
        }

        payInfo.setPayInfoId(payOrderWx.getPayInfoId());
        payInfo.setStatus(PayInfoStatus.SUCCESS.getPersistKey());
        payInfo.setStatusHistory(payInfo.getStatusHistory() + "," + payInfo.getStatus());
        this.payInfoMapperExt.updateByPrimaryKeySelective(payInfo);
        payOrderWx.setPayTransactionId(wxPayNotifyReceiver.getTransactionId());
        payOrderWx.setPayResultCode(wxPayNotifyReceiver.getResultCode());
        payOrderWx.setBankType(wxPayNotifyReceiver.getBankType());
        payOrderWx.setSettlementTotalFee(wxPayNotifyReceiver.getSettlementTotalFee());
        payOrderWx.setCashFee(wxPayNotifyReceiver.getCashFee());
        payOrderWx.setCashFeeType(wxPayNotifyReceiver.getCashFeeType());
        payOrderWx.setCouponFee(wxPayNotifyReceiver.getCouponFee());
        payOrderWx.setCouponCount(wxPayNotifyReceiver.getCouponCount());
        if (null != wxPayNotifyReceiver.getCouponDetails() && !wxPayNotifyReceiver.getCouponDetails().isEmpty()) {
            payOrderWx.setCouponDetailList(JSONObject.toJSONString(wxPayNotifyReceiver.getCouponDetails()));
        }
        payOrderWx.setTimeEnd(wxPayNotifyReceiver.getTimeEnd());
        this.payOrderWxMapperExt.updateByPrimaryKeySelective(payOrderWx);
        logger.info("准备记录微信发送来的支付完成信息");
        return payInfo;
    }

    /**
     * 支付完成后，业务操作, 异步执行
     */
    @Override
    @Async
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, rollbackFor = Exception.class)
    public void afterPayBizHandler(PayInfo payInfo) throws WxPayNetException, IOException {
        Long payInfoId = payInfo.getPayInfoId();

        //检查PAY_INFO记录， 判断状态业务是否已被处理
        String processed = payInfo.getBizProcessed();
        if ("true".equals(processed)) {
            throw new BizException(RespCode.PAY_BIZ_PROCEESSED);
        }

        switch (PayBizType.valueOf(payInfo.getBizType())) {
            case BUY_COMMODITY:
                //购买商品付款成功的逻辑，注意用户是否已取消业务订单，如果有，发起退款申请
                buyCommodityService.paidBuyCommodity(payInfoId);
                break;
            case DELIVERY:
                //提货付款成功的逻辑，注意用户是否已取消业务订单，如果有，发起退款申请
                takeGoodsService.paidPickUp(payInfoId);
                break;
            default:
                throw new BizException(RespCode.FAIL);
        }
    }

    /**
     * 支付完成后，业务操作
     */
    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public void afterPayBizHandlerSimple(PayInfo payInfo) throws WxPayNetException, IOException {
        Long payInfoId = payInfo.getPayInfoId();

        //检查PAY_INFO记录， 判断状态业务是否已被处理
        String processed = payInfo.getBizProcessed();
        if ("true".equals(processed)) {
            throw new BizException(RespCode.PAY_BIZ_PROCEESSED);
        }

        switch (PayBizType.valueOf(payInfo.getBizType())) {
            case BUY_COMMODITY:
                //购买商品付款成功的逻辑，注意用户是否已取消业务订单，如果有，发起退款申请
                buyCommodityService.paidBuyCommodity(payInfoId);
                break;
            case DELIVERY:
                //提货付款成功的逻辑，注意用户是否已取消业务订单，如果有，发起退款申请
                takeGoodsService.paidPickUp(payInfoId);
                break;
            default:
                throw new BizException(RespCode.FAIL);
        }
    }


    /**
     * 主动去服务器查询某个基本支付订单绑定的渠道订单状态
     * 如果基本支付状态改为已支付，返回 true
     * 如果基本支付状态改为支付已取消， 返回 false
     * 其他状态抛 @see {@link PayingException}
     * @param payInfo
     * @return
     */
    @Override
    @Transactional
    public boolean payOrderQueryAndUpdate(PayInfo payInfo) throws WxPayNetException, PayingException {
        switch (PayChannel.valueOf(payInfo.getChannel())) {
            case WX:
                PayInfo payInfo1 = payInfoMapperExt.selectByPrimaryKeyAndLock(payInfo.getPayInfoId());
                if (!payInfo1.equals(payInfo)) {
                    throw new BizException(RespCode.SERVER_BUSY);
                }
                PayOrderWx record = payOrderService.queryPayOrderAndLockWxById(payInfo.getPayDetailId());
                if (!"true".equalsIgnoreCase(record.getIsValid())) {
                    throw new BizException(RespCode.WX_PAY_INVALID);
                }

                WxPayOrderQueryResponse rsp = super.wxJsapiQuery(record.getPayTransactionId(), record.getPayOrderWxId());

                String returnCode = rsp.getReturnCode();

                if ("SUCCESS".equals(returnCode)) {
                    if ("SUCCESS".equals(rsp.getResultCode())) {
                        return this.payOrderService.updateForQueryPayOrder(payInfo, record, rsp);
                    } else if ("FAIL".equals(rsp.getResultCode())) {
                        logger.warn("微信支付失败：{}", rsp);
                        return false;
                    }
                }else if ("FAIL".equals(returnCode)){
                    throw new BizException(RespCode.SERVER_ERROR);
                }
                break;
            default:
                throw new BizException(RespCode.PAY_NO_CHANNEL);
        }
        return false;
    }

    /**
     * 按原支付基本信息中绑定的支付渠道进行支付
     * <pre>
     *      实现逻辑：
     *      锁基本支付信息表,判断支付状态
     *      判断大的支付渠道
     *      锁对应渠道的支付信息表，判断交易类型，去各自的逻辑去处理
     *      微信公众号支付：
     *          如果有预订单，直接处理
     *          如果没有预订单，生成一条新的渠道支付渠道，上报微信，拿到并存储预订单号，签名返回前端参数
     * </pre>
     *
     *
     * @param payInfo
     * @param payParams
     */
    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public Map<String, String> payOriginalChannel(PayInfo payInfo, HashMap<String, String> payParams) throws WxPayNetException {
        payInfo = payInfoMapperExt.selectByPrimaryKeyAndLock(payInfo.getPayInfoId());
        PayInfoStatus payInfoStatus = PayInfoStatus.valueOf(payInfo.getStatus());
        switch (payInfoStatus) {
            case CANCELLED:
                throw new BizException(RespCode.PAY_CANCELLED);
            case SUCCESS:
                throw new BizException(RespCode.PAY_ALREADY);
            case NO_CHANNEL:{
                //1 选择支付渠道，存储数据库
                //默认选择微信公众号支付
                PayOrderWx payOrderWx = this.createWxPayOrder(payInfo, WxTradeType.JSAPI, payParams);
                //2、嵌套事务，提交渠道订单信息至支付供应商、存储预订单
                try {
                    payOrderWx = this.callAndBindWxPrepayInfo(payOrderWx);
                } catch (WxPayNetException e) {
                    //通信异常， 上报微信肯定失败，必须向上抛异常，让事务回滚
                    logger.error("上报微信支付接口通信失败：", e);
                    throw e;
                } catch (Exception e) {
                    logger.error("上报微信支付订单时，发生异常，可能上报成功，可能失败,需要回滚本次生成的渠道订单", e);
                    throw e;
                }
                //3、生成前端所需参数，用户唤起支付窗口
                Map<String, String> wxPayFrontInfos = this.genWxPayFrontInfo(payOrderWx);
                return wxPayFrontInfos;
            }
            case UNPAYING: {
                //已选择支付渠道，但未支付， 拿原来的渠道信息重新生成前端参数，唤起支付窗口
                switch (PayChannel.valueOf(payInfo.getChannel())) {
                    case WX:
                        PayOrderWx payOrderWx = payOrderWxMapperExt.selectByPrimaryKeyAndLock(payInfo.getPayDetailId());
                        switch (WxTradeType.valueOf(payParams.get("tradeType"))) {
                            case JSAPI:
                                //返回唤起支付窗口的参数
                                return this.genWxPayFrontInfo(payOrderWx);
                        }
                    default:
                        logger.error("payInfoId:{}, 支付信息中未包含支付渠道类型", payInfo.getPayInfoId());
                        throw new BizException(RespCode.SERVER_ERROR);
                }
            }
            default:
                logger.error("payInfoId:{}, 支付信息中未包含状态信息",  payInfo.getPayInfoId());
                throw new BizException(RespCode.SERVER_ERROR);
        }
    }

    /**
     * 退款状态查询
     * @param refund
     */
    @Override
    public void payRefundQuery(RefundOrderWx refund) throws WxPayNetException {
        WxPayRefundQueryResponse rsp = super.wxRefundQuery(refund.getOutRefundNo());
        this.refundOrderWxService.updateForQueryRefundOrder(refund, rsp);

        // 重新发起退款请求
        if ("NOTSURE".equalsIgnoreCase(refund.getRefundStatus())) {
            PayOrderWx payOrderWx = payOrderWxMapperExt.selectByPrimaryKey(refund.getOutTradeNo());
            this.refund(payOrderWx.getPayInfoId());
        }
    }

    /**
     * 申请退款
     * @param payInfoId 基本支付信息id
     */
    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public void refund(long payInfoId) throws WxPayNetException {
        PayInfo payInfo = payInfoMapperExt.selectByPrimaryKeyAndLock(payInfoId);
        if (StringUtils.isNotBlank(payInfo.getRefundStatus())) {
            //检查退款状态， 如果有任意状态，不能往下执行
            throw new BizException(RespCode.PAY_REFUND_ALREADY);
        }
        String payInfoChannel = payInfo.getChannel();
        switch (PayChannel.valueOf(payInfoChannel)) {
            case WX:{
                PayOrderWx payOrderWx = this.payOrderWxMapperExt.selectByPrimaryKeyAndLock(payInfo.getPayDetailId());
                //1、存储或查询退款信息
                RefundOrderWx refundOrderWx = this.createOrFindRefundOrderWx(payOrderWx);

                //判断退款订单中是否有result_code, 没有就说明上次保存了退款信息，但未成功上报给微信； 有就说明已上报微信，不能再上报了
                if (StringUtils.isBlank(refundOrderWx.getResultCode())) {
                    //调用申请退款接口
                    WxPayRefundOrderResponse response = null;
                    try {
                        //必须捕获异常，并做相应的处理，防止上报成功但方法异常，造成外层事务rollback
                        response = super.wxJsapiRefundOrder(payOrderWx, refundOrderWx.getOutRefundNo());
                    } catch (WxPayNetException e) {
                        logger.error("上报微信退款接口通信失败，执行回滚:", e.getError());
                        throw e;
                    } catch (Exception e) {
                        logger.error("上报微信退款信息异常，可能已上报，也可能未上报， 此异常不影响外层事务，异常信息：{}", e);
                    }

                    try {
                        if (response != null && "SUCCESS".equals(response.getReturnCode())) {
                            if ("SUCCESS".equals(response.getResultCode()) || "FAIL".equals(response.getResultCode())) {
                                //上报成功,不论resultCode是啥，都要落库
                                //必须捕获异常并处理，否则发生异常会让外层事务rollback，造成本地退款订单明细丢失
                                // 3、开启嵌套事务(外层事务锁住了基本支付信息，如果开启新事务，大事务未提交，新事务就无法获取锁)，更新支付基本信息的退款状态， 并且保存微信服务器返回的微信端退款号
                                refundOrderWxService.updateForApplyRefund(response, refundOrderWx.getOutRefundNo(), payInfo.getPayInfoId());
                            }
                        }else{
                            //上报微信失败或已成功但发生异常
                            logger.error("上报微信退款信息异常，是否成功未知, 但本地会存储退款订单信息");
                        }
                    }
                    catch (Exception ex) {
                        //捕获并处理异常，让外层事务能够commit，本次已成功提交退款申请，但微信返回的退款号未能成功保存，之后会在定时任务中检查有商户退款号，但没有微信退款号的退款信息，调用微信退款查询接口，补回丢失的微信退款信息
                        logger.error("保存退款申请信息失败", ex);
                    }
                }else {
                    throw new BizException(RespCode.WX_PAY_REFUND_SUBMITTED);
                }
            }
            break;
            default:
                throw new BizException(RespCode.PAY_NO_CHANNEL);
        }
    }

    /**
     * 给某微信支付订单查找或新建退款订单信息
     * @param payOrderWx
     * @return
     */
    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public RefundOrderWx createOrFindRefundOrderWx(PayOrderWx payOrderWx){
        RefundOrderWx order = this.refundOrderWxService.queryByOutTradeNo(payOrderWx.getPayOrderWxId());
        String wxRefundOrderId = null;
        if (order != null) {
            wxRefundOrderId = order.getOutRefundNo();
            return order;
        }
        else {
            String currentTime = DateUtil.getGMT8TimeStr("YYMMddHHmmss");
            redisTemplate.boundValueOps("system:refund:wx_refund_id_gen_" + currentTime).expire(10, TimeUnit.SECONDS);
            Long sequence = redisTemplate.boundValueOps("system:refund:wx_refund_id_gen_" + currentTime).increment(1);
            if (sequence > 9999) {
                throw new BizException(RespCode.SERVER_BUSY);
            }
            DecimalFormat decimalFormat = new DecimalFormat("0000");
            String formatSequence = decimalFormat.format(sequence);
            wxRefundOrderId = PayChannel.WX.getPersistKey() + currentTime + formatSequence;

            RefundOrderWx refundOrderWx = refundOrderWxService.insertForRefund(payOrderWx, wxRefundOrderId);
            //修改支付基本信息，添加退款状态为 CREATED
            PayInfo payInfo = payInfoMapperExt.selectByPrimaryKeyAndLock(payOrderWx.getPayInfoId());
            PayInfo payInfo1 = new PayInfo();
            payInfo1.setPayInfoId(payInfo.getPayInfoId());
            payInfo1.setRefundStatus(PayInfoRefundStatus.CREATED.getPersistKey());
            payInfoMapperExt.updateByPrimaryKeySelective(payInfo1);
            return refundOrderWx;
        }


    }

    /**
     * 交易详细页面支付
     *
     * @param userLoginInfo
     * @param tradeOrderId
     */
    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public RespResult payforBuyCommodity(UserLoginInfo userLoginInfo, Long tradeOrderId, HttpServletRequest request) throws WxPayNetException, IOException {

        TradeOrder tradeOrder = tradeOrderMapperExt.selectByPrimaryKeyAndLock(tradeOrderId);
        if(!tradeOrder.getAccountId().equals(userLoginInfo.getUserInfoId())){
           throw new BizException(RespCode.USER_NOT_FOUND);
        }
        PayInfo payInfo = payInfoMapperExt.selectByPrimaryKey(Long.valueOf(tradeOrder.getIncomePayInfo()));

        HashMap<String, String> payParams = new HashMap<>();//微信支付需要的参数
        payParams.put("deviceInfo", null);

        CommodityVo commodityVo = commodityService.findById(tradeOrder.getCommodityId());
        payParams.put("body", "礼尚-" + commodityVo.getCommodityName());

        payParams.put("detail", null);
        payParams.put("attach", null);
        payParams.put("feeType", "CNY");
        payParams.put("spbillCreateIp", IpUtil.getIpAddr(request));
        payParams.put("goodsTag", null);
        payParams.put("tradeType", WxTradeType.JSAPI.getPersistKey());
        payParams.put("productId", null);
//        payParams.put("limitPay", "no_credit");
        payParams.put("openid", userLoginInfo.getWeixinOpenId());
        Map<String, String> frontPayParams = null;

        frontPayParams = this.payOriginalChannel(payInfo, payParams);
        frontPayParams.put("tradeOrderId",tradeOrderId.toString());
        return new RespResult(RespCode.SUCCESS, frontPayParams);
    }
}