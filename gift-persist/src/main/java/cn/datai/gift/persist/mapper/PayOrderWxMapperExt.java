package cn.datai.gift.persist.mapper;

import cn.datai.gift.persist.po.PayOrderWx;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PayOrderWxMapperExt extends PayOrderWxMapper {

    /**
     * 查询并锁记录
     * @param id
     * @return
     */
    PayOrderWx selectByPrimaryKeyAndLock(@Param("id") String id);
}