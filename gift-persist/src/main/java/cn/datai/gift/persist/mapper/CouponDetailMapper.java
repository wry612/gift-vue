package cn.datai.gift.persist.mapper;

import cn.datai.gift.persist.po.CouponDetail;
import cn.datai.gift.persist.po.CouponDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CouponDetailMapper {
    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: coupon_detail
     * @author MyBatis Generator
     */
    int countByExample(CouponDetailExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: coupon_detail
     * @author MyBatis Generator
     */
    int deleteByExample(CouponDetailExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: coupon_detail
     * @author MyBatis Generator
     */
    int deleteByPrimaryKey(Long couponDetailId);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: coupon_detail
     * @author MyBatis Generator
     */
    int insert(CouponDetail record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: coupon_detail
     * @author MyBatis Generator
     */
    int insertSelective(CouponDetail record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: coupon_detail
     * @author MyBatis Generator
     */
    List<CouponDetail> selectByExample(CouponDetailExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: coupon_detail
     * @author MyBatis Generator
     */
    CouponDetail selectByPrimaryKey(Long couponDetailId);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: coupon_detail
     * @author MyBatis Generator
     */
    int updateByExampleSelective(@Param("record") CouponDetail record, @Param("example") CouponDetailExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: coupon_detail
     * @author MyBatis Generator
     */
    int updateByExample(@Param("record") CouponDetail record, @Param("example") CouponDetailExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: coupon_detail
     * @author MyBatis Generator
     */
    int updateByPrimaryKeySelective(CouponDetail record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: coupon_detail
     * @author MyBatis Generator
     */
    int updateByPrimaryKey(CouponDetail record);
}