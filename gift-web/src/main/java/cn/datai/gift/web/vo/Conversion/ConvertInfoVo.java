package cn.datai.gift.web.vo.Conversion;

import cn.datai.gift.persist.po.ConvertObj;
import cn.datai.gift.persist.po.ConvertObjOrder;
import cn.datai.gift.persist.po.ConvertRule;
import cn.datai.gift.persist.vo.commodity.CommodityVo;

/**
 * Created by Administrator on 2017/6/27.
 */
public class ConvertInfoVo {

    private ConvertObj convertObj;

    private ConvertObjOrder convertObjOrder;

    private ConvertRule convertRule;

    private CommodityVo commodityVo;

    public ConvertInfoVo(){}

    public ConvertInfoVo(ConvertObj convertObj,ConvertObjOrder convertObjOrder,ConvertRule convertRule,CommodityVo commodityVo){
        this.convertObj = convertObj;
        this.convertObjOrder = convertObjOrder;
        this.convertRule = convertRule;
        this.commodityVo = commodityVo;
    }

    public CommodityVo getCommodityVo() {
        return commodityVo;
    }

    public void setCommodityVo(CommodityVo commodityVo) {
        this.commodityVo = commodityVo;
    }

    public ConvertRule getConvertRule() {
        return convertRule;
    }

    public void setConvertRule(ConvertRule convertRule) {
        this.convertRule = convertRule;
    }

    public ConvertObj getConvertObj() {
        return convertObj;
    }

    public void setConvertObj(ConvertObj convertObj) {
        this.convertObj = convertObj;
    }

    public ConvertObjOrder getConvertObjOrder() {
        return convertObjOrder;
    }

    public void setConvertObjOrder(ConvertObjOrder convertObjOrder) {
        this.convertObjOrder = convertObjOrder;
    }

    @Override
    public String toString() {
        return "ConvertInfoVo{" +
                "convertObj=" + convertObj +
                ", convertObjOrder=" + convertObjOrder +
                '}';
    }
}
