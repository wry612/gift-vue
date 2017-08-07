package cn.datai.gift.persist.mapper;

import cn.datai.gift.persist.po.UserBizBrief;
import cn.datai.gift.persist.po.UserBizBriefExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserBizBriefMapper {
    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_biz_brief
     * @author MyBatis Generator
     */
    int countByExample(UserBizBriefExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_biz_brief
     * @author MyBatis Generator
     */
    int deleteByExample(UserBizBriefExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_biz_brief
     * @author MyBatis Generator
     */
    int deleteByPrimaryKey(Long userlBizBriefId);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_biz_brief
     * @author MyBatis Generator
     */
    int insert(UserBizBrief record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_biz_brief
     * @author MyBatis Generator
     */
    int insertSelective(UserBizBrief record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_biz_brief
     * @author MyBatis Generator
     */
    List<UserBizBrief> selectByExample(UserBizBriefExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_biz_brief
     * @author MyBatis Generator
     */
    UserBizBrief selectByPrimaryKey(Long userlBizBriefId);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_biz_brief
     * @author MyBatis Generator
     */
    int updateByExampleSelective(@Param("record") UserBizBrief record, @Param("example") UserBizBriefExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_biz_brief
     * @author MyBatis Generator
     */
    int updateByExample(@Param("record") UserBizBrief record, @Param("example") UserBizBriefExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_biz_brief
     * @author MyBatis Generator
     */
    int updateByPrimaryKeySelective(UserBizBrief record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_biz_brief
     * @author MyBatis Generator
     */
    int updateByPrimaryKey(UserBizBrief record);
}