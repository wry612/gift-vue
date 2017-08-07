package cn.datai.gift.wxpay.bean.common;


import cn.datai.gift.wxpay.util.XStreamCDataConverter;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;

import java.util.List;

/**
 * 收到微信支付结果的响应
 * Created by zhangyutao on 2017/4/16.
 */
@XStreamAlias("xml")
public class WxPayNotifyReceiver {

    /**
     * 返回状态码
     */
    @XStreamAlias("return_code")
    @XStreamConverter(value = XStreamCDataConverter.class)
    protected String returnCode;
    /**
     * 返回信息
     */
    @XStreamAlias("return_msg")
    @XStreamConverter(value = XStreamCDataConverter.class)
    protected String returnMsg;
    /**
     * 公众账号ID
     */
    @XStreamAlias("appid")
    protected String appid;
    /**
     * 商户号
     */
    @XStreamAlias("mch_id")
    protected String mchId;
    /**
     * 设备号
     */
    @XStreamAlias("device_info")
    protected String deviceInfo;
    /**
     * 随机字符串
     */
    @XStreamAlias("nonce_str")
    protected String nonceStr;
    /**
     * 签名
     */
    @XStreamAlias("sign")
    protected String sign;
    /**
     * 签名类型
     */
    @XStreamAlias("sign_type")
    protected String signType;
    /**
     * 业务结果
     */
    @XStreamAlias("result_code")
    protected String resultCode;
    /**
     * 错误代码
     */
    @XStreamAlias("err_code")
    protected String errCode;
    /**
     * 错误代码描述
     */
    @XStreamAlias("err_code_des")
    protected String errCodeDes;
    /**
     * 用户标识
     */
    @XStreamAlias("openid")
    protected String openid;
    /**
     * 是否关注公众账号
     */
    @XStreamAlias("is_subscribe")
    protected String isSubscribe;
    /**
     * 交易类型
     */
    @XStreamAlias("trade_type")
    protected String tradeType;
    /**
     * 付款银行
     */
    @XStreamAlias("bank_type")
    protected String bankType;
    /**
     * 订单金额
     */
    @XStreamAlias("total_fee")
    protected int totalFee;
    /**
     * 应结订单金额
     */
    @XStreamAlias("settlement_total_fee")
    protected int settlementTotalFee;
    /**
     * 货币种类
     */
    @XStreamAlias("fee_type")
    protected int feeType;
    /**
     * 现金支付金额
     */
    @XStreamAlias("cash_fee")
    protected int cashFee;
    /**
     * 现金支付货币类型
     */
    @XStreamAlias("cash_fee_type")
    protected String cashFeeType;
    /**
     * 总代金券金额
     */
    @XStreamAlias("coupon_fee")
    protected int couponFee;
    /**
     * 代金券使用数量
     */
    @XStreamAlias("coupon_count")
    protected int couponCount;
//    /**
//     * 单个代金券支付金额
//     */
//    @XStreamAlias("coupon_fee_$n")
//    protected String coupon_fee_$n;
    /**
     * 微信支付订单号
     */
    @XStreamAlias("transaction_id")
    protected String transactionId;
    /**
     * 商户订单号
     */
    @XStreamAlias("out_trade_no")
    protected String outTradeNo;
    /**
     * 商家数据包
     */
    @XStreamAlias("attach")
    protected String attach;
    /**
     * 支付完成时间
     */
    @XStreamAlias("time_end")
    protected String timeEnd;

    /**
     * 额外字段：代金券信息
     */
    private List<CouponDetail> couponDetails;

    public static class CouponDetail {
        private String couponType;

        private String couponId;

        private Integer couponFee;

        public String getCouponType() {
            return couponType;
        }

        public void setCouponType(String couponType) {
            this.couponType = couponType;
        }

        public String getCouponId() {
            return couponId;
        }

        public void setCouponId(String couponId) {
            this.couponId = couponId;
        }

        public Integer getCouponFee() {
            return couponFee;
        }

        public void setCouponFee(Integer couponFee) {
            this.couponFee = couponFee;
        }
    }

    public String getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    public String getReturnMsg() {
        return returnMsg;
    }

