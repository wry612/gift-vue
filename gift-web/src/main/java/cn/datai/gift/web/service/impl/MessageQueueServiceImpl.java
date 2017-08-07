package cn.datai.gift.web.service.impl;

import cn.datai.gift.web.service.MessageQueueService;
import com.aliyun.openservices.ons.api.*;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 消息队列服务
 * Created by H.CAAHN on 2017/7/18.
 */
@Service
public class MessageQueueServiceImpl implements MessageQueueService {
    /** 消息服务的 TCP 接入域名 */
    @Value("${ali.mq.url}")
    private String url;

    /** MQ控制台创建的Producer ID */
    @Value("${ali.mq.producer}")
    private String producerId;

    /** MQ控制台创建的Consumer ID */
    @Value("${ali.mq.consumer}")
    private String consumerId;

    /** 鉴权用AccessKey */
    @Value("${ali.mq.accessKey}")
    private String accessKey;

    /** 鉴权用SecretKey */
    @Value("${ali.mq.secretKey}")
    private String secretKey;

//    @Value("${ali.mq.topic}")
//    private String topic;

    /** 生产者 */
    private Producer producer;

    /** 消费者配置参数 */
    private Properties consumerProps;

    /** 消费者 */
    private Map<String, Consumer> consumerMap;

    private static final Logger logger = LoggerFactory.getLogger(MessageQueueServiceImpl.class);

    private static final boolean isDebug = logger.isDebugEnabled();

    @PostConstruct
    public void init() {
        if (StringUtils.isBlank(producerId) || StringUtils.isBlank(accessKey)
                || StringUtils.isBlank(secretKey) || StringUtils.isBlank(url)) {
            logger.warn("阿里云MQ配置参数为空，无法初始化MessageQueueService");
            return;
        }

        Properties producerPorps = new Properties();
        producerPorps.put(PropertyKeyConst.ProducerId, producerId);
        producerPorps.put(PropertyKeyConst.AccessKey, accessKey);
        producerPorps.put(PropertyKeyConst.SecretKey, secretKey);
        producerPorps.put(PropertyKeyConst.ONSAddr, url);

        producer = ONSFactory.createProducer(producerPorps);
        producer.start();

        consumerProps = new Properties();
        consumerProps.put(PropertyKeyConst.ConsumerId, consumerId);
        consumerProps.put(PropertyKeyConst.AccessKey, accessKey);
        consumerProps.put(PropertyKeyConst.SecretKey, secretKey);
        consumerProps.put(PropertyKeyConst.ONSAddr, url);

        consumerMap = new ConcurrentHashMap<>();
    }

    @PreDestroy
    public void destroy() {
        if (this.producer != null) {
            this.producer.shutdown();
        }
    }

    @Override
    public SendResult send(String topic, String tag, byte[] msgBody) {
        return this.send(null, topic, tag, msgBody);
    }

    @Override
    public SendResult send(String key, String topic, String tag, byte[] msgBody) {
        if (producer == null) {
            logger.warn("阿里云MQ生产者为空，消息无法发送");
            return null;
        }

        Message message = new Message(topic, tag, msgBody);
        if (StringUtils.isNotBlank(key)) {
            message.setKey(key);
        }
        SendResult sendResult = producer.send(message);
        if (isDebug) {
            logger.debug("消息发送成功, 消息ID：{}", sendResult.getMessageId());
        }
        // TODO 记录到数据库中
        return sendResult;
    }

    @Override
    public void subscribe(String topic, MessageListener listener) {
        this.subscribe(topic, null, listener);
    }

    @Override
    public void subscribe(String topic, String tag, MessageListener listener) {
        if (consumerMap == null || consumerProps == null) {
            logger.warn("阿里云MQ消费者配置信息为空，添加监听失败");
            return;
        }

        if (StringUtils.isBlank(tag)) {
            tag = "*";
        }
        Consumer consumer = consumerMap.get(topic + "-" + tag);
        if (consumer == null) {
            synchronized (consumerMap) {
                if ((consumer = consumerMap.get(topic + "-" + tag)) == null) {

                    consumer = ONSFactory.createConsumer(consumerProps);
                    consumer.subscribe(topic, tag, listener);
                    consumer.start();
                    consumerMap.put(topic + "-" + tag, consumer);
                }
            }
        }
    }
}
