package cn.datai.gift.web.vo.tradeDetail;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by Administrator on 2017/4/27.
 */
public class TradeDetailVo{
    /**
     * 商品合约信息id: COMMODITY_CONTRACT.COMMODITY_CONTRACT_ID
     * @author MyBatis Generator
     */
    private Long commodityContractId;

    /**
     * 运营商id: COMMODITY_CONTRACT.OPERATOR_INFO_ID
     * @author MyBatis Generator
     */
    private Long operatorInfoId;

    /**
     * 商品编号: COMMODITY_CONTRACT.COMMODITY_CODE
     * @author MyBatis Generator
     */
    private String commodityCode;

    /**
     * 标的物: COMMODITY_CONTRACT.SUBJECT_MATTER
     * @author MyBatis Generator
     */
    private String subjectMatter;

    /**
     * 商品类型: COMMODITY_CONTRACT.COMMODITY_TYPE
     * @author MyBatis Generator
     */
    private Long commodityTypeId;

    /**
     * 商品名称: COMMODITY_CONTRACT.COMMODITY_NAME
     * @author MyBatis Generator
     */
    private String commodityName;

    /**
     * 基本单位名称   毫升、毫克、克等: COMMODITY_CONTRACT.UNIT
     * @author MyBatis Generator
     */
    private String unit;

    /**
     * 基本单位名称（英文）: COMMODITY_CONTRACT.UNIT_EN
     * @author MyBatis Generator
     */
    private String unitEn;

    /**
     * 规格单位名称， 瓶、饼、罐等: COMMODITY_CONTRACT.STANDARD_UNIT_NAME
     * @author MyBatis Generator
     */
    private String standardUnitName;

    /**
     * 规格单位对应基本单位数， 一瓶/罐对应多少基本单位: COMMODITY_CONTRACT.STANDARD_UNIT_MULTIPLE
     * @author MyBatis Generator
     */
    private BigDecimal standardUnitMultiple;

    /**
     * 交易单位对应基本单位数（一手）,一手对应多少毫升、毫克: COMMODITY_CONTRACT.TRADE_UNIT_MULTIPLE
     * @author MyBatis Generator
     */
    private BigDecimal tradeUnitMultiple;

    /**
     * 状态: COMMODITY_CONTRACT.STATUS
     * @author MyBatis Generator
     */
    private String status;

    /**
     * 修改时间: COMMODITY_CONTRACT.MODIFY_TIME
     * @author MyBatis Generator
     */
    private Date modifyTime;

    /**
     * 价格
     */
    private Long unitPrice;

    private String name;

    private String code;

    private String remark;

    private String typeName;

    private int operateNum;//兑换的物品的个数(份数)

    private String ruleType;//兑换的类型（以物换物，抽奖）

    private String win;//是否中奖

    private String convertStatus;//以物换物（order draw success）

    private String unitName;//以物换物（物品名称）

    private int marketPrice;//以物换物的市场价

    private String signSeq;//活动序列号

    private String commodityStandardPrice;//商品规格单位价格

    private String orderGroupId;//抽奖组ID

    public String getOrderGroupId() {
        return orderGroupId;
    }

    public void setOrderGroupId(String orderGroupId) {
        this.orderGroupId = orderGroupId;
    }

    public String getSignSeq() {
        return signSeq;
    }

    public void setSignSeq(String signSeq) {
        this.signSeq = signSeq;
    }

