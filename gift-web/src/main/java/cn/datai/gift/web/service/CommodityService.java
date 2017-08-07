package cn.datai.gift.web.service;

import cn.datai.gift.persist.po.CommodityType;
import cn.datai.gift.persist.po.GiftAccount;
import cn.datai.gift.persist.po.OperatorInfo;
import cn.datai.gift.persist.po.UserBizBrief;
import cn.datai.gift.persist.vo.commodity.CommodityVo;

import java.io.IOException;
import java.util.Date;
import java.util.List;

/**
 * 商品信息
 * Created by zhangyutao on 2017/3/27.
 */
public interface CommodityService {

    /**
     * 通过id查找商品合约信息(redis)
     * @return
     */
    CommodityVo findById(long id) throws IOException;

    /**
     * 根据商品类型查询所有商品类型（0：查询全部）(redis)
     * @return
     */
    List<CommodityVo> queryCommodityContract(Long commodityTypeId) throws IOException;

    /**
     * 查询所有商品类型
     * @return
     */
    List<CommodityType> queryCommodityTypeList();

    /**
     * 根据条件创建查询业务概要记录
     * @param BizId
     * @param commodityTypeId
     * @param date
     * @return
     */
    List<UserBizBrief> queryqueryUserBizBriefList(Long BizId, Long commodityTypeId, Date date);

    GiftAccount queryOperaterGiftAccout(Long commodityId) throws IOException;

    OperatorInfo queryOperaterInfo(Long commodityId) throws IOException;

}
