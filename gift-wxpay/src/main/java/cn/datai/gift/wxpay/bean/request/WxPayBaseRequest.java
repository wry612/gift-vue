package cn.datai.gift.wxpay.bean.request;


import com.alibaba.fastjson.JSONObject;
import org.simpleframework.xml.Element;

import java.io.Serializable;

/**
 *  微信支付请求对象共用的参数存放类
 *
 */
public abstract class WxPayBaseRequest implements Serializable{

    @Element(name = "appid")
    protected String appid;

    @Element(name = "mch_id")
    protected String mchId;

    @Element(name = "sub_mch_id", required = false)
    protected String subMchId;

    @Element(name = "nonce_str")
    protected String nonceStr;

    @Element(name = "sign")
    protected String sign;

    @Element(name = "sign_type", required = false)
    protected String signType;

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

    public String getSubMchId() {
        return subMchId;
    }

    public void setSubMchId(String subMchId) {
        this.subMchId = subMchId;
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

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "=" + JSONObject.toJSONString(this);
    }


}
