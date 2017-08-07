package cn.datai.gift.web.contants.enums;

/**
 * 商品买卖状态
 * Created by zhangyutao on 2017/4/21.
 */
public enum TradeOrderStatus {

    NOPAY("NOPAY","未支付"),

    SUCCESS("SUCCESS", "订单成功完成"),

    CANCELLED("CANCELLED", "订单已取消");

    private String persistKey;

    private String name;

    TradeOrderStatus(String persistKey, String name) {
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
