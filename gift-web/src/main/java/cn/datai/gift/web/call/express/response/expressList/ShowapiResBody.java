package cn.datai.gift.web.call.express.response.expressList;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.util.ArrayList;
import java.util.List;

public class ShowapiResBody {

    @JsonCreator
    public ShowapiResBody() {
    }

    @JsonProperty("ret_code")
    private int retCode;

    @JsonProperty("flag")
    private boolean flag;

    @JsonProperty("page")
    private int page;

    @JsonProperty("expressList")
    @JsonDeserialize(as = ArrayList.class, contentAs = ExpressInfo.class)
    private List<ExpressInfo> expressInfoList;

    @JsonProperty("allNum")
    private int allNum;

    @JsonProperty("msg")
    private String msg;

    @JsonProperty("maxSize")
    private int maxSize;

    public int getRetCode() {
        return retCode;
    }

    public void setRetCode(int retCode) {
        this.retCode = retCode;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public List<ExpressInfo> getExpressInfoList() {
        return expressInfoList;
    }

    public void setExpressInfoList(List<ExpressInfo> expressInfoList) {
        this.expressInfoList = expressInfoList;
    }

    public int getAllNum() {
        return allNum;
    }

    public void setAllNum(int allNum) {
        this.allNum = allNum;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    @Override
    public String toString() {
        return "ShowapiResBody{" +
                "retCode=" + retCode +
                ", flag=" + flag +
                ", page=" + page +
                ", expressInfoList=" + expressInfoList +
                ", allNum=" + allNum +
                ", msg='" + msg + '\'' +
                ", maxSize=" + maxSize +
                '}';
    }
}