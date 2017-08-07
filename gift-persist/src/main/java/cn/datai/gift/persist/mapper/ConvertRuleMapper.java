package cn.datai.gift.persist.mapper;

import cn.datai.gift.persist.po.ConvertRule;
import cn.datai.gift.persist.po.ConvertRuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConvertRuleMapper {
    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_rule
     * @author MyBatis Generator
     */
    int countByExample(ConvertRuleExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_rule
     * @author MyBatis Generator
     */
    int deleteByExample(ConvertRuleExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_rule
     * @author MyBatis Generator
     */
    int deleteByPrimaryKey(@Param("convertObjId") Long convertObjId, @Param("commodityContractId") Long commodityContractId);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_rule
     * @author MyBatis Generator
     */
    int insert(ConvertRule record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_rule
     * @author MyBatis Generator
     */
    int insertSelective(ConvertRule record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_rule
     * @author MyBatis Generator
     */
    List<ConvertRule> selectByExample(ConvertRuleExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_rule
     * @author MyBatis Generator
     */
    ConvertRule selectByPrimaryKey(@Param("convertObjId") Long convertObjId, @Param("commodityContractId") Long commodityContractId);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_rule
     * @author MyBatis Generator
     */
    int updateByExampleSelective(@Param("record") ConvertRule record, @Param("example") ConvertRuleExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_rule
     * @author MyBatis Generator
     */
    int updateByExample(@Param("record") ConvertRule record, @Param("example") ConvertRuleExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_rule
     * @author MyBatis Generator
     */
    int updateByPrimaryKeySelective(ConvertRule record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_rule
     * @author MyBatis Generator
     */
    int updateByPrimaryKey(ConvertRule record);
}