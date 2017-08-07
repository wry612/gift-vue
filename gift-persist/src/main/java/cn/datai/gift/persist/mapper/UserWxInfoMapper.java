package cn.datai.gift.persist.mapper;

import cn.datai.gift.persist.po.UserWxInfo;
import cn.datai.gift.persist.po.UserWxInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserWxInfoMapper {
    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_wx_info
     * @author MyBatis Generator
     */
    int countByExample(UserWxInfoExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_wx_info
     * @author MyBatis Generator
     */
    int deleteByExample(UserWxInfoExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_wx_info
     * @author MyBatis Generator
     */
    int deleteByPrimaryKey(@Param("openid") String openid, @Param("unionid") String unionid);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_wx_info
     * @author MyBatis Generator
     */
    int insert(UserWxInfo record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_wx_info
     * @author MyBatis Generator
     */
    int insertSelective(UserWxInfo record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_wx_info
     * @author MyBatis Generator
     */
    List<UserWxInfo> selectByExample(UserWxInfoExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_wx_info
     * @author MyBatis Generator
     */
    UserWxInfo selectByPrimaryKey(@Param("openid") String openid, @Param("unionid") String unionid);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_wx_info
     * @author MyBatis Generator
     */
    int updateByExampleSelective(@Param("record") UserWxInfo record, @Param("example") UserWxInfoExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_wx_info
     * @author MyBatis Generator
     */
    int updateByExample(@Param("record") UserWxInfo record, @Param("example") UserWxInfoExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_wx_info
     * @author MyBatis Generator
     */
    int updateByPrimaryKeySelective(UserWxInfo record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_wx_info
     * @author MyBatis Generator
     */
    int updateByPrimaryKey(UserWxInfo record);
}