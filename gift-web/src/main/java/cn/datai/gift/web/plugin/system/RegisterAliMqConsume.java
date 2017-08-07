package cn.datai.gift.web.plugin.system;

import cn.datai.gift.web.service.MessageQueueService;
import cn.datai.gift.web.service.RecommoenderAndBrokerService;
import cn.datai.gift.web.vo.sendMessage.RegisterMessageListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * 用户注册绑定时送礼相关的消息消费
 */
@Component
public class RegisterAliMqConsume {

    private Logger logger = LoggerFactory.getLogger(RegisterAliMqConsume.class);

    @Value("${ali.mq.topic.register}")
    private String aliMqTopicRegister;

    @Autowired
    private MessageQueueService messageQueueService;

    @Autowired
    private RecommoenderAndBrokerService recommoenderAndBrokerService;

    @PostConstruct
    public void init() {
        messageQueueService.subscribe(aliMqTopicRegister,new RegisterMessageListener(recommoenderAndBrokerService));
    }

}
