package cn.datai.gift.persist.mapper;

import cn.datai.gift.persist.po.RefundOrderWx;
import cn.datai.gift.persist.po.RefundOrderWxExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RefundOrderWxMapper {
    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: refund_order_wx
     * @author MyBatis Generator
     */
    int countByExample(RefundOrderWxExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: refund_order_wx
     * @author MyBatis Generator
     */
    int deleteByExample(RefundOrderWxExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: refund_order_wx
     * @author MyBatis Generator
     */
    int deleteByPrimaryKey(String outRefundNo);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: refund_order_wx
     * @author MyBatis Generator
     */
    int insert(RefundOrderWx record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: refund_order_wx
     * @author MyBatis Generator
     */
    int insertSelective(RefundOrderWx record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: refund_order_wx
     * @author MyBatis Generator
     */
    List<RefundOrderWx> selectByExample(RefundOrderWxExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: refund_order_wx
     * @author MyBatis Generator
     */
    RefundOrderWx selectByPrimaryKey(String outRefundNo);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: refund_order_wx
     * @author MyBatis Generator
     */
    int updateByExampleSelective(@Param("record") RefundOrderWx record, @Param("example") RefundOrderWxExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: refund_order_wx
     * @author MyBatis Generator
     */
    int updateByExample(@Param("record") RefundOrderWx record, @Param("example") RefundOrderWxExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: refund_order_wx
     * @author MyBatis Generator
     */
    int updateByPrimaryKeySelective(RefundOrderWx record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: refund_order_wx
     * @author MyBatis Generator
     */
    int updateByPrimaryKey(RefundOrderWx record);
}