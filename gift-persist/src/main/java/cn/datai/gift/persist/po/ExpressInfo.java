package cn.datai.gift.persist.po;

import java.io.Serializable;
import java.util.Date;

public class ExpressInfo implements Serializable {
    public static final long serialVersionUID = 2020032597L;

    /**
     * 物流跟踪信息id(自增): express_info.EXPRESS_INFO_ID
     * @author MyBatis Generator
     */
    private Long expressInfoId;

    /**
     * 用户id: express_info.USER_INFO_ID
     * @author MyBatis Generator
     */
    private Long userInfoId;

    /**
     * 快递公司名称: express_info.EXP_TEXT_NAME
     * @author MyBatis Generator
     */
    private String expTextName;

    /**
     * 快递公司简称: express_info.EXP_SPELL_NAME
     * @author MyBatis Generator
     */
    private String expSpellName;

    /**
     * 快递单号: express_info.MAIL_NO
     * @author MyBatis Generator
     */
    private String mailNo;

    /**
     * 数据最后查询时间: express_info.QUERY_TIME
     * @author MyBatis Generator
     */
    private Date queryTime;

    /**
     * 数据最后更新时间: express_info.DATA_UPDATE_TIME
     * @author MyBatis Generator
     */
    private Date dataUpdateTime;

    /**
     * 状态： -1 待查询 0 查询异常 1 暂无记录 2 在途中 3 派送中 4 已签收 5 用户拒签 6 疑难件 7 无效单  8 超时单 9 签收失败 10 退回: express_info.STATUS
     * @author MyBatis Generator
     */
    private String status;

    /**
     * 快递公司电话: express_info.TEL
     * @author MyBatis Generator
     */
    private String tel;

    /**
     * 具体快递路径信息, json格式， 按时间排序 如：   [{"time": “2016-06-26 12:26”, "context": "已签收,签收人是:【本人】"},{"time": “2016-06-25 15:31”, "context": "【陕西陇县公司】的派件员【西城业务员】正在派件"}]: express_info.DATUM
     * @author MyBatis Generator
     */
    private String datum;

    /**
     * 收货人姓名: express_info.RECEIVER_NAME
     * @author MyBatis Generator
     */
    private String receiverName;

    /**
     * 收货人联系方式: express_info.RECEIVER_CONTACT
     * @author MyBatis Generator
     */
    private String receiverContact;

    /**
     * 收货人地址: express_info.RECEIVER_ADDRESS
     * @author MyBatis Generator
     */
    private String receiverAddress;

    /**
     * 记录创建时间: express_info.CREATE_TIME
     * @author MyBatis Generator
     */
    private Date createTime;

    /**
     * 获取物流跟踪信息id(自增): express_info.EXPRESS_INFO_ID
     * @return 物流跟踪信息id(自增): express_info.EXPRESS_INFO_ID
     * @author MyBatis Generator
     */
    public Long getExpressInfoId() {
        return expressInfoId;
    }

    /**
     * 设置物流跟踪信息id(自增): express_info.EXPRESS_INFO_ID
     * @param expressInfoId 映射数据库字段: express_info.EXPRESS_INFO_ID
     * @author MyBatis Generator
     */
    public void setExpressInfoId(Long expressInfoId) {
        this.expressInfoId = expressInfoId;
    }

    /**
     * 获取用户id: express_info.USER_INFO_ID
     * @return 用户id: express_info.USER_INFO_ID
     * @author MyBatis Generator
     */
    public Long getUserInfoId() {
        return userInfoId;
    }

    /**
     * 设置用户id: express_info.USER_INFO_ID
     * @param userInfoId 映射数据库字段: express_info.USER_INFO_ID
     * @author MyBatis Generator
     */
    public void setUserInfoId(Long userInfoId) {
        this.userInfoId = userInfoId;
    }

    /**
     * 获取快递公司名称: express_info.EXP_TEXT_NAME
     * @return 快递公司名称: express_info.EXP_TEXT_NAME
     * @author MyBatis Generator
     */
    public String getExpTextName() {
        return expTextName;
    }

    /**
     * 设置快递公司名称: express_info.EXP_TEXT_NAME
     * @param expTextName 映射数据库字段: express_info.EXP_TEXT_NAME
     * @author MyBatis Generator
     */
    public void setExpTextName(String expTextName) {
        this.expTextName = expTextName == null ? null : expTextName.trim();
    }

    /**
     * 获取快递公司简称: express_info.EXP_SPELL_NAME
     * @return 快递公司简称: express_info.EXP_SPELL_NAME
     * @author MyBatis Generator
     */
    public String getExpSpellName() {
        return expSpellName;
    }

    /**
     * 设置快递公司简称: express_info.EXP_SPELL_NAME
     * @param expSpellName 映射数据库字段: express_info.EXP_SPELL_NAME
     * @author MyBatis Generator
     */
    public void setExpSpellName(String expSpellName) {
        this.expSpellName = expSpellName == null ? null : expSpellName.trim();
    }

