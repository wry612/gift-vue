package cn.datai.gift.persist.mapper;

import cn.datai.gift.persist.po.ExpressInfo;
import cn.datai.gift.persist.po.ExpressInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExpressInfoMapper {
    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: express_info
     * @author MyBatis Generator
     */
    int countByExample(ExpressInfoExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: express_info
     * @author MyBatis Generator
     */
    int deleteByExample(ExpressInfoExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: express_info
     * @author MyBatis Generator
     */
    int deleteByPrimaryKey(Long expressInfoId);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: express_info
     * @author MyBatis Generator
     */
    int insert(ExpressInfo record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: express_info
     * @author MyBatis Generator
     */
    int insertSelective(ExpressInfo record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: express_info
     * @author MyBatis Generator
     */
    List<ExpressInfo> selectByExample(ExpressInfoExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: express_info
     * @author MyBatis Generator
     */
    ExpressInfo selectByPrimaryKey(Long expressInfoId);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: express_info
     * @author MyBatis Generator
     */
    int updateByExampleSelective(@Param("record") ExpressInfo record, @Param("example") ExpressInfoExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: express_info
     * @author MyBatis Generator
     */
    int updateByExample(@Param("record") ExpressInfo record, @Param("example") ExpressInfoExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: express_info
     * @author MyBatis Generator
     */
    int updateByPrimaryKeySelective(ExpressInfo record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: express_info
     * @author MyBatis Generator
     */
    int updateByPrimaryKey(ExpressInfo record);
}