package cn.datai.gift.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.util.Map;

public class ReqResult {
    public static String SUCCESS = "0";
    private Map<String, Object> head;
    private Map<String, Object> body;

    public Map<String, Object> getHead() {
        return head;
    }

    public void setHead(Map<String, Object> head) {
        this.head = head;
    }

    public Map<String, Object> getBody() {
        return body;
    }

    public Object getBody(String key) {
        Object val = null;
        if (null != this.body) {
            val = this.body.get(key);
        }
        return val;
    }

    public JSONObject getBodyJson(String key) {
        JSONObject val = null;
        if (null != this.body) {
            val = JSON.parseObject(this.body.get(key).toString());
        }
        return val;
    }

    public Boolean getBodyBool(String key) {
        Boolean val = null;
        if (null != this.body) {
            val = (Boolean) this.body.get(key);
        }
        return val;
    }

    public String getBodyStr(String key) {
        String val = null;
        if (null != this.body) {
            val = (String) this.body.get(key);
        }
        return val;
    }

    public void setBody(Map<String, Object> body) {
        this.body = body;
    }

    public String getCode() {
        String code = null;
        if (null != this.head) {
            code = (String) this.head.get("code");
        }
        return code;
    }

    public String getMsg() {
        String msg = null;
        if (null != this.head) {
            msg = (String) this.head.get("msg");
        }
        return msg;
    }

    public static void main(String[] args) {
        String str = "{ head: { code: \"0\", msg: \"成功\" }, body: { inited: true } }";
        ReqResult json = JSON.parseObject(str, ReqResult.class);
        System.out.println(json.getCode());
    }
}
