package cn.datai.gift.persist.po;

import java.io.Serializable;
import java.util.Date;

public class ConvertObjFlowRecord implements Serializable {
    public static final long serialVersionUID = -366442932L;

    /**
     * 以物换物变更记录id: convert_obj_flow_record.CONVERT_OBJ_FLOW_RECORD_ID
     * @author MyBatis Generator
     */
    private Long convertObjFlowRecordId;

    /**
     * 兑换物品id: convert_obj_flow_record.CONVERT_OBJ_ID
     * @author MyBatis Generator
     */
    private Long convertObjId;

    /**
     * 用户id: convert_obj_flow_record.USER_INFO_ID
     * @author MyBatis Generator
     */
    private Long userInfoId;

    /**
     * 操作序列: convert_obj_flow_record.OP_SEQ
     * @author MyBatis Generator
     */
    private Long opSeq;

    /**
     * 操作方向： to_user: 转至用户，   from_user::从用户转至平台, allot_in:调入   allot_out:调出: convert_obj_flow_record.OP_DIRECTION
     * @author MyBatis Generator
     */
    private String opDirection;

    /**
     * 本次操作前，系统中拥有的兑换物品数量: convert_obj_flow_record.BEFORE_QUANTITY
     * @author MyBatis Generator
     */
    private Integer beforeQuantity;

    /**
     * 修改的物品数量: convert_obj_flow_record.OP_QUANTITY
     * @author MyBatis Generator
     */
    private Integer opQuantity;

    /**
     * 本次操作后，系统中拥有的兑换物品数量: convert_obj_flow_record.AFTER_QUANTITY
     * @author MyBatis Generator
     */
    private Integer afterQuantity;

    /**
     * 操作时间: convert_obj_flow_record.OP_TIME
     * @author MyBatis Generator
     */
    private Date opTime;

    /**
     * 附加信息: convert_obj_flow_record.EXTEND_INFO
     * @author MyBatis Generator
     */
    private String extendInfo;

    /**
     * 描述: convert_obj_flow_record.REMARK
     * @author MyBatis Generator
     */
    private String remark;

    /**
     * 获取以物换物变更记录id: convert_obj_flow_record.CONVERT_OBJ_FLOW_RECORD_ID
     * @return 以物换物变更记录id: convert_obj_flow_record.CONVERT_OBJ_FLOW_RECORD_ID
     * @author MyBatis Generator
     */
    public Long getConvertObjFlowRecordId() {
        return convertObjFlowRecordId;
    }

    /**
     * 设置以物换物变更记录id: convert_obj_flow_record.CONVERT_OBJ_FLOW_RECORD_ID
     * @param convertObjFlowRecordId 映射数据库字段: convert_obj_flow_record.CONVERT_OBJ_FLOW_RECORD_ID
     * @author MyBatis Generator
     */
    public void setConvertObjFlowRecordId(Long convertObjFlowRecordId) {
        this.convertObjFlowRecordId = convertObjFlowRecordId;
    }

    /**
     * 获取兑换物品id: convert_obj_flow_record.CONVERT_OBJ_ID
     * @return 兑换物品id: convert_obj_flow_record.CONVERT_OBJ_ID
     * @author MyBatis Generator
     */
    public Long getConvertObjId() {
        return convertObjId;
    }

    /**
     * 设置兑换物品id: convert_obj_flow_record.CONVERT_OBJ_ID
     * @param convertObjId 映射数据库字段: convert_obj_flow_record.CONVERT_OBJ_ID
     * @author MyBatis Generator
     */
    public void setConvertObjId(Long convertObjId) {
        this.convertObjId = convertObjId;
    }

    /**
     * 获取用户id: convert_obj_flow_record.USER_INFO_ID
     * @return 用户id: convert_obj_flow_record.USER_INFO_ID
     * @author MyBatis Generator
     */
    public Long getUserInfoId() {
        return userInfoId;
    }

    /**
     * 设置用户id: convert_obj_flow_record.USER_INFO_ID
     * @param userInfoId 映射数据库字段: convert_obj_flow_record.USER_INFO_ID
     * @author MyBatis Generator
     */
    public void setUserInfoId(Long userInfoId) {
        this.userInfoId = userInfoId;
    }

