package cn.datai.gift.persist.po;

import java.io.Serializable;

public class ExpressCompany implements Serializable {
    public static final long serialVersionUID = 1009478518L;

    /**
     * 快递公司ID号（自增）: express_company.EXPRESS_COMPANY_ID
     * @author MyBatis Generator
     */
    private Long expressCompanyId;

    /**
     * 快递公司名称: express_company.COMPANY_EXP_NAME
     * @author MyBatis Generator
     */
    private String companyExpName;

    /**
     * 快递公司拼音或英文简称: express_company.COMPANY_SIMPLE_NAME
     * @author MyBatis Generator
     */
    private String companySimpleName;

    /**
     * 官方电话: express_company.PHONE
     * @author MyBatis Generator
     */
    private String phone;

    /**
     * 快递公司图片: express_company.IMGURL
     * @author MyBatis Generator
     */
    private String imgurl;

    /**
     * 官方网址: express_company.URL
     * @author MyBatis Generator
     */
    private String url;

    /**
     * 备注信息: express_company.NOTE
     * @author MyBatis Generator
     */
    private String note;

    /**
     * 随机串: express_company.RANDOMSEQ
     * @author MyBatis Generator
     */
    private Integer randomseq;

    /**
     * 获取快递公司ID号（自增）: express_company.EXPRESS_COMPANY_ID
     * @return 快递公司ID号（自增）: express_company.EXPRESS_COMPANY_ID
     * @author MyBatis Generator
     */
    public Long getExpressCompanyId() {
        return expressCompanyId;
    }

    /**
     * 设置快递公司ID号（自增）: express_company.EXPRESS_COMPANY_ID
     * @param expressCompanyId 映射数据库字段: express_company.EXPRESS_COMPANY_ID
     * @author MyBatis Generator
     */
    public void setExpressCompanyId(Long expressCompanyId) {
        this.expressCompanyId = expressCompanyId;
    }

    /**
     * 获取快递公司名称: express_company.COMPANY_EXP_NAME
     * @return 快递公司名称: express_company.COMPANY_EXP_NAME
     * @author MyBatis Generator
     */
    public String getCompanyExpName() {
        return companyExpName;
    }

    /**
     * 设置快递公司名称: express_company.COMPANY_EXP_NAME
     * @param companyExpName 映射数据库字段: express_company.COMPANY_EXP_NAME
     * @author MyBatis Generator
     */
    public void setCompanyExpName(String companyExpName) {
        this.companyExpName = companyExpName == null ? null : companyExpName.trim();
    }

    /**
     * 获取快递公司拼音或英文简称: express_company.COMPANY_SIMPLE_NAME
     * @return 快递公司拼音或英文简称: express_company.COMPANY_SIMPLE_NAME
     * @author MyBatis Generator
     */
    public String getCompanySimpleName() {
        return companySimpleName;
    }

    /**
     * 设置快递公司拼音或英文简称: express_company.COMPANY_SIMPLE_NAME
     * @param companySimpleName 映射数据库字段: express_company.COMPANY_SIMPLE_NAME
     * @author MyBatis Generator
     */
    public void setCompanySimpleName(String companySimpleName) {
        this.companySimpleName = companySimpleName == null ? null : companySimpleName.trim();
    }

    /**
     * 获取官方电话: express_company.PHONE
     * @return 官方电话: express_company.PHONE
     * @author MyBatis Generator
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置官方电话: express_company.PHONE
     * @param phone 映射数据库字段: express_company.PHONE
     * @author MyBatis Generator
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * 获取快递公司图片: express_company.IMGURL
     * @return 快递公司图片: express_company.IMGURL
     * @author MyBatis Generator
     */
    public String getImgurl() {
        return imgurl;
    }

    /**
     * 设置快递公司图片: express_company.IMGURL
     * @param imgurl 映射数据库字段: express_company.IMGURL
     * @author MyBatis Generator
     */
    public void setImgurl(String imgurl) {
        this.imgurl = imgurl == null ? null : imgurl.trim();
    }

    /**
     * 获取官方网址: express_company.URL
     * @return 官方网址: express_company.URL
     * @author MyBatis Generator
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置官方网址: express_company.URL
     * @param url 映射数据库字段: express_company.URL
     * @author MyBatis Generator
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * 获取备注信息: express_company.NOTE
     * @return 备注信息: express_company.NOTE
     * @author MyBatis Generator
     */
    public String getNote() {
        return note;
    }

    /**
     * 设置备注信息: express_company.NOTE
     * @param note 映射数据库字段: express_company.NOTE
     * @author MyBatis Generator
     */
    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    /**
     * 获取随机串: express_company.RANDOMSEQ
     * @return 随机串: express_company.RANDOMSEQ
     * @author MyBatis Generator
     */
    public Integer getRandomseq() {
        return randomseq;
    }

    /**
     * 设置随机串: express_company.RANDOMSEQ
     * @param randomseq 映射数据库字段: express_company.RANDOMSEQ
     * @author MyBatis Generator
     */
    public void setRandomseq(Integer randomseq) {
        this.randomseq = randomseq;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: express_company
     * @author MyBatis Generator
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        ExpressCompany other = (ExpressCompany) that;
        return (this.getExpressCompanyId() == null ? other.getExpressCompanyId() == null : this.getExpressCompanyId().equals(other.getExpressCompanyId()))
            && (this.getCompanyExpName() == null ? other.getCompanyExpName() == null : this.getCompanyExpName().equals(other.getCompanyExpName()))
            && (this.getCompanySimpleName() == null ? other.getCompanySimpleName() == null : this.getCompanySimpleName().equals(other.getCompanySimpleName()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getImgurl() == null ? other.getImgurl() == null : this.getImgurl().equals(other.getImgurl()))
            && (this.getUrl() == null ? other.getUrl() == null : this.getUrl().equals(other.getUrl()))
            && (this.getNote() == null ? other.getNote() == null : this.getNote().equals(other.getNote()))
            && (this.getRandomseq() == null ? other.getRandomseq() == null : this.getRandomseq().equals(other.getRandomseq()));
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: express_company
     * @author MyBatis Generator
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getExpressCompanyId() == null) ? 0 : getExpressCompanyId().hashCode());
        result = prime * result + ((getCompanyExpName() == null) ? 0 : getCompanyExpName().hashCode());
        result = prime * result + ((getCompanySimpleName() == null) ? 0 : getCompanySimpleName().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getImgurl() == null) ? 0 : getImgurl().hashCode());
        result = prime * result + ((getUrl() == null) ? 0 : getUrl().hashCode());
        result = prime * result + ((getNote() == null) ? 0 : getNote().hashCode());
        result = prime * result + ((getRandomseq() == null) ? 0 : getRandomseq().hashCode());
        return result;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: express_company
     * @author MyBatis Generator
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append(", expressCompanyId=").append(expressCompanyId);
        sb.append(", companyExpName=").append(companyExpName);
        sb.append(", companySimpleName=").append(companySimpleName);
        sb.append(", phone=").append(phone);
        sb.append(", imgurl=").append(imgurl);
        sb.append(", url=").append(url);
        sb.append(", note=").append(note);
        sb.append(", randomseq=").append(randomseq);
        sb.append("]");
        return sb.toString();
    }
}