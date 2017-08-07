package cn.datai.gift.persist.mapper;

import cn.datai.gift.persist.po.ConvertObjOrder;
import cn.datai.gift.persist.po.ConvertObjOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConvertObjOrderMapper {
    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_obj_order
     * @author MyBatis Generator
     */
    int countByExample(ConvertObjOrderExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_obj_order
     * @author MyBatis Generator
     */
    int deleteByExample(ConvertObjOrderExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_obj_order
     * @author MyBatis Generator
     */
    int deleteByPrimaryKey(Long convertObjOrderId);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_obj_order
     * @author MyBatis Generator
     */
    int insert(ConvertObjOrder record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_obj_order
     * @author MyBatis Generator
     */
    int insertSelective(ConvertObjOrder record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_obj_order
     * @author MyBatis Generator
     */
    List<ConvertObjOrder> selectByExample(ConvertObjOrderExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_obj_order
     * @author MyBatis Generator
     */
    ConvertObjOrder selectByPrimaryKey(Long convertObjOrderId);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_obj_order
     * @author MyBatis Generator
     */
    int updateByExampleSelective(@Param("record") ConvertObjOrder record, @Param("example") ConvertObjOrderExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_obj_order
     * @author MyBatis Generator
     */
    int updateByExample(@Param("record") ConvertObjOrder record, @Param("example") ConvertObjOrderExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_obj_order
     * @author MyBatis Generator
     */
    int updateByPrimaryKeySelective(ConvertObjOrder record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_obj_order
     * @author MyBatis Generator
     */
    int updateByPrimaryKey(ConvertObjOrder record);
}