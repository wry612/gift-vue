package cn.datai.gift.web.vo.gift;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by zhangyutao on 2017/3/24.
 */
public class GiftGrabInfo {
    /**
     * 头像url(相对url)
     */
    private String headImg;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 抢得小礼包的时间
     */
    private Date grabTime;

    /**
     * 抢得的商品数量
     */
    private BigDecimal grabQtn;

    public GiftGrabInfo() {
    }

    public GiftGrabInfo(String headImg, String nickname, Date grabTime, BigDecimal grabQtn) {
        this.headImg = headImg;
        this.nickname = nickname;
        this.grabTime = grabTime;
        this.grabQtn = grabQtn;
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

    public Date getGrabTime() {
        return grabTime;
    }

    public void setGrabTime(Date grabTime) {
        this.grabTime = grabTime;
    }

    public BigDecimal getGrabQtn() {
        return grabQtn;
    }

    public void setGrabQtn(BigDecimal grabQtn) {
        this.grabQtn = grabQtn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        GiftGrabInfo grabInfo = (GiftGrabInfo) o;

        return new EqualsBuilder()
                .append(headImg, grabInfo.headImg)
                .append(nickname, grabInfo.nickname)
                .append(grabTime, grabInfo.grabTime)
                .append(grabQtn, grabInfo.grabQtn)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(headImg)
                .append(nickname)
                .append(grabTime)
                .append(grabQtn)
                .toHashCode();
    }

    @Override
    public String toString() {
        return "GrabInfo{" +
                "headImg='" + headImg + '\'' +
                ", nickname='" + nickname + '\'' +
                ", grabTime=" + grabTime +
                ", grabQtn=" + grabQtn +
                '}';
    }
}
