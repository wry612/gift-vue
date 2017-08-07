package cn.datai.gift.persist.po;

import java.io.Serializable;
import java.util.Date;

public class ConvertObj implements Serializable {
    public static final long serialVersionUID = -668178611L;

    /**
     * : convert_obj.CONVERT_OBJ_ID
     * @author MyBatis Generator
     */
    private Long convertObjId;

    /**
     * 被兑换的商品转移到的特别用户id: convert_obj.TRANSFER_TO_USER_ID
     * @author MyBatis Generator
     */
    private Long transferToUserId;

    /**
     * 兑换的物品简称: convert_obj.LITE_NAME
     * @author MyBatis Generator
     */
    private String liteName;

    /**
     * 兑换的物品全称: convert_obj.FULL_NAME
     * @author MyBatis Generator
     */
    private String fullName;

    /**
     * 兑换的物品虚实类型: convert_obj.VRTUAL_OR_ACTUAL
     * @author MyBatis Generator
     */
    private String vrtualOrActual;

    /**
     * 物品单位名称: convert_obj.UNIT_NAME
     * @author MyBatis Generator
     */
    private String unitName;

    /**
     * 规则类型,   IMMEDIATE:立即兑换  、 DRAW:定期抽奖: convert_obj.RULE_TYPE
     * @author MyBatis Generator
     */
    private String ruleType;

    /**
     * 市场价: convert_obj.MARKET_PRICE
     * @author MyBatis Generator
     */
    private Integer marketPrice;

    /**
     * 总量: convert_obj.TOTAL_QUANTITY
     * @author MyBatis Generator
     */
    private Integer totalQuantity;

    /**
     * 库存: convert_obj.AVAILABLE_QUANTITY
     * @author MyBatis Generator
     */
    private Integer availableQuantity;

    /**
     * 开始兑换时间: convert_obj.START_TIME
     * @author MyBatis Generator
     */
    private Date startTime;

    /**
     * 结束兑换时间: convert_obj.END_TIME
     * @author MyBatis Generator
     */
    private Date endTime;

    /**
     * 注释: convert_obj.REMARK
     * @author MyBatis Generator
     */
    private String remark;

    /**
     * icon: convert_obj.ICON
     * @author MyBatis Generator
     */
    private String icon;

    /**
     * 头部图片: convert_obj.HEAD_IMGS
     * @author MyBatis Generator
     */
    private String headImgs;

    /**
     * 介绍图片: convert_obj.INTRODUCE_IMGS
     * @author MyBatis Generator
     */
    private String introduceImgs;

    /**
     * 其他属性: convert_obj.OTHER_PROPERTIES
     * @author MyBatis Generator
     */
    private String otherProperties;

    /**
     * 创建时间: convert_obj.CREATE_TIME
     * @author MyBatis Generator
     */
    private Date createTime;

    /**
     * 是否有效， TRUE:有效    FALSE:失效: convert_obj.VALID
     * @author MyBatis Generator
     */
    private String valid;

    /**
     * 是否已兑奖（针对抽奖类型）， TRUE:已兑奖    FALSE:未兑奖: convert_obj.DRAWED
     * @author MyBatis Generator
     */
    private String drawed;

    /**
     * 抽奖时间（针对抽奖类型）: convert_obj.DRAW_TIME
     * @author MyBatis Generator
     */
    private Date drawTime;

    /**
     * 已报名人数(针对抽奖类型): convert_obj.SIGN_QUANTITY
     * @author MyBatis Generator
     */
    private Integer signQuantity;

    /**
     * 操作序列，用于记录流水顺序: convert_obj.OP_SEQ
     * @author MyBatis Generator
     */
    private Long opSeq;

    /**
     * 报名人数下限: convert_obj.SIGN_QUANTITY_MIN
     * @author MyBatis Generator
     */
    private Integer signQuantityMin;

    /**
     * 报名人数上限: convert_obj.SIGN_QUANTITY_MAX
     * @author MyBatis Generator
     */
    private Integer signQuantityMax;

    /**
     * 多奖项奖品明细， json格式，包含 奖品等级、奖品名称、奖品数量: convert_obj.multi_obj_detail
     * @author MyBatis Generator
     */
    private String multiObjDetail;

