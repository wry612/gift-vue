package cn.datai.gift.persist.mapper;

import cn.datai.gift.persist.po.ConvertObj;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ConvertObjMapperExt extends ConvertObjMapper {

    /**
     * 查询并锁住记录
     * @param convertObjId
     * @return
     */
    ConvertObj findAndLockConverObjByConvertObjId(@Param("convertObjId") Long convertObjId);
}