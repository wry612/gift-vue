package cn.datai.gift.persist.po;

import java.io.Serializable;

public class PayOrderWx implements Serializable {
    public static final long serialVersionUID = -1591320048L;

    /**
     * 微信渠道支付明细id， 用于微信平台的商户订单号，商户系统内部订单号，要求32个字符内、且在同一个商户号下唯一。: pay_order_wx.PAY_ORDER_WX_ID
     * @author MyBatis Generator
     */
    private String payOrderWxId;

    /**
     * 基本支付信息id: pay_order_wx.PAY_INFO_ID
     * @author MyBatis Generator
     */
    private Long payInfoId;

    /**
     * 微信支付分配的公众账号ID（企业号corpid即为此appId）
            微信支付分配的公众账号ID（企业号corpid即为此appId）: pay_order_wx.APPID
     * @author MyBatis Generator
     */
    private String appid;

    /**
     * 微信支付分配的商户号: pay_order_wx.MCH_ID
     * @author MyBatis Generator
     */
    private String mchId;

    /**
     * 自定义参数，可以为终端设备号(门店号或收银设备ID)，PC网页或公众号内支付可以传"WEB": pay_order_wx.DEVICE_INFO
     * @author MyBatis Generator
     */
    private String deviceInfo;

    /**
     * 商品简单描述，该字段请按照规范传递: pay_order_wx.BODY
     * @author MyBatis Generator
     */
    private String body;

    /**
     * 商品详细列表，使用Json格式，传输签名前请务必使用CDATA标签将JSON文本串保护起来。
            cost_price Int 可选 32 订单原价，商户侧一张小票订单可能被分多次支付，订单原价用于记录整张小票的支付金额。当订单原价与支付金额不相等则被判定为拆单，无法享受优惠。
             receipt_id String 可选 32 商家小票ID
            goods_detail 服务商必填 []：
            └ goods_id String 必填 32 商品的编号
            └ wxpay_goods_id String 可选 32 微信支付定义的统一商品编号
            └ goods_name String 可选 256 商品名称
            └ quantity Int 必填  32 商品数量
            └ price Int 必填 32 商品单价，如果商户有优惠，需传输商户优惠后的单价
            注意：单品总金额应<=订单总金额total_fee，否则会无法享受优惠。: pay_order_wx.DETAIL
     * @author MyBatis Generator
     */
    private String detail;

    /**
     * 附加数据，在查询API和支付通知中原样返回，可作为自定义参数使用。: pay_order_wx.ATTACH
     * @author MyBatis Generator
     */
    private String attach;

    /**
     * 符合ISO 4217标准的三位字母代码，默认人民币：CNY: pay_order_wx.FEE_TYPE
     * @author MyBatis Generator
     */
    private String feeType;

    /**
     * 订单总金额，单位为分: pay_order_wx.TOTAL_FEE
     * @author MyBatis Generator
     */
    private Integer totalFee;

    /**
     * APP和网页支付提交用户端ip，Native支付填调用微信支付API的机器IP。: pay_order_wx.SPBILL_CREATE_IP
     * @author MyBatis Generator
     */
    private String spbillCreateIp;

    /**
     * 订单生成时间，格式为yyyyMMddHHmmss，如2009年12月25日9点10分10秒表示为20091225091010。: pay_order_wx.TIME_START
     * @author MyBatis Generator
     */
    private String timeStart;

    /**
     * 订单失效时间，格式为yyyyMMddHHmmss，如2009年12月27日9点10分10秒表示为20091227091010。注意：最短失效时间间隔必须大于5分钟: pay_order_wx.TIME_EXPIRE
     * @author MyBatis Generator
     */
    private String timeExpire;

    /**
     * 商品标记，使用代金券或立减优惠功能时需要的参数: pay_order_wx.GOODS_TAG
     * @author MyBatis Generator
     */
    private String goodsTag;

    /**
     * 取值如下：JSAPI，NATIVE，APP等: pay_order_wx.TRADE_TYPE
     * @author MyBatis Generator
     */
    private String tradeType;

    /**
     * trade_type=NATIVE时（即扫码支付），此参数必传。此参数为二维码中包含的商品ID，商户自行定义。: pay_order_wx.PRODUCT_ID
     * @author MyBatis Generator
     */
    private String productId;

    /**
     * 上传此参数no_credit--可限制用户不能使用信用卡支付: pay_order_wx.LIMIT_PAY
     * @author MyBatis Generator
     */
    private String limitPay;

    /**
     * trade_type=JSAPI时（即公众号支付），此参数必传，此参数为微信用户在商户对应appid下的唯一标识。openid如何获取，可参考【获取openid】。企业号请使用【企业号OAuth2.0接口】获取企业号内成员userid，再调用【企业号userid转openid接口】进行转换: pay_order_wx.OPENID
     * @author MyBatis Generator
     */
    private String openid;

    /**
     * 微信支付系统返回的预付单信息: pay_order_wx.PREPAY_ID
     * @author MyBatis Generator
     */
    private String prepayId;

    /**
     * trade_type为NATIVE时有返回，用于生成二维码，展示给用户进行扫码支付: pay_order_wx.CODE_URL
     * @author MyBatis Generator
     */
    private String codeUrl;

    /**
     * 预付单业务结果，SUCCESS/FAIL: pay_order_wx.PREPAY_RESULT_CODE
     * @author MyBatis Generator
     */
    private String prepayResultCode;

