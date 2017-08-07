package cn.datai.gift.persist.mapper;

import cn.datai.gift.persist.po.MemberInfo;
import cn.datai.gift.persist.po.MemberInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberInfoMapper {
    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: member_info
     * @author MyBatis Generator
     */
    int countByExample(MemberInfoExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: member_info
     * @author MyBatis Generator
     */
    int deleteByExample(MemberInfoExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: member_info
     * @author MyBatis Generator
     */
    int deleteByPrimaryKey(Long memberInfoId);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: member_info
     * @author MyBatis Generator
     */
    int insert(MemberInfo record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: member_info
     * @author MyBatis Generator
     */
    int insertSelective(MemberInfo record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: member_info
     * @author MyBatis Generator
     */
    List<MemberInfo> selectByExample(MemberInfoExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: member_info
     * @author MyBatis Generator
     */
    MemberInfo selectByPrimaryKey(Long memberInfoId);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: member_info
     * @author MyBatis Generator
     */
    int updateByExampleSelective(@Param("record") MemberInfo record, @Param("example") MemberInfoExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: member_info
     * @author MyBatis Generator
     */
    int updateByExample(@Param("record") MemberInfo record, @Param("example") MemberInfoExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: member_info
     * @author MyBatis Generator
     */
    int updateByPrimaryKeySelective(MemberInfo record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: member_info
     * @author MyBatis Generator
     */
    int updateByPrimaryKey(MemberInfo record);
}