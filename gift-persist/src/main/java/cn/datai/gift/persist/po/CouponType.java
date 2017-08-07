package cn.datai.gift.persist.po;

import java.io.Serializable;

public class CouponType implements Serializable {
    public static final long serialVersionUID = -2101778039L;

    /**
     * 券类型id: coupon_type.COUPON_TYPE_ID
     * @author MyBatis Generator
     */
    private Long couponTypeId;

    /**
     * 名称: coupon_type.NAME
     * @author MyBatis Generator
     */
    private String name;

    /**
     * 获取券类型id: coupon_type.COUPON_TYPE_ID
     * @return 券类型id: coupon_type.COUPON_TYPE_ID
     * @author MyBatis Generator
     */
    public Long getCouponTypeId() {
        return couponTypeId;
    }

    /**
     * 设置券类型id: coupon_type.COUPON_TYPE_ID
     * @param couponTypeId 映射数据库字段: coupon_type.COUPON_TYPE_ID
     * @author MyBatis Generator
     */
    public void setCouponTypeId(Long couponTypeId) {
        this.couponTypeId = couponTypeId;
    }

    /**
     * 获取名称: coupon_type.NAME
     * @return 名称: coupon_type.NAME
     * @author MyBatis Generator
     */
    public String getName() {
        return name;
    }

    /**
     * 设置名称: coupon_type.NAME
     * @param name 映射数据库字段: coupon_type.NAME
     * @author MyBatis Generator
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: coupon_type
     * @author MyBatis Generator
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        CouponType other = (CouponType) that;
        return (this.getCouponTypeId() == null ? other.getCouponTypeId() == null : this.getCouponTypeId().equals(other.getCouponTypeId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()));
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: coupon_type
     * @author MyBatis Generator
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCouponTypeId() == null) ? 0 : getCouponTypeId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        return result;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: coupon_type
     * @author MyBatis Generator
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append(", couponTypeId=").append(couponTypeId);
        sb.append(", name=").append(name);
        sb.append("]");
        return sb.toString();
    }
}