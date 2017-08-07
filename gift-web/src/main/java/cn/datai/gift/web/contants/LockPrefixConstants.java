package cn.datai.gift.web.contants;

public interface LockPrefixConstants {

    /** redis锁命名空间*/
    String REDIS_LOCK = "lock";

    String SYSTEM = "system";

    /** 微信公众号锁, 冒号后接微信appid*/
    String WEIXIN_APP = REDIS_LOCK + ":" + SYSTEM + ":weixin:";

}
