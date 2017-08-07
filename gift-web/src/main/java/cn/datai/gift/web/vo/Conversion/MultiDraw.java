package cn.datai.gift.web.vo.Conversion;

import java.math.BigDecimal;

/**
 * Created by Administrator on 2017/7/20.
 */
public class MultiDraw {

    /**
     * 奖品等级
     */
    private String prizeLevel;

    /**
     * 奖品名称
     */
    private String prizeName;

    /**
     * 奖品数量
     */
    private int prizeNum;

    /**
     * 价值
     */
    private BigDecimal price;

    public MultiDraw(){}

    public String getPrizeLevel() {
        return prizeLevel;
    }

    public void setPrizeLevel(String prizeLevel) {
        this.prizeLevel = prizeLevel;
    }

    public String getPrizeName() {
        return prizeName;
    }

    public void setPrizeName(String prizeName) {
        this.prizeName = prizeName;
    }

    public int getPrizeNum() {
        return prizeNum;
    }

    public void setPrizeNum(int prizeNum) {
        this.prizeNum = prizeNum;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public MultiDraw(String prizeLevel, String prizeName, int prizeNum, BigDecimal price) {
        this.prizeLevel = prizeLevel;
        this.prizeName = prizeName;
        this.prizeNum = prizeNum;
        this.price = price;
    }
}
