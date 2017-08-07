package cn.datai.gift.persist.po;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class CommodityGiftInfo implements Serializable {
    public static final long serialVersionUID = -1090221278L;

    /**
     * id: commodity_gift_info.COMMODITY_GIFT_INFO_ID
     * @author MyBatis Generator
     */
    private Long commodityGiftInfoId;

    /**
     * 礼包唯一性code: commodity_gift_info.CODE
     * @author MyBatis Generator
     */
    private String code;

    /**
     * 赠与人礼包账户: commodity_gift_info.DONATOR_GIFT_ACCOUNT_ID
     * @author MyBatis Generator
     */
    private Long donatorGiftAccountId;

    /**
     * 商品合约信息id: commodity_gift_info.COMMODITY_CONTRACT_ID
     * @author MyBatis Generator
     */
    private Long commodityContractId;

    /**
     * 祝福语: commodity_gift_info.GREETING
     * @author MyBatis Generator
     */
    private String greeting;

    /**
     * 0：指定单个受赠人     1：拼手气    2：普通、平均   3：指定配额: commodity_gift_info.TYPE
     * @author MyBatis Generator
     */
    private String type;

    /**
     * 指定受赠人用户id，礼包类型为指定单个受赠人才生效: commodity_gift_info.SPECIFIED_DONEE_USER_ID
     * @author MyBatis Generator
     */
    private Long specifiedDoneeUserId;

    /**
     * 受赠人数配额: commodity_gift_info.DONEE_QUOTA
     * @author MyBatis Generator
     */
    private Integer doneeQuota;

    /**
     * 受赠人数剩余数量: commodity_gift_info.DONEE_SURPLUS
     * @author MyBatis Generator
     */
    private Integer doneeSurplus;

    /**
     * 礼包中商品单位总数量: commodity_gift_info.COMMODITY_TOTAL_QUANTITY
     * @author MyBatis Generator
     */
    private BigDecimal commodityTotalQuantity;

    /**
     * 礼包中商品剩余单位数量: commodity_gift_info.COMMODITY_SURPLUS_QUANTITY
     * @author MyBatis Generator
     */
    private BigDecimal commoditySurplusQuantity;

    /**
     * 礼包生成时间: commodity_gift_info.CREATE_TIME
     * @author MyBatis Generator
     */
    private Date createTime;

    /**
     * 礼包过期时间: commodity_gift_info.EXPIRED_TIME
     * @author MyBatis Generator
     */
    private Date expiredTime;

    /**
     * 赠与人生成红包的商品流通记录ids， 多个用逗号隔开: commodity_gift_info.COMMODITY_FLOW_RECORD_IDS
     * @author MyBatis Generator
     */
    private String commodityFlowRecordIds;

    /**
     * 过期是否已处理     true：已处理   false:未处理: commodity_gift_info.REFUNDED
     * @author MyBatis Generator
     */
    private String refunded;

    /**
     * 过期退还商品流通记录id: commodity_gift_info.REFUND_FLOW_RECORD_ID
     * @author MyBatis Generator
     */
    private String refundFlowRecordId;

    /**
     * 已抢用户id, 多个用户用逗号隔开: commodity_gift_info.DONEE_USER_IDS
     * @author MyBatis Generator
     */
    private String doneeUserIds;

    /**
     * 获取id: commodity_gift_info.COMMODITY_GIFT_INFO_ID
     * @return id: commodity_gift_info.COMMODITY_GIFT_INFO_ID
     * @author MyBatis Generator
     */
    public Long getCommodityGiftInfoId() {
        return commodityGiftInfoId;
    }

    /**
     * 设置id: commodity_gift_info.COMMODITY_GIFT_INFO_ID
     * @param commodityGiftInfoId 映射数据库字段: commodity_gift_info.COMMODITY_GIFT_INFO_ID
     * @author MyBatis Generator
     */
    public void setCommodityGiftInfoId(Long commodityGiftInfoId) {
        this.commodityGiftInfoId = commodityGiftInfoId;
    }

    /**
     * 获取礼包唯一性code: commodity_gift_info.CODE
     * @return 礼包唯一性code: commodity_gift_info.CODE
     * @author MyBatis Generator
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置礼包唯一性code: commodity_gift_info.CODE
     * @param code 映射数据库字段: commodity_gift_info.CODE
     * @author MyBatis Generator
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * 获取赠与人礼包账户: commodity_gift_info.DONATOR_GIFT_ACCOUNT_ID
     * @return 赠与人礼包账户: commodity_gift_info.DONATOR_GIFT_ACCOUNT_ID
     * @author MyBatis Generator
     */
    public Long getDonatorGiftAccountId() {
        return donatorGiftAccountId;
    }

    /**
     * 设置赠与人礼包账户: commodity_gift_info.DONATOR_GIFT_ACCOUNT_ID
     * @param donatorGiftAccountId 映射数据库字段: commodity_gift_info.DONATOR_GIFT_ACCOUNT_ID
     * @author MyBatis Generator
     */
    public void setDonatorGiftAccountId(Long donatorGiftAccountId) {
        this.donatorGiftAccountId = donatorGiftAccountId;
    }

    /**
     * 获取商品合约信息id: commodity_gift_info.COMMODITY_CONTRACT_ID
     * @return 商品合约信息id: commodity_gift_info.COMMODITY_CONTRACT_ID
     * @author MyBatis Generator
     */
    public Long getCommodityContractId() {
        return commodityContractId;
    }

    /**
     * 设置商品合约信息id: commodity_gift_info.COMMODITY_CONTRACT_ID
     * @param commodityContractId 映射数据库字段: commodity_gift_info.COMMODITY_CONTRACT_ID
     * @author MyBatis Generator
     */
    public void setCommodityContractId(Long commodityContractId) {
        this.commodityContractId = commodityContractId;
    }

    /**
     * 获取祝福语: commodity_gift_info.GREETING
     * @return 祝福语: commodity_gift_info.GREETING
     * @author MyBatis Generator
     */
    public String getGreeting() {
        return greeting;
    }

    /**
     * 设置祝福语: commodity_gift_info.GREETING
     * @param greeting 映射数据库字段: commodity_gift_info.GREETING
     * @author MyBatis Generator
     */
    public void setGreeting(String greeting) {
        this.greeting = greeting == null ? null : greeting.trim();
    }

    /**
     * 获取0：指定单个受赠人     1：拼手气    2：普通、平均   3：指定配额: commodity_gift_info.TYPE
     * @return 0：指定单个受赠人     1：拼手气    2：普通、平均   3：指定配额: commodity_gift_info.TYPE
     * @author MyBatis Generator
     */
    public String getType() {
        return type;
    }

    /**
     * 设置0：指定单个受赠人     1：拼手气    2：普通、平均   3：指定配额: commodity_gift_info.TYPE
     * @param type 映射数据库字段: commodity_gift_info.TYPE
     * @author MyBatis Generator
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * 获取指定受赠人用户id，礼包类型为指定单个受赠人才生效: commodity_gift_info.SPECIFIED_DONEE_USER_ID
     * @return 指定受赠人用户id，礼包类型为指定单个受赠人才生效: commodity_gift_info.SPECIFIED_DONEE_USER_ID
     * @author MyBatis Generator
     */
    public Long getSpecifiedDoneeUserId() {
        return specifiedDoneeUserId;
    }

    /**
     * 设置指定受赠人用户id，礼包类型为指定单个受赠人才生效: commodity_gift_info.SPECIFIED_DONEE_USER_ID
     * @param specifiedDoneeUserId 映射数据库字段: commodity_gift_info.SPECIFIED_DONEE_USER_ID
     * @author MyBatis Generator
     */
    public void setSpecifiedDoneeUserId(Long specifiedDoneeUserId) {
        this.specifiedDoneeUserId = specifiedDoneeUserId;
    }

    /**
     * 获取受赠人数配额: commodity_gift_info.DONEE_QUOTA
     * @return 受赠人数配额: commodity_gift_info.DONEE_QUOTA
     * @author MyBatis Generator
     */
    public Integer getDoneeQuota() {
        return doneeQuota;
    }

    /**
     * 设置受赠人数配额: commodity_gift_info.DONEE_QUOTA
     * @param doneeQuota 映射数据库字段: commodity_gift_info.DONEE_QUOTA
     * @author MyBatis Generator
     */
    public void setDoneeQuota(Integer doneeQuota) {
        this.doneeQuota = doneeQuota;
    }

    /**
     * 获取受赠人数剩余数量: commodity_gift_info.DONEE_SURPLUS
     * @return 受赠人数剩余数量: commodity_gift_info.DONEE_SURPLUS
     * @author MyBatis Generator
     */
    public Integer getDoneeSurplus() {
        return doneeSurplus;
    }

    /**
     * 设置受赠人数剩余数量: commodity_gift_info.DONEE_SURPLUS
     * @param doneeSurplus 映射数据库字段: commodity_gift_info.DONEE_SURPLUS
     * @author MyBatis Generator
     */
    public void setDoneeSurplus(Integer doneeSurplus) {
        this.doneeSurplus = doneeSurplus;
    }

    /**
     * 获取礼包中商品单位总数量: commodity_gift_info.COMMODITY_TOTAL_QUANTITY
     * @return 礼包中商品单位总数量: commodity_gift_info.COMMODITY_TOTAL_QUANTITY
     * @author MyBatis Generator
     */
    public BigDecimal getCommodityTotalQuantity() {
        return commodityTotalQuantity;
    }

    /**
     * 设置礼包中商品单位总数量: commodity_gift_info.COMMODITY_TOTAL_QUANTITY
     * @param commodityTotalQuantity 映射数据库字段: commodity_gift_info.COMMODITY_TOTAL_QUANTITY
     * @author MyBatis Generator
     */
    public void setCommodityTotalQuantity(BigDecimal commodityTotalQuantity) {
        this.commodityTotalQuantity = commodityTotalQuantity;
    }

    /**
     * 获取礼包中商品剩余单位数量: commodity_gift_info.COMMODITY_SURPLUS_QUANTITY
     * @return 礼包中商品剩余单位数量: commodity_gift_info.COMMODITY_SURPLUS_QUANTITY
     * @author MyBatis Generator
     */
    public BigDecimal getCommoditySurplusQuantity() {
        return commoditySurplusQuantity;
    }

    /**
     * 设置礼包中商品剩余单位数量: commodity_gift_info.COMMODITY_SURPLUS_QUANTITY
     * @param commoditySurplusQuantity 映射数据库字段: commodity_gift_info.COMMODITY_SURPLUS_QUANTITY
     * @author MyBatis Generator
     */
    public void setCommoditySurplusQuantity(BigDecimal commoditySurplusQuantity) {
        this.commoditySurplusQuantity = commoditySurplusQuantity;
    }

    /**
     * 获取礼包生成时间: commodity_gift_info.CREATE_TIME
     * @return 礼包生成时间: commodity_gift_info.CREATE_TIME
     * @author MyBatis Generator
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置礼包生成时间: commodity_gift_info.CREATE_TIME
     * @param createTime 映射数据库字段: commodity_gift_info.CREATE_TIME
     * @author MyBatis Generator
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取礼包过期时间: commodity_gift_info.EXPIRED_TIME
     * @return 礼包过期时间: commodity_gift_info.EXPIRED_TIME
     * @author MyBatis Generator
     */
    public Date getExpiredTime() {
        return expiredTime;
    }

    /**
     * 设置礼包过期时间: commodity_gift_info.EXPIRED_TIME
     * @param expiredTime 映射数据库字段: commodity_gift_info.EXPIRED_TIME
     * @author MyBatis Generator
     */
    public void setExpiredTime(Date expiredTime) {
        this.expiredTime = expiredTime;
    }

    /**
     * 获取赠与人生成红包的商品流通记录ids， 多个用逗号隔开: commodity_gift_info.COMMODITY_FLOW_RECORD_IDS
     * @return 赠与人生成红包的商品流通记录ids， 多个用逗号隔开: commodity_gift_info.COMMODITY_FLOW_RECORD_IDS
     * @author MyBatis Generator
     */
    public String getCommodityFlowRecordIds() {
        return commodityFlowRecordIds;
    }

    /**
     * 设置赠与人生成红包的商品流通记录ids， 多个用逗号隔开: commodity_gift_info.COMMODITY_FLOW_RECORD_IDS
     * @param commodityFlowRecordIds 映射数据库字段: commodity_gift_info.COMMODITY_FLOW_RECORD_IDS
     * @author MyBatis Generator
     */
    public void setCommodityFlowRecordIds(String commodityFlowRecordIds) {
        this.commodityFlowRecordIds = commodityFlowRecordIds == null ? null : commodityFlowRecordIds.trim();
    }

    /**
     * 获取过期是否已处理     true：已处理   false:未处理: commodity_gift_info.REFUNDED
     * @return 过期是否已处理     true：已处理   false:未处理: commodity_gift_info.REFUNDED
     * @author MyBatis Generator
     */
    public String getRefunded() {
        return refunded;
    }

    /**
     * 设置过期是否已处理     true：已处理   false:未处理: commodity_gift_info.REFUNDED
     * @param refunded 映射数据库字段: commodity_gift_info.REFUNDED
     * @author MyBatis Generator
     */
    public void setRefunded(String refunded) {
        this.refunded = refunded == null ? null : refunded.trim();
    }

    /**
     * 获取过期退还商品流通记录id: commodity_gift_info.REFUND_FLOW_RECORD_ID
     * @return 过期退还商品流通记录id: commodity_gift_info.REFUND_FLOW_RECORD_ID
     * @author MyBatis Generator
     */
    public String getRefundFlowRecordId() {
        return refundFlowRecordId;
    }

    /**
     * 设置过期退还商品流通记录id: commodity_gift_info.REFUND_FLOW_RECORD_ID
     * @param refundFlowRecordId 映射数据库字段: commodity_gift_info.REFUND_FLOW_RECORD_ID
     * @author MyBatis Generator
     */
    public void setRefundFlowRecordId(String refundFlowRecordId) {
        this.refundFlowRecordId = refundFlowRecordId == null ? null : refundFlowRecordId.trim();
    }

    /**
     * 获取已抢用户id, 多个用户用逗号隔开: commodity_gift_info.DONEE_USER_IDS
     * @return 已抢用户id, 多个用户用逗号隔开: commodity_gift_info.DONEE_USER_IDS
     * @author MyBatis Generator
     */
    public String getDoneeUserIds() {
        return doneeUserIds;
    }

    /**
     * 设置已抢用户id, 多个用户用逗号隔开: commodity_gift_info.DONEE_USER_IDS
     * @param doneeUserIds 映射数据库字段: commodity_gift_info.DONEE_USER_IDS
     * @author MyBatis Generator
     */
    public void setDoneeUserIds(String doneeUserIds) {
        this.doneeUserIds = doneeUserIds == null ? null : doneeUserIds.trim();
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_gift_info
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
        CommodityGiftInfo other = (CommodityGiftInfo) that;
        return (this.getCommodityGiftInfoId() == null ? other.getCommodityGiftInfoId() == null : this.getCommodityGiftInfoId().equals(other.getCommodityGiftInfoId()))
            && (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
            && (this.getDonatorGiftAccountId() == null ? other.getDonatorGiftAccountId() == null : this.getDonatorGiftAccountId().equals(other.getDonatorGiftAccountId()))
            && (this.getCommodityContractId() == null ? other.getCommodityContractId() == null : this.getCommodityContractId().equals(other.getCommodityContractId()))
            && (this.getGreeting() == null ? other.getGreeting() == null : this.getGreeting().equals(other.getGreeting()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getSpecifiedDoneeUserId() == null ? other.getSpecifiedDoneeUserId() == null : this.getSpecifiedDoneeUserId().equals(other.getSpecifiedDoneeUserId()))
            && (this.getDoneeQuota() == null ? other.getDoneeQuota() == null : this.getDoneeQuota().equals(other.getDoneeQuota()))
            && (this.getDoneeSurplus() == null ? other.getDoneeSurplus() == null : this.getDoneeSurplus().equals(other.getDoneeSurplus()))
            && (this.getCommodityTotalQuantity() == null ? other.getCommodityTotalQuantity() == null : this.getCommodityTotalQuantity().equals(other.getCommodityTotalQuantity()))
            && (this.getCommoditySurplusQuantity() == null ? other.getCommoditySurplusQuantity() == null : this.getCommoditySurplusQuantity().equals(other.getCommoditySurplusQuantity()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getExpiredTime() == null ? other.getExpiredTime() == null : this.getExpiredTime().equals(other.getExpiredTime()))
            && (this.getCommodityFlowRecordIds() == null ? other.getCommodityFlowRecordIds() == null : this.getCommodityFlowRecordIds().equals(other.getCommodityFlowRecordIds()))
            && (this.getRefunded() == null ? other.getRefunded() == null : this.getRefunded().equals(other.getRefunded()))
            && (this.getRefundFlowRecordId() == null ? other.getRefundFlowRecordId() == null : this.getRefundFlowRecordId().equals(other.getRefundFlowRecordId()))
            && (this.getDoneeUserIds() == null ? other.getDoneeUserIds() == null : this.getDoneeUserIds().equals(other.getDoneeUserIds()));
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_gift_info
     * @author MyBatis Generator
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCommodityGiftInfoId() == null) ? 0 : getCommodityGiftInfoId().hashCode());
        result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
        result = prime * result + ((getDonatorGiftAccountId() == null) ? 0 : getDonatorGiftAccountId().hashCode());
        result = prime * result + ((getCommodityContractId() == null) ? 0 : getCommodityContractId().hashCode());
        result = prime * result + ((getGreeting() == null) ? 0 : getGreeting().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getSpecifiedDoneeUserId() == null) ? 0 : getSpecifiedDoneeUserId().hashCode());
        result = prime * result + ((getDoneeQuota() == null) ? 0 : getDoneeQuota().hashCode());
        result = prime * result + ((getDoneeSurplus() == null) ? 0 : getDoneeSurplus().hashCode());
        result = prime * result + ((getCommodityTotalQuantity() == null) ? 0 : getCommodityTotalQuantity().hashCode());
        result = prime * result + ((getCommoditySurplusQuantity() == null) ? 0 : getCommoditySurplusQuantity().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getExpiredTime() == null) ? 0 : getExpiredTime().hashCode());
        result = prime * result + ((getCommodityFlowRecordIds() == null) ? 0 : getCommodityFlowRecordIds().hashCode());
        result = prime * result + ((getRefunded() == null) ? 0 : getRefunded().hashCode());
        result = prime * result + ((getRefundFlowRecordId() == null) ? 0 : getRefundFlowRecordId().hashCode());
        result = prime * result + ((getDoneeUserIds() == null) ? 0 : getDoneeUserIds().hashCode());
        return result;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_gift_info
     * @author MyBatis Generator
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append(", commodityGiftInfoId=").append(commodityGiftInfoId);
        sb.append(", code=").append(code);
        sb.append(", donatorGiftAccountId=").append(donatorGiftAccountId);
        sb.append(", commodityContractId=").append(commodityContractId);
        sb.append(", greeting=").append(greeting);
        sb.append(", type=").append(type);
        sb.append(", specifiedDoneeUserId=").append(specifiedDoneeUserId);
        sb.append(", doneeQuota=").append(doneeQuota);
        sb.append(", doneeSurplus=").append(doneeSurplus);
        sb.append(", commodityTotalQuantity=").append(commodityTotalQuantity);
        sb.append(", commoditySurplusQuantity=").append(commoditySurplusQuantity);
        sb.append(", createTime=").append(createTime);
        sb.append(", expiredTime=").append(expiredTime);
        sb.append(", commodityFlowRecordIds=").append(commodityFlowRecordIds);
        sb.append(", refunded=").append(refunded);
        sb.append(", refundFlowRecordId=").append(refundFlowRecordId);
        sb.append(", doneeUserIds=").append(doneeUserIds);
        sb.append("]");
        return sb.toString();
    }
}