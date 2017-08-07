package cn.datai.gift.persist.po;

import java.io.Serializable;
import java.util.Date;

public class OperatorReltGiftAccount implements Serializable {
    public static final long serialVersionUID = 1456704821L;

    /**
     * 运营商id: operator_relt_gift_account.OPERATOR_INFO_ID
     * @author MyBatis Generator
     */
    private Long operatorInfoId;

    /**
     * 用户礼包账户id: operator_relt_gift_account.GIFT_ACCOUNT_ID
     * @author MyBatis Generator
     */
    private Long giftAccountId;

    /**
     * 商品合约信息id: operator_relt_gift_account.COMMODITY_CONTRACT_ID
     * @author MyBatis Generator
     */
    private Long commodityContractId;

    /**
     * 创建时间: operator_relt_gift_account.CREATE_TIME
     * @author MyBatis Generator
     */
    private Date createTime;

    /**
     * 获取运营商id: operator_relt_gift_account.OPERATOR_INFO_ID
     * @return 运营商id: operator_relt_gift_account.OPERATOR_INFO_ID
     * @author MyBatis Generator
     */
    public Long getOperatorInfoId() {
        return operatorInfoId;
    }

    /**
     * 设置运营商id: operator_relt_gift_account.OPERATOR_INFO_ID
     * @param operatorInfoId 映射数据库字段: operator_relt_gift_account.OPERATOR_INFO_ID
     * @author MyBatis Generator
     */
    public void setOperatorInfoId(Long operatorInfoId) {
        this.operatorInfoId = operatorInfoId;
    }

    /**
     * 获取用户礼包账户id: operator_relt_gift_account.GIFT_ACCOUNT_ID
     * @return 用户礼包账户id: operator_relt_gift_account.GIFT_ACCOUNT_ID
     * @author MyBatis Generator
     */
    public Long getGiftAccountId() {
        return giftAccountId;
    }

    /**
     * 设置用户礼包账户id: operator_relt_gift_account.GIFT_ACCOUNT_ID
     * @param giftAccountId 映射数据库字段: operator_relt_gift_account.GIFT_ACCOUNT_ID
     * @author MyBatis Generator
     */
    public void setGiftAccountId(Long giftAccountId) {
        this.giftAccountId = giftAccountId;
    }

    /**
     * 获取商品合约信息id: operator_relt_gift_account.COMMODITY_CONTRACT_ID
     * @return 商品合约信息id: operator_relt_gift_account.COMMODITY_CONTRACT_ID
     * @author MyBatis Generator
     */
    public Long getCommodityContractId() {
        return commodityContractId;
    }

    /**
     * 设置商品合约信息id: operator_relt_gift_account.COMMODITY_CONTRACT_ID
     * @param commodityContractId 映射数据库字段: operator_relt_gift_account.COMMODITY_CONTRACT_ID
     * @author MyBatis Generator
     */
    public void setCommodityContractId(Long commodityContractId) {
        this.commodityContractId = commodityContractId;
    }

    /**
     * 获取创建时间: operator_relt_gift_account.CREATE_TIME
     * @return 创建时间: operator_relt_gift_account.CREATE_TIME
     * @author MyBatis Generator
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间: operator_relt_gift_account.CREATE_TIME
     * @param createTime 映射数据库字段: operator_relt_gift_account.CREATE_TIME
     * @author MyBatis Generator
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: operator_relt_gift_account
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
        OperatorReltGiftAccount other = (OperatorReltGiftAccount) that;
        return (this.getOperatorInfoId() == null ? other.getOperatorInfoId() == null : this.getOperatorInfoId().equals(other.getOperatorInfoId()))
            && (this.getGiftAccountId() == null ? other.getGiftAccountId() == null : this.getGiftAccountId().equals(other.getGiftAccountId()))
            && (this.getCommodityContractId() == null ? other.getCommodityContractId() == null : this.getCommodityContractId().equals(other.getCommodityContractId()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()));
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: operator_relt_gift_account
     * @author MyBatis Generator
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOperatorInfoId() == null) ? 0 : getOperatorInfoId().hashCode());
        result = prime * result + ((getGiftAccountId() == null) ? 0 : getGiftAccountId().hashCode());
        result = prime * result + ((getCommodityContractId() == null) ? 0 : getCommodityContractId().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        return result;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: operator_relt_gift_account
     * @author MyBatis Generator
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append(", operatorInfoId=").append(operatorInfoId);
        sb.append(", giftAccountId=").append(giftAccountId);
        sb.append(", commodityContractId=").append(commodityContractId);
        sb.append(", createTime=").append(createTime);
        sb.append("]");
        return sb.toString();
    }
}