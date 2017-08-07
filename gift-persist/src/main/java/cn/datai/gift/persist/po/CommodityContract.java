package cn.datai.gift.persist.po;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class CommodityContract implements Serializable {
    public static final long serialVersionUID = 1788768822L;

    /**
     * 商品合约信息id: commodity_contract.COMMODITY_CONTRACT_ID
     * @author MyBatis Generator
     */
    private Long commodityContractId;

    /**
     * 运营商id: commodity_contract.OPERATOR_INFO_ID
     * @author MyBatis Generator
     */
    private Long operatorInfoId;

    /**
     * 商品类型id: commodity_contract.COMMODITY_TYPE_ID
     * @author MyBatis Generator
     */
    private Long commodityTypeId;

    /**
     * 商品编号: commodity_contract.COMMODITY_CODE
     * @author MyBatis Generator
     */
    private String commodityCode;

    /**
     * 标的物: commodity_contract.SUBJECT_MATTER
     * @author MyBatis Generator
     */
    private String subjectMatter;

    /**
     * 商品名称: commodity_contract.COMMODITY_NAME
     * @author MyBatis Generator
     */
    private String commodityName;

    /**
     * 基本单位名称   毫升、毫克、克等: commodity_contract.UNIT
     * @author MyBatis Generator
     */
    private String unit;

    /**
     * 基本单位名称（英文）: commodity_contract.UNIT_EN
     * @author MyBatis Generator
     */
    private String unitEn;

    /**
     * 规格单位名称， 瓶、饼、罐等: commodity_contract.STANDARD_UNIT_NAME
     * @author MyBatis Generator
     */
    private String standardUnitName;

    /**
     * 规格单位对应基本单位数， 一瓶/罐对应多少基本单位: commodity_contract.STANDARD_UNIT_MULTIPLE
     * @author MyBatis Generator
     */
    private BigDecimal standardUnitMultiple;

    /**
     * 交易单位对应基本单位数（一手）,一手对应多少毫升、毫克: commodity_contract.TRADE_UNIT_MULTIPLE
     * @author MyBatis Generator
     */
    private BigDecimal tradeUnitMultiple;

    /**
     * 状态: commodity_contract.STATUS
     * @author MyBatis Generator
     */
    private String status;

    /**
     * 创建时间: commodity_contract.CREATE_TIME
     * @author MyBatis Generator
     */
    private Date createTime;

    /**
     * 修改时间: commodity_contract.MODIFY_TIME
     * @author MyBatis Generator
     */
    private Date modifyTime;

    /**
     * 过期时间: commodity_contract.EXPIRE_TIME
     * @author MyBatis Generator
     */
    private Date expireTime;

    /**
     * 获取商品合约信息id: commodity_contract.COMMODITY_CONTRACT_ID
     * @return 商品合约信息id: commodity_contract.COMMODITY_CONTRACT_ID
     * @author MyBatis Generator
     */
    public Long getCommodityContractId() {
        return commodityContractId;
    }

    /**
     * 设置商品合约信息id: commodity_contract.COMMODITY_CONTRACT_ID
     * @param commodityContractId 映射数据库字段: commodity_contract.COMMODITY_CONTRACT_ID
     * @author MyBatis Generator
     */
    public void setCommodityContractId(Long commodityContractId) {
        this.commodityContractId = commodityContractId;
    }

    /**
     * 获取运营商id: commodity_contract.OPERATOR_INFO_ID
     * @return 运营商id: commodity_contract.OPERATOR_INFO_ID
     * @author MyBatis Generator
     */
    public Long getOperatorInfoId() {
        return operatorInfoId;
    }

    /**
     * 设置运营商id: commodity_contract.OPERATOR_INFO_ID
     * @param operatorInfoId 映射数据库字段: commodity_contract.OPERATOR_INFO_ID
     * @author MyBatis Generator
     */
    public void setOperatorInfoId(Long operatorInfoId) {
        this.operatorInfoId = operatorInfoId;
    }

    /**
     * 获取商品类型id: commodity_contract.COMMODITY_TYPE_ID
     * @return 商品类型id: commodity_contract.COMMODITY_TYPE_ID
     * @author MyBatis Generator
     */
    public Long getCommodityTypeId() {
        return commodityTypeId;
    }

    /**
     * 设置商品类型id: commodity_contract.COMMODITY_TYPE_ID
     * @param commodityTypeId 映射数据库字段: commodity_contract.COMMODITY_TYPE_ID
     * @author MyBatis Generator
     */
    public void setCommodityTypeId(Long commodityTypeId) {
        this.commodityTypeId = commodityTypeId;
    }

    /**
     * 获取商品编号: commodity_contract.COMMODITY_CODE
     * @return 商品编号: commodity_contract.COMMODITY_CODE
     * @author MyBatis Generator
     */
    public String getCommodityCode() {
        return commodityCode;
    }

    /**
     * 设置商品编号: commodity_contract.COMMODITY_CODE
     * @param commodityCode 映射数据库字段: commodity_contract.COMMODITY_CODE
     * @author MyBatis Generator
     */
    public void setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode == null ? null : commodityCode.trim();
    }

    /**
     * 获取标的物: commodity_contract.SUBJECT_MATTER
     * @return 标的物: commodity_contract.SUBJECT_MATTER
     * @author MyBatis Generator
     */
    public String getSubjectMatter() {
        return subjectMatter;
    }

    /**
     * 设置标的物: commodity_contract.SUBJECT_MATTER
     * @param subjectMatter 映射数据库字段: commodity_contract.SUBJECT_MATTER
     * @author MyBatis Generator
     */
    public void setSubjectMatter(String subjectMatter) {
        this.subjectMatter = subjectMatter == null ? null : subjectMatter.trim();
    }

    /**
     * 获取商品名称: commodity_contract.COMMODITY_NAME
     * @return 商品名称: commodity_contract.COMMODITY_NAME
     * @author MyBatis Generator
     */
    public String getCommodityName() {
        return commodityName;
    }

    /**
     * 设置商品名称: commodity_contract.COMMODITY_NAME
     * @param commodityName 映射数据库字段: commodity_contract.COMMODITY_NAME
     * @author MyBatis Generator
     */
    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName == null ? null : commodityName.trim();
    }

    /**
     * 获取基本单位名称   毫升、毫克、克等: commodity_contract.UNIT
     * @return 基本单位名称   毫升、毫克、克等: commodity_contract.UNIT
     * @author MyBatis Generator
     */
    public String getUnit() {
        return unit;
    }

    /**
     * 设置基本单位名称   毫升、毫克、克等: commodity_contract.UNIT
     * @param unit 映射数据库字段: commodity_contract.UNIT
     * @author MyBatis Generator
     */
    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    /**
     * 获取基本单位名称（英文）: commodity_contract.UNIT_EN
     * @return 基本单位名称（英文）: commodity_contract.UNIT_EN
     * @author MyBatis Generator
     */
    public String getUnitEn() {
        return unitEn;
    }

    /**
     * 设置基本单位名称（英文）: commodity_contract.UNIT_EN
     * @param unitEn 映射数据库字段: commodity_contract.UNIT_EN
     * @author MyBatis Generator
     */
    public void setUnitEn(String unitEn) {
        this.unitEn = unitEn == null ? null : unitEn.trim();
    }

    /**
     * 获取规格单位名称， 瓶、饼、罐等: commodity_contract.STANDARD_UNIT_NAME
     * @return 规格单位名称， 瓶、饼、罐等: commodity_contract.STANDARD_UNIT_NAME
     * @author MyBatis Generator
     */
    public String getStandardUnitName() {
        return standardUnitName;
    }

    /**
     * 设置规格单位名称， 瓶、饼、罐等: commodity_contract.STANDARD_UNIT_NAME
     * @param standardUnitName 映射数据库字段: commodity_contract.STANDARD_UNIT_NAME
     * @author MyBatis Generator
     */
    public void setStandardUnitName(String standardUnitName) {
        this.standardUnitName = standardUnitName == null ? null : standardUnitName.trim();
    }

    /**
     * 获取规格单位对应基本单位数， 一瓶/罐对应多少基本单位: commodity_contract.STANDARD_UNIT_MULTIPLE
     * @return 规格单位对应基本单位数， 一瓶/罐对应多少基本单位: commodity_contract.STANDARD_UNIT_MULTIPLE
     * @author MyBatis Generator
     */
    public BigDecimal getStandardUnitMultiple() {
        return standardUnitMultiple;
    }

    /**
     * 设置规格单位对应基本单位数， 一瓶/罐对应多少基本单位: commodity_contract.STANDARD_UNIT_MULTIPLE
     * @param standardUnitMultiple 映射数据库字段: commodity_contract.STANDARD_UNIT_MULTIPLE
     * @author MyBatis Generator
     */
    public void setStandardUnitMultiple(BigDecimal standardUnitMultiple) {
        this.standardUnitMultiple = standardUnitMultiple;
    }

    /**
     * 获取交易单位对应基本单位数（一手）,一手对应多少毫升、毫克: commodity_contract.TRADE_UNIT_MULTIPLE
     * @return 交易单位对应基本单位数（一手）,一手对应多少毫升、毫克: commodity_contract.TRADE_UNIT_MULTIPLE
     * @author MyBatis Generator
     */
    public BigDecimal getTradeUnitMultiple() {
        return tradeUnitMultiple;
    }

    /**
     * 设置交易单位对应基本单位数（一手）,一手对应多少毫升、毫克: commodity_contract.TRADE_UNIT_MULTIPLE
     * @param tradeUnitMultiple 映射数据库字段: commodity_contract.TRADE_UNIT_MULTIPLE
     * @author MyBatis Generator
     */
    public void setTradeUnitMultiple(BigDecimal tradeUnitMultiple) {
        this.tradeUnitMultiple = tradeUnitMultiple;
    }

    /**
     * 获取状态: commodity_contract.STATUS
     * @return 状态: commodity_contract.STATUS
     * @author MyBatis Generator
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置状态: commodity_contract.STATUS
     * @param status 映射数据库字段: commodity_contract.STATUS
     * @author MyBatis Generator
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * 获取创建时间: commodity_contract.CREATE_TIME
     * @return 创建时间: commodity_contract.CREATE_TIME
     * @author MyBatis Generator
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间: commodity_contract.CREATE_TIME
     * @param createTime 映射数据库字段: commodity_contract.CREATE_TIME
     * @author MyBatis Generator
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取修改时间: commodity_contract.MODIFY_TIME
     * @return 修改时间: commodity_contract.MODIFY_TIME
     * @author MyBatis Generator
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * 设置修改时间: commodity_contract.MODIFY_TIME
     * @param modifyTime 映射数据库字段: commodity_contract.MODIFY_TIME
     * @author MyBatis Generator
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * 获取过期时间: commodity_contract.EXPIRE_TIME
     * @return 过期时间: commodity_contract.EXPIRE_TIME
     * @author MyBatis Generator
     */
    public Date getExpireTime() {
        return expireTime;
    }

    /**
     * 设置过期时间: commodity_contract.EXPIRE_TIME
     * @param expireTime 映射数据库字段: commodity_contract.EXPIRE_TIME
     * @author MyBatis Generator
     */
    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_contract
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
        CommodityContract other = (CommodityContract) that;
        return (this.getCommodityContractId() == null ? other.getCommodityContractId() == null : this.getCommodityContractId().equals(other.getCommodityContractId()))
            && (this.getOperatorInfoId() == null ? other.getOperatorInfoId() == null : this.getOperatorInfoId().equals(other.getOperatorInfoId()))
            && (this.getCommodityTypeId() == null ? other.getCommodityTypeId() == null : this.getCommodityTypeId().equals(other.getCommodityTypeId()))
            && (this.getCommodityCode() == null ? other.getCommodityCode() == null : this.getCommodityCode().equals(other.getCommodityCode()))
            && (this.getSubjectMatter() == null ? other.getSubjectMatter() == null : this.getSubjectMatter().equals(other.getSubjectMatter()))
            && (this.getCommodityName() == null ? other.getCommodityName() == null : this.getCommodityName().equals(other.getCommodityName()))
            && (this.getUnit() == null ? other.getUnit() == null : this.getUnit().equals(other.getUnit()))
            && (this.getUnitEn() == null ? other.getUnitEn() == null : this.getUnitEn().equals(other.getUnitEn()))
            && (this.getStandardUnitName() == null ? other.getStandardUnitName() == null : this.getStandardUnitName().equals(other.getStandardUnitName()))
            && (this.getStandardUnitMultiple() == null ? other.getStandardUnitMultiple() == null : this.getStandardUnitMultiple().equals(other.getStandardUnitMultiple()))
            && (this.getTradeUnitMultiple() == null ? other.getTradeUnitMultiple() == null : this.getTradeUnitMultiple().equals(other.getTradeUnitMultiple()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getModifyTime() == null ? other.getModifyTime() == null : this.getModifyTime().equals(other.getModifyTime()))
            && (this.getExpireTime() == null ? other.getExpireTime() == null : this.getExpireTime().equals(other.getExpireTime()));
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_contract
     * @author MyBatis Generator
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCommodityContractId() == null) ? 0 : getCommodityContractId().hashCode());
        result = prime * result + ((getOperatorInfoId() == null) ? 0 : getOperatorInfoId().hashCode());
        result = prime * result + ((getCommodityTypeId() == null) ? 0 : getCommodityTypeId().hashCode());
        result = prime * result + ((getCommodityCode() == null) ? 0 : getCommodityCode().hashCode());
        result = prime * result + ((getSubjectMatter() == null) ? 0 : getSubjectMatter().hashCode());
        result = prime * result + ((getCommodityName() == null) ? 0 : getCommodityName().hashCode());
        result = prime * result + ((getUnit() == null) ? 0 : getUnit().hashCode());
        result = prime * result + ((getUnitEn() == null) ? 0 : getUnitEn().hashCode());
        result = prime * result + ((getStandardUnitName() == null) ? 0 : getStandardUnitName().hashCode());
        result = prime * result + ((getStandardUnitMultiple() == null) ? 0 : getStandardUnitMultiple().hashCode());
        result = prime * result + ((getTradeUnitMultiple() == null) ? 0 : getTradeUnitMultiple().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getModifyTime() == null) ? 0 : getModifyTime().hashCode());
        result = prime * result + ((getExpireTime() == null) ? 0 : getExpireTime().hashCode());
        return result;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_contract
     * @author MyBatis Generator
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append(", commodityContractId=").append(commodityContractId);
        sb.append(", operatorInfoId=").append(operatorInfoId);
        sb.append(", commodityTypeId=").append(commodityTypeId);
        sb.append(", commodityCode=").append(commodityCode);
        sb.append(", subjectMatter=").append(subjectMatter);
        sb.append(", commodityName=").append(commodityName);
        sb.append(", unit=").append(unit);
        sb.append(", unitEn=").append(unitEn);
        sb.append(", standardUnitName=").append(standardUnitName);
        sb.append(", standardUnitMultiple=").append(standardUnitMultiple);
        sb.append(", tradeUnitMultiple=").append(tradeUnitMultiple);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", expireTime=").append(expireTime);
        sb.append("]");
        return sb.toString();
    }
}