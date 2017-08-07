package cn.datai.gift.persist.mapper;

import cn.datai.gift.persist.po.UserReltGiftAccount;
import cn.datai.gift.persist.po.UserReltGiftAccountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserReltGiftAccountMapper {
    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_relt_gift_account
     * @author MyBatis Generator
     */
    int countByExample(UserReltGiftAccountExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_relt_gift_account
     * @author MyBatis Generator
     */
    int deleteByExample(UserReltGiftAccountExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_relt_gift_account
     * @author MyBatis Generator
     */
    int deleteByPrimaryKey(@Param("userInfoId") Long userInfoId, @Param("giftAccountId") Long giftAccountId);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_relt_gift_account
     * @author MyBatis Generator
     */
    int insert(UserReltGiftAccount record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_relt_gift_account
     * @author MyBatis Generator
     */
    int insertSelective(UserReltGiftAccount record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_relt_gift_account
     * @author MyBatis Generator
     */
    List<UserReltGiftAccount> selectByExample(UserReltGiftAccountExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_relt_gift_account
     * @author MyBatis Generator
     */
    UserReltGiftAccount selectByPrimaryKey(@Param("userInfoId") Long userInfoId, @Param("giftAccountId") Long giftAccountId);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_relt_gift_account
     * @author MyBatis Generator
     */
    int updateByExampleSelective(@Param("record") UserReltGiftAccount record, @Param("example") UserReltGiftAccountExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_relt_gift_account
     * @author MyBatis Generator
     */
    int updateByExample(@Param("record") UserReltGiftAccount record, @Param("example") UserReltGiftAccountExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_relt_gift_account
     * @author MyBatis Generator
     */
    int updateByPrimaryKeySelective(UserReltGiftAccount record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_relt_gift_account
     * @author MyBatis Generator
     */
    int updateByPrimaryKey(UserReltGiftAccount record);
}