    /**
     * 获取: convert_obj.CONVERT_OBJ_ID
     * @return : convert_obj.CONVERT_OBJ_ID
     * @author MyBatis Generator
     */
    public Long getConvertObjId() {
        return convertObjId;
    }

    /**
     * 设置: convert_obj.CONVERT_OBJ_ID
     * @param convertObjId 映射数据库字段: convert_obj.CONVERT_OBJ_ID
     * @author MyBatis Generator
     */
    public void setConvertObjId(Long convertObjId) {
        this.convertObjId = convertObjId;
    }

    /**
     * 获取被兑换的商品转移到的特别用户id: convert_obj.TRANSFER_TO_USER_ID
     * @return 被兑换的商品转移到的特别用户id: convert_obj.TRANSFER_TO_USER_ID
     * @author MyBatis Generator
     */
    public Long getTransferToUserId() {
        return transferToUserId;
    }

    /**
     * 设置被兑换的商品转移到的特别用户id: convert_obj.TRANSFER_TO_USER_ID
     * @param transferToUserId 映射数据库字段: convert_obj.TRANSFER_TO_USER_ID
     * @author MyBatis Generator
     */
    public void setTransferToUserId(Long transferToUserId) {
        this.transferToUserId = transferToUserId;
    }

    /**
     * 获取兑换的物品简称: convert_obj.LITE_NAME
     * @return 兑换的物品简称: convert_obj.LITE_NAME
     * @author MyBatis Generator
     */
    public String getLiteName() {
        return liteName;
    }

    /**
     * 设置兑换的物品简称: convert_obj.LITE_NAME
     * @param liteName 映射数据库字段: convert_obj.LITE_NAME
     * @author MyBatis Generator
     */
    public void setLiteName(String liteName) {
        this.liteName = liteName == null ? null : liteName.trim();
    }

    /**
     * 获取兑换的物品全称: convert_obj.FULL_NAME
     * @return 兑换的物品全称: convert_obj.FULL_NAME
     * @author MyBatis Generator
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * 设置兑换的物品全称: convert_obj.FULL_NAME
     * @param fullName 映射数据库字段: convert_obj.FULL_NAME
     * @author MyBatis Generator
     */
    public void setFullName(String fullName) {
        this.fullName = fullName == null ? null : fullName.trim();
    }

    /**
     * 获取兑换的物品虚实类型: convert_obj.VRTUAL_OR_ACTUAL
     * @return 兑换的物品虚实类型: convert_obj.VRTUAL_OR_ACTUAL
     * @author MyBatis Generator
     */
    public String getVrtualOrActual() {
        return vrtualOrActual;
    }

    /**
     * 设置兑换的物品虚实类型: convert_obj.VRTUAL_OR_ACTUAL
     * @param vrtualOrActual 映射数据库字段: convert_obj.VRTUAL_OR_ACTUAL
     * @author MyBatis Generator
     */
    public void setVrtualOrActual(String vrtualOrActual) {
        this.vrtualOrActual = vrtualOrActual == null ? null : vrtualOrActual.trim();
    }

    /**
     * 获取物品单位名称: convert_obj.UNIT_NAME
     * @return 物品单位名称: convert_obj.UNIT_NAME
     * @author MyBatis Generator
     */
    public String getUnitName() {
        return unitName;
    }

    /**
     * 设置物品单位名称: convert_obj.UNIT_NAME
     * @param unitName 映射数据库字段: convert_obj.UNIT_NAME
     * @author MyBatis Generator
     */
    public void setUnitName(String unitName) {
        this.unitName = unitName == null ? null : unitName.trim();
    }

    /**
     * 获取规则类型,   IMMEDIATE:立即兑换  、 DRAW:定期抽奖: convert_obj.RULE_TYPE
     * @return 规则类型,   IMMEDIATE:立即兑换  、 DRAW:定期抽奖: convert_obj.RULE_TYPE
     * @author MyBatis Generator
     */
    public String getRuleType() {
        return ruleType;
    }

    /**
     * 设置规则类型,   IMMEDIATE:立即兑换  、 DRAW:定期抽奖: convert_obj.RULE_TYPE
     * @param ruleType 映射数据库字段: convert_obj.RULE_TYPE
     * @author MyBatis Generator
     */
    public void setRuleType(String ruleType) {
        this.ruleType = ruleType == null ? null : ruleType.trim();
    }

