package cn.datai.gift.persist.mapper;

import cn.datai.gift.persist.po.SpecUserInfo;
import cn.datai.gift.persist.po.SpecUserInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpecUserInfoMapper {
    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: spec_user_info
     * @author MyBatis Generator
     */
    int countByExample(SpecUserInfoExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: spec_user_info
     * @author MyBatis Generator
     */
    int deleteByExample(SpecUserInfoExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: spec_user_info
     * @author MyBatis Generator
     */
    int deleteByPrimaryKey(Long userInfoId);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: spec_user_info
     * @author MyBatis Generator
     */
    int insert(SpecUserInfo record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: spec_user_info
     * @author MyBatis Generator
     */
    int insertSelective(SpecUserInfo record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: spec_user_info
     * @author MyBatis Generator
     */
    List<SpecUserInfo> selectByExample(SpecUserInfoExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: spec_user_info
     * @author MyBatis Generator
     */
    SpecUserInfo selectByPrimaryKey(Long userInfoId);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: spec_user_info
     * @author MyBatis Generator
     */
    int updateByExampleSelective(@Param("record") SpecUserInfo record, @Param("example") SpecUserInfoExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: spec_user_info
     * @author MyBatis Generator
     */
    int updateByExample(@Param("record") SpecUserInfo record, @Param("example") SpecUserInfoExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: spec_user_info
     * @author MyBatis Generator
     */
    int updateByPrimaryKeySelective(SpecUserInfo record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: spec_user_info
     * @author MyBatis Generator
     */
    int updateByPrimaryKey(SpecUserInfo record);
}