package cn.datai.gift.wxpay.bean.common;

/**
 * 微信支付上报后，收到反馈一系列操作运行时发生的异常， 此异常需要被捕获并处理，并将事务回滚
 * Created by zhangyutao on 2017/5/24.
 */
public class WxPayResponseException extends RuntimeException {

    public WxPayResponseException(WxPayResultError wxPayResultError) {
        super(wxPayResultError.toString());
    }

    /**
     * Constructs a new runtime exception with the specified cause and a
     * detail message of <tt>(cause==null ? null : cause.toString())</tt>
     * (which typically contains the class and detail message of
     * <tt>cause</tt>).  This constructor is useful for runtime exceptions
     * that are little more than wrappers for other throwables.
     *
     * @param cause the cause (which is saved for later retrieval by the
     *              {@link #getCause()} method).  (A <tt>null</tt> value is
     *              permitted, and indicates that the cause is nonexistent or
     *              unknown.)
     * @since 1.4
     */
    public WxPayResponseException(Throwable cause) {
        super(cause);
    }
}
