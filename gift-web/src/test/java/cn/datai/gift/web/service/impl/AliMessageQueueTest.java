package cn.datai.gift.web.service.impl;

import cn.datai.gift.web.service.MessageQueueService;
import com.alibaba.fastjson.JSON;
import com.aliyun.openservices.ons.api.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by H.CAAHN on 2017/7/19.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath*:applicationContext.xml"})
public class AliMessageQueueTest {
    @Autowired
    private MessageQueueService messageQueueService;

    @Test
    public void test() {


        messageQueueService.subscribe("DEV_NEW_USER", "source", new MessageListener() {
            @Override
            public Action consume(Message message, ConsumeContext consumeContext) {
                System.out.println("S-Receive: " + new String(message.getBody()));
                System.out.println("S-Receive: " + message.getKey());
                System.out.println("S-Receive: " + message.getMsgID());
                return Action.CommitMessage;
            }
        });

        SendResult sendResult = messageQueueService.send("MB12345680", "DEV_NEW_USER", "source", "User注册".getBytes());
        System.out.println(JSON.toJSONString(sendResult));
        try {
            synchronized (this) {
                this.wait();
            }
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
