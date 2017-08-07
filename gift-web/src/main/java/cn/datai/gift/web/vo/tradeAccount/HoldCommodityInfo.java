package cn.datai.gift.web.vo.tradeAccount;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 用户交易账户中持有的商品信息
 * Created by zhangyutao on 2017/4/6.
 */
public class HoldCommodityInfo {

    /**
     * 商品合约信息id
     */
    private Long commodityContractId;

    /**
     * 运营商id
     */
    private Long operatorInfoId;

    /**
     * 商品编号
     */
    private String commodityCode;

    /**
     * 标的物
     */
    private String subjectMatter;

    /**
     * 商品类型
     */
    private Long commodityTypeId;

    /**
     * 商品类型code
     */
    private String commodityTypeCode;

    /**
     * 商品名称
     */
    private String commodityName;

    /**
     * 基本单位名称   毫升、毫克、克等
     */
    private String unit;

    /**
     * 基本单位名称（英文）
     */
    private String unitEn;

    /**
     * 规格单位名称， 瓶、饼、罐等
     */
    private String standardUnitName;

    /**
     * 规格单位对应基本单位数， 一瓶/罐对应多少基本单位
     */
    private BigDecimal standardUnitMultiple;

    /**
     * 交易单位对应基本单位数（一手）,一手对应多少毫升、毫克
     */
    private BigDecimal tradeUnitMultiple;

    /**
     * 商品当前单位价格，单位：分, 此值乘以商品单位数量即为当前总价
     */
    private String lastUnitPrice;

    /**
     * 商品的规格单位价格， 单位分
     */
    private String standardPrice;

    /**
     * 持有商品的数量
     */
    private BigDecimal holdCommodityQuantity;

    /**
     * 持有商品原始总价（原始价格）,单位元， 此值除以持有的商品数量就是成本价
     */
    private String holdCommodityTotalOriginPrice;

    private String iconUrl;

    private String picUrl;

    private String introDetailLink;

    private String typeName;

    private Date expireTime;

    public Date getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public String getIntroDetailLink() {
        return introDetailLink;
    }

    public void setIntroDetailLink(String introDetailLink) {
        this.introDetailLink = introDetailLink;
    }

    public String getCommodityTypeCode() {
        return commodityTypeCode;
    }

    public void setCommodityTypeCode(String commodityTypeCode) {
        this.commodityTypeCode = commodityTypeCode;
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

    public String getLastUnitPrice() {
        return lastUnitPrice;
    }

    public void setLastUnitPrice(String lastUnitPrice) {
        this.lastUnitPrice = lastUnitPrice;
    }

    public String getStandardPrice() {
        return standardPrice;
    }

    public void setStandardPrice(String standardPrice) {
        this.standardPrice = standardPrice;
    }

    public BigDecimal getHoldCommodityQuantity() {
        return holdCommodityQuantity;
    }

    public void setHoldCommodityQuantity(BigDecimal holdCommodityQuantity) {
        this.holdCommodityQuantity = holdCommodityQuantity;
    }

    public String getHoldCommodityTotalOriginPrice() {
        return holdCommodityTotalOriginPrice;
    }

    public void setHoldCommodityTotalOriginPrice(String holdCommodityTotalOriginPrice) {
        this.holdCommodityTotalOriginPrice = holdCommodityTotalOriginPrice;
    }
}
