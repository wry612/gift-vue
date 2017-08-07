package cn.datai.gift.wxpay.bean.request;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Created by zhangyutao on 2017/4/14.
 */
@Root(name = "xml")
public class WxPayUnifiedOrderRequest extends WxPayBaseRequest{

    @Element(name = "device_info", required = false)
    private String deviceInfo;

    @Element(name = "body")
    private String body;

    @Element(name = "detail", required = false, data = true)
    private String detail;

    @Element(name = "attach", required = false)
    private String attach;

    @Element(name = "out_trade_no")
    private String outTradeNo;

    @Element(name = "fee_type", required = false)
    private String feeType;

    @Element(name = "total_fee")
    private int totalFee;

    @Element(name = "spbill_create_ip")
    private String spbillCreateIp;

    @Element(name = "time_start", required = false)
    private String timeStart;

    @Element(name = "time_expire", required = false)
    private String timeExpire;

    @Element(name = "goods_tag", required = false)
    private String goodsTag;

    @Element(name = "notify_url")
    private String notifyUrl;

    @Element(name = "trade_type")
    private String tradeType;

    @Element(name = "product_id", required = false)
    private String productId;

    @Element(name = "limit_pay", required = false)
    private String limitPay;

    @Element(name = "openid", required = false)
    private String openid;

    public String getDeviceInfo() {
        return deviceInfo;
    }

    public void setDeviceInfo(String deviceInfo) {
        this.deviceInfo = deviceInfo;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getAttach() {
        return attach;
    }

    public void setAttach(String attach) {
        this.attach = attach;
    }

    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    public String getFeeType() {
        return feeType;
    }

    public void setFeeType(String feeType) {
        this.feeType = feeType;
    }

    public int getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(int totalFee) {
        this.totalFee = totalFee;
    }

    public String getSpbillCreateIp() {
        return spbillCreateIp;
    }

    public void setSpbillCreateIp(String spbillCreateIp) {
        this.spbillCreateIp = spbillCreateIp;
    }

    public String getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(String timeStart) {
        this.timeStart = timeStart;
    }

    public String getTimeExpire() {
        return timeExpire;
    }

    public void setTimeExpire(String timeExpire) {
        this.timeExpire = timeExpire;
    }

    public String getGoodsTag() {
        return goodsTag;
    }

    public void setGoodsTag(String goodsTag) {
        this.goodsTag = goodsTag;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public String getTradeType() {
        return tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getLimitPay() {
        return limitPay;
    }

    public void setLimitPay(String limitPay) {
        this.limitPay = limitPay;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }
}
