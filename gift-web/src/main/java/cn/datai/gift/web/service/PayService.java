package cn.datai.gift.web.service;

import cn.datai.gift.persist.po.PayInfo;
import cn.datai.gift.persist.po.PayOrderWx;
import cn.datai.gift.persist.po.RefundOrderWx;
import cn.datai.gift.utils.RespResult;
import cn.datai.gift.utils.exception.PayingException;
import cn.datai.gift.web.contants.enums.PayBizType;
import cn.datai.gift.web.contants.enums.PayChannel;
import cn.datai.gift.web.contants.enums.WxTradeType;
import cn.datai.gift.web.plugin.vo.UserLoginInfo;
import cn.datai.gift.wxpay.bean.common.WxException;
import cn.datai.gift.wxpay.bean.common.WxPayNetException;
import cn.datai.gift.wxpay.bean.common.WxPayNotifyReceiver;
import cn.datai.gift.wxpay.bean.common.WxPayResponseException;
import cn.datai.gift.wxpay.bean.response.WxPayOrderQueryResponse;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 支付服务
 * Created by zhangyutao on 2017/4/11.
 */
public interface PayService {

    /**
     * 下支付渠道订单
     * <pre>
     *      当前方法不加事务
     *      注意：调用此接口前必须保证业务订单信息、基本支付信息已存储在数据库中
     *
     *      微信渠道：
     *              公众号支付：
     *                      参数：
     *                          deviceInfo        设备号：自定义参数，可以为终端设备号(门店号或收银设备ID)，PC网页或公众号内支付可以传"WEB"
     *                          body              商品描述：商品简单描述，商品字段规则：商家名称-销售商品类目，  样例：罗辑思维-图书
     *                          detail            商品详情：单品优惠字段(暂未上线)
     *                          attach            附加数据：附加数据，在查询API和支付通知中原样返回，可作为自定义参数使用。
     *                          feeType           标价币种：符合ISO 4217标准的三位字母代码，默认人民币：CNY
     *                          spbillCreateIp    终端IP：提交用户端ip
     *                          goodsTag          商品标记：商品标记，使用代金券或立减优惠功能时需要的参数
     *                          productId         商品ID：此参数为二维码中包含的商品ID，商户自行定义。
     *                          limitPay          指定支付方式：上传此参数no_credit--可限制用户不能使用信用卡支付
     *                          openid            用户标识：微信用户在商户对应appid下的唯一标识。
     *                      返回：
     *                          Map类型，包含：
     *                          appId             公众号id
     *                          timeStamp         当前时间戳
     *                          nonceStr          用于签名的随机字符串
     *                          package           包含的相关预定单信息
     *                          signType          签名类型
     *                          paySign           签名
     *                      方法内实现的具体步骤：
     *                          1、事务中完成（存储渠道支付订单信息、修改基本支付信息对应的支付渠道信息、修改相应状态），调用 <code>createWxPayOrder()</code>方法
     *                          2、事务外上报微信服务器相关支付订单信息，返回预付订单信息，调用 <code> postWxPayOrder() </code> 方法
     *                          3、事务内完成上一步返回的预订单信息与支付渠道订单信息绑定，之后生成前端唤起H5支付窗口需要的参数  调用 <code> genWxPayFrontParams() </code> 方法
     *              APP支付（还没写呢）：
     * </pre>
     *
     * @param payInfo    @see {@link PayInfo}
     * @param payChannel @see {@link PayChannel}
     * @param params 对应支付渠道的下单所需的参数
     */
    Map payChannelOrder(PayInfo payInfo, PayChannel payChannel, Map params) throws WxPayNetException;

    /**
     *  生成支付订单，包括支付渠道：微信公众号支付， 微信APP支付， 微信扫码支付，支付宝APP支付等等
     *  payInfo的状态： A：已创建支付订单，未选择支付渠道  B：已选择绑定支付渠道，如微信，支付宝之类的，未支付  C：支付已取消 D:支付超时   F： 支付成功
     * @param userInfoId
     * @param operatorId
     * @param amount 支付金额，分为单位
     * @param payBizType @see {@link PayBizType}
     * @param bizId  业务id
     * @param timeExpire 超时时间， 留给交易的时间必须大于5分钟
     * @param remark 注释
     */
    PayInfo createPayOrder(long userInfoId, long operatorId, long amount, PayBizType payBizType, String bizId, Date timeExpire, String remark);

