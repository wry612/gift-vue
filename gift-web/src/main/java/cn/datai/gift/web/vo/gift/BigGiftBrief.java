package cn.datai.gift.web.vo.gift;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * 大礼包简要信息
 * Created by zhangyutao on 2017/3/24.
 */
public class BigGiftBrief {
    /**
     * 大礼包id
     */
    private long id;
    /**
     * 赠与人昵称
     */
    private String donatorNickname;
    /**
     * 赠与人头像url
     */
    private String donatorHeadImg;
    /**
     * 商品id
     */
    private long commodityId;
    /**
     * 商品名称
     */
    private String commodityName;

    /**
     * 单位商品价格（单位元）
     */
    private String commodityPrice;

    /**
     * 商品标的物
     */
    private String commodityMatter;

    private String unit;

    /**
     * 祝福语
     */
    private String greeting;

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDonatorNickname() {
        return donatorNickname;
    }

    public void setDonatorNickname(String donatorNickname) {
        this.donatorNickname = donatorNickname;
    }

    public String getDonatorHeadImg() {
        return donatorHeadImg;
    }

    public void setDonatorHeadImg(String donatorHeadImg) {
        this.donatorHeadImg = donatorHeadImg;
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

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        BigGiftBrief that = (BigGiftBrief) o;

        return new EqualsBuilder()
                .append(id, that.id)
                .append(commodityId, that.commodityId)
                .append(donatorNickname, that.donatorNickname)
                .append(donatorHeadImg, that.donatorHeadImg)
                .append(commodityName, that.commodityName)
                .append(commodityPrice, that.commodityPrice)
                .append(commodityMatter, that.commodityMatter)
                .append(greeting, that.greeting)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(id)
                .append(donatorNickname)
                .append(donatorHeadImg)
                .append(commodityId)
                .append(commodityName)
                .append(commodityPrice)
                .append(commodityMatter)
                .append(greeting)
                .toHashCode();
    }

    @Override
    public String toString() {
        return "BigGiftBrief{" +
                "id=" + id +
                ", donatorNickname='" + donatorNickname + '\'' +
                ", donatorHeadImg='" + donatorHeadImg + '\'' +
                ", commodityId=" + commodityId +
                ", commodityName='" + commodityName + '\'' +
                ", commodityPrice='" + commodityPrice + '\'' +
                ", commodityMatter='" + commodityMatter + '\'' +
                ", greeting='" + greeting + '\'' +
                '}';
    }
}
