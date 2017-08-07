package cn.datai.gift.persist.mapper;

import cn.datai.gift.persist.po.OperatorReltGiftAccount;
import cn.datai.gift.persist.po.OperatorReltGiftAccountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OperatorReltGiftAccountMapper {
    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: operator_relt_gift_account
     * @author MyBatis Generator
     */
    int countByExample(OperatorReltGiftAccountExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: operator_relt_gift_account
     * @author MyBatis Generator
     */
    int deleteByExample(OperatorReltGiftAccountExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: operator_relt_gift_account
     * @author MyBatis Generator
     */
    int deleteByPrimaryKey(@Param("operatorInfoId") Long operatorInfoId, @Param("giftAccountId") Long giftAccountId);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: operator_relt_gift_account
     * @author MyBatis Generator
     */
    int insert(OperatorReltGiftAccount record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: operator_relt_gift_account
     * @author MyBatis Generator
     */
    int insertSelective(OperatorReltGiftAccount record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: operator_relt_gift_account
     * @author MyBatis Generator
     */
    List<OperatorReltGiftAccount> selectByExample(OperatorReltGiftAccountExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: operator_relt_gift_account
     * @author MyBatis Generator
     */
    OperatorReltGiftAccount selectByPrimaryKey(@Param("operatorInfoId") Long operatorInfoId, @Param("giftAccountId") Long giftAccountId);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: operator_relt_gift_account
     * @author MyBatis Generator
     */
    int updateByExampleSelective(@Param("record") OperatorReltGiftAccount record, @Param("example") OperatorReltGiftAccountExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: operator_relt_gift_account
     * @author MyBatis Generator
     */
    int updateByExample(@Param("record") OperatorReltGiftAccount record, @Param("example") OperatorReltGiftAccountExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: operator_relt_gift_account
     * @author MyBatis Generator
     */
    int updateByPrimaryKeySelective(OperatorReltGiftAccount record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: operator_relt_gift_account
     * @author MyBatis Generator
     */
    int updateByPrimaryKey(OperatorReltGiftAccount record);
}