    /**
     * 支付下单，并直接绑定微信支付，返回微信支付订单
     */
    PayOrderWx createWxPayOrder(PayInfo payInfo, WxTradeType wxTradeType, Map<String, String> params);

    @Transactional(rollbackFor = Exception.class)
    Map<String, String> genWxPayFrontInfo(PayOrderWx payOrderWx) throws IOException;

    /**
     * 支付结果反馈回本系统
     * @param wxPayNotifyReceiver 相对应支付渠道反馈的数据
     */
    PayInfo wxPayResultNotify(WxPayNotifyReceiver wxPayNotifyReceiver);

    void afterPayBizHandler(PayInfo payInfo) throws WxPayNetException, IOException;

    void afterPayBizHandlerSimple(PayInfo payInfo) throws WxPayNetException, IOException;

    /**
     * 订单支付结果查询并更新本地支付结果
     * @param payInfo
     */
    boolean payOrderQueryAndUpdate(PayInfo payInfo) throws WxPayNetException, PayingException;

    /**
     * 退款结果查询
     * @param refund
     */
    void payRefundQuery(RefundOrderWx refund) throws WxPayNetException;

    /**
     *
     *  按原支付基本信息中绑定的支付渠道进行支付
     *  实现逻辑：
     *      1、查询PayInfo中绑定的渠道支付信息，去相对应的表中查询渠道订单信息。
     *      2、如果没有没有绑定支付渠道信息，默认绑定微信支付渠道，并commit数据。之后走一下流程
     *      3、如果有渠道支付信息，例如微信支付渠道。检查是否有预订单号
     *          a: 如果有预订单号，说明之前的绑定一系列操作正常， 直接拿预订单号签名，返回前端相关参数，并唤起支付窗口
     *          b: 如果没有预订单号， 说明之前的绑定有一定的问题，现在需要重新生成微信渠道的支付订单，关联基本支付信息，并上报微信，绑定预订单号，签名，返回前端相关参数，唤起支付闯
     *
     *  之前用户在下了业务订单、支付订单并上报了微信，但当时取消了支付，转而到此。
     *  发生以上的情况，会出现三种结果：
     *1、检查是否上报了微信，通过是否存有预订单号即可知晓
     *2、如果有,说明已上报微信，并成功保存预订单信息，此时直接拿预订单信息签名返回前端，唤起支付窗口让用户去支付
     *3、如果没有,要分两种情况：
     *   a:可能根本就没上报微信或发生异常，就结束了
     *   b:可能已成功上报，但系统发生了异常未来得及或无法存储返回的预订单。 而微信不提供查询预订单号的接口，那么绑定渠道订单号的预订单将永远消失。唯一的方法只有发起一个新的微信渠道订单，并绑定基本支付信息，再次上报给微信，之后绑定预订单，签名返回前端，唤起支付窗口
     *   以上两种子类情况都可以通过给支付基本信息生成新的微信渠道订单，并上报微信，签名返回前端，唤起支付窗口
     * @param payInfo
     * @param payParams
     */
    Map<String, String> payOriginalChannel(PayInfo payInfo, HashMap<String, String> payParams) throws WxPayNetException;

    /**
     * 申请退款
     * @param payInfoId 基本支付信息id
     */
    void refund(long payInfoId) throws WxPayNetException;

    /**
     * 给某微信支付订单查找或新建退款订单信息
     */
    RefundOrderWx createOrFindRefundOrderWx(PayOrderWx payOrderWx);

    /**
     * 微信支付接口
     */
    interface WXPayService{
        /**
         * 微信查询订单接口
         * @param transactionId
         * @param outTradeNo
         * @return
         * @throws IllegalAccessException
         */
        WxPayOrderQueryResponse wxJsapiQuery(String transactionId, String outTradeNo) throws IllegalAccessException, WxException, WxPayNetException;

        /**
         * 上报微信支付订单信息，将返回的预付订单信息存入微信支付订单中，并修改对应的状态
         * @param payOrderWx
         */
        PayOrderWx callAndBindWxPrepayInfo(PayOrderWx payOrderWx) throws WxPayNetException, WxPayResponseException;
    }

    /**
     * 支付宝支付接口
     */
    interface AliPayService{
    }

    /**
     * 交易详细页面支付
     * @param userLoginInfo
     * @param tradeOrderId
     */
    RespResult payforBuyCommodity(UserLoginInfo userLoginInfo, Long tradeOrderId,HttpServletRequest request) throws WxPayNetException, IOException;

}
