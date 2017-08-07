package cn.datai.gift.persist.mapper;

import cn.datai.gift.persist.po.CommodityGiftInfo;
import cn.datai.gift.persist.po.GiftAccount;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface GiftAccountMapperExt extends GiftAccountMapper {

    /**
     * 通过主键查询交易账户信息并上锁
     * @param giftAccountId
     * @return
     */
    GiftAccount selectByPrimaryKeyAndLock(@Param("id") long giftAccountId);

    /**
     * 通过用户id和商品id查询用户持仓信息
     * @param userInfoId
     * @param commodityId
     * @return
     */
    GiftAccount selectByUserIdAndCommodityId(@Param("userInfoId")long userInfoId, @Param("commodityId") long commodityId);
}