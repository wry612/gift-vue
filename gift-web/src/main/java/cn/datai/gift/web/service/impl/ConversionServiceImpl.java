package cn.datai.gift.web.service.impl;

import cn.datai.gift.persist.mapper.*;
import cn.datai.gift.persist.po.*;
import cn.datai.gift.persist.vo.commodity.CommodityVo;
import cn.datai.gift.persist.vo.conversion.ConvertRuleVO;
import cn.datai.gift.utils.DateUtil;
import cn.datai.gift.utils.RespResult;
import cn.datai.gift.utils.enums.RespCode;
import cn.datai.gift.utils.exception.BizException;
import cn.datai.gift.web.contants.StatusConstants;
import cn.datai.gift.web.contants.enums.*;
import cn.datai.gift.web.service.*;
import cn.datai.gift.web.utils.MyStringUtil;
import cn.datai.gift.web.vo.Conversion.MultiDraw;
import cn.datai.gift.web.vo.tradeDetail.AttachVo;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.collections.map.HashedMap;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by zhangyutao on 2017/6/19.
 */
@Service
public class ConversionServiceImpl implements ConversionService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ConvertObjMapperExt convertObjMapperExt;

    @Autowired
    private ConvertRuleMapperExt convertRuleMapperExt;

    @Autowired
    private ConvertObjOrderMapperExt convertObjOrderMapperExt;

    @Autowired
    private ConvertObjFlowRecordMapperExt convertObjFlowRecordMapperExt;

    @Autowired
    private TradeAccountService tradeAccountService;

    @Autowired
    private UserBizBriefMapperExt userBizBriefMapperExt;

    @Autowired
    private CommodityService commodityService;

    @Autowired
    private TradeDetailService tradeDetailService;

    @Autowired
    private BaseInfoService baseInfoService;


    /**
     * 物品明细
     * @param convertObjId
     */
    @Override
    @Transactional(readOnly = true)
    public ConvertObj findDetailById(long convertObjId) {
        ConvertObj convertObj = this.convertObjMapperExt.selectByPrimaryKey(convertObjId);
        return convertObj;
    }

    /**
     * 根据物品id查询兑换规则
     * @return
     * @param convertObjId
     */
    @Override
    @Transactional(readOnly = true)
    public List<ConvertRule> findRuleByObjId(long convertObjId) {
        ConvertRuleExample example = new ConvertRuleExample();
        example.or().andConvertObjIdEqualTo(convertObjId);
        List<ConvertRule> convertRules = this.convertRuleMapperExt.selectByExample(example);
        return convertRules;
    }

    /**
     * 通过物品id查询具体兑换条件信息
     * @param convertObjId 物品id
     * @param userInfoId   用户id，用于查询用户能够兑换该物品的持仓数
     * @return
     */
    @Override
    @Transactional(readOnly = true)
    public List<ConvertRuleVO> findRuleVOByObjId(long convertObjId, long userInfoId) {
        ConvertRuleExample example = new ConvertRuleExample();
        example.or().andConvertObjIdEqualTo(convertObjId);
        HashMap<String, Object> otherParams = new HashMap<>();
        otherParams.put("userInfoId", userInfoId);
        List<ConvertRuleVO>  ruleVOList= this.convertRuleMapperExt.selectVOByExample(example, otherParams);
        return ruleVOList;
    }

    /**
     * 以物换物下单
     * @param convertObjOrder
     * @return
     */
    @Override
    @Transactional(isolation = Isolation.READ_COMMITTED)
    public List<ConvertObjOrder> order(ConvertObjOrder convertObjOrder) throws Exception {
        ConvertObj convertObj = this.findAndLockConverObjByConvertObjId(convertObjOrder.getConvertObjId());

        if ( convertObj.getAvailableQuantity() <= 0) {
            //物品没有库存
            throw new BizException(RespCode.CONVERT_OBJ_EMPTY);
        }

        if("DRAW".equals(convertObj.getRuleType())){
            if(!MyStringUtil.equals(convertObj.getSignQuantityMin().toString(),convertObj.getSignQuantityMax().toString())){
                throw new BizException(RespCode.NOT_SAME_MIN_AND_MAX);
            }
        }

        if (convertObjOrder.getConvertObjQuantity() <= 0) {//数量不能小于1
            throw new BizException(RespCode.CONVERT_OBJ_QUANTITY_ERROR);
        }

        //不能超过每次兑换或抽奖的最大数量限制
        String systemParamsValue = baseInfoService.getSystemParamsValue(StatusConstants.MAX_CONVERSION_DRAW);
        if(Integer.valueOf(systemParamsValue)<convertObjOrder.getConvertObjQuantity()){
            throw new BizException(RespCode.OVER_PER_OPERATE_ERROR);
        }

        Date currentTime = new Date();
        if (currentTime.before(convertObj.getStartTime()) || currentTime.after(convertObj.getEndTime())) {
            //兑换时间不在可执行时间范围内
            throw new BizException(RespCode.CONVERT_OBJ_TIME_INVALID);
        }

        //查询兑换比例
        ConvertRule convertRule = queryConvertRuleById(convertObjOrder.getConvertObjId(), convertObjOrder.getCommodityContractId());
        if(null == convertRule){
            logger.error("查询兑换规则为null");
            throw new BizException(RespCode.SERVER_ERROR);
        }

        if(convertObj.getRuleType().equals(ConversionStatus.DRAW.getPersistKey())){
            //抽奖
            return createDrawOrder(convertObjOrder,convertObj,convertRule,currentTime);
        }else{
            //兑换
            int consumeCommodityQuantity = convertRule.getComodityObjRatio() * convertObjOrder.getConvertObjQuantity();
            convertObjOrder.setConsumeCommodityQuantity(consumeCommodityQuantity);
            return createConversionOrder(convertObjOrder,convertObj,convertRule,currentTime);
        }

    }


    /**
     * 创建以物换物订单(抽奖)
     * @return
     */
    @Override
    @Transactional(isolation = Isolation.READ_COMMITTED)
    public List<ConvertObjOrder> createDrawOrder(ConvertObjOrder convertObjOrder,ConvertObj convertObj,ConvertRule convertRule,Date currentTime) throws IOException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        List<ConvertObjOrder> orderList = new ArrayList<>();

        Long commodityContractId = convertObjOrder.getCommodityContractId();//商品Id

        //redis获取商品所有信息
        CommodityVo commodityVo = this.commodityService.findById(commodityContractId);

        String orderGroupId = DateUtil.toString(currentTime, DateUtil.DT_FMT_3);//订单组Id前缀

        //分开下单
        for(int i = 0 ; i < convertObjOrder.getConvertObjQuantity();i++){
            ConvertObjOrder insertOrder = new ConvertObjOrder();
            PropertyUtils.copyProperties(insertOrder,convertObjOrder);

            int consumeCommodityQuantity = convertRule.getComodityObjRatio() * 1;//实际每一单消耗商品数量就是比例值
            //冻结用户的持仓(以防有中奖和未中奖的所以分开冻结,好分开解冻)
            RespResult respResult = tradeAccountService.baseFreeze(commodityContractId, convertObjOrder.getUserInfoId(), AccountType.USER, BigDecimal.valueOf(consumeCommodityQuantity), CommodityFlowType.OBJ_CONVERT_OBJ,  CommodityFlowType.OBJ_CONVERT_OBJ.getPersistKey(), "以物换物抽奖用户冻结");
            //获取商品流通记录Id
            HashMap<String, Object> map = (HashMap<String, Object>)respResult.getBody();
            CommodityFlowRecord outFlow = (CommodityFlowRecord)map.get("outFlow");
            CommodityFlowRecord freezeFlow = (CommodityFlowRecord)map.get("freezeFlow");
            insertOrder.setCommodityFlowRecordIds(outFlow.getCommodityFlowRecordId() + "," + freezeFlow.getCommodityFlowRecordId());//设置商品流通记录
            insertOrder.setConsumeCommodityQuantity(consumeCommodityQuantity);//每一单消耗的商品数量
            insertOrder.setConvertObjQuantity(1);//每一单消耗的物品数量
            insertOrder.setOrderTime(currentTime);//下单时间
            insertOrder.setDeliveryTime(currentTime);//发货时间
            insertOrder.setRuleType(convertObj.getRuleType());//抽奖
            insertOrder.setStatus(ConversionStatus.ORDERED.getPersistKey());//状态标记为下单
            long totalPrice = commodityVo.getUnitPrice() * consumeCommodityQuantity;//商品的总价值
            insertOrder.setCommodityTotalPrice(totalPrice);
            convertObj.setSignQuantity(convertObj.getSignQuantity() + 1);//已报名的人数

            //每次检查是不是报名超出规定人数
            if(convertObj.getSignQuantity() > convertObj.getSignQuantityMin()){
                throw new BizException(RespCode.OVER_MAX_DRAW_NUM);
            }
            //用户参加活动序号，现在规定为10000 + 报名人数数量
            insertOrder.setSignSeq(Integer.valueOf(baseInfoService.getSystemParamsValue(StatusConstants.ACTIVITY_BEGIN_SEQ)) + convertObj.getSignQuantity());

            //以物换物订单信息(已下单，尚未最终确认，需要后台确认,方可解冻)
            this.convertObjOrderMapperExt.insert(insertOrder);

            if(i == 0){//以第一个订单的为组Id
                orderGroupId = orderGroupId + "_" + insertOrder.getConvertObjOrderId();
            }
            insertOrder.setOrderGroupId(orderGroupId);
            this.convertObjOrderMapperExt.updateByPrimaryKeySelective(insertOrder);//更新订单组ID

            //新增业务概况表记录
            UserBizBrief userBizBrief = new UserBizBrief();
            userBizBrief.setUserInfoId(insertOrder.getUserInfoId());
            userBizBrief.setBizId(insertOrder.getConvertObjOrderId().toString());//以物换物订单Id
            userBizBrief.setCommodityContractId(commodityContractId);
            userBizBrief.setBizType(PayBizType.CONVERSION.getPersistKey());//以物换物和抽奖都为此状态
            userBizBrief.setCreateTime(insertOrder.getOrderTime());
            userBizBrief.setOpCommodityUnitQuantity(new BigDecimal(insertOrder.getConsumeCommodityQuantity()));
            userBizBrief.setCommodityTypeId(commodityVo.getCommodityTypeId());
            userBizBrief.setCommodityName(commodityVo.getCommodityName());
            userBizBrief.setBizStatus(PayBizType.CONVERSION.getPersistKey());//以物换物和抽奖都为此状态

            AttachVo attachVo = new AttachVo();
            attachVo.setOrderGroupId(insertOrder.getOrderGroupId());
            userBizBrief.setAttach(JSONObject.toJSONString(attachVo));//订单组Id
            this.userBizBriefMapperExt.insertSelective(userBizBrief);

            orderList.add(insertOrder);
        }

        this.convertObjMapperExt.updateByPrimaryKeySelective(convertObj);

        return orderList;

    }

    /**
     * 创建以物换物订单(兑换)
     * @return
     */
    @Override
    @Transactional(isolation = Isolation.READ_COMMITTED)
    public List<ConvertObjOrder> createConversionOrder(ConvertObjOrder convertObjOrder,ConvertObj convertObj,ConvertRule convertRule,Date currentTime) throws IOException {

        List<ConvertObjOrder> orderList = new ArrayList<>();

        Long commodityContractId = convertObjOrder.getCommodityContractId();//商品Id
        CommodityVo commodityVo = this.commodityService.findById(commodityContractId);//redis获取商品所有信息

        //冻结用户的持仓
        RespResult respResult = tradeAccountService.baseFreeze(commodityContractId, convertObjOrder.getUserInfoId(), AccountType.USER, BigDecimal.valueOf(convertObjOrder.getConsumeCommodityQuantity()), CommodityFlowType.OBJ_CONVERT_OBJ,  CommodityFlowType.OBJ_CONVERT_OBJ.getPersistKey(), "以物换物用户冻结");

        //获取商品流通记录Id
        HashMap<String, Object> map = (HashMap<String, Object>)respResult.getBody();
        CommodityFlowRecord outFlow = (CommodityFlowRecord)map.get("outFlow");
        CommodityFlowRecord freezeFlow = (CommodityFlowRecord)map.get("freezeFlow");
        convertObjOrder.setCommodityFlowRecordIds(outFlow.getCommodityFlowRecordId() + "," + freezeFlow.getCommodityFlowRecordId());//设置商品流通记录

        //将物品从系统转给用户
        ConvertObjFlowRecord transfer = this.transfer(convertObjOrder.getUserInfoId(), convertObj.getConvertObjId(), convertObjOrder.getConvertObjQuantity(), convertObj.getOpSeq(), "to_user", "物品从系统转给用户");

        convertObjOrder.setConvertObjFlowRecordIds(transfer.getConvertObjFlowRecordId().toString());//设置物品流通记录
        convertObjOrder.setStatus(ConversionStatus.NOT_DELIVER.getPersistKey());//状态标记为代发货
        convertObjOrder.setOrderTime(currentTime);//下单时间
        convertObjOrder.setDeliveryTime(currentTime);//发货时间
        convertObjOrder.setRuleType(convertObj.getRuleType());//兑换
        int commodityQuantity = new BigDecimal(convertRule.getComodityObjRatio()).multiply(new BigDecimal(convertObjOrder.getConvertObjQuantity())).intValueExact();
        convertObjOrder.setConsumeCommodityQuantity(commodityQuantity);//消耗的商品数量
        long totalPrice = commodityVo.getUnitPrice() * convertObjOrder.getConsumeCommodityQuantity();//商品的总价值
        convertObjOrder.setCommodityTotalPrice(totalPrice);

        //以物换物订单信息(已下单，尚未最终确认，需要后台确认,方可解冻)
        this.convertObjOrderMapperExt.insert(convertObjOrder);

        //新增业务概况表记录
        UserBizBrief userBizBrief = new UserBizBrief();
        userBizBrief.setUserInfoId(convertObjOrder.getUserInfoId());
        userBizBrief.setBizId(convertObjOrder.getConvertObjOrderId().toString());//以物换物订单Id
        userBizBrief.setCommodityContractId(commodityContractId);
        userBizBrief.setBizType(PayBizType.CONVERSION.getPersistKey());//以物换物和抽奖都为此状态
        userBizBrief.setCreateTime(convertObjOrder.getOrderTime());
        userBizBrief.setOpCommodityUnitQuantity(new BigDecimal(convertObjOrder.getConsumeCommodityQuantity()));
        userBizBrief.setCommodityTypeId(commodityVo.getCommodityTypeId());
        userBizBrief.setCommodityName(commodityVo.getCommodityName());
        userBizBrief.setBizStatus(PayBizType.CONVERSION.getPersistKey());//以物换物和抽奖都为此状态
        this.userBizBriefMapperExt.insertSelective(userBizBrief);

        orderList.add(convertObjOrder);

        return orderList;
    }

    /**
     * 查询所有有效的物品信息
     * @return
     */
    @Override
    @Transactional(readOnly = true)
    public List<ConvertObj> findAllValidConvertObj() {
        ConvertObjExample example = new ConvertObjExample();
        Date date = new Date();
        example.or().andStartTimeLessThan(date).andEndTimeGreaterThan(date);
        List<ConvertObj> convertObjList = this.convertObjMapperExt.selectByExample(example);
        return convertObjList;
    }

    /**
     * 查询并锁住相应的以物换物的物品
     * @param convertObjId
     * @return
     */
    @Override
    @Transactional(isolation = Isolation.READ_COMMITTED)
    public ConvertObj findAndLockConverObjByConvertObjId(Long convertObjId) {
        return convertObjMapperExt.findAndLockConverObjByConvertObjId(convertObjId);
    }

    /**
     * 以物换物(后台管理调用)，后台确认后完成订单（解冻、更新状态）
     * @param convertObjOrderId
     * @param logisticsOrderId
     * @param logisticsOperator
     * @return
     */
    @Override
    @Transactional
    public void completeConvertObjOrder(Long convertObjOrderId, String logisticsOrderId, String logisticsOperator) {
        //查询并锁住以物换物订单信息
        ConvertObjOrder convertObjOrder = convertObjOrderMapperExt.findAndLockConvertObjOrderById(convertObjOrderId);
        if(convertObjOrder == null || convertObjOrder.getStatus().equals(TradeOrderStatus.SUCCESS.getPersistKey())){
            throw new BizException(RespCode.CONVERT_OBJ_NOT_ORDERED);
        }
        convertObjOrder.setLogisticsOperator(logisticsOperator);//物流公司
        convertObjOrder.setLogisticsOrderId(logisticsOrderId);//物流单号

        convertObjOrder.setStatus(TradeOrderStatus.SUCCESS.getPersistKey());
        convertObjOrder.setFinishTime(new Date());

        ConvertObj convertObj = this.findDetailById(convertObjOrder.getConvertObjId());

        List<UserBizBrief> userBizBriefList = tradeDetailService.queryUserBizBriefList(convertObjOrder.getConvertObjOrderId(), PayBizType.CONVERSION.getPersistKey());
        if(null == userBizBriefList || userBizBriefList.isEmpty() || userBizBriefList.size()>1){
            throw new BizException(RespCode.NOT_FIND_RECORD);
        }
        UserBizBrief userBizBrief = userBizBriefList.get(0);
        if(!userBizBrief.getBizType().equals(PayBizType.CONVERSION.getPersistKey())){
            throw new BizException(RespCode.NOT_FIND_RECORD);
        }
        userBizBrief.setBizStatus(TradeOrderStatus.SUCCESS.getPersistKey());
        userBizBriefMapperExt.updateByPrimaryKeySelective(userBizBrief);

        if(!convertObjOrder.getRuleType().equals(ConversionStatus.DRAW.getPersistKey())){
            //以物换物
            //用户--->特别账户
            tradeAccountService.baseUnfreeze(convertObjOrder.getCommodityContractId(),convertObjOrder.getUserInfoId(),AccountType.USER,convertObj.getTransferToUserId(),AccountType.USER,new BigDecimal(convertObjOrder.getConsumeCommodityQuantity()),CommodityFlowType.OBJ_CONVERT_OBJ,CommodityFlowType.OBJ_CONVERT_OBJ.getPersistKey(),"以物换物用户解冻到特别账户");
        }else{
            //抽奖类型
            if(convertObjOrder.getWin().equals("TRUE")){
                //报名用户中奖了，报名所用户的持仓不会退还  -->转移给特别账户
                tradeAccountService.baseUnfreeze(convertObjOrder.getCommodityContractId(),convertObjOrder.getUserInfoId(),AccountType.USER,convertObj.getTransferToUserId(),AccountType.USER,new BigDecimal(convertObjOrder.getConsumeCommodityQuantity()),CommodityFlowType.OBJ_CONVERT_DRAW,CommodityFlowType.OBJ_CONVERT_DRAW.getPersistKey(),"报名抽奖,中奖，划走");
                //已中奖的会产生物品流通记录
                ConvertObjFlowRecord convertObjFlowRecord = this.transfer(convertObjOrder.getUserInfoId(), convertObj.getConvertObjId(), 1, convertObj.getOpSeq(), "to_user", "抽奖中奖用户");
                //添加物品流通信息
                convertObjOrder.setConvertObjFlowRecordIds(convertObjOrder.getConvertObjFlowRecordIds() + "," + convertObjFlowRecord.getConvertObjFlowRecordId());
            }
        }

        convertObjOrderMapperExt.updateByPrimaryKeySelective(convertObjOrder);//更新

    }

    /**
     * 通过主键查询以物换物订单
     * @param convertObjOrderId
     * @return
     */
    @Override
    @Transactional(readOnly = true)
    public ConvertObjOrder queryConvertObjOrderById(Long convertObjOrderId) {
        return this.convertObjOrderMapperExt.selectByPrimaryKey(convertObjOrderId);
    }

    /**
     * 物品在用户和系统之间的转移，修改兑换物品的库存,并记录流水
     * @param userInfoId    用户id
     * @param convertObjId  操作物品id
     * @param quantity      操作数量
     * @param preOpSeq      之前操作序列
     * @param opDirection   操作方向， to_user:转至用户，to_sys ：转至平台
     * @param remark        说明   @return
     */
    @Override
    @Transactional(isolation = Isolation.READ_COMMITTED)
    public ConvertObjFlowRecord transfer(long userInfoId, long convertObjId, int quantity, long preOpSeq, String opDirection, String remark) {

        ConvertObj convertObj = this.convertObjMapperExt.findAndLockConverObjByConvertObjId(convertObjId);
        Integer availableQuantity = convertObj.getAvailableQuantity();

        //系统和用户之间的转移
        if (StringUtils.equals(opDirection, "to_user")) {
            //从系统转至用户,扣库存
            int compare = Integer.compare(availableQuantity, quantity);
            if (compare < 0) {
                throw new BizException(RespCode.CONVERT_OBJ_EMPTY);
            }
            int afterQuantity = availableQuantity - quantity;
            if(convertObj.getRuleType().equals("IMMEDIATE") && afterQuantity == 0){
                //兑换类型,物品失效
                convertObj.setValid("FALSE");
            }
            convertObj.setAvailableQuantity(afterQuantity);
            convertObj.setOpSeq(preOpSeq + 1);
            this.convertObjMapperExt.updateByPrimaryKeySelective(convertObj);
            ConvertObjFlowRecord convertObjFlowRecord = this.createConvertObjFlow(userInfoId, convertObjId, quantity, preOpSeq + 1, opDirection, remark, availableQuantity, afterQuantity);
            return convertObjFlowRecord;

        }else if (StringUtils.equals(opDirection, "from_user")) {
            //从用户转至系统
            //加库存
            int afterQuantity = new BigDecimal(availableQuantity).add(new BigDecimal(quantity)).intValueExact();
            convertObj.setAvailableQuantity(afterQuantity);
            this.convertObjMapperExt.updateByPrimaryKeySelective(convertObj);
            //插入流水记录
            ConvertObjFlowRecord convertObjFlowRecord = createConvertObjFlow(userInfoId, convertObjId, quantity, preOpSeq + 1, opDirection, remark, availableQuantity, afterQuantity);
            return convertObjFlowRecord;
        }else
            throw new BizException(RespCode.PARAMS_ERROR);
    }

    /**
     * 系统物品调拨
     * @param convertObjId
     * @param quantity
     * @param opDirection
     * @param remark
     * @return
     */
    @Override
    @Transactional
    public ConvertObj allot(long convertObjId, int quantity, String opDirection, String remark) {
        //TODO
        return null;
    }

    /**
     * 抽奖
     *
     * @param convertObj
     */
    @Override
    @Transactional(isolation = Isolation.READ_COMMITTED)
    public void drawObj(ConvertObj convertObj) {
        //确保是要执行的有效的要抽奖的物品
        if(null == convertObj || convertObj.getDrawed().equals("TRUE") || convertObj.getValid().equals("FALSE")) {
            throw new BizException(RespCode.CAN_NOT_DRAW);
        }

        //根据Id和报名时间查询出能够参与抽奖的已报名用户
        List<ConvertObjOrder> convertObjOrderList = this.queryConvertObjOrder(convertObj);

        //小于最小人数 || 大于最大人数 不能抽奖,直接更新物品状态，并退还所有用户订单
        if(convertObj.getSignQuantityMin() > convertObj.getSignQuantity() || convertObj.getSignQuantityMax() < convertObj.getSignQuantity()){
            if(null == convertObjOrderList || convertObjOrderList.isEmpty() || convertObjOrderList.size() == 0){
                //没有人报名
            }else{
                //有人报名
                for(ConvertObjOrder objOrder : convertObjOrderList){
                    objOrder.setWin("NOT_DRAW");//将该订单标记为取消开奖
                    objOrder.setStatus(TradeOrderStatus.SUCCESS.getPersistKey());//直接完成订单，不经过后台

                    //退还报名的持仓量(未中奖，未开奖)
                    tradeAccountService.baseUnfreeze(objOrder.getCommodityContractId(),objOrder.getUserInfoId(),AccountType.USER,objOrder.getUserInfoId(),AccountType.USER,new BigDecimal(objOrder.getConsumeCommodityQuantity()),CommodityFlowType.OBJ_CONVERT_DRAW,CommodityFlowType.OBJ_CONVERT_DRAW.getPersistKey(),"报名抽奖，未中奖，退回");

                    List<UserBizBrief> userBizBriefList = tradeDetailService.queryUserBizBriefList(objOrder.getConvertObjOrderId(), PayBizType.CONVERSION.getPersistKey());
                    UserBizBrief userBizBrief = userBizBriefList.get(0);
                    userBizBrief.setBizStatus(TradeOrderStatus.SUCCESS.getPersistKey());//以物换物和抽奖都标记为完成状态
                    userBizBriefMapperExt.updateByPrimaryKeySelective(userBizBrief);
                    this.convertObjOrderMapperExt.updateByPrimaryKeySelective(objOrder);//更新订单
                }
            }
            convertObj.setValid("FALSE");//该物品标记为失效
            convertObj.setDrawed("NOT_DRAW");//该物品标记为不够人数，不予开奖
        }else{
            //满足抽奖条件，开奖
            //调用抽奖逻辑，产生中奖的编码
            List<Integer> drawNumList = null;
            Map<Integer, MultiDraw> darwLeverMap = null;
            try {
                drawNumList = this.drawStrategy(convertObjOrderList,convertObj.getAvailableQuantity(),0);//中奖的列表
                darwLeverMap = this.getDarwLeverMap(drawNumList, convertObj.getMultiObjDetail());
            } catch (Exception e) {
                logger.error("调用抽奖策略异常：", e);
                convertObj.setValid("FALSE");//该物品标记为失效
                convertObj.setDrawed("NOT_DRAW");
                return;
            }
            for(ConvertObjOrder objOrder : convertObjOrderList){
                boolean contains = drawNumList.contains(objOrder.getSignSeq());//说明中奖了
                if(contains){
                    String multiObjDetail = this.getMultiObjDetail(objOrder.getSignSeq(), darwLeverMap);//中奖信息
                    objOrder.setMultiObjDetail(multiObjDetail);
                    objOrder.setWin("TRUE");
                    objOrder.setStatus(ConversionStatus.NOT_DELIVER.getPersistKey());//设置为待发货状态
                }else{
                    objOrder.setStatus(TradeOrderStatus.SUCCESS.getPersistKey());//直接完成订单，不经过后台
                    objOrder.setWin("FALSE");

                    //退还报名的持仓量(未中奖，未开奖)
                    tradeAccountService.baseUnfreeze(objOrder.getCommodityContractId(),objOrder.getUserInfoId(),AccountType.USER,objOrder.getUserInfoId(),AccountType.USER,new BigDecimal(objOrder.getConsumeCommodityQuantity()),CommodityFlowType.OBJ_CONVERT_DRAW,CommodityFlowType.OBJ_CONVERT_DRAW.getPersistKey(),"报名抽奖，未中奖，退回");

                    List<UserBizBrief> userBizBriefList = tradeDetailService.queryUserBizBriefList(objOrder.getConvertObjOrderId(), PayBizType.CONVERSION.getPersistKey());
                    UserBizBrief userBizBrief = userBizBriefList.get(0);
                    if(!userBizBrief.getBizStatus().equals(PayBizType.CONVERSION.getPersistKey())){
                        throw new BizException(RespCode.NOT_FIND_RECORD);
                    }
                    userBizBrief.setBizStatus(TradeOrderStatus.SUCCESS.getPersistKey());//以物换物和抽奖都标记为完成状态
                    userBizBriefMapperExt.updateByPrimaryKeySelective(userBizBrief);
                }
                this.convertObjOrderMapperExt.updateByPrimaryKeySelective(objOrder);
            }
            convertObj.setValid("FALSE");//该物品标记为失效
            convertObj.setDrawed("TRUE");//该物品标记为已兑奖
        }

        this.convertObjMapperExt.updateByPrimaryKeySelective(convertObj);//最后更新物品状态

    }

    /**
     * 根据以物换物的ID和报名时间查询可以参加抽奖的订单
     *
     * @param convertObj
     * @return
     */
    @Override
    public List<ConvertObjOrder> queryConvertObjOrder(ConvertObj convertObj) {
        ConvertObjOrderExample example = new ConvertObjOrderExample();
        example.setOrderByClause(" SIGN_SEQ ASC ");
        example.createCriteria().andConvertObjIdEqualTo(convertObj.getConvertObjId())
                .andOrderTimeBetween(convertObj.getStartTime(),convertObj.getEndTime())
                .andRuleTypeEqualTo(ConversionStatus.DRAW.getPersistKey())
                .andWinIsNull();
        return  this.convertObjOrderMapperExt.selectByExample(example);
    }

    @Transactional
    private ConvertObjFlowRecord createConvertObjFlow(long userInfoId, long convertObjId, int quantity, long currentOpSeq, String opDirection, String remark, Integer availableQuantity, int afterQuantity) {
        // 插入流水记录
        ConvertObjFlowRecord convertObjFlowRecord = new ConvertObjFlowRecord();
        convertObjFlowRecord.setConvertObjId(convertObjId);
        convertObjFlowRecord.setUserInfoId(userInfoId);
        convertObjFlowRecord.setOpSeq(currentOpSeq);
        convertObjFlowRecord.setOpDirection(opDirection);
        convertObjFlowRecord.setBeforeQuantity(availableQuantity);
        convertObjFlowRecord.setOpQuantity(quantity);
        convertObjFlowRecord.setAfterQuantity(afterQuantity);
        convertObjFlowRecord.setOpTime(new Date());
        convertObjFlowRecord.setRemark(remark);
        this.convertObjFlowRecordMapperExt.insert(convertObjFlowRecord);
        return convertObjFlowRecord;
    }

    /**
     * 通过主键Id查询以物换物规则信息
     *
     * @param convertObjId
     * @param commodityId
     * @return
     */
    @Override
    public ConvertRule queryConvertRuleById(Long convertObjId, Long commodityId) {
        ConvertRuleExample convertRuleExample = new ConvertRuleExample();
        convertRuleExample.createCriteria().andCommodityContractIdEqualTo(commodityId).andConvertObjIdEqualTo(convertObjId);
        List<ConvertRule> ruleList = this.convertRuleMapperExt.selectByExample(convertRuleExample);
        return ruleList.get(0);
    }

    @Override
    public List<ConvertObj> findDrawList(Date date) {
        ConvertObjExample example = new ConvertObjExample();
        ConvertObjExample.Criteria criteria = example.createCriteria();
        criteria.andDrawTimeLessThanOrEqualTo(date);
        criteria.andValidEqualTo("TRUE");
        criteria.andRuleTypeEqualTo(ConversionStatus.DRAW.getPersistKey());
        criteria.andDrawedEqualTo("FALSE");
        List<ConvertObj> dataList = this.convertObjMapperExt.selectByExample(example);
        return dataList;
    }

    public ConvertObj findNearestDraw(List<Long> notInIdList) {
        ConvertObjExample example = new ConvertObjExample();
        ConvertObjExample.Criteria criteria = example.createCriteria();
        criteria.andValidEqualTo("TRUE");
        criteria.andRuleTypeEqualTo(ConversionStatus.DRAW.getPersistKey());
        criteria.andDrawedEqualTo("FALSE");

        if (notInIdList != null && !notInIdList.isEmpty()) {
            criteria.andConvertObjIdNotIn(notInIdList);
        }
        example.setOrderByClause(" DRAW_TIME ASC ");
        List<ConvertObj> dataList = this.convertObjMapperExt.selectByExample(example);
        if (dataList != null && !dataList.isEmpty()) {
            return dataList.get(0);
        }
        return null;
    }

    /**
     * 抽奖策略
     * @param canDrawList      参加抽奖的订单（已经按报名序号排序）
     * @param drawTimes             抽奖次数
     * @param randomSeed            随机因子（恒生指数，彩票中奖编号等等）
     * @return
     */
    @Override
    public List<Integer> drawStrategy(List<ConvertObjOrder> canDrawList, int drawTimes, long randomSeed) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        List<ConvertObjOrder> convertObjOrders = new ArrayList<>(canDrawList);

        if (convertObjOrders == null) {
            throw new BizException("参加抽奖的订单不得为空");
        }
        logger.debug("convertObjOrders Size: {}", convertObjOrders.size());
        logger.debug("drawTimes{}", drawTimes);
        logger.debug("randomSeed: {}", randomSeed);
        int originOrderSize = convertObjOrders.size();
        if (originOrderSize < 10) {
            throw new BizException("参加抽奖的订单不得少于10个");
        }
        if (originOrderSize > Integer.MAX_VALUE) {
            throw new BizException("抽奖订单已超过系统最大值");
        }
        if (drawTimes < 1) {
            throw new BizException("抽奖次数不能小于1");
        }
        if (drawTimes > originOrderSize) {
            throw new BizException("抽奖次数超过报名参加抽奖的订单数");
        }

        ArrayList<Integer> winnerSeqList = new ArrayList<>();//中奖序号列表

        SimpleDateFormat dateFormat = new SimpleDateFormat("HHmmssSSS");
        ConvertObjOrder firstOrder = convertObjOrders.get(0);//第一个订单

        long sum100 = convertObjOrders.parallelStream()//后100个订单时间戳求和
                .skip(originOrderSize - 10)
                .limit(10)
                .mapToLong(e -> Long.parseLong(dateFormat.format(e.getOrderTime())))
                .sum();
        long winSeq = (sum100 + randomSeed) % originOrderSize + firstOrder.getSignSeq();//第一个中奖序号
        winnerSeqList.add((int)winSeq);
        logger.debug("第一次中奖序号：{}", winSeq);

        if (drawTimes > 1) {//抽奖次数不止一次
            long sum50 = convertObjOrders.parallelStream()//后续中奖序号的偏移值， 后50个订单时间戳求和
                    .skip(originOrderSize - 5)
                    .limit(5)
                    .mapToLong(e -> Long.parseLong(dateFormat.format(e.getOrderTime())))
                    .sum();

            int firstWinIndex = (int)(winSeq - firstOrder.getSignSeq());//第一个中奖的订单在list中的index值
            convertObjOrders.remove(firstWinIndex);//移除第一个中奖的序号

            int offset = (int)((sum50 + randomSeed) % (originOrderSize-1) );//原始偏移值
            logger.debug("抽奖原始偏移值：{}", offset);
            int startIndex = firstWinIndex;//计算偏移的起始index，默认按第一次抽中的index作为开始
            for(int i = 0 ; i < drawTimes-1 ; i++) {
                int nextWinIndex = 0;
                if(convertObjOrders.size() > 1){
                    //等于1说明只剩一个，直接取index=0
                    nextWinIndex = startIndex + (offset % (convertObjOrders.size()-1) );//计算下一次中奖的index, 对offset取余，再做偏移
                }
//                logger.debug("尝试计算偏移值：{}", (offset % (convertObjOrders.size()-1) ));
                if (nextWinIndex > convertObjOrders.size()-1 ) {
                    //如果计算出来的下一次中奖的index值超出list的范围，将计算出的index值减去当前列表长度，算出超出的那部分，作为下次中奖的index值
                    nextWinIndex = nextWinIndex - convertObjOrders.size();
                }
//                logger.debug("计算后的下一次中奖的索引值为：{}" , nextWinIndex);
                ConvertObjOrder convertObjOrder = convertObjOrders.get(nextWinIndex);
                winnerSeqList.add(convertObjOrder.getSignSeq());
//                logger.debug("计算后的下一次中奖的幸运号：{}" , convertObjOrder.getSignSeq());
                convertObjOrders.remove(nextWinIndex);
                startIndex = nextWinIndex;
//                logger.debug("-----------------------------------------------");
            }
        }

        return winnerSeqList;
    }

    /**
     * 通过Id查询相关订单列表
     * @param convertObjId
     * @return
     */
    @Override
    public List<ConvertObjOrder> queryConvertObjOrderListById(Long convertObjId) {
//        后10条
        Map<String,Object> map = new HashedMap();
        map.put("convertObjId",convertObjId);
        map.put("num",10);
        List<ConvertObjOrder> orderList = this.convertObjOrderMapperExt.queryConvertObjOrderLimitNum(map);

        //第一条
        map.put("num",1);
        List<ConvertObjOrder> orderListOne = this.convertObjOrderMapperExt.queryConvertObjOrderLimitNum(map);
        if(orderList.containsAll(orderListOne)){
            return orderList;
        }
        orderList.addAll(orderListOne);
        return orderList;

    }

    /**
     * 查询中奖者列表
     * @param convertObjId
     * @return
     */
    @Override
    public List<ConvertObjOrder> querydrawPeopleList(Long convertObjId,Long userInfoId,boolean type) {
        ConvertObjOrderExample orderExample = new ConvertObjOrderExample();
        ConvertObjOrderExample.Criteria criteria = orderExample.createCriteria();
        criteria.andConvertObjIdEqualTo(convertObjId).andWinEqualTo("TRUE");
        if(type){
            criteria.andUserInfoIdEqualTo(userInfoId);
        }
        return this.convertObjOrderMapperExt.selectByExample(orderExample);
    }

    /**
     * 通过分组Id查询用户订单
     *
     * @param orderGroupId
     * @param userInfoId
     * @return
     */
    @Override
    public List<ConvertObjOrder> queryAllConvertOrderListByOrderGroupId(String orderGroupId, Long userInfoId) {
        ConvertObjOrderExample example = new ConvertObjOrderExample();
        example.createCriteria().andOrderGroupIdEqualTo(orderGroupId).andUserInfoIdEqualTo(userInfoId);
        return this.convertObjOrderMapperExt.selectByExample(example);
    }

    /**
     * 获取中奖列表和奖项的对应关系
     * @param drawList
     * @param multiObjDetail
     * @return
     */
    public static Map<Integer,MultiDraw> getDarwLeverMap(List<Integer> drawList, String multiObjDetail){
        if(MyStringUtil.isBlank(multiObjDetail)){
            throw new BizException(RespCode.NOT_FIND_MULTI_OBJ_DETAIL);
        }

        List<MultiDraw> multiDrawList = JSONObject.parseArray(multiObjDetail,MultiDraw.class);//所有的奖项信息
        if(null == multiDrawList || multiDrawList.isEmpty()){
            throw new BizException(RespCode.NOT_FIND_MULTI_OBJ_DETAIL);
        }

        int count = multiDrawList.stream().mapToInt(item -> item.getPrizeNum()).sum();//所有奖品的总个数
        if(drawList.size() != count){
            throw new BizException(RespCode.NOT_SAME_DRAW_SETTING);
        }

        List<MultiDraw> allDrawList  = new ArrayList<>();
        for(int i = 0 ;i<multiDrawList.size();i++){
            int bengin  = 0;
            while (bengin<multiDrawList.get(i).getPrizeNum()){
                bengin++;
                allDrawList.add(new MultiDraw(multiDrawList.get(i).getPrizeLevel(),multiDrawList.get(i).getPrizeName(),1,multiDrawList.get(i).getPrice()));
            }
        }

        Map<Integer,MultiDraw> map = new HashMap<>();
        drawList.forEach((v) ->{
            map.put(v,allDrawList.get(drawList.indexOf(v)));//活动序列号和奖项之间的对应关系(设置物品奖项的时候应该按照一二三等奖。。。顺序设置)
        });

        return map;
    }

    /**
     * 根据活动序列Id获取奖品等级信息
     * @param drawSeq
     * @param map
     * @return
     */
    public static String getMultiObjDetail(int drawSeq,Map<Integer,MultiDraw> map){
        if(null == map){
            throw new BizException(RespCode.NOT_FIND_MULTI_OBJ_DETAIL);
        }

        MultiDraw multiDraw = map.get(drawSeq);
        if(null == multiDraw){
            throw new BizException(RespCode.NOT_FIND_MULTI_OBJ_DETAIL);
        }
        List<MultiDraw> multiDrawList = new ArrayList<>();
        multiDrawList.add(multiDraw);
        return JSONObject.toJSONString(multiDrawList);
    }

}
