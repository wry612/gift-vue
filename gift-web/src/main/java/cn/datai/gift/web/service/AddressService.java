package cn.datai.gift.web.service;

import cn.datai.gift.persist.po.UserDeliveryInfo;

import java.util.List;

/**
 * 地址管理service
 * Created by Administrator on 2017/4/11.
 */
public interface AddressService {

    /**
     * 插入用户收货地址
     * @param userDeliveryInfo
     */
    boolean insertAddress(UserDeliveryInfo userDeliveryInfo);

    /**
     * 更新下用户收货地址
     * @param userDeliveryInfo
     */
    void updateAddress(UserDeliveryInfo userDeliveryInfo);

    /**
     * 查询某一用户下的所有收货地址
     * @param userInfoId
     * @return
     */
    List<UserDeliveryInfo> queryUserDeliveryInfoList(Long userInfoId);

    /**
     *根据收货地址主键查询唯一对应的收货地址信息
     * @param userDeliveryInfoId
     * @return
     */
    UserDeliveryInfo queryUserDeliveryInfo(Long userDeliveryInfoId);

    /**
     * 删除某一个收货地址
     * @param userDeliveryInfoId
     */
    void deleteUserDeliveryInfo(Long userDeliveryInfoId);


    /**
     * 查询用户下默认的首选地址（理论上只有一个）
     * @param userInfoId
     * @return
     */
    UserDeliveryInfo queryDefaultAddress(Long userInfoId);


}
