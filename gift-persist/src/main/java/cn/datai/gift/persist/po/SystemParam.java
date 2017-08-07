package cn.datai.gift.persist.po;

import java.io.Serializable;
import java.util.Date;

public class SystemParam implements Serializable {
    public static final long serialVersionUID = 295881653L;

    /**
     * : system_param.SYSTEM_PARAM_ID
     * @author MyBatis Generator
     */
    private Integer systemParamId;

    /**
     * 名称: system_param.NAME
     * @author MyBatis Generator
     */
    private String name;

    /**
     * 值: system_param.VALUE
     * @author MyBatis Generator
     */
    private String value;

    /**
     * 注释: system_param.REMARK
     * @author MyBatis Generator
     */
    private String remark;

    /**
     * 字典类型: system_param.DICT_TYPE
     * @author MyBatis Generator
     */
    private String dictType;

    /**
     * 数据类型: system_param.DATA_TYPE
     * @author MyBatis Generator
     */
    private String dataType;

    /**
     * 是否有效: system_param.VALID
     * @author MyBatis Generator
     */
    private String valid;

    /**
     * 创建时间: system_param.CREATE_TIME
     * @author MyBatis Generator
     */
    private Date createTime;

    /**
     * 获取: system_param.SYSTEM_PARAM_ID
     * @return : system_param.SYSTEM_PARAM_ID
     * @author MyBatis Generator
     */
    public Integer getSystemParamId() {
        return systemParamId;
    }

    /**
     * 设置: system_param.SYSTEM_PARAM_ID
     * @param systemParamId 映射数据库字段: system_param.SYSTEM_PARAM_ID
     * @author MyBatis Generator
     */
    public void setSystemParamId(Integer systemParamId) {
        this.systemParamId = systemParamId;
    }

    /**
     * 获取名称: system_param.NAME
     * @return 名称: system_param.NAME
     * @author MyBatis Generator
     */
    public String getName() {
        return name;
    }

    /**
     * 设置名称: system_param.NAME
     * @param name 映射数据库字段: system_param.NAME
     * @author MyBatis Generator
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取值: system_param.VALUE
     * @return 值: system_param.VALUE
     * @author MyBatis Generator
     */
    public String getValue() {
        return value;
    }

    /**
     * 设置值: system_param.VALUE
     * @param value 映射数据库字段: system_param.VALUE
     * @author MyBatis Generator
     */
    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    /**
     * 获取注释: system_param.REMARK
     * @return 注释: system_param.REMARK
     * @author MyBatis Generator
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置注释: system_param.REMARK
     * @param remark 映射数据库字段: system_param.REMARK
     * @author MyBatis Generator
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * 获取字典类型: system_param.DICT_TYPE
     * @return 字典类型: system_param.DICT_TYPE
     * @author MyBatis Generator
     */
    public String getDictType() {
        return dictType;
    }

    /**
     * 设置字典类型: system_param.DICT_TYPE
     * @param dictType 映射数据库字段: system_param.DICT_TYPE
     * @author MyBatis Generator
     */
    public void setDictType(String dictType) {
        this.dictType = dictType == null ? null : dictType.trim();
    }

    /**
     * 获取数据类型: system_param.DATA_TYPE
     * @return 数据类型: system_param.DATA_TYPE
     * @author MyBatis Generator
     */
    public String getDataType() {
        return dataType;
    }

    /**
     * 设置数据类型: system_param.DATA_TYPE
     * @param dataType 映射数据库字段: system_param.DATA_TYPE
     * @author MyBatis Generator
     */
    public void setDataType(String dataType) {
        this.dataType = dataType == null ? null : dataType.trim();
    }

    /**
     * 获取是否有效: system_param.VALID
     * @return 是否有效: system_param.VALID
     * @author MyBatis Generator
     */
    public String getValid() {
        return valid;
    }

    /**
     * 设置是否有效: system_param.VALID
     * @param valid 映射数据库字段: system_param.VALID
     * @author MyBatis Generator
     */
    public void setValid(String valid) {
        this.valid = valid == null ? null : valid.trim();
    }

    /**
     * 获取创建时间: system_param.CREATE_TIME
     * @return 创建时间: system_param.CREATE_TIME
     * @author MyBatis Generator
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间: system_param.CREATE_TIME
     * @param createTime 映射数据库字段: system_param.CREATE_TIME
     * @author MyBatis Generator
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: system_param
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
        SystemParam other = (SystemParam) that;
        return (this.getSystemParamId() == null ? other.getSystemParamId() == null : this.getSystemParamId().equals(other.getSystemParamId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getValue() == null ? other.getValue() == null : this.getValue().equals(other.getValue()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getDictType() == null ? other.getDictType() == null : this.getDictType().equals(other.getDictType()))
            && (this.getDataType() == null ? other.getDataType() == null : this.getDataType().equals(other.getDataType()))
            && (this.getValid() == null ? other.getValid() == null : this.getValid().equals(other.getValid()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()));
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: system_param
     * @author MyBatis Generator
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSystemParamId() == null) ? 0 : getSystemParamId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getValue() == null) ? 0 : getValue().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getDictType() == null) ? 0 : getDictType().hashCode());
        result = prime * result + ((getDataType() == null) ? 0 : getDataType().hashCode());
        result = prime * result + ((getValid() == null) ? 0 : getValid().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        return result;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: system_param
     * @author MyBatis Generator
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append(", systemParamId=").append(systemParamId);
        sb.append(", name=").append(name);
        sb.append(", value=").append(value);
        sb.append(", remark=").append(remark);
        sb.append(", dictType=").append(dictType);
        sb.append(", dataType=").append(dataType);
        sb.append(", valid=").append(valid);
        sb.append(", createTime=").append(createTime);
        sb.append("]");
        return sb.toString();
    }
}