    /**
     * 微信支付订单号，微信服务器返回的支付订单号: pay_order_wx.PAY_TRANSACTION_ID
     * @author MyBatis Generator
     */
    private String payTransactionId;

    /**
     * 支付结果: pay_order_wx.PAY_RESULT_CODE
     * @author MyBatis Generator
     */
    private String payResultCode;

    /**
     * 付款银行: pay_order_wx.BANK_TYPE
     * @author MyBatis Generator
     */
    private String bankType;

    /**
     * 应结订单金额， 应结订单金额=订单金额-非充值代金券金额，应结订单金额<=订单金额。: pay_order_wx.SETTLEMENT_TOTAL_FEE
     * @author MyBatis Generator
     */
    private Integer settlementTotalFee;

    /**
     * 现金支付金额， 订单现金支付金额: pay_order_wx.CASH_FEE
     * @author MyBatis Generator
     */
    private Integer cashFee;

    /**
     * 货币类型，符合ISO4217标准的三位字母代码，默认人民币：CNY: pay_order_wx.CASH_FEE_TYPE
     * @author MyBatis Generator
     */
    private String cashFeeType;

    /**
     * 总代金券金额， 现金支付金额=订单金额-代金券金额，代金券金额<=订单金额: pay_order_wx.COUPON_FEE
     * @author MyBatis Generator
     */
    private Integer couponFee;

    /**
     * 代金券使用数量: pay_order_wx.COUPON_COUNT
     * @author MyBatis Generator
     */
    private Integer couponCount;

    /**
     * 所有代金券明细， json格式数组   包含字段     couponType:代金券类型   couponId:代金券ID    coupon_fee:单个代金券支付金额: pay_order_wx.COUPON_DETAIL_LIST
     * @author MyBatis Generator
     */
    private String couponDetailList;

    /**
     * 支付完成时间，格式为yyyyMMddHHmmss: pay_order_wx.TIME_END
     * @author MyBatis Generator
     */
    private String timeEnd;

    /**
     * 是否有效, true:有效     false:无效     由于系统生成订单可能会有异常情况，此单作废，重新生成一条记录  : pay_order_wx.IS_VALID
     * @author MyBatis Generator
     */
    private String isValid;

    /**
     * 获取微信渠道支付明细id， 用于微信平台的商户订单号，商户系统内部订单号，要求32个字符内、且在同一个商户号下唯一。: pay_order_wx.PAY_ORDER_WX_ID
     * @return 微信渠道支付明细id， 用于微信平台的商户订单号，商户系统内部订单号，要求32个字符内、且在同一个商户号下唯一。: pay_order_wx.PAY_ORDER_WX_ID
     * @author MyBatis Generator
     */
    public String getPayOrderWxId() {
        return payOrderWxId;
    }

    /**
     * 设置微信渠道支付明细id， 用于微信平台的商户订单号，商户系统内部订单号，要求32个字符内、且在同一个商户号下唯一。: pay_order_wx.PAY_ORDER_WX_ID
     * @param payOrderWxId 映射数据库字段: pay_order_wx.PAY_ORDER_WX_ID
     * @author MyBatis Generator
     */
    public void setPayOrderWxId(String payOrderWxId) {
        this.payOrderWxId = payOrderWxId == null ? null : payOrderWxId.trim();
    }

    /**
     * 获取基本支付信息id: pay_order_wx.PAY_INFO_ID
     * @return 基本支付信息id: pay_order_wx.PAY_INFO_ID
     * @author MyBatis Generator
     */
    public Long getPayInfoId() {
        return payInfoId;
    }

    /**
     * 设置基本支付信息id: pay_order_wx.PAY_INFO_ID
     * @param payInfoId 映射数据库字段: pay_order_wx.PAY_INFO_ID
     * @author MyBatis Generator
     */
    public void setPayInfoId(Long payInfoId) {
        this.payInfoId = payInfoId;
    }

    /**
     * 获取微信支付分配的公众账号ID（企业号corpid即为此appId）
            微信支付分配的公众账号ID（企业号corpid即为此appId）: pay_order_wx.APPID
     * @return 微信支付分配的公众账号ID（企业号corpid即为此appId）
            微信支付分配的公众账号ID（企业号corpid即为此appId）: pay_order_wx.APPID
     * @author MyBatis Generator
     */
    public String getAppid() {
        return appid;
    }

    /**
     * 设置微信支付分配的公众账号ID（企业号corpid即为此appId）
            微信支付分配的公众账号ID（企业号corpid即为此appId）: pay_order_wx.APPID
     * @param appid 映射数据库字段: pay_order_wx.APPID
     * @author MyBatis Generator
     */
    public void setAppid(String appid) {
        this.appid = appid == null ? null : appid.trim();
    }

    /**
     * 获取微信支付分配的商户号: pay_order_wx.MCH_ID
     * @return 微信支付分配的商户号: pay_order_wx.MCH_ID
     * @author MyBatis Generator
     */
    public String getMchId() {
        return mchId;
    }

    /**
     * 设置微信支付分配的商户号: pay_order_wx.MCH_ID
     * @param mchId 映射数据库字段: pay_order_wx.MCH_ID
     * @author MyBatis Generator
     */
    public void setMchId(String mchId) {
        this.mchId = mchId == null ? null : mchId.trim();
    }

    /**
     * 获取自定义参数，可以为终端设备号(门店号或收银设备ID)，PC网页或公众号内支付可以传"WEB": pay_order_wx.DEVICE_INFO
     * @return 自定义参数，可以为终端设备号(门店号或收银设备ID)，PC网页或公众号内支付可以传"WEB": pay_order_wx.DEVICE_INFO
     * @author MyBatis Generator
     */
    public String getDeviceInfo() {
        return deviceInfo;
    }

