package cn.datai.gift.web.service.impl;

import cn.datai.gift.persist.mapper.PayInfoMapperExt;
import cn.datai.gift.persist.mapper.PayRefundOrderWxMapperExt;
import cn.datai.gift.persist.mapper.RefundOrderWxMapperExt;
import cn.datai.gift.persist.po.*;
import cn.datai.gift.persist.vo.Page;
import cn.datai.gift.web.contants.enums.PayInfoStatus;
import cn.datai.gift.web.service.PayInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * pay_info数据库表相关操作
 * Created by H.CAAHN on 2017/4/20.
 */
@Service
public class PayInfoServiceImpl implements PayInfoService {
    @Autowired
    private PayInfoMapperExt payInfoMapperExt;

    public int countUnPayInfo(Map<String, Object> params) {
        return payInfoMapperExt.countUnPayInfo(params);
    }

    @Transactional(isolation = Isolation.READ_COMMITTED)
    public List<PayInfo> pageUnPayInfo(Map<String, Object> params, int pageNo, int size, int total) {
        params.put("page", new Page(true, pageNo, size, total));
        return payInfoMapperExt.selectUnPayInfo(params);
    }

    @Transactional
    public void updatePayInfoQueryTime(Long payInfoId, Date querytime) {
        PayInfo pay = new PayInfo();
        pay.setPayInfoId(payInfoId);
        pay.setQueryTime(querytime);
        this.payInfoMapperExt.updateByPrimaryKeySelective(pay);
    }
}
