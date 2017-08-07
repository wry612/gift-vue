package cn.datai.gift.wxpay.bean.response;

import org.simpleframework.xml.Element;

import java.util.List;

/**
 * 退款查询响应
 * Created by H.CAAHN on 2017/4/25.
 */
public class WxPayRefundQueryResponse extends WxPayBaseResponse {
    /** 终端设备号 */
    @Element(name="device_info", required = false, data = true)
    private String deviceInfo;

    /** 微信订单号 */
    @Element(name="transaction_id", required = false, data = true)
    private String transactionId;

    /** 商户系统内部的订单号 */
    @Element(name="out_trade_no", required = false, data = true)
    private String outTradeNo;

    /** 订单总金额，单位为分，只能为整数 */
    @Element(name="total_fee", required = false, data = true)
    private Integer totalFee;

    /** 应结订单金额=订单金额-非充值代金券金额，应结订单金额<=订单金额 */
    @Element(name="settlement_total_fee", required = false, data = true)
    private Integer settlementTotalFee;

    /** 订单金额货币类型，符合ISO 4217标准的三位字母代码，默认人民币：CNY */
    @Element(name="fee_type", required = false, data = true)
    private String feeType;

    /** 现金支付金额，单位为分，只能为整数 */
    @Element(name="cash_fee", required = false, data = true)
    private Integer cashFee;

    /** 退款记录数 */
    @Element(name="refund_count", required = false, data = true)
    private Integer refundCount;

    /** 商户退款单号 */
    private String[] outRefundNo;

    /** 微信退款单号 */
    private String[] refundId;

    /** ORIGINAL—原路退款
     BALANCE—退回到余额
     OTHER_BALANCE—原账户异常退到其他余额账户
     OTHER_BANKCARD—原银行卡异常退到其他银行卡 */
    private String[] refundChannel;

    /** 退款总金额,单位为分,可以做部分退款 */
    private Integer[] refundFee;

    /** 退款金额=申请退款金额-非充值代金券退款金额，退款金额<=申请退款金额 */
    private Integer[] settlementRefundFee;

    /** CASH--充值代金券
     NO_CASH---非充值代金券
     订单使用代金券时有返回（取值：CASH、NO_CASH）。$n为下标,从0开始编号，举例：coupon_type_$0 */
    private String[] couponType;

    /** 代金券退款金额<=退款金额，退款金额-代金券或立减优惠退款金额为现金 */
    private Integer[] couponRefundFees;

    /** 退款代金券使用数量 ,$n为下标,从0开始编号 */
    private Integer[] couponRefundCount;

//    /** 退款代金券ID, $n为下标，$m为下标，从0开始编号 */
//    private List<String[]> couponRefundId;
//
//    /** 单个退款代金券支付金额, $n为下标，$m为下标，从0开始编号 */
//    private List<Integer[]> couponRefundFee;

    private List<CouponRefundDetail[]> couponRefundDetails;

    /** 退款状态：
     SUCCESS—退款成功
     REFUNDCLOSE—退款关闭。
     NOTSURE—未确定，需要商户用原退款单号重新发起退款申请。
     PROCESSING—退款处理中
     CHANGE—退款异常，退款到银行发现用户的卡作废或者冻结了，导致原路退款银行卡失败，商户可以发起异常退款处理的申请，可以退款到用户的新卡或者退款商户，商户自行处理。$n为下标，从0开始编号。 */
    private String[] refundStatus;

    /** REFUND_SOURCE_RECHARGE_FUNDS---可用余额退款/基本账户
     REFUND_SOURCE_UNSETTLED_FUNDS---未结算资金退款
     $n为下标，从0开始编号。 */
    private String[] refundAccount;

    /** 取当前退款单的退款入账方
     1）退回银行卡：
     {银行名称}{卡类型}{卡尾号}
     2）退回支付用户零钱:
     支付用户零钱
     3）退还商户:
     商户基本账户
     商户结算银行账户 */
    private String[] refundRecvAccout;

