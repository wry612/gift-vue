package cn.datai.gift.persist.po;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class CommodityFlowRecord implements Serializable {
    public static final long serialVersionUID = 755689283L;

    /**
     * 商品流通记录id: commodity_flow_record.COMMODITY_FLOW_RECORD_ID
     * @author MyBatis Generator
     */
    private Long commodityFlowRecordId;

    /**
     * 礼包账户id: commodity_flow_record.GIFT_ACCOUNT_ID
     * @author MyBatis Generator
     */
    private Long giftAccountId;

    /**
     * 礼包账户操作序列，当前礼包账户新增一条记录时，序列值+1，账户刚开户时序列为0: commodity_flow_record.GIFT_ACCOUNT_OP_SEQ
     * @author MyBatis Generator
     */
    private Long giftAccountOpSeq;

    /**
     * 用户礼包账户id: commodity_flow_record.OPPONENT_GIFT_ACCOUNT_ID
     * @author MyBatis Generator
     */
    private Long opponentGiftAccountId;

    /**
     * 0：外部系统调拨  1：礼包赠送   2：变现    3：提货: commodity_flow_record.TYPE
     * @author MyBatis Generator
     */
    private String type;

    /**
     * 调拨/内部流转, allot:调拨     transfer:内部流转    调拨：从外部系统调入或者从内部系统拨离，   内部流转：账户与账户之间流通: commodity_flow_record.ALLOT_OR_TRANSFER
     * @author MyBatis Generator
     */
    private String allotOrTransfer;

    /**
     * out：转出  in：转入: commodity_flow_record.IN_OR_OUT
     * @author MyBatis Generator
     */
    private String inOrOut;

    /**
     * freeze:冻结     unfreeze:解冻: commodity_flow_record.FREEZE_OR_UNFREEZE
     * @author MyBatis Generator
     */
    private String freezeOrUnfreeze;

    /**
     * 转入转出之前账户中持有的商品数量: commodity_flow_record.BEFORE_UNIT_QUANTITY
     * @author MyBatis Generator
     */
    private BigDecimal beforeUnitQuantity;

    /**
     * 交易商品单位数量: commodity_flow_record.TRADE_UNIT_QUANTITY
     * @author MyBatis Generator
     */
    private BigDecimal tradeUnitQuantity;

    /**
     * 转入转出之后账户中持有的商品数量: commodity_flow_record.AFTER_UNIT_QUANTITY
     * @author MyBatis Generator
     */
    private BigDecimal afterUnitQuantity;

    /**
     * 商品单位价格， 单位：分: commodity_flow_record.UNIT_PRICE
     * @author MyBatis Generator
     */
    private Long unitPrice;

    /**
     * 交易时间: commodity_flow_record.TRADE_TIME
     * @author MyBatis Generator
     */
    private Date tradeTime;

    /**
     * 附加信息,json格式: commodity_flow_record.EXTEND_INFO
     * @author MyBatis Generator
     */
    private String extendInfo;

    /**
     * 描述说明: commodity_flow_record.REMARK
     * @author MyBatis Generator
     */
    private String remark;

    /**
     * 获取商品流通记录id: commodity_flow_record.COMMODITY_FLOW_RECORD_ID
     * @return 商品流通记录id: commodity_flow_record.COMMODITY_FLOW_RECORD_ID
     * @author MyBatis Generator
     */
    public Long getCommodityFlowRecordId() {
        return commodityFlowRecordId;
    }

    /**
     * 设置商品流通记录id: commodity_flow_record.COMMODITY_FLOW_RECORD_ID
     * @param commodityFlowRecordId 映射数据库字段: commodity_flow_record.COMMODITY_FLOW_RECORD_ID
     * @author MyBatis Generator
     */
    public void setCommodityFlowRecordId(Long commodityFlowRecordId) {
        this.commodityFlowRecordId = commodityFlowRecordId;
    }

    /**
     * 获取礼包账户id: commodity_flow_record.GIFT_ACCOUNT_ID
     * @return 礼包账户id: commodity_flow_record.GIFT_ACCOUNT_ID
     * @author MyBatis Generator
     */
    public Long getGiftAccountId() {
        return giftAccountId;
    }

    /**
     * 设置礼包账户id: commodity_flow_record.GIFT_ACCOUNT_ID
     * @param giftAccountId 映射数据库字段: commodity_flow_record.GIFT_ACCOUNT_ID
     * @author MyBatis Generator
     */
    public void setGiftAccountId(Long giftAccountId) {
        this.giftAccountId = giftAccountId;
    }

    /**
     * 获取礼包账户操作序列，当前礼包账户新增一条记录时，序列值+1，账户刚开户时序列为0: commodity_flow_record.GIFT_ACCOUNT_OP_SEQ
     * @return 礼包账户操作序列，当前礼包账户新增一条记录时，序列值+1，账户刚开户时序列为0: commodity_flow_record.GIFT_ACCOUNT_OP_SEQ
     * @author MyBatis Generator
     */
    public Long getGiftAccountOpSeq() {
        return giftAccountOpSeq;
    }

    /**
     * 设置礼包账户操作序列，当前礼包账户新增一条记录时，序列值+1，账户刚开户时序列为0: commodity_flow_record.GIFT_ACCOUNT_OP_SEQ
     * @param giftAccountOpSeq 映射数据库字段: commodity_flow_record.GIFT_ACCOUNT_OP_SEQ
     * @author MyBatis Generator
     */
    public void setGiftAccountOpSeq(Long giftAccountOpSeq) {
        this.giftAccountOpSeq = giftAccountOpSeq;
    }

    /**
     * 获取用户礼包账户id: commodity_flow_record.OPPONENT_GIFT_ACCOUNT_ID
     * @return 用户礼包账户id: commodity_flow_record.OPPONENT_GIFT_ACCOUNT_ID
     * @author MyBatis Generator
     */
    public Long getOpponentGiftAccountId() {
        return opponentGiftAccountId;
    }

    /**
     * 设置用户礼包账户id: commodity_flow_record.OPPONENT_GIFT_ACCOUNT_ID
     * @param opponentGiftAccountId 映射数据库字段: commodity_flow_record.OPPONENT_GIFT_ACCOUNT_ID
     * @author MyBatis Generator
     */
    public void setOpponentGiftAccountId(Long opponentGiftAccountId) {
        this.opponentGiftAccountId = opponentGiftAccountId;
    }

    /**
     * 获取0：外部系统调拨  1：礼包赠送   2：变现    3：提货: commodity_flow_record.TYPE
     * @return 0：外部系统调拨  1：礼包赠送   2：变现    3：提货: commodity_flow_record.TYPE
     * @author MyBatis Generator
     */
    public String getType() {
        return type;
    }

    /**
     * 设置0：外部系统调拨  1：礼包赠送   2：变现    3：提货: commodity_flow_record.TYPE
     * @param type 映射数据库字段: commodity_flow_record.TYPE
     * @author MyBatis Generator
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * 获取调拨/内部流转, allot:调拨     transfer:内部流转    调拨：从外部系统调入或者从内部系统拨离，   内部流转：账户与账户之间流通: commodity_flow_record.ALLOT_OR_TRANSFER
     * @return 调拨/内部流转, allot:调拨     transfer:内部流转    调拨：从外部系统调入或者从内部系统拨离，   内部流转：账户与账户之间流通: commodity_flow_record.ALLOT_OR_TRANSFER
     * @author MyBatis Generator
     */
    public String getAllotOrTransfer() {
        return allotOrTransfer;
    }

    /**
     * 设置调拨/内部流转, allot:调拨     transfer:内部流转    调拨：从外部系统调入或者从内部系统拨离，   内部流转：账户与账户之间流通: commodity_flow_record.ALLOT_OR_TRANSFER
     * @param allotOrTransfer 映射数据库字段: commodity_flow_record.ALLOT_OR_TRANSFER
     * @author MyBatis Generator
     */
    public void setAllotOrTransfer(String allotOrTransfer) {
        this.allotOrTransfer = allotOrTransfer == null ? null : allotOrTransfer.trim();
    }

    /**
     * 获取out：转出  in：转入: commodity_flow_record.IN_OR_OUT
     * @return out：转出  in：转入: commodity_flow_record.IN_OR_OUT
     * @author MyBatis Generator
     */
    public String getInOrOut() {
        return inOrOut;
    }

    /**
     * 设置out：转出  in：转入: commodity_flow_record.IN_OR_OUT
     * @param inOrOut 映射数据库字段: commodity_flow_record.IN_OR_OUT
     * @author MyBatis Generator
     */
    public void setInOrOut(String inOrOut) {
        this.inOrOut = inOrOut == null ? null : inOrOut.trim();
    }

    /**
     * 获取freeze:冻结     unfreeze:解冻: commodity_flow_record.FREEZE_OR_UNFREEZE
     * @return freeze:冻结     unfreeze:解冻: commodity_flow_record.FREEZE_OR_UNFREEZE
     * @author MyBatis Generator
     */
    public String getFreezeOrUnfreeze() {
        return freezeOrUnfreeze;
    }

    /**
     * 设置freeze:冻结     unfreeze:解冻: commodity_flow_record.FREEZE_OR_UNFREEZE
     * @param freezeOrUnfreeze 映射数据库字段: commodity_flow_record.FREEZE_OR_UNFREEZE
     * @author MyBatis Generator
     */
    public void setFreezeOrUnfreeze(String freezeOrUnfreeze) {
        this.freezeOrUnfreeze = freezeOrUnfreeze == null ? null : freezeOrUnfreeze.trim();
    }

    /**
     * 获取转入转出之前账户中持有的商品数量: commodity_flow_record.BEFORE_UNIT_QUANTITY
     * @return 转入转出之前账户中持有的商品数量: commodity_flow_record.BEFORE_UNIT_QUANTITY
     * @author MyBatis Generator
     */
    public BigDecimal getBeforeUnitQuantity() {
        return beforeUnitQuantity;
    }

    /**
     * 设置转入转出之前账户中持有的商品数量: commodity_flow_record.BEFORE_UNIT_QUANTITY
     * @param beforeUnitQuantity 映射数据库字段: commodity_flow_record.BEFORE_UNIT_QUANTITY
     * @author MyBatis Generator
     */
    public void setBeforeUnitQuantity(BigDecimal beforeUnitQuantity) {
        this.beforeUnitQuantity = beforeUnitQuantity;
    }

    /**
     * 获取交易商品单位数量: commodity_flow_record.TRADE_UNIT_QUANTITY
     * @return 交易商品单位数量: commodity_flow_record.TRADE_UNIT_QUANTITY
     * @author MyBatis Generator
     */
    public BigDecimal getTradeUnitQuantity() {
        return tradeUnitQuantity;
    }

    /**
     * 设置交易商品单位数量: commodity_flow_record.TRADE_UNIT_QUANTITY
     * @param tradeUnitQuantity 映射数据库字段: commodity_flow_record.TRADE_UNIT_QUANTITY
     * @author MyBatis Generator
     */
    public void setTradeUnitQuantity(BigDecimal tradeUnitQuantity) {
        this.tradeUnitQuantity = tradeUnitQuantity;
    }

    /**
     * 获取转入转出之后账户中持有的商品数量: commodity_flow_record.AFTER_UNIT_QUANTITY
     * @return 转入转出之后账户中持有的商品数量: commodity_flow_record.AFTER_UNIT_QUANTITY
     * @author MyBatis Generator
     */
    public BigDecimal getAfterUnitQuantity() {
        return afterUnitQuantity;
    }

    /**
     * 设置转入转出之后账户中持有的商品数量: commodity_flow_record.AFTER_UNIT_QUANTITY
     * @param afterUnitQuantity 映射数据库字段: commodity_flow_record.AFTER_UNIT_QUANTITY
     * @author MyBatis Generator
     */
    public void setAfterUnitQuantity(BigDecimal afterUnitQuantity) {
        this.afterUnitQuantity = afterUnitQuantity;
    }

    /**
     * 获取商品单位价格， 单位：分: commodity_flow_record.UNIT_PRICE
     * @return 商品单位价格， 单位：分: commodity_flow_record.UNIT_PRICE
     * @author MyBatis Generator
     */
    public Long getUnitPrice() {
        return unitPrice;
    }

    /**
     * 设置商品单位价格， 单位：分: commodity_flow_record.UNIT_PRICE
     * @param unitPrice 映射数据库字段: commodity_flow_record.UNIT_PRICE
     * @author MyBatis Generator
     */
    public void setUnitPrice(Long unitPrice) {
        this.unitPrice = unitPrice;
    }

    /**
     * 获取交易时间: commodity_flow_record.TRADE_TIME
     * @return 交易时间: commodity_flow_record.TRADE_TIME
     * @author MyBatis Generator
     */
    public Date getTradeTime() {
        return tradeTime;
    }

    /**
     * 设置交易时间: commodity_flow_record.TRADE_TIME
     * @param tradeTime 映射数据库字段: commodity_flow_record.TRADE_TIME
     * @author MyBatis Generator
     */
    public void setTradeTime(Date tradeTime) {
        this.tradeTime = tradeTime;
    }

    /**
     * 获取附加信息,json格式: commodity_flow_record.EXTEND_INFO
     * @return 附加信息,json格式: commodity_flow_record.EXTEND_INFO
     * @author MyBatis Generator
     */
    public String getExtendInfo() {
        return extendInfo;
    }

    /**
     * 设置附加信息,json格式: commodity_flow_record.EXTEND_INFO
     * @param extendInfo 映射数据库字段: commodity_flow_record.EXTEND_INFO
     * @author MyBatis Generator
     */
    public void setExtendInfo(String extendInfo) {
        this.extendInfo = extendInfo == null ? null : extendInfo.trim();
    }

    /**
     * 获取描述说明: commodity_flow_record.REMARK
     * @return 描述说明: commodity_flow_record.REMARK
     * @author MyBatis Generator
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置描述说明: commodity_flow_record.REMARK
     * @param remark 映射数据库字段: commodity_flow_record.REMARK
     * @author MyBatis Generator
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_flow_record
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
        CommodityFlowRecord other = (CommodityFlowRecord) that;
        return (this.getCommodityFlowRecordId() == null ? other.getCommodityFlowRecordId() == null : this.getCommodityFlowRecordId().equals(other.getCommodityFlowRecordId()))
            && (this.getGiftAccountId() == null ? other.getGiftAccountId() == null : this.getGiftAccountId().equals(other.getGiftAccountId()))
            && (this.getGiftAccountOpSeq() == null ? other.getGiftAccountOpSeq() == null : this.getGiftAccountOpSeq().equals(other.getGiftAccountOpSeq()))
            && (this.getOpponentGiftAccountId() == null ? other.getOpponentGiftAccountId() == null : this.getOpponentGiftAccountId().equals(other.getOpponentGiftAccountId()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getAllotOrTransfer() == null ? other.getAllotOrTransfer() == null : this.getAllotOrTransfer().equals(other.getAllotOrTransfer()))
            && (this.getInOrOut() == null ? other.getInOrOut() == null : this.getInOrOut().equals(other.getInOrOut()))
            && (this.getFreezeOrUnfreeze() == null ? other.getFreezeOrUnfreeze() == null : this.getFreezeOrUnfreeze().equals(other.getFreezeOrUnfreeze()))
            && (this.getBeforeUnitQuantity() == null ? other.getBeforeUnitQuantity() == null : this.getBeforeUnitQuantity().equals(other.getBeforeUnitQuantity()))
            && (this.getTradeUnitQuantity() == null ? other.getTradeUnitQuantity() == null : this.getTradeUnitQuantity().equals(other.getTradeUnitQuantity()))
            && (this.getAfterUnitQuantity() == null ? other.getAfterUnitQuantity() == null : this.getAfterUnitQuantity().equals(other.getAfterUnitQuantity()))
            && (this.getUnitPrice() == null ? other.getUnitPrice() == null : this.getUnitPrice().equals(other.getUnitPrice()))
            && (this.getTradeTime() == null ? other.getTradeTime() == null : this.getTradeTime().equals(other.getTradeTime()))
            && (this.getExtendInfo() == null ? other.getExtendInfo() == null : this.getExtendInfo().equals(other.getExtendInfo()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()));
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_flow_record
     * @author MyBatis Generator
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCommodityFlowRecordId() == null) ? 0 : getCommodityFlowRecordId().hashCode());
        result = prime * result + ((getGiftAccountId() == null) ? 0 : getGiftAccountId().hashCode());
        result = prime * result + ((getGiftAccountOpSeq() == null) ? 0 : getGiftAccountOpSeq().hashCode());
        result = prime * result + ((getOpponentGiftAccountId() == null) ? 0 : getOpponentGiftAccountId().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getAllotOrTransfer() == null) ? 0 : getAllotOrTransfer().hashCode());
        result = prime * result + ((getInOrOut() == null) ? 0 : getInOrOut().hashCode());
        result = prime * result + ((getFreezeOrUnfreeze() == null) ? 0 : getFreezeOrUnfreeze().hashCode());
        result = prime * result + ((getBeforeUnitQuantity() == null) ? 0 : getBeforeUnitQuantity().hashCode());
        result = prime * result + ((getTradeUnitQuantity() == null) ? 0 : getTradeUnitQuantity().hashCode());
        result = prime * result + ((getAfterUnitQuantity() == null) ? 0 : getAfterUnitQuantity().hashCode());
        result = prime * result + ((getUnitPrice() == null) ? 0 : getUnitPrice().hashCode());
        result = prime * result + ((getTradeTime() == null) ? 0 : getTradeTime().hashCode());
        result = prime * result + ((getExtendInfo() == null) ? 0 : getExtendInfo().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        return result;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_flow_record
     * @author MyBatis Generator
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append(", commodityFlowRecordId=").append(commodityFlowRecordId);
        sb.append(", giftAccountId=").append(giftAccountId);
        sb.append(", giftAccountOpSeq=").append(giftAccountOpSeq);
        sb.append(", opponentGiftAccountId=").append(opponentGiftAccountId);
        sb.append(", type=").append(type);
        sb.append(", allotOrTransfer=").append(allotOrTransfer);
        sb.append(", inOrOut=").append(inOrOut);
        sb.append(", freezeOrUnfreeze=").append(freezeOrUnfreeze);
        sb.append(", beforeUnitQuantity=").append(beforeUnitQuantity);
        sb.append(", tradeUnitQuantity=").append(tradeUnitQuantity);
        sb.append(", afterUnitQuantity=").append(afterUnitQuantity);
        sb.append(", unitPrice=").append(unitPrice);
        sb.append(", tradeTime=").append(tradeTime);
        sb.append(", extendInfo=").append(extendInfo);
        sb.append(", remark=").append(remark);
        sb.append("]");
        return sb.toString();
    }
}