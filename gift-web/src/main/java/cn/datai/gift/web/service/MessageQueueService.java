package cn.datai.gift.web.service;

import com.aliyun.openservices.ons.api.MessageListener;
import com.aliyun.openservices.ons.api.SendResult;

/**
 * 消息队列服务
 * Created by H.CAAHN on 2017/7/18.
 */
public interface MessageQueueService {
    /**
     * 消息发送
     * @param topic 消息主题
     * @param tag 消息标签（即消息分类）
     * @param msgBody 消息内容
     * @return
     */
    SendResult send(String topic, String tag, byte[] msgBody);

    /**
     * 消息发送
     * @param key 设置代表消息的业务关键属性，请尽可能全局唯一，以方便您在无法正常收到消息情况下，可通过MQ控制台查询消息并补发
     * @param topic 消息主题
     * @param tag 消息标签（即消息分类）
     * @param msgBody 消息内容
     * @return
     */
    SendResult send(String key, String topic, String tag, byte[] msgBody);

    /**
     * 消息订阅
     * @param topic 消息主题
     * @param listener
     */
    void subscribe(String topic, MessageListener listener);

    /**
     * 消息订阅
     * @param topic 消息主题
     * @param tag 消息分类
     * @param listener 消息监听器
     */
    void subscribe(String topic, String tag, MessageListener listener);
}
