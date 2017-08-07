package cn.datai.gift.web.vo.Conversion;

import cn.datai.gift.persist.po.ConvertObj;

/**
 * Created by Administrator on 2017/7/5.
 */
public class ConvertObjExt extends ConvertObj {
    private long timeSlotEnd;//活动截止差值

    private long timeSlotBegin;//截止活动的开始时间差值

    private long timeSlotDraw;//抽奖时间的差值

    private int maxConversionDraw;//兑换和抽奖的最大数量限制


    public int getMaxConversionDraw() {
        return maxConversionDraw;
    }

    public void setMaxConversionDraw(int maxConversionDraw) {
        this.maxConversionDraw = maxConversionDraw;
    }

    public long getTimeSlotBegin() {
        return timeSlotBegin;
    }

    public void setTimeSlotBegin(long timeSlotBegin) {
        this.timeSlotBegin = timeSlotBegin;
    }

    public long getTimeSlotEnd() {
        return timeSlotEnd;
    }

    public void setTimeSlotEnd(long timeSlotEnd) {
        this.timeSlotEnd = timeSlotEnd;
    }

    public long getTimeSlotDraw() {
        return timeSlotDraw;
    }

    public void setTimeSlotDraw(long timeSlotDraw) {
        this.timeSlotDraw = timeSlotDraw;
    }
}
