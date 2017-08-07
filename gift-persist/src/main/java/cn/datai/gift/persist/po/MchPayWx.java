package cn.datai.gift.persist.po;

import java.io.Serializable;

public class MchPayWx implements Serializable {
    public static final long serialVersionUID = -1563687296L;

    /**
     * 商户订单号，需保持唯一性
            (只能是字母或者数字，不能包含有符号): mch_pay_wx.PARTNER_TRADE_NO
     * @author MyBatis Generator
     */
    private String partnerTradeNo;

    /**
     * 公众账号appid，微信分配的公众账号ID（企业号corpid即为此appId）: mch_pay_wx.MCH_APPID
     * @author MyBatis Generator
     */
    private String mchAppid;

    /**
     * 商户号，微信支付分配的商户号: mch_pay_wx.MCHID
     * @author MyBatis Generator
     */
    private String mchid;

    /**
     * 设备号，微信支付分配的终端设备号: mch_pay_wx.DEVICE_INFO
     * @author MyBatis Generator
     */
    private String deviceInfo;

    /**
     * 签名，详见 https://pay.weixin.qq.com/wiki/doc/api/tools/mch_pay.php?chapter=4_3: mch_pay_wx.SIGN
     * @author MyBatis Generator
     */
    private String sign;

    /**
     * 用户openid，商户appid下，某用户的openid: mch_pay_wx.OPENID
     * @author MyBatis Generator
     */
    private String openid;

    /**
     * 校验用户姓名选项，NO_CHECK：不校验真实姓名
            FORCE_CHECK：强校验真实姓名（未实名认证的用户会校验失败，无法转账）
            OPTION_CHECK：针对已实名认证的用户才校验真实姓名（未实名认证用户不校验，可以转账成功）: mch_pay_wx.CHECK_NAME
     * @author MyBatis Generator
     */
    private String checkName;

    /**
     * 收款用户姓名，收款用户真实姓名。
            如果check_name设置为FORCE_CHECK或OPTION_CHECK，则必填用户真实姓名: mch_pay_wx.RE_USER_NAME
     * @author MyBatis Generator
     */
    private String reUserName;

    /**
     * 金额，企业付款金额，单位为分: mch_pay_wx.AMOUNT
     * @author MyBatis Generator
     */
    private Integer amount;

    /**
     * 企业付款描述信息: mch_pay_wx.REMARK
     * @author MyBatis Generator
     */
    private String remark;

    /**
     * Ip地址，调用接口的机器Ip地址: mch_pay_wx.SPBILL_CREATE_IP
     * @author MyBatis Generator
     */
    private String spbillCreateIp;

    /**
     * 返回状态码，SUCCESS/FAIL
            此字段是通信标识，非交易标识，交易是否成功需要查看result_code来判断: mch_pay_wx.RETURN_CODE
     * @author MyBatis Generator
     */
    private String returnCode;

    /**
     * 返回信息，如非空，为错误原因
            签名失败
            参数格式校验错误: mch_pay_wx.RETURN_MSG
     * @author MyBatis Generator
     */
    private String returnMsg;

    /**
     * 业务结果，SUCCESS/FAIL: mch_pay_wx.RESULT_CODE
     * @author MyBatis Generator
     */
    private String resultCode;

    /**
     * 错误代码，错误码信息: mch_pay_wx.ERR_CODE
     * @author MyBatis Generator
     */
    private String errCode;

    /**
     * 错误代码描述，结果信息描述: mch_pay_wx.ERR_CODE_DES
     * @author MyBatis Generator
     */
    private String errCodeDes;

    /**
     * 微信订单号，企业付款成功，返回的微信订单号: mch_pay_wx.PAYMENT_NO
     * @author MyBatis Generator
     */
    private String paymentNo;

    /**
     * 微信支付成功时间，企业付款成功时间，示例 2015-05-19 15：26：59: mch_pay_wx.PAYMENT_TIME
     * @author MyBatis Generator
     */
    private String paymentTime;

    /**
     * 获取商户订单号，需保持唯一性
            (只能是字母或者数字，不能包含有符号): mch_pay_wx.PARTNER_TRADE_NO
     * @return 商户订单号，需保持唯一性
            (只能是字母或者数字，不能包含有符号): mch_pay_wx.PARTNER_TRADE_NO
     * @author MyBatis Generator
     */
    public String getPartnerTradeNo() {
        return partnerTradeNo;
    }

