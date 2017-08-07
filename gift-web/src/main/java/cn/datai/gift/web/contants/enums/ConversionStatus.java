package cn.datai.gift.web.contants.enums;

/**
 * 以物换物订单状态
 * Created by zhangyutao on 2017/4/21.
 */
public enum ConversionStatus {

    ORDERED("ORDERED", "已下单"),

    NOT_DELIVER("NOT_DELIVER", "待发货"),

    DELIVERED("DELIVERED", "已发货"),

    CANCELLED("CANCELLED", "已取消"),

    /**
     * 已确认谁中奖，谁没中奖
     */
    DRAW("DRAW", "已开奖"),

    SUCCESS("SUCCESS", "订单完成");


    private String persistKey;

    private String name;

    ConversionStatus(String persistKey, String name) {
        this.persistKey = persistKey;
        this.name = name;
    }

    @Override
    public String toString() {
        return "ConversionStatus{" +
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
