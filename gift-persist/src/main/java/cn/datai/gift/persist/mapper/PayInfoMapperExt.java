package cn.datai.gift.persist.mapper;

import cn.datai.gift.persist.po.PayInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface PayInfoMapperExt extends PayInfoMapper {

    /**
     * 查询并锁记录
     * @param id
     * @return
     */
    PayInfo selectByPrimaryKeyAndLock(@Param("id") long id);

    /**
     * 查询未支付的订单总数
     * @param params
     * @return
     */
    int countUnPayInfo(Map<String, Object> params);

    /**
     * 查询未支付订单列表
     * @param params
     * @return
     */
    List<PayInfo> selectUnPayInfo(Map<String, Object> params);
}