    /**
     * 设置商户订单号，需保持唯一性
            (只能是字母或者数字，不能包含有符号): mch_pay_wx.PARTNER_TRADE_NO
     * @param partnerTradeNo 映射数据库字段: mch_pay_wx.PARTNER_TRADE_NO
     * @author MyBatis Generator
     */
    public void setPartnerTradeNo(String partnerTradeNo) {
        this.partnerTradeNo = partnerTradeNo == null ? null : partnerTradeNo.trim();
    }

    /**
     * 获取公众账号appid，微信分配的公众账号ID（企业号corpid即为此appId）: mch_pay_wx.MCH_APPID
     * @return 公众账号appid，微信分配的公众账号ID（企业号corpid即为此appId）: mch_pay_wx.MCH_APPID
     * @author MyBatis Generator
     */
    public String getMchAppid() {
        return mchAppid;
    }

    /**
     * 设置公众账号appid，微信分配的公众账号ID（企业号corpid即为此appId）: mch_pay_wx.MCH_APPID
     * @param mchAppid 映射数据库字段: mch_pay_wx.MCH_APPID
     * @author MyBatis Generator
     */
    public void setMchAppid(String mchAppid) {
        this.mchAppid = mchAppid == null ? null : mchAppid.trim();
    }

    /**
     * 获取商户号，微信支付分配的商户号: mch_pay_wx.MCHID
     * @return 商户号，微信支付分配的商户号: mch_pay_wx.MCHID
     * @author MyBatis Generator
     */
    public String getMchid() {
        return mchid;
    }

    /**
     * 设置商户号，微信支付分配的商户号: mch_pay_wx.MCHID
     * @param mchid 映射数据库字段: mch_pay_wx.MCHID
     * @author MyBatis Generator
     */
    public void setMchid(String mchid) {
        this.mchid = mchid == null ? null : mchid.trim();
    }

    /**
     * 获取设备号，微信支付分配的终端设备号: mch_pay_wx.DEVICE_INFO
     * @return 设备号，微信支付分配的终端设备号: mch_pay_wx.DEVICE_INFO
     * @author MyBatis Generator
     */
    public String getDeviceInfo() {
        return deviceInfo;
    }

    /**
     * 设置设备号，微信支付分配的终端设备号: mch_pay_wx.DEVICE_INFO
     * @param deviceInfo 映射数据库字段: mch_pay_wx.DEVICE_INFO
     * @author MyBatis Generator
     */
    public void setDeviceInfo(String deviceInfo) {
        this.deviceInfo = deviceInfo == null ? null : deviceInfo.trim();
    }

    /**
     * 获取签名，详见 https://pay.weixin.qq.com/wiki/doc/api/tools/mch_pay.php?chapter=4_3: mch_pay_wx.SIGN
     * @return 签名，详见 https://pay.weixin.qq.com/wiki/doc/api/tools/mch_pay.php?chapter=4_3: mch_pay_wx.SIGN
     * @author MyBatis Generator
     */
    public String getSign() {
        return sign;
    }

    /**
     * 设置签名，详见 https://pay.weixin.qq.com/wiki/doc/api/tools/mch_pay.php?chapter=4_3: mch_pay_wx.SIGN
     * @param sign 映射数据库字段: mch_pay_wx.SIGN
     * @author MyBatis Generator
     */
    public void setSign(String sign) {
        this.sign = sign == null ? null : sign.trim();
    }

    /**
     * 获取用户openid，商户appid下，某用户的openid: mch_pay_wx.OPENID
     * @return 用户openid，商户appid下，某用户的openid: mch_pay_wx.OPENID
     * @author MyBatis Generator
     */
    public String getOpenid() {
        return openid;
    }

    /**
     * 设置用户openid，商户appid下，某用户的openid: mch_pay_wx.OPENID
     * @param openid 映射数据库字段: mch_pay_wx.OPENID
     * @author MyBatis Generator
     */
    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    /**
     * 获取校验用户姓名选项，NO_CHECK：不校验真实姓名
            FORCE_CHECK：强校验真实姓名（未实名认证的用户会校验失败，无法转账）
            OPTION_CHECK：针对已实名认证的用户才校验真实姓名（未实名认证用户不校验，可以转账成功）: mch_pay_wx.CHECK_NAME
     * @return 校验用户姓名选项，NO_CHECK：不校验真实姓名
            FORCE_CHECK：强校验真实姓名（未实名认证的用户会校验失败，无法转账）
            OPTION_CHECK：针对已实名认证的用户才校验真实姓名（未实名认证用户不校验，可以转账成功）: mch_pay_wx.CHECK_NAME
     * @author MyBatis Generator
     */
    public String getCheckName() {
        return checkName;
    }

