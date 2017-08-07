package cn.datai.weixinjob;

import cn.datai.gift.web.task.WeixinTask;
import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;

/**
 * 处理微信定时获取授权信息
 */
public class WeixinJob implements SimpleJob {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private WeixinTask weixinTask;

    @Override
    public void execute(ShardingContext shardingContext) {
        logger.info("WeixinJob execute item " + shardingContext.getShardingParameter() + " start...");
        try {
            doJob();
        } catch (Exception e) {
            logger.error("WeixinJob execute error.", e);
        }
        logger.info("WeixinJob execute item " + shardingContext.getShardingParameter() + " end.");
    }

    /**
     * 实际执行的任务操作
     * <br/>
     */
    private void doJob() throws InterruptedException, IOException {
        weixinTask.refreshToken();
    }

}
