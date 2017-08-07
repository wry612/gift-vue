package cn.datai.gift.web.contants.enums;

/**
 * 商品流通业务类型
 * Created by zhangyutao on 2017/4/5.
 */
public enum CommodityFlowType {

    OTHER_SYS_TRANSFER_IN("OTHER_SYS_TRANSFER_IN", "从外部系统转入"),
    OTHER_SYS_TRANSFER_OUT("OTHER_SYS_TRANSFER_OUT", "转出本系统"),

    GIFT_GIVE("GIFT_GIVE", "发红包"),
    GIFT_ACCEPT("GIFT_ACCEPT", "接受红包"),
    GIFT_REFUND("GIFT_REFUND", "退还过期红包"),

    PICK_UP("PICK_UP", "商品提货"),
    PICK_UP_CANCEL("PICK_UP_CANCEL", "商品提货取消"),

    BUY("BUY", "购买商品"),
    BUY_CANCEL("BUY_CANCEL", "购买商品取消"),
    OBJ_CONVERT_OBJ("OBJ_CONVERT_OBJ","以物换物"),
    OBJ_CONVERT_DRAW("OBJ_CONVERT_DRAW","以物换物抽奖"),

    TRANSFER_CENTER_TO_USER("TRANSFER_CENTER_TO_USER", "平台账户转账给其他用户"),
    REGISTER_PRESENT("REGISTER_PRESENT", "用户注册时相关的送礼");


    private String persistKey;

    private String name;

    CommodityFlowType(String persistKey, String name) {
        this.persistKey = persistKey;
        this.name = name;
    }

    @Override
    public String toString() {
        return "TradeType{" +
                "persistKey='" + persistKey + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public String getPersistKey() {
        return persistKey;
    }

    public String getName() {
        return name;
    }
}
