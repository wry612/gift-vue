package cn.datai.gift.persist.po;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class GiftAccount implements Serializable {
    public static final long serialVersionUID = -897903884L;

    /**
     * 用户礼包账户id: gift_account.GIFT_ACCOUNT_ID
     * @author MyBatis Generator
     */
    private Long giftAccountId;

    /**
     * 商品合约id: gift_account.COMMODITY_CONTRACT_ID
     * @author MyBatis Generator
     */
    private Long commodityContractId;

    /**
     * 礼包账户最新操作序列，开户时值设为0，操作一次，增加1: gift_account.LAST_OP_SEQ
     * @author MyBatis Generator
     */
    private Long lastOpSeq;

    /**
     * 可用单位数量: gift_account.AVAILABLE_UNIT_QUANTITY
     * @author MyBatis Generator
     */
    private BigDecimal availableUnitQuantity;

    /**
     * 冻结单位数量: gift_account.FROZEN_UNIT_QUANTITY
     * @author MyBatis Generator
     */
    private BigDecimal frozenUnitQuantity;

    /**
     * user:用户    operator:运营商: gift_account.TYPE
     * @author MyBatis Generator
     */
    private String type;

    /**
     * 成本总价, 单位分: gift_account.TOTAL_COST_PRICE
     * @author MyBatis Generator
     */
    private Long totalCostPrice;

    /**
     * 更新时间: gift_account.UPDATE_TIME
     * @author MyBatis Generator
     */
    private Date updateTime;

    /**
     * 创建时间: gift_account.CREATE_TIME
     * @author MyBatis Generator
     */
    private Date createTime;

    /**
     * 备注: gift_account.REMARK
     * @author MyBatis Generator
     */
    private String remark;

    /**
     * 获取用户礼包账户id: gift_account.GIFT_ACCOUNT_ID
     * @return 用户礼包账户id: gift_account.GIFT_ACCOUNT_ID
     * @author MyBatis Generator
     */
    public Long getGiftAccountId() {
        return giftAccountId;
    }

    /**
     * 设置用户礼包账户id: gift_account.GIFT_ACCOUNT_ID
     * @param giftAccountId 映射数据库字段: gift_account.GIFT_ACCOUNT_ID
     * @author MyBatis Generator
     */
    public void setGiftAccountId(Long giftAccountId) {
        this.giftAccountId = giftAccountId;
    }

    /**
     * 获取商品合约id: gift_account.COMMODITY_CONTRACT_ID
     * @return 商品合约id: gift_account.COMMODITY_CONTRACT_ID
     * @author MyBatis Generator
     */
    public Long getCommodityContractId() {
        return commodityContractId;
    }

    /**
     * 设置商品合约id: gift_account.COMMODITY_CONTRACT_ID
     * @param commodityContractId 映射数据库字段: gift_account.COMMODITY_CONTRACT_ID
     * @author MyBatis Generator
     */
    public void setCommodityContractId(Long commodityContractId) {
        this.commodityContractId = commodityContractId;
    }

    /**
     * 获取礼包账户最新操作序列，开户时值设为0，操作一次，增加1: gift_account.LAST_OP_SEQ
     * @return 礼包账户最新操作序列，开户时值设为0，操作一次，增加1: gift_account.LAST_OP_SEQ
     * @author MyBatis Generator
     */
    public Long getLastOpSeq() {
        return lastOpSeq;
    }

    /**
     * 设置礼包账户最新操作序列，开户时值设为0，操作一次，增加1: gift_account.LAST_OP_SEQ
     * @param lastOpSeq 映射数据库字段: gift_account.LAST_OP_SEQ
     * @author MyBatis Generator
     */
    public void setLastOpSeq(Long lastOpSeq) {
        this.lastOpSeq = lastOpSeq;
    }

    /**
     * 获取可用单位数量: gift_account.AVAILABLE_UNIT_QUANTITY
     * @return 可用单位数量: gift_account.AVAILABLE_UNIT_QUANTITY
     * @author MyBatis Generator
     */
    public BigDecimal getAvailableUnitQuantity() {
        return availableUnitQuantity;
    }

    /**
     * 设置可用单位数量: gift_account.AVAILABLE_UNIT_QUANTITY
     * @param availableUnitQuantity 映射数据库字段: gift_account.AVAILABLE_UNIT_QUANTITY
     * @author MyBatis Generator
     */
    public void setAvailableUnitQuantity(BigDecimal availableUnitQuantity) {
        this.availableUnitQuantity = availableUnitQuantity;
    }

    /**
     * 获取冻结单位数量: gift_account.FROZEN_UNIT_QUANTITY
     * @return 冻结单位数量: gift_account.FROZEN_UNIT_QUANTITY
     * @author MyBatis Generator
     */
    public BigDecimal getFrozenUnitQuantity() {
        return frozenUnitQuantity;
    }

    /**
     * 设置冻结单位数量: gift_account.FROZEN_UNIT_QUANTITY
     * @param frozenUnitQuantity 映射数据库字段: gift_account.FROZEN_UNIT_QUANTITY
     * @author MyBatis Generator
     */
    public void setFrozenUnitQuantity(BigDecimal frozenUnitQuantity) {
        this.frozenUnitQuantity = frozenUnitQuantity;
    }

    /**
     * 获取user:用户    operator:运营商: gift_account.TYPE
     * @return user:用户    operator:运营商: gift_account.TYPE
     * @author MyBatis Generator
     */
    public String getType() {
        return type;
    }

    /**
     * 设置user:用户    operator:运营商: gift_account.TYPE
     * @param type 映射数据库字段: gift_account.TYPE
     * @author MyBatis Generator
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * 获取成本总价, 单位分: gift_account.TOTAL_COST_PRICE
     * @return 成本总价, 单位分: gift_account.TOTAL_COST_PRICE
     * @author MyBatis Generator
     */
    public Long getTotalCostPrice() {
        return totalCostPrice;
    }

    /**
     * 设置成本总价, 单位分: gift_account.TOTAL_COST_PRICE
     * @param totalCostPrice 映射数据库字段: gift_account.TOTAL_COST_PRICE
     * @author MyBatis Generator
     */
    public void setTotalCostPrice(Long totalCostPrice) {
        this.totalCostPrice = totalCostPrice;
    }

    /**
     * 获取更新时间: gift_account.UPDATE_TIME
     * @return 更新时间: gift_account.UPDATE_TIME
     * @author MyBatis Generator
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间: gift_account.UPDATE_TIME
     * @param updateTime 映射数据库字段: gift_account.UPDATE_TIME
     * @author MyBatis Generator
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取创建时间: gift_account.CREATE_TIME
     * @return 创建时间: gift_account.CREATE_TIME
     * @author MyBatis Generator
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间: gift_account.CREATE_TIME
     * @param createTime 映射数据库字段: gift_account.CREATE_TIME
     * @author MyBatis Generator
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取备注: gift_account.REMARK
     * @return 备注: gift_account.REMARK
     * @author MyBatis Generator
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注: gift_account.REMARK
     * @param remark 映射数据库字段: gift_account.REMARK
     * @author MyBatis Generator
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: gift_account
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
        GiftAccount other = (GiftAccount) that;
        return (this.getGiftAccountId() == null ? other.getGiftAccountId() == null : this.getGiftAccountId().equals(other.getGiftAccountId()))
            && (this.getCommodityContractId() == null ? other.getCommodityContractId() == null : this.getCommodityContractId().equals(other.getCommodityContractId()))
            && (this.getLastOpSeq() == null ? other.getLastOpSeq() == null : this.getLastOpSeq().equals(other.getLastOpSeq()))
            && (this.getAvailableUnitQuantity() == null ? other.getAvailableUnitQuantity() == null : this.getAvailableUnitQuantity().equals(other.getAvailableUnitQuantity()))
            && (this.getFrozenUnitQuantity() == null ? other.getFrozenUnitQuantity() == null : this.getFrozenUnitQuantity().equals(other.getFrozenUnitQuantity()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getTotalCostPrice() == null ? other.getTotalCostPrice() == null : this.getTotalCostPrice().equals(other.getTotalCostPrice()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()));
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: gift_account
     * @author MyBatis Generator
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getGiftAccountId() == null) ? 0 : getGiftAccountId().hashCode());
        result = prime * result + ((getCommodityContractId() == null) ? 0 : getCommodityContractId().hashCode());
        result = prime * result + ((getLastOpSeq() == null) ? 0 : getLastOpSeq().hashCode());
        result = prime * result + ((getAvailableUnitQuantity() == null) ? 0 : getAvailableUnitQuantity().hashCode());
        result = prime * result + ((getFrozenUnitQuantity() == null) ? 0 : getFrozenUnitQuantity().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getTotalCostPrice() == null) ? 0 : getTotalCostPrice().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        return result;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: gift_account
     * @author MyBatis Generator
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append(", giftAccountId=").append(giftAccountId);
        sb.append(", commodityContractId=").append(commodityContractId);
        sb.append(", lastOpSeq=").append(lastOpSeq);
        sb.append(", availableUnitQuantity=").append(availableUnitQuantity);
        sb.append(", frozenUnitQuantity=").append(frozenUnitQuantity);
        sb.append(", type=").append(type);
        sb.append(", totalCostPrice=").append(totalCostPrice);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", remark=").append(remark);
        sb.append("]");
        return sb.toString();
    }
}