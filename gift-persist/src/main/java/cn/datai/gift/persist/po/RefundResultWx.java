package cn.datai.gift.persist.po;

import java.io.Serializable;

public class RefundResultWx implements Serializable {
    public static final long serialVersionUID = 47509503L;

    /**
     * 微信退款单号， 对应微信端接口的refund_id: REFUND_RESULT_WX.REFUND_RESULT_WX
     * @author MyBatis Generator
     */
    private String refundResultWx;

    /**
     * 业务结果，SUCCESS/FAIL
            SUCCESS退款申请接收成功，结果通过退款查询接口查询
            FAIL 提交业务失败: REFUND_RESULT_WX.RESULT_CODE
     * @author MyBatis Generator
     */
    private String resultCode;

    /**
     * 错误代码，列表详见错误码列表: REFUND_RESULT_WX.ERR_CODE
     * @author MyBatis Generator
     */
    private String errCode;

    /**
     * 错误代码描述，结果信息描述: REFUND_RESULT_WX.ERR_CODE_DES
     * @author MyBatis Generator
     */
    private String errCodeDes;

    /**
     * 公众账号ID，微信开放平台审核通过的应用APPID: REFUND_RESULT_WX.APPID
     * @author MyBatis Generator
     */
    private String appid;

    /**
     * 商户号，微信支付分配的商户号: REFUND_RESULT_WX.MCH_ID
     * @author MyBatis Generator
     */
    private String mchId;

    /**
     * 设备号，微信支付分配的终端设备号，与下单一致: REFUND_RESULT_WX.DEVICE_INFO
     * @author MyBatis Generator
     */
    private String deviceInfo;

    /**
     * 随机字符串，不长于32位: REFUND_RESULT_WX.NONCE_STR
     * @author MyBatis Generator
     */
    private String nonceStr;

    /**
     * 签名: REFUND_RESULT_WX.SIGN
     * @author MyBatis Generator
     */
    private String sign;

    /**
     * 微信订单号: REFUND_RESULT_WX.TRANSACTION_ID
     * @author MyBatis Generator
     */
    private String transactionId;

    /**
     * 商户订单号，商户系统内部的订单号，微信渠道支付明细id， 用于微信平台的商户订单号，商户系统内部订单号，要求32个字符内、且在同一个商户号下唯一。: REFUND_RESULT_WX.PAY_ORDER_WX_ID
     * @author MyBatis Generator
     */
    private String payOrderWxId;

    /**
     * 商户退款单号，商户系统内部的退款单号，商户系统内部唯一，同一退款单号多次请求只退一笔，对应微信接口中的out_refund_no: REFUND_RESULT_WX.PAY_REFUND_ORDER_WX_ID
     * @author MyBatis Generator
     */
    private String payRefundOrderWxId;

    /**
     * 退款渠道，ORIGINAL—原路退款
            BALANCE—退回到余额: REFUND_RESULT_WX.REFUND_CHANNEL
     * @author MyBatis Generator
     */
    private String refundChannel;

    /**
     * 退款金额，退款总金额,单位为分,可以做部分退款: REFUND_RESULT_WX.REFUND_FEE
     * @author MyBatis Generator
     */
    private Integer refundFee;

    /**
     * 去掉非充值代金券退款金额后的退款金额，退款金额=申请退款金额-非充值代金券退款金额，退款金额<=申请退款金额: REFUND_RESULT_WX.SETTLEMENT_REFUND_FEE
     * @author MyBatis Generator
     */
    private Integer settlementRefundFee;

    /**
     * 标价金额，订单总金额，单位为分，只能为整数: REFUND_RESULT_WX.TOTAL_FEE
     * @author MyBatis Generator
     */
    private Integer totalFee;

    /**
     * 应结订单金额，去掉非充值代金券金额后的订单总金额，应结订单金额=订单金额-非充值代金券金额，应结订单金额<=订单金额。: REFUND_RESULT_WX.SETTLEMENT_TOTAL_FEE
     * @author MyBatis Generator
     */
    private Integer settlementTotalFee;

    /**
     * 标价币种，订单金额货币类型，符合ISO 4217标准的三位字母代码，默认人民币：CNY: REFUND_RESULT_WX.FEE_TYPE
     * @author MyBatis Generator
     */
    private String feeType;

    /**
     * 现金支付金额，现金支付金额，单位为分，只能为整数: REFUND_RESULT_WX.CASH_FEE
     * @author MyBatis Generator
     */
    private Integer cashFee;

    /**
     * 现金支付币种，货币类型，符合ISO 4217标准的三位字母代码，默认人民币：CNY: REFUND_RESULT_WX.CASH_FEE_TYPE
     * @author MyBatis Generator
     */
    private String cashFeeType;

    /**
     * 现金退款金额，现金退款金额，单位为分，只能为整数: REFUND_RESULT_WX.CASH_REFUND_FEE
     * @author MyBatis Generator
     */
    private Integer cashRefundFee;

    /**
     * 代金券类型，CASH--充值代金券 
            NO_CASH---非充值代金券
            订单使用代金券时有返回 json格式 {{0:abc},{1:def}}: REFUND_RESULT_WX.COUPON_TYPE
     * @author MyBatis Generator
     */
    private String couponType;

    /**
     * 代金券退款总金额,代金券退款金额<=退款金额，退款金额-代金券或立减优惠退款金额为现金: REFUND_RESULT_WX.COUPON_REFUND_FEE_TOTAL
     * @author MyBatis Generator
     */
    private Integer couponRefundFeeTotal;

    /**
     * 单个代金券退款金额,代金券退款金额<=退款金额，退款金额-代金券或立减优惠退款金额为现金: REFUND_RESULT_WX.COUPON_REFUND_FEE_SINGLE
     * @author MyBatis Generator
     */
    private String couponRefundFeeSingle;

