package cn.datai.gift.web.contants.enums;

/**
 * 支付基本信息状态
 * Created by zhangyutao on 2017/4/21.
 */
public enum  PayInfoStatus {

    NO_CHANNEL("NO_CHANNEL", "订单已生成，但未选择支付渠道"),

    UNPAYING("UNPAYING", "支付渠道已选择，但未付款"),

    CANCELLED("CANCELLED", "支付已取消"),

    SUCCESS("SUCCESS", "支付成功");


    private String persistKey;

    private String name;

    PayInfoStatus(String persistKey, String name) {
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
