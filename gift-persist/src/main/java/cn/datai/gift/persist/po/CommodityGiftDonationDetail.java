package cn.datai.gift.persist.po;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class CommodityGiftDonationDetail implements Serializable {
    public static final long serialVersionUID = 476298231L;

    /**
     * : commodity_gift_donation_detail.COMMODITY_GIFT_DONATION_DETAIL_ID
     * @author MyBatis Generator
     */
    private Long commodityGiftDonationDetailId;

    /**
     * 商品礼包id: commodity_gift_donation_detail.COMMODITY_GIFT_ID
     * @author MyBatis Generator
     */
    private Long commodityGiftId;

    /**
     * 受赠人用户id: commodity_gift_donation_detail.DONEE_USER_ID
     * @author MyBatis Generator
     */
    private Long doneeUserId;

    /**
     * 商品流通记录ids，包括赠与人与受赠人受此单影响的流通记录，多个用逗号隔开: commodity_gift_donation_detail.COMMODITY_FLOW_RECORD_IDS
     * @author MyBatis Generator
     */
    private String commodityFlowRecordIds;

    /**
     * 商品单位数量: commodity_gift_donation_detail.COMMODITY_UNIT_QUANTITY
     * @author MyBatis Generator
     */
    private BigDecimal commodityUnitQuantity;

    /**
     * 受赠时间: commodity_gift_donation_detail.ADOPT_TIME
     * @author MyBatis Generator
     */
    private Date adoptTime;

    /**
     * 获取: commodity_gift_donation_detail.COMMODITY_GIFT_DONATION_DETAIL_ID
     * @return : commodity_gift_donation_detail.COMMODITY_GIFT_DONATION_DETAIL_ID
     * @author MyBatis Generator
     */
    public Long getCommodityGiftDonationDetailId() {
        return commodityGiftDonationDetailId;
    }

    /**
     * 设置: commodity_gift_donation_detail.COMMODITY_GIFT_DONATION_DETAIL_ID
     * @param commodityGiftDonationDetailId 映射数据库字段: commodity_gift_donation_detail.COMMODITY_GIFT_DONATION_DETAIL_ID
     * @author MyBatis Generator
     */
    public void setCommodityGiftDonationDetailId(Long commodityGiftDonationDetailId) {
        this.commodityGiftDonationDetailId = commodityGiftDonationDetailId;
    }

    /**
     * 获取商品礼包id: commodity_gift_donation_detail.COMMODITY_GIFT_ID
     * @return 商品礼包id: commodity_gift_donation_detail.COMMODITY_GIFT_ID
     * @author MyBatis Generator
     */
    public Long getCommodityGiftId() {
        return commodityGiftId;
    }

    /**
     * 设置商品礼包id: commodity_gift_donation_detail.COMMODITY_GIFT_ID
     * @param commodityGiftId 映射数据库字段: commodity_gift_donation_detail.COMMODITY_GIFT_ID
     * @author MyBatis Generator
     */
    public void setCommodityGiftId(Long commodityGiftId) {
        this.commodityGiftId = commodityGiftId;
    }

    /**
     * 获取受赠人用户id: commodity_gift_donation_detail.DONEE_USER_ID
     * @return 受赠人用户id: commodity_gift_donation_detail.DONEE_USER_ID
     * @author MyBatis Generator
     */
    public Long getDoneeUserId() {
        return doneeUserId;
    }

    /**
     * 设置受赠人用户id: commodity_gift_donation_detail.DONEE_USER_ID
     * @param doneeUserId 映射数据库字段: commodity_gift_donation_detail.DONEE_USER_ID
     * @author MyBatis Generator
     */
    public void setDoneeUserId(Long doneeUserId) {
        this.doneeUserId = doneeUserId;
    }

    /**
     * 获取商品流通记录ids，包括赠与人与受赠人受此单影响的流通记录，多个用逗号隔开: commodity_gift_donation_detail.COMMODITY_FLOW_RECORD_IDS
     * @return 商品流通记录ids，包括赠与人与受赠人受此单影响的流通记录，多个用逗号隔开: commodity_gift_donation_detail.COMMODITY_FLOW_RECORD_IDS
     * @author MyBatis Generator
     */
    public String getCommodityFlowRecordIds() {
        return commodityFlowRecordIds;
    }

    /**
     * 设置商品流通记录ids，包括赠与人与受赠人受此单影响的流通记录，多个用逗号隔开: commodity_gift_donation_detail.COMMODITY_FLOW_RECORD_IDS
     * @param commodityFlowRecordIds 映射数据库字段: commodity_gift_donation_detail.COMMODITY_FLOW_RECORD_IDS
     * @author MyBatis Generator
     */
    public void setCommodityFlowRecordIds(String commodityFlowRecordIds) {
        this.commodityFlowRecordIds = commodityFlowRecordIds == null ? null : commodityFlowRecordIds.trim();
    }

    /**
     * 获取商品单位数量: commodity_gift_donation_detail.COMMODITY_UNIT_QUANTITY
     * @return 商品单位数量: commodity_gift_donation_detail.COMMODITY_UNIT_QUANTITY
     * @author MyBatis Generator
     */
    public BigDecimal getCommodityUnitQuantity() {
        return commodityUnitQuantity;
    }

    /**
     * 设置商品单位数量: commodity_gift_donation_detail.COMMODITY_UNIT_QUANTITY
     * @param commodityUnitQuantity 映射数据库字段: commodity_gift_donation_detail.COMMODITY_UNIT_QUANTITY
     * @author MyBatis Generator
     */
    public void setCommodityUnitQuantity(BigDecimal commodityUnitQuantity) {
        this.commodityUnitQuantity = commodityUnitQuantity;
    }

    /**
     * 获取受赠时间: commodity_gift_donation_detail.ADOPT_TIME
     * @return 受赠时间: commodity_gift_donation_detail.ADOPT_TIME
     * @author MyBatis Generator
     */
    public Date getAdoptTime() {
        return adoptTime;
    }

    /**
     * 设置受赠时间: commodity_gift_donation_detail.ADOPT_TIME
     * @param adoptTime 映射数据库字段: commodity_gift_donation_detail.ADOPT_TIME
     * @author MyBatis Generator
     */
    public void setAdoptTime(Date adoptTime) {
        this.adoptTime = adoptTime;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_gift_donation_detail
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
        CommodityGiftDonationDetail other = (CommodityGiftDonationDetail) that;
        return (this.getCommodityGiftDonationDetailId() == null ? other.getCommodityGiftDonationDetailId() == null : this.getCommodityGiftDonationDetailId().equals(other.getCommodityGiftDonationDetailId()))
            && (this.getCommodityGiftId() == null ? other.getCommodityGiftId() == null : this.getCommodityGiftId().equals(other.getCommodityGiftId()))
            && (this.getDoneeUserId() == null ? other.getDoneeUserId() == null : this.getDoneeUserId().equals(other.getDoneeUserId()))
            && (this.getCommodityFlowRecordIds() == null ? other.getCommodityFlowRecordIds() == null : this.getCommodityFlowRecordIds().equals(other.getCommodityFlowRecordIds()))
            && (this.getCommodityUnitQuantity() == null ? other.getCommodityUnitQuantity() == null : this.getCommodityUnitQuantity().equals(other.getCommodityUnitQuantity()))
            && (this.getAdoptTime() == null ? other.getAdoptTime() == null : this.getAdoptTime().equals(other.getAdoptTime()));
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_gift_donation_detail
     * @author MyBatis Generator
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCommodityGiftDonationDetailId() == null) ? 0 : getCommodityGiftDonationDetailId().hashCode());
        result = prime * result + ((getCommodityGiftId() == null) ? 0 : getCommodityGiftId().hashCode());
        result = prime * result + ((getDoneeUserId() == null) ? 0 : getDoneeUserId().hashCode());
        result = prime * result + ((getCommodityFlowRecordIds() == null) ? 0 : getCommodityFlowRecordIds().hashCode());
        result = prime * result + ((getCommodityUnitQuantity() == null) ? 0 : getCommodityUnitQuantity().hashCode());
        result = prime * result + ((getAdoptTime() == null) ? 0 : getAdoptTime().hashCode());
        return result;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_gift_donation_detail
     * @author MyBatis Generator
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append(", commodityGiftDonationDetailId=").append(commodityGiftDonationDetailId);
        sb.append(", commodityGiftId=").append(commodityGiftId);
        sb.append(", doneeUserId=").append(doneeUserId);
        sb.append(", commodityFlowRecordIds=").append(commodityFlowRecordIds);
        sb.append(", commodityUnitQuantity=").append(commodityUnitQuantity);
        sb.append(", adoptTime=").append(adoptTime);
        sb.append("]");
        return sb.toString();
    }
}