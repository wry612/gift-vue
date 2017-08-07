package cn.datai.gift.persist.mapper;

import cn.datai.gift.persist.po.ConvertObjOrder;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface ConvertObjOrderMapperExt extends ConvertObjOrderMapper {

    /**
     * 查询并锁住以物换物订单
     * @param convertObjOrderId
     * @return
     */
    ConvertObjOrder findAndLockConvertObjOrderById(@Param("convertObjOrderId") Long convertObjOrderId);

    List<ConvertObjOrder> queryConvertObjOrderLimitNum(Map<String,Object> map);
}