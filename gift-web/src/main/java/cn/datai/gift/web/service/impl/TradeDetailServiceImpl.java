package cn.datai.gift.web.service.impl;

import cn.datai.gift.persist.mapper.TradeOrderMapperExt;
import cn.datai.gift.persist.mapper.UserBizBriefMapperExt;
import cn.datai.gift.persist.po.*;
import cn.datai.gift.persist.vo.commodity.CommodityVo;
import cn.datai.gift.utils.DateUtil;
import cn.datai.gift.web.contants.StatusConstants;
import cn.datai.gift.web.contants.enums.ConversionStatus;
import cn.datai.gift.web.contants.enums.PayBizType;
import cn.datai.gift.web.service.CommodityService;
import cn.datai.gift.web.service.ConversionService;
import cn.datai.gift.web.service.TradeDetailService;
import cn.datai.gift.web.utils.MyStringUtil;
import cn.datai.gift.web.vo.Conversion.ConvertInfoVo;
import cn.datai.gift.web.vo.tradeDetail.AttachVo;
import cn.datai.gift.web.vo.tradeDetail.TradeDetailVo;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.support.odps.udf.CodecCheck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2017/4/27.
 */
@Service
public class TradeDetailServiceImpl implements TradeDetailService {

    @Autowired
    private UserBizBriefMapperExt userBizBriefMapperExt;

    @Autowired
    private CommodityService commodityService;

    @Autowired
    private TradeOrderMapperExt tradeOrderMapperExt;

    @Autowired
    private ConversionService conversionService;

    /**
     * 查询用户交易明细
     *
     * @param bizType
     * @param commodityTypeId
     * @param date
     * @param userInfoId
     * @return
     */
    @Override
    public List<TradeDetailVo> queryRecords(String bizType, Long commodityTypeId, String date, Long userInfoId) throws IOException {
        List<TradeDetailVo> list = new ArrayList<>();
        Date beginDateTime = DateUtil.monthStart(date);
        Date endDateTime = DateUtil.monthEnd(date);

        UserBizBriefExample userBizBriefExample = new UserBizBriefExample();
        userBizBriefExample.setOrderByClause("CREATE_TIME DESC");
        UserBizBriefExample.Criteria criteria = userBizBriefExample.createCriteria();
        criteria.andUserInfoIdEqualTo(userInfoId).andCreateTimeBetween(beginDateTime,endDateTime);
        if(!StringUtils.isEmpty(bizType)){
            criteria.andBizTypeEqualTo(bizType);
        }
        if(commodityTypeId>0){
            criteria.andCommodityTypeIdEqualTo(commodityTypeId);
        }
        List<UserBizBrief> userBizBriefs = userBizBriefMapperExt.selectByExample(userBizBriefExample);

        for(UserBizBrief userBizBrief :userBizBriefs){
            TradeDetailVo tradeDetailVo = new TradeDetailVo();
            tradeDetailVo.setBizId(userBizBrief.getBizId());
            tradeDetailVo.setBizType(userBizBrief.getBizType());
            tradeDetailVo.setCommodityContractId(userBizBrief.getCommodityContractId());
            tradeDetailVo.setCreateTime(userBizBrief.getCreateTime());
            tradeDetailVo.setOpCommodityUnitQuantity(userBizBrief.getOpCommodityUnitQuantity());
            tradeDetailVo.setAttach(userBizBrief.getAttach());
            CommodityVo commodityVo = commodityService.findById(userBizBrief.getCommodityContractId());
            tradeDetailVo.setCommodityName(commodityVo.getCommodityName());
            tradeDetailVo.setUnitPrice(commodityVo.getUnitPrice());
            tradeDetailVo.setUnit(commodityVo.getUnit());
            tradeDetailVo.setUnitEn(commodityVo.getUnitEn());
            tradeDetailVo.setCommodityStandardPrice(commodityVo.getStandardPrice() != null ? commodityVo.getStandardPrice().toString() : null);
            tradeDetailVo.setStandardUnitName(commodityVo.getStandardUnitName());
            tradeDetailVo.setCommodityTypeId(commodityVo.getCommodityTypeId());
            tradeDetailVo.setSubjectMatter(commodityVo.getSubjectMatter());
            tradeDetailVo.setBizStatus(userBizBrief.getBizStatus());
            tradeDetailVo.setTypeName(commodityVo.getTypeName());

            //兑换物品的个数(份数):总量除上兑换的比例
            if(userBizBrief.getBizType().equals(PayBizType.CONVERSION.getPersistKey())){
                ConvertInfoVo convertInfoVo = this.queryConvertInfoVoByConvertObjOrderId(Long.valueOf(userBizBrief.getBizId()));
                int operateNum = userBizBrief.getOpCommodityUnitQuantity().intValue() / convertInfoVo.getConvertRule().getComodityObjRatio();
                tradeDetailVo.setRuleType(convertInfoVo.getConvertObjOrder().getRuleType());
                tradeDetailVo.setWin(convertInfoVo.getConvertObjOrder().getWin());
                tradeDetailVo.setOperateNum(operateNum);
                tradeDetailVo.setConvertStatus(convertInfoVo.getConvertObjOrder().getStatus());
                tradeDetailVo.setCommodityName(convertInfoVo.getConvertObj().getFullName());//是以物换物和抽奖类型的话，将名称替换为要兑换的物品
                tradeDetailVo.setUnitName(convertInfoVo.getConvertObj().getUnitName());//物品单位类型
                tradeDetailVo.setMarketPrice(convertInfoVo.getConvertObj().getMarketPrice());//市场价

                Integer signSeq = convertInfoVo.getConvertObjOrder().getSignSeq();
                tradeDetailVo.setSignSeq(signSeq == null ?"":signSeq.toString());//活动序列号
                AttachVo attachVo = JSONObject.parseObject(userBizBrief.getAttach(), AttachVo.class);
                if(attachVo != null && MyStringUtil.isNotBlank(attachVo.getOrderGroupId())){
                    tradeDetailVo.setOrderGroupId(attachVo.getOrderGroupId());//订单组Id
                }
            }
            list.add(tradeDetailVo);
        }
        return list;
    }

