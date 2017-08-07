package cn.datai.gift.persist.mapper;

import cn.datai.gift.persist.po.ActivityPresent;
import cn.datai.gift.persist.po.ActivityPresentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActivityPresentMapper {
    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: activity_present
     * @author MyBatis Generator
     */
    int countByExample(ActivityPresentExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: activity_present
     * @author MyBatis Generator
     */
    int deleteByExample(ActivityPresentExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: activity_present
     * @author MyBatis Generator
     */
    int deleteByPrimaryKey(Long activityPresentId);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: activity_present
     * @author MyBatis Generator
     */
    int insert(ActivityPresent record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: activity_present
     * @author MyBatis Generator
     */
    int insertSelective(ActivityPresent record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: activity_present
     * @author MyBatis Generator
     */
    List<ActivityPresent> selectByExample(ActivityPresentExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: activity_present
     * @author MyBatis Generator
     */
    ActivityPresent selectByPrimaryKey(Long activityPresentId);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: activity_present
     * @author MyBatis Generator
     */
    int updateByExampleSelective(@Param("record") ActivityPresent record, @Param("example") ActivityPresentExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: activity_present
     * @author MyBatis Generator
     */
    int updateByExample(@Param("record") ActivityPresent record, @Param("example") ActivityPresentExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: activity_present
     * @author MyBatis Generator
     */
    int updateByPrimaryKeySelective(ActivityPresent record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: activity_present
     * @author MyBatis Generator
     */
    int updateByPrimaryKey(ActivityPresent record);
}