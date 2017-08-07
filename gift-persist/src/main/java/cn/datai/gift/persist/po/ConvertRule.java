package cn.datai.gift.persist.po;

import java.io.Serializable;
import java.util.Date;

public class ConvertRule implements Serializable {
    public static final long serialVersionUID = 761407334L;

    /**
     * 兑换的物品id: convert_rule.CONVERT_OBJ_ID
     * @author MyBatis Generator
     */
    private Long convertObjId;

    /**
     * 商品合约信息id: convert_rule.COMMODITY_CONTRACT_ID
     * @author MyBatis Generator
     */
    private Long commodityContractId;

    /**
     * 商品与物品兑换比例，  例如：100 表示100个最小单位商品可以兑换一个物品: convert_rule.COMODITY_OBJ_RATIO
     * @author MyBatis Generator
     */
    private Integer comodityObjRatio;

    /**
     * 创建时间: convert_rule.CREATE_TIME
     * @author MyBatis Generator
     */
    private Date createTime;

    /**
     * 获取兑换的物品id: convert_rule.CONVERT_OBJ_ID
     * @return 兑换的物品id: convert_rule.CONVERT_OBJ_ID
     * @author MyBatis Generator
     */
    public Long getConvertObjId() {
        return convertObjId;
    }

    /**
     * 设置兑换的物品id: convert_rule.CONVERT_OBJ_ID
     * @param convertObjId 映射数据库字段: convert_rule.CONVERT_OBJ_ID
     * @author MyBatis Generator
     */
    public void setConvertObjId(Long convertObjId) {
        this.convertObjId = convertObjId;
    }

    /**
     * 获取商品合约信息id: convert_rule.COMMODITY_CONTRACT_ID
     * @return 商品合约信息id: convert_rule.COMMODITY_CONTRACT_ID
     * @author MyBatis Generator
     */
    public Long getCommodityContractId() {
        return commodityContractId;
    }

    /**
     * 设置商品合约信息id: convert_rule.COMMODITY_CONTRACT_ID
     * @param commodityContractId 映射数据库字段: convert_rule.COMMODITY_CONTRACT_ID
     * @author MyBatis Generator
     */
    public void setCommodityContractId(Long commodityContractId) {
        this.commodityContractId = commodityContractId;
    }

    /**
     * 获取商品与物品兑换比例，  例如：100 表示100个最小单位商品可以兑换一个物品: convert_rule.COMODITY_OBJ_RATIO
     * @return 商品与物品兑换比例，  例如：100 表示100个最小单位商品可以兑换一个物品: convert_rule.COMODITY_OBJ_RATIO
     * @author MyBatis Generator
     */
    public Integer getComodityObjRatio() {
        return comodityObjRatio;
    }

    /**
     * 设置商品与物品兑换比例，  例如：100 表示100个最小单位商品可以兑换一个物品: convert_rule.COMODITY_OBJ_RATIO
     * @param comodityObjRatio 映射数据库字段: convert_rule.COMODITY_OBJ_RATIO
     * @author MyBatis Generator
     */
    public void setComodityObjRatio(Integer comodityObjRatio) {
        this.comodityObjRatio = comodityObjRatio;
    }

    /**
     * 获取创建时间: convert_rule.CREATE_TIME
     * @return 创建时间: convert_rule.CREATE_TIME
     * @author MyBatis Generator
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间: convert_rule.CREATE_TIME
     * @param createTime 映射数据库字段: convert_rule.CREATE_TIME
     * @author MyBatis Generator
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_rule
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
        ConvertRule other = (ConvertRule) that;
        return (this.getConvertObjId() == null ? other.getConvertObjId() == null : this.getConvertObjId().equals(other.getConvertObjId()))
            && (this.getCommodityContractId() == null ? other.getCommodityContractId() == null : this.getCommodityContractId().equals(other.getCommodityContractId()))
            && (this.getComodityObjRatio() == null ? other.getComodityObjRatio() == null : this.getComodityObjRatio().equals(other.getComodityObjRatio()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()));
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_rule
     * @author MyBatis Generator
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getConvertObjId() == null) ? 0 : getConvertObjId().hashCode());
        result = prime * result + ((getCommodityContractId() == null) ? 0 : getCommodityContractId().hashCode());
        result = prime * result + ((getComodityObjRatio() == null) ? 0 : getComodityObjRatio().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        return result;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_rule
     * @author MyBatis Generator
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append(", convertObjId=").append(convertObjId);
        sb.append(", commodityContractId=").append(commodityContractId);
        sb.append(", comodityObjRatio=").append(comodityObjRatio);
        sb.append(", createTime=").append(createTime);
        sb.append("]");
        return sb.toString();
    }
}