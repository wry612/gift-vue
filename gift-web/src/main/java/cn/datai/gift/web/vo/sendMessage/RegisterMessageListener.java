package cn.datai.gift.web.vo.sendMessage;


import cn.datai.gift.utils.enums.RespCode;
import cn.datai.gift.utils.exception.BizException;
import cn.datai.gift.web.service.RecommoenderAndBrokerService;
import cn.datai.gift.web.utils.MyStringUtil;
import com.aliyun.openservices.ons.api.Action;
import com.aliyun.openservices.ons.api.ConsumeContext;
import com.aliyun.openservices.ons.api.Message;
import com.aliyun.openservices.ons.api.MessageListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Administrator on 2017/7/25.
 */
public class RegisterMessageListener implements MessageListener{
    private static final Logger logger = LoggerFactory.getLogger(RegisterMessageListener.class);

    private RecommoenderAndBrokerService recommoenderAndBrokerService;

    public RegisterMessageListener(){}

    public RegisterMessageListener(RecommoenderAndBrokerService recommoenderAndBrokerService){
        this.recommoenderAndBrokerService = recommoenderAndBrokerService;
    }

    @Override
    public Action consume(Message message, ConsumeContext consumeContext) {
        Long id = null;
        try {
            logger.info("---------------处理消息的messageId：{}",message.getMsgID());
            id = getId(new String(message.getBody()));
            recommoenderAndBrokerService.operateRegister(id);
            return Action.CommitMessage;
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("处理消息异常，消息会重新发送,对应的messageId:{},对应的业务Id:{}",message.getMsgID(),id);
            return Action.ReconsumeLater;
        }
    }

    private static Long getId(String body){
        try {
            if(MyStringUtil.isNotBlank(body)){
                return Long.valueOf(body.split("_")[1]);
            }
        } catch (NumberFormatException e) {
            logger.error("ali.mq 消费时 处理id异常:{},{}",body,e);
            throw new BizException(RespCode.SERVER_BIZ_ERROR);
        }
        return null;
    }
}
