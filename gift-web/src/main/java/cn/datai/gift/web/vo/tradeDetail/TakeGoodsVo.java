package cn.datai.gift.web.vo.tradeDetail;

import cn.datai.gift.persist.po.DeliveryOrder;
import cn.datai.gift.persist.vo.commodity.CommodityVo;

/**
 * Created by Administrator on 2017/5/3.
 */
public class TakeGoodsVo {
    private CommodityVo commodityVo;
    private DeliveryOrder deliveryOrder;

    private Long timeOut;

    public TakeGoodsVo(CommodityVo commodityVo,DeliveryOrder deliveryOrder,Long timeOut){
        this.commodityVo=commodityVo;
        this.deliveryOrder=deliveryOrder;
        this.timeOut =timeOut;
    }

    public Long getTimeOut() {
        return timeOut;
    }

    public void setTimeOut(Long timeOut) {
        this.timeOut = timeOut;
    }

    public CommodityVo getCommodityVo() {
        return commodityVo;
    }

    public void setCommodityVo(CommodityVo commodityVo) {
        this.commodityVo = commodityVo;
    }

    public DeliveryOrder getDeliveryOrder() {
        return deliveryOrder;
    }

    public void setDeliveryOrder(DeliveryOrder deliveryOrder) {
        this.deliveryOrder = deliveryOrder;
    }
}
