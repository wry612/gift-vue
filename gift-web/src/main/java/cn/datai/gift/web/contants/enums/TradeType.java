package cn.datai.gift.web.contants.enums;

/**
 * 交易类型
 * Created by zhangyutao on 2017/4/5.
 */
public enum TradeType {
    BUY_ML("ml", "毫升"),
    BUY_BOTTLE("bottle", "瓶"),
    BUY_G("g","克"),
    BUY_BING("bing","饼");

    private String persistKey;

    private String name;

    TradeType(String persistKey, String name) {
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
