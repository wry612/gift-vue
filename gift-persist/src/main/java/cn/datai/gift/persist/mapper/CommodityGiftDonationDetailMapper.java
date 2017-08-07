package cn.datai.gift.persist.mapper;

import cn.datai.gift.persist.po.CommodityGiftDonationDetail;
import cn.datai.gift.persist.po.CommodityGiftDonationDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommodityGiftDonationDetailMapper {
    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_gift_donation_detail
     * @author MyBatis Generator
     */
    int countByExample(CommodityGiftDonationDetailExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_gift_donation_detail
     * @author MyBatis Generator
     */
    int deleteByExample(CommodityGiftDonationDetailExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_gift_donation_detail
     * @author MyBatis Generator
     */
    int deleteByPrimaryKey(Long commodityGiftDonationDetailId);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_gift_donation_detail
     * @author MyBatis Generator
     */
    int insert(CommodityGiftDonationDetail record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_gift_donation_detail
     * @author MyBatis Generator
     */
    int insertSelective(CommodityGiftDonationDetail record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_gift_donation_detail
     * @author MyBatis Generator
     */
    List<CommodityGiftDonationDetail> selectByExample(CommodityGiftDonationDetailExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_gift_donation_detail
     * @author MyBatis Generator
     */
    CommodityGiftDonationDetail selectByPrimaryKey(Long commodityGiftDonationDetailId);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_gift_donation_detail
     * @author MyBatis Generator
     */
    int updateByExampleSelective(@Param("record") CommodityGiftDonationDetail record, @Param("example") CommodityGiftDonationDetailExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_gift_donation_detail
     * @author MyBatis Generator
     */
    int updateByExample(@Param("record") CommodityGiftDonationDetail record, @Param("example") CommodityGiftDonationDetailExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_gift_donation_detail
     * @author MyBatis Generator
     */
    int updateByPrimaryKeySelective(CommodityGiftDonationDetail record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: commodity_gift_donation_detail
     * @author MyBatis Generator
     */
    int updateByPrimaryKey(CommodityGiftDonationDetail record);
}