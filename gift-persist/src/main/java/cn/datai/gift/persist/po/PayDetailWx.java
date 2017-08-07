package cn.datai.gift.persist.po;

import java.io.Serializable;

public class PayDetailWx implements Serializable {
    public static final long serialVersionUID = 2019119089L;

    /**
     * 微信渠道支付明细id， 用于微信平台的商户订单号，商户系统内部订单号，要求32个字符内、且在同一个商户号下唯一。: PAY_DETAIL_WX.PAY_DETAIL_WX_ID
     * @author MyBatis Generator
     */
    private Integer payDetailWxId;

    /**
     * 微信支付分配的公众账号ID（企业号corpid即为此appId）
            微信支付分配的公众账号ID（企业号corpid即为此appId）: PAY_DETAIL_WX.APPID
     * @author MyBatis Generator
     */
    private String appid;

    /**
     * 微信支付分配的商户号: PAY_DETAIL_WX.MCH_ID
     * @author MyBatis Generator
     */
    private String mchId;

    /**
     * 自定义参数，可以为终端设备号(门店号或收银设备ID)，PC网页或公众号内支付可以传"WEB": PAY_DETAIL_WX.DEVICE_INFO
     * @author MyBatis Generator
     */
    private String deviceInfo;

    /**
     * 随机字符串，长度要求在32位以内。: PAY_DETAIL_WX.NONCE_STR
     * @author MyBatis Generator
     */
    private String nonceStr;

    /**
     * 通过签名算法计算得出的签名值: PAY_DETAIL_WX.SIGN
     * @author MyBatis Generator
     */
    private String sign;

    /**
     * 签名类型，默认为MD5，支持HMAC-SHA256和MD5。: PAY_DETAIL_WX.SIGN_TYPE
     * @author MyBatis Generator
     */
    private String signType;

    /**
     * 商品简单描述，该字段请按照规范传递: PAY_DETAIL_WX.BODY
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
            注意：单品总金额应<=订单总金额total_fee，否则会无法享受优惠。: PAY_DETAIL_WX.DETAIL
     * @author MyBatis Generator
     */
    private String detail;

    /**
     * 附加数据，在查询API和支付通知中原样返回，可作为自定义参数使用。: PAY_DETAIL_WX.ATTACH
     * @author MyBatis Generator
     */
    private String attach;

    /**
     * 符合ISO 4217标准的三位字母代码，默认人民币：CNY: PAY_DETAIL_WX.FEE_TYPE
     * @author MyBatis Generator
     */
    private String feeType;

    /**
     * 订单总金额，单位为分: PAY_DETAIL_WX.TOTAL_FEE
     * @author MyBatis Generator
     */
    private Integer totalFee;

    /**
     * APP和网页支付提交用户端ip，Native支付填调用微信支付API的机器IP。: PAY_DETAIL_WX.SPBILL_CREATE_IP
     * @author MyBatis Generator
     */
    private String spbillCreateIp;

    /**
     * 订单生成时间，格式为yyyyMMddHHmmss，如2009年12月25日9点10分10秒表示为20091225091010。: PAY_DETAIL_WX.TIME_START
     * @author MyBatis Generator
     */
    private String timeStart;

    /**
     * 订单失效时间，格式为yyyyMMddHHmmss，如2009年12月27日9点10分10秒表示为20091227091010。注意：最短失效时间间隔必须大于5分钟: PAY_DETAIL_WX.TIME_EXPIRE
     * @author MyBatis Generator
     */
    private String timeExpire;

    /**
     * 商品标记，使用代金券或立减优惠功能时需要的参数: PAY_DETAIL_WX.GOODS_TAG
     * @author MyBatis Generator
     */
    private String goodsTag;

    /**
     * 异步接收微信支付结果通知的回调地址，通知url必须为外网可访问的url，不能携带参数。: PAY_DETAIL_WX.NOTIFY_URL
     * @author MyBatis Generator
     */
    private String notifyUrl;

    /**
     * 取值如下：JSAPI，NATIVE，APP等: PAY_DETAIL_WX.TRADE_TYPE
     * @author MyBatis Generator
     */
    private String tradeType;

    /**
     * trade_type=NATIVE时（即扫码支付），此参数必传。此参数为二维码中包含的商品ID，商户自行定义。: PAY_DETAIL_WX.PRODUCT_ID
     * @author MyBatis Generator
     */
    private String productId;

    /**
     * 上传此参数no_credit--可限制用户不能使用信用卡支付: PAY_DETAIL_WX.LIMIT_PAY
     * @author MyBatis Generator
     */
    private String limitPay;

