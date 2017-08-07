package cn.datai.gift.web.contants.enums;

/**
 * 支付业务类型
 * Created by zhangyutao on 2017/4/5.
 */
public enum PayBizType {
    BUY_COMMODITY("BUY_COMMODITY", "购买商品"),
    DELIVERY("DELIVERY", "提货"),
    GIVE_GIFT("GIVE_GIFT", "发礼包"),
    ACCEPT_GIFT("ACCEPT_GIFT", "收礼包"),
    CONVERSION("CONVERSION", "以物换物"),
    DONATE("DONATE", "以物换物");

    private String persistKey;

    private String name;

    PayBizType(String persistKey, String name) {
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
