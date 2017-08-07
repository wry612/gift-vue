package cn.datai.gift.persist.mapper;

import cn.datai.gift.persist.po.CommodityPrice;
import cn.datai.gift.persist.po.CommodityPriceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommodityPriceMapper {
    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_price
     * @author MyBatis Generator
     */
    int countByExample(CommodityPriceExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_price
     * @author MyBatis Generator
     */
    int deleteByExample(CommodityPriceExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_price
     * @author MyBatis Generator
     */
    int deleteByPrimaryKey(Long commodityContractId);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_price
     * @author MyBatis Generator
     */
    int insert(CommodityPrice record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_price
     * @author MyBatis Generator
     */
    int insertSelective(CommodityPrice record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_price
     * @author MyBatis Generator
     */
    List<CommodityPrice> selectByExample(CommodityPriceExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_price
     * @author MyBatis Generator
     */
    CommodityPrice selectByPrimaryKey(Long commodityContractId);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_price
     * @author MyBatis Generator
     */
    int updateByExampleSelective(@Param("record") CommodityPrice record, @Param("example") CommodityPriceExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_price
     * @author MyBatis Generator
     */
    int updateByExample(@Param("record") CommodityPrice record, @Param("example") CommodityPriceExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_price
     * @author MyBatis Generator
     */
    int updateByPrimaryKeySelective(CommodityPrice record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_price
     * @author MyBatis Generator
     */
    int updateByPrimaryKey(CommodityPrice record);
}