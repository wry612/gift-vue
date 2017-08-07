package cn.datai.gift.wxpay.bean.request;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Created by zhangyutao on 2017/4/14.
 */
@Root(name = "xml")
public class WxPayCloseOrderRequest extends WxPayBaseRequest{

    @Element(name = "out_trade_no")
    private String outTradeNo;

    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }
}
