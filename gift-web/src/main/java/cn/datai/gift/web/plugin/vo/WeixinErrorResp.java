package cn.datai.gift.web.plugin.vo;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * 微信错误响应信息
 * Created by zhangyutao on 2016/12/24.
 */
public class WeixinErrorResp implements Serializable {

    @JsonProperty("errcode")
    private long errcode;

    @JsonProperty("errmsg")
    private String errmsg;

    public WeixinErrorResp() {
    }

    public WeixinErrorResp(long errcode, String errmsg) {
        this.errcode = errcode;
        this.errmsg = errmsg;
    }

    public long getErrcode() {
        return errcode;
    }

    public void setErrcode(long errcode) {
        this.errcode = errcode;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    @Override
    public String toString() {
        return "WeixinErrorResp{" +
                "errcode=" + errcode +
                ", errmsg='" + errmsg + '\'' +
                '}';
    }
}