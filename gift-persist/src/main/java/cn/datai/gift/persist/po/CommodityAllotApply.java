package cn.datai.gift.persist.po;

import java.io.Serializable;
import java.math.BigDecimal;

public class CommodityAllotApply implements Serializable {
    public static final long serialVersionUID = -1059736596L;

    /**
     * 商品对外系统出入申请id: commodity_allot_apply.COMMODITY_ALLOT_APPLY
     * @author MyBatis Generator
     */
    private Long commodityAllotApply;

    /**
     * 礼包账户id: commodity_allot_apply.GIFT_ACCOUNT_ID
     * @author MyBatis Generator
     */
    private Long giftAccountId;

    /**
     * 操作账户类型    user:用户     operator：运营商: commodity_allot_apply.ACCOUNT_TYPE
     * @author MyBatis Generator
     */
    private String accountType;

    /**
     * 转入/转出   in：转入   out：转出: commodity_allot_apply.IN_OR_OUT
     * @author MyBatis Generator
     */
    private String inOrOut;

    /**
     * 操作商品单位数量: commodity_allot_apply.COMMODITY_UNIT_QUANTITY
     * @author MyBatis Generator
     */
    private BigDecimal commodityUnitQuantity;

    /**
     * applied: 已提交申请    deny：审核驳回     pass：审核通过    success：通过审核后，系统执行完成相应的操作      fail：通过审核后操作失败: commodity_allot_apply.STATUS
     * @author MyBatis Generator
     */
    private String status;

    /**
     * 商品流通记录ids，  包括提交审核时的冻结记录， 审核完成后的解冻及可用单位记录，之间用逗号隔开: commodity_allot_apply.COMMODITY_FLOW_RECORD_IDS
     * @author MyBatis Generator
     */
    private String commodityFlowRecordIds;

    /**
     * 获取商品对外系统出入申请id: commodity_allot_apply.COMMODITY_ALLOT_APPLY
     * @return 商品对外系统出入申请id: commodity_allot_apply.COMMODITY_ALLOT_APPLY
     * @author MyBatis Generator
     */
    public Long getCommodityAllotApply() {
        return commodityAllotApply;
    }

    /**
     * 设置商品对外系统出入申请id: commodity_allot_apply.COMMODITY_ALLOT_APPLY
     * @param commodityAllotApply 映射数据库字段: commodity_allot_apply.COMMODITY_ALLOT_APPLY
     * @author MyBatis Generator
     */
    public void setCommodityAllotApply(Long commodityAllotApply) {
        this.commodityAllotApply = commodityAllotApply;
    }

    /**
     * 获取礼包账户id: commodity_allot_apply.GIFT_ACCOUNT_ID
     * @return 礼包账户id: commodity_allot_apply.GIFT_ACCOUNT_ID
     * @author MyBatis Generator
     */
    public Long getGiftAccountId() {
        return giftAccountId;
    }

    /**
     * 设置礼包账户id: commodity_allot_apply.GIFT_ACCOUNT_ID
     * @param giftAccountId 映射数据库字段: commodity_allot_apply.GIFT_ACCOUNT_ID
     * @author MyBatis Generator
     */
    public void setGiftAccountId(Long giftAccountId) {
        this.giftAccountId = giftAccountId;
    }

    /**
     * 获取操作账户类型    user:用户     operator：运营商: commodity_allot_apply.ACCOUNT_TYPE
     * @return 操作账户类型    user:用户     operator：运营商: commodity_allot_apply.ACCOUNT_TYPE
     * @author MyBatis Generator
     */
    public String getAccountType() {
        return accountType;
    }

    /**
     * 设置操作账户类型    user:用户     operator：运营商: commodity_allot_apply.ACCOUNT_TYPE
     * @param accountType 映射数据库字段: commodity_allot_apply.ACCOUNT_TYPE
     * @author MyBatis Generator
     */
    public void setAccountType(String accountType) {
        this.accountType = accountType == null ? null : accountType.trim();
    }

    /**
     * 获取转入/转出   in：转入   out：转出: commodity_allot_apply.IN_OR_OUT
     * @return 转入/转出   in：转入   out：转出: commodity_allot_apply.IN_OR_OUT
     * @author MyBatis Generator
     */
    public String getInOrOut() {
        return inOrOut;
    }

    /**
     * 设置转入/转出   in：转入   out：转出: commodity_allot_apply.IN_OR_OUT
     * @param inOrOut 映射数据库字段: commodity_allot_apply.IN_OR_OUT
     * @author MyBatis Generator
     */
    public void setInOrOut(String inOrOut) {
        this.inOrOut = inOrOut == null ? null : inOrOut.trim();
    }

