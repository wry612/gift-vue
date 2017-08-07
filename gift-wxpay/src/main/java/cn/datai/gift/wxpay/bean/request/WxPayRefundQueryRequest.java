package cn.datai.gift.wxpay.bean.request;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Created by H.CAAHN on 2017/4/20.
 */
@Root(name = "xml")
public class WxPayRefundQueryRequest extends WxPayBaseRequest {
    /** 微信订单号,transactionId、outTradeNo、outRefundNo、refundId四选一 */
    @Element(name = "transaction_id", required = false)
    private String transactionId;

    /** 商户系统内部的订单号,transactionId、outTradeNo、outRefundNo、refundId四选一 */
    @Element(name = "out_trade_no", required = false)
    private String outTradeNo;

    /** 商户侧传给微信的退款单号,transactionId、outTradeNo、outRefundNo、refundId四选一 */
    @Element(name = "out_refund_no", required = false)
    private String outRefundNo;

    /** 微信生成的退款单号，在申请退款接口有返回,transactionId、outTradeNo、outRefundNo、refundId四选一 */
    @Element(name = "refund_id", required = false)
    private String refundId;

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    public void setOutRefundNo(String outRefundNo) {
        this.outRefundNo = outRefundNo;
    }

    public void setRefundId(String refundId) {
        this.refundId = refundId;
    }
}
