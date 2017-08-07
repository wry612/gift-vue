package cn.datai.gift.persist.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDeliveryInfoMapperExt extends UserDeliveryInfoMapper {

    /**
     * 修改状态
     * @param userDeliveryInfoId
     * @param isDefault
     */
    void changeDefaultStatus(@Param("userDeliveryInfoId") Long userDeliveryInfoId, @Param("isDefault") String isDefault);
}