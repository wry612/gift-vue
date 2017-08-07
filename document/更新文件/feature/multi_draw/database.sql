
# 以物换物活动明细和订单明细新增字段
ALTER TABLE convert_obj ADD multi_obj_detail VARCHAR(512) NULL COMMENT '多奖项奖品明细， json格式，包含 奖品等级、奖品名称、奖品数量';

ALTER TABLE convert_obj_order ADD ORDER_GROUP_ID VARCHAR(64) NULL COMMENT '订单组id';
ALTER TABLE convert_obj_order
  MODIFY COLUMN ORDER_GROUP_ID VARCHAR(64) COMMENT '订单组id' AFTER CONVERT_OBJ_ORDER_ID;

ALTER TABLE convert_obj_order ADD MULTI_OBJ_DETAIL VARCHAR(1024) NULL COMMENT '多奖项信息, json格式 包含奖品等级、奖品名称';



ALTER TABLE convert_obj_order ADD WIN_LEVEL VARCHAR(32) NULL COMMENT '中奖等级， 1：一等奖   2：二等奖  以此类推';
ALTER TABLE convert_obj_order
  MODIFY COLUMN WIN_LEVEL VARCHAR(32) COMMENT '中奖等级， 1：一等奖   2：二等奖  以此类推' AFTER WIN;



INSERT INTO system_param (NAME, VALUE, REMARK) VALUES ('MAX_CONVERSION_DRAW', '10', '兑换和抽奖活动增加两个限制： 可以限定每人每次购买的最大份数');