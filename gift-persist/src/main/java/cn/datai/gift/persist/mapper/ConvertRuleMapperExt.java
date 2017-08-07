package cn.datai.gift.persist.mapper;

import cn.datai.gift.persist.po.ConvertRuleExample;
import cn.datai.gift.persist.vo.Page;
import cn.datai.gift.persist.vo.conversion.ConvertRuleVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public interface ConvertRuleMapperExt extends ConvertRuleMapper {

    /**
     * 查询兑换条件具体信息
     * @param example
     * @param oredCriteria
     * @param distinct
     */
    List<ConvertRuleVO> selectVOByExample(@Param("example") ConvertRuleExample example,
                                          @Param("otherParam") Map<String, Object> otherParam);

}