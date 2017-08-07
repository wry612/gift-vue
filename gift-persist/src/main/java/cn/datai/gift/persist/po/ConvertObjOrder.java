package cn.datai.gift.persist.po;

import java.io.Serializable;
import java.util.Date;

public class ConvertObjOrder implements Serializable {
    public static final long serialVersionUID = -1368410111L;

    /**
     * 以物换物订单id: convert_obj_order.CONVERT_OBJ_ORDER_ID
     * @author MyBatis Generator
     */
    private Long convertObjOrderId;

    /**
     * 订单组id: convert_obj_order.ORDER_GROUP_ID
     * @author MyBatis Generator
     */
    private String orderGroupId;

    /**
     * 参加活动序号， 针对对应的活动，报名或参加的顺序编号: convert_obj_order.SIGN_SEQ
     * @author MyBatis Generator
     */
    private Integer signSeq;

    /**
     * 用户id: convert_obj_order.USER_INFO_ID
     * @author MyBatis Generator
     */
    private Long userInfoId;

    /**
     * 兑换物品id: convert_obj_order.CONVERT_OBJ_ID
     * @author MyBatis Generator
     */
    private Long convertObjId;

    /**
     * 商品合约信息id: convert_obj_order.COMMODITY_CONTRACT_ID
     * @author MyBatis Generator
     */
    private Long commodityContractId;

    /**
     * 状态： : convert_obj_order.STATUS
     * @author MyBatis Generator
     */
    private String status;

    /**
     * 兑换物品数量: convert_obj_order.CONVERT_OBJ_QUANTITY
     * @author MyBatis Generator
     */
    private Integer convertObjQuantity;

    /**
     * 消耗商品数量: convert_obj_order.CONSUME_COMMODITY_QUANTITY
     * @author MyBatis Generator
     */
    private Integer consumeCommodityQuantity;

    /**
     * 商品总价，单位分: convert_obj_order.COMMODITY_TOTAL_PRICE
     * @author MyBatis Generator
     */
    private Long commodityTotalPrice;

    /**
     * 下单时间: convert_obj_order.ORDER_TIME
     * @author MyBatis Generator
     */
    private Date orderTime;

    /**
     * 申请取消时间: convert_obj_order.APPLY_CANCEL_TIME
     * @author MyBatis Generator
     */
    private Date applyCancelTime;

    /**
     * 取消时间: convert_obj_order.CANCEL_TIME
     * @author MyBatis Generator
     */
    private Date cancelTime;

    /**
     * 发货时间: convert_obj_order.DELIVERY_TIME
     * @author MyBatis Generator
     */
    private Date deliveryTime;

    /**
     * 完成时间: convert_obj_order.FINISH_TIME
     * @author MyBatis Generator
     */
    private Date finishTime;

    /**
     * 规则类型,   IMMEDIATE:立即兑换  、 DRAW:定期抽奖: convert_obj_order.RULE_TYPE
     * @author MyBatis Generator
     */
    private String ruleType;

    /**
     * 收货人姓名: convert_obj_order.ADDRESSEE_NAME
     * @author MyBatis Generator
     */
    private String addresseeName;

    /**
     * 收货人手机号: convert_obj_order.ADDRESSEE_MOBILE_PHONE
     * @author MyBatis Generator
     */
    private String addresseeMobilePhone;

    /**
     * 收货地址第一级地址: convert_obj_order.PROVICE_FIRST_STAGE_NAME
     * @author MyBatis Generator
     */
    private String proviceFirstStageName;

    /**
     * 收货地址第二级地址: convert_obj_order.ADDRESS_CITY_SECOND_STAGE_NAME
     * @author MyBatis Generator
     */
    private String addressCitySecondStageName;

    /**
     * 收货地址第三级地址: convert_obj_order.ADDRESS_COUNTIES_THIRD_STAGE_NAME
     * @author MyBatis Generator
     */
    private String addressCountiesThirdStageName;

    /**
     * 详细收货地址信息: convert_obj_order.ADDRESS_DETAIL_INFO
     * @author MyBatis Generator
     */
    private String addressDetailInfo;

    /**
     * 邮编: convert_obj_order.ADDRESS_POSTAL_CODE
     * @author MyBatis Generator
     */
    private String addressPostalCode;

    /**
     * 期望的提货日期: convert_obj_order.DATE_EXPECT
     * @author MyBatis Generator
     */
    private Date dateExpect;

    /**
     * 备注: convert_obj_order.REMARK
     * @author MyBatis Generator
     */
    private String remark;

    /**
     * 商品流通记录信息ids， 多个用逗号隔开: convert_obj_order.COMMODITY_FLOW_RECORD_IDS
     * @author MyBatis Generator
     */
    private String commodityFlowRecordIds;

    /**
     * 物流运营商: convert_obj_order.LOGISTICS_OPERATOR
     * @author MyBatis Generator
     */
    private String logisticsOperator;

    /**
     * 物流单号: convert_obj_order.LOGISTICS_ORDER_ID
     * @author MyBatis Generator
     */
    private String logisticsOrderId;

