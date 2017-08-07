package cn.datai.gift.persist.mapper;

import cn.datai.gift.persist.po.CommodityGiftInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface CommodityGiftInfoMapperExt extends CommodityGiftInfoMapper {

    /**
     * 通过主键查询商品礼包信息并上锁
     * @param commodityGiftInfoId
     * @return
     */
    CommodityGiftInfo selectByPrimaryKeyAndLock(@Param("id") long commodityGiftInfoId);

    /**
     * 通过code查询商品礼包信息并上锁
     * @param code
     * @return
     */
    CommodityGiftInfo selectByCodeAndLock(@Param("code") String code);

    /**
     * 查询过期时间在一定返回内的商品大礼包
     * @return
     */
    List<CommodityGiftInfo> selectExpired(@Param("startExpiredTime") Date startExpiredTime, @Param("endExpiredTime") Date endExpiredTime);

    /**
     * 询过期时间在一定返回内的商品大礼包id
     * @return
     */
    List<Long> selectExpiredId(@Param("startExpiredTime") Date startExpiredTime, @Param("endExpiredTime") Date endExpiredTime);
}