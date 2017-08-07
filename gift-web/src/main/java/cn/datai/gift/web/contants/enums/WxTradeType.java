package cn.datai.gift.web.contants.enums;

/**
 * 微信交易类型
 * Created by zhangyutao on 2017/4/11.
 */
public enum WxTradeType {
    JSAPI("JSAPI", "微信公众号支付"),

    NATIVE("NATIVE", "微信原生扫码支付"),

    APP("APP", "微信app支付"),

    MICROPAY("MICROPAY", "微信刷卡支付");

    private String persistKey;

    private String name;

    WxTradeType(String persistKey, String name) {
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
