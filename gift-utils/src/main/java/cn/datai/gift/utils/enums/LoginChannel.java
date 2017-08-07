package cn.datai.gift.utils.enums;

/**
 * Created by zhangyutao on 2016/12/5.
 */
public interface LoginChannel {

    /**
     * 微信静默登录
     */
    String WEIXIN_BASE = "weixinBase";

    /**
     * 微信获取基本用户信息的登录
     */
    String WEIXIN_USER_INFO = "weixinUserInfo";

    /**
     * 默认的账号登录密码方式登录
     */
    String NORMAL = "normal";


}
