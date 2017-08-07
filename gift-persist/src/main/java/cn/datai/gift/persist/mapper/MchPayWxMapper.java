package cn.datai.gift.persist.mapper;

import cn.datai.gift.persist.po.MchPayWx;
import cn.datai.gift.persist.po.MchPayWxExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MchPayWxMapper {
    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: mch_pay_wx
     * @author MyBatis Generator
     */
    int countByExample(MchPayWxExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: mch_pay_wx
     * @author MyBatis Generator
     */
    int deleteByExample(MchPayWxExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: mch_pay_wx
     * @author MyBatis Generator
     */
    int deleteByPrimaryKey(String partnerTradeNo);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: mch_pay_wx
     * @author MyBatis Generator
     */
    int insert(MchPayWx record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: mch_pay_wx
     * @author MyBatis Generator
     */
    int insertSelective(MchPayWx record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: mch_pay_wx
     * @author MyBatis Generator
     */
    List<MchPayWx> selectByExample(MchPayWxExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: mch_pay_wx
     * @author MyBatis Generator
     */
    MchPayWx selectByPrimaryKey(String partnerTradeNo);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: mch_pay_wx
     * @author MyBatis Generator
     */
    int updateByExampleSelective(@Param("record") MchPayWx record, @Param("example") MchPayWxExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: mch_pay_wx
     * @author MyBatis Generator
     */
    int updateByExample(@Param("record") MchPayWx record, @Param("example") MchPayWxExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: mch_pay_wx
     * @author MyBatis Generator
     */
    int updateByPrimaryKeySelective(MchPayWx record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: mch_pay_wx
     * @author MyBatis Generator
     */
    int updateByPrimaryKey(MchPayWx record);
}