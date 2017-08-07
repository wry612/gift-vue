package cn.datai.gift.persist.po;

import java.io.Serializable;
import java.util.Date;

public class UserInfo implements Serializable {
    public static final long serialVersionUID = 753837666L;

    /**
     * 用户id: user_info.USER_INFO_ID
     * @author MyBatis Generator
     */
    private Long userInfoId;

    /**
     * 绑定的外部账户，现对应通行证账号: user_info.BIND_ACCOUNT
     * @author MyBatis Generator
     */
    private String bindAccount;

    /**
     * 唯一，自动生成，用户只能修改一次: user_info.LOGIN_NAME
     * @author MyBatis Generator
     */
    private String loginName;

    /**
     * 密码: user_info.PASSWORD
     * @author MyBatis Generator
     */
    private String password;

    /**
     * 国家: user_info.COUNTRY
     * @author MyBatis Generator
     */
    private String country;

    /**
     * 省份: user_info.PROVINCE
     * @author MyBatis Generator
     */
    private String province;

    /**
     * 城市: user_info.CITY
     * @author MyBatis Generator
     */
    private String city;

    /**
     * 昵称: user_info.NICKNAME
     * @author MyBatis Generator
     */
    private String nickname;

    /**
     * 性别: user_info.SEX
     * @author MyBatis Generator
     */
    private String sex;

    /**
     * 手机号: user_info.MOBILE_PHONE
     * @author MyBatis Generator
     */
    private String mobilePhone;

    /**
     * 用户类型， normal:普通用户   special:特殊用户  center:平台用户: user_info.USER_TYPE
     * @author MyBatis Generator
     */
    private String userType;

    /**
     * IP地址: user_info.REGISTER_IP_ADDRESS
     * @author MyBatis Generator
     */
    private String registerIpAddress;

    /**
     * 注册时间: user_info.REGISTER_TIME
     * @author MyBatis Generator
     */
    private Date registerTime;

    /**
     * 最后登录时间: user_info.LAST_LOGIN_TIME
     * @author MyBatis Generator
     */
    private String lastLoginTime;

    /**
     * 账号来源: user_info.SOURCE
     * @author MyBatis Generator
     */
    private String source;

    /**
     * 推荐人: user_info.RECOMMEND_ID
     * @author MyBatis Generator
     */
    private String recommendId;

    /**
     * 等级: user_info.RANK
     * @author MyBatis Generator
     */
    private String rank;

    /**
     * 头像文件存储路径: user_info.HEAD_IMG_PATH
     * @author MyBatis Generator
     */
    private String headImgPath;

    /**
     * 是否可作为经纪人,TRUE:可作为经纪人   FALSE：不可作为经纪人: user_info.IS_BROKER
     * @author MyBatis Generator
     */
    private String isBroker;

    /**
     * 经纪人用户id: user_info.BROKER_USER_ID
     * @author MyBatis Generator
     */
    private Long brokerUserId;

    /**
     * 推荐人用户id: user_info.REFERER_USER_ID
     * @author MyBatis Generator
     */
    private Long refererUserId;

    /**
     * 获取用户id: user_info.USER_INFO_ID
     * @return 用户id: user_info.USER_INFO_ID
     * @author MyBatis Generator
     */
    public Long getUserInfoId() {
        return userInfoId;
    }

    /**
     * 设置用户id: user_info.USER_INFO_ID
     * @param userInfoId 映射数据库字段: user_info.USER_INFO_ID
     * @author MyBatis Generator
     */
    public void setUserInfoId(Long userInfoId) {
        this.userInfoId = userInfoId;
    }

    /**
     * 获取绑定的外部账户，现对应通行证账号: user_info.BIND_ACCOUNT
     * @return 绑定的外部账户，现对应通行证账号: user_info.BIND_ACCOUNT
     * @author MyBatis Generator
     */
    public String getBindAccount() {
        return bindAccount;
    }

    /**
     * 设置绑定的外部账户，现对应通行证账号: user_info.BIND_ACCOUNT
     * @param bindAccount 映射数据库字段: user_info.BIND_ACCOUNT
     * @author MyBatis Generator
     */
    public void setBindAccount(String bindAccount) {
        this.bindAccount = bindAccount == null ? null : bindAccount.trim();
    }

