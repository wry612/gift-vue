package cn.datai.gift.wxpay.bean.request;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * 查询订单
 * Created by H.CAAHN on 2017/4/19.
 */
@Root(name = "xml")
public class WxPayOrderQueryRequest extends WxPayBaseRequest {

    /** 微信的订单号，建议优先使用 */
    @Element(name = "transaction_id", required = false)
    private String transactionId;

    /** 商户系统内部的订单号，请确保在同一商户号下唯一。 */
    @Element(name = "out_trade_no", required = false)
    private String outTradeNo;

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }
}
