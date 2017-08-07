package cn.datai.gift.persist.mapper;

import cn.datai.gift.persist.po.UserDeliveryInfo;
import cn.datai.gift.persist.po.UserDeliveryInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserDeliveryInfoMapper {
    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_delivery_info
     * @author MyBatis Generator
     */
    int countByExample(UserDeliveryInfoExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_delivery_info
     * @author MyBatis Generator
     */
    int deleteByExample(UserDeliveryInfoExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_delivery_info
     * @author MyBatis Generator
     */
    int deleteByPrimaryKey(Long userDeliveryInfoId);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_delivery_info
     * @author MyBatis Generator
     */
    int insert(UserDeliveryInfo record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_delivery_info
     * @author MyBatis Generator
     */
    int insertSelective(UserDeliveryInfo record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_delivery_info
     * @author MyBatis Generator
     */
    List<UserDeliveryInfo> selectByExample(UserDeliveryInfoExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_delivery_info
     * @author MyBatis Generator
     */
    UserDeliveryInfo selectByPrimaryKey(Long userDeliveryInfoId);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_delivery_info
     * @author MyBatis Generator
     */
    int updateByExampleSelective(@Param("record") UserDeliveryInfo record, @Param("example") UserDeliveryInfoExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_delivery_info
     * @author MyBatis Generator
     */
    int updateByExample(@Param("record") UserDeliveryInfo record, @Param("example") UserDeliveryInfoExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_delivery_info
     * @author MyBatis Generator
     */
    int updateByPrimaryKeySelective(UserDeliveryInfo record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_delivery_info
     * @author MyBatis Generator
     */
    int updateByPrimaryKey(UserDeliveryInfo record);
}