    /**
     * 获取唯一，自动生成，用户只能修改一次: user_info.LOGIN_NAME
     * @return 唯一，自动生成，用户只能修改一次: user_info.LOGIN_NAME
     * @author MyBatis Generator
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * 设置唯一，自动生成，用户只能修改一次: user_info.LOGIN_NAME
     * @param loginName 映射数据库字段: user_info.LOGIN_NAME
     * @author MyBatis Generator
     */
    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    /**
     * 获取密码: user_info.PASSWORD
     * @return 密码: user_info.PASSWORD
     * @author MyBatis Generator
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码: user_info.PASSWORD
     * @param password 映射数据库字段: user_info.PASSWORD
     * @author MyBatis Generator
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * 获取国家: user_info.COUNTRY
     * @return 国家: user_info.COUNTRY
     * @author MyBatis Generator
     */
    public String getCountry() {
        return country;
    }

    /**
     * 设置国家: user_info.COUNTRY
     * @param country 映射数据库字段: user_info.COUNTRY
     * @author MyBatis Generator
     */
    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    /**
     * 获取省份: user_info.PROVINCE
     * @return 省份: user_info.PROVINCE
     * @author MyBatis Generator
     */
    public String getProvince() {
        return province;
    }

    /**
     * 设置省份: user_info.PROVINCE
     * @param province 映射数据库字段: user_info.PROVINCE
     * @author MyBatis Generator
     */
    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    /**
     * 获取城市: user_info.CITY
     * @return 城市: user_info.CITY
     * @author MyBatis Generator
     */
    public String getCity() {
        return city;
    }

    /**
     * 设置城市: user_info.CITY
     * @param city 映射数据库字段: user_info.CITY
     * @author MyBatis Generator
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * 获取昵称: user_info.NICKNAME
     * @return 昵称: user_info.NICKNAME
     * @author MyBatis Generator
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * 设置昵称: user_info.NICKNAME
     * @param nickname 映射数据库字段: user_info.NICKNAME
     * @author MyBatis Generator
     */
    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    /**
     * 获取性别: user_info.SEX
     * @return 性别: user_info.SEX
     * @author MyBatis Generator
     */
    public String getSex() {
        return sex;
    }

    /**
     * 设置性别: user_info.SEX
     * @param sex 映射数据库字段: user_info.SEX
     * @author MyBatis Generator
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * 获取手机号: user_info.MOBILE_PHONE
     * @return 手机号: user_info.MOBILE_PHONE
     * @author MyBatis Generator
     */
    public String getMobilePhone() {
        return mobilePhone;
    }

