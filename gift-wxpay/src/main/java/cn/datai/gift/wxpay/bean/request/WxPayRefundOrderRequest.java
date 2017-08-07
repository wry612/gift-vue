package cn.datai.gift.wxpay.bean.request;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Created by H.CAAHN on 2017/4/28.
 */
@Root(name = "xml")
public class WxPayRefundOrderRequest extends WxPayBaseRequest {
    /** 终端设备号 */
    @Element(name = "device_info", required = false)
    private String deviceInfo;

    /** 微信生成的订单号，在支付通知中有返回 */
    @Element(name = "transaction_id", required = false)
    private String transactionId;

    /** 商户侧传给微信的订单号 */
    @Element(name = "out_trade_no", required = false)
    private String outTradeNo;

    /** 商户系统内部的退款单号，商户系统内部唯一，同一退款单号多次请求只退一笔 */
    @Element(name = "out_refund_no")
    private String outRefundNo;

    /** 订单总金额，单位为分，只能为整数，详见支付金额 */
    @Element(name = "total_fee")
    private Integer totalFee;

    /** 退款总金额，订单总金额，单位为分，只能为整数，详见支付金额 */
    @Element(name = "refund_fee")
    private Integer refundFee;

    /** 货币类型，符合ISO 4217标准的三位字母代码，默认人民币：CNY，其他值列表详见货币类型 */
    @Element(name = "refund_fee_type", required = false)
    private String refundFeeType;

    /** 操作员帐号, 默认为商户号 */
    @Element(name = "op_user_id")
    private String opUserId;

    /** 仅针对老资金流商户使用
     REFUND_SOURCE_UNSETTLED_FUNDS---未结算资金退款（默认使用未结算资金退款）
     REFUND_SOURCE_RECHARGE_FUNDS---可用余额退款(限非当日交易订单的退款） */
    @Element(name = "refund_account", required = false)
    private String refundAccount;

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

    public Integer getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(Integer totalFee) {
        this.totalFee = totalFee;
    }

    public Integer getRefundFee() {
        return refundFee;
    }

    public void setRefundFee(Integer refundFee) {
        this.refundFee = refundFee;
    }

    public String getRefundFeeType() {
        return refundFeeType;
    }

    public void setRefundFeeType(String refundFeeType) {
        this.refundFeeType = refundFeeType;
    }

    public String getOpUserId() {
        return opUserId;
    }

    public void setOpUserId(String opUserId) {
        this.opUserId = opUserId;
    }

    public String getRefundAccount() {
        return refundAccount;
    }

    public void setRefundAccount(String refundAccount) {
        this.refundAccount = refundAccount;
    }
}