    /**
     * 获取市场价: convert_obj.MARKET_PRICE
     * @return 市场价: convert_obj.MARKET_PRICE
     * @author MyBatis Generator
     */
    public Integer getMarketPrice() {
        return marketPrice;
    }

    /**
     * 设置市场价: convert_obj.MARKET_PRICE
     * @param marketPrice 映射数据库字段: convert_obj.MARKET_PRICE
     * @author MyBatis Generator
     */
    public void setMarketPrice(Integer marketPrice) {
        this.marketPrice = marketPrice;
    }

    /**
     * 获取总量: convert_obj.TOTAL_QUANTITY
     * @return 总量: convert_obj.TOTAL_QUANTITY
     * @author MyBatis Generator
     */
    public Integer getTotalQuantity() {
        return totalQuantity;
    }

    /**
     * 设置总量: convert_obj.TOTAL_QUANTITY
     * @param totalQuantity 映射数据库字段: convert_obj.TOTAL_QUANTITY
     * @author MyBatis Generator
     */
    public void setTotalQuantity(Integer totalQuantity) {
        this.totalQuantity = totalQuantity;
    }

    /**
     * 获取库存: convert_obj.AVAILABLE_QUANTITY
     * @return 库存: convert_obj.AVAILABLE_QUANTITY
     * @author MyBatis Generator
     */
    public Integer getAvailableQuantity() {
        return availableQuantity;
    }