    /**
     * 退款代金券使用数量: REFUND_RESULT_WX.COUPON_REFUND_COUNT
     * @author MyBatis Generator
     */
    private Integer couponRefundCount;

    /**
     * 退款代金券ID， json格式 {{0:abc},{1:def}}: REFUND_RESULT_WX.COUPON_REFUND_ID
     * @author MyBatis Generator
     */
    private String couponRefundId;

    /**
     * 退款状态，SUCCESS—退款成功
            REFUNDCLOSE—退款关闭。
            NOTSURE—未确定，需要商户用原退款单号重新发起退款申请。
            PROCESSING—退款处理中
            CHANGE—退款异常，退款到银行发现用户的卡作废或者冻结了，导致原路退款银行卡失败，商户可以发起异常退款处理的申请，可以退款到用户的新卡或者退款商户，商户自行处理。$n为下标，从0开始编号。内部系统转换成json格式: REFUND_RESULT_WX.REFUND_STATUS
     * @author MyBatis Generator
     */
    private String refundStatus;

    /**
     * 退款资金来源，REFUND_SOURCE_RECHARGE_FUNDS---可用余额退款/基本账户
            REFUND_SOURCE_UNSETTLED_FUNDS---未结算资金退款
            $n为下标，从0开始编号。内部系统转换成json格式: REFUND_RESULT_WX.REFUND_ACCOUNT
     * @author MyBatis Generator
     */
    private String refundAccount;

    /**
     * 退款入账账户，取当前退款单的退款入账方
            1）退回银行卡：
            {银行名称}{卡类型}{卡尾号}
            2）退回支付用户零钱:
            支付用户零钱
            3）退还商户:
            商户基本账户
            商户结算银行账户，内部系统转为json格式: REFUND_RESULT_WX.REFUND_RECV_ACCOUT
     * @author MyBatis Generator
     */
    private String refundRecvAccout;

    /**
     * 退款成功时间，退款成功时间，当退款状态为退款成功时有返回。$n为下标，从0开始编号。内部系统转换为json格式: REFUND_RESULT_WX.REFUND_ACCOUT
     * @author MyBatis Generator
     */
    private String refundAccout;

    /**
     * 获取微信退款单号， 对应微信端接口的refund_id: REFUND_RESULT_WX.REFUND_RESULT_WX
     * @return 微信退款单号， 对应微信端接口的refund_id: REFUND_RESULT_WX.REFUND_RESULT_WX
     * @author MyBatis Generator
     */
    public String getRefundResultWx() {
        return refundResultWx;
    }

    /**
     * 设置微信退款单号， 对应微信端接口的refund_id: REFUND_RESULT_WX.REFUND_RESULT_WX
     * @param refundResultWx 映射数据库字段: REFUND_RESULT_WX.REFUND_RESULT_WX
     * @author MyBatis Generator
     */
    public void setRefundResultWx(String refundResultWx) {
        this.refundResultWx = refundResultWx == null ? null : refundResultWx.trim();
    }

    /**
     * 获取业务结果，SUCCESS/FAIL
            SUCCESS退款申请接收成功，结果通过退款查询接口查询
            FAIL 提交业务失败: REFUND_RESULT_WX.RESULT_CODE
     * @return 业务结果，SUCCESS/FAIL
            SUCCESS退款申请接收成功，结果通过退款查询接口查询
            FAIL 提交业务失败: REFUND_RESULT_WX.RESULT_CODE
     * @author MyBatis Generator
     */
    public String getResultCode() {
        return resultCode;
    }

    /**
     * 设置业务结果，SUCCESS/FAIL
            SUCCESS退款申请接收成功，结果通过退款查询接口查询
            FAIL 提交业务失败: REFUND_RESULT_WX.RESULT_CODE
     * @param resultCode 映射数据库字段: REFUND_RESULT_WX.RESULT_CODE
     * @author MyBatis Generator
     */
    public void setResultCode(String resultCode) {
        this.resultCode = resultCode == null ? null : resultCode.trim();
    }

    /**
     * 获取错误代码，列表详见错误码列表: REFUND_RESULT_WX.ERR_CODE
     * @return 错误代码，列表详见错误码列表: REFUND_RESULT_WX.ERR_CODE
     * @author MyBatis Generator
     */
    public String getErrCode() {
        return errCode;
    }

    /**
     * 设置错误代码，列表详见错误码列表: REFUND_RESULT_WX.ERR_CODE
     * @param errCode 映射数据库字段: REFUND_RESULT_WX.ERR_CODE
     * @author MyBatis Generator
     */
    public void setErrCode(String errCode) {
        this.errCode = errCode == null ? null : errCode.trim();
    }

    /**
     * 获取错误代码描述，结果信息描述: REFUND_RESULT_WX.ERR_CODE_DES
     * @return 错误代码描述，结果信息描述: REFUND_RESULT_WX.ERR_CODE_DES
     * @author MyBatis Generator
     */
    public String getErrCodeDes() {
        return errCodeDes;
    }

    /**
     * 设置错误代码描述，结果信息描述: REFUND_RESULT_WX.ERR_CODE_DES
     * @param errCodeDes 映射数据库字段: REFUND_RESULT_WX.ERR_CODE_DES
     * @author MyBatis Generator
     */
    public void setErrCodeDes(String errCodeDes) {
        this.errCodeDes = errCodeDes == null ? null : errCodeDes.trim();
    }

    /**
     * 获取公众账号ID，微信开放平台审核通过的应用APPID: REFUND_RESULT_WX.APPID
     * @return 公众账号ID，微信开放平台审核通过的应用APPID: REFUND_RESULT_WX.APPID
     * @author MyBatis Generator
     */
    public String getAppid() {
        return appid;
    }

