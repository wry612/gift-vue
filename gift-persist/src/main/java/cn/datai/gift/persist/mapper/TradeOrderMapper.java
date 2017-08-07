package cn.datai.gift.persist.mapper;

import cn.datai.gift.persist.po.TradeOrder;
import cn.datai.gift.persist.po.TradeOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TradeOrderMapper {
    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: trade_order
     * @author MyBatis Generator
     */
    int countByExample(TradeOrderExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: trade_order
     * @author MyBatis Generator
     */
    int deleteByExample(TradeOrderExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: trade_order
     * @author MyBatis Generator
     */
    int deleteByPrimaryKey(Long tradeOrderId);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: trade_order
     * @author MyBatis Generator
     */
    int insert(TradeOrder record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: trade_order
     * @author MyBatis Generator
     */
    int insertSelective(TradeOrder record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: trade_order
     * @author MyBatis Generator
     */
    List<TradeOrder> selectByExample(TradeOrderExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: trade_order
     * @author MyBatis Generator
     */
    TradeOrder selectByPrimaryKey(Long tradeOrderId);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: trade_order
     * @author MyBatis Generator
     */
    int updateByExampleSelective(@Param("record") TradeOrder record, @Param("example") TradeOrderExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: trade_order
     * @author MyBatis Generator
     */
    int updateByExample(@Param("record") TradeOrder record, @Param("example") TradeOrderExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: trade_order
     * @author MyBatis Generator
     */
    int updateByPrimaryKeySelective(TradeOrder record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: trade_order
     * @author MyBatis Generator
     */
    int updateByPrimaryKey(TradeOrder record);
}