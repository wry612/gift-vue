package cn.datai.gift.web.vo.Conversion;

/**
 * Created by Administrator on 2017/7/25.
 */
public class DonateTypeVo extends DonateType {
    private Long ticketId;//券ID

    private Long commondityId;//商品Id

    public Long getTicketId() {
        return ticketId;
    }

    public void setTicketId(Long ticketId) {
        this.ticketId = ticketId;
    }

    public Long getCommondityId() {
        return commondityId;
    }

    public void setCommondityId(Long commondityId) {
        this.commondityId = commondityId;
    }
}