    /**
     * 获取操作序列: convert_obj_flow_record.OP_SEQ
     * @return 操作序列: convert_obj_flow_record.OP_SEQ
     * @author MyBatis Generator
     */
    public Long getOpSeq() {
        return opSeq;
    }

    /**
     * 设置操作序列: convert_obj_flow_record.OP_SEQ
     * @param opSeq 映射数据库字段: convert_obj_flow_record.OP_SEQ
     * @author MyBatis Generator
     */
    public void setOpSeq(Long opSeq) {
        this.opSeq = opSeq;
    }

    /**
     * 获取操作方向： to_user: 转至用户，   from_user::从用户转至平台, allot_in:调入   allot_out:调出: convert_obj_flow_record.OP_DIRECTION
     * @return 操作方向： to_user: 转至用户，   from_user::从用户转至平台, allot_in:调入   allot_out:调出: convert_obj_flow_record.OP_DIRECTION
     * @author MyBatis Generator
     */
    public String getOpDirection() {
        return opDirection;
    }

    /**
     * 设置操作方向： to_user: 转至用户，   from_user::从用户转至平台, allot_in:调入   allot_out:调出: convert_obj_flow_record.OP_DIRECTION
     * @param opDirection 映射数据库字段: convert_obj_flow_record.OP_DIRECTION
     * @author MyBatis Generator
     */
    public void setOpDirection(String opDirection) {
        this.opDirection = opDirection == null ? null : opDirection.trim();
    }

    /**
     * 获取本次操作前，系统中拥有的兑换物品数量: convert_obj_flow_record.BEFORE_QUANTITY
     * @return 本次操作前，系统中拥有的兑换物品数量: convert_obj_flow_record.BEFORE_QUANTITY
     * @author MyBatis Generator
     */
    public Integer getBeforeQuantity() {
        return beforeQuantity;
    }

    /**
     * 设置本次操作前，系统中拥有的兑换物品数量: convert_obj_flow_record.BEFORE_QUANTITY
     * @param beforeQuantity 映射数据库字段: convert_obj_flow_record.BEFORE_QUANTITY
     * @author MyBatis Generator
     */
    public void setBeforeQuantity(Integer beforeQuantity) {
        this.beforeQuantity = beforeQuantity;
    }

    /**
     * 获取修改的物品数量: convert_obj_flow_record.OP_QUANTITY
     * @return 修改的物品数量: convert_obj_flow_record.OP_QUANTITY
     * @author MyBatis Generator
     */
    public Integer getOpQuantity() {
        return opQuantity;
    }

    /**
     * 设置修改的物品数量: convert_obj_flow_record.OP_QUANTITY
     * @param opQuantity 映射数据库字段: convert_obj_flow_record.OP_QUANTITY
     * @author MyBatis Generator
     */
    public void setOpQuantity(Integer opQuantity) {
        this.opQuantity = opQuantity;
    }

    /**
     * 获取本次操作后，系统中拥有的兑换物品数量: convert_obj_flow_record.AFTER_QUANTITY
     * @return 本次操作后，系统中拥有的兑换物品数量: convert_obj_flow_record.AFTER_QUANTITY
     * @author MyBatis Generator
     */
    public Integer getAfterQuantity() {
        return afterQuantity;
    }

    /**
     * 设置本次操作后，系统中拥有的兑换物品数量: convert_obj_flow_record.AFTER_QUANTITY
     * @param afterQuantity 映射数据库字段: convert_obj_flow_record.AFTER_QUANTITY
     * @author MyBatis Generator
     */
    public void setAfterQuantity(Integer afterQuantity) {
        this.afterQuantity = afterQuantity;
    }

    /**
     * 获取操作时间: convert_obj_flow_record.OP_TIME
     * @return 操作时间: convert_obj_flow_record.OP_TIME
     * @author MyBatis Generator
     */
    public Date getOpTime() {
        return opTime;
    }

    /**
     * 设置操作时间: convert_obj_flow_record.OP_TIME
     * @param opTime 映射数据库字段: convert_obj_flow_record.OP_TIME
     * @author MyBatis Generator
     */
    public void setOpTime(Date opTime) {
        this.opTime = opTime;
    }

