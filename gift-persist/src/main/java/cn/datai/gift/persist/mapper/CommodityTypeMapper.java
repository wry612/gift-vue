package cn.datai.gift.persist.mapper;

import cn.datai.gift.persist.po.CommodityType;
import cn.datai.gift.persist.po.CommodityTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommodityTypeMapper {
    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_type
     * @author MyBatis Generator
     */
    int countByExample(CommodityTypeExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_type
     * @author MyBatis Generator
     */
    int deleteByExample(CommodityTypeExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_type
     * @author MyBatis Generator
     */
    int deleteByPrimaryKey(Long commodityTypeId);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_type
     * @author MyBatis Generator
     */
    int insert(CommodityType record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_type
     * @author MyBatis Generator
     */
    int insertSelective(CommodityType record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_type
     * @author MyBatis Generator
     */
    List<CommodityType> selectByExample(CommodityTypeExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_type
     * @author MyBatis Generator
     */
    CommodityType selectByPrimaryKey(Long commodityTypeId);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_type
     * @author MyBatis Generator
     */
    int updateByExampleSelective(@Param("record") CommodityType record, @Param("example") CommodityTypeExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_type
     * @author MyBatis Generator
     */
    int updateByExample(@Param("record") CommodityType record, @Param("example") CommodityTypeExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_type
     * @author MyBatis Generator
     */
    int updateByPrimaryKeySelective(CommodityType record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_type
     * @author MyBatis Generator
     */
    int updateByPrimaryKey(CommodityType record);
}