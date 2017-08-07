package cn.datai.gift.web.plugin.vo;

import cn.datai.gift.web.service.PayService;
import cn.datai.gift.web.utils.xml.XStreamCDATA;
import com.thoughtworks.xstream.annotations.XStreamAlias;

import javax.naming.ldap.PagedResultsControl;

/**
 * 支付结果通用通知收到后回复给微信服务器的对象
 * Created by zhangyutao on 2017/4/17.
 */
@XStreamAlias("xml")
public class WxPayNotifyResponse {

    /**
     * 返回状态码
     */
    @XStreamAlias("return_code")
    @XStreamCDATA
    private String returnCode;
    /**
     * 返回信息
     */
    @XStreamAlias("return_msg")
    @XStreamCDATA
    private String returnMsg;

    public static WxPayNotifyResponse SUCCESS = new WxPayNotifyResponse("SUCCESS", "成功");

    public static WxPayNotifyResponse FAIL = new WxPayNotifyResponse("FAIL", null);

    public WxPayNotifyResponse() {
    }

    public WxPayNotifyResponse(String returnCode, String returnMsg) {
        this.returnCode = returnCode;
        this.returnMsg = returnMsg;
    }

    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    public void setReturnMsg(String returnMsg) {
        this.returnMsg = returnMsg;
    }

    public String getReturnCode() {
        return returnCode;
    }

    public String getReturnMsg() {
        return returnMsg;
    }

    public WxPayNotifyResponse failMsg(String failMsg) {
        this.returnMsg = failMsg;
        return this;
    }
}
