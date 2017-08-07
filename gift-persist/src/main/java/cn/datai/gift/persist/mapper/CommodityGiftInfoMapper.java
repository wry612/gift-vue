package cn.datai.gift.persist.mapper;

import cn.datai.gift.persist.po.CommodityGiftInfo;
import cn.datai.gift.persist.po.CommodityGiftInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommodityGiftInfoMapper {
    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_gift_info
     * @author MyBatis Generator
     */
    int countByExample(CommodityGiftInfoExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_gift_info
     * @author MyBatis Generator
     */
    int deleteByExample(CommodityGiftInfoExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_gift_info
     * @author MyBatis Generator
     */
    int deleteByPrimaryKey(Long commodityGiftInfoId);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_gift_info
     * @author MyBatis Generator
     */
    int insert(CommodityGiftInfo record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_gift_info
     * @author MyBatis Generator
     */
    int insertSelective(CommodityGiftInfo record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_gift_info
     * @author MyBatis Generator
     */
    List<CommodityGiftInfo> selectByExample(CommodityGiftInfoExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_gift_info
     * @author MyBatis Generator
     */
    CommodityGiftInfo selectByPrimaryKey(Long commodityGiftInfoId);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_gift_info
     * @author MyBatis Generator
     */
    int updateByExampleSelective(@Param("record") CommodityGiftInfo record, @Param("example") CommodityGiftInfoExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_gift_info
     * @author MyBatis Generator
     */
    int updateByExample(@Param("record") CommodityGiftInfo record, @Param("example") CommodityGiftInfoExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_gift_info
     * @author MyBatis Generator
     */
    int updateByPrimaryKeySelective(CommodityGiftInfo record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_gift_info
     * @author MyBatis Generator
     */
    int updateByPrimaryKey(CommodityGiftInfo record);
}