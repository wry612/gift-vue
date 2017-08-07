package cn.datai.gift.web.taskdyn;

import cn.datai.gift.persist.po.ConvertObj;
import cn.datai.gift.web.service.ConversionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by H.CAAHN on 2017/6/29.
 */
public class ConvertObjDrawThread extends Thread {
    private ConvertObj record;

    private ConversionService conversionService;

    private static final Logger logger = LoggerFactory.getLogger(ConvertObjDrawThread.class);

    public ConvertObjDrawThread(ConvertObj record, ConversionService conversionService) {
        this.record = record;
        this.conversionService = conversionService;
    }

    @Override
    public void run() {
        try {
            logger.info("抽奖任务开始执行，ID：{}", record.getConvertObjId());
            this.conversionService.drawObj(record);
        }
        catch (Exception ex) {
            logger.error("抽奖任务执行失败", ex);
        }
    }
}