    /**
     * 设置公众账号ID，微信开放平台审核通过的应用APPID: REFUND_RESULT_WX.APPID
     * @param appid 映射数据库字段: REFUND_RESULT_WX.APPID
     * @author MyBatis Generator
     */
    public void setAppid(String appid) {
        this.appid = appid == null ? null : appid.trim();
    }

    /**
     * 获取商户号，微信支付分配的商户号: REFUND_RESULT_WX.MCH_ID
     * @return 商户号，微信支付分配的商户号: REFUND_RESULT_WX.MCH_ID
     * @author MyBatis Generator
     */
    public String getMchId() {
        return mchId;
    }

    /**
     * 设置商户号，微信支付分配的商户号: REFUND_RESULT_WX.MCH_ID
     * @param mchId 映射数据库字段: REFUND_RESULT_WX.MCH_ID
     * @author MyBatis Generator
     */
    public void setMchId(String mchId) {
        this.mchId = mchId == null ? null : mchId.trim();
    }

    /**
     * 获取设备号，微信支付分配的终端设备号，与下单一致: REFUND_RESULT_WX.DEVICE_INFO
     * @return 设备号，微信支付分配的终端设备号，与下单一致: REFUND_RESULT_WX.DEVICE_INFO
     * @author MyBatis Generator
     */
    public String getDeviceInfo() {
        return deviceInfo;
    }

    /**
     * 设置设备号，微信支付分配的终端设备号，与下单一致: REFUND_RESULT_WX.DEVICE_INFO
     * @param deviceInfo 映射数据库字段: REFUND_RESULT_WX.DEVICE_INFO
     * @author MyBatis Generator
     */
    public void setDeviceInfo(String deviceInfo) {
        this.deviceInfo = deviceInfo == null ? null : deviceInfo.trim();
    }

    /**
     * 获取随机字符串，不长于32位: REFUND_RESULT_WX.NONCE_STR
     * @return 随机字符串，不长于32位: REFUND_RESULT_WX.NONCE_STR
     * @author MyBatis Generator
     */
    public String getNonceStr() {
        return nonceStr;
    }

    /**
     * 设置随机字符串，不长于32位: REFUND_RESULT_WX.NONCE_STR
     * @param nonceStr 映射数据库字段: REFUND_RESULT_WX.NONCE_STR
     * @author MyBatis Generator
     */
    public void setNonceStr(String nonceStr) {
        this.nonceStr = nonceStr == null ? null : nonceStr.trim();
    }

    /**
     * 获取签名: REFUND_RESULT_WX.SIGN
     * @return 签名: REFUND_RESULT_WX.SIGN
     * @author MyBatis Generator
     */
    public String getSign() {
        return sign;
    }

    /**
     * 设置签名: REFUND_RESULT_WX.SIGN
     * @param sign 映射数据库字段: REFUND_RESULT_WX.SIGN
     * @author MyBatis Generator
     */
    public void setSign(String sign) {
        this.sign = sign == null ? null : sign.trim();
    }

