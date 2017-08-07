package cn.datai.gift.persist.vo.commodity;

import org.springframework.util.StringUtils;

import java.math.BigDecimal;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Administrator on 2017/4/12.
 */
public class CommodityVo {

    /**
     * 商品合约信息id: COMMODITY_CONTRACT.COMMODITY_CONTRACT_ID
     * @author MyBatis Generator
     */
    private Long commodityContractId;

    /**
     * 运营商id: COMMODITY_CONTRACT.OPERATOR_INFO_ID
     * @author MyBatis Generator
     */
    private Long operatorInfoId;

    /**
     * 商品编号: COMMODITY_CONTRACT.COMMODITY_CODE
     * @author MyBatis Generator
     */
    private String commodityCode;

    /**
     * 标的物: COMMODITY_CONTRACT.SUBJECT_MATTER
     * @author MyBatis Generator
     */
    private String subjectMatter;

    /**
     * 商品类型: COMMODITY_CONTRACT.COMMODITY_TYPE
     * @author MyBatis Generator
     */
    private Long commodityTypeId;

    /**
     * 商品名称: COMMODITY_CONTRACT.COMMODITY_NAME
     * @author MyBatis Generator
     */
    private String commodityName;

    /**
     * 基本单位名称   毫升、毫克、克等: COMMODITY_CONTRACT.UNIT
     * @author MyBatis Generator
     */
    private String unit;

    /**
     * 基本单位名称（英文）: COMMODITY_CONTRACT.UNIT_EN
     * @author MyBatis Generator
     */
    private String unitEn;

    /**
     * 规格单位名称， 瓶、饼、罐等: COMMODITY_CONTRACT.STANDARD_UNIT_NAME
     * @author MyBatis Generator
     */
    private String standardUnitName;

    /**
     * 规格单位对应基本单位数， 一瓶/罐对应多少基本单位: COMMODITY_CONTRACT.STANDARD_UNIT_MULTIPLE
     * @author MyBatis Generator
     */
    private BigDecimal standardUnitMultiple;

    /**
     * 交易单位对应基本单位数（一手）,一手对应多少毫升、毫克: COMMODITY_CONTRACT.TRADE_UNIT_MULTIPLE
     * @author MyBatis Generator
     */
    private BigDecimal tradeUnitMultiple;

    /**
     * 状态: COMMODITY_CONTRACT.STATUS
     * @author MyBatis Generator
     */
    private String status;

    /**
     * 创建时间: COMMODITY_CONTRACT.CREATE_TIME
     * @author MyBatis Generator
     */
    private Date createTime;

    /**
     * 修改时间: COMMODITY_CONTRACT.MODIFY_TIME
     * @author MyBatis Generator
     */
    private Date modifyTime;

    /**
     * 基本单位价格
     */
    private Long unitPrice;

    /**
     * 规格单位价格
     */
    private Long standardPrice;

    private String name;

    private String code;

    private String remark;


    private String packType;

    private String packSize;
    private String introBrief;
    private String introDetailChar;
    private String introDetailLink;
    private String picUrl;

    private String iconUrl;

    private Date expireTime;

    private String commodityTypeCode;

    private String typeName;

    private String properties;

    public String getProperties() {
        return properties;
    }

    public void setProperties(String properties) {
        this.properties = properties;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getCommodityTypeCode() {
        return commodityTypeCode;
    }

    public void setCommodityTypeCode(String commodityTypeCode) {
        this.commodityTypeCode = commodityTypeCode;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public Date getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
    }

    public String getPackType() {
        return packType;
    }

    public void setPackType(String packType) {
        this.packType = packType;
    }

    public String getPackSize() {
        return packSize;
    }

    public void setPackSize(String packSize) {
        this.packSize = packSize;
    }

    public String getIntroBrief() {
        return introBrief;
    }

    public void setIntroBrief(String introBrief) {
        this.introBrief = introBrief;
    }

    public String getIntroDetailChar() {
        return introDetailChar;
    }

    public void setIntroDetailChar(String introDetailChar) {
        this.introDetailChar = introDetailChar;
    }

    public String getIntroDetailLink() {
        return introDetailLink;
    }

    public void setIntroDetailLink(String introDetailLink) {
        this.introDetailLink = introDetailLink;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }


    public Long getCommodityContractId() {
        return commodityContractId;
    }

    public void setCommodityContractId(Long commodityContractId) {
        this.commodityContractId = commodityContractId;
    }

    public Long getOperatorInfoId() {
        return operatorInfoId;
    }

    public void setOperatorInfoId(Long operatorInfoId) {
        this.operatorInfoId = operatorInfoId;
    }

    public String getCommodityCode() {
        return commodityCode;
    }

    public void setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
    }

    public String getSubjectMatter() {
        return subjectMatter;
    }

    public void setSubjectMatter(String subjectMatter) {
        this.subjectMatter = subjectMatter;
    }

    public Long getCommodityTypeId() {
        return commodityTypeId;
    }

    public void setCommodityTypeId(Long commodityTypeId) {
        this.commodityTypeId = commodityTypeId;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getUnitEn() {
        return unitEn;
    }

    public void setUnitEn(String unitEn) {
        this.unitEn = unitEn;
    }

    public String getStandardUnitName() {
        return standardUnitName;
    }

    public void setStandardUnitName(String standardUnitName) {
        this.standardUnitName = standardUnitName;
    }

    public BigDecimal getStandardUnitMultiple() {
        return standardUnitMultiple;
    }

    public void setStandardUnitMultiple(BigDecimal standardUnitMultiple) {
        this.standardUnitMultiple = standardUnitMultiple;
    }

    public BigDecimal getTradeUnitMultiple() {
        return tradeUnitMultiple;
    }

    public void setTradeUnitMultiple(BigDecimal tradeUnitMultiple) {
        this.tradeUnitMultiple = tradeUnitMultiple;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Long getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Long unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Long getStandardPrice() {
        return standardPrice;
    }

    public void setStandardPrice(Long standardPrice) {
        this.standardPrice = standardPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
