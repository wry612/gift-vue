package cn.datai.gift.utils;

import cn.datai.gift.utils.enums.RespCode;

import java.io.Serializable;

/**
 * 返回信息封装类
 * @author shaowei
 *
 */
public class RespResult implements Serializable{
	
	private String code;
	private String msg;
	/** 结果对象. */
    private Object body;
	
	public static RespResult getInstance(RespCode respCode) {
		return new RespResult(respCode);
	}
	
	public static RespResult getInstance(String code, String msg) {
		return new RespResult(code, msg);
	}
	
	public static RespResult getInstance(RespCode respCode, Object obj) {
		return new RespResult(respCode, obj);
	}
	
	public static RespResult getInstance(String code, String msg, Object obj) {
		return new RespResult(code, msg, obj);
	}

	public RespResult(){}
	
	public RespResult(RespCode respCode) {
		super();
		this.code = respCode.getCode();
		this.msg = respCode.getMsg();
	}
	
	public RespResult(String code, String msg) {
		super();
		this.code = code;
		this.msg = msg;
	}
	
	public RespResult(RespCode respCode, Object obj) {
		super();
		this.code = respCode.getCode();
		this.msg = respCode.getMsg();
		this.body = obj;
	}
	
	public RespResult(String code, String msg, Object obj) {
		super();
		this.code = code;
		this.msg = msg;
		this.body = obj;
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

	@Override
	public String toString() {
		return "RespResult{" +
				"code='" + code + '\'' +
				", msg='" + msg + '\'' +
				", body=" + body +
				'}';
	}
}
