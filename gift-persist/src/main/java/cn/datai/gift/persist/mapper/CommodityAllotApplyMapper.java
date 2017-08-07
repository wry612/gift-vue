package cn.datai.gift.persist.mapper;

import cn.datai.gift.persist.po.CommodityAllotApply;
import cn.datai.gift.persist.po.CommodityAllotApplyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommodityAllotApplyMapper {
    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_allot_apply
     * @author MyBatis Generator
     */
    int countByExample(CommodityAllotApplyExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_allot_apply
     * @author MyBatis Generator
     */
    int deleteByExample(CommodityAllotApplyExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_allot_apply
     * @author MyBatis Generator
     */
    int deleteByPrimaryKey(Long commodityAllotApply);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_allot_apply
     * @author MyBatis Generator
     */
    int insert(CommodityAllotApply record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_allot_apply
     * @author MyBatis Generator
     */
    int insertSelective(CommodityAllotApply record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_allot_apply
     * @author MyBatis Generator
     */
    List<CommodityAllotApply> selectByExample(CommodityAllotApplyExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_allot_apply
     * @author MyBatis Generator
     */
    CommodityAllotApply selectByPrimaryKey(Long commodityAllotApply);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_allot_apply
     * @author MyBatis Generator
     */
    int updateByExampleSelective(@Param("record") CommodityAllotApply record, @Param("example") CommodityAllotApplyExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_allot_apply
     * @author MyBatis Generator
     */
    int updateByExample(@Param("record") CommodityAllotApply record, @Param("example") CommodityAllotApplyExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_allot_apply
     * @author MyBatis Generator
     */
    int updateByPrimaryKeySelective(CommodityAllotApply record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_allot_apply
     * @author MyBatis Generator
     */
    int updateByPrimaryKey(CommodityAllotApply record);
}