    /**
     * 获取操作商品单位数量: commodity_allot_apply.COMMODITY_UNIT_QUANTITY
     * @return 操作商品单位数量: commodity_allot_apply.COMMODITY_UNIT_QUANTITY
     * @author MyBatis Generator
     */
    public BigDecimal getCommodityUnitQuantity() {
        return commodityUnitQuantity;
    }

    /**
     * 设置操作商品单位数量: commodity_allot_apply.COMMODITY_UNIT_QUANTITY
     * @param commodityUnitQuantity 映射数据库字段: commodity_allot_apply.COMMODITY_UNIT_QUANTITY
     * @author MyBatis Generator
     */
    public void setCommodityUnitQuantity(BigDecimal commodityUnitQuantity) {
        this.commodityUnitQuantity = commodityUnitQuantity;
    }

    /**
     * 获取applied: 已提交申请    deny：审核驳回     pass：审核通过    success：通过审核后，系统执行完成相应的操作      fail：通过审核后操作失败: commodity_allot_apply.STATUS
     * @return applied: 已提交申请    deny：审核驳回     pass：审核通过    success：通过审核后，系统执行完成相应的操作      fail：通过审核后操作失败: commodity_allot_apply.STATUS
     * @author MyBatis Generator
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置applied: 已提交申请    deny：审核驳回     pass：审核通过    success：通过审核后，系统执行完成相应的操作      fail：通过审核后操作失败: commodity_allot_apply.STATUS
     * @param status 映射数据库字段: commodity_allot_apply.STATUS
     * @author MyBatis Generator
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * 获取商品流通记录ids，  包括提交审核时的冻结记录， 审核完成后的解冻及可用单位记录，之间用逗号隔开: commodity_allot_apply.COMMODITY_FLOW_RECORD_IDS
     * @return 商品流通记录ids，  包括提交审核时的冻结记录， 审核完成后的解冻及可用单位记录，之间用逗号隔开: commodity_allot_apply.COMMODITY_FLOW_RECORD_IDS
     * @author MyBatis Generator
     */
    public String getCommodityFlowRecordIds() {
        return commodityFlowRecordIds;
    }

    /**
     * 设置商品流通记录ids，  包括提交审核时的冻结记录， 审核完成后的解冻及可用单位记录，之间用逗号隔开: commodity_allot_apply.COMMODITY_FLOW_RECORD_IDS
     * @param commodityFlowRecordIds 映射数据库字段: commodity_allot_apply.COMMODITY_FLOW_RECORD_IDS
     * @author MyBatis Generator
     */
    public void setCommodityFlowRecordIds(String commodityFlowRecordIds) {
        this.commodityFlowRecordIds = commodityFlowRecordIds == null ? null : commodityFlowRecordIds.trim();
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_allot_apply
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
        CommodityAllotApply other = (CommodityAllotApply) that;
        return (this.getCommodityAllotApply() == null ? other.getCommodityAllotApply() == null : this.getCommodityAllotApply().equals(other.getCommodityAllotApply()))
            && (this.getGiftAccountId() == null ? other.getGiftAccountId() == null : this.getGiftAccountId().equals(other.getGiftAccountId()))
            && (this.getAccountType() == null ? other.getAccountType() == null : this.getAccountType().equals(other.getAccountType()))
            && (this.getInOrOut() == null ? other.getInOrOut() == null : this.getInOrOut().equals(other.getInOrOut()))
            && (this.getCommodityUnitQuantity() == null ? other.getCommodityUnitQuantity() == null : this.getCommodityUnitQuantity().equals(other.getCommodityUnitQuantity()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getCommodityFlowRecordIds() == null ? other.getCommodityFlowRecordIds() == null : this.getCommodityFlowRecordIds().equals(other.getCommodityFlowRecordIds()));
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_allot_apply
     * @author MyBatis Generator
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCommodityAllotApply() == null) ? 0 : getCommodityAllotApply().hashCode());
        result = prime * result + ((getGiftAccountId() == null) ? 0 : getGiftAccountId().hashCode());
        result = prime * result + ((getAccountType() == null) ? 0 : getAccountType().hashCode());
        result = prime * result + ((getInOrOut() == null) ? 0 : getInOrOut().hashCode());
        result = prime * result + ((getCommodityUnitQuantity() == null) ? 0 : getCommodityUnitQuantity().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCommodityFlowRecordIds() == null) ? 0 : getCommodityFlowRecordIds().hashCode());
        return result;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_allot_apply
     * @author MyBatis Generator
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append(", commodityAllotApply=").append(commodityAllotApply);
        sb.append(", giftAccountId=").append(giftAccountId);
        sb.append(", accountType=").append(accountType);
        sb.append(", inOrOut=").append(inOrOut);
        sb.append(", commodityUnitQuantity=").append(commodityUnitQuantity);
        sb.append(", status=").append(status);
        sb.append(", commodityFlowRecordIds=").append(commodityFlowRecordIds);
        sb.append("]");
        return sb.toString();
    }
}