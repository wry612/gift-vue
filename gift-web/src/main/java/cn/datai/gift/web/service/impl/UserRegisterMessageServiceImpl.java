package cn.datai.gift.web.service.impl;

import cn.datai.gift.web.service.MessageQueueService;
import cn.datai.gift.web.service.UserRegisterMessageService;
import com.aliyun.openservices.ons.api.Action;
import com.aliyun.openservices.ons.api.ConsumeContext;
import com.aliyun.openservices.ons.api.Message;
import com.aliyun.openservices.ons.api.MessageListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * Created by H.CAAHN on 2017/7/19.
 */
@Service
public class UserRegisterMessageServiceImpl implements UserRegisterMessageService, MessageListener {
    @Value("${ali.mq.topic.register}")
    private String topic_register;

    private String tag = "REGISTER";

    @Autowired
    private MessageQueueService messageQueueService;

    @PostConstruct
    public void init() {
//        // 订阅注册消息
//        messageQueueService.subscribe(topic_register, tag, this);
    }

    @Override
    public void sendMessage(Long userId, String nickname) {
        // 发送消息
        String key = tag + "_" + userId;

        StringBuffer buf = new StringBuffer();
        buf.append("{\"userid\":").append(userId).append(",");
        buf.append("\"nickname\":").append("\"").append(nickname).append("\"").append("}");
        messageQueueService.send(key, topic_register, tag, buf.toString().getBytes());
    }

    @Override
    public Action consume(Message message, ConsumeContext consumeContext) {
        System.out.println("S-Receive: " + new String(message.getBody()));
        System.out.println("S-Receive: " + message.getKey());
        System.out.println("S-Receive: " + message.getMsgID());
        return Action.CommitMessage;
    }
}
