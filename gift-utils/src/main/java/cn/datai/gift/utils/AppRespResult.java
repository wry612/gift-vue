package cn.datai.gift.utils;

import cn.datai.gift.utils.enums.RespCode;

import java.io.Serializable;

/**
 * APP返回信息封装类
 *
 * @author shaowei
 */
public class AppRespResult implements Serializable {

    private static final long serialVersionUID = -1810555932541964783L;
    private String code;
    private String msg;
    /**
     * 结果对象.
     */
    private Object body = "";

    public AppRespResult() {
    }

    public AppRespResult(RespCode respCode) {
        super();
        this.code = respCode.getCode();
        this.msg = respCode.getMsg();
        this.body = "";
    }

    public AppRespResult(String code, String msg) {
        super();
        this.code = code;
        this.msg = msg;
        this.body = "";
    }

    public AppRespResult(RespCode respCode, Object obj) {
        super();
        this.code = respCode.getCode();
        this.msg = respCode.getMsg();
        this.body = obj;
    }

    public AppRespResult(String code, String msg, Object obj) {
        super();
        this.code = code;
        this.msg = msg;
        this.body = obj;
    }

    public AppRespResult(RespResult rr) {
        super();
        this.code = rr.getCode();
        this.msg = rr.getMsg();
        this.body = (null == rr.getBody() ? "" : rr.getBody());
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Object getBody() {
        return body;
    }

    public void setBody(Object body) {
        this.body = body;
    }
}
