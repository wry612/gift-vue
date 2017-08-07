# 新增规格单位价格字段
ALTER TABLE commodity_price ADD STANDARD_PRICE BIGINT(18) NULL COMMENT '规格单位价格, 单位分';
ALTER TABLE commodity_price
  MODIFY COLUMN TIME DATETIME COMMENT '时间' AFTER STANDARD_PRICE;

ALTER TABLE commodity_price_history ADD STANDARD_PRICE BIGINT(18) NULL COMMENT '规格单位价格, 单位分';
ALTER TABLE commodity_price_history
  MODIFY COLUMN TIME DATETIME COMMENT '时间' AFTER STANDARD_PRICE;


ALTER TABLE trade_order ADD COMMODITY_STANDARD_QUANTITY DECIMAL(20) NULL COMMENT '商品规格单位数量';
ALTER TABLE trade_order ADD COMMODITY_STANDARD_PRICE BIGINT(18) NULL COMMENT '商品规格单位单价 分为单位';
ALTER TABLE trade_order
  MODIFY COLUMN COMMODITY_STANDARD_QUANTITY DECIMAL(20) COMMENT '商品规格单位数量' AFTER COMMODITY_UNIT_PRICE,
  MODIFY COLUMN COMMODITY_STANDARD_PRICE BIGINT(18) COMMENT '商品规格单位单价 分为单位' AFTER COMMODITY_STANDARD_QUANTITY;












UPDATE system_param set `VALUE` ="true" WHERE `NAME`= "NEED_BIND";














DROP TABLE IF EXISTS EXPRESS_INFO;

/*==============================================================*/
/* Table: EXPRESS_INFO                                          */
/*==============================================================*/
CREATE TABLE EXPRESS_INFO
(
  EXPRESS_INFO_ID      BIGINT(18) NOT NULL AUTO_INCREMENT COMMENT '物流跟踪信息id(自增)',
  USER_INFO_ID         BIGINT(18) COMMENT '用户id',
  EXP_TEXT_NAME        VARCHAR(64) COMMENT '快递公司名称',
  EXP_SPELL_NAME       VARCHAR(64) COMMENT '快递公司简称',
  MAIL_NO              VARCHAR(64) COMMENT '快递单号',
  QUERY_TIME           DATETIME(6) COMMENT '数据最后查询时间',
  DATA_UPDATE_TIME     DATETIME(6) COMMENT '数据最后更新时间',
  STATUS               VARCHAR(16) COMMENT '状态： -1 待查询 0 查询异常 1 暂无记录 2 在途中 3 派送中 4 已签收 5 用户拒签 6 疑难件 7 无效单  8 超时单 9 签收失败 10 退回',
  TEL                  VARCHAR(64) COMMENT '快递公司电话',
  DATUM                VARCHAR(2048) COMMENT '具体快递路径信息, json格式， 按时间排序 如：   [{"time": “2016-06-26 12:26”, "context": "已签收,签收人是:【本人】"},{"time": “2016-06-25 15:31”, "context": "【陕西陇县公司】的派件员【西城业务员】正在派件"}]',
  RECEIVER_NAME        VARCHAR(64) COMMENT '收货人姓名',
  RECEIVER_CONTACT     VARCHAR(64) COMMENT '收货人联系方式',
  RECEIVER_ADDRESS     VARCHAR(64) COMMENT '收货人地址',
  CREATE_TIME          DATETIME(6) COMMENT '记录创建时间',
  PRIMARY KEY (EXPRESS_INFO_ID)
);

ALTER TABLE EXPRESS_INFO COMMENT '物流跟踪信息';




ALTER TABLE delivery_order ADD EXPRESS_INFO_ID BIGINT(18) NULL COMMENT '物流跟踪信息id';
ALTER TABLE delivery_order
  MODIFY COLUMN EXPRESS_INFO_ID BIGINT(18) COMMENT '物流跟踪信息id' AFTER LOGISTICS_ORDER_ID;


ALTER TABLE convert_obj_order ADD EXPRESS_INFO_ID BIGINT(18) NULL COMMENT '物流跟踪信息id';
ALTER TABLE convert_obj_order
  MODIFY COLUMN EXPRESS_INFO_ID BIGINT(18) COMMENT '物流跟踪信息id' AFTER LOGISTICS_ORDER_ID;


