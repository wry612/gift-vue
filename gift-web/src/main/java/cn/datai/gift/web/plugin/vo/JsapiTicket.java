package cn.datai.gift.web.plugin.vo;


import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.io.Serializable;

/**
 * 微信jssdk 所需的jsapi_ticket
 */
public class JsapiTicket implements Serializable {

    private long errcode;

    private String errmsg;

    private String ticket;

    private long expires_in;

    private long createTimestamp;

    public JsapiTicket(){
        this.createTimestamp = System.currentTimeMillis();
    }

    public long getErrcode() {
        return errcode;
    }

    public void setErrcode(long errcode) {
        this.errcode = errcode;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public long getExpires_in() {
        return expires_in;
    }

    public void setExpires_in(long expires_in) {
        this.expires_in = expires_in;
    }

    public long getCreateTimestamp() {
        return createTimestamp;
    }

    public void setCreateTimestamp(long createTimestamp) {
        this.createTimestamp = createTimestamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        JsapiTicket that = (JsapiTicket) o;

        return new EqualsBuilder()
                .append(errcode, that.errcode)
                .append(expires_in, that.expires_in)
                .append(createTimestamp, that.createTimestamp)
                .append(errmsg, that.errmsg)
                .append(ticket, that.ticket)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(errcode)
                .append(errmsg)
                .append(ticket)
                .append(expires_in)
                .append(createTimestamp)
                .toHashCode();
    }

    @Override
    public String toString() {
        return "JsapiTicket{" +
                "errcode=" + errcode +
                ", errmsg='" + errmsg + '\'' +
                ", ticket='" + ticket + '\'' +
                ", expires_in=" + expires_in +
                ", createTimestamp=" + createTimestamp +
                '}';
    }
}
