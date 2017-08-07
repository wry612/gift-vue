package cn.datai.gift.persist.mapper;

import cn.datai.gift.persist.po.GiftAccount;
import cn.datai.gift.persist.po.GiftAccountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GiftAccountMapper {
    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: gift_account
     * @author MyBatis Generator
     */
    int countByExample(GiftAccountExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: gift_account
     * @author MyBatis Generator
     */
    int deleteByExample(GiftAccountExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: gift_account
     * @author MyBatis Generator
     */
    int deleteByPrimaryKey(Long giftAccountId);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: gift_account
     * @author MyBatis Generator
     */
    int insert(GiftAccount record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: gift_account
     * @author MyBatis Generator
     */
    int insertSelective(GiftAccount record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: gift_account
     * @author MyBatis Generator
     */
    List<GiftAccount> selectByExample(GiftAccountExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: gift_account
     * @author MyBatis Generator
     */
    GiftAccount selectByPrimaryKey(Long giftAccountId);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: gift_account
     * @author MyBatis Generator
     */
    int updateByExampleSelective(@Param("record") GiftAccount record, @Param("example") GiftAccountExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: gift_account
     * @author MyBatis Generator
     */
    int updateByExample(@Param("record") GiftAccount record, @Param("example") GiftAccountExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: gift_account
     * @author MyBatis Generator
     */
    int updateByPrimaryKeySelective(GiftAccount record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: gift_account
     * @author MyBatis Generator
     */
    int updateByPrimaryKey(GiftAccount record);
}