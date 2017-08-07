package cn.datai.gift.web.contants.enums;

/**
 * 支付基本信息的退款状态
 * Created by zhangyutao on 2017/4/21.
 */
public enum PayInfoRefundStatus {


    CREATED("CREATED", "本地数据库创建了退款订单信息, 但有没有上报微信未知, 此状态只在Pay_Info表中有"),

    PROCESSING("PROCESSING", "退款处理中"),

    CHANGE("CHANGE", "退款异常，退款到银行发现用户的卡作废或者冻结了，导致原路退款银行卡失败，商户可以发起异常退款处理的申请，可以退款到用户的新卡或者退款商户，商户自行处理。$n为下标，从0开始编号。"),

    REFUNDCLOSE("REFUNDCLOSE", "退款关闭"),

    SUCCESS("SUCCESS", "退款成功");


    private String persistKey;

    private String name;

    PayInfoRefundStatus(String persistKey, String name) {
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