    /**
     * 设置校验用户姓名选项，NO_CHECK：不校验真实姓名
            FORCE_CHECK：强校验真实姓名（未实名认证的用户会校验失败，无法转账）
            OPTION_CHECK：针对已实名认证的用户才校验真实姓名（未实名认证用户不校验，可以转账成功）: mch_pay_wx.CHECK_NAME
     * @param checkName 映射数据库字段: mch_pay_wx.CHECK_NAME
     * @author MyBatis Generator
     */
    public void setCheckName(String checkName) {
        this.checkName = checkName == null ? null : checkName.trim();
    }

    /**
     * 获取收款用户姓名，收款用户真实姓名。
            如果check_name设置为FORCE_CHECK或OPTION_CHECK，则必填用户真实姓名: mch_pay_wx.RE_USER_NAME
     * @return 收款用户姓名，收款用户真实姓名。
            如果check_name设置为FORCE_CHECK或OPTION_CHECK，则必填用户真实姓名: mch_pay_wx.RE_USER_NAME
     * @author MyBatis Generator
     */
    public String getReUserName() {
        return reUserName;
    }

    /**
     * 设置收款用户姓名，收款用户真实姓名。
            如果check_name设置为FORCE_CHECK或OPTION_CHECK，则必填用户真实姓名: mch_pay_wx.RE_USER_NAME
     * @param reUserName 映射数据库字段: mch_pay_wx.RE_USER_NAME
     * @author MyBatis Generator
     */
    public void setReUserName(String reUserName) {
        this.reUserName = reUserName == null ? null : reUserName.trim();
    }

    /**
     * 获取金额，企业付款金额，单位为分: mch_pay_wx.AMOUNT
     * @return 金额，企业付款金额，单位为分: mch_pay_wx.AMOUNT
     * @author MyBatis Generator
     */
    public Integer getAmount() {
        return amount;
    }

    /**
     * 设置金额，企业付款金额，单位为分: mch_pay_wx.AMOUNT
     * @param amount 映射数据库字段: mch_pay_wx.AMOUNT
     * @author MyBatis Generator
     */
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    /**
     * 获取企业付款描述信息: mch_pay_wx.REMARK
     * @return 企业付款描述信息: mch_pay_wx.REMARK
     * @author MyBatis Generator
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置企业付款描述信息: mch_pay_wx.REMARK
     * @param remark 映射数据库字段: mch_pay_wx.REMARK
     * @author MyBatis Generator
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * 获取Ip地址，调用接口的机器Ip地址: mch_pay_wx.SPBILL_CREATE_IP
     * @return Ip地址，调用接口的机器Ip地址: mch_pay_wx.SPBILL_CREATE_IP
     * @author MyBatis Generator
     */
    public String getSpbillCreateIp() {
        return spbillCreateIp;
    }

    /**
     * 设置Ip地址，调用接口的机器Ip地址: mch_pay_wx.SPBILL_CREATE_IP
     * @param spbillCreateIp 映射数据库字段: mch_pay_wx.SPBILL_CREATE_IP
     * @author MyBatis Generator
     */
    public void setSpbillCreateIp(String spbillCreateIp) {
        this.spbillCreateIp = spbillCreateIp == null ? null : spbillCreateIp.trim();
    }

    /**
     * 获取返回状态码，SUCCESS/FAIL
            此字段是通信标识，非交易标识，交易是否成功需要查看result_code来判断: mch_pay_wx.RETURN_CODE
     * @return 返回状态码，SUCCESS/FAIL
            此字段是通信标识，非交易标识，交易是否成功需要查看result_code来判断: mch_pay_wx.RETURN_CODE
     * @author MyBatis Generator
     */
    public String getReturnCode() {
        return returnCode;
    }