    /**
     * 设置自定义参数，可以为终端设备号(门店号或收银设备ID)，PC网页或公众号内支付可以传"WEB": pay_order_wx.DEVICE_INFO
     * @param deviceInfo 映射数据库字段: pay_order_wx.DEVICE_INFO
     * @author MyBatis Generator
     */
    public void setDeviceInfo(String deviceInfo) {
        this.deviceInfo = deviceInfo == null ? null : deviceInfo.trim();
    }

    /**
     * 获取商品简单描述，该字段请按照规范传递: pay_order_wx.BODY
     * @return 商品简单描述，该字段请按照规范传递: pay_order_wx.BODY
     * @author MyBatis Generator
     */
    public String getBody() {
        return body;
    }

    /**
     * 设置商品简单描述，该字段请按照规范传递: pay_order_wx.BODY
     * @param body 映射数据库字段: pay_order_wx.BODY
     * @author MyBatis Generator
     */
    public void setBody(String body) {
        this.body = body == null ? null : body.trim();
    }

    /**
     * 获取商品详细列表，使用Json格式，传输签名前请务必使用CDATA标签将JSON文本串保护起来。
            cost_price Int 可选 32 订单原价，商户侧一张小票订单可能被分多次支付，订单原价用于记录整张小票的支付金额。当订单原价与支付金额不相等则被判定为拆单，无法享受优惠。
             receipt_id String 可选 32 商家小票ID
            goods_detail 服务商必填 []：
            └ goods_id String 必填 32 商品的编号
            └ wxpay_goods_id String 可选 32 微信支付定义的统一商品编号
            └ goods_name String 可选 256 商品名称
            └ quantity Int 必填  32 商品数量
            └ price Int 必填 32 商品单价，如果商户有优惠，需传输商户优惠后的单价
            注意：单品总金额应<=订单总金额total_fee，否则会无法享受优惠。: pay_order_wx.DETAIL
     * @return 商品详细列表，使用Json格式，传输签名前请务必使用CDATA标签将JSON文本串保护起来。
            cost_price Int 可选 32 订单原价，商户侧一张小票订单可能被分多次支付，订单原价用于记录整张小票的支付金额。当订单原价与支付金额不相等则被判定为拆单，无法享受优惠。
             receipt_id String 可选 32 商家小票ID
            goods_detail 服务商必填 []：
            └ goods_id String 必填 32 商品的编号
            └ wxpay_goods_id String 可选 32 微信支付定义的统一商品编号
            └ goods_name String 可选 256 商品名称
            └ quantity Int 必填  32 商品数量
            └ price Int 必填 32 商品单价，如果商户有优惠，需传输商户优惠后的单价
            注意：单品总金额应<=订单总金额total_fee，否则会无法享受优惠。: pay_order_wx.DETAIL
     * @author MyBatis Generator
     */
    public String getDetail() {
        return detail;
    }

