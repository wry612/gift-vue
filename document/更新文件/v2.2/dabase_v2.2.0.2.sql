DROP TABLE IF EXISTS CONVERT_OBJ;

DROP TABLE IF EXISTS CONVERT_OBJ_FLOW_RECORD;

DROP TABLE IF EXISTS CONVERT_OBJ_ORDER;

DROP TABLE IF EXISTS CONVERT_RULE;

/*==============================================================*/
/* Table: CONVERT_OBJ                                           */
/*==============================================================*/
CREATE TABLE CONVERT_OBJ
(
  CONVERT_OBJ_ID       BIGINT(18) NOT NULL AUTO_INCREMENT,
  TRANSFER_TO_USER_ID  BIGINT(18) COMMENT '被兑换的商品转移到的特别用户id',
  LITE_NAME            VARCHAR(64) COMMENT '兑换的物品简称',
  FULL_NAME            VARCHAR(256) COMMENT '兑换的物品全称',
  VRTUAL_OR_ACTUAL     VARCHAR(64) COMMENT '兑换的物品虚实类型',
  UNIT_NAME            VARCHAR(32) COMMENT '物品单位名称',
  RULE_TYPE            VARCHAR(32) COMMENT '规则类型,   IMMEDIATE:立即兑换  、 DRAW:定期抽奖',
  MARKET_PRICE         INT COMMENT '市场价',
  TOTAL_QUANTITY       INT COMMENT '总量',
  AVAILABLE_QUANTITY   INT COMMENT '库存',
  START_TIME           DATETIME COMMENT '开始兑换时间',
  END_TIME             DATETIME COMMENT '结束兑换时间',
  REMARK               VARCHAR(256) COMMENT '注释',
  ICON                 VARCHAR(256) COMMENT 'icon',
  HEAD_IMGS            VARCHAR(1024) COMMENT '头部图片',
  INTRODUCE_IMGS       VARCHAR(1024) COMMENT '介绍图片',
  OTHER_PROPERTIES     VARCHAR(256) COMMENT '其他属性',
  CREATE_TIME          DATETIME COMMENT '创建时间',
  VALID                VARCHAR(32) COMMENT '是否有效， TRUE:有效    FALSE:失效',
  DRAWED               VARCHAR(32) COMMENT '是否已兑奖（针对抽奖类型）， TRUE:已兑奖    FALSE:未兑奖',
  DRAW_TIME            DATETIME COMMENT '抽奖时间（针对抽奖类型）',
  SIGN_QUANTITY        INT COMMENT '已报名人数(针对抽奖类型)',
  OP_SEQ               BIGINT(18) COMMENT '操作序列，用于记录流水顺序',
  PRIMARY KEY (CONVERT_OBJ_ID)
);

ALTER TABLE CONVERT_OBJ COMMENT '以物换物兑换的商品';

/*==============================================================*/
/* Table: CONVERT_OBJ_FLOW_RECORD                               */
/*==============================================================*/
CREATE TABLE CONVERT_OBJ_FLOW_RECORD
(
  CONVERT_OBJ_FLOW_RECORD_ID BIGINT(18) NOT NULL AUTO_INCREMENT COMMENT '以物换物变更记录id',
  CONVERT_OBJ_ID       BIGINT(18) COMMENT '兑换物品id',
  USER_INFO_ID         BIGINT(18) COMMENT '用户id',
  OP_SEQ               BIGINT(18) COMMENT '操作序列',
  OP_DIRECTION         VARCHAR(32) COMMENT '操作方向： to_user: 转至用户，   from_user::从用户转至平台, allot_in:调入   allot_out:调出',
  BEFORE_QUANTITY      INT COMMENT '本次操作前，系统中拥有的兑换物品数量',
  OP_QUANTITY          INT COMMENT '修改的物品数量',
  AFTER_QUANTITY       INT COMMENT '本次操作后，系统中拥有的兑换物品数量',
  OP_TIME              DATETIME COMMENT '操作时间',
  EXTEND_INFO          VARCHAR(1024) COMMENT '附加信息',
  REMARK               VARCHAR(512) COMMENT '描述',
  PRIMARY KEY (CONVERT_OBJ_FLOW_RECORD_ID)
);

ALTER TABLE CONVERT_OBJ_FLOW_RECORD COMMENT '以物换物变更记录';

