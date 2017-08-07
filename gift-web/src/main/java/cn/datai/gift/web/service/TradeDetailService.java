package cn.datai.gift.web.service;

import cn.datai.gift.persist.po.TradeOrder;
import cn.datai.gift.persist.po.UserBizBrief;
import cn.datai.gift.web.vo.Conversion.ConvertInfoVo;
import cn.datai.gift.web.vo.tradeDetail.TradeDetailVo;

import java.io.IOException;
import java.util.List;

/**
 * Created by Administrator on 2017/4/27.
 */
public interface TradeDetailService {

    /**
     * 查询用户交易明细
     * @param bizType
     * @param commodityTypeId
     * @param date
     * @param userInfoId
     * @return
     */
    List<TradeDetailVo> queryRecords(String bizType, Long commodityTypeId, String date, Long userInfoId) throws IOException;

    /**
     * 买详细信息
     * @param tradeOrderId
     * @return
     */
    TradeOrder queryTradeOrder(Long tradeOrderId);

    /**
     * 通过业务类型和业务ID查询业务概况
     * @param bizId
     * @param bizType
     * @return
     */
    List<UserBizBrief> queryUserBizBriefList(Long bizId,String bizType);

    /**
     * 通过以物换物Id查询以物换物订单相关信息
     * @param convertObjOrderId
     * @return
     */
    ConvertInfoVo queryConvertInfoVoByConvertObjOrderId(Long convertObjOrderId);


}
