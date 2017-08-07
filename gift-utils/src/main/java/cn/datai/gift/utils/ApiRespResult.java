/*
 * 文件名：ApiRespResult.java
 * 版权：Copyright 2016 江苏大泰信息技术有限公司. All Rights Reserved. 
 * 描述：上海及各网关接口返回结果封装类
 * 创建人：汪涛
 * 创建时间：2016-08-17
 */
package cn.datai.gift.utils;

import java.util.Map;

/**
 * 上海及各网关接口返回结果封装类.
 * @author wangtao
 *
 */
public class ApiRespResult {
	
    /** Head. */
    private Map<String, String> head;
	/** 结果数据. */
    private Object body;

    /**
     * 获得Head.
     * @return Head
     */
    public Map<String, String> getHead() {
        return head;
    }

    /**
     * 获得Code.
     * @return Code
     */
    public String getCode() {
        if (null != head) {
            return head.get("code");
        }
        return "500";
    }

    /**
     * 获得Message.
     * @return Message
     */
    public String getMsg() {
        if (null != head) {
            return head.get("msg");
        }
        return "";
    }

    /**
     * 设置Head.
     * @param head Head
     */
    public void setHead(Map<String, String> head) {
        this.head = head;
    }

    /**
     * 获得结果数据.
     * @return 结果数据
     */
    public Object getBody() {
        return body;
    }

    /**
     * 设置结果数据.
     * @param body 结果数据
     */
    public void setBody(Object body) {
        this.body = body;
    }
}
