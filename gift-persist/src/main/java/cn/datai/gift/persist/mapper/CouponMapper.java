package cn.datai.gift.persist.mapper;

import cn.datai.gift.persist.po.Coupon;
import cn.datai.gift.persist.po.CouponExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CouponMapper {
    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: coupon
     * @author MyBatis Generator
     */
    int countByExample(CouponExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: coupon
     * @author MyBatis Generator
     */
    int deleteByExample(CouponExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: coupon
     * @author MyBatis Generator
     */
    int deleteByPrimaryKey(Long couponId);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: coupon
     * @author MyBatis Generator
     */
    int insert(Coupon record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: coupon
     * @author MyBatis Generator
     */
    int insertSelective(Coupon record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: coupon
     * @author MyBatis Generator
     */
    List<Coupon> selectByExample(CouponExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: coupon
     * @author MyBatis Generator
     */
    Coupon selectByPrimaryKey(Long couponId);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: coupon
     * @author MyBatis Generator
     */
    int updateByExampleSelective(@Param("record") Coupon record, @Param("example") CouponExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: coupon
     * @author MyBatis Generator
     */
    int updateByExample(@Param("record") Coupon record, @Param("example") CouponExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: coupon
     * @author MyBatis Generator
     */
    int updateByPrimaryKeySelective(Coupon record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: coupon
     * @author MyBatis Generator
     */
    int updateByPrimaryKey(Coupon record);
}