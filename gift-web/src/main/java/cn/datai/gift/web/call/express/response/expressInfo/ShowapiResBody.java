package cn.datai.gift.web.call.express.response.expressInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangyutao on 2017/7/13.
 */
public class ShowapiResBody {

    @JsonCreator
    public ShowapiResBody() {
    }

    /**
     * 快递单号
     */
    @JsonProperty("mailNo")
    private String mailNo;

    /**
     * 数据最后查询的时间, 例：1466926312666
     */
    @JsonProperty("update")
    private long update;

    /**
     * 数据最后更新的时间 例：2016-06-26 15:31:52
     */
    @JsonProperty("updateStr")
    private String updateStr;

    /**
     * 接口调用是否成功,0为成功,其他为失败
     */
    @JsonProperty("ret_code")
    private int ret_code;

    /**
     * 物流信息是否获取成功
     */
    @JsonProperty("flag")
    private boolean flag;

    /**
     * data数量
     */
    @JsonProperty("dataSize")
    private int dataSize;

    /**
     * -1 待查询 0 查询异常 1 暂无记录 2 在途中 3 派送中 4 已签收 5 用户拒签 6 疑难件 7 无效单
     * 8 超时单 9 签收失败 10 退回
     */
    @JsonProperty("status")
    private int status;

    /**
     * 快递公司电话
     */
    @JsonProperty("tel")
    private String tel;

    /**
     * 快递字母简称
     */
    @JsonProperty("expSpellName")
    private String expSpellName;

    /**
     * 具体快递路径信息
     */
    @JsonProperty("data")
    @JsonDeserialize(as = ArrayList.class, contentAs = Data.class)
    private List<Data> data;

    /**
     * 当auto查询失败的时候,返回此信息,成功时不返回,用户表示该单号可能属于那些快递物流公司
     */
    @JsonProperty("possibleExpList")
    @JsonDeserialize(as = ArrayList.class, contentAs = PossibleExp.class)
    private List<PossibleExp> possibleExpList;

    @JsonProperty("expTextName")
    private String expTextName;

    @JsonProperty("msg")
    private String msg;

    public class PossibleExp {
        /**
         * 快递公司简称
         */
        @JsonProperty("simpleName")
        private String simpleName;

        /**
         * 快递公司名称
         */
        @JsonProperty("expName")
        private String expName;

        public String getSimpleName() {
            return simpleName;
        }

        public void setSimpleName(String simpleName) {
            this.simpleName = simpleName;
        }

        public String getExpName() {
            return expName;
        }

        public void setExpName(String expName) {
            this.expName = expName;
        }
    }

    public void setMailNo(String mailNo) {
        this.mailNo = mailNo;
    }

    public String getMailNo() {
        return this.mailNo;
    }

    public void setUpdate(long update) {
        this.update = update;
    }

    public long getUpdate() {
        return this.update;
    }

    public void setUpdateStr(String updateStr) {
        this.updateStr = updateStr;
    }

    public String getUpdateStr() {
        return this.updateStr;
    }

    public void setRet_code(int ret_code) {
        this.ret_code = ret_code;
    }

    public int getRet_code() {
        return this.ret_code;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public boolean getFlag() {
        return this.flag;
    }

    public void setDataSize(int dataSize) {
        this.dataSize = dataSize;
    }

    public int getDataSize() {
        return this.dataSize;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getStatus() {
        return this.status;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getTel() {
        return this.tel;
    }

    public void setExpSpellName(String expSpellName) {
        this.expSpellName = expSpellName;
    }

    public String getExpSpellName() {
        return this.expSpellName;
    }

    public void setData(List<Data> data) {
        this.data = data;
    }

    public List<Data> getData() {
        return this.data;
    }

    public void setExpTextName(String expTextName) {
        this.expTextName = expTextName;
    }

    public String getExpTextName() {
        return this.expTextName;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return this.msg;
    }

}
