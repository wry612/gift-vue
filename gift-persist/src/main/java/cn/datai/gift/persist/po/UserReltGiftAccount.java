package cn.datai.gift.persist.po;

import java.io.Serializable;
import java.util.Date;

public class UserReltGiftAccount implements Serializable {
    public static final long serialVersionUID = -353789266L;

    /**
     * 用户id: user_relt_gift_account.USER_INFO_ID
     * @author MyBatis Generator
     */
    private Long userInfoId;

    /**
     * 用户礼包账户id: user_relt_gift_account.GIFT_ACCOUNT_ID
     * @author MyBatis Generator
     */
    private Long giftAccountId;

    /**
     * 商品合约信息id: user_relt_gift_account.COMMODITY_CONTRACT_ID
     * @author MyBatis Generator
     */
    private Long commodityContractId;

    /**
     * 成本金额，当前商品累计的历史价值， 单位为分: user_relt_gift_account.COST_PRICE
     * @author MyBatis Generator
     */
    private Long costPrice;

    /**
     * 创建时间: user_relt_gift_account.CREATE_TIME
     * @author MyBatis Generator
     */
    private Date createTime;

    /**
     * 修改时间: user_relt_gift_account.UPDATE_TIME
     * @author MyBatis Generator
     */
    private Date updateTime;

    /**
     * 获取用户id: user_relt_gift_account.USER_INFO_ID
     * @return 用户id: user_relt_gift_account.USER_INFO_ID
     * @author MyBatis Generator
     */
    public Long getUserInfoId() {
        return userInfoId;
    }

    /**
     * 设置用户id: user_relt_gift_account.USER_INFO_ID
     * @param userInfoId 映射数据库字段: user_relt_gift_account.USER_INFO_ID
     * @author MyBatis Generator
     */
    public void setUserInfoId(Long userInfoId) {
        this.userInfoId = userInfoId;
    }

    /**
     * 获取用户礼包账户id: user_relt_gift_account.GIFT_ACCOUNT_ID
     * @return 用户礼包账户id: user_relt_gift_account.GIFT_ACCOUNT_ID
     * @author MyBatis Generator
     */
    public Long getGiftAccountId() {
        return giftAccountId;
    }

    /**
     * 设置用户礼包账户id: user_relt_gift_account.GIFT_ACCOUNT_ID
     * @param giftAccountId 映射数据库字段: user_relt_gift_account.GIFT_ACCOUNT_ID
     * @author MyBatis Generator
     */
    public void setGiftAccountId(Long giftAccountId) {
        this.giftAccountId = giftAccountId;
    }

    /**
     * 获取商品合约信息id: user_relt_gift_account.COMMODITY_CONTRACT_ID
     * @return 商品合约信息id: user_relt_gift_account.COMMODITY_CONTRACT_ID
     * @author MyBatis Generator
     */
    public Long getCommodityContractId() {
        return commodityContractId;
    }

    /**
     * 设置商品合约信息id: user_relt_gift_account.COMMODITY_CONTRACT_ID
     * @param commodityContractId 映射数据库字段: user_relt_gift_account.COMMODITY_CONTRACT_ID
     * @author MyBatis Generator
     */
    public void setCommodityContractId(Long commodityContractId) {
        this.commodityContractId = commodityContractId;
    }

    /**
     * 获取成本金额，当前商品累计的历史价值， 单位为分: user_relt_gift_account.COST_PRICE
     * @return 成本金额，当前商品累计的历史价值， 单位为分: user_relt_gift_account.COST_PRICE
     * @author MyBatis Generator
     */
    public Long getCostPrice() {
        return costPrice;
    }

    /**
     * 设置成本金额，当前商品累计的历史价值， 单位为分: user_relt_gift_account.COST_PRICE
     * @param costPrice 映射数据库字段: user_relt_gift_account.COST_PRICE
     * @author MyBatis Generator
     */
    public void setCostPrice(Long costPrice) {
        this.costPrice = costPrice;
    }

    /**
     * 获取创建时间: user_relt_gift_account.CREATE_TIME
     * @return 创建时间: user_relt_gift_account.CREATE_TIME
     * @author MyBatis Generator
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间: user_relt_gift_account.CREATE_TIME
     * @param createTime 映射数据库字段: user_relt_gift_account.CREATE_TIME
     * @author MyBatis Generator
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取修改时间: user_relt_gift_account.UPDATE_TIME
     * @return 修改时间: user_relt_gift_account.UPDATE_TIME
     * @author MyBatis Generator
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置修改时间: user_relt_gift_account.UPDATE_TIME
     * @param updateTime 映射数据库字段: user_relt_gift_account.UPDATE_TIME
     * @author MyBatis Generator
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_relt_gift_account
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
        UserReltGiftAccount other = (UserReltGiftAccount) that;
        return (this.getUserInfoId() == null ? other.getUserInfoId() == null : this.getUserInfoId().equals(other.getUserInfoId()))
            && (this.getGiftAccountId() == null ? other.getGiftAccountId() == null : this.getGiftAccountId().equals(other.getGiftAccountId()))
            && (this.getCommodityContractId() == null ? other.getCommodityContractId() == null : this.getCommodityContractId().equals(other.getCommodityContractId()))
            && (this.getCostPrice() == null ? other.getCostPrice() == null : this.getCostPrice().equals(other.getCostPrice()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_relt_gift_account
     * @author MyBatis Generator
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserInfoId() == null) ? 0 : getUserInfoId().hashCode());
        result = prime * result + ((getGiftAccountId() == null) ? 0 : getGiftAccountId().hashCode());
        result = prime * result + ((getCommodityContractId() == null) ? 0 : getCommodityContractId().hashCode());
        result = prime * result + ((getCostPrice() == null) ? 0 : getCostPrice().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_relt_gift_account
     * @author MyBatis Generator
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append(", userInfoId=").append(userInfoId);
        sb.append(", giftAccountId=").append(giftAccountId);
        sb.append(", commodityContractId=").append(commodityContractId);
        sb.append(", costPrice=").append(costPrice);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }
}