    /**
     * 设置返回状态码，SUCCESS/FAIL
            此字段是通信标识，非交易标识，交易是否成功需要查看result_code来判断: mch_pay_wx.RETURN_CODE
     * @param returnCode 映射数据库字段: mch_pay_wx.RETURN_CODE
     * @author MyBatis Generator
     */
    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode == null ? null : returnCode.trim();
    }

    /**
     * 获取返回信息，如非空，为错误原因
            签名失败
            参数格式校验错误: mch_pay_wx.RETURN_MSG
     * @return 返回信息，如非空，为错误原因
            签名失败
            参数格式校验错误: mch_pay_wx.RETURN_MSG
     * @author MyBatis Generator
     */
    public String getReturnMsg() {
        return returnMsg;
    }

    /**
     * 设置返回信息，如非空，为错误原因
            签名失败
            参数格式校验错误: mch_pay_wx.RETURN_MSG
     * @param returnMsg 映射数据库字段: mch_pay_wx.RETURN_MSG
     * @author MyBatis Generator
     */
    public void setReturnMsg(String returnMsg) {
        this.returnMsg = returnMsg == null ? null : returnMsg.trim();
    }

    /**
     * 获取业务结果，SUCCESS/FAIL: mch_pay_wx.RESULT_CODE
     * @return 业务结果，SUCCESS/FAIL: mch_pay_wx.RESULT_CODE
     * @author MyBatis Generator
     */
    public String getResultCode() {
        return resultCode;
    }

    /**
     * 设置业务结果，SUCCESS/FAIL: mch_pay_wx.RESULT_CODE
     * @param resultCode 映射数据库字段: mch_pay_wx.RESULT_CODE
     * @author MyBatis Generator
     */
    public void setResultCode(String resultCode) {
        this.resultCode = resultCode == null ? null : resultCode.trim();
    }

    /**
     * 获取错误代码，错误码信息: mch_pay_wx.ERR_CODE
     * @return 错误代码，错误码信息: mch_pay_wx.ERR_CODE
     * @author MyBatis Generator
     */
    public String getErrCode() {
        return errCode;
    }

    /**
     * 设置错误代码，错误码信息: mch_pay_wx.ERR_CODE
     * @param errCode 映射数据库字段: mch_pay_wx.ERR_CODE
     * @author MyBatis Generator
     */
    public void setErrCode(String errCode) {
        this.errCode = errCode == null ? null : errCode.trim();
    }

    /**
     * 获取错误代码描述，结果信息描述: mch_pay_wx.ERR_CODE_DES
     * @return 错误代码描述，结果信息描述: mch_pay_wx.ERR_CODE_DES
     * @author MyBatis Generator
     */
    public String getErrCodeDes() {
        return errCodeDes;
    }

    /**
     * 设置错误代码描述，结果信息描述: mch_pay_wx.ERR_CODE_DES
     * @param errCodeDes 映射数据库字段: mch_pay_wx.ERR_CODE_DES
     * @author MyBatis Generator
     */
    public void setErrCodeDes(String errCodeDes) {
        this.errCodeDes = errCodeDes == null ? null : errCodeDes.trim();
    }

    /**
     * 获取微信订单号，企业付款成功，返回的微信订单号: mch_pay_wx.PAYMENT_NO
     * @return 微信订单号，企业付款成功，返回的微信订单号: mch_pay_wx.PAYMENT_NO
     * @author MyBatis Generator
     */
    public String getPaymentNo() {
        return paymentNo;
    }

    /**
     * 设置微信订单号，企业付款成功，返回的微信订单号: mch_pay_wx.PAYMENT_NO
     * @param paymentNo 映射数据库字段: mch_pay_wx.PAYMENT_NO
     * @author MyBatis Generator
     */
    public void setPaymentNo(String paymentNo) {
        this.paymentNo = paymentNo == null ? null : paymentNo.trim();
    }

    /**
     * 获取微信支付成功时间，企业付款成功时间，示例 2015-05-19 15：26：59: mch_pay_wx.PAYMENT_TIME
     * @return 微信支付成功时间，企业付款成功时间，示例 2015-05-19 15：26：59: mch_pay_wx.PAYMENT_TIME
     * @author MyBatis Generator
     */
    public String getPaymentTime() {
        return paymentTime;
    }

    /**
     * 设置微信支付成功时间，企业付款成功时间，示例 2015-05-19 15：26：59: mch_pay_wx.PAYMENT_TIME
     * @param paymentTime 映射数据库字段: mch_pay_wx.PAYMENT_TIME
     * @author MyBatis Generator
     */
    public void setPaymentTime(String paymentTime) {
        this.paymentTime = paymentTime == null ? null : paymentTime.trim();
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: mch_pay_wx
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
        MchPayWx other = (MchPayWx) that;
        return (this.getPartnerTradeNo() == null ? other.getPartnerTradeNo() == null : this.getPartnerTradeNo().equals(other.getPartnerTradeNo()))
            && (this.getMchAppid() == null ? other.getMchAppid() == null : this.getMchAppid().equals(other.getMchAppid()))
            && (this.getMchid() == null ? other.getMchid() == null : this.getMchid().equals(other.getMchid()))
            && (this.getDeviceInfo() == null ? other.getDeviceInfo() == null : this.getDeviceInfo().equals(other.getDeviceInfo()))
            && (this.getSign() == null ? other.getSign() == null : this.getSign().equals(other.getSign()))
            && (this.getOpenid() == null ? other.getOpenid() == null : this.getOpenid().equals(other.getOpenid()))
            && (this.getCheckName() == null ? other.getCheckName() == null : this.getCheckName().equals(other.getCheckName()))
            && (this.getReUserName() == null ? other.getReUserName() == null : this.getReUserName().equals(other.getReUserName()))
            && (this.getAmount() == null ? other.getAmount() == null : this.getAmount().equals(other.getAmount()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getSpbillCreateIp() == null ? other.getSpbillCreateIp() == null : this.getSpbillCreateIp().equals(other.getSpbillCreateIp()))
            && (this.getReturnCode() == null ? other.getReturnCode() == null : this.getReturnCode().equals(other.getReturnCode()))
            && (this.getReturnMsg() == null ? other.getReturnMsg() == null : this.getReturnMsg().equals(other.getReturnMsg()))
            && (this.getResultCode() == null ? other.getResultCode() == null : this.getResultCode().equals(other.getResultCode()))
            && (this.getErrCode() == null ? other.getErrCode() == null : this.getErrCode().equals(other.getErrCode()))
            && (this.getErrCodeDes() == null ? other.getErrCodeDes() == null : this.getErrCodeDes().equals(other.getErrCodeDes()))
            && (this.getPaymentNo() == null ? other.getPaymentNo() == null : this.getPaymentNo().equals(other.getPaymentNo()))
            && (this.getPaymentTime() == null ? other.getPaymentTime() == null : this.getPaymentTime().equals(other.getPaymentTime()));
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: mch_pay_wx
     * @author MyBatis Generator
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPartnerTradeNo() == null) ? 0 : getPartnerTradeNo().hashCode());
        result = prime * result + ((getMchAppid() == null) ? 0 : getMchAppid().hashCode());
        result = prime * result + ((getMchid() == null) ? 0 : getMchid().hashCode());
        result = prime * result + ((getDeviceInfo() == null) ? 0 : getDeviceInfo().hashCode());
        result = prime * result + ((getSign() == null) ? 0 : getSign().hashCode());
        result = prime * result + ((getOpenid() == null) ? 0 : getOpenid().hashCode());
        result = prime * result + ((getCheckName() == null) ? 0 : getCheckName().hashCode());
        result = prime * result + ((getReUserName() == null) ? 0 : getReUserName().hashCode());
        result = prime * result + ((getAmount() == null) ? 0 : getAmount().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getSpbillCreateIp() == null) ? 0 : getSpbillCreateIp().hashCode());
        result = prime * result + ((getReturnCode() == null) ? 0 : getReturnCode().hashCode());
        result = prime * result + ((getReturnMsg() == null) ? 0 : getReturnMsg().hashCode());
        result = prime * result + ((getResultCode() == null) ? 0 : getResultCode().hashCode());
        result = prime * result + ((getErrCode() == null) ? 0 : getErrCode().hashCode());
        result = prime * result + ((getErrCodeDes() == null) ? 0 : getErrCodeDes().hashCode());
        result = prime * result + ((getPaymentNo() == null) ? 0 : getPaymentNo().hashCode());
        result = prime * result + ((getPaymentTime() == null) ? 0 : getPaymentTime().hashCode());
        return result;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: mch_pay_wx
     * @author MyBatis Generator
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append(", partnerTradeNo=").append(partnerTradeNo);
        sb.append(", mchAppid=").append(mchAppid);
        sb.append(", mchid=").append(mchid);
        sb.append(", deviceInfo=").append(deviceInfo);
        sb.append(", sign=").append(sign);
        sb.append(", openid=").append(openid);
        sb.append(", checkName=").append(checkName);
        sb.append(", reUserName=").append(reUserName);
        sb.append(", amount=").append(amount);
        sb.append(", remark=").append(remark);
        sb.append(", spbillCreateIp=").append(spbillCreateIp);
        sb.append(", returnCode=").append(returnCode);
        sb.append(", returnMsg=").append(returnMsg);
        sb.append(", resultCode=").append(resultCode);
        sb.append(", errCode=").append(errCode);
        sb.append(", errCodeDes=").append(errCodeDes);
        sb.append(", paymentNo=").append(paymentNo);
        sb.append(", paymentTime=").append(paymentTime);
        sb.append("]");
        return sb.toString();
    }
}