    /**
     * 物流跟踪信息id: convert_obj_order.EXPRESS_INFO_ID
     * @author MyBatis Generator
     */
    private Long expressInfoId;

    /**
     * 是否中奖,  TRUE:中奖     FALSE:未中奖: convert_obj_order.WIN
     * @author MyBatis Generator
     */
    private String win;

    /**
     * 中奖等级， 1：一等奖   2：二等奖  以此类推: convert_obj_order.WIN_LEVEL
     * @author MyBatis Generator
     */
    private String winLevel;

    /**
     * 物品流通记录ids, 多个用英文逗号隔开: convert_obj_order.CONVERT_OBJ_FLOW_RECORD_IDS
     * @author MyBatis Generator
     */
    private String convertObjFlowRecordIds;

    /**
     * 卖家发货信息, json格式: convert_obj_order.SELLER_DELIVERY_INFO
     * @author MyBatis Generator
     */
    private String sellerDeliveryInfo;

    /**
     * 多奖项信息, json格式 包含奖品等级、奖品名称: convert_obj_order.MULTI_OBJ_DETAIL
     * @author MyBatis Generator
     */
    private String multiObjDetail;

    /**
     * 获取以物换物订单id: convert_obj_order.CONVERT_OBJ_ORDER_ID
     * @return 以物换物订单id: convert_obj_order.CONVERT_OBJ_ORDER_ID
     * @author MyBatis Generator
     */
    public Long getConvertObjOrderId() {
        return convertObjOrderId;
    }

    /**
     * 设置以物换物订单id: convert_obj_order.CONVERT_OBJ_ORDER_ID
     * @param convertObjOrderId 映射数据库字段: convert_obj_order.CONVERT_OBJ_ORDER_ID
     * @author MyBatis Generator
     */
    public void setConvertObjOrderId(Long convertObjOrderId) {
        this.convertObjOrderId = convertObjOrderId;
    }

    /**
     * 获取订单组id: convert_obj_order.ORDER_GROUP_ID
     * @return 订单组id: convert_obj_order.ORDER_GROUP_ID
     * @author MyBatis Generator
     */
    public String getOrderGroupId() {
        return orderGroupId;
    }

    /**
     * 设置订单组id: convert_obj_order.ORDER_GROUP_ID
     * @param orderGroupId 映射数据库字段: convert_obj_order.ORDER_GROUP_ID
     * @author MyBatis Generator
     */
    public void setOrderGroupId(String orderGroupId) {
        this.orderGroupId = orderGroupId == null ? null : orderGroupId.trim();
    }

    /**
     * 获取参加活动序号， 针对对应的活动，报名或参加的顺序编号: convert_obj_order.SIGN_SEQ
     * @return 参加活动序号， 针对对应的活动，报名或参加的顺序编号: convert_obj_order.SIGN_SEQ
     * @author MyBatis Generator
     */
    public Integer getSignSeq() {
        return signSeq;
    }

    /**
     * 设置参加活动序号， 针对对应的活动，报名或参加的顺序编号: convert_obj_order.SIGN_SEQ
     * @param signSeq 映射数据库字段: convert_obj_order.SIGN_SEQ
     * @author MyBatis Generator
     */
    public void setSignSeq(Integer signSeq) {
        this.signSeq = signSeq;
    }

    /**
     * 获取用户id: convert_obj_order.USER_INFO_ID
     * @return 用户id: convert_obj_order.USER_INFO_ID
     * @author MyBatis Generator
     */
    public Long getUserInfoId() {
        return userInfoId;
    }

    /**
     * 设置用户id: convert_obj_order.USER_INFO_ID
     * @param userInfoId 映射数据库字段: convert_obj_order.USER_INFO_ID
     * @author MyBatis Generator
     */
    public void setUserInfoId(Long userInfoId) {
        this.userInfoId = userInfoId;
    }

    /**
     * 获取兑换物品id: convert_obj_order.CONVERT_OBJ_ID
     * @return 兑换物品id: convert_obj_order.CONVERT_OBJ_ID
     * @author MyBatis Generator
     */
    public Long getConvertObjId() {
        return convertObjId;
    }

    /**
     * 设置兑换物品id: convert_obj_order.CONVERT_OBJ_ID
     * @param convertObjId 映射数据库字段: convert_obj_order.CONVERT_OBJ_ID
     * @author MyBatis Generator
     */
    public void setConvertObjId(Long convertObjId) {
        this.convertObjId = convertObjId;
    }

    /**
     * 获取商品合约信息id: convert_obj_order.COMMODITY_CONTRACT_ID
     * @return 商品合约信息id: convert_obj_order.COMMODITY_CONTRACT_ID
     * @author MyBatis Generator
     */
    public Long getCommodityContractId() {
        return commodityContractId;
    }

    /**
     * 设置商品合约信息id: convert_obj_order.COMMODITY_CONTRACT_ID
     * @param commodityContractId 映射数据库字段: convert_obj_order.COMMODITY_CONTRACT_ID
     * @author MyBatis Generator
     */
    public void setCommodityContractId(Long commodityContractId) {
        this.commodityContractId = commodityContractId;
    }

