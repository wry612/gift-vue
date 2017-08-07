package cn.datai.gift.persist.po;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Coupon implements Serializable {
    public static final long serialVersionUID = -1746807377L;

    /**
     * coupon_id: coupon.COUPON_ID
     * @author MyBatis Generator
     */
    private Long couponId;

    /**
     * 券类型id: coupon.COUPON_TYPE_ID
     * @author MyBatis Generator
     */
    private Long couponTypeId;

    /**
     * 名称: coupon.NAME
     * @author MyBatis Generator
     */
    private String name;

    /**
     * 0:不启用  1:启用: coupon.ISVALID
     * @author MyBatis Generator
     */
    private String isvalid;

    /**
     * 0：固定金额   1：固定折扣: coupon.DISCOUNT_TYPE
     * @author MyBatis Generator
     */
    private String discountType;

    /**
     * 0：分      1：毫升   2：毫克  : coupon.UNIT
     * @author MyBatis Generator
     */
    private String unit;

    /**
     * 单位数量: coupon.UNIT_QUANTITY
     * @author MyBatis Generator
     */
    private BigDecimal unitQuantity;

    /**
     * 万分比为单位: coupon.DISCOUNT
     * @author MyBatis Generator
     */
    private BigDecimal discount;

    /**
     * 注释: coupon.REMARK
     * @author MyBatis Generator
     */
    private String remark;

    /**
     * 固定有效期开始时间，不赋值可在券明细中设置: coupon.FIXED_START_TIME
     * @author MyBatis Generator
     */
    private Date fixedStartTime;

    /**
     * 固定有效期结束时间，不赋值可在券明细中设置: coupon.FIXED_END_TIME
     * @author MyBatis Generator
     */
    private Date fixedEndTime;

    /**
     * 结束时间从发券当天开始计算: coupon.DYNAMIC_AVALID_DAY
     * @author MyBatis Generator
     */
    private String dynamicAvalidDay;

    /**
     * 添加时间: coupon.CREATE_TIME
     * @author MyBatis Generator
     */
    private Date createTime;

    /**
     * 修改时间: coupon.MODIFY_TIME
     * @author MyBatis Generator
     */
    private Date modifyTime;

    /**
     * 满多少钱才可使用券: coupon.CONDITION_ENOUGH_MONEY
     * @author MyBatis Generator
     */
    private BigDecimal conditionEnoughMoney;

    /**
     * 满多少单位数量才可使用券: coupon.CONDITION_ENOUGH_UNIT_QUANTITY
     * @author MyBatis Generator
     */
    private BigDecimal conditionEnoughUnitQuantity;

    /**
     * 对现有商品分组，多个群组号用逗号隔开: coupon.INCLUDE_COMMODITY_GROUP
     * @author MyBatis Generator
     */
    private String includeCommodityGroup;

    /**
     * 对现有商品分组，多个群组号用逗号隔开: coupon.EXCLUDE_COMMODITY_GROUP
     * @author MyBatis Generator
     */
    private String excludeCommodityGroup;

    /**
     * 是否免运费    0或空：不免运费   1：免运费: coupon.IS_DELIVERY_FREE
     * @author MyBatis Generator
     */
    private String isDeliveryFree;

    /**
     * 后台账户id: coupon.MODIFY_ADMIN_ID
     * @author MyBatis Generator
     */
    private String modifyAdminId;

    /**
     * 固定某一用户或运营商上生产此券, 空值表示不固定,在券明细中指定生产人: coupon.FIXED_CREATE_SUBJECT_ID
     * @author MyBatis Generator
     */
    private Long fixedCreateSubjectId;

    /**
     * 固定生产人类型，固定生产人id不为空才有效    0：用户   1：运营商: coupon.FIXED_CREATE_SUBJECT_TYPE
     * @author MyBatis Generator
     */
    private String fixedCreateSubjectType;

    /**
     * 获取coupon_id: coupon.COUPON_ID
     * @return coupon_id: coupon.COUPON_ID
     * @author MyBatis Generator
     */
    public Long getCouponId() {
        return couponId;
    }

    /**
     * 设置coupon_id: coupon.COUPON_ID
     * @param couponId 映射数据库字段: coupon.COUPON_ID
     * @author MyBatis Generator
     */
    public void setCouponId(Long couponId) {
        this.couponId = couponId;
    }

    /**
     * 获取券类型id: coupon.COUPON_TYPE_ID
     * @return 券类型id: coupon.COUPON_TYPE_ID
     * @author MyBatis Generator
     */
    public Long getCouponTypeId() {
        return couponTypeId;
    }

    /**
     * 设置券类型id: coupon.COUPON_TYPE_ID
     * @param couponTypeId 映射数据库字段: coupon.COUPON_TYPE_ID
     * @author MyBatis Generator
     */
    public void setCouponTypeId(Long couponTypeId) {
        this.couponTypeId = couponTypeId;
    }

    /**
     * 获取名称: coupon.NAME
     * @return 名称: coupon.NAME
     * @author MyBatis Generator
     */
    public String getName() {
        return name;
    }

    /**
     * 设置名称: coupon.NAME
     * @param name 映射数据库字段: coupon.NAME
     * @author MyBatis Generator
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取0:不启用  1:启用: coupon.ISVALID
     * @return 0:不启用  1:启用: coupon.ISVALID
     * @author MyBatis Generator
     */
    public String getIsvalid() {
        return isvalid;
    }

    /**
     * 设置0:不启用  1:启用: coupon.ISVALID
     * @param isvalid 映射数据库字段: coupon.ISVALID
     * @author MyBatis Generator
     */
    public void setIsvalid(String isvalid) {
        this.isvalid = isvalid == null ? null : isvalid.trim();
    }

    /**
     * 获取0：固定金额   1：固定折扣: coupon.DISCOUNT_TYPE
     * @return 0：固定金额   1：固定折扣: coupon.DISCOUNT_TYPE
     * @author MyBatis Generator
     */
    public String getDiscountType() {
        return discountType;
    }

    /**
     * 设置0：固定金额   1：固定折扣: coupon.DISCOUNT_TYPE
     * @param discountType 映射数据库字段: coupon.DISCOUNT_TYPE
     * @author MyBatis Generator
     */
    public void setDiscountType(String discountType) {
        this.discountType = discountType == null ? null : discountType.trim();
    }

    /**
     * 获取0：分      1：毫升   2：毫克  : coupon.UNIT
     * @return 0：分      1：毫升   2：毫克  : coupon.UNIT
     * @author MyBatis Generator
     */
    public String getUnit() {
        return unit;
    }

    /**
     * 设置0：分      1：毫升   2：毫克  : coupon.UNIT
     * @param unit 映射数据库字段: coupon.UNIT
     * @author MyBatis Generator
     */
    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    /**
     * 获取单位数量: coupon.UNIT_QUANTITY
     * @return 单位数量: coupon.UNIT_QUANTITY
     * @author MyBatis Generator
     */
    public BigDecimal getUnitQuantity() {
        return unitQuantity;
    }

    /**
     * 设置单位数量: coupon.UNIT_QUANTITY
     * @param unitQuantity 映射数据库字段: coupon.UNIT_QUANTITY
     * @author MyBatis Generator
     */
    public void setUnitQuantity(BigDecimal unitQuantity) {
        this.unitQuantity = unitQuantity;
    }

    /**
     * 获取万分比为单位: coupon.DISCOUNT
     * @return 万分比为单位: coupon.DISCOUNT
     * @author MyBatis Generator
     */
    public BigDecimal getDiscount() {
        return discount;
    }

    /**
     * 设置万分比为单位: coupon.DISCOUNT
     * @param discount 映射数据库字段: coupon.DISCOUNT
     * @author MyBatis Generator
     */
    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    /**
     * 获取注释: coupon.REMARK
     * @return 注释: coupon.REMARK
     * @author MyBatis Generator
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置注释: coupon.REMARK
     * @param remark 映射数据库字段: coupon.REMARK
     * @author MyBatis Generator
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * 获取固定有效期开始时间，不赋值可在券明细中设置: coupon.FIXED_START_TIME
     * @return 固定有效期开始时间，不赋值可在券明细中设置: coupon.FIXED_START_TIME
     * @author MyBatis Generator
     */
    public Date getFixedStartTime() {
        return fixedStartTime;
    }

    /**
     * 设置固定有效期开始时间，不赋值可在券明细中设置: coupon.FIXED_START_TIME
     * @param fixedStartTime 映射数据库字段: coupon.FIXED_START_TIME
     * @author MyBatis Generator
     */
    public void setFixedStartTime(Date fixedStartTime) {
        this.fixedStartTime = fixedStartTime;
    }

    /**
     * 获取固定有效期结束时间，不赋值可在券明细中设置: coupon.FIXED_END_TIME
     * @return 固定有效期结束时间，不赋值可在券明细中设置: coupon.FIXED_END_TIME
     * @author MyBatis Generator
     */
    public Date getFixedEndTime() {
        return fixedEndTime;
    }

    /**
     * 设置固定有效期结束时间，不赋值可在券明细中设置: coupon.FIXED_END_TIME
     * @param fixedEndTime 映射数据库字段: coupon.FIXED_END_TIME
     * @author MyBatis Generator
     */
    public void setFixedEndTime(Date fixedEndTime) {
        this.fixedEndTime = fixedEndTime;
    }

    /**
     * 获取结束时间从发券当天开始计算: coupon.DYNAMIC_AVALID_DAY
     * @return 结束时间从发券当天开始计算: coupon.DYNAMIC_AVALID_DAY
     * @author MyBatis Generator
     */
    public String getDynamicAvalidDay() {
        return dynamicAvalidDay;
    }

    /**
     * 设置结束时间从发券当天开始计算: coupon.DYNAMIC_AVALID_DAY
     * @param dynamicAvalidDay 映射数据库字段: coupon.DYNAMIC_AVALID_DAY
     * @author MyBatis Generator
     */
    public void setDynamicAvalidDay(String dynamicAvalidDay) {
        this.dynamicAvalidDay = dynamicAvalidDay == null ? null : dynamicAvalidDay.trim();
    }

    /**
     * 获取添加时间: coupon.CREATE_TIME
     * @return 添加时间: coupon.CREATE_TIME
     * @author MyBatis Generator
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置添加时间: coupon.CREATE_TIME
     * @param createTime 映射数据库字段: coupon.CREATE_TIME
     * @author MyBatis Generator
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取修改时间: coupon.MODIFY_TIME
     * @return 修改时间: coupon.MODIFY_TIME
     * @author MyBatis Generator
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * 设置修改时间: coupon.MODIFY_TIME
     * @param modifyTime 映射数据库字段: coupon.MODIFY_TIME
     * @author MyBatis Generator
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * 获取满多少钱才可使用券: coupon.CONDITION_ENOUGH_MONEY
     * @return 满多少钱才可使用券: coupon.CONDITION_ENOUGH_MONEY
     * @author MyBatis Generator
     */
    public BigDecimal getConditionEnoughMoney() {
        return conditionEnoughMoney;
    }

    /**
     * 设置满多少钱才可使用券: coupon.CONDITION_ENOUGH_MONEY
     * @param conditionEnoughMoney 映射数据库字段: coupon.CONDITION_ENOUGH_MONEY
     * @author MyBatis Generator
     */
    public void setConditionEnoughMoney(BigDecimal conditionEnoughMoney) {
        this.conditionEnoughMoney = conditionEnoughMoney;
    }

    /**
     * 获取满多少单位数量才可使用券: coupon.CONDITION_ENOUGH_UNIT_QUANTITY
     * @return 满多少单位数量才可使用券: coupon.CONDITION_ENOUGH_UNIT_QUANTITY
     * @author MyBatis Generator
     */
    public BigDecimal getConditionEnoughUnitQuantity() {
        return conditionEnoughUnitQuantity;
    }

    /**
     * 设置满多少单位数量才可使用券: coupon.CONDITION_ENOUGH_UNIT_QUANTITY
     * @param conditionEnoughUnitQuantity 映射数据库字段: coupon.CONDITION_ENOUGH_UNIT_QUANTITY
     * @author MyBatis Generator
     */
    public void setConditionEnoughUnitQuantity(BigDecimal conditionEnoughUnitQuantity) {
        this.conditionEnoughUnitQuantity = conditionEnoughUnitQuantity;
    }

    /**
     * 获取对现有商品分组，多个群组号用逗号隔开: coupon.INCLUDE_COMMODITY_GROUP
     * @return 对现有商品分组，多个群组号用逗号隔开: coupon.INCLUDE_COMMODITY_GROUP
     * @author MyBatis Generator
     */
    public String getIncludeCommodityGroup() {
        return includeCommodityGroup;
    }

    /**
     * 设置对现有商品分组，多个群组号用逗号隔开: coupon.INCLUDE_COMMODITY_GROUP
     * @param includeCommodityGroup 映射数据库字段: coupon.INCLUDE_COMMODITY_GROUP
     * @author MyBatis Generator
     */
    public void setIncludeCommodityGroup(String includeCommodityGroup) {
        this.includeCommodityGroup = includeCommodityGroup == null ? null : includeCommodityGroup.trim();
    }

    /**
     * 获取对现有商品分组，多个群组号用逗号隔开: coupon.EXCLUDE_COMMODITY_GROUP
     * @return 对现有商品分组，多个群组号用逗号隔开: coupon.EXCLUDE_COMMODITY_GROUP
     * @author MyBatis Generator
     */
    public String getExcludeCommodityGroup() {
        return excludeCommodityGroup;
    }

    /**
     * 设置对现有商品分组，多个群组号用逗号隔开: coupon.EXCLUDE_COMMODITY_GROUP
     * @param excludeCommodityGroup 映射数据库字段: coupon.EXCLUDE_COMMODITY_GROUP
     * @author MyBatis Generator
     */
    public void setExcludeCommodityGroup(String excludeCommodityGroup) {
        this.excludeCommodityGroup = excludeCommodityGroup == null ? null : excludeCommodityGroup.trim();
    }

    /**
     * 获取是否免运费    0或空：不免运费   1：免运费: coupon.IS_DELIVERY_FREE
     * @return 是否免运费    0或空：不免运费   1：免运费: coupon.IS_DELIVERY_FREE
     * @author MyBatis Generator
     */
    public String getIsDeliveryFree() {
        return isDeliveryFree;
    }

    /**
     * 设置是否免运费    0或空：不免运费   1：免运费: coupon.IS_DELIVERY_FREE
     * @param isDeliveryFree 映射数据库字段: coupon.IS_DELIVERY_FREE
     * @author MyBatis Generator
     */
    public void setIsDeliveryFree(String isDeliveryFree) {
        this.isDeliveryFree = isDeliveryFree == null ? null : isDeliveryFree.trim();
    }

    /**
     * 获取后台账户id: coupon.MODIFY_ADMIN_ID
     * @return 后台账户id: coupon.MODIFY_ADMIN_ID
     * @author MyBatis Generator
     */
    public String getModifyAdminId() {
        return modifyAdminId;
    }

    /**
     * 设置后台账户id: coupon.MODIFY_ADMIN_ID
     * @param modifyAdminId 映射数据库字段: coupon.MODIFY_ADMIN_ID
     * @author MyBatis Generator
     */
    public void setModifyAdminId(String modifyAdminId) {
        this.modifyAdminId = modifyAdminId == null ? null : modifyAdminId.trim();
    }

    /**
     * 获取固定某一用户或运营商上生产此券, 空值表示不固定,在券明细中指定生产人: coupon.FIXED_CREATE_SUBJECT_ID
     * @return 固定某一用户或运营商上生产此券, 空值表示不固定,在券明细中指定生产人: coupon.FIXED_CREATE_SUBJECT_ID
     * @author MyBatis Generator
     */
    public Long getFixedCreateSubjectId() {
        return fixedCreateSubjectId;
    }

    /**
     * 设置固定某一用户或运营商上生产此券, 空值表示不固定,在券明细中指定生产人: coupon.FIXED_CREATE_SUBJECT_ID
     * @param fixedCreateSubjectId 映射数据库字段: coupon.FIXED_CREATE_SUBJECT_ID
     * @author MyBatis Generator
     */
    public void setFixedCreateSubjectId(Long fixedCreateSubjectId) {
        this.fixedCreateSubjectId = fixedCreateSubjectId;
    }

    /**
     * 获取固定生产人类型，固定生产人id不为空才有效    0：用户   1：运营商: coupon.FIXED_CREATE_SUBJECT_TYPE
     * @return 固定生产人类型，固定生产人id不为空才有效    0：用户   1：运营商: coupon.FIXED_CREATE_SUBJECT_TYPE
     * @author MyBatis Generator
     */
    public String getFixedCreateSubjectType() {
        return fixedCreateSubjectType;
    }

    /**
     * 设置固定生产人类型，固定生产人id不为空才有效    0：用户   1：运营商: coupon.FIXED_CREATE_SUBJECT_TYPE
     * @param fixedCreateSubjectType 映射数据库字段: coupon.FIXED_CREATE_SUBJECT_TYPE
     * @author MyBatis Generator
     */
    public void setFixedCreateSubjectType(String fixedCreateSubjectType) {
        this.fixedCreateSubjectType = fixedCreateSubjectType == null ? null : fixedCreateSubjectType.trim();
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: coupon
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
        Coupon other = (Coupon) that;
        return (this.getCouponId() == null ? other.getCouponId() == null : this.getCouponId().equals(other.getCouponId()))
            && (this.getCouponTypeId() == null ? other.getCouponTypeId() == null : this.getCouponTypeId().equals(other.getCouponTypeId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getIsvalid() == null ? other.getIsvalid() == null : this.getIsvalid().equals(other.getIsvalid()))
            && (this.getDiscountType() == null ? other.getDiscountType() == null : this.getDiscountType().equals(other.getDiscountType()))
            && (this.getUnit() == null ? other.getUnit() == null : this.getUnit().equals(other.getUnit()))
            && (this.getUnitQuantity() == null ? other.getUnitQuantity() == null : this.getUnitQuantity().equals(other.getUnitQuantity()))
            && (this.getDiscount() == null ? other.getDiscount() == null : this.getDiscount().equals(other.getDiscount()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getFixedStartTime() == null ? other.getFixedStartTime() == null : this.getFixedStartTime().equals(other.getFixedStartTime()))
            && (this.getFixedEndTime() == null ? other.getFixedEndTime() == null : this.getFixedEndTime().equals(other.getFixedEndTime()))
            && (this.getDynamicAvalidDay() == null ? other.getDynamicAvalidDay() == null : this.getDynamicAvalidDay().equals(other.getDynamicAvalidDay()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getModifyTime() == null ? other.getModifyTime() == null : this.getModifyTime().equals(other.getModifyTime()))
            && (this.getConditionEnoughMoney() == null ? other.getConditionEnoughMoney() == null : this.getConditionEnoughMoney().equals(other.getConditionEnoughMoney()))
            && (this.getConditionEnoughUnitQuantity() == null ? other.getConditionEnoughUnitQuantity() == null : this.getConditionEnoughUnitQuantity().equals(other.getConditionEnoughUnitQuantity()))
            && (this.getIncludeCommodityGroup() == null ? other.getIncludeCommodityGroup() == null : this.getIncludeCommodityGroup().equals(other.getIncludeCommodityGroup()))
            && (this.getExcludeCommodityGroup() == null ? other.getExcludeCommodityGroup() == null : this.getExcludeCommodityGroup().equals(other.getExcludeCommodityGroup()))
            && (this.getIsDeliveryFree() == null ? other.getIsDeliveryFree() == null : this.getIsDeliveryFree().equals(other.getIsDeliveryFree()))
            && (this.getModifyAdminId() == null ? other.getModifyAdminId() == null : this.getModifyAdminId().equals(other.getModifyAdminId()))
            && (this.getFixedCreateSubjectId() == null ? other.getFixedCreateSubjectId() == null : this.getFixedCreateSubjectId().equals(other.getFixedCreateSubjectId()))
            && (this.getFixedCreateSubjectType() == null ? other.getFixedCreateSubjectType() == null : this.getFixedCreateSubjectType().equals(other.getFixedCreateSubjectType()));
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: coupon
     * @author MyBatis Generator
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCouponId() == null) ? 0 : getCouponId().hashCode());
        result = prime * result + ((getCouponTypeId() == null) ? 0 : getCouponTypeId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getIsvalid() == null) ? 0 : getIsvalid().hashCode());
        result = prime * result + ((getDiscountType() == null) ? 0 : getDiscountType().hashCode());
        result = prime * result + ((getUnit() == null) ? 0 : getUnit().hashCode());
        result = prime * result + ((getUnitQuantity() == null) ? 0 : getUnitQuantity().hashCode());
        result = prime * result + ((getDiscount() == null) ? 0 : getDiscount().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getFixedStartTime() == null) ? 0 : getFixedStartTime().hashCode());
        result = prime * result + ((getFixedEndTime() == null) ? 0 : getFixedEndTime().hashCode());
        result = prime * result + ((getDynamicAvalidDay() == null) ? 0 : getDynamicAvalidDay().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getModifyTime() == null) ? 0 : getModifyTime().hashCode());
        result = prime * result + ((getConditionEnoughMoney() == null) ? 0 : getConditionEnoughMoney().hashCode());
        result = prime * result + ((getConditionEnoughUnitQuantity() == null) ? 0 : getConditionEnoughUnitQuantity().hashCode());
        result = prime * result + ((getIncludeCommodityGroup() == null) ? 0 : getIncludeCommodityGroup().hashCode());
        result = prime * result + ((getExcludeCommodityGroup() == null) ? 0 : getExcludeCommodityGroup().hashCode());
        result = prime * result + ((getIsDeliveryFree() == null) ? 0 : getIsDeliveryFree().hashCode());
        result = prime * result + ((getModifyAdminId() == null) ? 0 : getModifyAdminId().hashCode());
        result = prime * result + ((getFixedCreateSubjectId() == null) ? 0 : getFixedCreateSubjectId().hashCode());
        result = prime * result + ((getFixedCreateSubjectType() == null) ? 0 : getFixedCreateSubjectType().hashCode());
        return result;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: coupon
     * @author MyBatis Generator
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append(", couponId=").append(couponId);
        sb.append(", couponTypeId=").append(couponTypeId);
        sb.append(", name=").append(name);
        sb.append(", isvalid=").append(isvalid);
        sb.append(", discountType=").append(discountType);
        sb.append(", unit=").append(unit);
        sb.append(", unitQuantity=").append(unitQuantity);
        sb.append(", discount=").append(discount);
        sb.append(", remark=").append(remark);
        sb.append(", fixedStartTime=").append(fixedStartTime);
        sb.append(", fixedEndTime=").append(fixedEndTime);
        sb.append(", dynamicAvalidDay=").append(dynamicAvalidDay);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", conditionEnoughMoney=").append(conditionEnoughMoney);
        sb.append(", conditionEnoughUnitQuantity=").append(conditionEnoughUnitQuantity);
        sb.append(", includeCommodityGroup=").append(includeCommodityGroup);
        sb.append(", excludeCommodityGroup=").append(excludeCommodityGroup);
        sb.append(", isDeliveryFree=").append(isDeliveryFree);
        sb.append(", modifyAdminId=").append(modifyAdminId);
        sb.append(", fixedCreateSubjectId=").append(fixedCreateSubjectId);
        sb.append(", fixedCreateSubjectType=").append(fixedCreateSubjectType);
        sb.append("]");
        return sb.toString();
    }
}