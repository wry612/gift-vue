package cn.datai.gift.persist.mapper;

import cn.datai.gift.persist.po.PayDetailWx;
import cn.datai.gift.persist.po.PayDetailWxExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PayDetailWxMapper {
    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: PAY_DETAIL_WX
     * @author MyBatis Generator
     */
    int countByExample(PayDetailWxExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: PAY_DETAIL_WX
     * @author MyBatis Generator
     */
    int deleteByExample(PayDetailWxExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: PAY_DETAIL_WX
     * @author MyBatis Generator
     */
    int deleteByPrimaryKey(Integer payDetailWxId);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: PAY_DETAIL_WX
     * @author MyBatis Generator
     */
    int insert(PayDetailWx record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: PAY_DETAIL_WX
     * @author MyBatis Generator
     */
    int insertSelective(PayDetailWx record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: PAY_DETAIL_WX
     * @author MyBatis Generator
     */
    List<PayDetailWx> selectByExample(PayDetailWxExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: PAY_DETAIL_WX
     * @author MyBatis Generator
     */
    PayDetailWx selectByPrimaryKey(Integer payDetailWxId);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: PAY_DETAIL_WX
     * @author MyBatis Generator
     */
    int updateByExampleSelective(@Param("record") PayDetailWx record, @Param("example") PayDetailWxExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: PAY_DETAIL_WX
     * @author MyBatis Generator
     */
    int updateByExample(@Param("record") PayDetailWx record, @Param("example") PayDetailWxExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: PAY_DETAIL_WX
     * @author MyBatis Generator
     */
    int updateByPrimaryKeySelective(PayDetailWx record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: PAY_DETAIL_WX
     * @author MyBatis Generator
     */
    int updateByPrimaryKey(PayDetailWx record);
}