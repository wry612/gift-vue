package cn.datai.gift.web.service;

import cn.datai.gift.persist.po.PayInfo;
import cn.datai.gift.persist.po.RefundOrderWx;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * pay_info数据库表相关操作
 * Created by H.CAAHN on 2017/4/20.
 */
public interface PayInfoService {
    /**
     * 查询指定渠道待支付总数
     * @param params
     * @return
     */
    int countUnPayInfo(Map<String, Object> params);

    /**
     * 分页查询指定渠道待支付数据
     * @param params
     * @param pageNo
     * @param size
     * @param total
     * @return
     */
    List<PayInfo> pageUnPayInfo(Map<String, Object> params, int pageNo, int size, int total);

    /**
     * 更新payInfo表的queryTime
     * @param payInfoId
     * @param querytime
     */
    void updatePayInfoQueryTime(Long payInfoId, Date querytime);
}
