package cn.datai.gift.persist.po;

import java.io.Serializable;
import java.util.Date;

public class Advertisement implements Serializable {
    public static final long serialVersionUID = -489080740L;

    /**
     * 广告id: advertisement.ADVERTISEMENT_ID
     * @author MyBatis Generator
     */
    private Long advertisementId;

    /**
     * 标题: advertisement.TITLE
     * @author MyBatis Generator
     */
    private String title;

    /**
     * icon，存放广告图片文件夹的相对路径: advertisement.ICON
     * @author MyBatis Generator
     */
    private String icon;

    /**
     * 链接地址，完整的url地址: advertisement.LINK
     * @author MyBatis Generator
     */
    private String link;

    /**
     * 广告创建时间: advertisement.CREATE_TIME
     * @author MyBatis Generator
     */
    private Date createTime;

    /**
     * 广告类型， BANNER：展示在banner，  NORMAL:普通广告 : advertisement.TYPE
     * @author MyBatis Generator
     */
    private String type;

    /**
     * banner展示顺序， 展示在banner上的顺序号， 值越小越靠前: advertisement.BANNER_SEQ
     * @author MyBatis Generator
     */
    private Integer bannerSeq;

    /**
     * 获取广告id: advertisement.ADVERTISEMENT_ID
     * @return 广告id: advertisement.ADVERTISEMENT_ID
     * @author MyBatis Generator
     */
    public Long getAdvertisementId() {
        return advertisementId;
    }

    /**
     * 设置广告id: advertisement.ADVERTISEMENT_ID
     * @param advertisementId 映射数据库字段: advertisement.ADVERTISEMENT_ID
     * @author MyBatis Generator
     */
    public void setAdvertisementId(Long advertisementId) {
        this.advertisementId = advertisementId;
    }

    /**
     * 获取标题: advertisement.TITLE
     * @return 标题: advertisement.TITLE
     * @author MyBatis Generator
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置标题: advertisement.TITLE
     * @param title 映射数据库字段: advertisement.TITLE
     * @author MyBatis Generator
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * 获取icon，存放广告图片文件夹的相对路径: advertisement.ICON
     * @return icon，存放广告图片文件夹的相对路径: advertisement.ICON
     * @author MyBatis Generator
     */
    public String getIcon() {
        return icon;
    }

    /**
     * 设置icon，存放广告图片文件夹的相对路径: advertisement.ICON
     * @param icon 映射数据库字段: advertisement.ICON
     * @author MyBatis Generator
     */
    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    /**
     * 获取链接地址，完整的url地址: advertisement.LINK
     * @return 链接地址，完整的url地址: advertisement.LINK
     * @author MyBatis Generator
     */
    public String getLink() {
        return link;
    }

    /**
     * 设置链接地址，完整的url地址: advertisement.LINK
     * @param link 映射数据库字段: advertisement.LINK
     * @author MyBatis Generator
     */
    public void setLink(String link) {
        this.link = link == null ? null : link.trim();
    }

    /**
     * 获取广告创建时间: advertisement.CREATE_TIME
     * @return 广告创建时间: advertisement.CREATE_TIME
     * @author MyBatis Generator
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置广告创建时间: advertisement.CREATE_TIME
     * @param createTime 映射数据库字段: advertisement.CREATE_TIME
     * @author MyBatis Generator
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取广告类型， BANNER：展示在banner，  NORMAL:普通广告 : advertisement.TYPE
     * @return 广告类型， BANNER：展示在banner，  NORMAL:普通广告 : advertisement.TYPE
     * @author MyBatis Generator
     */
    public String getType() {
        return type;
    }

    /**
     * 设置广告类型， BANNER：展示在banner，  NORMAL:普通广告 : advertisement.TYPE
     * @param type 映射数据库字段: advertisement.TYPE
     * @author MyBatis Generator
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * 获取banner展示顺序， 展示在banner上的顺序号， 值越小越靠前: advertisement.BANNER_SEQ
     * @return banner展示顺序， 展示在banner上的顺序号， 值越小越靠前: advertisement.BANNER_SEQ
     * @author MyBatis Generator
     */
    public Integer getBannerSeq() {
        return bannerSeq;
    }

    /**
     * 设置banner展示顺序， 展示在banner上的顺序号， 值越小越靠前: advertisement.BANNER_SEQ
     * @param bannerSeq 映射数据库字段: advertisement.BANNER_SEQ
     * @author MyBatis Generator
     */
    public void setBannerSeq(Integer bannerSeq) {
        this.bannerSeq = bannerSeq;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: advertisement
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
        Advertisement other = (Advertisement) that;
        return (this.getAdvertisementId() == null ? other.getAdvertisementId() == null : this.getAdvertisementId().equals(other.getAdvertisementId()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getIcon() == null ? other.getIcon() == null : this.getIcon().equals(other.getIcon()))
            && (this.getLink() == null ? other.getLink() == null : this.getLink().equals(other.getLink()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getBannerSeq() == null ? other.getBannerSeq() == null : this.getBannerSeq().equals(other.getBannerSeq()));
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: advertisement
     * @author MyBatis Generator
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAdvertisementId() == null) ? 0 : getAdvertisementId().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getIcon() == null) ? 0 : getIcon().hashCode());
        result = prime * result + ((getLink() == null) ? 0 : getLink().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getBannerSeq() == null) ? 0 : getBannerSeq().hashCode());
        return result;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: advertisement
     * @author MyBatis Generator
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append(", advertisementId=").append(advertisementId);
        sb.append(", title=").append(title);
        sb.append(", icon=").append(icon);
        sb.append(", link=").append(link);
        sb.append(", createTime=").append(createTime);
        sb.append(", type=").append(type);
        sb.append(", bannerSeq=").append(bannerSeq);
        sb.append("]");
        return sb.toString();
    }
}