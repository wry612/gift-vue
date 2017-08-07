package cn.datai.gift.wxpay.bean.common;

/**
 * 微信支付通信异常
 * Created by zhangyutao on 2017/4/14.
 */
public class WxPayNetException extends Exception{

    private static final long serialVersionUID = -6357149550353160810L;

    private WxPayNetError error;

    public WxPayNetException(WxPayNetError error) {
        super(error.toString());
        this.error = error;
    }

    public WxPayNetError getError() {
        return error;
    }

}
