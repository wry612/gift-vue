package cn.datai.gift.persist.mapper;

import cn.datai.gift.persist.po.MchPayResultWx;
import cn.datai.gift.persist.po.MchPayResultWxExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MchPayResultWxMapper {
    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: mch_pay_result_wx
     * @author MyBatis Generator
     */
    int countByExample(MchPayResultWxExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: mch_pay_result_wx
     * @author MyBatis Generator
     */
    int deleteByExample(MchPayResultWxExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: mch_pay_result_wx
     * @author MyBatis Generator
     */
    int insert(MchPayResultWx record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: mch_pay_result_wx
     * @author MyBatis Generator
     */
    int insertSelective(MchPayResultWx record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: mch_pay_result_wx
     * @author MyBatis Generator
     */
    List<MchPayResultWx> selectByExample(MchPayResultWxExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: mch_pay_result_wx
     * @author MyBatis Generator
     */
    int updateByExampleSelective(@Param("record") MchPayResultWx record, @Param("example") MchPayResultWxExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: mch_pay_result_wx
     * @author MyBatis Generator
     */
    int updateByExample(@Param("record") MchPayResultWx record, @Param("example") MchPayResultWxExample example);
}