    /**
     * 获取状态： : convert_obj_order.STATUS
     * @return 状态： : convert_obj_order.STATUS
     * @author MyBatis Generator
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置状态： : convert_obj_order.STATUS
     * @param status 映射数据库字段: convert_obj_order.STATUS
     * @author MyBatis Generator
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * 获取兑换物品数量: convert_obj_order.CONVERT_OBJ_QUANTITY
     * @return 兑换物品数量: convert_obj_order.CONVERT_OBJ_QUANTITY
     * @author MyBatis Generator
     */
    public Integer getConvertObjQuantity() {
        return convertObjQuantity;
    }

    /**
     * 设置兑换物品数量: convert_obj_order.CONVERT_OBJ_QUANTITY
     * @param convertObjQuantity 映射数据库字段: convert_obj_order.CONVERT_OBJ_QUANTITY
     * @author MyBatis Generator
     */
    public void setConvertObjQuantity(Integer convertObjQuantity) {
        this.convertObjQuantity = convertObjQuantity;
    }

    /**
     * 获取消耗商品数量: convert_obj_order.CONSUME_COMMODITY_QUANTITY
     * @return 消耗商品数量: convert_obj_order.CONSUME_COMMODITY_QUANTITY
     * @author MyBatis Generator
     */
    public Integer getConsumeCommodityQuantity() {
        return consumeCommodityQuantity;
    }

    /**
     * 设置消耗商品数量: convert_obj_order.CONSUME_COMMODITY_QUANTITY
     * @param consumeCommodityQuantity 映射数据库字段: convert_obj_order.CONSUME_COMMODITY_QUANTITY
     * @author MyBatis Generator
     */
    public void setConsumeCommodityQuantity(Integer consumeCommodityQuantity) {
        this.consumeCommodityQuantity = consumeCommodityQuantity;
    }

    /**
     * 获取商品总价，单位分: convert_obj_order.COMMODITY_TOTAL_PRICE
     * @return 商品总价，单位分: convert_obj_order.COMMODITY_TOTAL_PRICE
     * @author MyBatis Generator
     */
    public Long getCommodityTotalPrice() {
        return commodityTotalPrice;
    }

    /**
     * 设置商品总价，单位分: convert_obj_order.COMMODITY_TOTAL_PRICE
     * @param commodityTotalPrice 映射数据库字段: convert_obj_order.COMMODITY_TOTAL_PRICE
     * @author MyBatis Generator
     */
    public void setCommodityTotalPrice(Long commodityTotalPrice) {
        this.commodityTotalPrice = commodityTotalPrice;
    }

    /**
     * 获取下单时间: convert_obj_order.ORDER_TIME
     * @return 下单时间: convert_obj_order.ORDER_TIME
     * @author MyBatis Generator
     */
    public Date getOrderTime() {
        return orderTime;
    }

    /**
     * 设置下单时间: convert_obj_order.ORDER_TIME
     * @param orderTime 映射数据库字段: convert_obj_order.ORDER_TIME
     * @author MyBatis Generator
     */
    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    /**
     * 获取申请取消时间: convert_obj_order.APPLY_CANCEL_TIME
     * @return 申请取消时间: convert_obj_order.APPLY_CANCEL_TIME
     * @author MyBatis Generator
     */
    public Date getApplyCancelTime() {
        return applyCancelTime;
    }

    /**
     * 设置申请取消时间: convert_obj_order.APPLY_CANCEL_TIME
     * @param applyCancelTime 映射数据库字段: convert_obj_order.APPLY_CANCEL_TIME
     * @author MyBatis Generator
     */
    public void setApplyCancelTime(Date applyCancelTime) {
        this.applyCancelTime = applyCancelTime;
    }

    /**
     * 获取取消时间: convert_obj_order.CANCEL_TIME
     * @return 取消时间: convert_obj_order.CANCEL_TIME
     * @author MyBatis Generator
     */
    public Date getCancelTime() {
        return cancelTime;
    }

    /**
     * 设置取消时间: convert_obj_order.CANCEL_TIME
     * @param cancelTime 映射数据库字段: convert_obj_order.CANCEL_TIME
     * @author MyBatis Generator
     */
    public void setCancelTime(Date cancelTime) {
        this.cancelTime = cancelTime;
    }

    /**
     * 获取发货时间: convert_obj_order.DELIVERY_TIME
     * @return 发货时间: convert_obj_order.DELIVERY_TIME
     * @author MyBatis Generator
     */
    public Date getDeliveryTime() {
        return deliveryTime;
    }

