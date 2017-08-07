package cn.datai.gift.web.service.impl;

import cn.datai.gift.persist.mapper.UserDeliveryInfoMapperExt;
import cn.datai.gift.persist.po.UserBizBrief;
import cn.datai.gift.persist.po.UserDeliveryInfo;
import cn.datai.gift.persist.po.UserDeliveryInfoExample;
import cn.datai.gift.web.service.AddressService;
import lombok.Synchronized;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Administrator on 2017/4/11.
 */
@Service
public class AddressServiceImpl implements AddressService {
    @Autowired
    private UserDeliveryInfoMapperExt userDeliveryInfoMapperExt;

    /**
     * 插入用户收货地址
     *
     * @param userDeliveryInfo
     */
    @Synchronized
    @Transactional
    @Override
    public boolean insertAddress(UserDeliveryInfo userDeliveryInfo) {

        List<UserDeliveryInfo> userDeliveryInfoList =this.queryUserDeliveryInfoList(userDeliveryInfo.getUserInfoId());
        if(null != userDeliveryInfoList && !userDeliveryInfoList.isEmpty() && userDeliveryInfoList.size()>4){
            return false;
        }
        if("true".equals(userDeliveryInfo.getIsDefault())){
            for(UserDeliveryInfo ud : userDeliveryInfoList){
                ud.setIsDefault("false");
                this.userDeliveryInfoMapperExt.updateByPrimaryKeySelective(ud);
            }
            this.userDeliveryInfoMapperExt.insertSelective(userDeliveryInfo);
        }else{
            this.userDeliveryInfoMapperExt.insertSelective(userDeliveryInfo);
        }
        return true;
    }

    /**
     * 更新下用户收货地址
     *
     * @param userDeliveryInfo
     */
    @Synchronized
    @Transactional
    @Override
    public void updateAddress(UserDeliveryInfo userDeliveryInfo) {

        UserDeliveryInfo defaultUserDeliveryInfo = null;
        List<UserDeliveryInfo> userDeliveryInfoList =this.queryUserDeliveryInfoList(userDeliveryInfo.getUserInfoId());
        for(UserDeliveryInfo ud : userDeliveryInfoList){
            if(ud.getIsDefault().equals("true")){

                defaultUserDeliveryInfo = ud;
            }
            ud.setIsDefault("false");
            this.userDeliveryInfoMapperExt.updateByPrimaryKeySelective(ud);
        }

        if(userDeliveryInfo.getIsDefault().equals("true")){
            this.userDeliveryInfoMapperExt.updateByPrimaryKeySelective(userDeliveryInfo);
        }else{
            this.userDeliveryInfoMapperExt.updateByPrimaryKeySelective(userDeliveryInfo);
            if(null != defaultUserDeliveryInfo){
                this.userDeliveryInfoMapperExt.updateByPrimaryKeySelective(defaultUserDeliveryInfo);
            }
        }


    }

    /**
     * 查询某一用户下的所有收货地址
     *
     * @param userInfoId
     * @return
     */
    @Override
    public List<UserDeliveryInfo> queryUserDeliveryInfoList(Long userInfoId) {
        UserDeliveryInfoExample example = new UserDeliveryInfoExample();
        example.setOrderByClause("CREATE_TIME DESC");
        example.createCriteria().andUserInfoIdEqualTo(userInfoId);
        return this.userDeliveryInfoMapperExt.selectByExample(example);
    }

    /**
     * 根据收货地址主键查询唯一对应的收货地址信息
     *
     *
     * @param userDeliveryInfoId
     * @return
     */
    @Override
    public UserDeliveryInfo queryUserDeliveryInfo(Long userDeliveryInfoId) {
        return this.userDeliveryInfoMapperExt.selectByPrimaryKey(userDeliveryInfoId);
    }

    /**
     * 删除某一个收货地址
     *
     * @param userDeliveryInfoId
     */
    @Transactional
    @Override
    public void deleteUserDeliveryInfo(Long userDeliveryInfoId) {
        this.userDeliveryInfoMapperExt.deleteByPrimaryKey(userDeliveryInfoId);
    }

    /**
     * 查询用户下默认的首选地址（理论上只有一个）
     *
     * @param userInfoId
     * @return
     */
    @Override
    public UserDeliveryInfo queryDefaultAddress(Long userInfoId) {
        UserDeliveryInfoExample example = new UserDeliveryInfoExample();
        example.createCriteria().andUserInfoIdEqualTo(userInfoId).andIsDefaultEqualTo("true");
        List<UserDeliveryInfo> userDeliveryInfoList = this.userDeliveryInfoMapperExt.selectByExample(example);
        if(null == userDeliveryInfoList || userDeliveryInfoList.isEmpty()){
            return null;
        }
        return userDeliveryInfoList.get(0);
    }
}
