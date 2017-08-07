package cn.datai.gift.web.call.express.response.expressInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by zhangyutao on 2017/7/13.
 */
public class Data {

    @JsonCreator
    public Data() {
    }

    @JsonProperty("time")
    private String time;

    @JsonProperty("context")
    private String context;

    public void setTime(String time) {
        this.time = time;
    }

    public String getTime() {
        return this.time;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getContext() {
        return this.context;
    }

}