    /**
     * 设置发货时间: convert_obj_order.DELIVERY_TIME
     * @param deliveryTime 映射数据库字段: convert_obj_order.DELIVERY_TIME
     * @author MyBatis Generator
     */
    public void setDeliveryTime(Date deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    /**
     * 获取完成时间: convert_obj_order.FINISH_TIME
     * @return 完成时间: convert_obj_order.FINISH_TIME
     * @author MyBatis Generator
     */
    public Date getFinishTime() {
        return finishTime;
    }

    /**
     * 设置完成时间: convert_obj_order.FINISH_TIME
     * @param finishTime 映射数据库字段: convert_obj_order.FINISH_TIME
     * @author MyBatis Generator
     */
    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    /**
     * 获取规则类型,   IMMEDIATE:立即兑换  、 DRAW:定期抽奖: convert_obj_order.RULE_TYPE
     * @return 规则类型,   IMMEDIATE:立即兑换  、 DRAW:定期抽奖: convert_obj_order.RULE_TYPE
     * @author MyBatis Generator
     */
    public String getRuleType() {
        return ruleType;
    }

    /**
     * 设置规则类型,   IMMEDIATE:立即兑换  、 DRAW:定期抽奖: convert_obj_order.RULE_TYPE
     * @param ruleType 映射数据库字段: convert_obj_order.RULE_TYPE
     * @author MyBatis Generator
     */
    public void setRuleType(String ruleType) {
        this.ruleType = ruleType == null ? null : ruleType.trim();
    }

    /**
     * 获取收货人姓名: convert_obj_order.ADDRESSEE_NAME
     * @return 收货人姓名: convert_obj_order.ADDRESSEE_NAME
     * @author MyBatis Generator
     */
    public String getAddresseeName() {
        return addresseeName;
    }

    /**
     * 设置收货人姓名: convert_obj_order.ADDRESSEE_NAME
     * @param addresseeName 映射数据库字段: convert_obj_order.ADDRESSEE_NAME
     * @author MyBatis Generator
     */
    public void setAddresseeName(String addresseeName) {
        this.addresseeName = addresseeName == null ? null : addresseeName.trim();
    }

    /**
     * 获取收货人手机号: convert_obj_order.ADDRESSEE_MOBILE_PHONE
     * @return 收货人手机号: convert_obj_order.ADDRESSEE_MOBILE_PHONE
     * @author MyBatis Generator
     */
    public String getAddresseeMobilePhone() {
        return addresseeMobilePhone;
    }

    /**
     * 设置收货人手机号: convert_obj_order.ADDRESSEE_MOBILE_PHONE
     * @param addresseeMobilePhone 映射数据库字段: convert_obj_order.ADDRESSEE_MOBILE_PHONE
     * @author MyBatis Generator
     */
    public void setAddresseeMobilePhone(String addresseeMobilePhone) {
        this.addresseeMobilePhone = addresseeMobilePhone == null ? null : addresseeMobilePhone.trim();
    }

    /**
     * 获取收货地址第一级地址: convert_obj_order.PROVICE_FIRST_STAGE_NAME
     * @return 收货地址第一级地址: convert_obj_order.PROVICE_FIRST_STAGE_NAME
     * @author MyBatis Generator
     */
    public String getProviceFirstStageName() {
        return proviceFirstStageName;
    }

    /**
     * 设置收货地址第一级地址: convert_obj_order.PROVICE_FIRST_STAGE_NAME
     * @param proviceFirstStageName 映射数据库字段: convert_obj_order.PROVICE_FIRST_STAGE_NAME
     * @author MyBatis Generator
     */
    public void setProviceFirstStageName(String proviceFirstStageName) {
        this.proviceFirstStageName = proviceFirstStageName == null ? null : proviceFirstStageName.trim();
    }

    /**
     * 获取收货地址第二级地址: convert_obj_order.ADDRESS_CITY_SECOND_STAGE_NAME
     * @return 收货地址第二级地址: convert_obj_order.ADDRESS_CITY_SECOND_STAGE_NAME
     * @author MyBatis Generator
     */
    public String getAddressCitySecondStageName() {
        return addressCitySecondStageName;
    }

    /**
     * 设置收货地址第二级地址: convert_obj_order.ADDRESS_CITY_SECOND_STAGE_NAME
     * @param addressCitySecondStageName 映射数据库字段: convert_obj_order.ADDRESS_CITY_SECOND_STAGE_NAME
     * @author MyBatis Generator
     */
    public void setAddressCitySecondStageName(String addressCitySecondStageName) {
        this.addressCitySecondStageName = addressCitySecondStageName == null ? null : addressCitySecondStageName.trim();
    }

    /**
     * 获取收货地址第三级地址: convert_obj_order.ADDRESS_COUNTIES_THIRD_STAGE_NAME
     * @return 收货地址第三级地址: convert_obj_order.ADDRESS_COUNTIES_THIRD_STAGE_NAME
     * @author MyBatis Generator
     */
    public String getAddressCountiesThirdStageName() {
        return addressCountiesThirdStageName;
    }

    /**
     * 设置收货地址第三级地址: convert_obj_order.ADDRESS_COUNTIES_THIRD_STAGE_NAME
     * @param addressCountiesThirdStageName 映射数据库字段: convert_obj_order.ADDRESS_COUNTIES_THIRD_STAGE_NAME
     * @author MyBatis Generator
     */
    public void setAddressCountiesThirdStageName(String addressCountiesThirdStageName) {
        this.addressCountiesThirdStageName = addressCountiesThirdStageName == null ? null : addressCountiesThirdStageName.trim();
    }

    /**
     * 获取详细收货地址信息: convert_obj_order.ADDRESS_DETAIL_INFO
     * @return 详细收货地址信息: convert_obj_order.ADDRESS_DETAIL_INFO
     * @author MyBatis Generator
     */
    public String getAddressDetailInfo() {
        return addressDetailInfo;
    }

    /**
     * 设置详细收货地址信息: convert_obj_order.ADDRESS_DETAIL_INFO
     * @param addressDetailInfo 映射数据库字段: convert_obj_order.ADDRESS_DETAIL_INFO
     * @author MyBatis Generator
     */
    public void setAddressDetailInfo(String addressDetailInfo) {
        this.addressDetailInfo = addressDetailInfo == null ? null : addressDetailInfo.trim();
    }

    /**
     * 获取邮编: convert_obj_order.ADDRESS_POSTAL_CODE
     * @return 邮编: convert_obj_order.ADDRESS_POSTAL_CODE
     * @author MyBatis Generator
     */
    public String getAddressPostalCode() {
        return addressPostalCode;
    }

    /**
     * 设置邮编: convert_obj_order.ADDRESS_POSTAL_CODE
     * @param addressPostalCode 映射数据库字段: convert_obj_order.ADDRESS_POSTAL_CODE
     * @author MyBatis Generator
     */
    public void setAddressPostalCode(String addressPostalCode) {
        this.addressPostalCode = addressPostalCode == null ? null : addressPostalCode.trim();
    }

    /**
     * 获取期望的提货日期: convert_obj_order.DATE_EXPECT
     * @return 期望的提货日期: convert_obj_order.DATE_EXPECT
     * @author MyBatis Generator
     */
    public Date getDateExpect() {
        return dateExpect;
    }

    /**
     * 设置期望的提货日期: convert_obj_order.DATE_EXPECT
     * @param dateExpect 映射数据库字段: convert_obj_order.DATE_EXPECT
     * @author MyBatis Generator
     */
    public void setDateExpect(Date dateExpect) {
        this.dateExpect = dateExpect;
    }

    /**
     * 获取备注: convert_obj_order.REMARK
     * @return 备注: convert_obj_order.REMARK
     * @author MyBatis Generator
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注: convert_obj_order.REMARK
     * @param remark 映射数据库字段: convert_obj_order.REMARK
     * @author MyBatis Generator
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * 获取商品流通记录信息ids， 多个用逗号隔开: convert_obj_order.COMMODITY_FLOW_RECORD_IDS
     * @return 商品流通记录信息ids， 多个用逗号隔开: convert_obj_order.COMMODITY_FLOW_RECORD_IDS
     * @author MyBatis Generator
     */
    public String getCommodityFlowRecordIds() {
        return commodityFlowRecordIds;
    }

    /**
     * 设置商品流通记录信息ids， 多个用逗号隔开: convert_obj_order.COMMODITY_FLOW_RECORD_IDS
     * @param commodityFlowRecordIds 映射数据库字段: convert_obj_order.COMMODITY_FLOW_RECORD_IDS
     * @author MyBatis Generator
     */
    public void setCommodityFlowRecordIds(String commodityFlowRecordIds) {
        this.commodityFlowRecordIds = commodityFlowRecordIds == null ? null : commodityFlowRecordIds.trim();
    }

    /**
     * 获取物流运营商: convert_obj_order.LOGISTICS_OPERATOR
     * @return 物流运营商: convert_obj_order.LOGISTICS_OPERATOR
     * @author MyBatis Generator
     */
    public String getLogisticsOperator() {
        return logisticsOperator;
    }

    /**
     * 设置物流运营商: convert_obj_order.LOGISTICS_OPERATOR
     * @param logisticsOperator 映射数据库字段: convert_obj_order.LOGISTICS_OPERATOR
     * @author MyBatis Generator
     */
    public void setLogisticsOperator(String logisticsOperator) {
        this.logisticsOperator = logisticsOperator == null ? null : logisticsOperator.trim();
    }

    /**
     * 获取物流单号: convert_obj_order.LOGISTICS_ORDER_ID
     * @return 物流单号: convert_obj_order.LOGISTICS_ORDER_ID
     * @author MyBatis Generator
     */
    public String getLogisticsOrderId() {
        return logisticsOrderId;
    }

    /**
     * 设置物流单号: convert_obj_order.LOGISTICS_ORDER_ID
     * @param logisticsOrderId 映射数据库字段: convert_obj_order.LOGISTICS_ORDER_ID
     * @author MyBatis Generator
     */
    public void setLogisticsOrderId(String logisticsOrderId) {
        this.logisticsOrderId = logisticsOrderId == null ? null : logisticsOrderId.trim();
    }

    /**
     * 获取物流跟踪信息id: convert_obj_order.EXPRESS_INFO_ID
     * @return 物流跟踪信息id: convert_obj_order.EXPRESS_INFO_ID
     * @author MyBatis Generator
     */
    public Long getExpressInfoId() {
        return expressInfoId;
    }

    /**
     * 设置物流跟踪信息id: convert_obj_order.EXPRESS_INFO_ID
     * @param expressInfoId 映射数据库字段: convert_obj_order.EXPRESS_INFO_ID
     * @author MyBatis Generator
     */
    public void setExpressInfoId(Long expressInfoId) {
        this.expressInfoId = expressInfoId;
    }

    /**
     * 获取是否中奖,  TRUE:中奖     FALSE:未中奖: convert_obj_order.WIN
     * @return 是否中奖,  TRUE:中奖     FALSE:未中奖: convert_obj_order.WIN
     * @author MyBatis Generator
     */
    public String getWin() {
        return win;
    }

    /**
     * 设置是否中奖,  TRUE:中奖     FALSE:未中奖: convert_obj_order.WIN
     * @param win 映射数据库字段: convert_obj_order.WIN
     * @author MyBatis Generator
     */
    public void setWin(String win) {
        this.win = win == null ? null : win.trim();
    }

    /**
     * 获取中奖等级， 1：一等奖   2：二等奖  以此类推: convert_obj_order.WIN_LEVEL
     * @return 中奖等级， 1：一等奖   2：二等奖  以此类推: convert_obj_order.WIN_LEVEL
     * @author MyBatis Generator
     */
    public String getWinLevel() {
        return winLevel;
    }

    /**
     * 设置中奖等级， 1：一等奖   2：二等奖  以此类推: convert_obj_order.WIN_LEVEL
     * @param winLevel 映射数据库字段: convert_obj_order.WIN_LEVEL
     * @author MyBatis Generator
     */
    public void setWinLevel(String winLevel) {
        this.winLevel = winLevel == null ? null : winLevel.trim();
    }

    /**
     * 获取物品流通记录ids, 多个用英文逗号隔开: convert_obj_order.CONVERT_OBJ_FLOW_RECORD_IDS
     * @return 物品流通记录ids, 多个用英文逗号隔开: convert_obj_order.CONVERT_OBJ_FLOW_RECORD_IDS
     * @author MyBatis Generator
     */
    public String getConvertObjFlowRecordIds() {
        return convertObjFlowRecordIds;
    }

    /**
     * 设置物品流通记录ids, 多个用英文逗号隔开: convert_obj_order.CONVERT_OBJ_FLOW_RECORD_IDS
     * @param convertObjFlowRecordIds 映射数据库字段: convert_obj_order.CONVERT_OBJ_FLOW_RECORD_IDS
     * @author MyBatis Generator
     */
    public void setConvertObjFlowRecordIds(String convertObjFlowRecordIds) {
        this.convertObjFlowRecordIds = convertObjFlowRecordIds == null ? null : convertObjFlowRecordIds.trim();
    }

    /**
     * 获取卖家发货信息, json格式: convert_obj_order.SELLER_DELIVERY_INFO
     * @return 卖家发货信息, json格式: convert_obj_order.SELLER_DELIVERY_INFO
     * @author MyBatis Generator
     */
    public String getSellerDeliveryInfo() {
        return sellerDeliveryInfo;
    }

    /**
     * 设置卖家发货信息, json格式: convert_obj_order.SELLER_DELIVERY_INFO
     * @param sellerDeliveryInfo 映射数据库字段: convert_obj_order.SELLER_DELIVERY_INFO
     * @author MyBatis Generator
     */
    public void setSellerDeliveryInfo(String sellerDeliveryInfo) {
        this.sellerDeliveryInfo = sellerDeliveryInfo == null ? null : sellerDeliveryInfo.trim();
    }

    /**
     * 获取多奖项信息, json格式 包含奖品等级、奖品名称: convert_obj_order.MULTI_OBJ_DETAIL
     * @return 多奖项信息, json格式 包含奖品等级、奖品名称: convert_obj_order.MULTI_OBJ_DETAIL
     * @author MyBatis Generator
     */
    public String getMultiObjDetail() {
        return multiObjDetail;
    }

    /**
     * 设置多奖项信息, json格式 包含奖品等级、奖品名称: convert_obj_order.MULTI_OBJ_DETAIL
     * @param multiObjDetail 映射数据库字段: convert_obj_order.MULTI_OBJ_DETAIL
     * @author MyBatis Generator
     */
    public void setMultiObjDetail(String multiObjDetail) {
        this.multiObjDetail = multiObjDetail == null ? null : multiObjDetail.trim();
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_obj_order
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
        ConvertObjOrder other = (ConvertObjOrder) that;
        return (this.getConvertObjOrderId() == null ? other.getConvertObjOrderId() == null : this.getConvertObjOrderId().equals(other.getConvertObjOrderId()))
            && (this.getOrderGroupId() == null ? other.getOrderGroupId() == null : this.getOrderGroupId().equals(other.getOrderGroupId()))
            && (this.getSignSeq() == null ? other.getSignSeq() == null : this.getSignSeq().equals(other.getSignSeq()))
            && (this.getUserInfoId() == null ? other.getUserInfoId() == null : this.getUserInfoId().equals(other.getUserInfoId()))
            && (this.getConvertObjId() == null ? other.getConvertObjId() == null : this.getConvertObjId().equals(other.getConvertObjId()))
            && (this.getCommodityContractId() == null ? other.getCommodityContractId() == null : this.getCommodityContractId().equals(other.getCommodityContractId()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getConvertObjQuantity() == null ? other.getConvertObjQuantity() == null : this.getConvertObjQuantity().equals(other.getConvertObjQuantity()))
            && (this.getConsumeCommodityQuantity() == null ? other.getConsumeCommodityQuantity() == null : this.getConsumeCommodityQuantity().equals(other.getConsumeCommodityQuantity()))
            && (this.getCommodityTotalPrice() == null ? other.getCommodityTotalPrice() == null : this.getCommodityTotalPrice().equals(other.getCommodityTotalPrice()))
            && (this.getOrderTime() == null ? other.getOrderTime() == null : this.getOrderTime().equals(other.getOrderTime()))
            && (this.getApplyCancelTime() == null ? other.getApplyCancelTime() == null : this.getApplyCancelTime().equals(other.getApplyCancelTime()))
            && (this.getCancelTime() == null ? other.getCancelTime() == null : this.getCancelTime().equals(other.getCancelTime()))
            && (this.getDeliveryTime() == null ? other.getDeliveryTime() == null : this.getDeliveryTime().equals(other.getDeliveryTime()))
            && (this.getFinishTime() == null ? other.getFinishTime() == null : this.getFinishTime().equals(other.getFinishTime()))
            && (this.getRuleType() == null ? other.getRuleType() == null : this.getRuleType().equals(other.getRuleType()))
            && (this.getAddresseeName() == null ? other.getAddresseeName() == null : this.getAddresseeName().equals(other.getAddresseeName()))
            && (this.getAddresseeMobilePhone() == null ? other.getAddresseeMobilePhone() == null : this.getAddresseeMobilePhone().equals(other.getAddresseeMobilePhone()))
            && (this.getProviceFirstStageName() == null ? other.getProviceFirstStageName() == null : this.getProviceFirstStageName().equals(other.getProviceFirstStageName()))
            && (this.getAddressCitySecondStageName() == null ? other.getAddressCitySecondStageName() == null : this.getAddressCitySecondStageName().equals(other.getAddressCitySecondStageName()))
            && (this.getAddressCountiesThirdStageName() == null ? other.getAddressCountiesThirdStageName() == null : this.getAddressCountiesThirdStageName().equals(other.getAddressCountiesThirdStageName()))
            && (this.getAddressDetailInfo() == null ? other.getAddressDetailInfo() == null : this.getAddressDetailInfo().equals(other.getAddressDetailInfo()))
            && (this.getAddressPostalCode() == null ? other.getAddressPostalCode() == null : this.getAddressPostalCode().equals(other.getAddressPostalCode()))
            && (this.getDateExpect() == null ? other.getDateExpect() == null : this.getDateExpect().equals(other.getDateExpect()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getCommodityFlowRecordIds() == null ? other.getCommodityFlowRecordIds() == null : this.getCommodityFlowRecordIds().equals(other.getCommodityFlowRecordIds()))
            && (this.getLogisticsOperator() == null ? other.getLogisticsOperator() == null : this.getLogisticsOperator().equals(other.getLogisticsOperator()))
            && (this.getLogisticsOrderId() == null ? other.getLogisticsOrderId() == null : this.getLogisticsOrderId().equals(other.getLogisticsOrderId()))
            && (this.getExpressInfoId() == null ? other.getExpressInfoId() == null : this.getExpressInfoId().equals(other.getExpressInfoId()))
            && (this.getWin() == null ? other.getWin() == null : this.getWin().equals(other.getWin()))
            && (this.getWinLevel() == null ? other.getWinLevel() == null : this.getWinLevel().equals(other.getWinLevel()))
            && (this.getConvertObjFlowRecordIds() == null ? other.getConvertObjFlowRecordIds() == null : this.getConvertObjFlowRecordIds().equals(other.getConvertObjFlowRecordIds()))
            && (this.getSellerDeliveryInfo() == null ? other.getSellerDeliveryInfo() == null : this.getSellerDeliveryInfo().equals(other.getSellerDeliveryInfo()))
            && (this.getMultiObjDetail() == null ? other.getMultiObjDetail() == null : this.getMultiObjDetail().equals(other.getMultiObjDetail()));
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_obj_order
     * @author MyBatis Generator
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getConvertObjOrderId() == null) ? 0 : getConvertObjOrderId().hashCode());
        result = prime * result + ((getOrderGroupId() == null) ? 0 : getOrderGroupId().hashCode());
        result = prime * result + ((getSignSeq() == null) ? 0 : getSignSeq().hashCode());
        result = prime * result + ((getUserInfoId() == null) ? 0 : getUserInfoId().hashCode());
        result = prime * result + ((getConvertObjId() == null) ? 0 : getConvertObjId().hashCode());
        result = prime * result + ((getCommodityContractId() == null) ? 0 : getCommodityContractId().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getConvertObjQuantity() == null) ? 0 : getConvertObjQuantity().hashCode());
        result = prime * result + ((getConsumeCommodityQuantity() == null) ? 0 : getConsumeCommodityQuantity().hashCode());
        result = prime * result + ((getCommodityTotalPrice() == null) ? 0 : getCommodityTotalPrice().hashCode());
        result = prime * result + ((getOrderTime() == null) ? 0 : getOrderTime().hashCode());
        result = prime * result + ((getApplyCancelTime() == null) ? 0 : getApplyCancelTime().hashCode());
        result = prime * result + ((getCancelTime() == null) ? 0 : getCancelTime().hashCode());
        result = prime * result + ((getDeliveryTime() == null) ? 0 : getDeliveryTime().hashCode());
        result = prime * result + ((getFinishTime() == null) ? 0 : getFinishTime().hashCode());
        result = prime * result + ((getRuleType() == null) ? 0 : getRuleType().hashCode());
        result = prime * result + ((getAddresseeName() == null) ? 0 : getAddresseeName().hashCode());
        result = prime * result + ((getAddresseeMobilePhone() == null) ? 0 : getAddresseeMobilePhone().hashCode());
        result = prime * result + ((getProviceFirstStageName() == null) ? 0 : getProviceFirstStageName().hashCode());
        result = prime * result + ((getAddressCitySecondStageName() == null) ? 0 : getAddressCitySecondStageName().hashCode());
        result = prime * result + ((getAddressCountiesThirdStageName() == null) ? 0 : getAddressCountiesThirdStageName().hashCode());
        result = prime * result + ((getAddressDetailInfo() == null) ? 0 : getAddressDetailInfo().hashCode());
        result = prime * result + ((getAddressPostalCode() == null) ? 0 : getAddressPostalCode().hashCode());
        result = prime * result + ((getDateExpect() == null) ? 0 : getDateExpect().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCommodityFlowRecordIds() == null) ? 0 : getCommodityFlowRecordIds().hashCode());
        result = prime * result + ((getLogisticsOperator() == null) ? 0 : getLogisticsOperator().hashCode());
        result = prime * result + ((getLogisticsOrderId() == null) ? 0 : getLogisticsOrderId().hashCode());
        result = prime * result + ((getExpressInfoId() == null) ? 0 : getExpressInfoId().hashCode());
        result = prime * result + ((getWin() == null) ? 0 : getWin().hashCode());
        result = prime * result + ((getWinLevel() == null) ? 0 : getWinLevel().hashCode());
        result = prime * result + ((getConvertObjFlowRecordIds() == null) ? 0 : getConvertObjFlowRecordIds().hashCode());
        result = prime * result + ((getSellerDeliveryInfo() == null) ? 0 : getSellerDeliveryInfo().hashCode());
        result = prime * result + ((getMultiObjDetail() == null) ? 0 : getMultiObjDetail().hashCode());
        return result;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: convert_obj_order
     * @author MyBatis Generator
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append(", convertObjOrderId=").append(convertObjOrderId);
        sb.append(", orderGroupId=").append(orderGroupId);
        sb.append(", signSeq=").append(signSeq);
        sb.append(", userInfoId=").append(userInfoId);
        sb.append(", convertObjId=").append(convertObjId);
        sb.append(", commodityContractId=").append(commodityContractId);
        sb.append(", status=").append(status);
        sb.append(", convertObjQuantity=").append(convertObjQuantity);
        sb.append(", consumeCommodityQuantity=").append(consumeCommodityQuantity);
        sb.append(", commodityTotalPrice=").append(commodityTotalPrice);
        sb.append(", orderTime=").append(orderTime);
        sb.append(", applyCancelTime=").append(applyCancelTime);
        sb.append(", cancelTime=").append(cancelTime);
        sb.append(", deliveryTime=").append(deliveryTime);
        sb.append(", finishTime=").append(finishTime);
        sb.append(", ruleType=").append(ruleType);
        sb.append(", addresseeName=").append(addresseeName);
        sb.append(", addresseeMobilePhone=").append(addresseeMobilePhone);
        sb.append(", proviceFirstStageName=").append(proviceFirstStageName);
        sb.append(", addressCitySecondStageName=").append(addressCitySecondStageName);
        sb.append(", addressCountiesThirdStageName=").append(addressCountiesThirdStageName);
        sb.append(", addressDetailInfo=").append(addressDetailInfo);
        sb.append(", addressPostalCode=").append(addressPostalCode);
        sb.append(", dateExpect=").append(dateExpect);
        sb.append(", remark=").append(remark);
        sb.append(", commodityFlowRecordIds=").append(commodityFlowRecordIds);
        sb.append(", logisticsOperator=").append(logisticsOperator);
        sb.append(", logisticsOrderId=").append(logisticsOrderId);
        sb.append(", expressInfoId=").append(expressInfoId);
        sb.append(", win=").append(win);
        sb.append(", winLevel=").append(winLevel);
        sb.append(", convertObjFlowRecordIds=").append(convertObjFlowRecordIds);
        sb.append(", sellerDeliveryInfo=").append(sellerDeliveryInfo);
        sb.append(", multiObjDetail=").append(multiObjDetail);
        sb.append("]");
        return sb.toString();
    }
}