package cn.datai.gift.persist.mapper;

import cn.datai.gift.persist.po.ActivityPresent;
import org.apache.ibatis.annotations.Param;

public interface ActivityPresentMapperExt extends ActivityPresentMapper {

    ActivityPresent findAndLockActivityPresent(@Param("activityPresentId") Long activityPresentId);
}