    /**
     * 设置商品详细列表，使用Json格式，传输签名前请务必使用CDATA标签将JSON文本串保护起来。
            cost_price Int 可选 32 订单原价，商户侧一张小票订单可能被分多次支付，订单原价用于记录整张小票的支付金额。当订单原价与支付金额不相等则被判定为拆单，无法享受优惠。
             receipt_id String 可选 32 商家小票ID
            goods_detail 服务商必填 []：
            └ goods_id String 必填 32 商品的编号
            └ wxpay_goods_id String 可选 32 微信支付定义的统一商品编号
            └ goods_name String 可选 256 商品名称
            └ quantity Int 必填  32 商品数量
            └ price Int 必填 32 商品单价，如果商户有优惠，需传输商户优惠后的单价
            注意：单品总金额应<=订单总金额total_fee，否则会无法享受优惠。: pay_order_wx.DETAIL
     * @param detail 映射数据库字段: pay_order_wx.DETAIL
     * @author MyBatis Generator
     */
    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }

    /**
     * 获取附加数据，在查询API和支付通知中原样返回，可作为自定义参数使用。: pay_order_wx.ATTACH
     * @return 附加数据，在查询API和支付通知中原样返回，可作为自定义参数使用。: pay_order_wx.ATTACH
     * @author MyBatis Generator
     */
    public String getAttach() {
        return attach;
    }

    /**
     * 设置附加数据，在查询API和支付通知中原样返回，可作为自定义参数使用。: pay_order_wx.ATTACH
     * @param attach 映射数据库字段: pay_order_wx.ATTACH
     * @author MyBatis Generator
     */
    public void setAttach(String attach) {
        this.attach = attach == null ? null : attach.trim();
    }

    /**
     * 获取符合ISO 4217标准的三位字母代码，默认人民币：CNY: pay_order_wx.FEE_TYPE
     * @return 符合ISO 4217标准的三位字母代码，默认人民币：CNY: pay_order_wx.FEE_TYPE
     * @author MyBatis Generator
     */
    public String getFeeType() {
        return feeType;
    }

    /**
     * 设置符合ISO 4217标准的三位字母代码，默认人民币：CNY: pay_order_wx.FEE_TYPE
     * @param feeType 映射数据库字段: pay_order_wx.FEE_TYPE
     * @author MyBatis Generator
     */
    public void setFeeType(String feeType) {
        this.feeType = feeType == null ? null : feeType.trim();
    }

    /**
     * 获取订单总金额，单位为分: pay_order_wx.TOTAL_FEE
     * @return 订单总金额，单位为分: pay_order_wx.TOTAL_FEE
     * @author MyBatis Generator
     */
    public Integer getTotalFee() {
        return totalFee;
    }

    /**
     * 设置订单总金额，单位为分: pay_order_wx.TOTAL_FEE
     * @param totalFee 映射数据库字段: pay_order_wx.TOTAL_FEE
     * @author MyBatis Generator
     */
    public void setTotalFee(Integer totalFee) {
        this.totalFee = totalFee;
    }

    /**
     * 获取APP和网页支付提交用户端ip，Native支付填调用微信支付API的机器IP。: pay_order_wx.SPBILL_CREATE_IP
     * @return APP和网页支付提交用户端ip，Native支付填调用微信支付API的机器IP。: pay_order_wx.SPBILL_CREATE_IP
     * @author MyBatis Generator
     */
    public String getSpbillCreateIp() {
        return spbillCreateIp;
    }

    /**
     * 设置APP和网页支付提交用户端ip，Native支付填调用微信支付API的机器IP。: pay_order_wx.SPBILL_CREATE_IP
     * @param spbillCreateIp 映射数据库字段: pay_order_wx.SPBILL_CREATE_IP
     * @author MyBatis Generator
     */
    public void setSpbillCreateIp(String spbillCreateIp) {
        this.spbillCreateIp = spbillCreateIp == null ? null : spbillCreateIp.trim();
    }

    /**
     * 获取订单生成时间，格式为yyyyMMddHHmmss，如2009年12月25日9点10分10秒表示为20091225091010。: pay_order_wx.TIME_START
     * @return 订单生成时间，格式为yyyyMMddHHmmss，如2009年12月25日9点10分10秒表示为20091225091010。: pay_order_wx.TIME_START
     * @author MyBatis Generator
     */
    public String getTimeStart() {
        return timeStart;
    }

    /**
     * 设置订单生成时间，格式为yyyyMMddHHmmss，如2009年12月25日9点10分10秒表示为20091225091010。: pay_order_wx.TIME_START
     * @param timeStart 映射数据库字段: pay_order_wx.TIME_START
     * @author MyBatis Generator
     */
    public void setTimeStart(String timeStart) {
        this.timeStart = timeStart == null ? null : timeStart.trim();
    }

    /**
     * 获取订单失效时间，格式为yyyyMMddHHmmss，如2009年12月27日9点10分10秒表示为20091227091010。注意：最短失效时间间隔必须大于5分钟: pay_order_wx.TIME_EXPIRE
     * @return 订单失效时间，格式为yyyyMMddHHmmss，如2009年12月27日9点10分10秒表示为20091227091010。注意：最短失效时间间隔必须大于5分钟: pay_order_wx.TIME_EXPIRE
     * @author MyBatis Generator
     */
    public String getTimeExpire() {
        return timeExpire;
    }

    /**
     * 设置订单失效时间，格式为yyyyMMddHHmmss，如2009年12月27日9点10分10秒表示为20091227091010。注意：最短失效时间间隔必须大于5分钟: pay_order_wx.TIME_EXPIRE
     * @param timeExpire 映射数据库字段: pay_order_wx.TIME_EXPIRE
     * @author MyBatis Generator
     */
    public void setTimeExpire(String timeExpire) {
        this.timeExpire = timeExpire == null ? null : timeExpire.trim();
    }

    /**
     * 获取商品标记，使用代金券或立减优惠功能时需要的参数: pay_order_wx.GOODS_TAG
     * @return 商品标记，使用代金券或立减优惠功能时需要的参数: pay_order_wx.GOODS_TAG
     * @author MyBatis Generator
     */
    public String getGoodsTag() {
        return goodsTag;
    }

    /**
     * 设置商品标记，使用代金券或立减优惠功能时需要的参数: pay_order_wx.GOODS_TAG
     * @param goodsTag 映射数据库字段: pay_order_wx.GOODS_TAG
     * @author MyBatis Generator
     */
    public void setGoodsTag(String goodsTag) {
        this.goodsTag = goodsTag == null ? null : goodsTag.trim();
    }

    /**
     * 获取取值如下：JSAPI，NATIVE，APP等: pay_order_wx.TRADE_TYPE
     * @return 取值如下：JSAPI，NATIVE，APP等: pay_order_wx.TRADE_TYPE
     * @author MyBatis Generator
     */
    public String getTradeType() {
        return tradeType;
    }

    /**
     * 设置取值如下：JSAPI，NATIVE，APP等: pay_order_wx.TRADE_TYPE
     * @param tradeType 映射数据库字段: pay_order_wx.TRADE_TYPE
     * @author MyBatis Generator
     */
    public void setTradeType(String tradeType) {
        this.tradeType = tradeType == null ? null : tradeType.trim();
    }

    /**
     * 获取trade_type=NATIVE时（即扫码支付），此参数必传。此参数为二维码中包含的商品ID，商户自行定义。: pay_order_wx.PRODUCT_ID
     * @return trade_type=NATIVE时（即扫码支付），此参数必传。此参数为二维码中包含的商品ID，商户自行定义。: pay_order_wx.PRODUCT_ID
     * @author MyBatis Generator
     */
    public String getProductId() {
        return productId;
    }

    /**
     * 设置trade_type=NATIVE时（即扫码支付），此参数必传。此参数为二维码中包含的商品ID，商户自行定义。: pay_order_wx.PRODUCT_ID
     * @param productId 映射数据库字段: pay_order_wx.PRODUCT_ID
     * @author MyBatis Generator
     */
    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    /**
     * 获取上传此参数no_credit--可限制用户不能使用信用卡支付: pay_order_wx.LIMIT_PAY
     * @return 上传此参数no_credit--可限制用户不能使用信用卡支付: pay_order_wx.LIMIT_PAY
     * @author MyBatis Generator
     */
    public String getLimitPay() {
        return limitPay;
    }

    /**
     * 设置上传此参数no_credit--可限制用户不能使用信用卡支付: pay_order_wx.LIMIT_PAY
     * @param limitPay 映射数据库字段: pay_order_wx.LIMIT_PAY
     * @author MyBatis Generator
     */
    public void setLimitPay(String limitPay) {
        this.limitPay = limitPay == null ? null : limitPay.trim();
    }

    /**
     * 获取trade_type=JSAPI时（即公众号支付），此参数必传，此参数为微信用户在商户对应appid下的唯一标识。openid如何获取，可参考【获取openid】。企业号请使用【企业号OAuth2.0接口】获取企业号内成员userid，再调用【企业号userid转openid接口】进行转换: pay_order_wx.OPENID
     * @return trade_type=JSAPI时（即公众号支付），此参数必传，此参数为微信用户在商户对应appid下的唯一标识。openid如何获取，可参考【获取openid】。企业号请使用【企业号OAuth2.0接口】获取企业号内成员userid，再调用【企业号userid转openid接口】进行转换: pay_order_wx.OPENID
     * @author MyBatis Generator
     */
    public String getOpenid() {
        return openid;
    }

    /**
     * 设置trade_type=JSAPI时（即公众号支付），此参数必传，此参数为微信用户在商户对应appid下的唯一标识。openid如何获取，可参考【获取openid】。企业号请使用【企业号OAuth2.0接口】获取企业号内成员userid，再调用【企业号userid转openid接口】进行转换: pay_order_wx.OPENID
     * @param openid 映射数据库字段: pay_order_wx.OPENID
     * @author MyBatis Generator
     */
    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    /**
     * 获取微信支付系统返回的预付单信息: pay_order_wx.PREPAY_ID
     * @return 微信支付系统返回的预付单信息: pay_order_wx.PREPAY_ID
     * @author MyBatis Generator
     */
    public String getPrepayId() {
        return prepayId;
    }

    /**
     * 设置微信支付系统返回的预付单信息: pay_order_wx.PREPAY_ID
     * @param prepayId 映射数据库字段: pay_order_wx.PREPAY_ID
     * @author MyBatis Generator
     */
    public void setPrepayId(String prepayId) {
        this.prepayId = prepayId == null ? null : prepayId.trim();
    }

    /**
     * 获取trade_type为NATIVE时有返回，用于生成二维码，展示给用户进行扫码支付: pay_order_wx.CODE_URL
     * @return trade_type为NATIVE时有返回，用于生成二维码，展示给用户进行扫码支付: pay_order_wx.CODE_URL
     * @author MyBatis Generator
     */
    public String getCodeUrl() {
        return codeUrl;
    }

    /**
     * 设置trade_type为NATIVE时有返回，用于生成二维码，展示给用户进行扫码支付: pay_order_wx.CODE_URL
     * @param codeUrl 映射数据库字段: pay_order_wx.CODE_URL
     * @author MyBatis Generator
     */
    public void setCodeUrl(String codeUrl) {
        this.codeUrl = codeUrl == null ? null : codeUrl.trim();
    }

    /**
     * 获取预付单业务结果，SUCCESS/FAIL: pay_order_wx.PREPAY_RESULT_CODE
     * @return 预付单业务结果，SUCCESS/FAIL: pay_order_wx.PREPAY_RESULT_CODE
     * @author MyBatis Generator
     */
    public String getPrepayResultCode() {
        return prepayResultCode;
    }

    /**
     * 设置预付单业务结果，SUCCESS/FAIL: pay_order_wx.PREPAY_RESULT_CODE
     * @param prepayResultCode 映射数据库字段: pay_order_wx.PREPAY_RESULT_CODE
     * @author MyBatis Generator
     */
    public void setPrepayResultCode(String prepayResultCode) {
        this.prepayResultCode = prepayResultCode == null ? null : prepayResultCode.trim();
    }

    /**
     * 获取微信支付订单号，微信服务器返回的支付订单号: pay_order_wx.PAY_TRANSACTION_ID
     * @return 微信支付订单号，微信服务器返回的支付订单号: pay_order_wx.PAY_TRANSACTION_ID
     * @author MyBatis Generator
     */
    public String getPayTransactionId() {
        return payTransactionId;
    }

    /**
     * 设置微信支付订单号，微信服务器返回的支付订单号: pay_order_wx.PAY_TRANSACTION_ID
     * @param payTransactionId 映射数据库字段: pay_order_wx.PAY_TRANSACTION_ID
     * @author MyBatis Generator
     */
    public void setPayTransactionId(String payTransactionId) {
        this.payTransactionId = payTransactionId == null ? null : payTransactionId.trim();
    }

    /**
     * 获取支付结果: pay_order_wx.PAY_RESULT_CODE
     * @return 支付结果: pay_order_wx.PAY_RESULT_CODE
     * @author MyBatis Generator
     */
    public String getPayResultCode() {
        return payResultCode;
    }

    /**
     * 设置支付结果: pay_order_wx.PAY_RESULT_CODE
     * @param payResultCode 映射数据库字段: pay_order_wx.PAY_RESULT_CODE
     * @author MyBatis Generator
     */
    public void setPayResultCode(String payResultCode) {
        this.payResultCode = payResultCode == null ? null : payResultCode.trim();
    }

    /**
     * 获取付款银行: pay_order_wx.BANK_TYPE
     * @return 付款银行: pay_order_wx.BANK_TYPE
     * @author MyBatis Generator
     */
    public String getBankType() {
        return bankType;
    }

    /**
     * 设置付款银行: pay_order_wx.BANK_TYPE
     * @param bankType 映射数据库字段: pay_order_wx.BANK_TYPE
     * @author MyBatis Generator
     */
    public void setBankType(String bankType) {
        this.bankType = bankType == null ? null : bankType.trim();
    }

    /**
     * 获取应结订单金额， 应结订单金额=订单金额-非充值代金券金额，应结订单金额<=订单金额。: pay_order_wx.SETTLEMENT_TOTAL_FEE
     * @return 应结订单金额， 应结订单金额=订单金额-非充值代金券金额，应结订单金额<=订单金额。: pay_order_wx.SETTLEMENT_TOTAL_FEE
     * @author MyBatis Generator
     */
    public Integer getSettlementTotalFee() {
        return settlementTotalFee;
    }

    /**
     * 设置应结订单金额， 应结订单金额=订单金额-非充值代金券金额，应结订单金额<=订单金额。: pay_order_wx.SETTLEMENT_TOTAL_FEE
     * @param settlementTotalFee 映射数据库字段: pay_order_wx.SETTLEMENT_TOTAL_FEE
     * @author MyBatis Generator
     */
    public void setSettlementTotalFee(Integer settlementTotalFee) {
        this.settlementTotalFee = settlementTotalFee;
    }

    /**
     * 获取现金支付金额， 订单现金支付金额: pay_order_wx.CASH_FEE
     * @return 现金支付金额， 订单现金支付金额: pay_order_wx.CASH_FEE
     * @author MyBatis Generator
     */
    public Integer getCashFee() {
        return cashFee;
    }

    /**
     * 设置现金支付金额， 订单现金支付金额: pay_order_wx.CASH_FEE
     * @param cashFee 映射数据库字段: pay_order_wx.CASH_FEE
     * @author MyBatis Generator
     */
    public void setCashFee(Integer cashFee) {
        this.cashFee = cashFee;
    }

    /**
     * 获取货币类型，符合ISO4217标准的三位字母代码，默认人民币：CNY: pay_order_wx.CASH_FEE_TYPE
     * @return 货币类型，符合ISO4217标准的三位字母代码，默认人民币：CNY: pay_order_wx.CASH_FEE_TYPE
     * @author MyBatis Generator
     */
    public String getCashFeeType() {
        return cashFeeType;
    }

    /**
     * 设置货币类型，符合ISO4217标准的三位字母代码，默认人民币：CNY: pay_order_wx.CASH_FEE_TYPE
     * @param cashFeeType 映射数据库字段: pay_order_wx.CASH_FEE_TYPE
     * @author MyBatis Generator
     */
    public void setCashFeeType(String cashFeeType) {
        this.cashFeeType = cashFeeType == null ? null : cashFeeType.trim();
    }

    /**
     * 获取总代金券金额， 现金支付金额=订单金额-代金券金额，代金券金额<=订单金额: pay_order_wx.COUPON_FEE
     * @return 总代金券金额， 现金支付金额=订单金额-代金券金额，代金券金额<=订单金额: pay_order_wx.COUPON_FEE
     * @author MyBatis Generator
     */
    public Integer getCouponFee() {
        return couponFee;
    }

    /**
     * 设置总代金券金额， 现金支付金额=订单金额-代金券金额，代金券金额<=订单金额: pay_order_wx.COUPON_FEE
     * @param couponFee 映射数据库字段: pay_order_wx.COUPON_FEE
     * @author MyBatis Generator
     */
    public void setCouponFee(Integer couponFee) {
        this.couponFee = couponFee;
    }

    /**
     * 获取代金券使用数量: pay_order_wx.COUPON_COUNT
     * @return 代金券使用数量: pay_order_wx.COUPON_COUNT
     * @author MyBatis Generator
     */
    public Integer getCouponCount() {
        return couponCount;
    }

    /**
     * 设置代金券使用数量: pay_order_wx.COUPON_COUNT
     * @param couponCount 映射数据库字段: pay_order_wx.COUPON_COUNT
     * @author MyBatis Generator
     */
    public void setCouponCount(Integer couponCount) {
        this.couponCount = couponCount;
    }

    /**
     * 获取所有代金券明细， json格式数组   包含字段     couponType:代金券类型   couponId:代金券ID    coupon_fee:单个代金券支付金额: pay_order_wx.COUPON_DETAIL_LIST
     * @return 所有代金券明细， json格式数组   包含字段     couponType:代金券类型   couponId:代金券ID    coupon_fee:单个代金券支付金额: pay_order_wx.COUPON_DETAIL_LIST
     * @author MyBatis Generator
     */
    public String getCouponDetailList() {
        return couponDetailList;
    }

    /**
     * 设置所有代金券明细， json格式数组   包含字段     couponType:代金券类型   couponId:代金券ID    coupon_fee:单个代金券支付金额: pay_order_wx.COUPON_DETAIL_LIST
     * @param couponDetailList 映射数据库字段: pay_order_wx.COUPON_DETAIL_LIST
     * @author MyBatis Generator
     */
    public void setCouponDetailList(String couponDetailList) {
        this.couponDetailList = couponDetailList == null ? null : couponDetailList.trim();
    }

    /**
     * 获取支付完成时间，格式为yyyyMMddHHmmss: pay_order_wx.TIME_END
     * @return 支付完成时间，格式为yyyyMMddHHmmss: pay_order_wx.TIME_END
     * @author MyBatis Generator
     */
    public String getTimeEnd() {
        return timeEnd;
    }

    /**
     * 设置支付完成时间，格式为yyyyMMddHHmmss: pay_order_wx.TIME_END
     * @param timeEnd 映射数据库字段: pay_order_wx.TIME_END
     * @author MyBatis Generator
     */
    public void setTimeEnd(String timeEnd) {
        this.timeEnd = timeEnd == null ? null : timeEnd.trim();
    }

    /**
     * 获取是否有效, true:有效     false:无效     由于系统生成订单可能会有异常情况，此单作废，重新生成一条记录  : pay_order_wx.IS_VALID
     * @return 是否有效, true:有效     false:无效     由于系统生成订单可能会有异常情况，此单作废，重新生成一条记录  : pay_order_wx.IS_VALID
     * @author MyBatis Generator
     */
    public String getIsValid() {
        return isValid;
    }

    /**
     * 设置是否有效, true:有效     false:无效     由于系统生成订单可能会有异常情况，此单作废，重新生成一条记录  : pay_order_wx.IS_VALID
     * @param isValid 映射数据库字段: pay_order_wx.IS_VALID
     * @author MyBatis Generator
     */
    public void setIsValid(String isValid) {
        this.isValid = isValid == null ? null : isValid.trim();
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: pay_order_wx
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
        PayOrderWx other = (PayOrderWx) that;
        return (this.getPayOrderWxId() == null ? other.getPayOrderWxId() == null : this.getPayOrderWxId().equals(other.getPayOrderWxId()))
            && (this.getPayInfoId() == null ? other.getPayInfoId() == null : this.getPayInfoId().equals(other.getPayInfoId()))
            && (this.getAppid() == null ? other.getAppid() == null : this.getAppid().equals(other.getAppid()))
            && (this.getMchId() == null ? other.getMchId() == null : this.getMchId().equals(other.getMchId()))
            && (this.getDeviceInfo() == null ? other.getDeviceInfo() == null : this.getDeviceInfo().equals(other.getDeviceInfo()))
            && (this.getBody() == null ? other.getBody() == null : this.getBody().equals(other.getBody()))
            && (this.getDetail() == null ? other.getDetail() == null : this.getDetail().equals(other.getDetail()))
            && (this.getAttach() == null ? other.getAttach() == null : this.getAttach().equals(other.getAttach()))
            && (this.getFeeType() == null ? other.getFeeType() == null : this.getFeeType().equals(other.getFeeType()))
            && (this.getTotalFee() == null ? other.getTotalFee() == null : this.getTotalFee().equals(other.getTotalFee()))
            && (this.getSpbillCreateIp() == null ? other.getSpbillCreateIp() == null : this.getSpbillCreateIp().equals(other.getSpbillCreateIp()))
            && (this.getTimeStart() == null ? other.getTimeStart() == null : this.getTimeStart().equals(other.getTimeStart()))
            && (this.getTimeExpire() == null ? other.getTimeExpire() == null : this.getTimeExpire().equals(other.getTimeExpire()))
            && (this.getGoodsTag() == null ? other.getGoodsTag() == null : this.getGoodsTag().equals(other.getGoodsTag()))
            && (this.getTradeType() == null ? other.getTradeType() == null : this.getTradeType().equals(other.getTradeType()))
            && (this.getProductId() == null ? other.getProductId() == null : this.getProductId().equals(other.getProductId()))
            && (this.getLimitPay() == null ? other.getLimitPay() == null : this.getLimitPay().equals(other.getLimitPay()))
            && (this.getOpenid() == null ? other.getOpenid() == null : this.getOpenid().equals(other.getOpenid()))
            && (this.getPrepayId() == null ? other.getPrepayId() == null : this.getPrepayId().equals(other.getPrepayId()))
            && (this.getCodeUrl() == null ? other.getCodeUrl() == null : this.getCodeUrl().equals(other.getCodeUrl()))
            && (this.getPrepayResultCode() == null ? other.getPrepayResultCode() == null : this.getPrepayResultCode().equals(other.getPrepayResultCode()))
            && (this.getPayTransactionId() == null ? other.getPayTransactionId() == null : this.getPayTransactionId().equals(other.getPayTransactionId()))
            && (this.getPayResultCode() == null ? other.getPayResultCode() == null : this.getPayResultCode().equals(other.getPayResultCode()))
            && (this.getBankType() == null ? other.getBankType() == null : this.getBankType().equals(other.getBankType()))
            && (this.getSettlementTotalFee() == null ? other.getSettlementTotalFee() == null : this.getSettlementTotalFee().equals(other.getSettlementTotalFee()))
            && (this.getCashFee() == null ? other.getCashFee() == null : this.getCashFee().equals(other.getCashFee()))
            && (this.getCashFeeType() == null ? other.getCashFeeType() == null : this.getCashFeeType().equals(other.getCashFeeType()))
            && (this.getCouponFee() == null ? other.getCouponFee() == null : this.getCouponFee().equals(other.getCouponFee()))
            && (this.getCouponCount() == null ? other.getCouponCount() == null : this.getCouponCount().equals(other.getCouponCount()))
            && (this.getCouponDetailList() == null ? other.getCouponDetailList() == null : this.getCouponDetailList().equals(other.getCouponDetailList()))
            && (this.getTimeEnd() == null ? other.getTimeEnd() == null : this.getTimeEnd().equals(other.getTimeEnd()))
            && (this.getIsValid() == null ? other.getIsValid() == null : this.getIsValid().equals(other.getIsValid()));
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: pay_order_wx
     * @author MyBatis Generator
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPayOrderWxId() == null) ? 0 : getPayOrderWxId().hashCode());
        result = prime * result + ((getPayInfoId() == null) ? 0 : getPayInfoId().hashCode());
        result = prime * result + ((getAppid() == null) ? 0 : getAppid().hashCode());
        result = prime * result + ((getMchId() == null) ? 0 : getMchId().hashCode());
        result = prime * result + ((getDeviceInfo() == null) ? 0 : getDeviceInfo().hashCode());
        result = prime * result + ((getBody() == null) ? 0 : getBody().hashCode());
        result = prime * result + ((getDetail() == null) ? 0 : getDetail().hashCode());
        result = prime * result + ((getAttach() == null) ? 0 : getAttach().hashCode());
        result = prime * result + ((getFeeType() == null) ? 0 : getFeeType().hashCode());
        result = prime * result + ((getTotalFee() == null) ? 0 : getTotalFee().hashCode());
        result = prime * result + ((getSpbillCreateIp() == null) ? 0 : getSpbillCreateIp().hashCode());
        result = prime * result + ((getTimeStart() == null) ? 0 : getTimeStart().hashCode());
        result = prime * result + ((getTimeExpire() == null) ? 0 : getTimeExpire().hashCode());
        result = prime * result + ((getGoodsTag() == null) ? 0 : getGoodsTag().hashCode());
        result = prime * result + ((getTradeType() == null) ? 0 : getTradeType().hashCode());
        result = prime * result + ((getProductId() == null) ? 0 : getProductId().hashCode());
        result = prime * result + ((getLimitPay() == null) ? 0 : getLimitPay().hashCode());
        result = prime * result + ((getOpenid() == null) ? 0 : getOpenid().hashCode());
        result = prime * result + ((getPrepayId() == null) ? 0 : getPrepayId().hashCode());
        result = prime * result + ((getCodeUrl() == null) ? 0 : getCodeUrl().hashCode());
        result = prime * result + ((getPrepayResultCode() == null) ? 0 : getPrepayResultCode().hashCode());
        result = prime * result + ((getPayTransactionId() == null) ? 0 : getPayTransactionId().hashCode());
        result = prime * result + ((getPayResultCode() == null) ? 0 : getPayResultCode().hashCode());
        result = prime * result + ((getBankType() == null) ? 0 : getBankType().hashCode());
        result = prime * result + ((getSettlementTotalFee() == null) ? 0 : getSettlementTotalFee().hashCode());
        result = prime * result + ((getCashFee() == null) ? 0 : getCashFee().hashCode());
        result = prime * result + ((getCashFeeType() == null) ? 0 : getCashFeeType().hashCode());
        result = prime * result + ((getCouponFee() == null) ? 0 : getCouponFee().hashCode());
        result = prime * result + ((getCouponCount() == null) ? 0 : getCouponCount().hashCode());
        result = prime * result + ((getCouponDetailList() == null) ? 0 : getCouponDetailList().hashCode());
        result = prime * result + ((getTimeEnd() == null) ? 0 : getTimeEnd().hashCode());
        result = prime * result + ((getIsValid() == null) ? 0 : getIsValid().hashCode());
        return result;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: pay_order_wx
     * @author MyBatis Generator
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append(", payOrderWxId=").append(payOrderWxId);
        sb.append(", payInfoId=").append(payInfoId);
        sb.append(", appid=").append(appid);
        sb.append(", mchId=").append(mchId);
        sb.append(", deviceInfo=").append(deviceInfo);
        sb.append(", body=").append(body);
        sb.append(", detail=").append(detail);
        sb.append(", attach=").append(attach);
        sb.append(", feeType=").append(feeType);
        sb.append(", totalFee=").append(totalFee);
        sb.append(", spbillCreateIp=").append(spbillCreateIp);
        sb.append(", timeStart=").append(timeStart);
        sb.append(", timeExpire=").append(timeExpire);
        sb.append(", goodsTag=").append(goodsTag);
        sb.append(", tradeType=").append(tradeType);
        sb.append(", productId=").append(productId);
        sb.append(", limitPay=").append(limitPay);
        sb.append(", openid=").append(openid);
        sb.append(", prepayId=").append(prepayId);
        sb.append(", codeUrl=").append(codeUrl);
        sb.append(", prepayResultCode=").append(prepayResultCode);
        sb.append(", payTransactionId=").append(payTransactionId);
        sb.append(", payResultCode=").append(payResultCode);
        sb.append(", bankType=").append(bankType);
        sb.append(", settlementTotalFee=").append(settlementTotalFee);
        sb.append(", cashFee=").append(cashFee);
        sb.append(", cashFeeType=").append(cashFeeType);
        sb.append(", couponFee=").append(couponFee);
        sb.append(", couponCount=").append(couponCount);
        sb.append(", couponDetailList=").append(couponDetailList);
        sb.append(", timeEnd=").append(timeEnd);
        sb.append(", isValid=").append(isValid);
        sb.append("]");
        return sb.toString();
    }
}