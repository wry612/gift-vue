package cn.datai.gift.persist.mapper;

import cn.datai.gift.persist.po.DeliveryOrder;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DeliveryOrderMapperExt extends DeliveryOrderMapper {

    /**
     * 查询并锁住订单
     * @param payInfoId
     * @return
     */
    DeliveryOrder findAndLockDeliveryOrderByPayInfoId(@Param("payInfoId") String payInfoId);

    /**
     * 查询并锁住订单
     * @param deliveryOrderId
     * @return
     */
    DeliveryOrder findAndLockDeliveryOrderByDeliveryOrderId(@Param("deliveryOrderId") Long deliveryOrderId);
}