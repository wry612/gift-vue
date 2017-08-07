package cn.datai.gift.persist.po;

import java.io.Serializable;

public class CommodityContractExtend implements Serializable {
    public static final long serialVersionUID = -1482613520L;

    /**
     * 商品合约信息id: commodity_contract_extend.COMMODITY_CONTRACT_ID
     * @author MyBatis Generator
     */
    private Long commodityContractId;

    /**
     * 包装种类，透气棉纸等等: commodity_contract_extend.PACK_TYPE
     * @author MyBatis Generator
     */
    private String packType;

    /**
     * 包装尺寸: commodity_contract_extend.PACK_SIZE
     * @author MyBatis Generator
     */
    private String packSize;

    /**
     * 精简介绍: commodity_contract_extend.INTRO_BRIEF
     * @author MyBatis Generator
     */
    private String introBrief;

    /**
     * 详细介绍（文字）: commodity_contract_extend.INTRO_DETAIL_CHAR
     * @author MyBatis Generator
     */
    private String introDetailChar;

    /**
     * 详细介绍（生成的图文链接）: commodity_contract_extend.INTRO_DETAIL_LINK
     * @author MyBatis Generator
     */
    private String introDetailLink;

    /**
     * 图片url,   url中不允许出现逗号， 多个url用逗号分隔: commodity_contract_extend.PIC_URL
     * @author MyBatis Generator
     */
    private String picUrl;

    /**
     * icon图标url: commodity_contract_extend.ICON_URL
     * @author MyBatis Generator
     */
    private String iconUrl;

    /**
     * 商品属性， json格式， key作为属性名， value作为属性值: commodity_contract_extend.PROPERTIES
     * @author MyBatis Generator
     */
    private String properties;

    /**
     * 获取商品合约信息id: commodity_contract_extend.COMMODITY_CONTRACT_ID
     * @return 商品合约信息id: commodity_contract_extend.COMMODITY_CONTRACT_ID
     * @author MyBatis Generator
     */
    public Long getCommodityContractId() {
        return commodityContractId;
    }

    /**
     * 设置商品合约信息id: commodity_contract_extend.COMMODITY_CONTRACT_ID
     * @param commodityContractId 映射数据库字段: commodity_contract_extend.COMMODITY_CONTRACT_ID
     * @author MyBatis Generator
     */
    public void setCommodityContractId(Long commodityContractId) {
        this.commodityContractId = commodityContractId;
    }

    /**
     * 获取包装种类，透气棉纸等等: commodity_contract_extend.PACK_TYPE
     * @return 包装种类，透气棉纸等等: commodity_contract_extend.PACK_TYPE
     * @author MyBatis Generator
     */
    public String getPackType() {
        return packType;
    }

    /**
     * 设置包装种类，透气棉纸等等: commodity_contract_extend.PACK_TYPE
     * @param packType 映射数据库字段: commodity_contract_extend.PACK_TYPE
     * @author MyBatis Generator
     */
    public void setPackType(String packType) {
        this.packType = packType == null ? null : packType.trim();
    }

    /**
     * 获取包装尺寸: commodity_contract_extend.PACK_SIZE
     * @return 包装尺寸: commodity_contract_extend.PACK_SIZE
     * @author MyBatis Generator
     */
    public String getPackSize() {
        return packSize;
    }

    /**
     * 设置包装尺寸: commodity_contract_extend.PACK_SIZE
     * @param packSize 映射数据库字段: commodity_contract_extend.PACK_SIZE
     * @author MyBatis Generator
     */
    public void setPackSize(String packSize) {
        this.packSize = packSize == null ? null : packSize.trim();
    }

    /**
     * 获取精简介绍: commodity_contract_extend.INTRO_BRIEF
     * @return 精简介绍: commodity_contract_extend.INTRO_BRIEF
     * @author MyBatis Generator
     */
    public String getIntroBrief() {
        return introBrief;
    }

    /**
     * 设置精简介绍: commodity_contract_extend.INTRO_BRIEF
     * @param introBrief 映射数据库字段: commodity_contract_extend.INTRO_BRIEF
     * @author MyBatis Generator
     */
    public void setIntroBrief(String introBrief) {
        this.introBrief = introBrief == null ? null : introBrief.trim();
    }

    /**
     * 获取详细介绍（文字）: commodity_contract_extend.INTRO_DETAIL_CHAR
     * @return 详细介绍（文字）: commodity_contract_extend.INTRO_DETAIL_CHAR
     * @author MyBatis Generator
     */
    public String getIntroDetailChar() {
        return introDetailChar;
    }

    /**
     * 设置详细介绍（文字）: commodity_contract_extend.INTRO_DETAIL_CHAR
     * @param introDetailChar 映射数据库字段: commodity_contract_extend.INTRO_DETAIL_CHAR
     * @author MyBatis Generator
     */
    public void setIntroDetailChar(String introDetailChar) {
        this.introDetailChar = introDetailChar == null ? null : introDetailChar.trim();
    }

    /**
     * 获取详细介绍（生成的图文链接）: commodity_contract_extend.INTRO_DETAIL_LINK
     * @return 详细介绍（生成的图文链接）: commodity_contract_extend.INTRO_DETAIL_LINK
     * @author MyBatis Generator
     */
    public String getIntroDetailLink() {
        return introDetailLink;
    }

