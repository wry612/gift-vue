package cn.datai.gift.persist.mapper;

import cn.datai.gift.persist.po.CommodityFlowRecord;
import cn.datai.gift.persist.po.CommodityFlowRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommodityFlowRecordMapper {
    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_flow_record
     * @author MyBatis Generator
     */
    int countByExample(CommodityFlowRecordExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_flow_record
     * @author MyBatis Generator
     */
    int deleteByExample(CommodityFlowRecordExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_flow_record
     * @author MyBatis Generator
     */
    int deleteByPrimaryKey(Long commodityFlowRecordId);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_flow_record
     * @author MyBatis Generator
     */
    int insert(CommodityFlowRecord record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_flow_record
     * @author MyBatis Generator
     */
    int insertSelective(CommodityFlowRecord record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_flow_record
     * @author MyBatis Generator
     */
    List<CommodityFlowRecord> selectByExample(CommodityFlowRecordExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_flow_record
     * @author MyBatis Generator
     */
    CommodityFlowRecord selectByPrimaryKey(Long commodityFlowRecordId);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_flow_record
     * @author MyBatis Generator
     */
    int updateByExampleSelective(@Param("record") CommodityFlowRecord record, @Param("example") CommodityFlowRecordExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_flow_record
     * @author MyBatis Generator
     */
    int updateByExample(@Param("record") CommodityFlowRecord record, @Param("example") CommodityFlowRecordExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_flow_record
     * @author MyBatis Generator
     */
    int updateByPrimaryKeySelective(CommodityFlowRecord record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_flow_record
     * @author MyBatis Generator
     */
    int updateByPrimaryKey(CommodityFlowRecord record);
}