package cn.datai.gift.utils.exception;

import cn.datai.gift.utils.enums.RespCode;

/**
 * 业务异常类.
 */
public class BizException extends RuntimeException {
	private static final long serialVersionUID = -5928402387230643282L;

	/**
     * 构造方法.
     */
    public BizException() {
        super();
    }

    /**
     * 构造方法.
     * @param msg 消息
     */
    public BizException(String msg) {
        super(msg);
    }

    /**
     * 构造方法.
     * @param cause 异常
     */
    public BizException(Throwable cause) {
        super(cause);
    }

    /**
     * 构造方法.
     * @param cause 异常
     * @param msg 消息
     */
    public BizException(Throwable cause, String msg) {
        super(msg, cause);
    }

    /** 错误Code. */
    private String errorCode = RespCode.SERVER_BIZ_ERROR.getCode();

    /** 错误Msg. */
    private String errorMsg = RespCode.SERVER_BIZ_ERROR.getMsg();

    /**
     * 构造方法.
     * @param errorCode 错误Code
     * @param cause 异常
     */
    public BizException(String errorCode, Throwable cause) {
        super(cause);
        this.errorCode = errorCode;
    }   

    /**
     * 构造方法.
     * @param resultCode 错误Code
     */
    public BizException(RespCode resultCode) {
        super(resultCode.getMsg());
        this.errorCode = resultCode.getCode();
        this.errorMsg = resultCode.getMsg();
    }
    
    /**
     * 构造方法.
     * @param resultCode 错误Code
     */
    public BizException(RespCode resultCode, Throwable cause) {
        super(resultCode.getMsg(), cause);
        this.errorCode = resultCode.getCode();
    }

    /**
     * 构造方法.
     * @param errorCode 错误Code
     * @param msg 消息
     */
    public BizException(String errorCode, String msg) {
        super(msg);
        this.errorCode = errorCode;
    }

    /**
     * 构造方法.
     * @param errorCode 错误Code
     * @param cause 异常
     * @param msg 消息
     */
    public BizException(String errorCode, Throwable cause, String msg) {
        super(msg, cause);
        this.errorCode = errorCode;
    }

    /**
     * 获得错误Code.
     * @return 错误Code
     */
	public String getErrorCode() {
		return errorCode;
	}

    /**
     * 获得错误消息
     * @return 错误消息
     */
    public String getErrorMsg() {
        return errorMsg;
    }
}
