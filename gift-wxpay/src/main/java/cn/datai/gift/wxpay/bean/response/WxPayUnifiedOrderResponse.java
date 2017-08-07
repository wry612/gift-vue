package cn.datai.gift.wxpay.bean.response;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Created by zhangyutao on 2017/4/14.
 */
@Root(name = "xml")
public class WxPayUnifiedOrderResponse extends WxPayBaseResponse{

    @Element(name = "device_info", required = false, data = true)
    private String deviceInfo;

    @Element(name = "trade_type", required = false, data = true)
    private String tradeType;

    @Element(name = "prepay_id", required = false, data = true)
    private String prepayId;

    @Element(name = "code_url", required = false, data = true)
    private String codeUrl;

    public String getDeviceInfo() {
        return deviceInfo;
    }

    public String getTradeType() {
        return tradeType;
    }

    public String getPrepayId() {
        return prepayId;
    }

    public String getCodeUrl() {
        return codeUrl;
    }
}
