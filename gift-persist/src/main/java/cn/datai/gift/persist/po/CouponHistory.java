package cn.datai.gift.persist.po;

import java.io.Serializable;
import java.util.Date;

public class CouponHistory implements Serializable {
    public static final long serialVersionUID = -256199707L;

    /**
     * 券历史记录id: coupon_history.COUPON_HISTORY_ID
     * @author MyBatis Generator
     */
    private Long couponHistoryId;

    /**
     * 券明细id: coupon_history.COUPON_DETAIL_ID
     * @author MyBatis Generator
     */
    private Long couponDetailId;

    /**
     * 券号: coupon_history.CODE
     * @author MyBatis Generator
     */
    private String code;

    /**
     * 记录相关的发券用券明细: coupon_history.RESULT_DETAIL
     * @author MyBatis Generator
     */
    private String resultDetail;

    /**
     * 0:用户   1：运营商: coupon_history.ACCOUNT_TYPE
     * @author MyBatis Generator
     */
    private String accountType;

    /**
     * 账户id: coupon_history.ACCOUNT_ID
     * @author MyBatis Generator
     */
    private Long accountId;

    /**
     * 0:发券    1：用券: coupon_history.GIVE_OR_USE
     * @author MyBatis Generator
     */
    private String giveOrUse;

    /**
     * 操作时间: coupon_history.OPERATE_TIME
     * @author MyBatis Generator
     */
    private Date operateTime;

    /**
     * 获取券历史记录id: coupon_history.COUPON_HISTORY_ID
     * @return 券历史记录id: coupon_history.COUPON_HISTORY_ID
     * @author MyBatis Generator
     */
    public Long getCouponHistoryId() {
        return couponHistoryId;
    }

    /**
     * 设置券历史记录id: coupon_history.COUPON_HISTORY_ID
     * @param couponHistoryId 映射数据库字段: coupon_history.COUPON_HISTORY_ID
     * @author MyBatis Generator
     */
    public void setCouponHistoryId(Long couponHistoryId) {
        this.couponHistoryId = couponHistoryId;
    }

    /**
     * 获取券明细id: coupon_history.COUPON_DETAIL_ID
     * @return 券明细id: coupon_history.COUPON_DETAIL_ID
     * @author MyBatis Generator
     */
    public Long getCouponDetailId() {
        return couponDetailId;
    }

    /**
     * 设置券明细id: coupon_history.COUPON_DETAIL_ID
     * @param couponDetailId 映射数据库字段: coupon_history.COUPON_DETAIL_ID
     * @author MyBatis Generator
     */
    public void setCouponDetailId(Long couponDetailId) {
        this.couponDetailId = couponDetailId;
    }

    /**
     * 获取券号: coupon_history.CODE
     * @return 券号: coupon_history.CODE
     * @author MyBatis Generator
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置券号: coupon_history.CODE
     * @param code 映射数据库字段: coupon_history.CODE
     * @author MyBatis Generator
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * 获取记录相关的发券用券明细: coupon_history.RESULT_DETAIL
     * @return 记录相关的发券用券明细: coupon_history.RESULT_DETAIL
     * @author MyBatis Generator
     */
    public String getResultDetail() {
        return resultDetail;
    }

    /**
     * 设置记录相关的发券用券明细: coupon_history.RESULT_DETAIL
     * @param resultDetail 映射数据库字段: coupon_history.RESULT_DETAIL
     * @author MyBatis Generator
     */
    public void setResultDetail(String resultDetail) {
        this.resultDetail = resultDetail == null ? null : resultDetail.trim();
    }

    /**
     * 获取0:用户   1：运营商: coupon_history.ACCOUNT_TYPE
     * @return 0:用户   1：运营商: coupon_history.ACCOUNT_TYPE
     * @author MyBatis Generator
     */
    public String getAccountType() {
        return accountType;
    }

    /**
     * 设置0:用户   1：运营商: coupon_history.ACCOUNT_TYPE
     * @param accountType 映射数据库字段: coupon_history.ACCOUNT_TYPE
     * @author MyBatis Generator
     */
    public void setAccountType(String accountType) {
        this.accountType = accountType == null ? null : accountType.trim();
    }

