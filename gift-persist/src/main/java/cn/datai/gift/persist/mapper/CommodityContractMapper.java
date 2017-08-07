package cn.datai.gift.persist.mapper;

import cn.datai.gift.persist.po.CommodityContract;
import cn.datai.gift.persist.po.CommodityContractExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommodityContractMapper {
    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_contract
     * @author MyBatis Generator
     */
    int countByExample(CommodityContractExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_contract
     * @author MyBatis Generator
     */
    int deleteByExample(CommodityContractExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_contract
     * @author MyBatis Generator
     */
    int deleteByPrimaryKey(Long commodityContractId);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_contract
     * @author MyBatis Generator
     */
    int insert(CommodityContract record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_contract
     * @author MyBatis Generator
     */
    int insertSelective(CommodityContract record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_contract
     * @author MyBatis Generator
     */
    List<CommodityContract> selectByExample(CommodityContractExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_contract
     * @author MyBatis Generator
     */
    CommodityContract selectByPrimaryKey(Long commodityContractId);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_contract
     * @author MyBatis Generator
     */
    int updateByExampleSelective(@Param("record") CommodityContract record, @Param("example") CommodityContractExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_contract
     * @author MyBatis Generator
     */
    int updateByExample(@Param("record") CommodityContract record, @Param("example") CommodityContractExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_contract
     * @author MyBatis Generator
     */
    int updateByPrimaryKeySelective(CommodityContract record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_contract
     * @author MyBatis Generator
     */
    int updateByPrimaryKey(CommodityContract record);
}