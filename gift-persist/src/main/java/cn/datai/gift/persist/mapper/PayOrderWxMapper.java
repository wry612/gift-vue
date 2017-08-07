package cn.datai.gift.persist.mapper;

import cn.datai.gift.persist.po.PayOrderWx;
import cn.datai.gift.persist.po.PayOrderWxExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PayOrderWxMapper {
    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: pay_order_wx
     * @author MyBatis Generator
     */
    int countByExample(PayOrderWxExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: pay_order_wx
     * @author MyBatis Generator
     */
    int deleteByExample(PayOrderWxExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: pay_order_wx
     * @author MyBatis Generator
     */
    int deleteByPrimaryKey(String payOrderWxId);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: pay_order_wx
     * @author MyBatis Generator
     */
    int insert(PayOrderWx record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: pay_order_wx
     * @author MyBatis Generator
     */
    int insertSelective(PayOrderWx record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: pay_order_wx
     * @author MyBatis Generator
     */
    List<PayOrderWx> selectByExample(PayOrderWxExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: pay_order_wx
     * @author MyBatis Generator
     */
    PayOrderWx selectByPrimaryKey(String payOrderWxId);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: pay_order_wx
     * @author MyBatis Generator
     */
    int updateByExampleSelective(@Param("record") PayOrderWx record, @Param("example") PayOrderWxExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: pay_order_wx
     * @author MyBatis Generator
     */
    int updateByExample(@Param("record") PayOrderWx record, @Param("example") PayOrderWxExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: pay_order_wx
     * @author MyBatis Generator
     */
    int updateByPrimaryKeySelective(PayOrderWx record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: pay_order_wx
     * @author MyBatis Generator
     */
    int updateByPrimaryKey(PayOrderWx record);
}