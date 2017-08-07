package cn.datai.gift.wxpay.bean.response;

import com.alibaba.fastjson.JSON;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import java.util.List;

/**
 * Created by H.CAAHN on 2017/4/19.
 */
@Root(name = "xml")
public class WxPayOrderQueryResponse extends WxPayBaseResponse {
    @Element(name = "device_info", required = false, data = true)
    private String deviceInfo;

    @Element(name = "openid", required = false, data = true)
    private String openid;

    @Element(name = "is_subscribe", required = false, data = true)
    private String isSubscribe;

    @Element(name = "trade_type", required = false, data = true)
    private String tradeType;

    @Element(name = "trade_state", required = false, data = true)
    private String tradeState;

    @Element(name = "bank_type", required = false, data = true)
    private String bankType;

    @Element(name = "total_fee", required = false, data = true)
    private Integer totalFee;

    @Element(name = "settlement_total_fee", required = false, data = true)
    private Integer settlementTotalFee;

    @Element(name = "fee_type", required = false, data = true)
    private String feeType;

    @Element(name = "cash_fee", required = false, data = true)
    private Integer cashFee;

    @Element(name = "cash_fee_type", required = false, data = true)
    private String cashFeeType;

    @Element(name = "coupon_fee", required = false, data = true)
    private Integer couponFee;

    @Element(name = "coupon_count", required = false, data = true)
    private Integer couponCount;

    @Element(name = "transaction_id", required = false, data = true)
    private String transactionId;

    @Element(name = "out_trade_no", required = false, data = true)
    private String outTradeNo;

    @Element(name = "attach", required = false, data = true)
    private String attach;

    @Element(name = "time_end", required = false, data = true)
    private String timeEnd;

    @Element(name = "trade_state_desc", required = false, data = true)
    private String tradeStateDesc;

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

    public String getDeviceInfo() {
        return deviceInfo;
    }

    public String getOpenid() {
        return openid;
    }

    public String getIsSubscribe() {
        return isSubscribe;
    }

    public String getTradeType() {
        return tradeType;
    }

    public String getTradeState() {
        return tradeState;
    }

    public String getBankType() {
        return bankType;
    }

    public Integer getTotalFee() {
        return totalFee;
    }

    public Integer getSettlementTotalFee() {
        return settlementTotalFee;
    }

    public String getFeeType() {
        return feeType;
    }

    public Integer getCashFee() {
        return cashFee;
    }

    public String getCashFeeType() {
        return cashFeeType;
    }

    public Integer getCouponFee() {
        return couponFee;
    }

    public Integer getCouponCount() {
        return couponCount;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public String getOutTradeNo() {
        return outTradeNo;
    }

    public String getAttach() {
        return attach;
    }

    public String getTimeEnd() {
        return timeEnd;
    }

    public String getTradeStateDesc() {
        return tradeStateDesc;
    }

    public List<CouponDetail> getCouponDetails() {
        return couponDetails;
    }

    public void setDeviceInfo(String deviceInfo) {
        this.deviceInfo = deviceInfo;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public void setIsSubscribe(String isSubscribe) {
        this.isSubscribe = isSubscribe;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }

    public void setTradeState(String tradeState) {
        this.tradeState = tradeState;
    }

    public void setBankType(String bankType) {
        this.bankType = bankType;
    }

    public void setTotalFee(Integer totalFee) {
        this.totalFee = totalFee;
    }

    public void setSettlementTotalFee(Integer settlementTotalFee) {
        this.settlementTotalFee = settlementTotalFee;
    }

    public void setFeeType(String feeType) {
        this.feeType = feeType;
    }

    public void setCashFee(Integer cashFee) {
        this.cashFee = cashFee;
    }

    public void setCashFeeType(String cashFeeType) {
        this.cashFeeType = cashFeeType;
    }

    public void setCouponFee(Integer couponFee) {
        this.couponFee = couponFee;
    }

    public void setCouponCount(Integer couponCount) {
        this.couponCount = couponCount;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    public void setAttach(String attach) {
        this.attach = attach;
    }

    public void setTimeEnd(String timeEnd) {
        this.timeEnd = timeEnd;
    }

    public void setTradeStateDesc(String tradeStateDesc) {
        this.tradeStateDesc = tradeStateDesc;
    }

    public void setCouponDetails(List<CouponDetail> couponDetails) {
        this.couponDetails = couponDetails;
    }

    public String toString() {
        return JSON.toJSONString(this);
    }
}
