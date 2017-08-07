package cn.datai.gift.web.service;

import cn.datai.gift.persist.po.ExpressInfo;

import java.io.IOException;
import java.text.ParseException;

/**
 * 物流信息
 * Created by zhangyutao on 2017/7/11.
 */
public interface ExpressService {

    /**
     * 通过id查询物流信息
     * @param expressInfoId
     * @param userInfoId
     */
    ExpressInfo selectByExpressInfoId(long expressInfoId, long userInfoId) throws IOException, ParseException;
}