drop table if exists EXPRESS_COMPANY;

/*==============================================================*/
/* Table: EXPRESS_COMPANY                                       */
/*==============================================================*/
create table EXPRESS_COMPANY
(
  EXPRESS_COMPANY_ID   bigint(18) not null auto_increment comment '快递公司ID号（自增）',
  COMPANY_EXP_NAME     varchar(100) not null comment '快递公司名称',
  COMPANY_SIMPLE_NAME  varchar(100) comment '快递公司拼音或英文简称',
  PHONE                varchar(100) comment '官方电话',
  IMGURL               varchar(256) comment '快递公司图片',
  URL                  varchar(256) comment '官方网址',
  NOTE                 varchar(512) comment '备注信息',
  RANDOMSEQ            int(8) comment '随机串',
  primary key (EXPRESS_COMPANY_ID)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

alter table EXPRESS_COMPANY comment '快递公司表';


























ALTER TABLE convert_obj ADD SIGN_QUANTITY_MIN INT NULL COMMENT '报名人数下限';
ALTER TABLE convert_obj ADD SIGN_QUANTITY_MAX INT NULL COMMENT '报名人数上限';


ALTER TABLE convert_obj_order ADD SIGN_SEQ INT NULL COMMENT '参加活动序号， 针对对应的活动，报名或参加的顺序编号';
ALTER TABLE convert_obj_order
  MODIFY COLUMN SIGN_SEQ INT COMMENT '参加活动序号， 针对对应的活动，报名或参加的顺序编号' AFTER CONVERT_OBJ_ORDER_ID;




ALTER TABLE convert_obj_order MODIFY ORDER_TIME DATETIME(6) COMMENT '下单时间';

INSERT INTO system_param (NAME, VALUE, REMARK) VALUES ('ACTIVITY_BEGIN_SEQ', '500000', '用户参加抽奖活动的初始默认开始编号');

ALTER TABLE convert_obj_order AUTO_INCREMENT = 1000000;



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

































ALTER TABLE user_info ADD REFERER_USER_ID BIGINT NULL COMMENT '推荐人用户id';
ALTER TABLE user_info CHANGE IS_REFERRER IS_BROKER ENUM('FALSE', 'TRUE') COMMENT '是否可作为经纪人,TRUE:可作为经纪人   FALSE：不可作为经纪人';
ALTER TABLE user_info CHANGE REFERRER_USER_ID BROKER_USER_ID BIGINT(18) COMMENT '经纪人用户id';




# 新增经纪人表
CREATE TABLE BROKER_INFO
(
  USER_INFO_ID         BIGINT(18) COMMENT '经纪人用户id',
  ACT_TIME             DATETIME COMMENT '激活时间',
  DESTROY_TIME         DATETIME COMMENT '注销时间',
  STATUS               VARCHAR(32) COMMENT '状态',
  ACTIVITY_RULE        VARCHAR(1024) COMMENT '活动规则, json格式  包含字段：版本号（必要字段）、是否有效（必要字段） 针对版本1的字段： 赠礼使用的账号、老用户赠礼开关、给老用户赠礼类型（券或商品）、给老用户赠送物品id、给老用户赠送数量、新用户赠礼开关、给新用户赠礼类型（券或商品）、给新用户赠送物品id、给新用户赠送数量',
  PRIMARY KEY (USER_INFO_ID)
);

ALTER TABLE BROKER_INFO COMMENT '经纪人相关信息';












DROP TABLE IF EXISTS ACTIVITY_PRESENT;

/*==============================================================*/
/* Table: ACTIVITY_PRESENT                                      */
/*==============================================================*/
CREATE TABLE ACTIVITY_PRESENT
(
  ACTIVITY_PRESENT_ID  BIGINT(18) NOT NULL AUTO_INCREMENT COMMENT '活动赠礼id',
  USER_INFO_ID         BIGINT(18) COMMENT '用户id',
  PRESENT_USER_ID      BIGINT(18) COMMENT '赠礼人id',
  PRESENT_TYPE         VARCHAR(32) COMMENT '赠送类型， COMMODITY：商品  ，   TICKET：券    ',
  PRESENT_REASON       VARCHAR(64) COMMENT '赠礼原因',
  COMMODITY_ID         BIGINT(18) COMMENT '赠送的商品id',
  QUANTITY             BIGINT(18) COMMENT '赠送商品数量',
  TICKET_ID            BIGINT(18) COMMENT '赠送的券id',
  STATUS               VARCHAR(32) COMMENT '状态   NOT_PRESENT:未赠送      PRESENTED:已赠送',
  CREATE_TIME          DATETIME(6) COMMENT '创建时间',
  SUCCESS_TIME         DATETIME(6) COMMENT '赠送成功时间',
  REMARK               VARCHAR(512) COMMENT '备注',
  COMMODITY_FLOW_IDS   VARCHAR(512) COMMENT '商品流通记录, 多个用英文逗号隔开',
  PRIMARY KEY (ACTIVITY_PRESENT_ID)
);

ALTER TABLE ACTIVITY_PRESENT COMMENT '活动赠礼';





# 系统参数新增字段
ALTER TABLE system_param ADD DICT_TYPE VARCHAR(64) NULL COMMENT '字典类型';
ALTER TABLE system_param ADD DATA_TYPE VARCHAR(64) NULL COMMENT '数据类型';
ALTER TABLE system_param ADD VALID ENUM('FALSE', 'TRUE') NULL COMMENT '是否有效';
ALTER TABLE system_param ADD CREATE_TIME DATETIME NULL COMMENT '创建时间';

#将现有系统参数类型修改为SYSTEM_PARAM
UPDATE system_param set DICT_TYPE="SYSTEM_PARAM";


INSERT INTO system_param (NAME, VALUE, REMARK, DICT_TYPE, DATA_TYPE, VALID, CREATE_TIME) VALUES ('RECOMMENDER_MAX_AGE', '86400', '推荐人cookie有效时间，默认一天', 'SYSTEM_PARAM', null, 'TRUE', null);
INSERT INTO system_param (NAME, VALUE, REMARK, DICT_TYPE, DATA_TYPE, VALID, CREATE_TIME) VALUES ('BROKER_PARAM_VERSION', '1', '版本号', 'BROKER_PARAM', 'TEXT', 'TRUE', null);
INSERT INTO system_param (NAME, VALUE, REMARK, DICT_TYPE, DATA_TYPE, VALID, CREATE_TIME) VALUES ('BROKER_PARAM_VALID', 'true', '是否有效', 'BROKER_PARAM', 'BOOLEAN', 'TRUE', null);
INSERT INTO system_param (NAME, VALUE, REMARK, DICT_TYPE, DATA_TYPE, VALID, CREATE_TIME) VALUES ('BROKER_PARAM_OLD_GIFT', 'true', '老用户赠礼', 'BROKER_PARAM', 'BOOLEAN', 'TRUE', null);
INSERT INTO system_param (NAME, VALUE, REMARK, DICT_TYPE, DATA_TYPE, VALID, CREATE_TIME) VALUES ('BROKER_PARAM_OLD_ID', '[{"type":"COMMODITY","id":"2","count":"10"},{"type":"COMMODITY","id":"4","count":"15"}]', '老用户赠礼商品', 'BROKER_PARAM', 'GIFT', 'TRUE', null);
INSERT INTO system_param (NAME, VALUE, REMARK, DICT_TYPE, DATA_TYPE, VALID, CREATE_TIME) VALUES ('BROKER_PARAM_NEW_GIFT', 'true', '新用户赠礼', 'BROKER_PARAM', 'BOOLEAN', 'TRUE', null);
INSERT INTO system_param (NAME, VALUE, REMARK, DICT_TYPE, DATA_TYPE, VALID, CREATE_TIME) VALUES ('BROKER_PARAM_NEW_ID', '[{"type":"COMMODITY","id":"5","count":"15"},{"type":"COMMODITY","id":"3","count":"20"}]', '新用户赠礼商品', 'BROKER_PARAM', 'GIFT', 'TRUE', null);
INSERT INTO system_param (NAME, VALUE, REMARK, DICT_TYPE, DATA_TYPE, VALID, CREATE_TIME) VALUES ('CERTER_USER_ID', '10', '发放推荐相关礼品的平台账户ID', 'SYSTEM_PARAM', null, 'TRUE', null);