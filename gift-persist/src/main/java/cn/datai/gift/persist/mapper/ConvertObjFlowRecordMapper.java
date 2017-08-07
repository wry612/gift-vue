package cn.datai.gift.persist.mapper;

import cn.datai.gift.persist.po.ConvertObjFlowRecord;
import cn.datai.gift.persist.po.ConvertObjFlowRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConvertObjFlowRecordMapper {
    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_obj_flow_record
     * @author MyBatis Generator
     */
    int countByExample(ConvertObjFlowRecordExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_obj_flow_record
     * @author MyBatis Generator
     */
    int deleteByExample(ConvertObjFlowRecordExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_obj_flow_record
     * @author MyBatis Generator
     */
    int deleteByPrimaryKey(Long convertObjFlowRecordId);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_obj_flow_record
     * @author MyBatis Generator
     */
    int insert(ConvertObjFlowRecord record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_obj_flow_record
     * @author MyBatis Generator
     */
    int insertSelective(ConvertObjFlowRecord record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_obj_flow_record
     * @author MyBatis Generator
     */
    List<ConvertObjFlowRecord> selectByExample(ConvertObjFlowRecordExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_obj_flow_record
     * @author MyBatis Generator
     */
    ConvertObjFlowRecord selectByPrimaryKey(Long convertObjFlowRecordId);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_obj_flow_record
     * @author MyBatis Generator
     */
    int updateByExampleSelective(@Param("record") ConvertObjFlowRecord record, @Param("example") ConvertObjFlowRecordExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_obj_flow_record
     * @author MyBatis Generator
     */
    int updateByExample(@Param("record") ConvertObjFlowRecord record, @Param("example") ConvertObjFlowRecordExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_obj_flow_record
     * @author MyBatis Generator
     */
    int updateByPrimaryKeySelective(ConvertObjFlowRecord record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_obj_flow_record
     * @author MyBatis Generator
     */
    int updateByPrimaryKey(ConvertObjFlowRecord record);
}