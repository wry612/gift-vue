package cn.datai.gift.persist.mapper;

import cn.datai.gift.persist.po.ConvertObj;
import cn.datai.gift.persist.po.ConvertObjExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConvertObjMapper {
    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_obj
     * @author MyBatis Generator
     */
    int countByExample(ConvertObjExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_obj
     * @author MyBatis Generator
     */
    int deleteByExample(ConvertObjExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_obj
     * @author MyBatis Generator
     */
    int deleteByPrimaryKey(Long convertObjId);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_obj
     * @author MyBatis Generator
     */
    int insert(ConvertObj record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_obj
     * @author MyBatis Generator
     */
    int insertSelective(ConvertObj record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_obj
     * @author MyBatis Generator
     */
    List<ConvertObj> selectByExample(ConvertObjExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_obj
     * @author MyBatis Generator
     */
    ConvertObj selectByPrimaryKey(Long convertObjId);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_obj
     * @author MyBatis Generator
     */
    int updateByExampleSelective(@Param("record") ConvertObj record, @Param("example") ConvertObjExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_obj
     * @author MyBatis Generator
     */
    int updateByExample(@Param("record") ConvertObj record, @Param("example") ConvertObjExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_obj
     * @author MyBatis Generator
     */
    int updateByPrimaryKeySelective(ConvertObj record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_obj
     * @author MyBatis Generator
     */
    int updateByPrimaryKey(ConvertObj record);
}