package cn.datai.gift.persist.mapper;

import cn.datai.gift.persist.po.UserInfo;
import cn.datai.gift.persist.po.UserInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserInfoMapper {
    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_info
     * @author MyBatis Generator
     */
    int countByExample(UserInfoExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_info
     * @author MyBatis Generator
     */
    int deleteByExample(UserInfoExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_info
     * @author MyBatis Generator
     */
    int deleteByPrimaryKey(Long userInfoId);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_info
     * @author MyBatis Generator
     */
    int insert(UserInfo record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_info
     * @author MyBatis Generator
     */
    int insertSelective(UserInfo record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_info
     * @author MyBatis Generator
     */
    List<UserInfo> selectByExample(UserInfoExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_info
     * @author MyBatis Generator
     */
    UserInfo selectByPrimaryKey(Long userInfoId);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_info
     * @author MyBatis Generator
     */
    int updateByExampleSelective(@Param("record") UserInfo record, @Param("example") UserInfoExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_info
     * @author MyBatis Generator
     */
    int updateByExample(@Param("record") UserInfo record, @Param("example") UserInfoExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_info
     * @author MyBatis Generator
     */
    int updateByPrimaryKeySelective(UserInfo record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_info
     * @author MyBatis Generator
     */
    int updateByPrimaryKey(UserInfo record);
}