    /**
     * 设置手机号: user_info.MOBILE_PHONE
     * @param mobilePhone 映射数据库字段: user_info.MOBILE_PHONE
     * @author MyBatis Generator
     */
    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone == null ? null : mobilePhone.trim();
    }

    /**
     * 获取用户类型， normal:普通用户   special:特殊用户  center:平台用户: user_info.USER_TYPE
     * @return 用户类型， normal:普通用户   special:特殊用户  center:平台用户: user_info.USER_TYPE
     * @author MyBatis Generator
     */
    public String getUserType() {
        return userType;
    }

    /**
     * 设置用户类型， normal:普通用户   special:特殊用户  center:平台用户: user_info.USER_TYPE
     * @param userType 映射数据库字段: user_info.USER_TYPE
     * @author MyBatis Generator
     */
    public void setUserType(String userType) {
        this.userType = userType == null ? null : userType.trim();
    }

    /**
     * 获取IP地址: user_info.REGISTER_IP_ADDRESS
     * @return IP地址: user_info.REGISTER_IP_ADDRESS
     * @author MyBatis Generator
     */
    public String getRegisterIpAddress() {
        return registerIpAddress;
    }

    /**
     * 设置IP地址: user_info.REGISTER_IP_ADDRESS
     * @param registerIpAddress 映射数据库字段: user_info.REGISTER_IP_ADDRESS
     * @author MyBatis Generator
     */
    public void setRegisterIpAddress(String registerIpAddress) {
        this.registerIpAddress = registerIpAddress == null ? null : registerIpAddress.trim();
    }

    /**
     * 获取注册时间: user_info.REGISTER_TIME
     * @return 注册时间: user_info.REGISTER_TIME
     * @author MyBatis Generator
     */
    public Date getRegisterTime() {
        return registerTime;
    }

    /**
     * 设置注册时间: user_info.REGISTER_TIME
     * @param registerTime 映射数据库字段: user_info.REGISTER_TIME
     * @author MyBatis Generator
     */
    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    /**
     * 获取最后登录时间: user_info.LAST_LOGIN_TIME
     * @return 最后登录时间: user_info.LAST_LOGIN_TIME
     * @author MyBatis Generator
     */
    public String getLastLoginTime() {
        return lastLoginTime;
    }

    /**
     * 设置最后登录时间: user_info.LAST_LOGIN_TIME
     * @param lastLoginTime 映射数据库字段: user_info.LAST_LOGIN_TIME
     * @author MyBatis Generator
     */
    public void setLastLoginTime(String lastLoginTime) {
        this.lastLoginTime = lastLoginTime == null ? null : lastLoginTime.trim();
    }

    /**
     * 获取账号来源: user_info.SOURCE
     * @return 账号来源: user_info.SOURCE
     * @author MyBatis Generator
     */
    public String getSource() {
        return source;
    }

    /**
     * 设置账号来源: user_info.SOURCE
     * @param source 映射数据库字段: user_info.SOURCE
     * @author MyBatis Generator
     */
    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    /**
     * 获取推荐人: user_info.RECOMMEND_ID
     * @return 推荐人: user_info.RECOMMEND_ID
     * @author MyBatis Generator
     */
    public String getRecommendId() {
        return recommendId;
    }

    /**
     * 设置推荐人: user_info.RECOMMEND_ID
     * @param recommendId 映射数据库字段: user_info.RECOMMEND_ID
     * @author MyBatis Generator
     */
    public void setRecommendId(String recommendId) {
        this.recommendId = recommendId == null ? null : recommendId.trim();
    }

    /**
     * 获取等级: user_info.RANK
     * @return 等级: user_info.RANK
     * @author MyBatis Generator
     */
    public String getRank() {
        return rank;
    }

    /**
     * 设置等级: user_info.RANK
     * @param rank 映射数据库字段: user_info.RANK
     * @author MyBatis Generator
     */
    public void setRank(String rank) {
        this.rank = rank == null ? null : rank.trim();
    }

    /**
     * 获取头像文件存储路径: user_info.HEAD_IMG_PATH
     * @return 头像文件存储路径: user_info.HEAD_IMG_PATH
     * @author MyBatis Generator
     */
    public String getHeadImgPath() {
        return headImgPath;
    }

    /**
     * 设置头像文件存储路径: user_info.HEAD_IMG_PATH
     * @param headImgPath 映射数据库字段: user_info.HEAD_IMG_PATH
     * @author MyBatis Generator
     */
    public void setHeadImgPath(String headImgPath) {
        this.headImgPath = headImgPath == null ? null : headImgPath.trim();
    }

    /**
     * 获取是否可作为经纪人,TRUE:可作为经纪人   FALSE：不可作为经纪人: user_info.IS_BROKER
     * @return 是否可作为经纪人,TRUE:可作为经纪人   FALSE：不可作为经纪人: user_info.IS_BROKER
     * @author MyBatis Generator
     */
    public String getIsBroker() {
        return isBroker;
    }

    /**
     * 设置是否可作为经纪人,TRUE:可作为经纪人   FALSE：不可作为经纪人: user_info.IS_BROKER
     * @param isBroker 映射数据库字段: user_info.IS_BROKER
     * @author MyBatis Generator
     */
    public void setIsBroker(String isBroker) {
        this.isBroker = isBroker == null ? null : isBroker.trim();
    }

    /**
     * 获取经纪人用户id: user_info.BROKER_USER_ID
     * @return 经纪人用户id: user_info.BROKER_USER_ID
     * @author MyBatis Generator
     */
    public Long getBrokerUserId() {
        return brokerUserId;
    }

    /**
     * 设置经纪人用户id: user_info.BROKER_USER_ID
     * @param brokerUserId 映射数据库字段: user_info.BROKER_USER_ID
     * @author MyBatis Generator
     */
    public void setBrokerUserId(Long brokerUserId) {
        this.brokerUserId = brokerUserId;
    }

    /**
     * 获取推荐人用户id: user_info.REFERER_USER_ID
     * @return 推荐人用户id: user_info.REFERER_USER_ID
     * @author MyBatis Generator
     */
    public Long getRefererUserId() {
        return refererUserId;
    }

    /**
     * 设置推荐人用户id: user_info.REFERER_USER_ID
     * @param refererUserId 映射数据库字段: user_info.REFERER_USER_ID
     * @author MyBatis Generator
     */
    public void setRefererUserId(Long refererUserId) {
        this.refererUserId = refererUserId;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_info
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
        UserInfo other = (UserInfo) that;
        return (this.getUserInfoId() == null ? other.getUserInfoId() == null : this.getUserInfoId().equals(other.getUserInfoId()))
            && (this.getBindAccount() == null ? other.getBindAccount() == null : this.getBindAccount().equals(other.getBindAccount()))
            && (this.getLoginName() == null ? other.getLoginName() == null : this.getLoginName().equals(other.getLoginName()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getCountry() == null ? other.getCountry() == null : this.getCountry().equals(other.getCountry()))
            && (this.getProvince() == null ? other.getProvince() == null : this.getProvince().equals(other.getProvince()))
            && (this.getCity() == null ? other.getCity() == null : this.getCity().equals(other.getCity()))
            && (this.getNickname() == null ? other.getNickname() == null : this.getNickname().equals(other.getNickname()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getMobilePhone() == null ? other.getMobilePhone() == null : this.getMobilePhone().equals(other.getMobilePhone()))
            && (this.getUserType() == null ? other.getUserType() == null : this.getUserType().equals(other.getUserType()))
            && (this.getRegisterIpAddress() == null ? other.getRegisterIpAddress() == null : this.getRegisterIpAddress().equals(other.getRegisterIpAddress()))
            && (this.getRegisterTime() == null ? other.getRegisterTime() == null : this.getRegisterTime().equals(other.getRegisterTime()))
            && (this.getLastLoginTime() == null ? other.getLastLoginTime() == null : this.getLastLoginTime().equals(other.getLastLoginTime()))
            && (this.getSource() == null ? other.getSource() == null : this.getSource().equals(other.getSource()))
            && (this.getRecommendId() == null ? other.getRecommendId() == null : this.getRecommendId().equals(other.getRecommendId()))
            && (this.getRank() == null ? other.getRank() == null : this.getRank().equals(other.getRank()))
            && (this.getHeadImgPath() == null ? other.getHeadImgPath() == null : this.getHeadImgPath().equals(other.getHeadImgPath()))
            && (this.getIsBroker() == null ? other.getIsBroker() == null : this.getIsBroker().equals(other.getIsBroker()))
            && (this.getBrokerUserId() == null ? other.getBrokerUserId() == null : this.getBrokerUserId().equals(other.getBrokerUserId()))
            && (this.getRefererUserId() == null ? other.getRefererUserId() == null : this.getRefererUserId().equals(other.getRefererUserId()));
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_info
     * @author MyBatis Generator
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserInfoId() == null) ? 0 : getUserInfoId().hashCode());
        result = prime * result + ((getBindAccount() == null) ? 0 : getBindAccount().hashCode());
        result = prime * result + ((getLoginName() == null) ? 0 : getLoginName().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getCountry() == null) ? 0 : getCountry().hashCode());
        result = prime * result + ((getProvince() == null) ? 0 : getProvince().hashCode());
        result = prime * result + ((getCity() == null) ? 0 : getCity().hashCode());
        result = prime * result + ((getNickname() == null) ? 0 : getNickname().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getMobilePhone() == null) ? 0 : getMobilePhone().hashCode());
        result = prime * result + ((getUserType() == null) ? 0 : getUserType().hashCode());
        result = prime * result + ((getRegisterIpAddress() == null) ? 0 : getRegisterIpAddress().hashCode());
        result = prime * result + ((getRegisterTime() == null) ? 0 : getRegisterTime().hashCode());
        result = prime * result + ((getLastLoginTime() == null) ? 0 : getLastLoginTime().hashCode());
        result = prime * result + ((getSource() == null) ? 0 : getSource().hashCode());
        result = prime * result + ((getRecommendId() == null) ? 0 : getRecommendId().hashCode());
        result = prime * result + ((getRank() == null) ? 0 : getRank().hashCode());
        result = prime * result + ((getHeadImgPath() == null) ? 0 : getHeadImgPath().hashCode());
        result = prime * result + ((getIsBroker() == null) ? 0 : getIsBroker().hashCode());
        result = prime * result + ((getBrokerUserId() == null) ? 0 : getBrokerUserId().hashCode());
        result = prime * result + ((getRefererUserId() == null) ? 0 : getRefererUserId().hashCode());
        return result;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: user_info
     * @author MyBatis Generator
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append(", userInfoId=").append(userInfoId);
        sb.append(", bindAccount=").append(bindAccount);
        sb.append(", loginName=").append(loginName);
        sb.append(", password=").append(password);
        sb.append(", country=").append(country);
        sb.append(", province=").append(province);
        sb.append(", city=").append(city);
        sb.append(", nickname=").append(nickname);
        sb.append(", sex=").append(sex);
        sb.append(", mobilePhone=").append(mobilePhone);
        sb.append(", userType=").append(userType);
        sb.append(", registerIpAddress=").append(registerIpAddress);
        sb.append(", registerTime=").append(registerTime);
        sb.append(", lastLoginTime=").append(lastLoginTime);
        sb.append(", source=").append(source);
        sb.append(", recommendId=").append(recommendId);
        sb.append(", rank=").append(rank);
        sb.append(", headImgPath=").append(headImgPath);
        sb.append(", isBroker=").append(isBroker);
        sb.append(", brokerUserId=").append(brokerUserId);
        sb.append(", refererUserId=").append(refererUserId);
        sb.append("]");
        return sb.toString();
    }
}