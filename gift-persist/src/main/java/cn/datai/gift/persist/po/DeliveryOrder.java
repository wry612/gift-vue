package cn.datai.gift.persist.po;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DeliveryOrder implements Serializable {
    public static final long serialVersionUID = -699647471L;

    /**
     * : delivery_order.DELIVERY_ORDER_ID
     * @author MyBatis Generator
     */
    private Long deliveryOrderId;

    /**
     * 商品合约id: delivery_order.COMMODITY_CONTRACT_ID
     * @author MyBatis Generator
     */
    private Long commodityContractId;

    /**
     * 用户id: delivery_order.USER_ID
     * @author MyBatis Generator
     */
    private Long userId;

    /**
     * 当前交易账户id: delivery_order.USER_TRADE_ACCOUNT_ID
     * @author MyBatis Generator
     */
    private Long userTradeAccountId;

    /**
     * 商品单位单价, 分为单位: delivery_order.COMMODITY_UNIT_PRICE
     * @author MyBatis Generator
     */
    private Long commodityUnitPrice;

    /**
     * 申请提货的商品单位数量: delivery_order.APPLY_COMMODITY_UNIT_QUANTITY
     * @author MyBatis Generator
     */
    private BigDecimal applyCommodityUnitQuantity;

    /**
     * 申请提货的商品规格数量 (商品单位数量除以规格单位对应基本单位数): delivery_order.APPLY_COMMODITY_STANDARD_UNIT_QUANTITY
     * @author MyBatis Generator
     */
    private BigDecimal applyCommodityStandardUnitQuantity;

    /**
     * 优惠折扣商品数量，使用优惠券折扣券获取或折扣的商品数量: delivery_order.COUPON_UNIT_QUANTITY
     * @author MyBatis Generator
     */
    private BigDecimal couponUnitQuantity;

    /**
     * 凑单购买商品单位数量: delivery_order.ADD_ON_COMMODITY_UNIT_QUANTITY
     * @author MyBatis Generator
     */
    private BigDecimal addOnCommodityUnitQuantity;

    /**
     * 实际消耗礼包商品数量: delivery_order.ACT_CONSUME_COMM_UNIT_QUANTITY
     * @author MyBatis Generator
     */
    private BigDecimal actConsumeCommUnitQuantity;

    /**
     * 手续费比例, 百分比为单位: delivery_order.FEE_PERCENT
     * @author MyBatis Generator
     */
    private BigDecimal feePercent;

    /**
     * 凑单补购商品需要额外支付的金额， 单位为分: delivery_order.ADD_ON_PRICE
     * @author MyBatis Generator
     */
    private Long addOnPrice;

    /**
     * 手续费, 单位为分: delivery_order.FEE_PRICE
     * @author MyBatis Generator
     */
    private Long feePrice;

    /**
     * 邮费， 单位分: delivery_order.POSTAGE_PRICE
     * @author MyBatis Generator
     */
    private Long postagePrice;

    /**
     * 优惠券折扣明细， json格式，包含优惠券id， 折扣金额，折扣注释信息  {couponDetailId:123, price:1000, remark: "首单减10元"}: delivery_order.COUPON_INFO
     * @author MyBatis Generator
     */
    private String couponInfo;

    /**
     * 优惠折扣金额，单位分， 优惠券 折扣券抵扣的金额: delivery_order.COUPON_PRICE
     * @author MyBatis Generator
     */
    private Long couponPrice;

    /**
     * 实际需支付的金额 分为单位，  计算公式： 凑单补购金额+手续费+邮费——优惠折扣金额: delivery_order.ACTUAL_PRICE
     * @author MyBatis Generator
     */
    private Long actualPrice;

    /**
     * 收支信息， 包含支付信息id和状态  json格式   [{payid:123, status: "finish"},{payid:234, "status:handling"}, {payid:4545, status:"refund finish"}]: delivery_order.INCOME_PAY_INFO
     * @author MyBatis Generator
     */
    private String incomePayInfo;

    /**
     * 收货人姓名: delivery_order.ADDRESSEE_NAME
     * @author MyBatis Generator
     */
    private String addresseeName;

    /**
     * 收货人手机号: delivery_order.ADDRESSEE_MOBILE_PHONE
     * @author MyBatis Generator
     */
    private String addresseeMobilePhone;

    /**
     * 0：自提 （需要填写出库地点与联系方式）1：邮寄（需要填写邮寄地址与联系方式）: delivery_order.STORAGEOUT_MODE
     * @author MyBatis Generator
     */
    private String storageoutMode;

    /**
     * 收货地址第一级地址: delivery_order.PROVICE_FIRST_STAGE_NAME
     * @author MyBatis Generator
     */
    private String proviceFirstStageName;

    /**
     * 收货地址第二级地址: delivery_order.ADDRESS_CITY_SECOND_STAGE_NAME
     * @author MyBatis Generator
     */
    private String addressCitySecondStageName;

    /**
     * 收货地址第三级地址: delivery_order.ADDRESS_COUNTIES_THIRD_STAGE_NAME
     * @author MyBatis Generator
     */
    private String addressCountiesThirdStageName;

    /**
     * 详细收货地址信息: delivery_order.ADDRESS_DETAIL_INFO
     * @author MyBatis Generator
     */
    private String addressDetailInfo;

    /**
     * 邮编: delivery_order.ADDRESS_POSTAL_CODE
     * @author MyBatis Generator
     */
    private String addressPostalCode;

    /**
     * 期望的提货日期: delivery_order.DATE_EXPECT
     * @author MyBatis Generator
     */
    private Date dateExpect;

    /**
     * 商品流通记录信息ids， 多个用逗号隔开: delivery_order.COMMODITY_FLOW_RECORD_IDS
     * @author MyBatis Generator
     */
    private String commodityFlowRecordIds;

    /**
     * 物流运营商: delivery_order.LOGISTICS_OPERATOR
     * @author MyBatis Generator
     */
    private String logisticsOperator;

    /**
     * 物流单号: delivery_order.LOGISTICS_ORDER_ID
     * @author MyBatis Generator
     */
    private String logisticsOrderId;

    /**
     * 物流跟踪信息id: delivery_order.EXPRESS_INFO_ID
     * @author MyBatis Generator
     */
    private Long expressInfoId;

    /**
     * 订单状态：包含所有流程 例如ABC, 末尾C为当前状态，    A:订单已提交，未支付  B:已取消  C:已支付  D：退款中 E：已退款    F:商家已发货  G:退货中  H:已退货   : delivery_order.STATUS
     * @author MyBatis Generator
     */
    private String status;

    /**
     * 下单时间: delivery_order.ORDER_TIME
     * @author MyBatis Generator
     */
    private Date orderTime;

    /**
     * 申请取消时间: delivery_order.APPLY_CANCEL_TIME
     * @author MyBatis Generator
     */
    private Date applyCancelTime;

    /**
     * 发货时间: delivery_order.DELIVERY_TIME
     * @author MyBatis Generator
     */
    private Date deliveryTime;

    /**
     * 完成时间: delivery_order.SUCCESS_TIME
     * @author MyBatis Generator
     */
    private Date successTime;

    /**
     * 关闭时间: delivery_order.CLOSE_TIME
     * @author MyBatis Generator
     */
    private Date closeTime;

    /**
     * 超时时间: delivery_order.EXPIRE_TIME
     * @author MyBatis Generator
     */
    private Date expireTime;

    /**
     * 获取: delivery_order.DELIVERY_ORDER_ID
     * @return : delivery_order.DELIVERY_ORDER_ID
     * @author MyBatis Generator
     */
    public Long getDeliveryOrderId() {
        return deliveryOrderId;
    }

    /**
     * 设置: delivery_order.DELIVERY_ORDER_ID
     * @param deliveryOrderId 映射数据库字段: delivery_order.DELIVERY_ORDER_ID
     * @author MyBatis Generator
     */
    public void setDeliveryOrderId(Long deliveryOrderId) {
        this.deliveryOrderId = deliveryOrderId;
    }

    /**
     * 获取商品合约id: delivery_order.COMMODITY_CONTRACT_ID
     * @return 商品合约id: delivery_order.COMMODITY_CONTRACT_ID
     * @author MyBatis Generator
     */
    public Long getCommodityContractId() {
        return commodityContractId;
    }

    /**
     * 设置商品合约id: delivery_order.COMMODITY_CONTRACT_ID
     * @param commodityContractId 映射数据库字段: delivery_order.COMMODITY_CONTRACT_ID
     * @author MyBatis Generator
     */
    public void setCommodityContractId(Long commodityContractId) {
        this.commodityContractId = commodityContractId;
    }

    /**
     * 获取用户id: delivery_order.USER_ID
     * @return 用户id: delivery_order.USER_ID
     * @author MyBatis Generator
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置用户id: delivery_order.USER_ID
     * @param userId 映射数据库字段: delivery_order.USER_ID
     * @author MyBatis Generator
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取当前交易账户id: delivery_order.USER_TRADE_ACCOUNT_ID
     * @return 当前交易账户id: delivery_order.USER_TRADE_ACCOUNT_ID
     * @author MyBatis Generator
     */
    public Long getUserTradeAccountId() {
        return userTradeAccountId;
    }

    /**
     * 设置当前交易账户id: delivery_order.USER_TRADE_ACCOUNT_ID
     * @param userTradeAccountId 映射数据库字段: delivery_order.USER_TRADE_ACCOUNT_ID
     * @author MyBatis Generator
     */
    public void setUserTradeAccountId(Long userTradeAccountId) {
        this.userTradeAccountId = userTradeAccountId;
    }

    /**
     * 获取商品单位单价, 分为单位: delivery_order.COMMODITY_UNIT_PRICE
     * @return 商品单位单价, 分为单位: delivery_order.COMMODITY_UNIT_PRICE
     * @author MyBatis Generator
     */
    public Long getCommodityUnitPrice() {
        return commodityUnitPrice;
    }

    /**
     * 设置商品单位单价, 分为单位: delivery_order.COMMODITY_UNIT_PRICE
     * @param commodityUnitPrice 映射数据库字段: delivery_order.COMMODITY_UNIT_PRICE
     * @author MyBatis Generator
     */
    public void setCommodityUnitPrice(Long commodityUnitPrice) {
        this.commodityUnitPrice = commodityUnitPrice;
    }

    /**
     * 获取申请提货的商品单位数量: delivery_order.APPLY_COMMODITY_UNIT_QUANTITY
     * @return 申请提货的商品单位数量: delivery_order.APPLY_COMMODITY_UNIT_QUANTITY
     * @author MyBatis Generator
     */
    public BigDecimal getApplyCommodityUnitQuantity() {
        return applyCommodityUnitQuantity;
    }

    /**
     * 设置申请提货的商品单位数量: delivery_order.APPLY_COMMODITY_UNIT_QUANTITY
     * @param applyCommodityUnitQuantity 映射数据库字段: delivery_order.APPLY_COMMODITY_UNIT_QUANTITY
     * @author MyBatis Generator
     */
    public void setApplyCommodityUnitQuantity(BigDecimal applyCommodityUnitQuantity) {
        this.applyCommodityUnitQuantity = applyCommodityUnitQuantity;
    }

    /**
     * 获取申请提货的商品规格数量 (商品单位数量除以规格单位对应基本单位数): delivery_order.APPLY_COMMODITY_STANDARD_UNIT_QUANTITY
     * @return 申请提货的商品规格数量 (商品单位数量除以规格单位对应基本单位数): delivery_order.APPLY_COMMODITY_STANDARD_UNIT_QUANTITY
     * @author MyBatis Generator
     */
    public BigDecimal getApplyCommodityStandardUnitQuantity() {
        return applyCommodityStandardUnitQuantity;
    }

    /**
     * 设置申请提货的商品规格数量 (商品单位数量除以规格单位对应基本单位数): delivery_order.APPLY_COMMODITY_STANDARD_UNIT_QUANTITY
     * @param applyCommodityStandardUnitQuantity 映射数据库字段: delivery_order.APPLY_COMMODITY_STANDARD_UNIT_QUANTITY
     * @author MyBatis Generator
     */
    public void setApplyCommodityStandardUnitQuantity(BigDecimal applyCommodityStandardUnitQuantity) {
        this.applyCommodityStandardUnitQuantity = applyCommodityStandardUnitQuantity;
    }

    /**
     * 获取优惠折扣商品数量，使用优惠券折扣券获取或折扣的商品数量: delivery_order.COUPON_UNIT_QUANTITY
     * @return 优惠折扣商品数量，使用优惠券折扣券获取或折扣的商品数量: delivery_order.COUPON_UNIT_QUANTITY
     * @author MyBatis Generator
     */
    public BigDecimal getCouponUnitQuantity() {
        return couponUnitQuantity;
    }

    /**
     * 设置优惠折扣商品数量，使用优惠券折扣券获取或折扣的商品数量: delivery_order.COUPON_UNIT_QUANTITY
     * @param couponUnitQuantity 映射数据库字段: delivery_order.COUPON_UNIT_QUANTITY
     * @author MyBatis Generator
     */
    public void setCouponUnitQuantity(BigDecimal couponUnitQuantity) {
        this.couponUnitQuantity = couponUnitQuantity;
    }

    /**
     * 获取凑单购买商品单位数量: delivery_order.ADD_ON_COMMODITY_UNIT_QUANTITY
     * @return 凑单购买商品单位数量: delivery_order.ADD_ON_COMMODITY_UNIT_QUANTITY
     * @author MyBatis Generator
     */
    public BigDecimal getAddOnCommodityUnitQuantity() {
        return addOnCommodityUnitQuantity;
    }

    /**
     * 设置凑单购买商品单位数量: delivery_order.ADD_ON_COMMODITY_UNIT_QUANTITY
     * @param addOnCommodityUnitQuantity 映射数据库字段: delivery_order.ADD_ON_COMMODITY_UNIT_QUANTITY
     * @author MyBatis Generator
     */
    public void setAddOnCommodityUnitQuantity(BigDecimal addOnCommodityUnitQuantity) {
        this.addOnCommodityUnitQuantity = addOnCommodityUnitQuantity;
    }

    /**
     * 获取实际消耗礼包商品数量: delivery_order.ACT_CONSUME_COMM_UNIT_QUANTITY
     * @return 实际消耗礼包商品数量: delivery_order.ACT_CONSUME_COMM_UNIT_QUANTITY
     * @author MyBatis Generator
     */
    public BigDecimal getActConsumeCommUnitQuantity() {
        return actConsumeCommUnitQuantity;
    }

    /**
     * 设置实际消耗礼包商品数量: delivery_order.ACT_CONSUME_COMM_UNIT_QUANTITY
     * @param actConsumeCommUnitQuantity 映射数据库字段: delivery_order.ACT_CONSUME_COMM_UNIT_QUANTITY
     * @author MyBatis Generator
     */
    public void setActConsumeCommUnitQuantity(BigDecimal actConsumeCommUnitQuantity) {
        this.actConsumeCommUnitQuantity = actConsumeCommUnitQuantity;
    }

    /**
     * 获取手续费比例, 百分比为单位: delivery_order.FEE_PERCENT
     * @return 手续费比例, 百分比为单位: delivery_order.FEE_PERCENT
     * @author MyBatis Generator
     */
    public BigDecimal getFeePercent() {
        return feePercent;
    }

    /**
     * 设置手续费比例, 百分比为单位: delivery_order.FEE_PERCENT
     * @param feePercent 映射数据库字段: delivery_order.FEE_PERCENT
     * @author MyBatis Generator
     */
    public void setFeePercent(BigDecimal feePercent) {
        this.feePercent = feePercent;
    }

    /**
     * 获取凑单补购商品需要额外支付的金额， 单位为分: delivery_order.ADD_ON_PRICE
     * @return 凑单补购商品需要额外支付的金额， 单位为分: delivery_order.ADD_ON_PRICE
     * @author MyBatis Generator
     */
    public Long getAddOnPrice() {
        return addOnPrice;
    }

    /**
     * 设置凑单补购商品需要额外支付的金额， 单位为分: delivery_order.ADD_ON_PRICE
     * @param addOnPrice 映射数据库字段: delivery_order.ADD_ON_PRICE
     * @author MyBatis Generator
     */
    public void setAddOnPrice(Long addOnPrice) {
        this.addOnPrice = addOnPrice;
    }

    /**
     * 获取手续费, 单位为分: delivery_order.FEE_PRICE
     * @return 手续费, 单位为分: delivery_order.FEE_PRICE
     * @author MyBatis Generator
     */
    public Long getFeePrice() {
        return feePrice;
    }

    /**
     * 设置手续费, 单位为分: delivery_order.FEE_PRICE
     * @param feePrice 映射数据库字段: delivery_order.FEE_PRICE
     * @author MyBatis Generator
     */
    public void setFeePrice(Long feePrice) {
        this.feePrice = feePrice;
    }

    /**
     * 获取邮费， 单位分: delivery_order.POSTAGE_PRICE
     * @return 邮费， 单位分: delivery_order.POSTAGE_PRICE
     * @author MyBatis Generator
     */
    public Long getPostagePrice() {
        return postagePrice;
    }

    /**
     * 设置邮费， 单位分: delivery_order.POSTAGE_PRICE
     * @param postagePrice 映射数据库字段: delivery_order.POSTAGE_PRICE
     * @author MyBatis Generator
     */
    public void setPostagePrice(Long postagePrice) {
        this.postagePrice = postagePrice;
    }

    /**
     * 获取优惠券折扣明细， json格式，包含优惠券id， 折扣金额，折扣注释信息  {couponDetailId:123, price:1000, remark: "首单减10元"}: delivery_order.COUPON_INFO
     * @return 优惠券折扣明细， json格式，包含优惠券id， 折扣金额，折扣注释信息  {couponDetailId:123, price:1000, remark: "首单减10元"}: delivery_order.COUPON_INFO
     * @author MyBatis Generator
     */
    public String getCouponInfo() {
        return couponInfo;
    }

    /**
     * 设置优惠券折扣明细， json格式，包含优惠券id， 折扣金额，折扣注释信息  {couponDetailId:123, price:1000, remark: "首单减10元"}: delivery_order.COUPON_INFO
     * @param couponInfo 映射数据库字段: delivery_order.COUPON_INFO
     * @author MyBatis Generator
     */
    public void setCouponInfo(String couponInfo) {
        this.couponInfo = couponInfo == null ? null : couponInfo.trim();
    }

    /**
     * 获取优惠折扣金额，单位分， 优惠券 折扣券抵扣的金额: delivery_order.COUPON_PRICE
     * @return 优惠折扣金额，单位分， 优惠券 折扣券抵扣的金额: delivery_order.COUPON_PRICE
     * @author MyBatis Generator
     */
    public Long getCouponPrice() {
        return couponPrice;
    }

    /**
     * 设置优惠折扣金额，单位分， 优惠券 折扣券抵扣的金额: delivery_order.COUPON_PRICE
     * @param couponPrice 映射数据库字段: delivery_order.COUPON_PRICE
     * @author MyBatis Generator
     */
    public void setCouponPrice(Long couponPrice) {
        this.couponPrice = couponPrice;
    }

    /**
     * 获取实际需支付的金额 分为单位，  计算公式： 凑单补购金额+手续费+邮费——优惠折扣金额: delivery_order.ACTUAL_PRICE
     * @return 实际需支付的金额 分为单位，  计算公式： 凑单补购金额+手续费+邮费——优惠折扣金额: delivery_order.ACTUAL_PRICE
     * @author MyBatis Generator
     */
    public Long getActualPrice() {
        return actualPrice;
    }

    /**
     * 设置实际需支付的金额 分为单位，  计算公式： 凑单补购金额+手续费+邮费——优惠折扣金额: delivery_order.ACTUAL_PRICE
     * @param actualPrice 映射数据库字段: delivery_order.ACTUAL_PRICE
     * @author MyBatis Generator
     */
    public void setActualPrice(Long actualPrice) {
        this.actualPrice = actualPrice;
    }

    /**
     * 获取收支信息， 包含支付信息id和状态  json格式   [{payid:123, status: "finish"},{payid:234, "status:handling"}, {payid:4545, status:"refund finish"}]: delivery_order.INCOME_PAY_INFO
     * @return 收支信息， 包含支付信息id和状态  json格式   [{payid:123, status: "finish"},{payid:234, "status:handling"}, {payid:4545, status:"refund finish"}]: delivery_order.INCOME_PAY_INFO
     * @author MyBatis Generator
     */
    public String getIncomePayInfo() {
        return incomePayInfo;
    }

    /**
     * 设置收支信息， 包含支付信息id和状态  json格式   [{payid:123, status: "finish"},{payid:234, "status:handling"}, {payid:4545, status:"refund finish"}]: delivery_order.INCOME_PAY_INFO
     * @param incomePayInfo 映射数据库字段: delivery_order.INCOME_PAY_INFO
     * @author MyBatis Generator
     */
    public void setIncomePayInfo(String incomePayInfo) {
        this.incomePayInfo = incomePayInfo == null ? null : incomePayInfo.trim();
    }

    /**
     * 获取收货人姓名: delivery_order.ADDRESSEE_NAME
     * @return 收货人姓名: delivery_order.ADDRESSEE_NAME
     * @author MyBatis Generator
     */
    public String getAddresseeName() {
        return addresseeName;
    }

    /**
     * 设置收货人姓名: delivery_order.ADDRESSEE_NAME
     * @param addresseeName 映射数据库字段: delivery_order.ADDRESSEE_NAME
     * @author MyBatis Generator
     */
    public void setAddresseeName(String addresseeName) {
        this.addresseeName = addresseeName == null ? null : addresseeName.trim();
    }

    /**
     * 获取收货人手机号: delivery_order.ADDRESSEE_MOBILE_PHONE
     * @return 收货人手机号: delivery_order.ADDRESSEE_MOBILE_PHONE
     * @author MyBatis Generator
     */
    public String getAddresseeMobilePhone() {
        return addresseeMobilePhone;
    }

    /**
     * 设置收货人手机号: delivery_order.ADDRESSEE_MOBILE_PHONE
     * @param addresseeMobilePhone 映射数据库字段: delivery_order.ADDRESSEE_MOBILE_PHONE
     * @author MyBatis Generator
     */
    public void setAddresseeMobilePhone(String addresseeMobilePhone) {
        this.addresseeMobilePhone = addresseeMobilePhone == null ? null : addresseeMobilePhone.trim();
    }

    /**
     * 获取0：自提 （需要填写出库地点与联系方式）1：邮寄（需要填写邮寄地址与联系方式）: delivery_order.STORAGEOUT_MODE
     * @return 0：自提 （需要填写出库地点与联系方式）1：邮寄（需要填写邮寄地址与联系方式）: delivery_order.STORAGEOUT_MODE
     * @author MyBatis Generator
     */
    public String getStorageoutMode() {
        return storageoutMode;
    }

    /**
     * 设置0：自提 （需要填写出库地点与联系方式）1：邮寄（需要填写邮寄地址与联系方式）: delivery_order.STORAGEOUT_MODE
     * @param storageoutMode 映射数据库字段: delivery_order.STORAGEOUT_MODE
     * @author MyBatis Generator
     */
    public void setStorageoutMode(String storageoutMode) {
        this.storageoutMode = storageoutMode == null ? null : storageoutMode.trim();
    }

    /**
     * 获取收货地址第一级地址: delivery_order.PROVICE_FIRST_STAGE_NAME
     * @return 收货地址第一级地址: delivery_order.PROVICE_FIRST_STAGE_NAME
     * @author MyBatis Generator
     */
    public String getProviceFirstStageName() {
        return proviceFirstStageName;
    }

    /**
     * 设置收货地址第一级地址: delivery_order.PROVICE_FIRST_STAGE_NAME
     * @param proviceFirstStageName 映射数据库字段: delivery_order.PROVICE_FIRST_STAGE_NAME
     * @author MyBatis Generator
     */
    public void setProviceFirstStageName(String proviceFirstStageName) {
        this.proviceFirstStageName = proviceFirstStageName == null ? null : proviceFirstStageName.trim();
    }

    /**
     * 获取收货地址第二级地址: delivery_order.ADDRESS_CITY_SECOND_STAGE_NAME
     * @return 收货地址第二级地址: delivery_order.ADDRESS_CITY_SECOND_STAGE_NAME
     * @author MyBatis Generator
     */
    public String getAddressCitySecondStageName() {
        return addressCitySecondStageName;
    }

    /**
     * 设置收货地址第二级地址: delivery_order.ADDRESS_CITY_SECOND_STAGE_NAME
     * @param addressCitySecondStageName 映射数据库字段: delivery_order.ADDRESS_CITY_SECOND_STAGE_NAME
     * @author MyBatis Generator
     */
    public void setAddressCitySecondStageName(String addressCitySecondStageName) {
        this.addressCitySecondStageName = addressCitySecondStageName == null ? null : addressCitySecondStageName.trim();
    }

    /**
     * 获取收货地址第三级地址: delivery_order.ADDRESS_COUNTIES_THIRD_STAGE_NAME
     * @return 收货地址第三级地址: delivery_order.ADDRESS_COUNTIES_THIRD_STAGE_NAME
     * @author MyBatis Generator
     */
    public String getAddressCountiesThirdStageName() {
        return addressCountiesThirdStageName;
    }

    /**
     * 设置收货地址第三级地址: delivery_order.ADDRESS_COUNTIES_THIRD_STAGE_NAME
     * @param addressCountiesThirdStageName 映射数据库字段: delivery_order.ADDRESS_COUNTIES_THIRD_STAGE_NAME
     * @author MyBatis Generator
     */
    public void setAddressCountiesThirdStageName(String addressCountiesThirdStageName) {
        this.addressCountiesThirdStageName = addressCountiesThirdStageName == null ? null : addressCountiesThirdStageName.trim();
    }

    /**
     * 获取详细收货地址信息: delivery_order.ADDRESS_DETAIL_INFO
     * @return 详细收货地址信息: delivery_order.ADDRESS_DETAIL_INFO
     * @author MyBatis Generator
     */
    public String getAddressDetailInfo() {
        return addressDetailInfo;
    }

    /**
     * 设置详细收货地址信息: delivery_order.ADDRESS_DETAIL_INFO
     * @param addressDetailInfo 映射数据库字段: delivery_order.ADDRESS_DETAIL_INFO
     * @author MyBatis Generator
     */
    public void setAddressDetailInfo(String addressDetailInfo) {
        this.addressDetailInfo = addressDetailInfo == null ? null : addressDetailInfo.trim();
    }

    /**
     * 获取邮编: delivery_order.ADDRESS_POSTAL_CODE
     * @return 邮编: delivery_order.ADDRESS_POSTAL_CODE
     * @author MyBatis Generator
     */
    public String getAddressPostalCode() {
        return addressPostalCode;
    }

    /**
     * 设置邮编: delivery_order.ADDRESS_POSTAL_CODE
     * @param addressPostalCode 映射数据库字段: delivery_order.ADDRESS_POSTAL_CODE
     * @author MyBatis Generator
     */
    public void setAddressPostalCode(String addressPostalCode) {
        this.addressPostalCode = addressPostalCode == null ? null : addressPostalCode.trim();
    }

    /**
     * 获取期望的提货日期: delivery_order.DATE_EXPECT
     * @return 期望的提货日期: delivery_order.DATE_EXPECT
     * @author MyBatis Generator
     */
    public Date getDateExpect() {
        return dateExpect;
    }

    /**
     * 设置期望的提货日期: delivery_order.DATE_EXPECT
     * @param dateExpect 映射数据库字段: delivery_order.DATE_EXPECT
     * @author MyBatis Generator
     */
    public void setDateExpect(Date dateExpect) {
        this.dateExpect = dateExpect;
    }

    /**
     * 获取商品流通记录信息ids， 多个用逗号隔开: delivery_order.COMMODITY_FLOW_RECORD_IDS
     * @return 商品流通记录信息ids， 多个用逗号隔开: delivery_order.COMMODITY_FLOW_RECORD_IDS
     * @author MyBatis Generator
     */
    public String getCommodityFlowRecordIds() {
        return commodityFlowRecordIds;
    }

    /**
     * 设置商品流通记录信息ids， 多个用逗号隔开: delivery_order.COMMODITY_FLOW_RECORD_IDS
     * @param commodityFlowRecordIds 映射数据库字段: delivery_order.COMMODITY_FLOW_RECORD_IDS
     * @author MyBatis Generator
     */
    public void setCommodityFlowRecordIds(String commodityFlowRecordIds) {
        this.commodityFlowRecordIds = commodityFlowRecordIds == null ? null : commodityFlowRecordIds.trim();
    }

    /**
     * 获取物流运营商: delivery_order.LOGISTICS_OPERATOR
     * @return 物流运营商: delivery_order.LOGISTICS_OPERATOR
     * @author MyBatis Generator
     */
    public String getLogisticsOperator() {
        return logisticsOperator;
    }

    /**
     * 设置物流运营商: delivery_order.LOGISTICS_OPERATOR
     * @param logisticsOperator 映射数据库字段: delivery_order.LOGISTICS_OPERATOR
     * @author MyBatis Generator
     */
    public void setLogisticsOperator(String logisticsOperator) {
        this.logisticsOperator = logisticsOperator == null ? null : logisticsOperator.trim();
    }

    /**
     * 获取物流单号: delivery_order.LOGISTICS_ORDER_ID
     * @return 物流单号: delivery_order.LOGISTICS_ORDER_ID
     * @author MyBatis Generator
     */
    public String getLogisticsOrderId() {
        return logisticsOrderId;
    }

    /**
     * 设置物流单号: delivery_order.LOGISTICS_ORDER_ID
     * @param logisticsOrderId 映射数据库字段: delivery_order.LOGISTICS_ORDER_ID
     * @author MyBatis Generator
     */
    public void setLogisticsOrderId(String logisticsOrderId) {
        this.logisticsOrderId = logisticsOrderId == null ? null : logisticsOrderId.trim();
    }

    /**
     * 获取物流跟踪信息id: delivery_order.EXPRESS_INFO_ID
     * @return 物流跟踪信息id: delivery_order.EXPRESS_INFO_ID
     * @author MyBatis Generator
     */
    public Long getExpressInfoId() {
        return expressInfoId;
    }

    /**
     * 设置物流跟踪信息id: delivery_order.EXPRESS_INFO_ID
     * @param expressInfoId 映射数据库字段: delivery_order.EXPRESS_INFO_ID
     * @author MyBatis Generator
     */
    public void setExpressInfoId(Long expressInfoId) {
        this.expressInfoId = expressInfoId;
    }

    /**
     * 获取订单状态：包含所有流程 例如ABC, 末尾C为当前状态，    A:订单已提交，未支付  B:已取消  C:已支付  D：退款中 E：已退款    F:商家已发货  G:退货中  H:已退货   : delivery_order.STATUS
     * @return 订单状态：包含所有流程 例如ABC, 末尾C为当前状态，    A:订单已提交，未支付  B:已取消  C:已支付  D：退款中 E：已退款    F:商家已发货  G:退货中  H:已退货   : delivery_order.STATUS
     * @author MyBatis Generator
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置订单状态：包含所有流程 例如ABC, 末尾C为当前状态，    A:订单已提交，未支付  B:已取消  C:已支付  D：退款中 E：已退款    F:商家已发货  G:退货中  H:已退货   : delivery_order.STATUS
     * @param status 映射数据库字段: delivery_order.STATUS
     * @author MyBatis Generator
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * 获取下单时间: delivery_order.ORDER_TIME
     * @return 下单时间: delivery_order.ORDER_TIME
     * @author MyBatis Generator
     */
    public Date getOrderTime() {
        return orderTime;
    }

    /**
     * 设置下单时间: delivery_order.ORDER_TIME
     * @param orderTime 映射数据库字段: delivery_order.ORDER_TIME
     * @author MyBatis Generator
     */
    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    /**
     * 获取申请取消时间: delivery_order.APPLY_CANCEL_TIME
     * @return 申请取消时间: delivery_order.APPLY_CANCEL_TIME
     * @author MyBatis Generator
     */
    public Date getApplyCancelTime() {
        return applyCancelTime;
    }

    /**
     * 设置申请取消时间: delivery_order.APPLY_CANCEL_TIME
     * @param applyCancelTime 映射数据库字段: delivery_order.APPLY_CANCEL_TIME
     * @author MyBatis Generator
     */
    public void setApplyCancelTime(Date applyCancelTime) {
        this.applyCancelTime = applyCancelTime;
    }

    /**
     * 获取发货时间: delivery_order.DELIVERY_TIME
     * @return 发货时间: delivery_order.DELIVERY_TIME
     * @author MyBatis Generator
     */
    public Date getDeliveryTime() {
        return deliveryTime;
    }

    /**
     * 设置发货时间: delivery_order.DELIVERY_TIME
     * @param deliveryTime 映射数据库字段: delivery_order.DELIVERY_TIME
     * @author MyBatis Generator
     */
    public void setDeliveryTime(Date deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    /**
     * 获取完成时间: delivery_order.SUCCESS_TIME
     * @return 完成时间: delivery_order.SUCCESS_TIME
     * @author MyBatis Generator
     */
    public Date getSuccessTime() {
        return successTime;
    }

    /**
     * 设置完成时间: delivery_order.SUCCESS_TIME
     * @param successTime 映射数据库字段: delivery_order.SUCCESS_TIME
     * @author MyBatis Generator
     */
    public void setSuccessTime(Date successTime) {
        this.successTime = successTime;
    }

    /**
     * 获取关闭时间: delivery_order.CLOSE_TIME
     * @return 关闭时间: delivery_order.CLOSE_TIME
     * @author MyBatis Generator
     */
    public Date getCloseTime() {
        return closeTime;
    }

    /**
     * 设置关闭时间: delivery_order.CLOSE_TIME
     * @param closeTime 映射数据库字段: delivery_order.CLOSE_TIME
     * @author MyBatis Generator
     */
    public void setCloseTime(Date closeTime) {
        this.closeTime = closeTime;
    }

    /**
     * 获取超时时间: delivery_order.EXPIRE_TIME
     * @return 超时时间: delivery_order.EXPIRE_TIME
     * @author MyBatis Generator
     */
    public Date getExpireTime() {
        return expireTime;
    }

    /**
     * 设置超时时间: delivery_order.EXPIRE_TIME
     * @param expireTime 映射数据库字段: delivery_order.EXPIRE_TIME
     * @author MyBatis Generator
     */
    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: delivery_order
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
        DeliveryOrder other = (DeliveryOrder) that;
        return (this.getDeliveryOrderId() == null ? other.getDeliveryOrderId() == null : this.getDeliveryOrderId().equals(other.getDeliveryOrderId()))
            && (this.getCommodityContractId() == null ? other.getCommodityContractId() == null : this.getCommodityContractId().equals(other.getCommodityContractId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getUserTradeAccountId() == null ? other.getUserTradeAccountId() == null : this.getUserTradeAccountId().equals(other.getUserTradeAccountId()))
            && (this.getCommodityUnitPrice() == null ? other.getCommodityUnitPrice() == null : this.getCommodityUnitPrice().equals(other.getCommodityUnitPrice()))
            && (this.getApplyCommodityUnitQuantity() == null ? other.getApplyCommodityUnitQuantity() == null : this.getApplyCommodityUnitQuantity().equals(other.getApplyCommodityUnitQuantity()))
            && (this.getApplyCommodityStandardUnitQuantity() == null ? other.getApplyCommodityStandardUnitQuantity() == null : this.getApplyCommodityStandardUnitQuantity().equals(other.getApplyCommodityStandardUnitQuantity()))
            && (this.getCouponUnitQuantity() == null ? other.getCouponUnitQuantity() == null : this.getCouponUnitQuantity().equals(other.getCouponUnitQuantity()))
            && (this.getAddOnCommodityUnitQuantity() == null ? other.getAddOnCommodityUnitQuantity() == null : this.getAddOnCommodityUnitQuantity().equals(other.getAddOnCommodityUnitQuantity()))
            && (this.getActConsumeCommUnitQuantity() == null ? other.getActConsumeCommUnitQuantity() == null : this.getActConsumeCommUnitQuantity().equals(other.getActConsumeCommUnitQuantity()))
            && (this.getFeePercent() == null ? other.getFeePercent() == null : this.getFeePercent().equals(other.getFeePercent()))
            && (this.getAddOnPrice() == null ? other.getAddOnPrice() == null : this.getAddOnPrice().equals(other.getAddOnPrice()))
            && (this.getFeePrice() == null ? other.getFeePrice() == null : this.getFeePrice().equals(other.getFeePrice()))
            && (this.getPostagePrice() == null ? other.getPostagePrice() == null : this.getPostagePrice().equals(other.getPostagePrice()))
            && (this.getCouponInfo() == null ? other.getCouponInfo() == null : this.getCouponInfo().equals(other.getCouponInfo()))
            && (this.getCouponPrice() == null ? other.getCouponPrice() == null : this.getCouponPrice().equals(other.getCouponPrice()))
            && (this.getActualPrice() == null ? other.getActualPrice() == null : this.getActualPrice().equals(other.getActualPrice()))
            && (this.getIncomePayInfo() == null ? other.getIncomePayInfo() == null : this.getIncomePayInfo().equals(other.getIncomePayInfo()))
            && (this.getAddresseeName() == null ? other.getAddresseeName() == null : this.getAddresseeName().equals(other.getAddresseeName()))
            && (this.getAddresseeMobilePhone() == null ? other.getAddresseeMobilePhone() == null : this.getAddresseeMobilePhone().equals(other.getAddresseeMobilePhone()))
            && (this.getStorageoutMode() == null ? other.getStorageoutMode() == null : this.getStorageoutMode().equals(other.getStorageoutMode()))
            && (this.getProviceFirstStageName() == null ? other.getProviceFirstStageName() == null : this.getProviceFirstStageName().equals(other.getProviceFirstStageName()))
            && (this.getAddressCitySecondStageName() == null ? other.getAddressCitySecondStageName() == null : this.getAddressCitySecondStageName().equals(other.getAddressCitySecondStageName()))
            && (this.getAddressCountiesThirdStageName() == null ? other.getAddressCountiesThirdStageName() == null : this.getAddressCountiesThirdStageName().equals(other.getAddressCountiesThirdStageName()))
            && (this.getAddressDetailInfo() == null ? other.getAddressDetailInfo() == null : this.getAddressDetailInfo().equals(other.getAddressDetailInfo()))
            && (this.getAddressPostalCode() == null ? other.getAddressPostalCode() == null : this.getAddressPostalCode().equals(other.getAddressPostalCode()))
            && (this.getDateExpect() == null ? other.getDateExpect() == null : this.getDateExpect().equals(other.getDateExpect()))
            && (this.getCommodityFlowRecordIds() == null ? other.getCommodityFlowRecordIds() == null : this.getCommodityFlowRecordIds().equals(other.getCommodityFlowRecordIds()))
            && (this.getLogisticsOperator() == null ? other.getLogisticsOperator() == null : this.getLogisticsOperator().equals(other.getLogisticsOperator()))
            && (this.getLogisticsOrderId() == null ? other.getLogisticsOrderId() == null : this.getLogisticsOrderId().equals(other.getLogisticsOrderId()))
            && (this.getExpressInfoId() == null ? other.getExpressInfoId() == null : this.getExpressInfoId().equals(other.getExpressInfoId()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getOrderTime() == null ? other.getOrderTime() == null : this.getOrderTime().equals(other.getOrderTime()))
            && (this.getApplyCancelTime() == null ? other.getApplyCancelTime() == null : this.getApplyCancelTime().equals(other.getApplyCancelTime()))
            && (this.getDeliveryTime() == null ? other.getDeliveryTime() == null : this.getDeliveryTime().equals(other.getDeliveryTime()))
            && (this.getSuccessTime() == null ? other.getSuccessTime() == null : this.getSuccessTime().equals(other.getSuccessTime()))
            && (this.getCloseTime() == null ? other.getCloseTime() == null : this.getCloseTime().equals(other.getCloseTime()))
            && (this.getExpireTime() == null ? other.getExpireTime() == null : this.getExpireTime().equals(other.getExpireTime()));
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: delivery_order
     * @author MyBatis Generator
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDeliveryOrderId() == null) ? 0 : getDeliveryOrderId().hashCode());
        result = prime * result + ((getCommodityContractId() == null) ? 0 : getCommodityContractId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getUserTradeAccountId() == null) ? 0 : getUserTradeAccountId().hashCode());
        result = prime * result + ((getCommodityUnitPrice() == null) ? 0 : getCommodityUnitPrice().hashCode());
        result = prime * result + ((getApplyCommodityUnitQuantity() == null) ? 0 : getApplyCommodityUnitQuantity().hashCode());
        result = prime * result + ((getApplyCommodityStandardUnitQuantity() == null) ? 0 : getApplyCommodityStandardUnitQuantity().hashCode());
        result = prime * result + ((getCouponUnitQuantity() == null) ? 0 : getCouponUnitQuantity().hashCode());
        result = prime * result + ((getAddOnCommodityUnitQuantity() == null) ? 0 : getAddOnCommodityUnitQuantity().hashCode());
        result = prime * result + ((getActConsumeCommUnitQuantity() == null) ? 0 : getActConsumeCommUnitQuantity().hashCode());
        result = prime * result + ((getFeePercent() == null) ? 0 : getFeePercent().hashCode());
        result = prime * result + ((getAddOnPrice() == null) ? 0 : getAddOnPrice().hashCode());
        result = prime * result + ((getFeePrice() == null) ? 0 : getFeePrice().hashCode());
        result = prime * result + ((getPostagePrice() == null) ? 0 : getPostagePrice().hashCode());
        result = prime * result + ((getCouponInfo() == null) ? 0 : getCouponInfo().hashCode());
        result = prime * result + ((getCouponPrice() == null) ? 0 : getCouponPrice().hashCode());
        result = prime * result + ((getActualPrice() == null) ? 0 : getActualPrice().hashCode());
        result = prime * result + ((getIncomePayInfo() == null) ? 0 : getIncomePayInfo().hashCode());
        result = prime * result + ((getAddresseeName() == null) ? 0 : getAddresseeName().hashCode());
        result = prime * result + ((getAddresseeMobilePhone() == null) ? 0 : getAddresseeMobilePhone().hashCode());
        result = prime * result + ((getStorageoutMode() == null) ? 0 : getStorageoutMode().hashCode());
        result = prime * result + ((getProviceFirstStageName() == null) ? 0 : getProviceFirstStageName().hashCode());
        result = prime * result + ((getAddressCitySecondStageName() == null) ? 0 : getAddressCitySecondStageName().hashCode());
        result = prime * result + ((getAddressCountiesThirdStageName() == null) ? 0 : getAddressCountiesThirdStageName().hashCode());
        result = prime * result + ((getAddressDetailInfo() == null) ? 0 : getAddressDetailInfo().hashCode());
        result = prime * result + ((getAddressPostalCode() == null) ? 0 : getAddressPostalCode().hashCode());
        result = prime * result + ((getDateExpect() == null) ? 0 : getDateExpect().hashCode());
        result = prime * result + ((getCommodityFlowRecordIds() == null) ? 0 : getCommodityFlowRecordIds().hashCode());
        result = prime * result + ((getLogisticsOperator() == null) ? 0 : getLogisticsOperator().hashCode());
        result = prime * result + ((getLogisticsOrderId() == null) ? 0 : getLogisticsOrderId().hashCode());
        result = prime * result + ((getExpressInfoId() == null) ? 0 : getExpressInfoId().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getOrderTime() == null) ? 0 : getOrderTime().hashCode());
        result = prime * result + ((getApplyCancelTime() == null) ? 0 : getApplyCancelTime().hashCode());
        result = prime * result + ((getDeliveryTime() == null) ? 0 : getDeliveryTime().hashCode());
        result = prime * result + ((getSuccessTime() == null) ? 0 : getSuccessTime().hashCode());
        result = prime * result + ((getCloseTime() == null) ? 0 : getCloseTime().hashCode());
        result = prime * result + ((getExpireTime() == null) ? 0 : getExpireTime().hashCode());
        return result;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: delivery_order
     * @author MyBatis Generator
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append(", deliveryOrderId=").append(deliveryOrderId);
        sb.append(", commodityContractId=").append(commodityContractId);
        sb.append(", userId=").append(userId);
        sb.append(", userTradeAccountId=").append(userTradeAccountId);
        sb.append(", commodityUnitPrice=").append(commodityUnitPrice);
        sb.append(", applyCommodityUnitQuantity=").append(applyCommodityUnitQuantity);
        sb.append(", applyCommodityStandardUnitQuantity=").append(applyCommodityStandardUnitQuantity);
        sb.append(", couponUnitQuantity=").append(couponUnitQuantity);
        sb.append(", addOnCommodityUnitQuantity=").append(addOnCommodityUnitQuantity);
        sb.append(", actConsumeCommUnitQuantity=").append(actConsumeCommUnitQuantity);
        sb.append(", feePercent=").append(feePercent);
        sb.append(", addOnPrice=").append(addOnPrice);
        sb.append(", feePrice=").append(feePrice);
        sb.append(", postagePrice=").append(postagePrice);
        sb.append(", couponInfo=").append(couponInfo);
        sb.append(", couponPrice=").append(couponPrice);
        sb.append(", actualPrice=").append(actualPrice);
        sb.append(", incomePayInfo=").append(incomePayInfo);
        sb.append(", addresseeName=").append(addresseeName);
        sb.append(", addresseeMobilePhone=").append(addresseeMobilePhone);
        sb.append(", storageoutMode=").append(storageoutMode);
        sb.append(", proviceFirstStageName=").append(proviceFirstStageName);
        sb.append(", addressCitySecondStageName=").append(addressCitySecondStageName);
        sb.append(", addressCountiesThirdStageName=").append(addressCountiesThirdStageName);
        sb.append(", addressDetailInfo=").append(addressDetailInfo);
        sb.append(", addressPostalCode=").append(addressPostalCode);
        sb.append(", dateExpect=").append(dateExpect);
        sb.append(", commodityFlowRecordIds=").append(commodityFlowRecordIds);
        sb.append(", logisticsOperator=").append(logisticsOperator);
        sb.append(", logisticsOrderId=").append(logisticsOrderId);
        sb.append(", expressInfoId=").append(expressInfoId);
        sb.append(", status=").append(status);
        sb.append(", orderTime=").append(orderTime);
        sb.append(", applyCancelTime=").append(applyCancelTime);
        sb.append(", deliveryTime=").append(deliveryTime);
        sb.append(", successTime=").append(successTime);
        sb.append(", closeTime=").append(closeTime);
        sb.append(", expireTime=").append(expireTime);
        sb.append("]");
        return sb.toString();
    }
}