package cn.datai.gift.web.service;

import cn.datai.gift.persist.po.PayOrderWx;
import cn.datai.gift.persist.po.RefundOrderWx;
import cn.datai.gift.wxpay.bean.response.WxPayRefundOrderResponse;
import cn.datai.gift.wxpay.bean.response.WxPayRefundQueryResponse;

import java.util.Date;
import java.util.List;

/**
 * Created by H.CAAHN on 2017/4/25.
 */
public interface RefundOrderWxService {
    /**
     * 查询指定渠道退款处理中的数据总数（也包括未确定的数据）
     * @param querytime
     * @return
     */
    int countProcessingWxRefund(Date querytime);

    /**
     * 查询指定渠道退款处理中的数据（也包括未确定的数据）
     * @param querytime
     * @param pageNo
     * @param size
     * @param total
     * @return
     */
    List<RefundOrderWx> pageProcessingWxRefund(Date querytime, int pageNo, int size, int total);

    /**
     * 根据OutTradeNo(商户订单号)查询
     * @param outTradeNo
     * @return
     */
    RefundOrderWx queryByOutTradeNo(String outTradeNo);

    /**
     * 插入退款信息
     * @param payOrderWx
     * @param outRefundNo
     */
    RefundOrderWx insertForRefund(PayOrderWx payOrderWx, String outRefundNo);

    /**
     * 退款申请后，更新数据库
     * @param response
     * @param outRefundNo
     * @param payInfoId 基本支付信息id
     */
    void updateForApplyRefund(WxPayRefundOrderResponse response, String outRefundNo, long payInfoId);

    /**
     * 调用微信支付系统，查询待处理的退款数据的退款状态
     * @param record
     */
    void updateForQueryRefundOrder(RefundOrderWx record, WxPayRefundQueryResponse rsp);
}
