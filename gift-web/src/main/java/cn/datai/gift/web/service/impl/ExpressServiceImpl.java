package cn.datai.gift.web.service.impl;

import cn.datai.gift.persist.mapper.ExpressInfoMapperExt;
import cn.datai.gift.persist.po.ExpressInfo;
import cn.datai.gift.utils.DateUtil;
import cn.datai.gift.utils.enums.RespCode;
import cn.datai.gift.utils.exception.BizException;
import cn.datai.gift.web.call.ExpressAPI;
import cn.datai.gift.web.call.express.response.expressInfo.Data;
import cn.datai.gift.web.service.ExpressService;
import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.BoundValueOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.BindException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * 物流信息
 * Created by zhangyutao on 2017/7/11.
 */
@Service
public class ExpressServiceImpl implements ExpressService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ExpressInfoMapperExt expressInfoMapperExt;

    @Autowired
    private ExpressAPI expressAPI;

    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public ExpressInfo selectByExpressInfoId(long expressInfoId, long userInfoId) throws IOException, ParseException {

        //TODO 1 查缓存， 有：直接返回， 没有：往下执行
        BoundValueOperations boundValueOperations = redisTemplate.boundValueOps("cache:expressInfo:" + userInfoId + "_" + expressInfoId);
        Object cacheObj = boundValueOperations.get();
        if (cacheObj != null) {
            ExpressInfo expressInfo = JSONObject.parseObject(cacheObj.toString(), ExpressInfo.class);
            return expressInfo;
        }


        //2 查数据库，检查上次真实查询时间与当前时间对比， 小于半小时或状态已退回或状态已签收：直接返回数据库结果,缓存时间为差值    否则：往下执行
        ExpressInfo expressInfo = this.expressInfoMapperExt.selectByPrimaryKey(expressInfoId);
        if (expressInfo == null) {
            throw new BizException(RespCode.EXPRESS_INFO_NOT_FOUND);
        }
        if (expressInfo.getUserInfoId() == null || !expressInfo.getUserInfoId().equals(userInfoId)) {
            throw new BindException("不能查看其它用户的物流信息");
        }

        Date queryTime = expressInfo.getQueryTime();//上次真实查询时间
        if (expressInfo.getQueryTime() != null) {
            long distanceTime = System.currentTimeMillis() - queryTime.getTime();
            if (distanceTime < 1800000) {
                //真实查询时间小于半小时，不允许调用物流数据接口，直接返回数据库结果，并缓存, ttl设为真实查询后半小时与当前时间的差值
                //缓存
                boundValueOperations.set(JSONObject.toJSONString(expressInfo), DateUtil.afterNMin(queryTime, 30).getTime() - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
                return expressInfo;
            }
        }

        String status = expressInfo.getStatus();
        if (status.equals("4") || status.equals("10")) {
            //状态为已签收或已退回，不用再调数据接口，直接返回数据库结果，并缓存
            //缓存
            boundValueOperations.set(JSONObject.toJSONString(expressInfo), 30, TimeUnit.MINUTES);
            return expressInfo;
        }

        //3 调用物流跟踪数据接口， 更新数据库，缓存
        cn.datai.gift.web.call.express.response.expressInfo.ExpressInfo expressInfo1 = this.expressAPI.expressInfo(expressInfo.getExpSpellName(), expressInfo.getMailNo());
        this.rawDataToExpressInfo(expressInfo1, expressInfo);
        this.expressInfoMapperExt.updateByPrimaryKeySelective(expressInfo);
        //缓存
        boundValueOperations.set(JSONObject.toJSONString(expressInfo), 30, TimeUnit.MINUTES);
        return expressInfo;
    }

    /**
     * 将从接口数据获取的数据对象转为数据库对象
     * @param fromExpressInfo
     * @param toExpressInfo
     * @return
     */
    private ExpressInfo rawDataToExpressInfo(cn.datai.gift.web.call.express.response.expressInfo.ExpressInfo fromExpressInfo, ExpressInfo toExpressInfo) throws ParseException {
        String updateStr = fromExpressInfo.getShowapiResBody().getUpdateStr();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date dataUpdateTime = sdf.parse(updateStr);
        toExpressInfo.setDataUpdateTime(dataUpdateTime);

        toExpressInfo.setQueryTime(Calendar.getInstance().getTime());//不使用对方的数据，使用服务器本地时间

        toExpressInfo.setStatus(String.valueOf(fromExpressInfo.getShowapiResBody().getStatus()));

        toExpressInfo.setTel(fromExpressInfo.getShowapiResBody().getTel());

        List<Data> data = fromExpressInfo.getShowapiResBody().getData();
        toExpressInfo.setDatum(JSONObject.toJSONString(data));

        return toExpressInfo;
    }

}
