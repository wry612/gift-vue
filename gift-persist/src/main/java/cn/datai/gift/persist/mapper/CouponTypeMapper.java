package cn.datai.gift.persist.mapper;

import cn.datai.gift.persist.po.CouponType;
import cn.datai.gift.persist.po.CouponTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CouponTypeMapper {
    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: coupon_type
     * @author MyBatis Generator
     */
    int countByExample(CouponTypeExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: coupon_type
     * @author MyBatis Generator
     */
    int deleteByExample(CouponTypeExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: coupon_type
     * @author MyBatis Generator
     */
    int deleteByPrimaryKey(Long couponTypeId);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: coupon_type
     * @author MyBatis Generator
     */
    int insert(CouponType record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: coupon_type
     * @author MyBatis Generator
     */
    int insertSelective(CouponType record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: coupon_type
     * @author MyBatis Generator
     */
    List<CouponType> selectByExample(CouponTypeExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: coupon_type
     * @author MyBatis Generator
     */
    CouponType selectByPrimaryKey(Long couponTypeId);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: coupon_type
     * @author MyBatis Generator
     */
    int updateByExampleSelective(@Param("record") CouponType record, @Param("example") CouponTypeExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: coupon_type
     * @author MyBatis Generator
     */
    int updateByExample(@Param("record") CouponType record, @Param("example") CouponTypeExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: coupon_type
     * @author MyBatis Generator
     */
    int updateByPrimaryKeySelective(CouponType record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: coupon_type
     * @author MyBatis Generator
     */
    int updateByPrimaryKey(CouponType record);
}