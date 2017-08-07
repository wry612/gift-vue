package cn.datai.gift.web.service;

import cn.datai.gift.persist.po.PayInfo;
import cn.datai.gift.persist.po.PayOrderWx;
import cn.datai.gift.utils.exception.PayingException;
import cn.datai.gift.wxpay.bean.response.WxPayOrderQueryResponse;

import java.util.List;

/**
 * 微信支付结果查询
 * Created by H.CAAHN on 2017/4/19.
 */
public interface PayOrderService {
    /**
     * 查询微信未关闭的微信渠道支付结果
     * @param payOrderWxId
     * @return
     */
    PayOrderWx queryPayOrderAndLockWxById(String payOrderWxId);

    /**
     * 查询支付结果后，更新微信支付明细表数据
     * @param record
     * @param rsp
     */
    boolean updateForQueryPayOrder(PayInfo payInfo, PayOrderWx record, WxPayOrderQueryResponse rsp) throws PayingException;
}
