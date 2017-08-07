package cn.datai.gift.web.contants.enums;

/**
 * Created by zhangyutao on 2017/4/11.
 */
public enum PayChannel {
    WX("WX", "微信支付"),

    ALI("ALI", "支付宝支付"),

    UN("UN", "银联支付");

    private String persistKey;

    private String name;

    PayChannel(String persistKey, String name) {
        this.persistKey = persistKey;
        this.name = name;
    }

    @Override
    public String toString() {
        return "PayChannel{" +
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
