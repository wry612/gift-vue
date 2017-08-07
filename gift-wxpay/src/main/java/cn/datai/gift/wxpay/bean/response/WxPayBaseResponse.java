package cn.datai.gift.wxpay.bean.response;

import com.alibaba.fastjson.JSONObject;
import org.simpleframework.xml.Element;

import java.io.Serializable;

/**
 * 收到微信支付服务器响应的公共参数
 * Created by zhangyutao on 2017/4/16.
 */
public abstract class WxPayBaseResponse implements Serializable{

    /**
     * 返回状态码
     */
    @Element(name = "return_code", data = true)
    protected String returnCode;
    /**
     * 返回信息
     */
    @Element(name = "return_msg", required = false, data = true)
    protected String returnMsg;

    //当return_code为SUCCESS的时候，还会包括以下字段：
    /**
     * 业务结果
     */
    @Element(name="result_code", required = false, data = true)
    protected String resultCode;
    /**
     * 错误代码
     */
    @Element(name="err_code", required = false, data = true)
    protected String errCode;
    /**
     * 错误代码描述
     */
    @Element(name="err_code_des", required = false, data = true)
    protected String errCodeDes;
    /**
     * 公众账号ID
     */
    @Element(name="appid", required = false, data = true)
    protected String appid;
    /**
     * 商户号
     */
    @Element(name="mch_id", required = false, data = true)
    protected String mchId;
    /**
     * 服务商模式下的子公众账号ID
     */
    @Element(name="sub_appid", required = false, data = true)
    protected String subAppId;
    /**
     * 服务商模式下的子商户号
     */
    @Element(name="sub_mch_id", required = false, data = true)
    protected String subMchId;
    /**
     * 随机字符串
     */
    @Element(name="nonce_str", required = false, data = true)
    protected String nonceStr;
    /**
     * 签名
     */
    @Element(name="sign", required = false, data = true)
    protected String sign;

    public String getReturnCode() {
        return returnCode;
    }

    public String getReturnMsg() {
        return returnMsg;
    }

    public String getResultCode() {
        return resultCode;
    }

    public String getErrCode() {
        return errCode;
    }

    public String getErrCodeDes() {
        return errCodeDes;
    }

    public String getAppid() {
        return appid;
    }

    public String getMchId() {
        return mchId;
    }

    public String getSubAppId() {
        return subAppId;
    }

    public String getSubMchId() {
        return subMchId;
    }

    public String getNonceStr() {
        return nonceStr;
    }

    public String getSign() {
        return sign;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "=" + JSONObject.toJSONString(this);
    }

}