    /**
     * 设置库存: convert_obj.AVAILABLE_QUANTITY
     * @param availableQuantity 映射数据库字段: convert_obj.AVAILABLE_QUANTITY
     * @author MyBatis Generator
     */
    public void setAvailableQuantity(Integer availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    /**
     * 获取开始兑换时间: convert_obj.START_TIME
     * @return 开始兑换时间: convert_obj.START_TIME
     * @author MyBatis Generator
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * 设置开始兑换时间: convert_obj.START_TIME
     * @param startTime 映射数据库字段: convert_obj.START_TIME
     * @author MyBatis Generator
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * 获取结束兑换时间: convert_obj.END_TIME
     * @return 结束兑换时间: convert_obj.END_TIME
     * @author MyBatis Generator
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * 设置结束兑换时间: convert_obj.END_TIME
     * @param endTime 映射数据库字段: convert_obj.END_TIME
     * @author MyBatis Generator
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * 获取注释: convert_obj.REMARK
     * @return 注释: convert_obj.REMARK
     * @author MyBatis Generator
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置注释: convert_obj.REMARK
     * @param remark 映射数据库字段: convert_obj.REMARK
     * @author MyBatis Generator
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * 获取icon: convert_obj.ICON
     * @return icon: convert_obj.ICON
     * @author MyBatis Generator
     */
    public String getIcon() {
        return icon;
    }

    /**
     * 设置icon: convert_obj.ICON
     * @param icon 映射数据库字段: convert_obj.ICON
     * @author MyBatis Generator
     */
    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    /**
     * 获取头部图片: convert_obj.HEAD_IMGS
     * @return 头部图片: convert_obj.HEAD_IMGS
     * @author MyBatis Generator
     */
    public String getHeadImgs() {
        return headImgs;
    }

    /**
     * 设置头部图片: convert_obj.HEAD_IMGS
     * @param headImgs 映射数据库字段: convert_obj.HEAD_IMGS
     * @author MyBatis Generator
     */
    public void setHeadImgs(String headImgs) {
        this.headImgs = headImgs == null ? null : headImgs.trim();
    }

    /**
     * 获取介绍图片: convert_obj.INTRODUCE_IMGS
     * @return 介绍图片: convert_obj.INTRODUCE_IMGS
     * @author MyBatis Generator
     */
    public String getIntroduceImgs() {
        return introduceImgs;
    }

    /**
     * 设置介绍图片: convert_obj.INTRODUCE_IMGS
     * @param introduceImgs 映射数据库字段: convert_obj.INTRODUCE_IMGS
     * @author MyBatis Generator
     */
    public void setIntroduceImgs(String introduceImgs) {
        this.introduceImgs = introduceImgs == null ? null : introduceImgs.trim();
    }

    /**
     * 获取其他属性: convert_obj.OTHER_PROPERTIES
     * @return 其他属性: convert_obj.OTHER_PROPERTIES
     * @author MyBatis Generator
     */
    public String getOtherProperties() {
        return otherProperties;
    }

    /**
     * 设置其他属性: convert_obj.OTHER_PROPERTIES
     * @param otherProperties 映射数据库字段: convert_obj.OTHER_PROPERTIES
     * @author MyBatis Generator
     */
    public void setOtherProperties(String otherProperties) {
        this.otherProperties = otherProperties == null ? null : otherProperties.trim();
    }

    /**
     * 获取创建时间: convert_obj.CREATE_TIME
     * @return 创建时间: convert_obj.CREATE_TIME
     * @author MyBatis Generator
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间: convert_obj.CREATE_TIME
     * @param createTime 映射数据库字段: convert_obj.CREATE_TIME
     * @author MyBatis Generator
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取是否有效， TRUE:有效    FALSE:失效: convert_obj.VALID
     * @return 是否有效， TRUE:有效    FALSE:失效: convert_obj.VALID
     * @author MyBatis Generator
     */
    public String getValid() {
        return valid;
    }

    /**
     * 设置是否有效， TRUE:有效    FALSE:失效: convert_obj.VALID
     * @param valid 映射数据库字段: convert_obj.VALID
     * @author MyBatis Generator
     */
    public void setValid(String valid) {
        this.valid = valid == null ? null : valid.trim();
    }

    /**
     * 获取是否已兑奖（针对抽奖类型）， TRUE:已兑奖    FALSE:未兑奖: convert_obj.DRAWED
     * @return 是否已兑奖（针对抽奖类型）， TRUE:已兑奖    FALSE:未兑奖: convert_obj.DRAWED
     * @author MyBatis Generator
     */
    public String getDrawed() {
        return drawed;
    }

    /**
     * 设置是否已兑奖（针对抽奖类型）， TRUE:已兑奖    FALSE:未兑奖: convert_obj.DRAWED
     * @param drawed 映射数据库字段: convert_obj.DRAWED
     * @author MyBatis Generator
     */
    public void setDrawed(String drawed) {
        this.drawed = drawed == null ? null : drawed.trim();
    }

    /**
     * 获取抽奖时间（针对抽奖类型）: convert_obj.DRAW_TIME
     * @return 抽奖时间（针对抽奖类型）: convert_obj.DRAW_TIME
     * @author MyBatis Generator
     */
    public Date getDrawTime() {
        return drawTime;
    }

    /**
     * 设置抽奖时间（针对抽奖类型）: convert_obj.DRAW_TIME
     * @param drawTime 映射数据库字段: convert_obj.DRAW_TIME
     * @author MyBatis Generator
     */
    public void setDrawTime(Date drawTime) {
        this.drawTime = drawTime;
    }

    /**
     * 获取已报名人数(针对抽奖类型): convert_obj.SIGN_QUANTITY
     * @return 已报名人数(针对抽奖类型): convert_obj.SIGN_QUANTITY
     * @author MyBatis Generator
     */
    public Integer getSignQuantity() {
        return signQuantity;
    }

    /**
     * 设置已报名人数(针对抽奖类型): convert_obj.SIGN_QUANTITY
     * @param signQuantity 映射数据库字段: convert_obj.SIGN_QUANTITY
     * @author MyBatis Generator
     */
    public void setSignQuantity(Integer signQuantity) {
        this.signQuantity = signQuantity;
    }

    /**
     * 获取操作序列，用于记录流水顺序: convert_obj.OP_SEQ
     * @return 操作序列，用于记录流水顺序: convert_obj.OP_SEQ
     * @author MyBatis Generator
     */
    public Long getOpSeq() {
        return opSeq;
    }

    /**
     * 设置操作序列，用于记录流水顺序: convert_obj.OP_SEQ
     * @param opSeq 映射数据库字段: convert_obj.OP_SEQ
     * @author MyBatis Generator
     */
    public void setOpSeq(Long opSeq) {
        this.opSeq = opSeq;
    }

    /**
     * 获取报名人数下限: convert_obj.SIGN_QUANTITY_MIN
     * @return 报名人数下限: convert_obj.SIGN_QUANTITY_MIN
     * @author MyBatis Generator
     */
    public Integer getSignQuantityMin() {
        return signQuantityMin;
    }

    /**
     * 设置报名人数下限: convert_obj.SIGN_QUANTITY_MIN
     * @param signQuantityMin 映射数据库字段: convert_obj.SIGN_QUANTITY_MIN
     * @author MyBatis Generator
     */
    public void setSignQuantityMin(Integer signQuantityMin) {
        this.signQuantityMin = signQuantityMin;
    }

    /**
     * 获取报名人数上限: convert_obj.SIGN_QUANTITY_MAX
     * @return 报名人数上限: convert_obj.SIGN_QUANTITY_MAX
     * @author MyBatis Generator
     */
    public Integer getSignQuantityMax() {
        return signQuantityMax;
    }

    /**
     * 设置报名人数上限: convert_obj.SIGN_QUANTITY_MAX
     * @param signQuantityMax 映射数据库字段: convert_obj.SIGN_QUANTITY_MAX
     * @author MyBatis Generator
     */
    public void setSignQuantityMax(Integer signQuantityMax) {
        this.signQuantityMax = signQuantityMax;
    }

    /**
     * 获取多奖项奖品明细， json格式，包含 奖品等级、奖品名称、奖品数量: convert_obj.multi_obj_detail
     * @return 多奖项奖品明细， json格式，包含 奖品等级、奖品名称、奖品数量: convert_obj.multi_obj_detail
     * @author MyBatis Generator
     */
    public String getMultiObjDetail() {
        return multiObjDetail;
    }

    /**
     * 设置多奖项奖品明细， json格式，包含 奖品等级、奖品名称、奖品数量: convert_obj.multi_obj_detail
     * @param multiObjDetail 映射数据库字段: convert_obj.multi_obj_detail
     * @author MyBatis Generator
     */
    public void setMultiObjDetail(String multiObjDetail) {
        this.multiObjDetail = multiObjDetail == null ? null : multiObjDetail.trim();
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_obj
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
        ConvertObj other = (ConvertObj) that;
        return (this.getConvertObjId() == null ? other.getConvertObjId() == null : this.getConvertObjId().equals(other.getConvertObjId()))
            && (this.getTransferToUserId() == null ? other.getTransferToUserId() == null : this.getTransferToUserId().equals(other.getTransferToUserId()))
            && (this.getLiteName() == null ? other.getLiteName() == null : this.getLiteName().equals(other.getLiteName()))
            && (this.getFullName() == null ? other.getFullName() == null : this.getFullName().equals(other.getFullName()))
            && (this.getVrtualOrActual() == null ? other.getVrtualOrActual() == null : this.getVrtualOrActual().equals(other.getVrtualOrActual()))
            && (this.getUnitName() == null ? other.getUnitName() == null : this.getUnitName().equals(other.getUnitName()))
            && (this.getRuleType() == null ? other.getRuleType() == null : this.getRuleType().equals(other.getRuleType()))
            && (this.getMarketPrice() == null ? other.getMarketPrice() == null : this.getMarketPrice().equals(other.getMarketPrice()))
            && (this.getTotalQuantity() == null ? other.getTotalQuantity() == null : this.getTotalQuantity().equals(other.getTotalQuantity()))
            && (this.getAvailableQuantity() == null ? other.getAvailableQuantity() == null : this.getAvailableQuantity().equals(other.getAvailableQuantity()))
            && (this.getStartTime() == null ? other.getStartTime() == null : this.getStartTime().equals(other.getStartTime()))
            && (this.getEndTime() == null ? other.getEndTime() == null : this.getEndTime().equals(other.getEndTime()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getIcon() == null ? other.getIcon() == null : this.getIcon().equals(other.getIcon()))
            && (this.getHeadImgs() == null ? other.getHeadImgs() == null : this.getHeadImgs().equals(other.getHeadImgs()))
            && (this.getIntroduceImgs() == null ? other.getIntroduceImgs() == null : this.getIntroduceImgs().equals(other.getIntroduceImgs()))
            && (this.getOtherProperties() == null ? other.getOtherProperties() == null : this.getOtherProperties().equals(other.getOtherProperties()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getValid() == null ? other.getValid() == null : this.getValid().equals(other.getValid()))
            && (this.getDrawed() == null ? other.getDrawed() == null : this.getDrawed().equals(other.getDrawed()))
            && (this.getDrawTime() == null ? other.getDrawTime() == null : this.getDrawTime().equals(other.getDrawTime()))
            && (this.getSignQuantity() == null ? other.getSignQuantity() == null : this.getSignQuantity().equals(other.getSignQuantity()))
            && (this.getOpSeq() == null ? other.getOpSeq() == null : this.getOpSeq().equals(other.getOpSeq()))
            && (this.getSignQuantityMin() == null ? other.getSignQuantityMin() == null : this.getSignQuantityMin().equals(other.getSignQuantityMin()))
            && (this.getSignQuantityMax() == null ? other.getSignQuantityMax() == null : this.getSignQuantityMax().equals(other.getSignQuantityMax()))
            && (this.getMultiObjDetail() == null ? other.getMultiObjDetail() == null : this.getMultiObjDetail().equals(other.getMultiObjDetail()));
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_obj
     * @author MyBatis Generator
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getConvertObjId() == null) ? 0 : getConvertObjId().hashCode());
        result = prime * result + ((getTransferToUserId() == null) ? 0 : getTransferToUserId().hashCode());
        result = prime * result + ((getLiteName() == null) ? 0 : getLiteName().hashCode());
        result = prime * result + ((getFullName() == null) ? 0 : getFullName().hashCode());
        result = prime * result + ((getVrtualOrActual() == null) ? 0 : getVrtualOrActual().hashCode());
        result = prime * result + ((getUnitName() == null) ? 0 : getUnitName().hashCode());
        result = prime * result + ((getRuleType() == null) ? 0 : getRuleType().hashCode());
        result = prime * result + ((getMarketPrice() == null) ? 0 : getMarketPrice().hashCode());
        result = prime * result + ((getTotalQuantity() == null) ? 0 : getTotalQuantity().hashCode());
        result = prime * result + ((getAvailableQuantity() == null) ? 0 : getAvailableQuantity().hashCode());
        result = prime * result + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        result = prime * result + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getIcon() == null) ? 0 : getIcon().hashCode());
        result = prime * result + ((getHeadImgs() == null) ? 0 : getHeadImgs().hashCode());
        result = prime * result + ((getIntroduceImgs() == null) ? 0 : getIntroduceImgs().hashCode());
        result = prime * result + ((getOtherProperties() == null) ? 0 : getOtherProperties().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getValid() == null) ? 0 : getValid().hashCode());
        result = prime * result + ((getDrawed() == null) ? 0 : getDrawed().hashCode());
        result = prime * result + ((getDrawTime() == null) ? 0 : getDrawTime().hashCode());
        result = prime * result + ((getSignQuantity() == null) ? 0 : getSignQuantity().hashCode());
        result = prime * result + ((getOpSeq() == null) ? 0 : getOpSeq().hashCode());
        result = prime * result + ((getSignQuantityMin() == null) ? 0 : getSignQuantityMin().hashCode());
        result = prime * result + ((getSignQuantityMax() == null) ? 0 : getSignQuantityMax().hashCode());
        result = prime * result + ((getMultiObjDetail() == null) ? 0 : getMultiObjDetail().hashCode());
        return result;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_obj
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
        sb.append(", transferToUserId=").append(transferToUserId);
        sb.append(", liteName=").append(liteName);
        sb.append(", fullName=").append(fullName);
        sb.append(", vrtualOrActual=").append(vrtualOrActual);
        sb.append(", unitName=").append(unitName);
        sb.append(", ruleType=").append(ruleType);
        sb.append(", marketPrice=").append(marketPrice);
        sb.append(", totalQuantity=").append(totalQuantity);
        sb.append(", availableQuantity=").append(availableQuantity);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", remark=").append(remark);
        sb.append(", icon=").append(icon);
        sb.append(", headImgs=").append(headImgs);
        sb.append(", introduceImgs=").append(introduceImgs);
        sb.append(", otherProperties=").append(otherProperties);
        sb.append(", createTime=").append(createTime);
        sb.append(", valid=").append(valid);
        sb.append(", drawed=").append(drawed);
        sb.append(", drawTime=").append(drawTime);
        sb.append(", signQuantity=").append(signQuantity);
        sb.append(", opSeq=").append(opSeq);
        sb.append(", signQuantityMin=").append(signQuantityMin);
        sb.append(", signQuantityMax=").append(signQuantityMax);
        sb.append(", multiObjDetail=").append(multiObjDetail);
        sb.append("]");
        return sb.toString();
    }
}