    /** 退款成功时间，当退款状态为退款成功时有返回。$n为下标，从0开始编号。 */
    private String[] refundSuccessTime;

    public static class CouponRefundDetail {
        private String couponRefundId;

        private Integer couponRefundFee;

        public String getCouponRefundId() {
            return couponRefundId;
        }

        public void setCouponRefundId(String couponRefundId) {
            this.couponRefundId = couponRefundId;
        }

        public Integer getCouponRefundFee() {
            return couponRefundFee;
        }

        public void setCouponRefundFee(Integer couponRefundFee) {
            this.couponRefundFee = couponRefundFee;
        }
    }

    public String getDeviceInfo() {
        return deviceInfo;
    }

    public void setDeviceInfo(String deviceInfo) {
        this.deviceInfo = deviceInfo;
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

    public Integer getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(Integer totalFee) {
        this.totalFee = totalFee;
    }

    public Integer getSettlementTotalFee() {
        return settlementTotalFee;
    }

    public void setSettlementTotalFee(Integer settlementTotalFee) {
        this.settlementTotalFee = settlementTotalFee;
    }

    public String getFeeType() {
        return feeType;
    }

    public void setFeeType(String feeType) {
        this.feeType = feeType;
    }

    public Integer getCashFee() {
        return cashFee;
    }

    public void setCashFee(Integer cashFee) {
        this.cashFee = cashFee;
    }

    public Integer getRefundCount() {
        return refundCount;
    }

    public void setRefundCount(Integer refundCount) {
        this.refundCount = refundCount;
    }

    public String[] getOutRefundNo() {
        return outRefundNo;
    }

    public void setOutRefundNo(String[] outRefundNo) {
        this.outRefundNo = outRefundNo;
    }

    public String[] getRefundId() {
        return refundId;
    }

    public void setRefundId(String[] refundId) {
        this.refundId = refundId;
    }

    public String[] getRefundChannel() {
        return refundChannel;
    }

    public void setRefundChannel(String[] refundChannel) {
        this.refundChannel = refundChannel;
    }

    public Integer[] getRefundFee() {
        return refundFee;
    }

    public void setRefundFee(Integer[] refundFee) {
        this.refundFee = refundFee;
    }

    public Integer[] getSettlementRefundFee() {
        return settlementRefundFee;
    }

    public void setSettlementRefundFee(Integer[] settlementRefundFee) {
        this.settlementRefundFee = settlementRefundFee;
    }

    public String[] getCouponType() {
        return couponType;
    }

    public void setCouponType(String[] couponType) {
        this.couponType = couponType;
    }

    public Integer[] getCouponRefundFees() {
        return couponRefundFees;
    }

    public void setCouponRefundFees(Integer[] couponRefundFees) {
        this.couponRefundFees = couponRefundFees;
    }

    public Integer[] getCouponRefundCount() {
        return couponRefundCount;
    }

    public void setCouponRefundCount(Integer[] couponRefundCount) {
        this.couponRefundCount = couponRefundCount;
    }

    public List<CouponRefundDetail[]> getCouponRefundDetails() {
        return couponRefundDetails;
    }

    public void setCouponRefundDetails(List<CouponRefundDetail[]> couponRefundDetails) {
        this.couponRefundDetails = couponRefundDetails;
    }

    public String[] getRefundStatus() {
        return refundStatus;
    }

    public void setRefundStatus(String[] refundStatus) {
        this.refundStatus = refundStatus;
    }

    public String[] getRefundAccount() {
        return refundAccount;
    }

    public void setRefundAccount(String[] refundAccount) {
        this.refundAccount = refundAccount;
    }

    public String[] getRefundRecvAccout() {
        return refundRecvAccout;
    }

    public void setRefundRecvAccout(String[] refundRecvAccout) {
        this.refundRecvAccout = refundRecvAccout;
    }

    public String[] getRefundSuccessTime() {
        return refundSuccessTime;
    }

    public void setRefundSuccessTime(String[] refundSuccessTime) {
        this.refundSuccessTime = refundSuccessTime;
    }
}