    /**
     * 获取附加信息: convert_obj_flow_record.EXTEND_INFO
     * @return 附加信息: convert_obj_flow_record.EXTEND_INFO
     * @author MyBatis Generator
     */
    public String getExtendInfo() {
        return extendInfo;
    }

    /**
     * 设置附加信息: convert_obj_flow_record.EXTEND_INFO
     * @param extendInfo 映射数据库字段: convert_obj_flow_record.EXTEND_INFO
     * @author MyBatis Generator
     */
    public void setExtendInfo(String extendInfo) {
        this.extendInfo = extendInfo == null ? null : extendInfo.trim();
    }

    /**
     * 获取描述: convert_obj_flow_record.REMARK
     * @return 描述: convert_obj_flow_record.REMARK
     * @author MyBatis Generator
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置描述: convert_obj_flow_record.REMARK
     * @param remark 映射数据库字段: convert_obj_flow_record.REMARK
     * @author MyBatis Generator
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_obj_flow_record
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
        ConvertObjFlowRecord other = (ConvertObjFlowRecord) that;
        return (this.getConvertObjFlowRecordId() == null ? other.getConvertObjFlowRecordId() == null : this.getConvertObjFlowRecordId().equals(other.getConvertObjFlowRecordId()))
            && (this.getConvertObjId() == null ? other.getConvertObjId() == null : this.getConvertObjId().equals(other.getConvertObjId()))
            && (this.getUserInfoId() == null ? other.getUserInfoId() == null : this.getUserInfoId().equals(other.getUserInfoId()))
            && (this.getOpSeq() == null ? other.getOpSeq() == null : this.getOpSeq().equals(other.getOpSeq()))
            && (this.getOpDirection() == null ? other.getOpDirection() == null : this.getOpDirection().equals(other.getOpDirection()))
            && (this.getBeforeQuantity() == null ? other.getBeforeQuantity() == null : this.getBeforeQuantity().equals(other.getBeforeQuantity()))
            && (this.getOpQuantity() == null ? other.getOpQuantity() == null : this.getOpQuantity().equals(other.getOpQuantity()))
            && (this.getAfterQuantity() == null ? other.getAfterQuantity() == null : this.getAfterQuantity().equals(other.getAfterQuantity()))
            && (this.getOpTime() == null ? other.getOpTime() == null : this.getOpTime().equals(other.getOpTime()))
            && (this.getExtendInfo() == null ? other.getExtendInfo() == null : this.getExtendInfo().equals(other.getExtendInfo()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()));
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_obj_flow_record
     * @author MyBatis Generator
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getConvertObjFlowRecordId() == null) ? 0 : getConvertObjFlowRecordId().hashCode());
        result = prime * result + ((getConvertObjId() == null) ? 0 : getConvertObjId().hashCode());
        result = prime * result + ((getUserInfoId() == null) ? 0 : getUserInfoId().hashCode());
        result = prime * result + ((getOpSeq() == null) ? 0 : getOpSeq().hashCode());
        result = prime * result + ((getOpDirection() == null) ? 0 : getOpDirection().hashCode());
        result = prime * result + ((getBeforeQuantity() == null) ? 0 : getBeforeQuantity().hashCode());
        result = prime * result + ((getOpQuantity() == null) ? 0 : getOpQuantity().hashCode());
        result = prime * result + ((getAfterQuantity() == null) ? 0 : getAfterQuantity().hashCode());
        result = prime * result + ((getOpTime() == null) ? 0 : getOpTime().hashCode());
        result = prime * result + ((getExtendInfo() == null) ? 0 : getExtendInfo().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        return result;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_obj_flow_record
     * @author MyBatis Generator
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append(", convertObjFlowRecordId=").append(convertObjFlowRecordId);
        sb.append(", convertObjId=").append(convertObjId);
        sb.append(", userInfoId=").append(userInfoId);
        sb.append(", opSeq=").append(opSeq);
        sb.append(", opDirection=").append(opDirection);
        sb.append(", beforeQuantity=").append(beforeQuantity);
        sb.append(", opQuantity=").append(opQuantity);
        sb.append(", afterQuantity=").append(afterQuantity);
        sb.append(", opTime=").append(opTime);
        sb.append(", extendInfo=").append(extendInfo);
        sb.append(", remark=").append(remark);
        sb.append("]");
        return sb.toString();
    }
}