    /**
     * trade_type=JSAPI时（即公众号支付），此参数必传，此参数为微信用户在商户对应appid下的唯一标识。openid如何获取，可参考【获取openid】。企业号请使用【企业号OAuth2.0接口】获取企业号内成员userid，再调用【企业号userid转openid接口】进行转换: PAY_DETAIL_WX.OPENID
     * @author MyBatis Generator
     */
    private String openid;

    /**
     * 微信支付系统返回的预付单信息: PAY_DETAIL_WX.PREPAY_ID
     * @author MyBatis Generator
     */
    private String prepayId;

    /**
     * trade_type为NATIVE时有返回，用于生成二维码，展示给用户进行扫码支付: PAY_DETAIL_WX.CODE_URL
     * @author MyBatis Generator
     */
    private String codeUrl;

    /**
     * SUCCESS/FAIL
            此字段是通信标识，非交易标识，交易是否成功需要查看result_code来判断: PAY_DETAIL_WX.RETURN_CODE
     * @author MyBatis Generator
     */
    private String returnCode;

    /**
     * 返回信息，如非空，为错误原因
            签名失败
            参数格式校验错误: PAY_DETAIL_WX.RETURN_MSG
     * @author MyBatis Generator
     */
    private String returnMsg;

    /**
     * SUCCESS/FAIL: PAY_DETAIL_WX.RESULT_CODE
     * @author MyBatis Generator
     */
    private String resultCode;

    /**
     * 详细参见下文错误列表: PAY_DETAIL_WX.ERR_CODE
     * @author MyBatis Generator
     */
    private String errCode;

    /**
     * 错误信息描述: PAY_DETAIL_WX.ERR_CODE_DES
     * @author MyBatis Generator
     */
    private String errCodeDes;

    /**
     * 获取微信渠道支付明细id， 用于微信平台的商户订单号，商户系统内部订单号，要求32个字符内、且在同一个商户号下唯一。: PAY_DETAIL_WX.PAY_DETAIL_WX_ID
     * @return 微信渠道支付明细id， 用于微信平台的商户订单号，商户系统内部订单号，要求32个字符内、且在同一个商户号下唯一。: PAY_DETAIL_WX.PAY_DETAIL_WX_ID
     * @author MyBatis Generator
     */
    public Integer getPayDetailWxId() {
        return payDetailWxId;
    }

    /**
     * 设置微信渠道支付明细id， 用于微信平台的商户订单号，商户系统内部订单号，要求32个字符内、且在同一个商户号下唯一。: PAY_DETAIL_WX.PAY_DETAIL_WX_ID
     * @param payDetailWxId 映射数据库字段: PAY_DETAIL_WX.PAY_DETAIL_WX_ID
     * @author MyBatis Generator
     */
    public void setPayDetailWxId(Integer payDetailWxId) {
        this.payDetailWxId = payDetailWxId;
    }

    /**
     * 获取微信支付分配的公众账号ID（企业号corpid即为此appId）
            微信支付分配的公众账号ID（企业号corpid即为此appId）: PAY_DETAIL_WX.APPID
     * @return 微信支付分配的公众账号ID（企业号corpid即为此appId）
            微信支付分配的公众账号ID（企业号corpid即为此appId）: PAY_DETAIL_WX.APPID
     * @author MyBatis Generator
     */
    public String getAppid() {
        return appid;
    }

    /**
     * 设置微信支付分配的公众账号ID（企业号corpid即为此appId）
            微信支付分配的公众账号ID（企业号corpid即为此appId）: PAY_DETAIL_WX.APPID
     * @param appid 映射数据库字段: PAY_DETAIL_WX.APPID
     * @author MyBatis Generator
     */
    public void setAppid(String appid) {
        this.appid = appid == null ? null : appid.trim();
    }

    /**
     * 获取微信支付分配的商户号: PAY_DETAIL_WX.MCH_ID
     * @return 微信支付分配的商户号: PAY_DETAIL_WX.MCH_ID
     * @author MyBatis Generator
     */
    public String getMchId() {
        return mchId;
    }

    /**
     * 设置微信支付分配的商户号: PAY_DETAIL_WX.MCH_ID
     * @param mchId 映射数据库字段: PAY_DETAIL_WX.MCH_ID
     * @author MyBatis Generator
     */
    public void setMchId(String mchId) {
        this.mchId = mchId == null ? null : mchId.trim();
    }

    /**
     * 获取自定义参数，可以为终端设备号(门店号或收银设备ID)，PC网页或公众号内支付可以传"WEB": PAY_DETAIL_WX.DEVICE_INFO
     * @return 自定义参数，可以为终端设备号(门店号或收银设备ID)，PC网页或公众号内支付可以传"WEB": PAY_DETAIL_WX.DEVICE_INFO
     * @author MyBatis Generator
     */
    public String getDeviceInfo() {
        return deviceInfo;
    }

