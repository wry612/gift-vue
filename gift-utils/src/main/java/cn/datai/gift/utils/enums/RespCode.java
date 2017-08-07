package cn.datai.gift.utils.enums;

/**
 * 响应Code枚举.
 */
public enum RespCode {
    /** 成功. */
    SUCCESS("0", "成功"),

    /** 失败 */
    FAIL("-1", "失败"),

    /** 业务错误 */
    BIZCODE("-2", "失败"),

    /**
     * 系统公共状态
     */
    NO_LOGIN_SESSION("1", "用户未登录"),
    SERVER_BUSY("2", "系统忙，请稍后再试"),
    PARAMS_ERROR("3", "参数错误"),



    GIFT_EXPIRED("1001", "礼包已过期"),
    GIFT_EMPTY("1002", "礼包已被抢光"),
    GIFT_QUANTITY_EMPTY("1003", "礼包中已无商品"),
    TRADE_NO_AVAILABLE("1004", "交易账户可用商品数量不足"),
    USER_NOT_FOUND("1005", "未找到用户"),
    TRADE_UNFREEZE_NO_AVAILABLE("1006", "交易账户中冻结的商品数量不足"),
    TRADE_AVAILABLE_NOT_ENOUGH("1007", "交易账户中的可用商品不足"),
    GIFT_NOT_FOUND("1007", "未找到礼包"),
    GIFT_SPECIFIED_NO_AUTH("1008", "礼包已指定受赠人,无权限操作"),
    GIFT_TYPE_NOT_SUPPORT("1009", "不支持的礼包类型"),
    GIFT_HAS_GRAB("1010", "已抢过此礼包"),
    GIFT_AVAILABLE("1011", "礼包可抢"),
    OPERATOR_NOT_FOUND("1012", "未找到运营商"),
    CREATE_TRADE_ACCOUNT_ERROR("1013", "创建交易账户失败"),

    GIFT_TYPE("2001","没有找到系统红包类型参数"),
    GIFT_COUNT_IS_NOT_INTEGER("2002","最大可发红包个数不是整数"),
    GIFT_MAX_COUNT_NOT_FUND("2003","没有找到系统红包个数限制参数"),
    COMMODITY_NOT_FUND("2004","没有找到系统商品合约"),
    GIFTACCOUNT_NOT_FUND("2005","没有找到对应的礼包账户"),
    GIFTRELTACCOUNT_NOT_FUND("2006","没有找到对应的用户与礼包关系账户"),
    GIFTPARAM_NOT_FUND("2007","发放红包参数不符合要求"),
    REDIS_NOT_FUND("2008","redis参数发生错误"),
    REDIS_LOCK_NOT_FUND("2009","获取redis锁失败"),
    PRODUCE_ORDER_FAIL("2010","产生提货订单发生异常"),
    PARAMS_IS_NOT_ERROR("2011","购买，购买参数异常"),

    NOT_FIND_RECORD("2012","没有找到业务记录"),
    OVER_EXPIRE_TIME("2013","商品时间过期"),
    OVER_MAX_NUM("2014","超出最大提货数量"),
    OVER_BUY_NUM("2015","超出最大购买数量"),
    NOT_CANCEL_BY_PAY("2016", "已付款不能取消"),
    NOT_PAY("2017", "订单已支付或尚未支付，不能执行该操作"),
    ERROR_USER_BIZ("2018", "查询业务概况时发生异常"),
    PWD_ERROR("2019","密码错误"),
    PWD_EMPTY("2020","请输入密码"),
    CONVERT_OBJ_EMPTY("2100", "商品数量不足或兑完"),
    CONVERT_OBJ_TIME_INVALID("2101", "活动过期"),
    CONVERT_OBJ_NOT_ORDERED("2102", "该订单不是已下单状态"),
    CAN_NOT_DRAW("2103", "不能执行抽奖"),
    INVALID_DRAW_NUM("2104", "报名参数不为1"),
    CONVERT_OBJ_QUANTITY_ERROR("2105", "兑换物品数量不能小于1"),
    NOT_FIND_DONATETYPE("2106", "没有找到赠礼额的类型"),
    PARSE_GIFT_ERROR("2107", "赠礼类型解析异常"),

