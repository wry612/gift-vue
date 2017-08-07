package cn.datai.gift.persist.mapper;

import cn.datai.gift.persist.po.ExpressCompany;
import cn.datai.gift.persist.po.ExpressCompanyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExpressCompanyMapper {
    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: express_company
     * @author MyBatis Generator
     */
    int countByExample(ExpressCompanyExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: express_company
     * @author MyBatis Generator
     */
    int deleteByExample(ExpressCompanyExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: express_company
     * @author MyBatis Generator
     */
    int deleteByPrimaryKey(Long expressCompanyId);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: express_company
     * @author MyBatis Generator
     */
    int insert(ExpressCompany record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: express_company
     * @author MyBatis Generator
     */
    int insertSelective(ExpressCompany record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: express_company
     * @author MyBatis Generator
     */
    List<ExpressCompany> selectByExample(ExpressCompanyExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: express_company
     * @author MyBatis Generator
     */
    ExpressCompany selectByPrimaryKey(Long expressCompanyId);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: express_company
     * @author MyBatis Generator
     */
    int updateByExampleSelective(@Param("record") ExpressCompany record, @Param("example") ExpressCompanyExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: express_company
     * @author MyBatis Generator
     */
    int updateByExample(@Param("record") ExpressCompany record, @Param("example") ExpressCompanyExample example);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: express_company
     * @author MyBatis Generator
     */
    int updateByPrimaryKeySelective(ExpressCompany record);

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: express_company
     * @author MyBatis Generator
     */
    int updateByPrimaryKey(ExpressCompany record);
}