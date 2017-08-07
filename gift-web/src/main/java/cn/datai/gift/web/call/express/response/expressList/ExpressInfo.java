package cn.datai.gift.web.call.express.response.expressList;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ExpressInfo {

    @JsonCreator
    public ExpressInfo(){
    }

    /**
     * 快递公司的图片/logo
     */
    @JsonProperty("imgUrl")
    private String imgUrl;

    /**
     * 拼音或英文简称
     */
    @JsonProperty("simpleName")
    private String simpleName;

    /**
     * 官方电话
     */
    @JsonProperty("phone")
    private String phone;

    /**
     * 快递名称
     */
    @JsonProperty("expName")
    private String expName;

    /**
     * 官方网址
     */
    @JsonProperty("url")
    private String url;

    /**
     * 备注信息
     */
    @JsonProperty("note")
    private String note;


    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
    public String getImgUrl() {
        return imgUrl;
    }

    public void setSimpleName(String simpleName) {
        this.simpleName = simpleName;
    }
    public String getSimpleName() {
        return simpleName;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getPhone() {
        return phone;
    }

    public void setExpName(String expName) {
        this.expName = expName;
    }
    public String getExpName() {
        return expName;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    public String getUrl() {
        return url;
    }

    public void setNote(String note) {
        this.note = note;
    }
    public String getNote() {
        return note;
    }

    @Override
    public String toString() {
        return "ExpressInfo{" +
                "imgUrl='" + imgUrl + '\'' +
                ", simpleName='" + simpleName + '\'' +
                ", phone='" + phone + '\'' +
                ", expName='" + expName + '\'' +
                ", url='" + url + '\'' +
                ", note='" + note + '\'' +
                '}';
    }
}