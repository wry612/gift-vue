package cn.datai.gift.wxpay.bean.common;

import cn.datai.gift.utils.enums.RespCode;
import cn.datai.gift.utils.exception.BizException;
import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;
import java.lang.reflect.Field;

/**
 * 微信支付通信错误
 *
 */
public class WxPayNetError implements Serializable {

  private static Logger logger = LoggerFactory.getLogger(WxPayNetError.class);

  private static final long serialVersionUID = 7869786563361406291L;

  private String returnCode;

  private String returnMsg;

  private String json;

  private Object response;

  public static WxPayNetError fromResponse(Object response){
    try {
      Class<?> superclass = response.getClass().getSuperclass();
      Field returnCodeField = superclass.getDeclaredField("returnCode");
      returnCodeField.setAccessible(true);
      String returnCode = returnCodeField.get(response).toString();

      Field returnMsgField = superclass.getDeclaredField("returnMsg");
      returnMsgField.setAccessible(true);
      String returnMsg = returnMsgField.get(response).toString();

      WxPayNetError wxPayNetError = new WxPayNetError();
      wxPayNetError.setReturnCode(returnCode);
      wxPayNetError.setReturnMsg(returnMsg);
      return wxPayNetError;
    } catch (Exception e) {
      logger.error(e.getMessage());
      throw new BizException(RespCode.SERVER_ERROR);
    }
  }



  public static Builder newBuilder() {
    return new Builder();
  }

  public String getReturnCode() {
    return returnCode;
  }

  public void setReturnCode(String returnCode) {
    this.returnCode = returnCode;
  }

  public String getReturnMsg() {
    return returnMsg;
  }

  public void setReturnMsg(String returnMsg) {
    this.returnMsg = returnMsg;
  }

  public Object getResponse() {
    return response;
  }

  public void setResponse(Object response) {
    this.response = response;
  }

  public String getJson() {
    return this.json;
  }

  public void setJson(String json) {
    this.json = json;
  }

  @Override
  public String toString() {
    if (this.json != null) {
      return this.json;
    }
    return "微信支付通信错误: returnCode=" + this.returnCode + ", returnMsg=" + this.returnMsg;
  }

  public static class Builder {
    private String returnCode;
    private String returnMsg;

    public Builder setReturnCode(String returnCode) {
      this.returnCode = returnCode;
      return this;
    }

    public Builder setErrorMsg(String errorMsg) {
      this.returnMsg = errorMsg;
      return this;
    }

    public WxPayNetError build() {
      WxPayNetError wxError = new WxPayNetError();
      wxError.setReturnCode(this.returnCode);
      wxError.setReturnMsg(this.returnMsg);
      return wxError;
    }

  }
}
