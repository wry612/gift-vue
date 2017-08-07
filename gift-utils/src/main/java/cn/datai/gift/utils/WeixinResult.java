package cn.datai.gift.utils;

/**
 * 微信接口返回状态码
 */
public class WeixinResult {

    /**
     * 系统繁忙，此时请开发者稍候再试
     */
    public static final int SYS_BUSY = -1;

    /**
     * 请求成功
     */
    public static final int REQUEST_SUCCESS = 0;

    /**
     * 获取access_token时AppSecret错误，或者access_token无效。请开发者认真比对AppSecret的正确性，或查看是否正在为恰当的公众号调用接口
     */
    public static final int ACCESS_TOKEN_CONF_ERROR = 40001;

    /**
     * 不合法的凭证类型
     */
    public static final int INVALID_CREDENTIAL = 40002;

    /**
     * 不合法的OpenID，请开发者确认OpenID（该用户）是否已关注公众号，或是否是其他公众号的OpenID
     */
    public static final int INVALID_OPENID = 40003;

    /**
     * 不合法的媒体文件类型
     */
    public static final int INVALID_MEDIA_TYPE = 40004;

    /**
     * 不合法的文件类型
     */
    public static final int INVALID_FILE_TYPE = 40005;

    /**
     * 不合法的文件大小
     */
    public static final int INVALID_FILE_CAPACITY = 40006;

    /**
     * 不合法的媒体文件id
     */
    public static final int INVALID_MEDIA_FILE_ID = 40007;

    /**
     * 不合法的消息类型
     */
    public static final int INVALID_MESSAGE_TYPE = 40008;




    /**
     * access_token超时，请检查access_token的有效期，请参考基础支持-获取access_token中，对access_token的详细机制说明
     */
    public static final int ACCESS_TOKEN_EXPIRE = 42001;


}
