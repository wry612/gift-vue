package cn.datai.gift.web.vo.Conversion;

import cn.datai.gift.persist.po.ActivityPresent;
import cn.datai.gift.persist.po.UserInfo;
import cn.datai.gift.persist.vo.commodity.CommodityVo;

/**
 * Created by Administrator on 2017/7/28.
 */
public class RecommenderVo {
    private ActivityPresent activityPresent;

    private CommodityVo commodityVo;

    private UserInfo userInfo;

    public RecommenderVo(ActivityPresent activityPresent, CommodityVo commodityVo, UserInfo userInfo) {
        this.activityPresent = activityPresent;
        this.commodityVo = commodityVo;
        this.userInfo = userInfo;
    }

    public ActivityPresent getActivityPresent() {
        return activityPresent;
    }

    public void setActivityPresent(ActivityPresent activityPresent) {
        this.activityPresent = activityPresent;
    }

    public CommodityVo getCommodityVo() {
        return commodityVo;
    }

    public void setCommodityVo(CommodityVo commodityVo) {
        this.commodityVo = commodityVo;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

}
