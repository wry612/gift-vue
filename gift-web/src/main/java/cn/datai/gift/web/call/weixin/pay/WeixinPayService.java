package cn.datai.gift.web.call.weixin.pay;

import cn.datai.gift.wxpay.bean.request.*;
import cn.datai.gift.wxpay.bean.response.WxPayCloseOrderResponse;
import cn.datai.gift.wxpay.bean.response.WxPayUnifiedOrderResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

import java.util.HashMap;

public interface WeixinPayService {

    /**
     * 统一下单
     * 除被扫支付场景以外，商户系统先调用该接口在微信支付服务后台生成预支付交易单，返回正确的预支付交易回话标识后再按扫码、JSAPI、APP等不同场景生成交易串调起支付。
     * @return
     * @param wxPayUnifiedOrderRequest
     */
    @POST("pay/unifiedorder")
    Call<WxPayUnifiedOrderResponse> payUnifiedOrder(@Body WxPayUnifiedOrderRequest wxPayUnifiedOrderRequest);


    /**
     * 关闭订单
     * <p>
     * 以下情况需要调用关单接口：商户订单支付失败需要生成新单号重新发起支付，要对原订单号调用关单，避免重复支付；系统下单后，用户支付超时，系统退出不再受理，避免用户继续，请调用关单接口。
     * </p>
     * <p>
     * 注意：订单生成后不能马上调用关单接口，最短调用时间间隔为5分钟。
     * </p>
     * @return
     * @param wxPayCloseOrderRequest 微信关闭订单请求
     */
    @POST("pay/closeorder")
    Call<WxPayCloseOrderResponse> closeOrder(@Body WxPayCloseOrderRequest wxPayCloseOrderRequest);

    /**
     * 查询订单<br/>
     * 该接口提供所有微信支付订单的查询，商户可以通过查询订单接口主动查询订单状态<br/>
     * 需要调用查询接口的情况：<br/>
     * 当商户后台、网络、服务器等出现异常，商户系统最终未接收到支付通知；<br/>
     * 调用支付接口后，返回系统错误或未知交易状态情况；<br/>
     * 调用被扫支付API，返回USERPAYING的状态；<br/>
     * 调用关单或撤销接口API之前，需确认支付状态；
     * @param wxPayOrderQueryRequest
     * @return
     */
    @POST("pay/orderquery")
    Call<HashMap> payOrderQuery(@Body WxPayOrderQueryRequest wxPayOrderQueryRequest);

    /**
     * 查询退款<br/>
     * 提交退款申请后，通过调用该接口查询退款状态。退款有一定延时，用零钱支付的退款20分钟内到账，银行卡支付的退款3个工作日后重新查询退款状态。
     * @param wxPayRefundQueryRequest
     * @return
     */
    @POST("pay/refundquery")
    Call<HashMap> payRefundQuery(@Body WxPayRefundQueryRequest wxPayRefundQueryRequest);

    /**
     * 申请退款<br>
     * 当交易发生之后一段时间内，由于买家或者卖家的原因需要退款时，卖家可以通过退款接口将支付款退还给买家，微信支付将在收到退款请求并且验证成功之后，按照退款规则将支付款按原路退到买家帐号上。
     注意：
     1、交易时间超过一年的订单无法提交退款；
     2、微信支付退款支持单笔交易分多次退款，多次退款需要提交原支付订单的商户订单号和设置不同的退款单号。总退款金额不能超过用户实际支付金额。 一笔退款失败后重新提交，请不要更换退款单号，请使用原商户退款单号。
     * @param wxPayRefundOrderRequest
     * @return
     */
    @POST("secapi/pay/refund")
    Call<HashMap> payRefundOrder(@Body WxPayRefundOrderRequest wxPayRefundOrderRequest);
}
