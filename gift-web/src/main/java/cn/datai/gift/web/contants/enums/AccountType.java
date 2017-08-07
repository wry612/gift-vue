package cn.datai.gift.web.contants.enums;

/**
 * 账户类型
 * Created by zhangyutao on 2017/3/16.
 */
public enum AccountType {
    OPERATOR("OPERATOR", "运营商"),

    USER("USER", "用户");

    private String persistKey;

    private String Value;

    AccountType(String persistKey, String value) {
        this.persistKey = persistKey;
        Value = value;
    }

    @Override
    public String toString() {
        return "AccountType{" +
                "persistKey='" + persistKey + '\'' +
                ", Value='" + Value + '\'' +
                '}';
    }

    public String getPersistKey() {
        return persistKey;
    }

    public String getValue() {
        return Value;
    }
}
