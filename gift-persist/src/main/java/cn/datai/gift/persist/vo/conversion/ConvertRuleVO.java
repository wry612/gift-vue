package cn.datai.gift.persist.vo.conversion;

import cn.datai.gift.persist.po.CommodityContract;
import cn.datai.gift.persist.po.ConvertRule;
import cn.datai.gift.persist.po.GiftAccount;

/**
 * 以物换物兑换条件
 * Created by zhangyutao on 2017/6/21.
 */
public class ConvertRuleVO extends ConvertRule{

    /**
     * 商品信息
     */
    private CommodityContract commodityContract;

    /**
     * 用户拥有的持仓
     */
    private GiftAccount userOwned;

    public GiftAccount getUserOwned() {
        return userOwned;
    }

    public void setUserOwned(GiftAccount userOwned) {
        this.userOwned = userOwned;
    }

    public CommodityContract getCommodityContract() {
        return commodityContract;
    }

    public void setCommodityContract(CommodityContract commodityContract) {
        this.commodityContract = commodityContract;
    }
}
