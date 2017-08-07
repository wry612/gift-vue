package cn.datai.gift.web.service;

import cn.datai.gift.persist.po.PayInfo;
import cn.datai.gift.persist.po.TradeOrder;
import cn.datai.gift.persist.vo.commodity.CommodityVo;
import cn.datai.gift.utils.RespResult;
import cn.datai.gift.wxpay.bean.common.WxException;
import cn.datai.gift.wxpay.bean.common.WxPayNetException;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;

/**
 * Created by Administrator on 2017/4/19.
 */
public interface BuyCommodityService {

    /**
     * 购买商商品
     * @param userInfoId 用户ID
     * @param commodityId 商品Id
     * @param quantity 购买数量
     * @param quantityType 购买的类型（毫升、瓶、克、饼）
     * @return
     */
    PayInfo buyCommodity(long userInfoId, long commodityId, BigDecimal quantity, BigDecimal quantityType) throws IOException;

    /**
     * 购买商品支付成功之后的操作
     * @param payInfoId
     */
    void paidBuyCommodity(Long payInfoId) throws WxPayNetException, IOException;


    /**
     * 取消购买操作(下单完成，但是没有付款)
     * @param tradeOrderId
     */
    void cancelBuyCommodityInfo(Long tradeOrderId,Long userInfoId) throws WxPayNetException, IOException;

    /**
     * 超时时取消购买操作(下单完成，但是没有付款，不需要验证用户信息)
     * @param tradeOrderId
     */
    void cancelExpireBuyCommodityInfo(Long tradeOrderId) throws WxPayNetException, IOException;

    /**
     * 购买商品在不需要付款的情况下直接完成订单
     * @param tradeOrder
     * @param commodityVo
     */
    void updateBuyCommodityInfoNoPay(TradeOrder tradeOrder, CommodityVo commodityVo) throws IOException;

    /**
     * 定时任务
     * @return
     */
    void cancelExpireTradeOrderList() throws IOException;


}
