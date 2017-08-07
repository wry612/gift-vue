package cn.datai.gift.persist.mapper;

import cn.datai.gift.persist.po.OperatorInfo;
import cn.datai.gift.persist.po.OperatorInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OperatorInfoMapper {
    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: operator_info
     * @author MyBatis Generator
     */
    int countByExample(OperatorInfoExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: operator_info
     * @author MyBatis Generator
     */
    int deleteByExample(OperatorInfoExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: operator_info
     * @author MyBatis Generator
     */
    int deleteByPrimaryKey(Long operatorInfoId);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: operator_info
     * @author MyBatis Generator
     */
    int insert(OperatorInfo record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: operator_info
     * @author MyBatis Generator
     */
    int insertSelective(OperatorInfo record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: operator_info
     * @author MyBatis Generator
     */
    List<OperatorInfo> selectByExample(OperatorInfoExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: operator_info
     * @author MyBatis Generator
     */
    OperatorInfo selectByPrimaryKey(Long operatorInfoId);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: operator_info
     * @author MyBatis Generator
     */
    int updateByExampleSelective(@Param("record") OperatorInfo record, @Param("example") OperatorInfoExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: operator_info
     * @author MyBatis Generator
     */
    int updateByExample(@Param("record") OperatorInfo record, @Param("example") OperatorInfoExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: operator_info
     * @author MyBatis Generator
     */
    int updateByPrimaryKeySelective(OperatorInfo record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: operator_info
     * @author MyBatis Generator
     */
    int updateByPrimaryKey(OperatorInfo record);
}