    /**
     * 设置自定义参数，可以为终端设备号(门店号或收银设备ID)，PC网页或公众号内支付可以传"WEB": PAY_DETAIL_WX.DEVICE_INFO
     * @param deviceInfo 映射数据库字段: PAY_DETAIL_WX.DEVICE_INFO
     * @author MyBatis Generator
     */
    public void setDeviceInfo(String deviceInfo) {
        this.deviceInfo = deviceInfo == null ? null : deviceInfo.trim();
    }

    /**
     * 获取随机字符串，长度要求在32位以内。: PAY_DETAIL_WX.NONCE_STR
     * @return 随机字符串，长度要求在32位以内。: PAY_DETAIL_WX.NONCE_STR
     * @author MyBatis Generator
     */
    public String getNonceStr() {
        return nonceStr;
    }

    /**
     * 设置随机字符串，长度要求在32位以内。: PAY_DETAIL_WX.NONCE_STR
     * @param nonceStr 映射数据库字段: PAY_DETAIL_WX.NONCE_STR
     * @author MyBatis Generator
     */
    public void setNonceStr(String nonceStr) {
        this.nonceStr = nonceStr == null ? null : nonceStr.trim();
    }

    /**
     * 获取通过签名算法计算得出的签名值: PAY_DETAIL_WX.SIGN
     * @return 通过签名算法计算得出的签名值: PAY_DETAIL_WX.SIGN
     * @author MyBatis Generator
     */
    public String getSign() {
        return sign;
    }

    /**
     * 设置通过签名算法计算得出的签名值: PAY_DETAIL_WX.SIGN
     * @param sign 映射数据库字段: PAY_DETAIL_WX.SIGN
     * @author MyBatis Generator
     */
    public void setSign(String sign) {
        this.sign = sign == null ? null : sign.trim();
    }

    /**
     * 获取签名类型，默认为MD5，支持HMAC-SHA256和MD5。: PAY_DETAIL_WX.SIGN_TYPE
     * @return 签名类型，默认为MD5，支持HMAC-SHA256和MD5。: PAY_DETAIL_WX.SIGN_TYPE
     * @author MyBatis Generator
     */
    public String getSignType() {
        return signType;
    }

    /**
     * 设置签名类型，默认为MD5，支持HMAC-SHA256和MD5。: PAY_DETAIL_WX.SIGN_TYPE
     * @param signType 映射数据库字段: PAY_DETAIL_WX.SIGN_TYPE
     * @author MyBatis Generator
     */
    public void setSignType(String signType) {
        this.signType = signType == null ? null : signType.trim();
    }

    /**
     * 获取商品简单描述，该字段请按照规范传递: PAY_DETAIL_WX.BODY
     * @return 商品简单描述，该字段请按照规范传递: PAY_DETAIL_WX.BODY
     * @author MyBatis Generator
     */
    public String getBody() {
        return body;
    }

