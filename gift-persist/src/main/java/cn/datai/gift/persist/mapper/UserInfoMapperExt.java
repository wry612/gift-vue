package cn.datai.gift.persist.mapper;

import cn.datai.gift.persist.po.UserInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInfoMapperExt extends UserInfoMapper {

    UserInfo selectByTradeAccountId(@Param("tradeAccountId") Long tradeAccountId);

    UserInfo findAndLockById(@Param("userInfoId") Long userInfoId);

}