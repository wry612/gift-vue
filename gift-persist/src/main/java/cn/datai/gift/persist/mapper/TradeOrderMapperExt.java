package cn.datai.gift.persist.mapper;

import cn.datai.gift.persist.po.PayInfo;
import cn.datai.gift.persist.po.TradeOrder;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TradeOrderMapperExt extends TradeOrderMapper {

    TradeOrder findAndLockTradeOrderByPayInfoId(@Param("payInfoId") String payInfoId);

    /**
     * 查询并锁记录
     * @param id
     * @return
     */
    TradeOrder selectByPrimaryKeyAndLock(@Param("id") long id);
}