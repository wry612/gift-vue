package cn.datai.gift.web.call.express;

import cn.datai.gift.web.call.express.response.expressInfo.ExpressInfo;
import cn.datai.gift.web.call.express.response.expressList.ExpressList;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ExpressCaller {

    /**
     * 物流跟踪
     * @param companyCode <p>快递公司字母简称,可以从"快递公司查询 中查到该信息 如不知道快递公司名,可以使用"auto"代替,此时将自动识别快递单号所属公司.但不推荐大面积使用auto,因为有部分快递公司的单号相互之间有重叠,识别后查询易导致查询失败</p>
     * @param expressNumber 单号
     * @return
     */
    @GET("showapi_expInfo")
    Call<ExpressInfo> expressInfo(@Query("com") String companyCode, @Query("nu") String expressNumber);

    /**
     * 快递公司查询
     * @param expressName 快递/物流公司名称，比如传入 顺丰
     * @param maxSize     分页时,每页返回的最大记录数
     * @param page        分页的页数
     * @return
     */
    @GET("showapi_expressList")
    Call<ExpressList> expressList(@Query("expName") String expressName, @Query("maxSize") long maxSize, @Query("page") long page);

}
