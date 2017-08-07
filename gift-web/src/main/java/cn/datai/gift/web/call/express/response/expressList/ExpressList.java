package cn.datai.gift.web.call.express.response.expressList;

import com.fasterxml.jackson.annotation.JsonProperty;


public class ExpressList {
    @JsonProperty("showapi_res_code")
    private int showapiResCode;

    @JsonProperty("showapi_res_error")
    private String showapiResError;

    @JsonProperty("showapi_res_body")
    private ShowapiResBody showapiResBody;


    public void setShowapiResCode(int showapiResCode) {
        this.showapiResCode = showapiResCode;
    }
    public int getShowapiResCode() {
        return showapiResCode;
    }

    public void setShowapiResError(String showapiResError) {
        this.showapiResError = showapiResError;
    }
    public String getShowapiResError() {
        return showapiResError;
    }

    public void setShowapiResBody(ShowapiResBody ShowapiResBody) {
        this.showapiResBody = ShowapiResBody;
    }
    public ShowapiResBody getShowapiResBody() {
        return showapiResBody;
    }

    @Override
    public String toString() {
        return "ExpressList{" +
                "showapiResCode=" + showapiResCode +
                ", showapiResError='" + showapiResError + '\'' +
                ", showapiResBody=" + showapiResBody +
                '}';
    }
}