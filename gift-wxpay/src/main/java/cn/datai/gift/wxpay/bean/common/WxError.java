package cn.datai.gift.wxpay.bean.common;

import cn.datai.gift.utils.enums.RespCode;
import cn.datai.gift.utils.exception.BizException;
import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;
import java.lang.reflect.Field;

/**
 * 微信错误码说明，请阅读： <a href="http://mp.weixin.qq.com/wiki/10/6380dc743053a91c544ffd2b7c959166.html">全局返回码说明</a>
 *
 */
public class WxError implements Serializable {

  private static Logger logger = LoggerFactory.getLogger(WxError.class);


  private static final long serialVersionUID = 7869786563361406291L;

  private String errorCode;

  private String errorMsg;

  private String json;

  private Object response;

  public static WxError fromJson(String json) {
    return JSONObject.parseObject(json, WxError.class);
  }

  public static WxError fromResponse(Object response){
    try {
      Field errorCodeField = response.getClass().getDeclaredField("errorCode");
      boolean errorCodeFieldAccessible = errorCodeField.isAccessible();
      errorCodeField.setAccessible(true);
      String errorCode = errorCodeField.get(response).toString();
      errorCodeField.setAccessible(errorCodeFieldAccessible);

      Field errorMsgField = response.getClass().getDeclaredField("errorMsg");
      boolean errorMsgFieldAccessible = errorMsgField.isAccessible();
      errorMsgField.setAccessible(true);
      String errorMsg = errorCodeField.get(response).toString();
      errorMsgField.setAccessible(errorCodeFieldAccessible);

      WxError wxError = new WxError();
      wxError.setErrorCode(errorCode);
      wxError.setErrorMsg(errorMsg);
      return wxError;
    } catch (Exception e) {
      logger.error(e.getMessage());
      throw new BizException(RespCode.SERVER_ERROR);
    }
  }



  public static Builder newBuilder() {
    return new Builder();
  }

  public String getErrorCode() {
    return this.errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  public String getErrorMsg() {
    return this.errorMsg;
  }

  public void setErrorMsg(String errorMsg) {
    this.errorMsg = errorMsg;
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
    return "错误: Code=" + this.errorCode + ", Msg=" + this.errorMsg;
  }

  public static class Builder {
    private String errorCode;
    private String errorMsg;

    public Builder setErrorCode(String errorCode) {
      this.errorCode = errorCode;
      return this;
    }

    public Builder setErrorMsg(String errorMsg) {
      this.errorMsg = errorMsg;
      return this;
    }

    public WxError build() {
      WxError wxError = new WxError();
      wxError.setErrorCode(this.errorCode);
      wxError.setErrorMsg(this.errorMsg);
      return wxError;
    }

  }
}