    /**
     * 设置详细介绍（生成的图文链接）: commodity_contract_extend.INTRO_DETAIL_LINK
     * @param introDetailLink 映射数据库字段: commodity_contract_extend.INTRO_DETAIL_LINK
     * @author MyBatis Generator
     */
    public void setIntroDetailLink(String introDetailLink) {
        this.introDetailLink = introDetailLink == null ? null : introDetailLink.trim();
    }

    /**
     * 获取图片url,   url中不允许出现逗号， 多个url用逗号分隔: commodity_contract_extend.PIC_URL
     * @return 图片url,   url中不允许出现逗号， 多个url用逗号分隔: commodity_contract_extend.PIC_URL
     * @author MyBatis Generator
     */
    public String getPicUrl() {
        return picUrl;
    }

    /**
     * 设置图片url,   url中不允许出现逗号， 多个url用逗号分隔: commodity_contract_extend.PIC_URL
     * @param picUrl 映射数据库字段: commodity_contract_extend.PIC_URL
     * @author MyBatis Generator
     */
    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl == null ? null : picUrl.trim();
    }

    /**
     * 获取icon图标url: commodity_contract_extend.ICON_URL
     * @return icon图标url: commodity_contract_extend.ICON_URL
     * @author MyBatis Generator
     */
    public String getIconUrl() {
        return iconUrl;
    }

    /**
     * 设置icon图标url: commodity_contract_extend.ICON_URL
     * @param iconUrl 映射数据库字段: commodity_contract_extend.ICON_URL
     * @author MyBatis Generator
     */
    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl == null ? null : iconUrl.trim();
    }

    /**
     * 获取商品属性， json格式， key作为属性名， value作为属性值: commodity_contract_extend.PROPERTIES
     * @return 商品属性， json格式， key作为属性名， value作为属性值: commodity_contract_extend.PROPERTIES
     * @author MyBatis Generator
     */
    public String getProperties() {
        return properties;
    }

    /**
     * 设置商品属性， json格式， key作为属性名， value作为属性值: commodity_contract_extend.PROPERTIES
     * @param properties 映射数据库字段: commodity_contract_extend.PROPERTIES
     * @author MyBatis Generator
     */
    public void setProperties(String properties) {
        this.properties = properties == null ? null : properties.trim();
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_contract_extend
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
        CommodityContractExtend other = (CommodityContractExtend) that;
        return (this.getCommodityContractId() == null ? other.getCommodityContractId() == null : this.getCommodityContractId().equals(other.getCommodityContractId()))
            && (this.getPackType() == null ? other.getPackType() == null : this.getPackType().equals(other.getPackType()))
            && (this.getPackSize() == null ? other.getPackSize() == null : this.getPackSize().equals(other.getPackSize()))
            && (this.getIntroBrief() == null ? other.getIntroBrief() == null : this.getIntroBrief().equals(other.getIntroBrief()))
            && (this.getIntroDetailChar() == null ? other.getIntroDetailChar() == null : this.getIntroDetailChar().equals(other.getIntroDetailChar()))
            && (this.getIntroDetailLink() == null ? other.getIntroDetailLink() == null : this.getIntroDetailLink().equals(other.getIntroDetailLink()))
            && (this.getPicUrl() == null ? other.getPicUrl() == null : this.getPicUrl().equals(other.getPicUrl()))
            && (this.getIconUrl() == null ? other.getIconUrl() == null : this.getIconUrl().equals(other.getIconUrl()))
            && (this.getProperties() == null ? other.getProperties() == null : this.getProperties().equals(other.getProperties()));
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_contract_extend
     * @author MyBatis Generator
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCommodityContractId() == null) ? 0 : getCommodityContractId().hashCode());
        result = prime * result + ((getPackType() == null) ? 0 : getPackType().hashCode());
        result = prime * result + ((getPackSize() == null) ? 0 : getPackSize().hashCode());
        result = prime * result + ((getIntroBrief() == null) ? 0 : getIntroBrief().hashCode());
        result = prime * result + ((getIntroDetailChar() == null) ? 0 : getIntroDetailChar().hashCode());
        result = prime * result + ((getIntroDetailLink() == null) ? 0 : getIntroDetailLink().hashCode());
        result = prime * result + ((getPicUrl() == null) ? 0 : getPicUrl().hashCode());
        result = prime * result + ((getIconUrl() == null) ? 0 : getIconUrl().hashCode());
        result = prime * result + ((getProperties() == null) ? 0 : getProperties().hashCode());
        return result;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_contract_extend
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
        sb.append(", packType=").append(packType);
        sb.append(", packSize=").append(packSize);
        sb.append(", introBrief=").append(introBrief);
        sb.append(", introDetailChar=").append(introDetailChar);
        sb.append(", introDetailLink=").append(introDetailLink);
        sb.append(", picUrl=").append(picUrl);
        sb.append(", iconUrl=").append(iconUrl);
        sb.append(", properties=").append(properties);
        sb.append("]");
        return sb.toString();
    }
}