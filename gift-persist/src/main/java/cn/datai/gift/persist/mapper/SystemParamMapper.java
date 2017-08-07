package cn.datai.gift.persist.mapper;

import cn.datai.gift.persist.po.SystemParam;
import cn.datai.gift.persist.po.SystemParamExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SystemParamMapper {
    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: system_param
     * @author MyBatis Generator
     */
    int countByExample(SystemParamExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: system_param
     * @author MyBatis Generator
     */
    int deleteByExample(SystemParamExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: system_param
     * @author MyBatis Generator
     */
    int deleteByPrimaryKey(Integer systemParamId);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: system_param
     * @author MyBatis Generator
     */
    int insert(SystemParam record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: system_param
     * @author MyBatis Generator
     */
    int insertSelective(SystemParam record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: system_param
     * @author MyBatis Generator
     */
    List<SystemParam> selectByExample(SystemParamExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: system_param
     * @author MyBatis Generator
     */
    SystemParam selectByPrimaryKey(Integer systemParamId);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: system_param
     * @author MyBatis Generator
     */
    int updateByExampleSelective(@Param("record") SystemParam record, @Param("example") SystemParamExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: system_param
     * @author MyBatis Generator
     */
    int updateByExample(@Param("record") SystemParam record, @Param("example") SystemParamExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: system_param
     * @author MyBatis Generator
     */
    int updateByPrimaryKeySelective(SystemParam record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: system_param
     * @author MyBatis Generator
     */
    int updateByPrimaryKey(SystemParam record);
}