    public void setReturnMsg(String returnMsg) {
        this.returnMsg = returnMsg;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getMchId() {
        return mchId;
    }

    public void setMchId(String mchId) {
        this.mchId = mchId;
    }

    public String getDeviceInfo() {
        return deviceInfo;
    }

    public void setDeviceInfo(String deviceInfo) {
        this.deviceInfo = deviceInfo;
    }

    public String getNonceStr() {
        return nonceStr;
    }

    public void setNonceStr(String nonceStr) {
        this.nonceStr = nonceStr;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getSignType() {
        return signType;
    }

    public void setSignType(String signType) {
        this.signType = signType;
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getErrCode() {
        return errCode;
    }

    public void setErrCode(String errCode) {
        this.errCode = errCode;
    }

    public String getErrCodeDes() {
        return errCodeDes;
    }

    public void setErrCodeDes(String errCodeDes) {
        this.errCodeDes = errCodeDes;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getIsSubscribe() {
        return isSubscribe;
    }

    public void setIsSubscribe(String isSubscribe) {
        this.isSubscribe = isSubscribe;
    }

    public String getTradeType() {
        return tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }

    public String getBankType() {
        return bankType;
    }

    public void setBankType(String bankType) {
        this.bankType = bankType;
    }

    public int getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(int totalFee) {
        this.totalFee = totalFee;
    }

    public int getSettlementTotalFee() {
        return settlementTotalFee;
    }

    public void setSettlementTotalFee(int settlementTotalFee) {
        this.settlementTotalFee = settlementTotalFee;
    }

    public int getFeeType() {
        return feeType;
    }

    public void setFeeType(int feeType) {
        this.feeType = feeType;
    }

    public int getCashFee() {
        return cashFee;
    }

    public void setCashFee(int cashFee) {
        this.cashFee = cashFee;
    }

    public String getCashFeeType() {
        return cashFeeType;
    }

    public void setCashFeeType(String cashFeeType) {
        this.cashFeeType = cashFeeType;
    }

    public int getCouponFee() {
        return couponFee;
    }

    public void setCouponFee(int couponFee) {
        this.couponFee = couponFee;
    }

    public int getCouponCount() {
        return couponCount;
    }

    public void setCouponCount(int couponCount) {
        this.couponCount = couponCount;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    public String getAttach() {
        return attach;
    }

    public void setAttach(String attach) {
        this.attach = attach;
    }

    public String getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(String timeEnd) {
        this.timeEnd = timeEnd;
    }

    public List<CouponDetail> getCouponDetails() {
        return couponDetails;
    }

    public void setCouponDetails(List<CouponDetail> couponDetails) {
        this.couponDetails = couponDetails;
    }

    @Override
    public String toString() {
        return "WxPayNotifyReceiver{" +
                "returnCode='" + returnCode + '\'' +
                ", returnMsg='" + returnMsg + '\'' +
                ", appid='" + appid + '\'' +
                ", mchId='" + mchId + '\'' +
                ", deviceInfo='" + deviceInfo + '\'' +
                ", nonceStr='" + nonceStr + '\'' +
                ", sign='" + sign + '\'' +
                ", signType='" + signType + '\'' +
                ", resultCode='" + resultCode + '\'' +
                ", errCode='" + errCode + '\'' +
                ", errCodeDes='" + errCodeDes + '\'' +
                ", openid='" + openid + '\'' +
                ", isSubscribe='" + isSubscribe + '\'' +
                ", tradeType='" + tradeType + '\'' +
                ", bankType='" + bankType + '\'' +
                ", totalFee=" + totalFee +
                ", settlementTotalFee=" + settlementTotalFee +
                ", feeType=" + feeType +
                ", cashFee=" + cashFee +
                ", cashFeeType='" + cashFeeType + '\'' +
                ", couponFee=" + couponFee +
                ", couponCount=" + couponCount +
                ", transactionId='" + transactionId + '\'' +
                ", outTradeNo='" + outTradeNo + '\'' +
                ", attach='" + attach + '\'' +
                ", timeEnd='" + timeEnd + '\'' +
                ", couponDetails=" + couponDetails +
                '}';
    }
}
