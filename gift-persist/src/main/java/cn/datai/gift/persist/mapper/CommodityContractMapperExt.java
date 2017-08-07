package cn.datai.gift.persist.mapper;

import cn.datai.gift.persist.vo.commodity.CommodityVo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommodityContractMapperExt extends CommodityContractMapper {

    List<CommodityVo> queryCommodityVo();
}