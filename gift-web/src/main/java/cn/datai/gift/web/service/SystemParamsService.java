package cn.datai.gift.web.service;

/**
 * Created by Administrator on 2017/3/16.
 */
public interface SystemParamsService {
    /**
     * 查询系统参数配置
     * @return
     */
    void querySystemParams();

    /**
     * 缓存商品合约信息
     * @return
     */
    void setCommodityContractRedis();

}
