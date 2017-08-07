package cn.datai.gift.persist.mapper;

import cn.datai.gift.persist.po.CommodityPriceHistory;
import cn.datai.gift.persist.po.CommodityPriceHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommodityPriceHistoryMapper {
    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_price_history
     * @author MyBatis Generator
     */
    int countByExample(CommodityPriceHistoryExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_price_history
     * @author MyBatis Generator
     */
    int deleteByExample(CommodityPriceHistoryExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_price_history
     * @author MyBatis Generator
     */
    int deleteByPrimaryKey(Long commodityPriceHistoryId);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_price_history
     * @author MyBatis Generator
     */
    int insert(CommodityPriceHistory record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_price_history
     * @author MyBatis Generator
     */
    int insertSelective(CommodityPriceHistory record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_price_history
     * @author MyBatis Generator
     */
    List<CommodityPriceHistory> selectByExample(CommodityPriceHistoryExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_price_history
     * @author MyBatis Generator
     */
    CommodityPriceHistory selectByPrimaryKey(Long commodityPriceHistoryId);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_price_history
     * @author MyBatis Generator
     */
    int updateByExampleSelective(@Param("record") CommodityPriceHistory record, @Param("example") CommodityPriceHistoryExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_price_history
     * @author MyBatis Generator
     */
    int updateByExample(@Param("record") CommodityPriceHistory record, @Param("example") CommodityPriceHistoryExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_price_history
     * @author MyBatis Generator
     */
    int updateByPrimaryKeySelective(CommodityPriceHistory record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_price_history
     * @author MyBatis Generator
     */
    int updateByPrimaryKey(CommodityPriceHistory record);
}