    /**
     * 设置商品简单描述，该字段请按照规范传递: PAY_DETAIL_WX.BODY
     * @param body 映射数据库字段: PAY_DETAIL_WX.BODY
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
            注意：单品总金额应<=订单总金额total_fee，否则会无法享受优惠。: PAY_DETAIL_WX.DETAIL
     * @return 商品详细列表，使用Json格式，传输签名前请务必使用CDATA标签将JSON文本串保护起来。
            cost_price Int 可选 32 订单原价，商户侧一张小票订单可能被分多次支付，订单原价用于记录整张小票的支付金额。当订单原价与支付金额不相等则被判定为拆单，无法享受优惠。
             receipt_id String 可选 32 商家小票ID
            goods_detail 服务商必填 []：
            └ goods_id String 必填 32 商品的编号
            └ wxpay_goods_id String 可选 32 微信支付定义的统一商品编号
            └ goods_name String 可选 256 商品名称 
            └ quantity Int 必填  32 商品数量
            └ price Int 必填 32 商品单价，如果商户有优惠，需传输商户优惠后的单价 
            注意：单品总金额应<=订单总金额total_fee，否则会无法享受优惠。: PAY_DETAIL_WX.DETAIL
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
            注意：单品总金额应<=订单总金额total_fee，否则会无法享受优惠。: PAY_DETAIL_WX.DETAIL
     * @param detail 映射数据库字段: PAY_DETAIL_WX.DETAIL
     * @author MyBatis Generator
     */
    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }

    /**
     * 获取附加数据，在查询API和支付通知中原样返回，可作为自定义参数使用。: PAY_DETAIL_WX.ATTACH
     * @return 附加数据，在查询API和支付通知中原样返回，可作为自定义参数使用。: PAY_DETAIL_WX.ATTACH
     * @author MyBatis Generator
     */
    public String getAttach() {
        return attach;
    }

    /**
     * 设置附加数据，在查询API和支付通知中原样返回，可作为自定义参数使用。: PAY_DETAIL_WX.ATTACH
     * @param attach 映射数据库字段: PAY_DETAIL_WX.ATTACH
     * @author MyBatis Generator
     */
    public void setAttach(String attach) {
        this.attach = attach == null ? null : attach.trim();
    }

    /**
     * 获取符合ISO 4217标准的三位字母代码，默认人民币：CNY: PAY_DETAIL_WX.FEE_TYPE
     * @return 符合ISO 4217标准的三位字母代码，默认人民币：CNY: PAY_DETAIL_WX.FEE_TYPE
     * @author MyBatis Generator
     */
    public String getFeeType() {
        return feeType;
    }

    /**
     * 设置符合ISO 4217标准的三位字母代码，默认人民币：CNY: PAY_DETAIL_WX.FEE_TYPE
     * @param feeType 映射数据库字段: PAY_DETAIL_WX.FEE_TYPE
     * @author MyBatis Generator
     */
    public void setFeeType(String feeType) {
        this.feeType = feeType == null ? null : feeType.trim();
    }

    /**
     * 获取订单总金额，单位为分: PAY_DETAIL_WX.TOTAL_FEE
     * @return 订单总金额，单位为分: PAY_DETAIL_WX.TOTAL_FEE
     * @author MyBatis Generator
     */
    public Integer getTotalFee() {
        return totalFee;
    }

    /**
     * 设置订单总金额，单位为分: PAY_DETAIL_WX.TOTAL_FEE
     * @param totalFee 映射数据库字段: PAY_DETAIL_WX.TOTAL_FEE
     * @author MyBatis Generator
     */
    public void setTotalFee(Integer totalFee) {
        this.totalFee = totalFee;
    }

    /**
     * 获取APP和网页支付提交用户端ip，Native支付填调用微信支付API的机器IP。: PAY_DETAIL_WX.SPBILL_CREATE_IP
     * @return APP和网页支付提交用户端ip，Native支付填调用微信支付API的机器IP。: PAY_DETAIL_WX.SPBILL_CREATE_IP
     * @author MyBatis Generator
     */
    public String getSpbillCreateIp() {
        return spbillCreateIp;
    }

    /**
     * 设置APP和网页支付提交用户端ip，Native支付填调用微信支付API的机器IP。: PAY_DETAIL_WX.SPBILL_CREATE_IP
     * @param spbillCreateIp 映射数据库字段: PAY_DETAIL_WX.SPBILL_CREATE_IP
     * @author MyBatis Generator
     */
    public void setSpbillCreateIp(String spbillCreateIp) {
        this.spbillCreateIp = spbillCreateIp == null ? null : spbillCreateIp.trim();
    }

    /**
     * 获取订单生成时间，格式为yyyyMMddHHmmss，如2009年12月25日9点10分10秒表示为20091225091010。: PAY_DETAIL_WX.TIME_START
     * @return 订单生成时间，格式为yyyyMMddHHmmss，如2009年12月25日9点10分10秒表示为20091225091010。: PAY_DETAIL_WX.TIME_START
     * @author MyBatis Generator
     */
    public String getTimeStart() {
        return timeStart;
    }

    /**
     * 设置订单生成时间，格式为yyyyMMddHHmmss，如2009年12月25日9点10分10秒表示为20091225091010。: PAY_DETAIL_WX.TIME_START
     * @param timeStart 映射数据库字段: PAY_DETAIL_WX.TIME_START
     * @author MyBatis Generator
     */
    public void setTimeStart(String timeStart) {
        this.timeStart = timeStart == null ? null : timeStart.trim();
    }

    /**
     * 获取订单失效时间，格式为yyyyMMddHHmmss，如2009年12月27日9点10分10秒表示为20091227091010。注意：最短失效时间间隔必须大于5分钟: PAY_DETAIL_WX.TIME_EXPIRE
     * @return 订单失效时间，格式为yyyyMMddHHmmss，如2009年12月27日9点10分10秒表示为20091227091010。注意：最短失效时间间隔必须大于5分钟: PAY_DETAIL_WX.TIME_EXPIRE
     * @author MyBatis Generator
     */
    public String getTimeExpire() {
        return timeExpire;
    }

    /**
     * 设置订单失效时间，格式为yyyyMMddHHmmss，如2009年12月27日9点10分10秒表示为20091227091010。注意：最短失效时间间隔必须大于5分钟: PAY_DETAIL_WX.TIME_EXPIRE
     * @param timeExpire 映射数据库字段: PAY_DETAIL_WX.TIME_EXPIRE
     * @author MyBatis Generator
     */
    public void setTimeExpire(String timeExpire) {
        this.timeExpire = timeExpire == null ? null : timeExpire.trim();
    }

    /**
     * 获取商品标记，使用代金券或立减优惠功能时需要的参数: PAY_DETAIL_WX.GOODS_TAG
     * @return 商品标记，使用代金券或立减优惠功能时需要的参数: PAY_DETAIL_WX.GOODS_TAG
     * @author MyBatis Generator
     */
    public String getGoodsTag() {
        return goodsTag;
    }

    /**
     * 设置商品标记，使用代金券或立减优惠功能时需要的参数: PAY_DETAIL_WX.GOODS_TAG
     * @param goodsTag 映射数据库字段: PAY_DETAIL_WX.GOODS_TAG
     * @author MyBatis Generator
     */
    public void setGoodsTag(String goodsTag) {
        this.goodsTag = goodsTag == null ? null : goodsTag.trim();
    }

    /**
     * 获取异步接收微信支付结果通知的回调地址，通知url必须为外网可访问的url，不能携带参数。: PAY_DETAIL_WX.NOTIFY_URL
     * @return 异步接收微信支付结果通知的回调地址，通知url必须为外网可访问的url，不能携带参数。: PAY_DETAIL_WX.NOTIFY_URL
     * @author MyBatis Generator
     */
    public String getNotifyUrl() {
        return notifyUrl;
    }

    /**
     * 设置异步接收微信支付结果通知的回调地址，通知url必须为外网可访问的url，不能携带参数。: PAY_DETAIL_WX.NOTIFY_URL
     * @param notifyUrl 映射数据库字段: PAY_DETAIL_WX.NOTIFY_URL
     * @author MyBatis Generator
     */
    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl == null ? null : notifyUrl.trim();
    }

    /**
     * 获取取值如下：JSAPI，NATIVE，APP等: PAY_DETAIL_WX.TRADE_TYPE
     * @return 取值如下：JSAPI，NATIVE，APP等: PAY_DETAIL_WX.TRADE_TYPE
     * @author MyBatis Generator
     */
    public String getTradeType() {
        return tradeType;
    }

    /**
     * 设置取值如下：JSAPI，NATIVE，APP等: PAY_DETAIL_WX.TRADE_TYPE
     * @param tradeType 映射数据库字段: PAY_DETAIL_WX.TRADE_TYPE
     * @author MyBatis Generator
     */
    public void setTradeType(String tradeType) {
        this.tradeType = tradeType == null ? null : tradeType.trim();
    }

    /**
     * 获取trade_type=NATIVE时（即扫码支付），此参数必传。此参数为二维码中包含的商品ID，商户自行定义。: PAY_DETAIL_WX.PRODUCT_ID
     * @return trade_type=NATIVE时（即扫码支付），此参数必传。此参数为二维码中包含的商品ID，商户自行定义。: PAY_DETAIL_WX.PRODUCT_ID
     * @author MyBatis Generator
     */
    public String getProductId() {
        return productId;
    }

    /**
     * 设置trade_type=NATIVE时（即扫码支付），此参数必传。此参数为二维码中包含的商品ID，商户自行定义。: PAY_DETAIL_WX.PRODUCT_ID
     * @param productId 映射数据库字段: PAY_DETAIL_WX.PRODUCT_ID
     * @author MyBatis Generator
     */
    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    /**
     * 获取上传此参数no_credit--可限制用户不能使用信用卡支付: PAY_DETAIL_WX.LIMIT_PAY
     * @return 上传此参数no_credit--可限制用户不能使用信用卡支付: PAY_DETAIL_WX.LIMIT_PAY
     * @author MyBatis Generator
     */
    public String getLimitPay() {
        return limitPay;
    }

    /**
     * 设置上传此参数no_credit--可限制用户不能使用信用卡支付: PAY_DETAIL_WX.LIMIT_PAY
     * @param limitPay 映射数据库字段: PAY_DETAIL_WX.LIMIT_PAY
     * @author MyBatis Generator
     */
    public void setLimitPay(String limitPay) {
        this.limitPay = limitPay == null ? null : limitPay.trim();
    }

    /**
     * 获取trade_type=JSAPI时（即公众号支付），此参数必传，此参数为微信用户在商户对应appid下的唯一标识。openid如何获取，可参考【获取openid】。企业号请使用【企业号OAuth2.0接口】获取企业号内成员userid，再调用【企业号userid转openid接口】进行转换: PAY_DETAIL_WX.OPENID
     * @return trade_type=JSAPI时（即公众号支付），此参数必传，此参数为微信用户在商户对应appid下的唯一标识。openid如何获取，可参考【获取openid】。企业号请使用【企业号OAuth2.0接口】获取企业号内成员userid，再调用【企业号userid转openid接口】进行转换: PAY_DETAIL_WX.OPENID
     * @author MyBatis Generator
     */
    public String getOpenid() {
        return openid;
    }

    /**
     * 设置trade_type=JSAPI时（即公众号支付），此参数必传，此参数为微信用户在商户对应appid下的唯一标识。openid如何获取，可参考【获取openid】。企业号请使用【企业号OAuth2.0接口】获取企业号内成员userid，再调用【企业号userid转openid接口】进行转换: PAY_DETAIL_WX.OPENID
     * @param openid 映射数据库字段: PAY_DETAIL_WX.OPENID
     * @author MyBatis Generator
     */
    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    /**
     * 获取微信支付系统返回的预付单信息: PAY_DETAIL_WX.PREPAY_ID
     * @return 微信支付系统返回的预付单信息: PAY_DETAIL_WX.PREPAY_ID
     * @author MyBatis Generator
     */
    public String getPrepayId() {
        return prepayId;
    }

    /**
     * 设置微信支付系统返回的预付单信息: PAY_DETAIL_WX.PREPAY_ID
     * @param prepayId 映射数据库字段: PAY_DETAIL_WX.PREPAY_ID
     * @author MyBatis Generator
     */
    public void setPrepayId(String prepayId) {
        this.prepayId = prepayId == null ? null : prepayId.trim();
    }

    /**
     * 获取trade_type为NATIVE时有返回，用于生成二维码，展示给用户进行扫码支付: PAY_DETAIL_WX.CODE_URL
     * @return trade_type为NATIVE时有返回，用于生成二维码，展示给用户进行扫码支付: PAY_DETAIL_WX.CODE_URL
     * @author MyBatis Generator
     */
    public String getCodeUrl() {
        return codeUrl;
    }

    /**
     * 设置trade_type为NATIVE时有返回，用于生成二维码，展示给用户进行扫码支付: PAY_DETAIL_WX.CODE_URL
     * @param codeUrl 映射数据库字段: PAY_DETAIL_WX.CODE_URL
     * @author MyBatis Generator
     */
    public void setCodeUrl(String codeUrl) {
        this.codeUrl = codeUrl == null ? null : codeUrl.trim();
    }

    /**
     * 获取SUCCESS/FAIL
            此字段是通信标识，非交易标识，交易是否成功需要查看result_code来判断: PAY_DETAIL_WX.RETURN_CODE
     * @return SUCCESS/FAIL
            此字段是通信标识，非交易标识，交易是否成功需要查看result_code来判断: PAY_DETAIL_WX.RETURN_CODE
     * @author MyBatis Generator
     */
    public String getReturnCode() {
        return returnCode;
    }

    /**
     * 设置SUCCESS/FAIL
            此字段是通信标识，非交易标识，交易是否成功需要查看result_code来判断: PAY_DETAIL_WX.RETURN_CODE
     * @param returnCode 映射数据库字段: PAY_DETAIL_WX.RETURN_CODE
     * @author MyBatis Generator
     */
    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode == null ? null : returnCode.trim();
    }

    /**
     * 获取返回信息，如非空，为错误原因
            签名失败
            参数格式校验错误: PAY_DETAIL_WX.RETURN_MSG
     * @return 返回信息，如非空，为错误原因
            签名失败
            参数格式校验错误: PAY_DETAIL_WX.RETURN_MSG
     * @author MyBatis Generator
     */
    public String getReturnMsg() {
        return returnMsg;
    }

    /**
     * 设置返回信息，如非空，为错误原因
            签名失败
            参数格式校验错误: PAY_DETAIL_WX.RETURN_MSG
     * @param returnMsg 映射数据库字段: PAY_DETAIL_WX.RETURN_MSG
     * @author MyBatis Generator
     */
    public void setReturnMsg(String returnMsg) {
        this.returnMsg = returnMsg == null ? null : returnMsg.trim();
    }

    /**
     * 获取SUCCESS/FAIL: PAY_DETAIL_WX.RESULT_CODE
     * @return SUCCESS/FAIL: PAY_DETAIL_WX.RESULT_CODE
     * @author MyBatis Generator
     */
    public String getResultCode() {
        return resultCode;
    }

    /**
     * 设置SUCCESS/FAIL: PAY_DETAIL_WX.RESULT_CODE
     * @param resultCode 映射数据库字段: PAY_DETAIL_WX.RESULT_CODE
     * @author MyBatis Generator
     */
    public void setResultCode(String resultCode) {
        this.resultCode = resultCode == null ? null : resultCode.trim();
    }

    /**
     * 获取详细参见下文错误列表: PAY_DETAIL_WX.ERR_CODE
     * @return 详细参见下文错误列表: PAY_DETAIL_WX.ERR_CODE
     * @author MyBatis Generator
     */
    public String getErrCode() {
        return errCode;
    }

    /**
     * 设置详细参见下文错误列表: PAY_DETAIL_WX.ERR_CODE
     * @param errCode 映射数据库字段: PAY_DETAIL_WX.ERR_CODE
     * @author MyBatis Generator
     */
    public void setErrCode(String errCode) {
        this.errCode = errCode == null ? null : errCode.trim();
    }

    /**
     * 获取错误信息描述: PAY_DETAIL_WX.ERR_CODE_DES
     * @return 错误信息描述: PAY_DETAIL_WX.ERR_CODE_DES
     * @author MyBatis Generator
     */
    public String getErrCodeDes() {
        return errCodeDes;
    }

    /**
     * 设置错误信息描述: PAY_DETAIL_WX.ERR_CODE_DES
     * @param errCodeDes 映射数据库字段: PAY_DETAIL_WX.ERR_CODE_DES
     * @author MyBatis Generator
     */
    public void setErrCodeDes(String errCodeDes) {
        this.errCodeDes = errCodeDes == null ? null : errCodeDes.trim();
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: PAY_DETAIL_WX
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
        PayDetailWx other = (PayDetailWx) that;
        return (this.getPayDetailWxId() == null ? other.getPayDetailWxId() == null : this.getPayDetailWxId().equals(other.getPayDetailWxId()))
            && (this.getAppid() == null ? other.getAppid() == null : this.getAppid().equals(other.getAppid()))
            && (this.getMchId() == null ? other.getMchId() == null : this.getMchId().equals(other.getMchId()))
            && (this.getDeviceInfo() == null ? other.getDeviceInfo() == null : this.getDeviceInfo().equals(other.getDeviceInfo()))
            && (this.getNonceStr() == null ? other.getNonceStr() == null : this.getNonceStr().equals(other.getNonceStr()))
            && (this.getSign() == null ? other.getSign() == null : this.getSign().equals(other.getSign()))
            && (this.getSignType() == null ? other.getSignType() == null : this.getSignType().equals(other.getSignType()))
            && (this.getBody() == null ? other.getBody() == null : this.getBody().equals(other.getBody()))
            && (this.getDetail() == null ? other.getDetail() == null : this.getDetail().equals(other.getDetail()))
            && (this.getAttach() == null ? other.getAttach() == null : this.getAttach().equals(other.getAttach()))
            && (this.getFeeType() == null ? other.getFeeType() == null : this.getFeeType().equals(other.getFeeType()))
            && (this.getTotalFee() == null ? other.getTotalFee() == null : this.getTotalFee().equals(other.getTotalFee()))
            && (this.getSpbillCreateIp() == null ? other.getSpbillCreateIp() == null : this.getSpbillCreateIp().equals(other.getSpbillCreateIp()))
            && (this.getTimeStart() == null ? other.getTimeStart() == null : this.getTimeStart().equals(other.getTimeStart()))
            && (this.getTimeExpire() == null ? other.getTimeExpire() == null : this.getTimeExpire().equals(other.getTimeExpire()))
            && (this.getGoodsTag() == null ? other.getGoodsTag() == null : this.getGoodsTag().equals(other.getGoodsTag()))
            && (this.getNotifyUrl() == null ? other.getNotifyUrl() == null : this.getNotifyUrl().equals(other.getNotifyUrl()))
            && (this.getTradeType() == null ? other.getTradeType() == null : this.getTradeType().equals(other.getTradeType()))
            && (this.getProductId() == null ? other.getProductId() == null : this.getProductId().equals(other.getProductId()))
            && (this.getLimitPay() == null ? other.getLimitPay() == null : this.getLimitPay().equals(other.getLimitPay()))
            && (this.getOpenid() == null ? other.getOpenid() == null : this.getOpenid().equals(other.getOpenid()))
            && (this.getPrepayId() == null ? other.getPrepayId() == null : this.getPrepayId().equals(other.getPrepayId()))
            && (this.getCodeUrl() == null ? other.getCodeUrl() == null : this.getCodeUrl().equals(other.getCodeUrl()))
            && (this.getReturnCode() == null ? other.getReturnCode() == null : this.getReturnCode().equals(other.getReturnCode()))
            && (this.getReturnMsg() == null ? other.getReturnMsg() == null : this.getReturnMsg().equals(other.getReturnMsg()))
            && (this.getResultCode() == null ? other.getResultCode() == null : this.getResultCode().equals(other.getResultCode()))
            && (this.getErrCode() == null ? other.getErrCode() == null : this.getErrCode().equals(other.getErrCode()))
            && (this.getErrCodeDes() == null ? other.getErrCodeDes() == null : this.getErrCodeDes().equals(other.getErrCodeDes()));
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: PAY_DETAIL_WX
     * @author MyBatis Generator
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPayDetailWxId() == null) ? 0 : getPayDetailWxId().hashCode());
        result = prime * result + ((getAppid() == null) ? 0 : getAppid().hashCode());
        result = prime * result + ((getMchId() == null) ? 0 : getMchId().hashCode());
        result = prime * result + ((getDeviceInfo() == null) ? 0 : getDeviceInfo().hashCode());
        result = prime * result + ((getNonceStr() == null) ? 0 : getNonceStr().hashCode());
        result = prime * result + ((getSign() == null) ? 0 : getSign().hashCode());
        result = prime * result + ((getSignType() == null) ? 0 : getSignType().hashCode());
        result = prime * result + ((getBody() == null) ? 0 : getBody().hashCode());
        result = prime * result + ((getDetail() == null) ? 0 : getDetail().hashCode());
        result = prime * result + ((getAttach() == null) ? 0 : getAttach().hashCode());
        result = prime * result + ((getFeeType() == null) ? 0 : getFeeType().hashCode());
        result = prime * result + ((getTotalFee() == null) ? 0 : getTotalFee().hashCode());
        result = prime * result + ((getSpbillCreateIp() == null) ? 0 : getSpbillCreateIp().hashCode());
        result = prime * result + ((getTimeStart() == null) ? 0 : getTimeStart().hashCode());
        result = prime * result + ((getTimeExpire() == null) ? 0 : getTimeExpire().hashCode());
        result = prime * result + ((getGoodsTag() == null) ? 0 : getGoodsTag().hashCode());
        result = prime * result + ((getNotifyUrl() == null) ? 0 : getNotifyUrl().hashCode());
        result = prime * result + ((getTradeType() == null) ? 0 : getTradeType().hashCode());
        result = prime * result + ((getProductId() == null) ? 0 : getProductId().hashCode());
        result = prime * result + ((getLimitPay() == null) ? 0 : getLimitPay().hashCode());
        result = prime * result + ((getOpenid() == null) ? 0 : getOpenid().hashCode());
        result = prime * result + ((getPrepayId() == null) ? 0 : getPrepayId().hashCode());
        result = prime * result + ((getCodeUrl() == null) ? 0 : getCodeUrl().hashCode());
        result = prime * result + ((getReturnCode() == null) ? 0 : getReturnCode().hashCode());
        result = prime * result + ((getReturnMsg() == null) ? 0 : getReturnMsg().hashCode());
        result = prime * result + ((getResultCode() == null) ? 0 : getResultCode().hashCode());
        result = prime * result + ((getErrCode() == null) ? 0 : getErrCode().hashCode());
        result = prime * result + ((getErrCodeDes() == null) ? 0 : getErrCodeDes().hashCode());
        return result;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: PAY_DETAIL_WX
     * @author MyBatis Generator
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append(", payDetailWxId=").append(payDetailWxId);
        sb.append(", appid=").append(appid);
        sb.append(", mchId=").append(mchId);
        sb.append(", deviceInfo=").append(deviceInfo);
        sb.append(", nonceStr=").append(nonceStr);
        sb.append(", sign=").append(sign);
        sb.append(", signType=").append(signType);
        sb.append(", body=").append(body);
        sb.append(", detail=").append(detail);
        sb.append(", attach=").append(attach);
        sb.append(", feeType=").append(feeType);
        sb.append(", totalFee=").append(totalFee);
        sb.append(", spbillCreateIp=").append(spbillCreateIp);
        sb.append(", timeStart=").append(timeStart);
        sb.append(", timeExpire=").append(timeExpire);
        sb.append(", goodsTag=").append(goodsTag);
        sb.append(", notifyUrl=").append(notifyUrl);
        sb.append(", tradeType=").append(tradeType);
        sb.append(", productId=").append(productId);
        sb.append(", limitPay=").append(limitPay);
        sb.append(", openid=").append(openid);
        sb.append(", prepayId=").append(prepayId);
        sb.append(", codeUrl=").append(codeUrl);
        sb.append(", returnCode=").append(returnCode);
        sb.append(", returnMsg=").append(returnMsg);
        sb.append(", resultCode=").append(resultCode);
        sb.append(", errCode=").append(errCode);
        sb.append(", errCodeDes=").append(errCodeDes);
        sb.append("]");
        return sb.toString();
    }
}