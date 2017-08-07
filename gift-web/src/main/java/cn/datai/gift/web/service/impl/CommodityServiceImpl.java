package cn.datai.gift.web.service.impl;

import cn.datai.gift.persist.mapper.GiftAccountMapperExt;
import cn.datai.gift.persist.mapper.OperatorInfoMapperExt;
import cn.datai.gift.persist.mapper.OperatorReltGiftAccountMapperExt;
import cn.datai.gift.persist.po.*;
import cn.datai.gift.persist.vo.commodity.CommodityVo;
import cn.datai.gift.web.contants.RedisConstants;
import cn.datai.gift.web.service.CommodityService;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.BoundHashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by zhangyutao on 2017/3/27.
 */
@Service
public class CommodityServiceImpl implements CommodityService {
    private static Logger logger = LoggerFactory.getLogger(CommodityServiceImpl.class);


    @Autowired
    private GiftAccountMapperExt giftAccountMapperExt;

    @Autowired
    private OperatorReltGiftAccountMapperExt operatorReltGiftAccountMapperExt;


    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private OperatorInfoMapperExt operatorInfoMapperExt;

    /**
     * 通过id查找商品合约信息
     *
     * @return
     */
    @Override
    public CommodityVo findById(long id) throws IOException {
        logger.debug("商品id:{}", id);
        logger.debug("redisTemplate:{}",redisTemplate.toString());
        BoundHashOperations boundHashOperations = redisTemplate.boundHashOps(RedisConstants.COMMODITY_SELF);
        if(null == boundHashOperations){
            return null;
        }
        String str = boundHashOperations.get(String.valueOf(id)).toString();
        ObjectMapper objectMapper = new ObjectMapper();
        CommodityVo commodityVo = objectMapper.readValue(str, CommodityVo.class);
        return commodityVo;
    }

    /**
     * 查询所有的商品合约信息
     * @return
     */
    @Override
    public List<CommodityVo> queryCommodityContract(Long commodityTypeId) throws IOException {
        List<CommodityVo> list = new ArrayList<>();
        BoundHashOperations boundHashOperations = redisTemplate.boundHashOps(RedisConstants.COMMODITY_ALL);
        if(null == boundHashOperations){
            return null;
        }
        Object object = boundHashOperations.get(RedisConstants.COMMODITY_KEY);
        if(null == object){
           return null;
        }
        List<CommodityVo> commodityVoList = JSONObject.parseArray(object.toString(),CommodityVo.class);
        if(0==commodityTypeId){
            list = commodityVoList;
        }else{
            for(CommodityVo commodityVo : commodityVoList){
                if(commodityVo.getCommodityTypeId() == commodityTypeId){
                    list.add(commodityVo);
                }
            }
        }
        return list;
    }

    /**
     * 查询所有商品类型
     *
     * @return
     */
    @Override
    public List<CommodityType> queryCommodityTypeList() {
        BoundHashOperations boundHashOperations = redisTemplate.boundHashOps(RedisConstants.COMMODITY_ALL_TYPE);
        if(null == boundHashOperations){
            return null;
        }
        Object object = boundHashOperations.get(RedisConstants.COMMODITY_ALL_TYPE_KEY);
        if(null == object){
            return null;
        }
        return JSONObject.parseArray(object.toString(),CommodityType.class);
    }

    /**
     * 根据条件创建查询业务概要记录
     *
     * @param BizId
     * @param commodityTypeId
     * @param date
     * @return
     */
    @Override
    public List<UserBizBrief> queryqueryUserBizBriefList(Long BizId, Long commodityTypeId, Date date) {
        return null;
    }

    @Override
    public GiftAccount queryOperaterGiftAccout(Long commodityId) throws IOException {
        CommodityVo commodityVo = this.findById(commodityId);

        OperatorReltGiftAccountExample example = new OperatorReltGiftAccountExample();
        example.createCriteria().andOperatorInfoIdEqualTo(commodityVo.getOperatorInfoId()).andCommodityContractIdEqualTo(commodityId);
        List<OperatorReltGiftAccount> operatorReltGiftAccountList = operatorReltGiftAccountMapperExt.selectByExample(example);
        Long giftAccountId = operatorReltGiftAccountList.get(0).getGiftAccountId();
        return giftAccountMapperExt.selectByPrimaryKey(giftAccountId);
    }

    @Override
    public OperatorInfo queryOperaterInfo(Long commodityId) throws IOException {
        CommodityVo commodityVo = this.findById(commodityId);

        OperatorReltGiftAccountExample example = new OperatorReltGiftAccountExample();
        example.createCriteria().andOperatorInfoIdEqualTo(commodityVo.getOperatorInfoId()).andCommodityContractIdEqualTo(commodityId);
        List<OperatorReltGiftAccount> operatorReltGiftAccountList = operatorReltGiftAccountMapperExt.selectByExample(example);
        Long operatorInfoId = operatorReltGiftAccountList.get(0).getOperatorInfoId();
        return operatorInfoMapperExt.selectByPrimaryKey(operatorInfoId);
    }

}
