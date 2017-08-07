package cn.datai.gift.web.call.express.response.expressInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * 物流跟踪信息
 * Created by zhangyutao on 2017/7/11.
 */
public class ExpressInfo {

    /**
     * showapi平台返回码,0为成功,其他为失败
     */
    @JsonProperty("showapi_res_code")
    private int showapiResCode;

    /**
     * showapi平台返回的错误信息
     */
    @JsonProperty("showapi_res_error")
    private String showapiResError;

    @JsonProperty("showapi_res_body")
    @JsonDeserialize(as=ShowapiResBody.class)
    private ShowapiResBody showapiResBody;

    public int getShowapiResCode() {
        return showapiResCode;
    }

    public void setShowapiResCode(int showapiResCode) {
        this.showapiResCode = showapiResCode;
    }

    public String getShowapiResError() {
        return showapiResError;
    }

    public void setShowapiResError(String showapiResError) {
        this.showapiResError = showapiResError;
    }

    public ShowapiResBody getShowapiResBody() {
        return showapiResBody;
    }

    public void setShowapiResBody(ShowapiResBody showapiResBody) {
        this.showapiResBody = showapiResBody;
    }
}
