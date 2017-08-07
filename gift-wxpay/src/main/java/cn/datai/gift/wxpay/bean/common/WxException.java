package cn.datai.gift.wxpay.bean.common;

/**
 * 微信响应结果异常
 * Created by zhangyutao on 2017/4/14.
 */
public class WxException extends Exception{

    private static final long serialVersionUID = -6357149550353160810L;

    private WxError error;

    public WxException(WxError error) {
        super(error.toString());
        this.error = error;
    }

    public WxError getError() {
        return error;
    }

}
