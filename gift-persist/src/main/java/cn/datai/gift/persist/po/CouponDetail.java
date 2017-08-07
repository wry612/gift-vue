package cn.datai.gift.persist.po;

import java.io.Serializable;
import java.util.Date;

public class CouponDetail implements Serializable {
    public static final long serialVersionUID = -1650484512L;

    /**
     * 券明细id: coupon_detail.COUPON_DETAIL_ID
     * @author MyBatis Generator
     */
    private Long couponDetailId;

    /**
     * 券id: coupon_detail.COUPON_ID
     * @author MyBatis Generator
     */
    private Long couponId;

    /**
     * 券编号: coupon_detail.CODE
     * @author MyBatis Generator
     */
    private String code;

    /**
     * 券密码: coupon_detail.PASSWORD
     * @author MyBatis Generator
     */
    private String password;

    /**
     * 生成时间: coupon_detail.TIME_CREATE
     * @author MyBatis Generator
     */
    private Date timeCreate;

    /**
     * 过期时间: coupon_detail.TIME_EXPIRE
     * @author MyBatis Generator
     */
    private Date timeExpire;

    /**
     * 领取时间: coupon_detail.TIME_RECEIVE
     * @author MyBatis Generator
     */
    private Date timeReceive;

    /**
     * 0：未使用   1：已使用: coupon_detail.IS_USED
     * @author MyBatis Generator
     */
    private String isUsed;

    /**
     * 是否启用: coupon_detail.IS_AVALID
     * @author MyBatis Generator
     */
    private String isAvalid;

    /**
     * 发送券的主体id， 可为运营商、用户、特别用户: coupon_detail.PRODUCER_ID
     * @author MyBatis Generator
     */
    private Long producerId;

    /**
     * 0： 普通用户  1：特别用户    2：运营商: coupon_detail.PRODUCER_TYPE
     * @author MyBatis Generator
     */
    private String producerType;

    /**
     * 领取券的主体id， 可为运营商、用户、特别用户: coupon_detail.CONSUMER_ID
     * @author MyBatis Generator
     */
    private Long consumerId;

    /**
     * 消费者类型: coupon_detail.CONSUMER_TYPE
     * @author MyBatis Generator
     */
    private String consumerType;

    /**
     * 后台操作人: coupon_detail.MODIFY_USER
     * @author MyBatis Generator
     */
    private String modifyUser;

    /**
     * 获取券明细id: coupon_detail.COUPON_DETAIL_ID
     * @return 券明细id: coupon_detail.COUPON_DETAIL_ID
     * @author MyBatis Generator
     */
    public Long getCouponDetailId() {
        return couponDetailId;
    }

    /**
     * 设置券明细id: coupon_detail.COUPON_DETAIL_ID
     * @param couponDetailId 映射数据库字段: coupon_detail.COUPON_DETAIL_ID
     * @author MyBatis Generator
     */
    public void setCouponDetailId(Long couponDetailId) {
        this.couponDetailId = couponDetailId;
    }

    /**
     * 获取券id: coupon_detail.COUPON_ID
     * @return 券id: coupon_detail.COUPON_ID
     * @author MyBatis Generator
     */
    public Long getCouponId() {
        return couponId;
    }

    /**
     * 设置券id: coupon_detail.COUPON_ID
     * @param couponId 映射数据库字段: coupon_detail.COUPON_ID
     * @author MyBatis Generator
     */
    public void setCouponId(Long couponId) {
        this.couponId = couponId;
    }

    /**
     * 获取券编号: coupon_detail.CODE
     * @return 券编号: coupon_detail.CODE
     * @author MyBatis Generator
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置券编号: coupon_detail.CODE
     * @param code 映射数据库字段: coupon_detail.CODE
     * @author MyBatis Generator
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * 获取券密码: coupon_detail.PASSWORD
     * @return 券密码: coupon_detail.PASSWORD
     * @author MyBatis Generator
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置券密码: coupon_detail.PASSWORD
     * @param password 映射数据库字段: coupon_detail.PASSWORD
     * @author MyBatis Generator
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * 获取生成时间: coupon_detail.TIME_CREATE
     * @return 生成时间: coupon_detail.TIME_CREATE
     * @author MyBatis Generator
     */
    public Date getTimeCreate() {
        return timeCreate;
    }

    /**
     * 设置生成时间: coupon_detail.TIME_CREATE
     * @param timeCreate 映射数据库字段: coupon_detail.TIME_CREATE
     * @author MyBatis Generator
     */
    public void setTimeCreate(Date timeCreate) {
        this.timeCreate = timeCreate;
    }

