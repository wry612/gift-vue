package cn.datai.gift.utils.exception;


import cn.datai.gift.utils.enums.RespCode;

/**
 * 数据库异常类.
 */
public class DbException extends RuntimeException {
	private static final long serialVersionUID = -5928402387230643282L;

	/**
     * 构造方法.
     */
    public DbException() {
        super();
    }

    /**
     * 构造方法.
     * @param msg 消息
     */
    public DbException(String msg) {
        super(msg);
    }

    /**
     * 构造方法.
     * @param cause 异常
     */
    public DbException(Throwable cause) {
        super(cause);
    }

    /**
     * 构造方法.
     * @param cause 异常
     * @param msg 消息
     */
    public DbException(Throwable cause, String msg) {
        super(msg, cause);
    }

    /** 错误Code. */
    private String errorCode = RespCode.SERVER_BIZ_ERROR.getCode();

    /**
     * 构造方法.
     * @param errorCode 错误Code
     * @param cause 异常
     */
    public DbException(String errorCode, Throwable cause) {
        super(cause);
        this.errorCode = errorCode;
    }   

    /**
     * 构造方法.
     * @param resultCode 错误Code
     */
    public DbException(RespCode resultCode) {
        super(resultCode.getMsg());
        this.errorCode = resultCode.getCode();
    }
    
    /**
     * 构造方法.
     * @param resultCode 错误Code
     */
    public DbException(RespCode resultCode, Throwable cause) {
        super(resultCode.getMsg(), cause);
        this.errorCode = resultCode.getCode();
    }

    /**
     * 构造方法.
     * @param errorCode 错误Code
     * @param msg 消息
     */
    public DbException(String errorCode, String msg) {
        super(msg);
        this.errorCode = errorCode;
    }

    /**
     * 构造方法.
     * @param errorCode 错误Code
     * @param cause 异常
     * @param msg 消息
     */
    public DbException(String errorCode, Throwable cause, String msg) {
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
}
