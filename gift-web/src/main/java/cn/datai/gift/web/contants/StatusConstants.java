package cn.datai.gift.web.contants;

/**
 * Created by Administrator on 2017/3/15.
 */
public interface StatusConstants {

    /**
     * 合约状态--有效
     */
    String COMMODITY_STATUS_Y = "Y";

    /**
     * 合约状态--无效
     */
    String COMMODITY_STATUS_N = "N";

    /**
     * 一个红包最多发给10万人
     */
    String MAX_PEOPLE_COUNT = "MAX_PEOPLE_COUNT";

    /**
     * 红包类型
     */
    String GIFT_TYPE = "GIFT_TYPE";

    /**
     * 超时时间 一秒为单位(红包退回)
     */
    String EXPIRE_TIME = "EXPIRE_TIME";


    /**
     * 一个人一个红包最多获取单位数
     */
    String SINGLE_PEOPLE_ACCEPT = "SINGLE_PEOPLE_ACCEPT";

    /**
     * 提货时的默认超时时间，以秒为单位，默认十分钟
     */
    String DELIVERY_ORDER_EXPIRE_TIME =  "DELIVERY_ORDER_EXPIRE_TIME";

    /**
     * 购买商品时的默认超时时间，以秒为单位，默认十分钟
     */
    String TRADE_ORDER_EXPIRE_TIME = "TRADE_ORDER_EXPIRE_TIME";

    /**
     * 是否需要输入密码
     */
    String NEED_PWD = "NEED_PWD";

    /**
     * 是否需要绑定
     */
    String NEED_BIND = "NEED_BIND";

    /**
     * 用户参加抽奖活动的初始默认开始编号
     */
    String ACTIVITY_BEGIN_SEQ = "ACTIVITY_BEGIN_SEQ";

    /**
     * 推荐人cookie有效时间，数据库默认一天
     */
    String RECOMMENDER_MAX_AGE = "RECOMMENDER_MAX_AGE";

    String BROKER_PARAM_OLD_GIFT = "BROKER_PARAM_OLD_GIFT";

    String BROKER_PARAM_NEW_GIFT = "BROKER_PARAM_NEW_GIFT";

    String BROKER_PARAM_NEW_ID = "BROKER_PARAM_NEW_ID";

    String BROKER_PARAM_OLD_ID ="BROKER_PARAM_OLD_ID";

    String CERTER_USER_ID = "CERTER_USER_ID";

    String BROKER_PARAM_VALID ="BROKER_PARAM_VALID";


    /**
     * 兑换和抽奖活动增加两个限制： 可以限定每人每次购买的最大份数
     */
    String MAX_CONVERSION_DRAW = "MAX_CONVERSION_DRAW";

}