    /**
     * 获取过期时间: coupon_detail.TIME_EXPIRE
     * @return 过期时间: coupon_detail.TIME_EXPIRE
     * @author MyBatis Generator
     */
    public Date getTimeExpire() {
        return timeExpire;
    }

    /**
     * 设置过期时间: coupon_detail.TIME_EXPIRE
     * @param timeExpire 映射数据库字段: coupon_detail.TIME_EXPIRE
     * @author MyBatis Generator
     */
    public void setTimeExpire(Date timeExpire) {
        this.timeExpire = timeExpire;
    }

    /**
     * 获取领取时间: coupon_detail.TIME_RECEIVE
     * @return 领取时间: coupon_detail.TIME_RECEIVE
     * @author MyBatis Generator
     */
    public Date getTimeReceive() {
        return timeReceive;
    }

    /**
     * 设置领取时间: coupon_detail.TIME_RECEIVE
     * @param timeReceive 映射数据库字段: coupon_detail.TIME_RECEIVE
     * @author MyBatis Generator
     */
    public void setTimeReceive(Date timeReceive) {
        this.timeReceive = timeReceive;
    }

    /**
     * 获取0：未使用   1：已使用: coupon_detail.IS_USED
     * @return 0：未使用   1：已使用: coupon_detail.IS_USED
     * @author MyBatis Generator
     */
    public String getIsUsed() {
        return isUsed;
    }

    /**
     * 设置0：未使用   1：已使用: coupon_detail.IS_USED
     * @param isUsed 映射数据库字段: coupon_detail.IS_USED
     * @author MyBatis Generator
     */
    public void setIsUsed(String isUsed) {
        this.isUsed = isUsed == null ? null : isUsed.trim();
    }

    /**
     * 获取是否启用: coupon_detail.IS_AVALID
     * @return 是否启用: coupon_detail.IS_AVALID
     * @author MyBatis Generator
     */
    public String getIsAvalid() {
        return isAvalid;
    }

    /**
     * 设置是否启用: coupon_detail.IS_AVALID
     * @param isAvalid 映射数据库字段: coupon_detail.IS_AVALID
     * @author MyBatis Generator
     */
    public void setIsAvalid(String isAvalid) {
        this.isAvalid = isAvalid == null ? null : isAvalid.trim();
    }

    /**
     * 获取发送券的主体id， 可为运营商、用户、特别用户: coupon_detail.PRODUCER_ID
     * @return 发送券的主体id， 可为运营商、用户、特别用户: coupon_detail.PRODUCER_ID
     * @author MyBatis Generator
     */
    public Long getProducerId() {
        return producerId;
    }

    /**
     * 设置发送券的主体id， 可为运营商、用户、特别用户: coupon_detail.PRODUCER_ID
     * @param producerId 映射数据库字段: coupon_detail.PRODUCER_ID
     * @author MyBatis Generator
     */
    public void setProducerId(Long producerId) {
        this.producerId = producerId;
    }

    /**
     * 获取0： 普通用户  1：特别用户    2：运营商: coupon_detail.PRODUCER_TYPE
     * @return 0： 普通用户  1：特别用户    2：运营商: coupon_detail.PRODUCER_TYPE
     * @author MyBatis Generator
     */
    public String getProducerType() {
        return producerType;
    }

    /**
     * 设置0： 普通用户  1：特别用户    2：运营商: coupon_detail.PRODUCER_TYPE
     * @param producerType 映射数据库字段: coupon_detail.PRODUCER_TYPE
     * @author MyBatis Generator
     */
    public void setProducerType(String producerType) {
        this.producerType = producerType == null ? null : producerType.trim();
    }

    /**
     * 获取领取券的主体id， 可为运营商、用户、特别用户: coupon_detail.CONSUMER_ID
     * @return 领取券的主体id， 可为运营商、用户、特别用户: coupon_detail.CONSUMER_ID
     * @author MyBatis Generator
     */
    public Long getConsumerId() {
        return consumerId;
    }

    /**
     * 设置领取券的主体id， 可为运营商、用户、特别用户: coupon_detail.CONSUMER_ID
     * @param consumerId 映射数据库字段: coupon_detail.CONSUMER_ID
     * @author MyBatis Generator
     */
    public void setConsumerId(Long consumerId) {
        this.consumerId = consumerId;
    }

    /**
     * 获取消费者类型: coupon_detail.CONSUMER_TYPE
     * @return 消费者类型: coupon_detail.CONSUMER_TYPE
     * @author MyBatis Generator
     */
    public String getConsumerType() {
        return consumerType;
    }

