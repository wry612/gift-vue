package cn.datai.gift.persist.po;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class UserBizBrief implements Serializable {
    public static final long serialVersionUID = 1858434779L;

    /**
     * 用户所有业务概要记录id: user_biz_brief.USERL_BIZ_BRIEF_ID
     * @author MyBatis Generator
     */
    private Long userlBizBriefId;

    /**
     * 用户id: user_biz_brief.USER_INFO_ID
     * @author MyBatis Generator
     */
    private Long userInfoId;

    /**
     * 商品合约信息id: user_biz_brief.COMMODITY_CONTRACT_ID
     * @author MyBatis Generator
     */
    private Long commodityContractId;

    /**
     * 业务类型: user_biz_brief.BIZ_TYPE
     * @author MyBatis Generator
     */
    private String bizType;

    /**
     * 业务id: user_biz_brief.BIZ_ID
     * @author MyBatis Generator
     */
    private String bizId;

    /**
     * 创建时间: user_biz_brief.CREATE_TIME
     * @author MyBatis Generator
     */
    private Date createTime;

    /**
     * 商品类型id: user_biz_brief.COMMODITY_TYPE_ID
     * @author MyBatis Generator
     */
    private Long commodityTypeId;

    /**
     * 商品名称: user_biz_brief.COMMODITY_NAME
     * @author MyBatis Generator
     */
    private String commodityName;

    /**
     * 商品操作单位数量: user_biz_brief.OP_COMMODITY_UNIT_QUANTITY
     * @author MyBatis Generator
     */
    private BigDecimal opCommodityUnitQuantity;

    /**
     * 业务状态， 针对不同的业务类型，有不同的状态: user_biz_brief.BIZ_STATUS
     * @author MyBatis Generator
     */
    private String bizStatus;

    /**
     * 附加数据, 针对于业务附加的数据，可根据业务类型自由定义: user_biz_brief.ATTACH
     * @author MyBatis Generator
     */
    private String attach;

    /**
     * 获取用户所有业务概要记录id: user_biz_brief.USERL_BIZ_BRIEF_ID
     * @return 用户所有业务概要记录id: user_biz_brief.USERL_BIZ_BRIEF_ID
     * @author MyBatis Generator
     */
    public Long getUserlBizBriefId() {
        return userlBizBriefId;
    }

    /**
     * 设置用户所有业务概要记录id: user_biz_brief.USERL_BIZ_BRIEF_ID
     * @param userlBizBriefId 映射数据库字段: user_biz_brief.USERL_BIZ_BRIEF_ID
     * @author MyBatis Generator
     */
    public void setUserlBizBriefId(Long userlBizBriefId) {
        this.userlBizBriefId = userlBizBriefId;
    }

    /**
     * 获取用户id: user_biz_brief.USER_INFO_ID
     * @return 用户id: user_biz_brief.USER_INFO_ID
     * @author MyBatis Generator
     */
    public Long getUserInfoId() {
        return userInfoId;
    }

    /**
     * 设置用户id: user_biz_brief.USER_INFO_ID
     * @param userInfoId 映射数据库字段: user_biz_brief.USER_INFO_ID
     * @author MyBatis Generator
     */
    public void setUserInfoId(Long userInfoId) {
        this.userInfoId = userInfoId;
    }

    /**
     * 获取商品合约信息id: user_biz_brief.COMMODITY_CONTRACT_ID
     * @return 商品合约信息id: user_biz_brief.COMMODITY_CONTRACT_ID
     * @author MyBatis Generator
     */
    public Long getCommodityContractId() {
        return commodityContractId;
    }

    /**
     * 设置商品合约信息id: user_biz_brief.COMMODITY_CONTRACT_ID
     * @param commodityContractId 映射数据库字段: user_biz_brief.COMMODITY_CONTRACT_ID
     * @author MyBatis Generator
     */
    public void setCommodityContractId(Long commodityContractId) {
        this.commodityContractId = commodityContractId;
    }

    /**
     * 获取业务类型: user_biz_brief.BIZ_TYPE
     * @return 业务类型: user_biz_brief.BIZ_TYPE
     * @author MyBatis Generator
     */
    public String getBizType() {
        return bizType;
    }

    /**
     * 设置业务类型: user_biz_brief.BIZ_TYPE
     * @param bizType 映射数据库字段: user_biz_brief.BIZ_TYPE
     * @author MyBatis Generator
     */
    public void setBizType(String bizType) {
        this.bizType = bizType == null ? null : bizType.trim();
    }

    /**
     * 获取业务id: user_biz_brief.BIZ_ID
     * @return 业务id: user_biz_brief.BIZ_ID
     * @author MyBatis Generator
     */
    public String getBizId() {
        return bizId;
    }

    /**
     * 设置业务id: user_biz_brief.BIZ_ID
     * @param bizId 映射数据库字段: user_biz_brief.BIZ_ID
     * @author MyBatis Generator
     */
    public void setBizId(String bizId) {
        this.bizId = bizId == null ? null : bizId.trim();
    }

    /**
     * 获取创建时间: user_biz_brief.CREATE_TIME
     * @return 创建时间: user_biz_brief.CREATE_TIME
     * @author MyBatis Generator
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间: user_biz_brief.CREATE_TIME
     * @param createTime 映射数据库字段: user_biz_brief.CREATE_TIME
     * @author MyBatis Generator
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取商品类型id: user_biz_brief.COMMODITY_TYPE_ID
     * @return 商品类型id: user_biz_brief.COMMODITY_TYPE_ID
     * @author MyBatis Generator
     */
    public Long getCommodityTypeId() {
        return commodityTypeId;
    }

    /**
     * 设置商品类型id: user_biz_brief.COMMODITY_TYPE_ID
     * @param commodityTypeId 映射数据库字段: user_biz_brief.COMMODITY_TYPE_ID
     * @author MyBatis Generator
     */
    public void setCommodityTypeId(Long commodityTypeId) {
        this.commodityTypeId = commodityTypeId;
    }

    /**
     * 获取商品名称: user_biz_brief.COMMODITY_NAME
     * @return 商品名称: user_biz_brief.COMMODITY_NAME
     * @author MyBatis Generator
     */
    public String getCommodityName() {
        return commodityName;
    }

    /**
     * 设置商品名称: user_biz_brief.COMMODITY_NAME
     * @param commodityName 映射数据库字段: user_biz_brief.COMMODITY_NAME
     * @author MyBatis Generator
     */
    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName == null ? null : commodityName.trim();
    }

    /**
     * 获取商品操作单位数量: user_biz_brief.OP_COMMODITY_UNIT_QUANTITY
     * @return 商品操作单位数量: user_biz_brief.OP_COMMODITY_UNIT_QUANTITY
     * @author MyBatis Generator
     */
    public BigDecimal getOpCommodityUnitQuantity() {
        return opCommodityUnitQuantity;
    }

    /**
     * 设置商品操作单位数量: user_biz_brief.OP_COMMODITY_UNIT_QUANTITY
     * @param opCommodityUnitQuantity 映射数据库字段: user_biz_brief.OP_COMMODITY_UNIT_QUANTITY
     * @author MyBatis Generator
     */
    public void setOpCommodityUnitQuantity(BigDecimal opCommodityUnitQuantity) {
        this.opCommodityUnitQuantity = opCommodityUnitQuantity;
    }

    /**
     * 获取业务状态， 针对不同的业务类型，有不同的状态: user_biz_brief.BIZ_STATUS
     * @return 业务状态， 针对不同的业务类型，有不同的状态: user_biz_brief.BIZ_STATUS
     * @author MyBatis Generator
     */
    public String getBizStatus() {
        return bizStatus;
    }

    /**
     * 设置业务状态， 针对不同的业务类型，有不同的状态: user_biz_brief.BIZ_STATUS
     * @param bizStatus 映射数据库字段: user_biz_brief.BIZ_STATUS
     * @author MyBatis Generator
     */
    public void setBizStatus(String bizStatus) {
        this.bizStatus = bizStatus == null ? null : bizStatus.trim();
    }

    /**
     * 获取附加数据, 针对于业务附加的数据，可根据业务类型自由定义: user_biz_brief.ATTACH
     * @return 附加数据, 针对于业务附加的数据，可根据业务类型自由定义: user_biz_brief.ATTACH
     * @author MyBatis Generator
     */
    public String getAttach() {
        return attach;
    }

    /**
     * 设置附加数据, 针对于业务附加的数据，可根据业务类型自由定义: user_biz_brief.ATTACH
     * @param attach 映射数据库字段: user_biz_brief.ATTACH
     * @author MyBatis Generator
     */
    public void setAttach(String attach) {
        this.attach = attach == null ? null : attach.trim();
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_biz_brief
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
        UserBizBrief other = (UserBizBrief) that;
        return (this.getUserlBizBriefId() == null ? other.getUserlBizBriefId() == null : this.getUserlBizBriefId().equals(other.getUserlBizBriefId()))
            && (this.getUserInfoId() == null ? other.getUserInfoId() == null : this.getUserInfoId().equals(other.getUserInfoId()))
            && (this.getCommodityContractId() == null ? other.getCommodityContractId() == null : this.getCommodityContractId().equals(other.getCommodityContractId()))
            && (this.getBizType() == null ? other.getBizType() == null : this.getBizType().equals(other.getBizType()))
            && (this.getBizId() == null ? other.getBizId() == null : this.getBizId().equals(other.getBizId()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getCommodityTypeId() == null ? other.getCommodityTypeId() == null : this.getCommodityTypeId().equals(other.getCommodityTypeId()))
            && (this.getCommodityName() == null ? other.getCommodityName() == null : this.getCommodityName().equals(other.getCommodityName()))
            && (this.getOpCommodityUnitQuantity() == null ? other.getOpCommodityUnitQuantity() == null : this.getOpCommodityUnitQuantity().equals(other.getOpCommodityUnitQuantity()))
            && (this.getBizStatus() == null ? other.getBizStatus() == null : this.getBizStatus().equals(other.getBizStatus()))
            && (this.getAttach() == null ? other.getAttach() == null : this.getAttach().equals(other.getAttach()));
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_biz_brief
     * @author MyBatis Generator
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserlBizBriefId() == null) ? 0 : getUserlBizBriefId().hashCode());
        result = prime * result + ((getUserInfoId() == null) ? 0 : getUserInfoId().hashCode());
        result = prime * result + ((getCommodityContractId() == null) ? 0 : getCommodityContractId().hashCode());
        result = prime * result + ((getBizType() == null) ? 0 : getBizType().hashCode());
        result = prime * result + ((getBizId() == null) ? 0 : getBizId().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getCommodityTypeId() == null) ? 0 : getCommodityTypeId().hashCode());
        result = prime * result + ((getCommodityName() == null) ? 0 : getCommodityName().hashCode());
        result = prime * result + ((getOpCommodityUnitQuantity() == null) ? 0 : getOpCommodityUnitQuantity().hashCode());
        result = prime * result + ((getBizStatus() == null) ? 0 : getBizStatus().hashCode());
        result = prime * result + ((getAttach() == null) ? 0 : getAttach().hashCode());
        return result;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_biz_brief
     * @author MyBatis Generator
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append(", userlBizBriefId=").append(userlBizBriefId);
        sb.append(", userInfoId=").append(userInfoId);
        sb.append(", commodityContractId=").append(commodityContractId);
        sb.append(", bizType=").append(bizType);
        sb.append(", bizId=").append(bizId);
        sb.append(", createTime=").append(createTime);
        sb.append(", commodityTypeId=").append(commodityTypeId);
        sb.append(", commodityName=").append(commodityName);
        sb.append(", opCommodityUnitQuantity=").append(opCommodityUnitQuantity);
        sb.append(", bizStatus=").append(bizStatus);
        sb.append(", attach=").append(attach);
        sb.append("]");
        return sb.toString();
    }
}