    /**
     * 获取快递单号: express_info.MAIL_NO
     * @return 快递单号: express_info.MAIL_NO
     * @author MyBatis Generator
     */
    public String getMailNo() {
        return mailNo;
    }

    /**
     * 设置快递单号: express_info.MAIL_NO
     * @param mailNo 映射数据库字段: express_info.MAIL_NO
     * @author MyBatis Generator
     */
    public void setMailNo(String mailNo) {
        this.mailNo = mailNo == null ? null : mailNo.trim();
    }

    /**
     * 获取数据最后查询时间: express_info.QUERY_TIME
     * @return 数据最后查询时间: express_info.QUERY_TIME
     * @author MyBatis Generator
     */
    public Date getQueryTime() {
        return queryTime;
    }

    /**
     * 设置数据最后查询时间: express_info.QUERY_TIME
     * @param queryTime 映射数据库字段: express_info.QUERY_TIME
     * @author MyBatis Generator
     */
    public void setQueryTime(Date queryTime) {
        this.queryTime = queryTime;
    }

    /**
     * 获取数据最后更新时间: express_info.DATA_UPDATE_TIME
     * @return 数据最后更新时间: express_info.DATA_UPDATE_TIME
     * @author MyBatis Generator
     */
    public Date getDataUpdateTime() {
        return dataUpdateTime;
    }

    /**
     * 设置数据最后更新时间: express_info.DATA_UPDATE_TIME
     * @param dataUpdateTime 映射数据库字段: express_info.DATA_UPDATE_TIME
     * @author MyBatis Generator
     */
    public void setDataUpdateTime(Date dataUpdateTime) {
        this.dataUpdateTime = dataUpdateTime;
    }

    /**
     * 获取状态： -1 待查询 0 查询异常 1 暂无记录 2 在途中 3 派送中 4 已签收 5 用户拒签 6 疑难件 7 无效单  8 超时单 9 签收失败 10 退回: express_info.STATUS
     * @return 状态： -1 待查询 0 查询异常 1 暂无记录 2 在途中 3 派送中 4 已签收 5 用户拒签 6 疑难件 7 无效单  8 超时单 9 签收失败 10 退回: express_info.STATUS
     * @author MyBatis Generator
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置状态： -1 待查询 0 查询异常 1 暂无记录 2 在途中 3 派送中 4 已签收 5 用户拒签 6 疑难件 7 无效单  8 超时单 9 签收失败 10 退回: express_info.STATUS
     * @param status 映射数据库字段: express_info.STATUS
     * @author MyBatis Generator
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * 获取快递公司电话: express_info.TEL
     * @return 快递公司电话: express_info.TEL
     * @author MyBatis Generator
     */
    public String getTel() {
        return tel;
    }

    /**
     * 设置快递公司电话: express_info.TEL
     * @param tel 映射数据库字段: express_info.TEL
     * @author MyBatis Generator
     */
    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    /**
     * 获取具体快递路径信息, json格式， 按时间排序 如：   [{"time": “2016-06-26 12:26”, "context": "已签收,签收人是:【本人】"},{"time": “2016-06-25 15:31”, "context": "【陕西陇县公司】的派件员【西城业务员】正在派件"}]: express_info.DATUM
     * @return 具体快递路径信息, json格式， 按时间排序 如：   [{"time": “2016-06-26 12:26”, "context": "已签收,签收人是:【本人】"},{"time": “2016-06-25 15:31”, "context": "【陕西陇县公司】的派件员【西城业务员】正在派件"}]: express_info.DATUM
     * @author MyBatis Generator
     */
    public String getDatum() {
        return datum;
    }

    /**
     * 设置具体快递路径信息, json格式， 按时间排序 如：   [{"time": “2016-06-26 12:26”, "context": "已签收,签收人是:【本人】"},{"time": “2016-06-25 15:31”, "context": "【陕西陇县公司】的派件员【西城业务员】正在派件"}]: express_info.DATUM
     * @param datum 映射数据库字段: express_info.DATUM
     * @author MyBatis Generator
     */
    public void setDatum(String datum) {
        this.datum = datum == null ? null : datum.trim();
    }

    /**
     * 获取收货人姓名: express_info.RECEIVER_NAME
     * @return 收货人姓名: express_info.RECEIVER_NAME
     * @author MyBatis Generator
     */
    public String getReceiverName() {
        return receiverName;
    }

