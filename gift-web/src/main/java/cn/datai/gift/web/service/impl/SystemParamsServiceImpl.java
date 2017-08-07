package cn.datai.gift.web.service.impl;

import cn.datai.gift.persist.mapper.CommodityContractMapperExt;
import cn.datai.gift.persist.mapper.CommodityTypeMapperExt;
import cn.datai.gift.persist.mapper.SystemParamMapperExt;
import cn.datai.gift.persist.po.CommodityType;
import cn.datai.gift.persist.po.CommodityTypeExample;
import cn.datai.gift.persist.po.SystemParam;
import cn.datai.gift.persist.po.SystemParamExample;
import cn.datai.gift.persist.vo.commodity.CommodityVo;
import cn.datai.gift.utils.exception.BizException;
import cn.datai.gift.web.contants.RedisConstants;
import cn.datai.gift.web.service.RecommoenderAndBrokerService;
import cn.datai.gift.web.service.SystemParamsService;
import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/3/16.
 */
@Service
public class SystemParamsServiceImpl implements SystemParamsService{

    @Autowired
    private SystemParamMapperExt systemParamMapperExt;

    @Autowired
    private CommodityContractMapperExt commodityContractMapperExt;

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private CommodityTypeMapperExt commodityTypeMapperExt;

    @Autowired
    RecommoenderAndBrokerService recommoenderAndBrokerService;

    private final static Logger logger = LoggerFactory.getLogger(SystemParamsServiceImpl.class);

    /**
     * 查询系统参数配置
     *
     * @return
     */
    @Override
    public void querySystemParams() {
        SystemParamExample systemParamExample = new SystemParamExample();
        systemParamExample.createCriteria().andValidEqualTo("TRUE");
        List<SystemParam> list = systemParamMapperExt.selectByExample(systemParamExample);
        for (SystemParam systemParam : list){
            redisTemplate.boundHashOps(RedisConstants.SYSTEM_PARAMS).put(systemParam.getName(),systemParam.getValue());//key,value
        }

        recommoenderAndBrokerService.getRecommenderRulesByRedis();
    }

    /**
     * 缓存商品合约信息
     *
     * @return
     */
    @Override
    public void setCommodityContractRedis() {
       List<CommodityVo> list = commodityContractMapperExt.queryCommodityVo();
       if(null != list && !list.isEmpty()){
           for(CommodityVo commodityVo :list){
               redisTemplate.boundHashOps(RedisConstants.COMMODITY_SELF).put(commodityVo.getCommodityContractId().toString(), JSONObject.toJSONString(commodityVo));
           }
           redisTemplate.boundHashOps(RedisConstants.COMMODITY_ALL).put(RedisConstants.COMMODITY_KEY,JSONObject.toJSONString(list));
       }else{
           redisTemplate.delete(RedisConstants.COMMODITY_SELF);
           redisTemplate.delete(RedisConstants.COMMODITY_ALL);
       }


        List<CommodityType> commodityTypeList = commodityTypeMapperExt.selectByExample(new CommodityTypeExample());
        if(null == commodityTypeList || commodityTypeList.isEmpty()){
            logger.error("初始化商品类型发生异常");
            throw new BizException("初始化商品类型发生异常");
        }
        redisTemplate.boundHashOps(RedisConstants.COMMODITY_ALL_TYPE).put(RedisConstants.COMMODITY_ALL_TYPE_KEY,JSONObject.toJSONString(commodityTypeList));

    }
}
