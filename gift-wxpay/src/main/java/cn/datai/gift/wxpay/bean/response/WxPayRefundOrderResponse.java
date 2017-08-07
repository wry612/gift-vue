package cn.datai.gift.wxpay.bean.response;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import java.util.List;

/**
 * Created by H.CAAHN on 2017/4/28.
 */
@Root(name = "xml")
public class WxPayRefundOrderResponse extends WxPayBaseResponse {
    /** 终端设备号 */
    @Element(name = "device_info")
    private String deviceInfo;

    /** 微信订单号 */
    @Element(name = "transaction_id")
    private String transactionId;

    /** 商户系统内部的订单号 */
    @Element(name = "out_trade_no")
    private String outTradeNo;

    /** 商户退款单号 */
    @Element(name = "out_refund_no")
    private String outRefundNo;

    /** 微信退款单号 */
    @Element(name = "refund_id")
    private String refundId;

    /** 退款总金额,单位为分,可以做部分退款 */
    @Element(name = "refund_fee")
    private Integer refundFee;

    /** 去掉非充值代金券退款金额后的退款金额，退款金额=申请退款金额-非充值代金券退款金额，退款金额<=申请退款金额 */
    @Element(name = "settlement_refund_fee")
    private Integer settlementRefundFee;

    /** 订单总金额，单位为分，只能为整数 */
    @Element(name = "total_fee")
    private Integer totalFee;

    /** 去掉非充值代金券金额后的订单总金额，应结订单金额=订单金额-非充值代金券金额，应结订单金额<=订单金额。 */
    @Element(name = "settlement_total_fee")
    private Integer settlementTotalFee;

    /** 订单金额货币类型，符合ISO 4217标准的三位字母代码，默认人民币：CNY */
    @Element(name = "fee_type")
    private String feeType;

    /** 现金支付金额，单位为分，只能为整数 */
    @Element(name = "cash_fee")
    private Integer cashFee;

    /** 现金支付币种，符合ISO 4217标准的三位字母代码，默认人民币：CNY */
    @Element(name = "cash_fee_type")
    private String cashFeeType;

    /** 现金退款金额，单位为分，只能为整数 */
    @Element(name = "cash_refund_fee")
    private Integer cashRefundFee;

    /** 代金券退款金额<=退款金额，退款金额-代金券或立减优惠退款金额为现金 */
    @Element(name = "coupon_refund_fee")
    private Integer couponRefundFee;

    /** 退款代金券使用数量 */
    @Element(name = "coupon_refund_count")
    private Integer couponRefundCount;

    /** 退款代金券详情 */
    public List<CouponRefundDetail> detailList;

    public static class CouponRefundDetail {
        private String couponType;

        private Integer couponRefundFee;

        private String couponRefundId;

        public String getCouponType() {
            return couponType;
        }

        public void setCouponType(String couponType) {
            this.couponType = couponType;
        }

        public Integer getCouponRefundFee() {
            return couponRefundFee;
        }

        public void setCouponRefundFee(Integer couponRefundFee) {
            this.couponRefundFee = couponRefundFee;
        }

        public String getCouponRefundId() {
            return couponRefundId;
        }

        public void setCouponRefundId(String couponRefundId) {
            this.couponRefundId = couponRefundId;
        }

        @Override
        public String toString() {
            return "CouponRefundDetail{" +
                    "couponType='" + couponType + '\'' +
                    ", couponRefundFee=" + couponRefundFee +
                    ", couponRefundId='" + couponRefundId + '\'' +
                    '}';
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

    public String getOutRefundNo() {
        return outRefundNo;
    }

    public void setOutRefundNo(String outRefundNo) {
        this.outRefundNo = outRefundNo;
    }

    public String getRefundId() {
        return refundId;
    }

    public void setRefundId(String refundId) {
        this.refundId = refundId;
    }

    public Integer getRefundFee() {
        return refundFee;
    }

    public void setRefundFee(Integer refundFee) {
        this.refundFee = refundFee;
    }

    public Integer getSettlementRefundFee() {
        return settlementRefundFee;
    }

    public void setSettlementRefundFee(Integer settlementRefundFee) {
        this.settlementRefundFee = settlementRefundFee;
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

    public String getCashFeeType() {
        return cashFeeType;
    }

    public void setCashFeeType(String cashFeeType) {
        this.cashFeeType = cashFeeType;
    }

    public Integer getCashRefundFee() {
        return cashRefundFee;
    }

    public void setCashRefundFee(Integer cashRefundFee) {
        this.cashRefundFee = cashRefundFee;
    }

    public Integer getCouponRefundFee() {
        return couponRefundFee;
    }

    public void setCouponRefundFee(Integer couponRefundFee) {
        this.couponRefundFee = couponRefundFee;
    }

    public Integer getCouponRefundCount() {
        return couponRefundCount;
    }

    public void setCouponRefundCount(Integer couponRefundCount) {
        this.couponRefundCount = couponRefundCount;
    }

    public List<CouponRefundDetail> getDetailList() {
        return detailList;
    }

    public void setDetailList(List<CouponRefundDetail> detailList) {
        this.detailList = detailList;
    }
}
