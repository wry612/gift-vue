package cn.datai.gift.persist.mapper;

import cn.datai.gift.persist.po.RefundResultWx;
import cn.datai.gift.persist.po.RefundResultWxExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RefundResultWxMapper {
    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: REFUND_RESULT_WX
     * @author MyBatis Generator
     */
    int countByExample(RefundResultWxExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: REFUND_RESULT_WX
     * @author MyBatis Generator
     */
    int deleteByExample(RefundResultWxExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: REFUND_RESULT_WX
     * @author MyBatis Generator
     */
    int deleteByPrimaryKey(String refundResultWx);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: REFUND_RESULT_WX
     * @author MyBatis Generator
     */
    int insert(RefundResultWx record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: REFUND_RESULT_WX
     * @author MyBatis Generator
     */
    int insertSelective(RefundResultWx record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: REFUND_RESULT_WX
     * @author MyBatis Generator
     */
    List<RefundResultWx> selectByExample(RefundResultWxExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: REFUND_RESULT_WX
     * @author MyBatis Generator
     */
    RefundResultWx selectByPrimaryKey(String refundResultWx);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: REFUND_RESULT_WX
     * @author MyBatis Generator
     */
    int updateByExampleSelective(@Param("record") RefundResultWx record, @Param("example") RefundResultWxExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: REFUND_RESULT_WX
     * @author MyBatis Generator
     */
    int updateByExample(@Param("record") RefundResultWx record, @Param("example") RefundResultWxExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: REFUND_RESULT_WX
     * @author MyBatis Generator
     */
    int updateByPrimaryKeySelective(RefundResultWx record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: REFUND_RESULT_WX
     * @author MyBatis Generator
     */
    int updateByPrimaryKey(RefundResultWx record);
}