    /**
     * 获取微信订单号: REFUND_RESULT_WX.TRANSACTION_ID
     * @return 微信订单号: REFUND_RESULT_WX.TRANSACTION_ID
     * @author MyBatis Generator
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * 设置微信订单号: REFUND_RESULT_WX.TRANSACTION_ID
     * @param transactionId 映射数据库字段: REFUND_RESULT_WX.TRANSACTION_ID
     * @author MyBatis Generator
     */
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId == null ? null : transactionId.trim();
    }

    /**
     * 获取商户订单号，商户系统内部的订单号，微信渠道支付明细id， 用于微信平台的商户订单号，商户系统内部订单号，要求32个字符内、且在同一个商户号下唯一。: REFUND_RESULT_WX.PAY_ORDER_WX_ID
     * @return 商户订单号，商户系统内部的订单号，微信渠道支付明细id， 用于微信平台的商户订单号，商户系统内部订单号，要求32个字符内、且在同一个商户号下唯一。: REFUND_RESULT_WX.PAY_ORDER_WX_ID
     * @author MyBatis Generator
     */
    public String getPayOrderWxId() {
        return payOrderWxId;
    }

    /**
     * 设置商户订单号，商户系统内部的订单号，微信渠道支付明细id， 用于微信平台的商户订单号，商户系统内部订单号，要求32个字符内、且在同一个商户号下唯一。: REFUND_RESULT_WX.PAY_ORDER_WX_ID
     * @param payOrderWxId 映射数据库字段: REFUND_RESULT_WX.PAY_ORDER_WX_ID
     * @author MyBatis Generator
     */
    public void setPayOrderWxId(String payOrderWxId) {
        this.payOrderWxId = payOrderWxId == null ? null : payOrderWxId.trim();
    }

    /**
     * 获取商户退款单号，商户系统内部的退款单号，商户系统内部唯一，同一退款单号多次请求只退一笔，对应微信接口中的out_refund_no: REFUND_RESULT_WX.PAY_REFUND_ORDER_WX_ID
     * @return 商户退款单号，商户系统内部的退款单号，商户系统内部唯一，同一退款单号多次请求只退一笔，对应微信接口中的out_refund_no: REFUND_RESULT_WX.PAY_REFUND_ORDER_WX_ID
     * @author MyBatis Generator
     */
    public String getPayRefundOrderWxId() {
        return payRefundOrderWxId;
    }

    /**
     * 设置商户退款单号，商户系统内部的退款单号，商户系统内部唯一，同一退款单号多次请求只退一笔，对应微信接口中的out_refund_no: REFUND_RESULT_WX.PAY_REFUND_ORDER_WX_ID
     * @param payRefundOrderWxId 映射数据库字段: REFUND_RESULT_WX.PAY_REFUND_ORDER_WX_ID
     * @author MyBatis Generator
     */
    public void setPayRefundOrderWxId(String payRefundOrderWxId) {
        this.payRefundOrderWxId = payRefundOrderWxId == null ? null : payRefundOrderWxId.trim();
    }

    /**
     * 获取退款渠道，ORIGINAL—原路退款
            BALANCE—退回到余额: REFUND_RESULT_WX.REFUND_CHANNEL
     * @return 退款渠道，ORIGINAL—原路退款
            BALANCE—退回到余额: REFUND_RESULT_WX.REFUND_CHANNEL
     * @author MyBatis Generator
     */
    public String getRefundChannel() {
        return refundChannel;
    }

    /**
     * 设置退款渠道，ORIGINAL—原路退款
            BALANCE—退回到余额: REFUND_RESULT_WX.REFUND_CHANNEL
     * @param refundChannel 映射数据库字段: REFUND_RESULT_WX.REFUND_CHANNEL
     * @author MyBatis Generator
     */
    public void setRefundChannel(String refundChannel) {
        this.refundChannel = refundChannel == null ? null : refundChannel.trim();
    }

    /**
     * 获取退款金额，退款总金额,单位为分,可以做部分退款: REFUND_RESULT_WX.REFUND_FEE
     * @return 退款金额，退款总金额,单位为分,可以做部分退款: REFUND_RESULT_WX.REFUND_FEE
     * @author MyBatis Generator
     */
    public Integer getRefundFee() {
        return refundFee;
    }

    /**
     * 设置退款金额，退款总金额,单位为分,可以做部分退款: REFUND_RESULT_WX.REFUND_FEE
     * @param refundFee 映射数据库字段: REFUND_RESULT_WX.REFUND_FEE
     * @author MyBatis Generator
     */
    public void setRefundFee(Integer refundFee) {
        this.refundFee = refundFee;
    }

    /**
     * 获取去掉非充值代金券退款金额后的退款金额，退款金额=申请退款金额-非充值代金券退款金额，退款金额<=申请退款金额: REFUND_RESULT_WX.SETTLEMENT_REFUND_FEE
     * @return 去掉非充值代金券退款金额后的退款金额，退款金额=申请退款金额-非充值代金券退款金额，退款金额<=申请退款金额: REFUND_RESULT_WX.SETTLEMENT_REFUND_FEE
     * @author MyBatis Generator
     */
    public Integer getSettlementRefundFee() {
        return settlementRefundFee;
    }

    /**
     * 设置去掉非充值代金券退款金额后的退款金额，退款金额=申请退款金额-非充值代金券退款金额，退款金额<=申请退款金额: REFUND_RESULT_WX.SETTLEMENT_REFUND_FEE
     * @param settlementRefundFee 映射数据库字段: REFUND_RESULT_WX.SETTLEMENT_REFUND_FEE
     * @author MyBatis Generator
     */
    public void setSettlementRefundFee(Integer settlementRefundFee) {
        this.settlementRefundFee = settlementRefundFee;
    }

    /**
     * 获取标价金额，订单总金额，单位为分，只能为整数: REFUND_RESULT_WX.TOTAL_FEE
     * @return 标价金额，订单总金额，单位为分，只能为整数: REFUND_RESULT_WX.TOTAL_FEE
     * @author MyBatis Generator
     */
    public Integer getTotalFee() {
        return totalFee;
    }

    /**
     * 设置标价金额，订单总金额，单位为分，只能为整数: REFUND_RESULT_WX.TOTAL_FEE
     * @param totalFee 映射数据库字段: REFUND_RESULT_WX.TOTAL_FEE
     * @author MyBatis Generator
     */
    public void setTotalFee(Integer totalFee) {
        this.totalFee = totalFee;
    }

    /**
     * 获取应结订单金额，去掉非充值代金券金额后的订单总金额，应结订单金额=订单金额-非充值代金券金额，应结订单金额<=订单金额。: REFUND_RESULT_WX.SETTLEMENT_TOTAL_FEE
     * @return 应结订单金额，去掉非充值代金券金额后的订单总金额，应结订单金额=订单金额-非充值代金券金额，应结订单金额<=订单金额。: REFUND_RESULT_WX.SETTLEMENT_TOTAL_FEE
     * @author MyBatis Generator
     */
    public Integer getSettlementTotalFee() {
        return settlementTotalFee;
    }

    /**
     * 设置应结订单金额，去掉非充值代金券金额后的订单总金额，应结订单金额=订单金额-非充值代金券金额，应结订单金额<=订单金额。: REFUND_RESULT_WX.SETTLEMENT_TOTAL_FEE
     * @param settlementTotalFee 映射数据库字段: REFUND_RESULT_WX.SETTLEMENT_TOTAL_FEE
     * @author MyBatis Generator
     */
    public void setSettlementTotalFee(Integer settlementTotalFee) {
        this.settlementTotalFee = settlementTotalFee;
    }

    /**
     * 获取标价币种，订单金额货币类型，符合ISO 4217标准的三位字母代码，默认人民币：CNY: REFUND_RESULT_WX.FEE_TYPE
     * @return 标价币种，订单金额货币类型，符合ISO 4217标准的三位字母代码，默认人民币：CNY: REFUND_RESULT_WX.FEE_TYPE
     * @author MyBatis Generator
     */
    public String getFeeType() {
        return feeType;
    }

    /**
     * 设置标价币种，订单金额货币类型，符合ISO 4217标准的三位字母代码，默认人民币：CNY: REFUND_RESULT_WX.FEE_TYPE
     * @param feeType 映射数据库字段: REFUND_RESULT_WX.FEE_TYPE
     * @author MyBatis Generator
     */
    public void setFeeType(String feeType) {
        this.feeType = feeType == null ? null : feeType.trim();
    }

    /**
     * 获取现金支付金额，现金支付金额，单位为分，只能为整数: REFUND_RESULT_WX.CASH_FEE
     * @return 现金支付金额，现金支付金额，单位为分，只能为整数: REFUND_RESULT_WX.CASH_FEE
     * @author MyBatis Generator
     */
    public Integer getCashFee() {
        return cashFee;
    }

    /**
     * 设置现金支付金额，现金支付金额，单位为分，只能为整数: REFUND_RESULT_WX.CASH_FEE
     * @param cashFee 映射数据库字段: REFUND_RESULT_WX.CASH_FEE
     * @author MyBatis Generator
     */
    public void setCashFee(Integer cashFee) {
        this.cashFee = cashFee;
    }

    /**
     * 获取现金支付币种，货币类型，符合ISO 4217标准的三位字母代码，默认人民币：CNY: REFUND_RESULT_WX.CASH_FEE_TYPE
     * @return 现金支付币种，货币类型，符合ISO 4217标准的三位字母代码，默认人民币：CNY: REFUND_RESULT_WX.CASH_FEE_TYPE
     * @author MyBatis Generator
     */
    public String getCashFeeType() {
        return cashFeeType;
    }

    /**
     * 设置现金支付币种，货币类型，符合ISO 4217标准的三位字母代码，默认人民币：CNY: REFUND_RESULT_WX.CASH_FEE_TYPE
     * @param cashFeeType 映射数据库字段: REFUND_RESULT_WX.CASH_FEE_TYPE
     * @author MyBatis Generator
     */
    public void setCashFeeType(String cashFeeType) {
        this.cashFeeType = cashFeeType == null ? null : cashFeeType.trim();
    }

    /**
     * 获取现金退款金额，现金退款金额，单位为分，只能为整数: REFUND_RESULT_WX.CASH_REFUND_FEE
     * @return 现金退款金额，现金退款金额，单位为分，只能为整数: REFUND_RESULT_WX.CASH_REFUND_FEE
     * @author MyBatis Generator
     */
    public Integer getCashRefundFee() {
        return cashRefundFee;
    }

    /**
     * 设置现金退款金额，现金退款金额，单位为分，只能为整数: REFUND_RESULT_WX.CASH_REFUND_FEE
     * @param cashRefundFee 映射数据库字段: REFUND_RESULT_WX.CASH_REFUND_FEE
     * @author MyBatis Generator
     */
    public void setCashRefundFee(Integer cashRefundFee) {
        this.cashRefundFee = cashRefundFee;
    }

    /**
     * 获取代金券类型，CASH--充值代金券 
            NO_CASH---非充值代金券
            订单使用代金券时有返回 json格式 {{0:abc},{1:def}}: REFUND_RESULT_WX.COUPON_TYPE
     * @return 代金券类型，CASH--充值代金券 
            NO_CASH---非充值代金券
            订单使用代金券时有返回 json格式 {{0:abc},{1:def}}: REFUND_RESULT_WX.COUPON_TYPE
     * @author MyBatis Generator
     */
    public String getCouponType() {
        return couponType;
    }

    /**
     * 设置代金券类型，CASH--充值代金券 
            NO_CASH---非充值代金券
            订单使用代金券时有返回 json格式 {{0:abc},{1:def}}: REFUND_RESULT_WX.COUPON_TYPE
     * @param couponType 映射数据库字段: REFUND_RESULT_WX.COUPON_TYPE
     * @author MyBatis Generator
     */
    public void setCouponType(String couponType) {
        this.couponType = couponType == null ? null : couponType.trim();
    }

    /**
     * 获取代金券退款总金额,代金券退款金额<=退款金额，退款金额-代金券或立减优惠退款金额为现金: REFUND_RESULT_WX.COUPON_REFUND_FEE_TOTAL
     * @return 代金券退款总金额,代金券退款金额<=退款金额，退款金额-代金券或立减优惠退款金额为现金: REFUND_RESULT_WX.COUPON_REFUND_FEE_TOTAL
     * @author MyBatis Generator
     */
    public Integer getCouponRefundFeeTotal() {
        return couponRefundFeeTotal;
    }

    /**
     * 设置代金券退款总金额,代金券退款金额<=退款金额，退款金额-代金券或立减优惠退款金额为现金: REFUND_RESULT_WX.COUPON_REFUND_FEE_TOTAL
     * @param couponRefundFeeTotal 映射数据库字段: REFUND_RESULT_WX.COUPON_REFUND_FEE_TOTAL
     * @author MyBatis Generator
     */
    public void setCouponRefundFeeTotal(Integer couponRefundFeeTotal) {
        this.couponRefundFeeTotal = couponRefundFeeTotal;
    }

    /**
     * 获取单个代金券退款金额,代金券退款金额<=退款金额，退款金额-代金券或立减优惠退款金额为现金: REFUND_RESULT_WX.COUPON_REFUND_FEE_SINGLE
     * @return 单个代金券退款金额,代金券退款金额<=退款金额，退款金额-代金券或立减优惠退款金额为现金: REFUND_RESULT_WX.COUPON_REFUND_FEE_SINGLE
     * @author MyBatis Generator
     */
    public String getCouponRefundFeeSingle() {
        return couponRefundFeeSingle;
    }

    /**
     * 设置单个代金券退款金额,代金券退款金额<=退款金额，退款金额-代金券或立减优惠退款金额为现金: REFUND_RESULT_WX.COUPON_REFUND_FEE_SINGLE
     * @param couponRefundFeeSingle 映射数据库字段: REFUND_RESULT_WX.COUPON_REFUND_FEE_SINGLE
     * @author MyBatis Generator
     */
    public void setCouponRefundFeeSingle(String couponRefundFeeSingle) {
        this.couponRefundFeeSingle = couponRefundFeeSingle == null ? null : couponRefundFeeSingle.trim();
    }

    /**
     * 获取退款代金券使用数量: REFUND_RESULT_WX.COUPON_REFUND_COUNT
     * @return 退款代金券使用数量: REFUND_RESULT_WX.COUPON_REFUND_COUNT
     * @author MyBatis Generator
     */
    public Integer getCouponRefundCount() {
        return couponRefundCount;
    }

    /**
     * 设置退款代金券使用数量: REFUND_RESULT_WX.COUPON_REFUND_COUNT
     * @param couponRefundCount 映射数据库字段: REFUND_RESULT_WX.COUPON_REFUND_COUNT
     * @author MyBatis Generator
     */
    public void setCouponRefundCount(Integer couponRefundCount) {
        this.couponRefundCount = couponRefundCount;
    }

    /**
     * 获取退款代金券ID， json格式 {{0:abc},{1:def}}: REFUND_RESULT_WX.COUPON_REFUND_ID
     * @return 退款代金券ID， json格式 {{0:abc},{1:def}}: REFUND_RESULT_WX.COUPON_REFUND_ID
     * @author MyBatis Generator
     */
    public String getCouponRefundId() {
        return couponRefundId;
    }

    /**
     * 设置退款代金券ID， json格式 {{0:abc},{1:def}}: REFUND_RESULT_WX.COUPON_REFUND_ID
     * @param couponRefundId 映射数据库字段: REFUND_RESULT_WX.COUPON_REFUND_ID
     * @author MyBatis Generator
     */
    public void setCouponRefundId(String couponRefundId) {
        this.couponRefundId = couponRefundId == null ? null : couponRefundId.trim();
    }

    /**
     * 获取退款状态，SUCCESS—退款成功
            REFUNDCLOSE—退款关闭。
            NOTSURE—未确定，需要商户用原退款单号重新发起退款申请。
            PROCESSING—退款处理中
            CHANGE—退款异常，退款到银行发现用户的卡作废或者冻结了，导致原路退款银行卡失败，商户可以发起异常退款处理的申请，可以退款到用户的新卡或者退款商户，商户自行处理。$n为下标，从0开始编号。内部系统转换成json格式: REFUND_RESULT_WX.REFUND_STATUS
     * @return 退款状态，SUCCESS—退款成功
            REFUNDCLOSE—退款关闭。
            NOTSURE—未确定，需要商户用原退款单号重新发起退款申请。
            PROCESSING—退款处理中
            CHANGE—退款异常，退款到银行发现用户的卡作废或者冻结了，导致原路退款银行卡失败，商户可以发起异常退款处理的申请，可以退款到用户的新卡或者退款商户，商户自行处理。$n为下标，从0开始编号。内部系统转换成json格式: REFUND_RESULT_WX.REFUND_STATUS
     * @author MyBatis Generator
     */
    public String getRefundStatus() {
        return refundStatus;
    }

    /**
     * 设置退款状态，SUCCESS—退款成功
            REFUNDCLOSE—退款关闭。
            NOTSURE—未确定，需要商户用原退款单号重新发起退款申请。
            PROCESSING—退款处理中
            CHANGE—退款异常，退款到银行发现用户的卡作废或者冻结了，导致原路退款银行卡失败，商户可以发起异常退款处理的申请，可以退款到用户的新卡或者退款商户，商户自行处理。$n为下标，从0开始编号。内部系统转换成json格式: REFUND_RESULT_WX.REFUND_STATUS
     * @param refundStatus 映射数据库字段: REFUND_RESULT_WX.REFUND_STATUS
     * @author MyBatis Generator
     */
    public void setRefundStatus(String refundStatus) {
        this.refundStatus = refundStatus == null ? null : refundStatus.trim();
    }

    /**
     * 获取退款资金来源，REFUND_SOURCE_RECHARGE_FUNDS---可用余额退款/基本账户
            REFUND_SOURCE_UNSETTLED_FUNDS---未结算资金退款
            $n为下标，从0开始编号。内部系统转换成json格式: REFUND_RESULT_WX.REFUND_ACCOUNT
     * @return 退款资金来源，REFUND_SOURCE_RECHARGE_FUNDS---可用余额退款/基本账户
            REFUND_SOURCE_UNSETTLED_FUNDS---未结算资金退款
            $n为下标，从0开始编号。内部系统转换成json格式: REFUND_RESULT_WX.REFUND_ACCOUNT
     * @author MyBatis Generator
     */
    public String getRefundAccount() {
        return refundAccount;
    }

    /**
     * 设置退款资金来源，REFUND_SOURCE_RECHARGE_FUNDS---可用余额退款/基本账户
            REFUND_SOURCE_UNSETTLED_FUNDS---未结算资金退款
            $n为下标，从0开始编号。内部系统转换成json格式: REFUND_RESULT_WX.REFUND_ACCOUNT
     * @param refundAccount 映射数据库字段: REFUND_RESULT_WX.REFUND_ACCOUNT
     * @author MyBatis Generator
     */
    public void setRefundAccount(String refundAccount) {
        this.refundAccount = refundAccount == null ? null : refundAccount.trim();
    }

    /**
     * 获取退款入账账户，取当前退款单的退款入账方
            1）退回银行卡：
            {银行名称}{卡类型}{卡尾号}
            2）退回支付用户零钱:
            支付用户零钱
            3）退还商户:
            商户基本账户
            商户结算银行账户，内部系统转为json格式: REFUND_RESULT_WX.REFUND_RECV_ACCOUT
     * @return 退款入账账户，取当前退款单的退款入账方
            1）退回银行卡：
            {银行名称}{卡类型}{卡尾号}
            2）退回支付用户零钱:
            支付用户零钱
            3）退还商户:
            商户基本账户
            商户结算银行账户，内部系统转为json格式: REFUND_RESULT_WX.REFUND_RECV_ACCOUT
     * @author MyBatis Generator
     */
    public String getRefundRecvAccout() {
        return refundRecvAccout;
    }

    /**
     * 设置退款入账账户，取当前退款单的退款入账方
            1）退回银行卡：
            {银行名称}{卡类型}{卡尾号}
            2）退回支付用户零钱:
            支付用户零钱
            3）退还商户:
            商户基本账户
            商户结算银行账户，内部系统转为json格式: REFUND_RESULT_WX.REFUND_RECV_ACCOUT
     * @param refundRecvAccout 映射数据库字段: REFUND_RESULT_WX.REFUND_RECV_ACCOUT
     * @author MyBatis Generator
     */
    public void setRefundRecvAccout(String refundRecvAccout) {
        this.refundRecvAccout = refundRecvAccout == null ? null : refundRecvAccout.trim();
    }

    /**
     * 获取退款成功时间，退款成功时间，当退款状态为退款成功时有返回。$n为下标，从0开始编号。内部系统转换为json格式: REFUND_RESULT_WX.REFUND_ACCOUT
     * @return 退款成功时间，退款成功时间，当退款状态为退款成功时有返回。$n为下标，从0开始编号。内部系统转换为json格式: REFUND_RESULT_WX.REFUND_ACCOUT
     * @author MyBatis Generator
     */
    public String getRefundAccout() {
        return refundAccout;
    }

    /**
     * 设置退款成功时间，退款成功时间，当退款状态为退款成功时有返回。$n为下标，从0开始编号。内部系统转换为json格式: REFUND_RESULT_WX.REFUND_ACCOUT
     * @param refundAccout 映射数据库字段: REFUND_RESULT_WX.REFUND_ACCOUT
     * @author MyBatis Generator
     */
    public void setRefundAccout(String refundAccout) {
        this.refundAccout = refundAccout == null ? null : refundAccout.trim();
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: REFUND_RESULT_WX
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
        RefundResultWx other = (RefundResultWx) that;
        return (this.getRefundResultWx() == null ? other.getRefundResultWx() == null : this.getRefundResultWx().equals(other.getRefundResultWx()))
            && (this.getResultCode() == null ? other.getResultCode() == null : this.getResultCode().equals(other.getResultCode()))
            && (this.getErrCode() == null ? other.getErrCode() == null : this.getErrCode().equals(other.getErrCode()))
            && (this.getErrCodeDes() == null ? other.getErrCodeDes() == null : this.getErrCodeDes().equals(other.getErrCodeDes()))
            && (this.getAppid() == null ? other.getAppid() == null : this.getAppid().equals(other.getAppid()))
            && (this.getMchId() == null ? other.getMchId() == null : this.getMchId().equals(other.getMchId()))
            && (this.getDeviceInfo() == null ? other.getDeviceInfo() == null : this.getDeviceInfo().equals(other.getDeviceInfo()))
            && (this.getNonceStr() == null ? other.getNonceStr() == null : this.getNonceStr().equals(other.getNonceStr()))
            && (this.getSign() == null ? other.getSign() == null : this.getSign().equals(other.getSign()))
            && (this.getTransactionId() == null ? other.getTransactionId() == null : this.getTransactionId().equals(other.getTransactionId()))
            && (this.getPayOrderWxId() == null ? other.getPayOrderWxId() == null : this.getPayOrderWxId().equals(other.getPayOrderWxId()))
            && (this.getPayRefundOrderWxId() == null ? other.getPayRefundOrderWxId() == null : this.getPayRefundOrderWxId().equals(other.getPayRefundOrderWxId()))
            && (this.getRefundChannel() == null ? other.getRefundChannel() == null : this.getRefundChannel().equals(other.getRefundChannel()))
            && (this.getRefundFee() == null ? other.getRefundFee() == null : this.getRefundFee().equals(other.getRefundFee()))
            && (this.getSettlementRefundFee() == null ? other.getSettlementRefundFee() == null : this.getSettlementRefundFee().equals(other.getSettlementRefundFee()))
            && (this.getTotalFee() == null ? other.getTotalFee() == null : this.getTotalFee().equals(other.getTotalFee()))
            && (this.getSettlementTotalFee() == null ? other.getSettlementTotalFee() == null : this.getSettlementTotalFee().equals(other.getSettlementTotalFee()))
            && (this.getFeeType() == null ? other.getFeeType() == null : this.getFeeType().equals(other.getFeeType()))
            && (this.getCashFee() == null ? other.getCashFee() == null : this.getCashFee().equals(other.getCashFee()))
            && (this.getCashFeeType() == null ? other.getCashFeeType() == null : this.getCashFeeType().equals(other.getCashFeeType()))
            && (this.getCashRefundFee() == null ? other.getCashRefundFee() == null : this.getCashRefundFee().equals(other.getCashRefundFee()))
            && (this.getCouponType() == null ? other.getCouponType() == null : this.getCouponType().equals(other.getCouponType()))
            && (this.getCouponRefundFeeTotal() == null ? other.getCouponRefundFeeTotal() == null : this.getCouponRefundFeeTotal().equals(other.getCouponRefundFeeTotal()))
            && (this.getCouponRefundFeeSingle() == null ? other.getCouponRefundFeeSingle() == null : this.getCouponRefundFeeSingle().equals(other.getCouponRefundFeeSingle()))
            && (this.getCouponRefundCount() == null ? other.getCouponRefundCount() == null : this.getCouponRefundCount().equals(other.getCouponRefundCount()))
            && (this.getCouponRefundId() == null ? other.getCouponRefundId() == null : this.getCouponRefundId().equals(other.getCouponRefundId()))
            && (this.getRefundStatus() == null ? other.getRefundStatus() == null : this.getRefundStatus().equals(other.getRefundStatus()))
            && (this.getRefundAccount() == null ? other.getRefundAccount() == null : this.getRefundAccount().equals(other.getRefundAccount()))
            && (this.getRefundRecvAccout() == null ? other.getRefundRecvAccout() == null : this.getRefundRecvAccout().equals(other.getRefundRecvAccout()))
            && (this.getRefundAccout() == null ? other.getRefundAccout() == null : this.getRefundAccout().equals(other.getRefundAccout()));
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: REFUND_RESULT_WX
     * @author MyBatis Generator
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRefundResultWx() == null) ? 0 : getRefundResultWx().hashCode());
        result = prime * result + ((getResultCode() == null) ? 0 : getResultCode().hashCode());
        result = prime * result + ((getErrCode() == null) ? 0 : getErrCode().hashCode());
        result = prime * result + ((getErrCodeDes() == null) ? 0 : getErrCodeDes().hashCode());
        result = prime * result + ((getAppid() == null) ? 0 : getAppid().hashCode());
        result = prime * result + ((getMchId() == null) ? 0 : getMchId().hashCode());
        result = prime * result + ((getDeviceInfo() == null) ? 0 : getDeviceInfo().hashCode());
        result = prime * result + ((getNonceStr() == null) ? 0 : getNonceStr().hashCode());
        result = prime * result + ((getSign() == null) ? 0 : getSign().hashCode());
        result = prime * result + ((getTransactionId() == null) ? 0 : getTransactionId().hashCode());
        result = prime * result + ((getPayOrderWxId() == null) ? 0 : getPayOrderWxId().hashCode());
        result = prime * result + ((getPayRefundOrderWxId() == null) ? 0 : getPayRefundOrderWxId().hashCode());
        result = prime * result + ((getRefundChannel() == null) ? 0 : getRefundChannel().hashCode());
        result = prime * result + ((getRefundFee() == null) ? 0 : getRefundFee().hashCode());
        result = prime * result + ((getSettlementRefundFee() == null) ? 0 : getSettlementRefundFee().hashCode());
        result = prime * result + ((getTotalFee() == null) ? 0 : getTotalFee().hashCode());
        result = prime * result + ((getSettlementTotalFee() == null) ? 0 : getSettlementTotalFee().hashCode());
        result = prime * result + ((getFeeType() == null) ? 0 : getFeeType().hashCode());
        result = prime * result + ((getCashFee() == null) ? 0 : getCashFee().hashCode());
        result = prime * result + ((getCashFeeType() == null) ? 0 : getCashFeeType().hashCode());
        result = prime * result + ((getCashRefundFee() == null) ? 0 : getCashRefundFee().hashCode());
        result = prime * result + ((getCouponType() == null) ? 0 : getCouponType().hashCode());
        result = prime * result + ((getCouponRefundFeeTotal() == null) ? 0 : getCouponRefundFeeTotal().hashCode());
        result = prime * result + ((getCouponRefundFeeSingle() == null) ? 0 : getCouponRefundFeeSingle().hashCode());
        result = prime * result + ((getCouponRefundCount() == null) ? 0 : getCouponRefundCount().hashCode());
        result = prime * result + ((getCouponRefundId() == null) ? 0 : getCouponRefundId().hashCode());
        result = prime * result + ((getRefundStatus() == null) ? 0 : getRefundStatus().hashCode());
        result = prime * result + ((getRefundAccount() == null) ? 0 : getRefundAccount().hashCode());
        result = prime * result + ((getRefundRecvAccout() == null) ? 0 : getRefundRecvAccout().hashCode());
        result = prime * result + ((getRefundAccout() == null) ? 0 : getRefundAccout().hashCode());
        return result;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: REFUND_RESULT_WX
     * @author MyBatis Generator
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append(", refundResultWx=").append(refundResultWx);
        sb.append(", resultCode=").append(resultCode);
        sb.append(", errCode=").append(errCode);
        sb.append(", errCodeDes=").append(errCodeDes);
        sb.append(", appid=").append(appid);
        sb.append(", mchId=").append(mchId);
        sb.append(", deviceInfo=").append(deviceInfo);
        sb.append(", nonceStr=").append(nonceStr);
        sb.append(", sign=").append(sign);
        sb.append(", transactionId=").append(transactionId);
        sb.append(", payOrderWxId=").append(payOrderWxId);
        sb.append(", payRefundOrderWxId=").append(payRefundOrderWxId);
        sb.append(", refundChannel=").append(refundChannel);
        sb.append(", refundFee=").append(refundFee);
        sb.append(", settlementRefundFee=").append(settlementRefundFee);
        sb.append(", totalFee=").append(totalFee);
        sb.append(", settlementTotalFee=").append(settlementTotalFee);
        sb.append(", feeType=").append(feeType);
        sb.append(", cashFee=").append(cashFee);
        sb.append(", cashFeeType=").append(cashFeeType);
        sb.append(", cashRefundFee=").append(cashRefundFee);
        sb.append(", couponType=").append(couponType);
        sb.append(", couponRefundFeeTotal=").append(couponRefundFeeTotal);
        sb.append(", couponRefundFeeSingle=").append(couponRefundFeeSingle);
        sb.append(", couponRefundCount=").append(couponRefundCount);
        sb.append(", couponRefundId=").append(couponRefundId);
        sb.append(", refundStatus=").append(refundStatus);
        sb.append(", refundAccount=").append(refundAccount);
        sb.append(", refundRecvAccout=").append(refundRecvAccout);
        sb.append(", refundAccout=").append(refundAccout);
        sb.append("]");
        return sb.toString();
    }
}