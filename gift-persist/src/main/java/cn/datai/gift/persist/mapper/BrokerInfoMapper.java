package cn.datai.gift.persist.mapper;

import cn.datai.gift.persist.po.BrokerInfo;
import cn.datai.gift.persist.po.BrokerInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BrokerInfoMapper {
    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: broker_info
     * @author MyBatis Generator
     */
    int countByExample(BrokerInfoExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: broker_info
     * @author MyBatis Generator
     */
    int deleteByExample(BrokerInfoExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: broker_info
     * @author MyBatis Generator
     */
    int deleteByPrimaryKey(Long userInfoId);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: broker_info
     * @author MyBatis Generator
     */
    int insert(BrokerInfo record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: broker_info
     * @author MyBatis Generator
     */
    int insertSelective(BrokerInfo record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: broker_info
     * @author MyBatis Generator
     */
    List<BrokerInfo> selectByExample(BrokerInfoExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: broker_info
     * @author MyBatis Generator
     */
    BrokerInfo selectByPrimaryKey(Long userInfoId);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: broker_info
     * @author MyBatis Generator
     */
    int updateByExampleSelective(@Param("record") BrokerInfo record, @Param("example") BrokerInfoExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: broker_info
     * @author MyBatis Generator
     */
    int updateByExample(@Param("record") BrokerInfo record, @Param("example") BrokerInfoExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: broker_info
     * @author MyBatis Generator
     */
    int updateByPrimaryKeySelective(BrokerInfo record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: broker_info
     * @author MyBatis Generator
     */
    int updateByPrimaryKey(BrokerInfo record);
}