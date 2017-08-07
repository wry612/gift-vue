package cn.datai.gift.web.vo.gift;


import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 大礼包详细信息
 */
public class BigGiftDetail{

    /**
     * 大礼包id
     */
    private long id;

    /**
     * 唯一性code
     */
    private String code;

    /**
     * 大礼包类型：0：指定单个受赠人    1：拼手气    2：普通、平均   3：指定配额
     */
    private String type;

    /**
     * 祝福语
     */
    private String greeting;

    /**
     * 赠与人头像url
     */
    private String headImg;

    /**
     * 赠与人昵称
     */
    private String nickname;

    /**
     * 商品id
     */
    private long commodityId;

    /**
     * 商品名称
     */
    private String commodityName;

    /**
     * 商品单位名称
     */
    private String commodityUnitName;

    /**
     * 受赠人剩余个数
     */
    private int doneeSurplus;

    /**
     * 受赠人数配额
     */
    private int doneeQuota;

    /**
     * 商品剩余数量
     */
    private BigDecimal commoditySurplusQuantity;

    /**
     * 大礼包中商品总数
     */
    private BigDecimal commodityTotalQuantity;

    /**
     * 单位商品价格（单位元）
     */
    private String commodityPrice;

    /**
     * 商品标的物
     */
    private String commodityMatter;

    private String unit;

    private String  unitEn;

    private String typeName;

    private Date expiredTime;

    /**
     * 当前用户抢的小礼包信息
     */
    private GiftGrabInfo selfGrabInfo;

    /**
     * 其他用户抢的小礼包信息列表
     */
    private List<GiftGrabInfo> othersGrabInfoList;

    public Date getExpiredTime() {
        return expiredTime;
    }

    public void setExpiredTime(Date expiredTime) {
        this.expiredTime = expiredTime;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    public String getHeadImg() {
        return headImg;
    }

    public void setHeadImg(String headImg) {
        this.headImg = headImg;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public long getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(long commodityId) {
        this.commodityId = commodityId;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public String getCommodityUnitName() {
        return commodityUnitName;
    }

    public void setCommodityUnitName(String commodityUnitName) {
        this.commodityUnitName = commodityUnitName;
    }

    public int getDoneeSurplus() {
        return doneeSurplus;
    }

    public void setDoneeSurplus(int doneeSurplus) {
        this.doneeSurplus = doneeSurplus;
    }

    public int getDoneeQuota() {
        return doneeQuota;
    }

    public void setDoneeQuota(int doneeQuota) {
        this.doneeQuota = doneeQuota;
    }

    public BigDecimal getCommoditySurplusQuantity() {
        return commoditySurplusQuantity;
    }

    public void setCommoditySurplusQuantity(BigDecimal commoditySurplusQuantity) {
        this.commoditySurplusQuantity = commoditySurplusQuantity;
    }

    public BigDecimal getCommodityTotalQuantity() {
        return commodityTotalQuantity;
    }

    public void setCommodityTotalQuantity(BigDecimal commodityTotalQuantity) {
        this.commodityTotalQuantity = commodityTotalQuantity;
    }

    public String getCommodityPrice() {
        return commodityPrice;
    }

    public void setCommodityPrice(String commodityPrice) {
        this.commodityPrice = commodityPrice;
    }

    public String getCommodityMatter() {
        return commodityMatter;
    }

    public void setCommodityMatter(String commodityMatter) {
        this.commodityMatter = commodityMatter;
    }

    public GiftGrabInfo getSelfGrabInfo() {
        return selfGrabInfo;
    }

    public void setSelfGrabInfo(GiftGrabInfo selfGrabInfo) {
        this.selfGrabInfo = selfGrabInfo;
    }

    public List<GiftGrabInfo> getOthersGrabInfoList() {
        return othersGrabInfoList;
    }

    public void setOthersGrabInfoList(List<GiftGrabInfo> othersGrabInfoList) {
        this.othersGrabInfoList = othersGrabInfoList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        BigGiftDetail that = (BigGiftDetail) o;

        return new EqualsBuilder()
                .append(id, that.id)
                .append(commodityId, that.commodityId)
                .append(doneeSurplus, that.doneeSurplus)
                .append(doneeQuota, that.doneeQuota)
                .append(type, that.type)
                .append(greeting, that.greeting)
                .append(headImg, that.headImg)
                .append(nickname, that.nickname)
                .append(commodityName, that.commodityName)
                .append(commodityUnitName, that.commodityUnitName)
                .append(commoditySurplusQuantity, that.commoditySurplusQuantity)
                .append(commodityTotalQuantity, that.commodityTotalQuantity)
                .append(commodityPrice, that.commodityPrice)
                .append(commodityMatter, that.commodityMatter)
                .append(selfGrabInfo, that.selfGrabInfo)
                .append(othersGrabInfoList, that.othersGrabInfoList)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(id)
                .append(type)
                .append(greeting)
                .append(headImg)
                .append(nickname)
                .append(commodityId)
                .append(commodityName)
                .append(commodityUnitName)
                .append(doneeSurplus)
                .append(doneeQuota)
                .append(commoditySurplusQuantity)
                .append(commodityTotalQuantity)
                .append(commodityPrice)
                .append(commodityMatter)
                .append(selfGrabInfo)
                .append(othersGrabInfoList)
                .toHashCode();
    }

    @Override
    public String toString() {
        return "BigGiftDetail{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", greeting='" + greeting + '\'' +
                ", headImg='" + headImg + '\'' +
                ", nickname='" + nickname + '\'' +
                ", commodityId=" + commodityId +
                ", commodityName='" + commodityName + '\'' +
                ", commodityUnitName='" + commodityUnitName + '\'' +
                ", doneeSurplus=" + doneeSurplus +
                ", doneeQuota=" + doneeQuota +
                ", commoditySurplusQuantity=" + commoditySurplusQuantity +
                ", commodityTotalQuantity=" + commodityTotalQuantity +
                ", commodityPrice='" + commodityPrice + '\'' +
                ", commodityMatter='" + commodityMatter + '\'' +
                ", selfGrabInfo=" + selfGrabInfo +
                ", othersGrabInfoList=" + othersGrabInfoList +
                '}';
    }
}
