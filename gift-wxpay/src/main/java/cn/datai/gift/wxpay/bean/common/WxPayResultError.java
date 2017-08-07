package cn.datai.gift.wxpay.bean.common;

import cn.datai.gift.utils.enums.RespCode;
import cn.datai.gift.utils.exception.BizException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Field;

/**
 * 微信支付请求反馈报文中resultCode 为 false 的错误信息
 * Created by zhangyutao on 2017/5/24.
 */
public class WxPayResultError {

    private static Logger logger = LoggerFactory.getLogger(WxPayResultError.class);

    private String errCode;

    private String errCodeDes;

    private String json;

    private Object response;

    public static WxPayResultError fromResponse(Object response){
        try {
            Class<?> superclass = response.getClass().getSuperclass();
            Field errCodeField = superclass.getDeclaredField("errCode");
            errCodeField.setAccessible(true);
            String errCode = errCodeField.get(response).toString();

            Field errCodeDesField = superclass.getDeclaredField("errCodeDes");
            errCodeDesField.setAccessible(true);
            String errCodeDes = errCodeDesField.get(response).toString();

            WxPayResultError wxPayResultError = new WxPayResultError();
            wxPayResultError.setErrCode(errCode);
            wxPayResultError.setErrCodeDes(errCodeDes);
            return wxPayResultError;
        } catch (Exception e) {
            logger.error(e.getMessage());
            throw new BizException(RespCode.SERVER_ERROR);
        }
    }

    public String getErrCode() {
        return errCode;
    }

    public void setErrCode(String errCode) {
        this.errCode = errCode;
    }

    public String getErrCodeDes() {
        return errCodeDes;
    }

    public void setErrCodeDes(String errCodeDes) {
        this.errCodeDes = errCodeDes;
    }

    public String getJson() {
        return json;
    }

    public void setJson(String json) {
        this.json = json;
    }

    public Object getResponse() {
        return response;
    }

    public void setResponse(Object response) {
        this.response = response;
    }

    @Override
    public String toString() {
        if (this.json != null) {
            return this.json;
        }
        return "微信支付运行响应异常: errCode=" + this.errCode + ", errCodeDes=" + this.errCodeDes;
    }

    public static class Builder {
        private String errCode;
        private String errCodeDes;

        public WxPayResultError.Builder setErrCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        public WxPayResultError.Builder setErrCodeDes(String errCodeDes) {
            this.errCodeDes = errCodeDes;
            return this;
        }

        public WxPayResultError build() {
            WxPayResultError wxPayResultError = new WxPayResultError();
            wxPayResultError.setErrCode(this.errCode);
            wxPayResultError.setErrCodeDes(this.errCodeDes);
            return wxPayResultError;
        }

    }
}