    /**
     * 获取账户id: coupon_history.ACCOUNT_ID
     * @return 账户id: coupon_history.ACCOUNT_ID
     * @author MyBatis Generator
     */
    public Long getAccountId() {
        return accountId;
    }

    /**
     * 设置账户id: coupon_history.ACCOUNT_ID
     * @param accountId 映射数据库字段: coupon_history.ACCOUNT_ID
     * @author MyBatis Generator
     */
    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    /**
     * 获取0:发券    1：用券: coupon_history.GIVE_OR_USE
     * @return 0:发券    1：用券: coupon_history.GIVE_OR_USE
     * @author MyBatis Generator
     */
    public String getGiveOrUse() {
        return giveOrUse;
    }

    /**
     * 设置0:发券    1：用券: coupon_history.GIVE_OR_USE
     * @param giveOrUse 映射数据库字段: coupon_history.GIVE_OR_USE
     * @author MyBatis Generator
     */
    public void setGiveOrUse(String giveOrUse) {
        this.giveOrUse = giveOrUse == null ? null : giveOrUse.trim();
    }

    /**
     * 获取操作时间: coupon_history.OPERATE_TIME
     * @return 操作时间: coupon_history.OPERATE_TIME
     * @author MyBatis Generator
     */
    public Date getOperateTime() {
        return operateTime;
    }

    /**
     * 设置操作时间: coupon_history.OPERATE_TIME
     * @param operateTime 映射数据库字段: coupon_history.OPERATE_TIME
     * @author MyBatis Generator
     */
    public void setOperateTime(Date operateTime) {
        this.operateTime = operateTime;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: coupon_history
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
        CouponHistory other = (CouponHistory) that;
        return (this.getCouponHistoryId() == null ? other.getCouponHistoryId() == null : this.getCouponHistoryId().equals(other.getCouponHistoryId()))
            && (this.getCouponDetailId() == null ? other.getCouponDetailId() == null : this.getCouponDetailId().equals(other.getCouponDetailId()))
            && (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
            && (this.getResultDetail() == null ? other.getResultDetail() == null : this.getResultDetail().equals(other.getResultDetail()))
            && (this.getAccountType() == null ? other.getAccountType() == null : this.getAccountType().equals(other.getAccountType()))
            && (this.getAccountId() == null ? other.getAccountId() == null : this.getAccountId().equals(other.getAccountId()))
            && (this.getGiveOrUse() == null ? other.getGiveOrUse() == null : this.getGiveOrUse().equals(other.getGiveOrUse()))
            && (this.getOperateTime() == null ? other.getOperateTime() == null : this.getOperateTime().equals(other.getOperateTime()));
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: coupon_history
     * @author MyBatis Generator
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCouponHistoryId() == null) ? 0 : getCouponHistoryId().hashCode());
        result = prime * result + ((getCouponDetailId() == null) ? 0 : getCouponDetailId().hashCode());
        result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
        result = prime * result + ((getResultDetail() == null) ? 0 : getResultDetail().hashCode());
        result = prime * result + ((getAccountType() == null) ? 0 : getAccountType().hashCode());
        result = prime * result + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        result = prime * result + ((getGiveOrUse() == null) ? 0 : getGiveOrUse().hashCode());
        result = prime * result + ((getOperateTime() == null) ? 0 : getOperateTime().hashCode());
        return result;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: coupon_history
     * @author MyBatis Generator
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append(", couponHistoryId=").append(couponHistoryId);
        sb.append(", couponDetailId=").append(couponDetailId);
        sb.append(", code=").append(code);
        sb.append(", resultDetail=").append(resultDetail);
        sb.append(", accountType=").append(accountType);
        sb.append(", accountId=").append(accountId);
        sb.append(", giveOrUse=").append(giveOrUse);
        sb.append(", operateTime=").append(operateTime);
        sb.append("]");
        return sb.toString();
    }
}