package cn.datai.gift.persist.mapper;

import cn.datai.gift.persist.po.Advertisement;
import cn.datai.gift.persist.po.AdvertisementExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdvertisementMapper {
    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: advertisement
     * @author MyBatis Generator
     */
    int countByExample(AdvertisementExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: advertisement
     * @author MyBatis Generator
     */
    int deleteByExample(AdvertisementExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: advertisement
     * @author MyBatis Generator
     */
    int deleteByPrimaryKey(Long advertisementId);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: advertisement
     * @author MyBatis Generator
     */
    int insert(Advertisement record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: advertisement
     * @author MyBatis Generator
     */
    int insertSelective(Advertisement record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: advertisement
     * @author MyBatis Generator
     */
    List<Advertisement> selectByExample(AdvertisementExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: advertisement
     * @author MyBatis Generator
     */
    Advertisement selectByPrimaryKey(Long advertisementId);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: advertisement
     * @author MyBatis Generator
     */
    int updateByExampleSelective(@Param("record") Advertisement record, @Param("example") AdvertisementExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: advertisement
     * @author MyBatis Generator
     */
    int updateByExample(@Param("record") Advertisement record, @Param("example") AdvertisementExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: advertisement
     * @author MyBatis Generator
     */
    int updateByPrimaryKeySelective(Advertisement record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: advertisement
     * @author MyBatis Generator
     */
    int updateByPrimaryKey(Advertisement record);
}