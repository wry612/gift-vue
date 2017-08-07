package cn.datai.gift.web.vo.tradeDetail;

import cn.datai.gift.persist.po.TradeOrder;
import cn.datai.gift.persist.vo.commodity.CommodityVo;

/**
 * Created by Administrator on 2017/5/2.
 */
public class TradeOrderVo{
    private TradeOrder tradeOrder;

    private CommodityVo commodityVo;

    private Long timeOut;

    public TradeOrderVo(TradeOrder tradeOrder,CommodityVo commodityVo,Long timeOut){
        this.tradeOrder = tradeOrder;
        this.commodityVo = commodityVo;
        this.timeOut = timeOut;
    }

    public Long getTimeOut() {
        return timeOut;
    }

    public void setTimeOut(Long timeOut) {
        this.timeOut = timeOut;
    }

    public TradeOrder getTradeOrder() {
        return tradeOrder;
    }

    public void setTradeOrder(TradeOrder tradeOrder) {
        this.tradeOrder = tradeOrder;
    }

    public CommodityVo getCommodityVo() {
        return commodityVo;
    }

    public void setCommodityVo(CommodityVo commodityVo) {
        this.commodityVo = commodityVo;
    }
}
