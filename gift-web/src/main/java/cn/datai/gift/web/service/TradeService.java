package cn.datai.gift.web.service;

import cn.datai.gift.utils.RespResult;
import cn.datai.gift.web.contants.enums.PayBizType;
import cn.datai.gift.web.contants.enums.PayInfoStatus;
import cn.datai.gift.web.contants.enums.TradeType;

import java.io.IOException;
import java.math.BigDecimal;

/**
 * 交易：买卖相关服务
 * Created by zhangyutao on 2017/4/5.
 */
public interface TradeService {


    /**
     * 下单（买卖整合在一起）
     * @param userInfoId        用户信息id
     * @param payBizType @see {@link PayBizType}
     * @param commodityId 商品合约id
     * @param commodityQuantity 商品数量
     * @param couponDetailIds 优惠券id
     * @param quantityType 类型（瓶、毫升、饼、克）
     * @param remark 注释
     */
    RespResult order(long userInfoId, PayBizType payBizType, long commodityId, BigDecimal commodityQuantity, String[] couponDetailIds, BigDecimal quantityType, String remark) throws IOException;
}
