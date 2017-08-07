package cn.datai.gift.persist.mapper;

import cn.datai.gift.persist.po.UserWxRelt;
import cn.datai.gift.persist.po.UserWxReltExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserWxReltMapper {
    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_wx_relt
     * @author MyBatis Generator
     */
    int countByExample(UserWxReltExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_wx_relt
     * @author MyBatis Generator
     */
    int deleteByExample(UserWxReltExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_wx_relt
     * @author MyBatis Generator
     */
    int deleteByPrimaryKey(@Param("userInfoId") Long userInfoId, @Param("unionid") String unionid);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_wx_relt
     * @author MyBatis Generator
     */
    int insert(UserWxRelt record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_wx_relt
     * @author MyBatis Generator
     */
    int insertSelective(UserWxRelt record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_wx_relt
     * @author MyBatis Generator
     */
    List<UserWxRelt> selectByExample(UserWxReltExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_wx_relt
     * @author MyBatis Generator
     */
    UserWxRelt selectByPrimaryKey(@Param("userInfoId") Long userInfoId, @Param("unionid") String unionid);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_wx_relt
     * @author MyBatis Generator
     */
    int updateByExampleSelective(@Param("record") UserWxRelt record, @Param("example") UserWxReltExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_wx_relt
     * @author MyBatis Generator
     */
    int updateByExample(@Param("record") UserWxRelt record, @Param("example") UserWxReltExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_wx_relt
     * @author MyBatis Generator
     */
    int updateByPrimaryKeySelective(UserWxRelt record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_wx_relt
     * @author MyBatis Generator
     */
    int updateByPrimaryKey(UserWxRelt record);
}