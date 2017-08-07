package cn.datai.gift.persist.po;

import java.io.Serializable;
import java.util.Date;

public class CommodityType implements Serializable {
    public static final long serialVersionUID = 1118184030L;

    /**
     * 商品类型id: commodity_type.COMMODITY_TYPE_ID
     * @author MyBatis Generator
     */
    private Long commodityTypeId;

    /**
     * 类型编码: commodity_type.CODE
     * @author MyBatis Generator
     */
    private String code;

    /**
     * 类型名称: commodity_type.NAME
     * @author MyBatis Generator
     */
    private String name;

    /**
     * 注释: commodity_type.REMARK
     * @author MyBatis Generator
     */
    private String remark;

    /**
     * 创建时间: commodity_type.CREATE_TIME
     * @author MyBatis Generator
     */
    private Date createTime;

    /**
     * 获取商品类型id: commodity_type.COMMODITY_TYPE_ID
     * @return 商品类型id: commodity_type.COMMODITY_TYPE_ID
     * @author MyBatis Generator
     */
    public Long getCommodityTypeId() {
        return commodityTypeId;
    }

    /**
     * 设置商品类型id: commodity_type.COMMODITY_TYPE_ID
     * @param commodityTypeId 映射数据库字段: commodity_type.COMMODITY_TYPE_ID
     * @author MyBatis Generator
     */
    public void setCommodityTypeId(Long commodityTypeId) {
        this.commodityTypeId = commodityTypeId;
    }

    /**
     * 获取类型编码: commodity_type.CODE
     * @return 类型编码: commodity_type.CODE
     * @author MyBatis Generator
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置类型编码: commodity_type.CODE
     * @param code 映射数据库字段: commodity_type.CODE
     * @author MyBatis Generator
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * 获取类型名称: commodity_type.NAME
     * @return 类型名称: commodity_type.NAME
     * @author MyBatis Generator
     */
    public String getName() {
        return name;
    }

    /**
     * 设置类型名称: commodity_type.NAME
     * @param name 映射数据库字段: commodity_type.NAME
     * @author MyBatis Generator
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取注释: commodity_type.REMARK
     * @return 注释: commodity_type.REMARK
     * @author MyBatis Generator
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置注释: commodity_type.REMARK
     * @param remark 映射数据库字段: commodity_type.REMARK
     * @author MyBatis Generator
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * 获取创建时间: commodity_type.CREATE_TIME
     * @return 创建时间: commodity_type.CREATE_TIME
     * @author MyBatis Generator
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间: commodity_type.CREATE_TIME
     * @param createTime 映射数据库字段: commodity_type.CREATE_TIME
     * @author MyBatis Generator
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_type
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
        CommodityType other = (CommodityType) that;
        return (this.getCommodityTypeId() == null ? other.getCommodityTypeId() == null : this.getCommodityTypeId().equals(other.getCommodityTypeId()))
            && (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()));
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_type
     * @author MyBatis Generator
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCommodityTypeId() == null) ? 0 : getCommodityTypeId().hashCode());
        result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        return result;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_type
     * @author MyBatis Generator
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append(", commodityTypeId=").append(commodityTypeId);
        sb.append(", code=").append(code);
        sb.append(", name=").append(name);
        sb.append(", remark=").append(remark);
        sb.append(", createTime=").append(createTime);
        sb.append("]");
        return sb.toString();
    }
}