package cn.datai.gift.web.contants.enums;

/**
 * 提货状态
 * Created by zhangyutao on 2017/4/21.
 */
public enum DeliveryOrderStatus {

    NOPAY("NOPAY","未支付"),

    CANCELLED("CANCELLED", "订单已取消"),

    NOT_DELIVER("NOT_DELIVER", "待发货"),

    DELIVERED("DELIVERED", "已发货");


    private String persistKey;

    private String name;

    DeliveryOrderStatus(String persistKey, String name) {
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