    OVER_PER_OPERATE_ERROR("2108", "超出每次数量限制"),
    NOT_FIND_MULTI_OBJ_DETAIL("2109", "没有找到奖项设置信息"),
    NOT_SAME_DRAW_SETTING("2110", "抽出的奖品数量个奖项设置的不一致"),

    //支付相关
    PAY_NO_CHANNEL("3000", "不存在的支付渠道"),
    PAY_ALREADY("3001", "已完成支付，请勿重复支付"),
    PAY_CANCELLED("3002", "支付已取消，请勿支付"),
    PAY_EXPIRE_PARAM_ERROR("3003", "支付超时时间必须大于5分钟"),
    PAY_REFUND_ALREADY("3004", "退款已发起，请勿再次操作"),
    PAY_BIZ_PROCEESSED("3005", "支付订单关联的业务单已处理"),
    WX_PAY_INVALID("3100", "微信支付记录无效"),
    WX_PAY_CALL_ERROR("3101", "调用微信支付接口错误"),
    WX_PAY_REQUEST_ERROR("3102", "微信支付请求错误"),
    WX_PAY_CHECK_SIGN_ERROR("3103", "微信支付验证签名失败"),
    WX_PAY_RESP_NOT_MATCH("3104", "微信支付响应与请求不匹配"),
    WX_PAY_NO_TRADE_TYPE("3105", "未指定微信支付交易类型"),
    WX_PAY_ALREADY_SUCCESS("3106", "微信支付已完成，勿重复处理"),
    WX_PAY_NOT_FOUND("3107", "未能在本系统找到微信支付订单信息"),
    WX_PAY_REFUND_SUBMITTED("3108", "微信退款已上报，请勿重复提交"),
    WX_PAY_EXPIRED_TIME_ERROR("3109", "微信支付过期时间参数必须大于5分钟"),

    //物流信息
    EXPRESS_INFO_NOT_FOUND("3200", "系统中不存在此物流信息"),


    DONATE_CENTER_NOT_FIND("4000", "没有找到平台账户"),
    DONATE_TYPE_NOT_FIND("4001", "没有找到赠送的商品类型"),
    PARSE_DONATE_RULES_ERROR("4002", "解析推荐规则异常"),
    BROKER_NOT_FIND("4003", "没有找到经纪人"),
    RULES_COMMODITY_ID_NOT_FIND("4004", "没有找到规则中的商品ID"),
    RULES_COMMODITY_TYPE_NOT_FIND("4005", "没有找到规则中的赠品类型"),
    RULES_COMMODITY_NUM_NOT_FIND("4006", "没有找到规则中的赠品数量"),
    ACTIVITY_PRESENT_NOT_FIND("4007", "没有查询到赠送礼品记录"),
    NOT_SAME_MIN_AND_MAX("4008", "报名最小人数与最大人数不一致"),
    OVER_MAX_DRAW_NUM("4009", "报名人数超出规定的人数"),
    RECOMMENDER_BROKER_ERROR("4010", "推荐人或经纪人策略发生异常"),


    /** 服务端错误. */
    SERVER_ERROR("500", "服务端错误"),



    /** 业务异常. */
    SERVER_BIZ_ERROR("501", "业务异常"), USER_NOT_LOGIN("502", "用户没有登录");

    /** 响应Code. */
    private String code;
    /** 响应消息. */
    private String msg;

    /**
     * 构造方法.
     * @param code 响应Code
     * @param msg 响应消息
     */
    RespCode(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    /**
     * 转换成字符串（Json格式）.
     */
    public String toString() {
        StringBuffer buf = new StringBuffer();
        buf.append("{");
        buf.append("\"code\":").append(code).append(",");
        buf.append("\"msg\":\"").append(msg).append("\"");
        buf.append("}");
        return buf.toString();
    }

    /**
     * 获得响应Code.
     * @return 响应Code
     */
    public String getCode() {
        return code;
    }

    /**
     * 获得响应消息.
     * @return 响应消息
     */
    public String getMsg() {
        return msg;
    }
}