    /**
     * 买详细信息
     * @param tradeOrderId
     * @return
     */
    @Override
    public TradeOrder queryTradeOrder(Long tradeOrderId) {
        return tradeOrderMapperExt.selectByPrimaryKey(tradeOrderId);
    }

    /**
     * 通过业务类型和业务ID查询业务概况
     *
     * @param bizId
     * @param bizType
     * @return
     */
    @Override
    public List<UserBizBrief> queryUserBizBriefList(Long bizId, String bizType) {
        UserBizBriefExample userBizBriefExample = new UserBizBriefExample();
        userBizBriefExample.createCriteria().andBizIdEqualTo(bizId.toString()).andBizTypeEqualTo(bizType);
        return userBizBriefMapperExt.selectByExample(userBizBriefExample);
    }

    /**
     * 通过以物换物Id查询以物换物订单相关信息
     * @param convertObjOrderId                    objOrder.setStatus(ConversionStatus.NOT_DELIVER.getPersistKey());//设置为待发货状态

     * @return
     */
    @Override
    public ConvertInfoVo queryConvertInfoVoByConvertObjOrderId(Long convertObjOrderId) {
        ConvertObjOrder convertObjOrder = conversionService.queryConvertObjOrderById(convertObjOrderId);
        ConvertRule convertRule = conversionService.queryConvertRuleById(convertObjOrder.getConvertObjId(), convertObjOrder.getCommodityContractId());
        ConvertObj convertObj = conversionService.findDetailById(convertObjOrder.getConvertObjId());
        return new ConvertInfoVo(convertObj,convertObjOrder,convertRule,null);
    }
}
