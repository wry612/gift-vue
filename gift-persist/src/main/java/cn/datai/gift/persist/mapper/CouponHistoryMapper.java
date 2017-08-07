package cn.datai.gift.persist.mapper;

import cn.datai.gift.persist.po.CouponHistory;
import cn.datai.gift.persist.po.CouponHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CouponHistoryMapper {
    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: coupon_history
     * @author MyBatis Generator
     */
    int countByExample(CouponHistoryExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: coupon_history
     * @author MyBatis Generator
     */
    int deleteByExample(CouponHistoryExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: coupon_history
     * @author MyBatis Generator
     */
    int deleteByPrimaryKey(Long couponHistoryId);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: coupon_history
     * @author MyBatis Generator
     */
    int insert(CouponHistory record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: coupon_history
     * @author MyBatis Generator
     */
    int insertSelective(CouponHistory record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: coupon_history
     * @author MyBatis Generator
     */
    List<CouponHistory> selectByExample(CouponHistoryExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: coupon_history
     * @author MyBatis Generator
     */
    CouponHistory selectByPrimaryKey(Long couponHistoryId);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: coupon_history
     * @author MyBatis Generator
     */
    int updateByExampleSelective(@Param("record") CouponHistory record, @Param("example") CouponHistoryExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: coupon_history
     * @author MyBatis Generator
     */
    int updateByExample(@Param("record") CouponHistory record, @Param("example") CouponHistoryExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: coupon_history
     * @author MyBatis Generator
     */
    int updateByPrimaryKeySelective(CouponHistory record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: coupon_history
     * @author MyBatis Generator
     */
    int updateByPrimaryKey(CouponHistory record);
}