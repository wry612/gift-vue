package cn.datai.gift.web.service;

import cn.datai.gift.persist.po.ConvertObj;
import cn.datai.gift.persist.po.ConvertObjFlowRecord;
import cn.datai.gift.persist.po.ConvertObjOrder;
import cn.datai.gift.persist.po.ConvertRule;
import cn.datai.gift.persist.vo.conversion.ConvertRuleVO;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import java.util.List;

/**
 * 以物换物
 * Created by zhangyutao on 2017/6/19.
 */
public interface ConversionService {

    /**
     * 物品明细
     * @param convertObjId
     */
    ConvertObj findDetailById(long convertObjId);

    /**
     * 根据物品id查询兑换规则
     * @return
     * @param convertObjId
     */
    List<ConvertRule> findRuleByObjId(long convertObjId);

    /**
     * 通过物品id查询具体兑换条件信息
     * @param convertObjId 物品id
     * @param userInfoId   用户id，用于查询用户能够兑换该物品的持仓数
     * @return
     */
    List<ConvertRuleVO> findRuleVOByObjId(long convertObjId, long userInfoId);

    /**
     * 下以物换物订单
     * @param convertObjOrder
     * @return
     */
    List<ConvertObjOrder> order(ConvertObjOrder convertObjOrder) throws Exception;

    /**
     * 创建以物换物订单(抽奖)
     * @return
     */
    List<ConvertObjOrder> createDrawOrder(ConvertObjOrder convertObjOrder,ConvertObj convertObj,ConvertRule convertRule,Date currentDate) throws Exception;

    /**
     * 创建以物换物订单(兑换)
     * @return
     */
    List<ConvertObjOrder> createConversionOrder(ConvertObjOrder convertObjOrder,ConvertObj convertObj,ConvertRule convertRule,Date currentDate) throws Exception;


    /**
     * 查询所有有效的物品信息
     * @return
     */
    List<ConvertObj> findAllValidConvertObj();

    /**
     * 查询并锁住相应的以物换物的物品
     * @param convertObjId
     * @return
     */
    ConvertObj findAndLockConverObjByConvertObjId(Long convertObjId);

    /**
     * 以物换物(后台管理调用)，后台确认后完成订单（解冻、更新状态）
     * @param convertObjOrderId
     * @param logisticsOrderId
     * @param logisticsOperator
     * @return
     */
    void completeConvertObjOrder(Long convertObjOrderId,String logisticsOrderId,String logisticsOperator);

    /**
     * 通过主键查询以物换物订单
     * @param convertObjOrderId
     * @return
     */
    ConvertObjOrder queryConvertObjOrderById(Long convertObjOrderId);

    /**
     * 通过主键Id查询以物换物规则信息
     * @param convertObjId
     * @param commodityId
     * @return
     */
    ConvertRule queryConvertRuleById(Long convertObjId,Long commodityId);


    /**
     * 物品在用户和系统之间的转移，修改兑换物品的库存,并记录流水
     * @param userInfoId    用户id
     * @param convertObjId  操作物品id
     * @param quantity      操作数量
     * @param currentOpSeq  当前操作序列
     * @param opDirection   操作方向， to_user:转至用户，to_sys ：转至平台
     * @param remark        说明
     * @return
     */
    ConvertObjFlowRecord transfer(long userInfoId, long convertObjId, int quantity, long currentOpSeq, String opDirection, String remark);

    /**
     * 系统物品调拨
     * @param convertObjId
     * @param quantity
     * @param opDirection
     * @param remark
     * @return
     */
    ConvertObj allot(long convertObjId, int quantity, String opDirection, String remark);

    /**
     * 抽奖
     * @param convertObj
     */
    void drawObj(ConvertObj convertObj);

    /**
     * 根据以物换物的ID和报名时间查询可以参加抽奖的订单
     * @param convertObj
     * @return
     */
    List<ConvertObjOrder> queryConvertObjOrder(ConvertObj convertObj);

    /**
     * 查询需要进行抽奖的物品数据
     * @param date
     * @return
     */
    List<ConvertObj> findDrawList(Date date);

    /**
     * 查询最近的抽奖物品数据
     * @param notInIdList 需要排除的
     * @return
     */
    ConvertObj findNearestDraw(List<Long> notInIdList);

    /**
     * 抽奖策略
     * @param convertObjOrders      参加抽奖的订单（已经按报名序号排序）
     * @param drawTimes             抽奖次数
     * @param randomSeed            随机因子（恒生指数，彩票中奖编号等等）
     * @return
     */
    List<Integer> drawStrategy(List<ConvertObjOrder> convertObjOrders, int drawTimes, long randomSeed) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException;

    /**
     * 通过Id查询相关订单列表
     * @param convertObjId
     * @return
     */
    List<ConvertObjOrder> queryConvertObjOrderListById(Long convertObjId);

    /**
     * 查询中奖者列表
     * @param convertObjId
     * @return
     */
    List<ConvertObjOrder> querydrawPeopleList(Long convertObjId,Long userInfoId,boolean type);

    /**
     * 通过分组Id查询用户订单
     * @param orderGroupId
     * @param userInfoId
     * @return
     */
    List<ConvertObjOrder> queryAllConvertOrderListByOrderGroupId(String orderGroupId,Long userInfoId);

}