/*==============================================================*/
/* Table: CONVERT_OBJ_ORDER                                     */
/*==============================================================*/
CREATE TABLE CONVERT_OBJ_ORDER
(
  CONVERT_OBJ_ORDER_ID BIGINT(18) NOT NULL AUTO_INCREMENT COMMENT '以物换物订单id',
  USER_INFO_ID         BIGINT(18) COMMENT '用户id',
  CONVERT_OBJ_ID       BIGINT(18) COMMENT '兑换物品id',
  COMMODITY_CONTRACT_ID BIGINT(18) COMMENT '商品合约信息id',
  STATUS               VARCHAR(32) COMMENT '状态： ',
  CONVERT_OBJ_QUANTITY INT COMMENT '兑换物品数量',
  CONSUME_COMMODITY_QUANTITY INT COMMENT '消耗商品数量',
  COMMODITY_TOTAL_PRICE BIGINT(18) COMMENT '商品总价，单位分',
  ORDER_TIME           DATETIME COMMENT '下单时间',
  APPLY_CANCEL_TIME    DATETIME COMMENT '申请取消时间',
  CANCEL_TIME          DATETIME COMMENT '取消时间',
  DELIVERY_TIME        DATETIME COMMENT '发货时间',
  FINISH_TIME          DATETIME COMMENT '完成时间',
  RULE_TYPE            VARCHAR(32) COMMENT '规则类型,   IMMEDIATE:立即兑换  、 DRAW:定期抽奖',
  ADDRESSEE_NAME       VARCHAR(30) COMMENT '收货人姓名',
  ADDRESSEE_MOBILE_PHONE VARCHAR(30) COMMENT '收货人手机号',
  PROVICE_FIRST_STAGE_NAME VARCHAR(128) COMMENT '收货地址第一级地址',
  ADDRESS_CITY_SECOND_STAGE_NAME VARCHAR(128) COMMENT '收货地址第二级地址',
  ADDRESS_COUNTIES_THIRD_STAGE_NAME VARCHAR(128) COMMENT '收货地址第三级地址',
  ADDRESS_DETAIL_INFO  VARCHAR(128) COMMENT '详细收货地址信息',
  ADDRESS_POSTAL_CODE  VARCHAR(32) COMMENT '邮编',
  DATE_EXPECT          DATETIME COMMENT '期望的提货日期',
  REMARK               VARCHAR(512) COMMENT '备注',
  COMMODITY_FLOW_RECORD_IDS VARCHAR(256) COMMENT '商品流通记录信息ids， 多个用逗号隔开',
  LOGISTICS_OPERATOR   VARCHAR(256) COMMENT '物流运营商',
  LOGISTICS_ORDER_ID   VARCHAR(256) COMMENT '物流单号',
  WIN                  VARCHAR(32) COMMENT '是否中奖,  TRUE:中奖     FALSE:未中奖',
  CONVERT_OBJ_FLOW_RECORD_IDS VARCHAR(256) COMMENT '物品流通记录ids, 多个用英文逗号隔开',
  SELLER_DELIVERY_INFO  VARCHAR(1024) COMMENT '卖家发货信息, json格式',
  PRIMARY KEY (CONVERT_OBJ_ORDER_ID)
);

ALTER TABLE CONVERT_OBJ_ORDER COMMENT '以物换物订单';

/*==============================================================*/
/* Table: CONVERT_RULE                                          */
/*==============================================================*/
CREATE TABLE CONVERT_RULE
(
  CONVERT_OBJ_ID       BIGINT(18) NOT NULL COMMENT '兑换的物品id',
  COMMODITY_CONTRACT_ID BIGINT(18) NOT NULL COMMENT '商品合约信息id',
  COMODITY_OBJ_RATIO   INT COMMENT '商品与物品兑换比例，  例如：100 表示100个最小单位商品可以兑换一个物品',
  CREATE_TIME          DATETIME COMMENT '创建时间',
  PRIMARY KEY (CONVERT_OBJ_ID, COMMODITY_CONTRACT_ID)
);

ALTER TABLE CONVERT_RULE COMMENT '以物换物兑换条件';








INSERT INTO SYSTEM_PARAM (NAME, VALUE, REMARK) VALUES ('DRAW_RATIO', '10', '抽奖人数稀释倍数');








drop table if exists sys_download_record;

/*==============================================================*/
/* Table: sys_download_record                                   */
/*==============================================================*/
create table sys_download_record
(
  ID                   bigint(20) not null auto_increment comment 'ID号',
  USER_ID              bigint(20) comment '申请人ID号',
  NICKNAME             varchar(32) comment '申请人昵称',
  MODULETYPE           varchar(32) comment '数据模块类别',
  PARAMS               varchar(512) comment '条件JSON串',
  CREATETIME           datetime comment '申请时间',
  COMPLETETIME         datetime comment '完成时间',
  FILEPATH             varchar(256) comment '文件路径',
  SCHEDULES            tinyint(3) comment '完成进度',
  STATUS               enum('WAIT','PROCESS','SUCCESS','FAILED','INVALID') not null comment '状态',
  primary key (ID)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 comment='管理后台下载记录进程表';