    /**
     * 设置收货人姓名: express_info.RECEIVER_NAME
     * @param receiverName 映射数据库字段: express_info.RECEIVER_NAME
     * @author MyBatis Generator
     */
    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName == null ? null : receiverName.trim();
    }

    /**
     * 获取收货人联系方式: express_info.RECEIVER_CONTACT
     * @return 收货人联系方式: express_info.RECEIVER_CONTACT
     * @author MyBatis Generator
     */
    public String getReceiverContact() {
        return receiverContact;
    }

    /**
     * 设置收货人联系方式: express_info.RECEIVER_CONTACT
     * @param receiverContact 映射数据库字段: express_info.RECEIVER_CONTACT
     * @author MyBatis Generator
     */
    public void setReceiverContact(String receiverContact) {
        this.receiverContact = receiverContact == null ? null : receiverContact.trim();
    }

    /**
     * 获取收货人地址: express_info.RECEIVER_ADDRESS
     * @return 收货人地址: express_info.RECEIVER_ADDRESS
     * @author MyBatis Generator
     */
    public String getReceiverAddress() {
        return receiverAddress;
    }

    /**
     * 设置收货人地址: express_info.RECEIVER_ADDRESS
     * @param receiverAddress 映射数据库字段: express_info.RECEIVER_ADDRESS
     * @author MyBatis Generator
     */
    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress == null ? null : receiverAddress.trim();
    }

    /**
     * 获取记录创建时间: express_info.CREATE_TIME
     * @return 记录创建时间: express_info.CREATE_TIME
     * @author MyBatis Generator
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置记录创建时间: express_info.CREATE_TIME
     * @param createTime 映射数据库字段: express_info.CREATE_TIME
     * @author MyBatis Generator
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: express_info
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
        ExpressInfo other = (ExpressInfo) that;
        return (this.getExpressInfoId() == null ? other.getExpressInfoId() == null : this.getExpressInfoId().equals(other.getExpressInfoId()))
            && (this.getUserInfoId() == null ? other.getUserInfoId() == null : this.getUserInfoId().equals(other.getUserInfoId()))
            && (this.getExpTextName() == null ? other.getExpTextName() == null : this.getExpTextName().equals(other.getExpTextName()))
            && (this.getExpSpellName() == null ? other.getExpSpellName() == null : this.getExpSpellName().equals(other.getExpSpellName()))
            && (this.getMailNo() == null ? other.getMailNo() == null : this.getMailNo().equals(other.getMailNo()))
            && (this.getQueryTime() == null ? other.getQueryTime() == null : this.getQueryTime().equals(other.getQueryTime()))
            && (this.getDataUpdateTime() == null ? other.getDataUpdateTime() == null : this.getDataUpdateTime().equals(other.getDataUpdateTime()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getTel() == null ? other.getTel() == null : this.getTel().equals(other.getTel()))
            && (this.getDatum() == null ? other.getDatum() == null : this.getDatum().equals(other.getDatum()))
            && (this.getReceiverName() == null ? other.getReceiverName() == null : this.getReceiverName().equals(other.getReceiverName()))
            && (this.getReceiverContact() == null ? other.getReceiverContact() == null : this.getReceiverContact().equals(other.getReceiverContact()))
            && (this.getReceiverAddress() == null ? other.getReceiverAddress() == null : this.getReceiverAddress().equals(other.getReceiverAddress()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()));
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: express_info
     * @author MyBatis Generator
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getExpressInfoId() == null) ? 0 : getExpressInfoId().hashCode());
        result = prime * result + ((getUserInfoId() == null) ? 0 : getUserInfoId().hashCode());
        result = prime * result + ((getExpTextName() == null) ? 0 : getExpTextName().hashCode());
        result = prime * result + ((getExpSpellName() == null) ? 0 : getExpSpellName().hashCode());
        result = prime * result + ((getMailNo() == null) ? 0 : getMailNo().hashCode());
        result = prime * result + ((getQueryTime() == null) ? 0 : getQueryTime().hashCode());
        result = prime * result + ((getDataUpdateTime() == null) ? 0 : getDataUpdateTime().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getTel() == null) ? 0 : getTel().hashCode());
        result = prime * result + ((getDatum() == null) ? 0 : getDatum().hashCode());
        result = prime * result + ((getReceiverName() == null) ? 0 : getReceiverName().hashCode());
        result = prime * result + ((getReceiverContact() == null) ? 0 : getReceiverContact().hashCode());
        result = prime * result + ((getReceiverAddress() == null) ? 0 : getReceiverAddress().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        return result;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: express_info
     * @author MyBatis Generator
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append(", expressInfoId=").append(expressInfoId);
        sb.append(", userInfoId=").append(userInfoId);
        sb.append(", expTextName=").append(expTextName);
        sb.append(", expSpellName=").append(expSpellName);
        sb.append(", mailNo=").append(mailNo);
        sb.append(", queryTime=").append(queryTime);
        sb.append(", dataUpdateTime=").append(dataUpdateTime);
        sb.append(", status=").append(status);
        sb.append(", tel=").append(tel);
        sb.append(", datum=").append(datum);
        sb.append(", receiverName=").append(receiverName);
        sb.append(", receiverContact=").append(receiverContact);
        sb.append(", receiverAddress=").append(receiverAddress);
        sb.append(", createTime=").append(createTime);
        sb.append("]");
        return sb.toString();
    }
}