    /**
     * 设置消费者类型: coupon_detail.CONSUMER_TYPE
     * @param consumerType 映射数据库字段: coupon_detail.CONSUMER_TYPE
     * @author MyBatis Generator
     */
    public void setConsumerType(String consumerType) {
        this.consumerType = consumerType == null ? null : consumerType.trim();
    }

    /**
     * 获取后台操作人: coupon_detail.MODIFY_USER
     * @return 后台操作人: coupon_detail.MODIFY_USER
     * @author MyBatis Generator
     */
    public String getModifyUser() {
        return modifyUser;
    }

    /**
     * 设置后台操作人: coupon_detail.MODIFY_USER
     * @param modifyUser 映射数据库字段: coupon_detail.MODIFY_USER
     * @author MyBatis Generator
     */
    public void setModifyUser(String modifyUser) {
        this.modifyUser = modifyUser == null ? null : modifyUser.trim();
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: coupon_detail
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
        CouponDetail other = (CouponDetail) that;
        return (this.getCouponDetailId() == null ? other.getCouponDetailId() == null : this.getCouponDetailId().equals(other.getCouponDetailId()))
            && (this.getCouponId() == null ? other.getCouponId() == null : this.getCouponId().equals(other.getCouponId()))
            && (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getTimeCreate() == null ? other.getTimeCreate() == null : this.getTimeCreate().equals(other.getTimeCreate()))
            && (this.getTimeExpire() == null ? other.getTimeExpire() == null : this.getTimeExpire().equals(other.getTimeExpire()))
            && (this.getTimeReceive() == null ? other.getTimeReceive() == null : this.getTimeReceive().equals(other.getTimeReceive()))
            && (this.getIsUsed() == null ? other.getIsUsed() == null : this.getIsUsed().equals(other.getIsUsed()))
            && (this.getIsAvalid() == null ? other.getIsAvalid() == null : this.getIsAvalid().equals(other.getIsAvalid()))
            && (this.getProducerId() == null ? other.getProducerId() == null : this.getProducerId().equals(other.getProducerId()))
            && (this.getProducerType() == null ? other.getProducerType() == null : this.getProducerType().equals(other.getProducerType()))
            && (this.getConsumerId() == null ? other.getConsumerId() == null : this.getConsumerId().equals(other.getConsumerId()))
            && (this.getConsumerType() == null ? other.getConsumerType() == null : this.getConsumerType().equals(other.getConsumerType()))
            && (this.getModifyUser() == null ? other.getModifyUser() == null : this.getModifyUser().equals(other.getModifyUser()));
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: coupon_detail
     * @author MyBatis Generator
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCouponDetailId() == null) ? 0 : getCouponDetailId().hashCode());
        result = prime * result + ((getCouponId() == null) ? 0 : getCouponId().hashCode());
        result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getTimeCreate() == null) ? 0 : getTimeCreate().hashCode());
        result = prime * result + ((getTimeExpire() == null) ? 0 : getTimeExpire().hashCode());
        result = prime * result + ((getTimeReceive() == null) ? 0 : getTimeReceive().hashCode());
        result = prime * result + ((getIsUsed() == null) ? 0 : getIsUsed().hashCode());
        result = prime * result + ((getIsAvalid() == null) ? 0 : getIsAvalid().hashCode());
        result = prime * result + ((getProducerId() == null) ? 0 : getProducerId().hashCode());
        result = prime * result + ((getProducerType() == null) ? 0 : getProducerType().hashCode());
        result = prime * result + ((getConsumerId() == null) ? 0 : getConsumerId().hashCode());
        result = prime * result + ((getConsumerType() == null) ? 0 : getConsumerType().hashCode());
        result = prime * result + ((getModifyUser() == null) ? 0 : getModifyUser().hashCode());
        return result;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: coupon_detail
     * @author MyBatis Generator
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append(", couponDetailId=").append(couponDetailId);
        sb.append(", couponId=").append(couponId);
        sb.append(", code=").append(code);
        sb.append(", password=").append(password);
        sb.append(", timeCreate=").append(timeCreate);
        sb.append(", timeExpire=").append(timeExpire);
        sb.append(", timeReceive=").append(timeReceive);
        sb.append(", isUsed=").append(isUsed);
        sb.append(", isAvalid=").append(isAvalid);
        sb.append(", producerId=").append(producerId);
        sb.append(", producerType=").append(producerType);
        sb.append(", consumerId=").append(consumerId);
        sb.append(", consumerType=").append(consumerType);
        sb.append(", modifyUser=").append(modifyUser);
        sb.append("]");
        return sb.toString();
    }
}