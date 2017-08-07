package cn.datai.gift.persist.mapper;

import cn.datai.gift.persist.po.PayResultWx;
import cn.datai.gift.persist.po.PayResultWxExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PayResultWxMapper {
    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: PAY_RESULT_WX
     * @author MyBatis Generator
     */
    int countByExample(PayResultWxExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: PAY_RESULT_WX
     * @author MyBatis Generator
     */
    int deleteByExample(PayResultWxExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: PAY_RESULT_WX
     * @author MyBatis Generator
     */
    int deleteByPrimaryKey(String transactionId);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: PAY_RESULT_WX
     * @author MyBatis Generator
     */
    int insert(PayResultWx record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: PAY_RESULT_WX
     * @author MyBatis Generator
     */
    int insertSelective(PayResultWx record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: PAY_RESULT_WX
     * @author MyBatis Generator
     */
    List<PayResultWx> selectByExample(PayResultWxExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: PAY_RESULT_WX
     * @author MyBatis Generator
     */
    PayResultWx selectByPrimaryKey(String transactionId);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: PAY_RESULT_WX
     * @author MyBatis Generator
     */
    int updateByExampleSelective(@Param("record") PayResultWx record, @Param("example") PayResultWxExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: PAY_RESULT_WX
     * @author MyBatis Generator
     */
    int updateByExample(@Param("record") PayResultWx record, @Param("example") PayResultWxExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: PAY_RESULT_WX
     * @author MyBatis Generator
     */
    int updateByPrimaryKeySelective(PayResultWx record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: PAY_RESULT_WX
     * @author MyBatis Generator
     */
    int updateByPrimaryKey(PayResultWx record);
}