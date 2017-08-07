package cn.datai.gift.web.contants.enums;

/**
 * 礼包类型
 * Created by zhangyutao on 2017/3/21.
 */
public enum GiftType {

    SPECIFIED("0", "赠与指定的单一用户"),

    LUCKY("1", "拼手气"),

    AVERAGE("2", "普通，平均的");

    private String persistKey;

    private String name;

    GiftType(String persistKey, String name) {
        this.persistKey = persistKey;
        this.name = name;
    }

    @Override
    public String toString() {
        return "GiftType{" +
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
