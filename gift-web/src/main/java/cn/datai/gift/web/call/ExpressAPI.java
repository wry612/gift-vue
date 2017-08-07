package cn.datai.gift.web.call;

import cn.datai.gift.utils.exception.BizException;
import cn.datai.gift.web.call.express.ExpressCaller;
import cn.datai.gift.web.call.express.response.expressInfo.ExpressInfo;
import cn.datai.gift.web.call.express.response.expressList.ExpressList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import retrofit2.Call;

import java.io.IOException;

/**
 * Created by zhangyutao on 2017/7/25.
 */
@Component
public class ExpressAPI {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());


    @Autowired
    private ExpressCaller expressCaller;

    /**
     * 物流信息跟踪
     * @param companyCode
     * @param expressNumber
     * @return
     * @throws IOException
     */
    public ExpressInfo expressInfo(String companyCode, String expressNumber) throws IOException {
        Call<ExpressInfo> caller = this.expressCaller.expressInfo(companyCode, expressNumber);
        ExpressInfo expressInfo = caller.execute().body();
        if (expressInfo != null && expressInfo.getShowapiResCode() != 0) {
            logger.error("调用物流跟踪接口失败:", expressInfo);
            throw new BizException("调用物流跟踪接口失败！");
        }
        return expressInfo;
    }

    /**
     * 快递公司查询
     * @param expressName 快递/物流公司名称，比如传入 顺丰
     * @param maxSize     分页时,每页返回的最大记录数
     * @param page        分页的页数
     * @return
     */
    public ExpressList expressList(String expressName, long maxSize, long page) throws IOException {
        Call<ExpressList> caller = this.expressCaller.expressList(expressName, maxSize, page);
        ExpressList expressList = caller.execute().body();
        if (expressList != null && expressList.getShowapiResCode() != 0) {
            logger.error("调用快递公司查询接口失败:", expressList);
            throw new BizException("调用快递公司查询接口失败！");
        }
        return expressList;
    }
}