    public int getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(int marketPrice) {
        this.marketPrice = marketPrice;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public String getConvertStatus() {
        return convertStatus;
    }

    public void setConvertStatus(String convertStatus) {
        this.convertStatus = convertStatus;
    }

    public String getWin() {
        return win;
    }

    public void setWin(String win) {
        this.win = win;
    }

    public String getRuleType() {
        return ruleType;
    }

    public void setRuleType(String ruleType) {
        this.ruleType = ruleType;
    }

    public int getOperateNum() {
        return operateNum;
    }

    public void setOperateNum(int operateNum) {
        this.operateNum = operateNum;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getCommodityStandardPrice() {
        return commodityStandardPrice;
    }

    public void setCommodityStandardPrice(String commodityStandardPrice) {
        this.commodityStandardPrice = commodityStandardPrice;
    }

    /**
     * 用户所有业务概要记录id: USER_BIZ_BRIEF.USERL_BIZ_BRIEF_ID
     * @author MyBatis Generator
     */
    private Long userlBizBriefId;

    /**
     * 用户id: USER_BIZ_BRIEF.USER_INFO_ID
     * @author MyBatis Generator
     */
    private Long userInfoId;

    /**
     * 业务类型: USER_BIZ_BRIEF.BIZ_TYPE
     * @author MyBatis Generator
     */
    private String bizType;

    /**
     * 业务id: USER_BIZ_BRIEF.BIZ_ID
     * @author MyBatis Generator
     */
    private String bizId;

    /**
     * 创建时间: USER_BIZ_BRIEF.CREATE_TIME
     * @author MyBatis Generator
     */
    private Date createTime;

    /**
     * 商品操作单位数量: USER_BIZ_BRIEF.OP_COMMODITY_UNIT_QUANTITY
     * @author MyBatis Generator
     */
    private BigDecimal opCommodityUnitQuantity;

    /**
     * 业务状态， 针对不同的业务类型，有不同的状态: USER_BIZ_BRIEF.BIZ_STATUS
     * @author MyBatis Generator
     */
    private String bizStatus;

    /**
     * 附加数据, 针对于业务附加的数据，可根据业务类型自由定义: USER_BIZ_BRIEF.ATTACH
     * @author MyBatis Generator
     */
    private String attach;

    public Long getCommodityContractId() {
        return commodityContractId;
    }

    public void setCommodityContractId(Long commodityContractId) {
        this.commodityContractId = commodityContractId;
    }

    public Long getOperatorInfoId() {
        return operatorInfoId;
    }

    public void setOperatorInfoId(Long operatorInfoId) {
        this.operatorInfoId = operatorInfoId;
    }

    public String getCommodityCode() {
        return commodityCode;
    }

    public void setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
    }

    public String getSubjectMatter() {
        return subjectMatter;
    }

    public void setSubjectMatter(String subjectMatter) {
        this.subjectMatter = subjectMatter;
    }

    public Long getCommodityTypeId() {
        return commodityTypeId;
    }

    public void setCommodityTypeId(Long commodityTypeId) {
        this.commodityTypeId = commodityTypeId;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getUnitEn() {
        return unitEn;
    }

    public void setUnitEn(String unitEn) {
        this.unitEn = unitEn;
    }

    public String getStandardUnitName() {
        return standardUnitName;
    }

    public void setStandardUnitName(String standardUnitName) {
        this.standardUnitName = standardUnitName;
    }

    public BigDecimal getStandardUnitMultiple() {
        return standardUnitMultiple;
    }

    public void setStandardUnitMultiple(BigDecimal standardUnitMultiple) {
        this.standardUnitMultiple = standardUnitMultiple;
    }

    public BigDecimal getTradeUnitMultiple() {
        return tradeUnitMultiple;
    }

    public void setTradeUnitMultiple(BigDecimal tradeUnitMultiple) {
        this.tradeUnitMultiple = tradeUnitMultiple;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Long getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Long unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Long getUserlBizBriefId() {
        return userlBizBriefId;
    }

    public void setUserlBizBriefId(Long userlBizBriefId) {
        this.userlBizBriefId = userlBizBriefId;
    }

    public Long getUserInfoId() {
        return userInfoId;
    }

    public void setUserInfoId(Long userInfoId) {
        this.userInfoId = userInfoId;
    }

    public String getBizType() {
        return bizType;
    }

    public void setBizType(String bizType) {
        this.bizType = bizType;
    }

    public String getBizId() {
        return bizId;
    }

    public void setBizId(String bizId) {
        this.bizId = bizId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public BigDecimal getOpCommodityUnitQuantity() {
        return opCommodityUnitQuantity;
    }

    public void setOpCommodityUnitQuantity(BigDecimal opCommodityUnitQuantity) {
        this.opCommodityUnitQuantity = opCommodityUnitQuantity;
    }

    public String getBizStatus() {
        return bizStatus;
    }

    public void setBizStatus(String bizStatus) {
        this.bizStatus = bizStatus;
    }

    public String getAttach() {
        return attach;
    }

    public void setAttach(String attach) {
        this.attach = attach;
    }
}
