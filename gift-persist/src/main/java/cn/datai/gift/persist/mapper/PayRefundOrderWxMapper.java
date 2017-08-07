package cn.datai.gift.persist.mapper;

import cn.datai.gift.persist.po.PayRefundOrderWx;
import cn.datai.gift.persist.po.PayRefundOrderWxExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PayRefundOrderWxMapper {
    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: PAY_REFUND_ORDER_WX
     * @author MyBatis Generator
     */
    int countByExample(PayRefundOrderWxExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: PAY_REFUND_ORDER_WX
     * @author MyBatis Generator
     */
    int deleteByExample(PayRefundOrderWxExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: PAY_REFUND_ORDER_WX
     * @author MyBatis Generator
     */
    int deleteByPrimaryKey(String payRefundOrderWxId);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: PAY_REFUND_ORDER_WX
     * @author MyBatis Generator
     */
    int insert(PayRefundOrderWx record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: PAY_REFUND_ORDER_WX
     * @author MyBatis Generator
     */
    int insertSelective(PayRefundOrderWx record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: PAY_REFUND_ORDER_WX
     * @author MyBatis Generator
     */
    List<PayRefundOrderWx> selectByExample(PayRefundOrderWxExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: PAY_REFUND_ORDER_WX
     * @author MyBatis Generator
     */
    PayRefundOrderWx selectByPrimaryKey(String payRefundOrderWxId);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: PAY_REFUND_ORDER_WX
     * @author MyBatis Generator
     */
    int updateByExampleSelective(@Param("record") PayRefundOrderWx record, @Param("example") PayRefundOrderWxExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: PAY_REFUND_ORDER_WX
     * @author MyBatis Generator
     */
    int updateByExample(@Param("record") PayRefundOrderWx record, @Param("example") PayRefundOrderWxExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: PAY_REFUND_ORDER_WX
     * @author MyBatis Generator
     */
    int updateByPrimaryKeySelective(PayRefundOrderWx record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: PAY_REFUND_ORDER_WX
     * @author MyBatis Generator
     */
    int updateByPrimaryKey(PayRefundOrderWx record);
}