package cn.datai.gift.web.service;

/**
 * 用户注册MQ消息
 * Created by H.CAAHN on 2017/7/19.
 */
public interface UserRegisterMessageService {
    /**
     * 新用户注册
     * @param userId
     * @param nickname
     */
    void sendMessage(Long userId, String nickname);
}
