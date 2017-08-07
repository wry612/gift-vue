package cn.datai.gift.persist.mapper;

import cn.datai.gift.persist.po.CommodityContractExtend;
import cn.datai.gift.persist.po.CommodityContractExtendExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommodityContractExtendMapper {
    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_contract_extend
     * @author MyBatis Generator
     */
    int countByExample(CommodityContractExtendExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_contract_extend
     * @author MyBatis Generator
     */
    int deleteByExample(CommodityContractExtendExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_contract_extend
     * @author MyBatis Generator
     */
    int deleteByPrimaryKey(Long commodityContractId);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_contract_extend
     * @author MyBatis Generator
     */
    int insert(CommodityContractExtend record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_contract_extend
     * @author MyBatis Generator
     */
    int insertSelective(CommodityContractExtend record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_contract_extend
     * @author MyBatis Generator
     */
    List<CommodityContractExtend> selectByExample(CommodityContractExtendExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_contract_extend
     * @author MyBatis Generator
     */
    CommodityContractExtend selectByPrimaryKey(Long commodityContractId);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_contract_extend
     * @author MyBatis Generator
     */
    int updateByExampleSelective(@Param("record") CommodityContractExtend record, @Param("example") CommodityContractExtendExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_contract_extend
     * @author MyBatis Generator
     */
    int updateByExample(@Param("record") CommodityContractExtend record, @Param("example") CommodityContractExtendExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_contract_extend
     * @author MyBatis Generator
     */
    int updateByPrimaryKeySelective(CommodityContractExtend record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_contract_extend
     * @author MyBatis Generator
     */
    int updateByPrimaryKey(CommodityContractExtend record);
}