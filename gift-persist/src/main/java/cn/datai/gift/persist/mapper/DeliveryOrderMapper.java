package cn.datai.gift.persist.mapper;

import cn.datai.gift.persist.po.DeliveryOrder;
import cn.datai.gift.persist.po.DeliveryOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeliveryOrderMapper {
    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: delivery_order
     * @author MyBatis Generator
     */
    int countByExample(DeliveryOrderExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: delivery_order
     * @author MyBatis Generator
     */
    int deleteByExample(DeliveryOrderExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: delivery_order
     * @author MyBatis Generator
     */
    int deleteByPrimaryKey(Long deliveryOrderId);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: delivery_order
     * @author MyBatis Generator
     */
    int insert(DeliveryOrder record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: delivery_order
     * @author MyBatis Generator
     */
    int insertSelective(DeliveryOrder record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: delivery_order
     * @author MyBatis Generator
     */
    List<DeliveryOrder> selectByExample(DeliveryOrderExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: delivery_order
     * @author MyBatis Generator
     */
    DeliveryOrder selectByPrimaryKey(Long deliveryOrderId);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: delivery_order
     * @author MyBatis Generator
     */
    int updateByExampleSelective(@Param("record") DeliveryOrder record, @Param("example") DeliveryOrderExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: delivery_order
     * @author MyBatis Generator
     */
    int updateByExample(@Param("record") DeliveryOrder record, @Param("example") DeliveryOrderExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: delivery_order
     * @author MyBatis Generator
     */
    int updateByPrimaryKeySelective(DeliveryOrder record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: delivery_order
     * @author MyBatis Generator
     */
    int updateByPrimaryKey(DeliveryOrder record);
}