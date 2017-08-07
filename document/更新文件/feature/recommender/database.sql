
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



# 系统参数新增字段
ALTER TABLE system_param ADD DICT_TYPE VARCHAR(64) NULL COMMENT '字典类型';
ALTER TABLE system_param ADD DATA_TYPE VARCHAR(64) NULL COMMENT '数据类型';
ALTER TABLE system_param ADD VALID ENUM('FALSE', 'TRUE') NULL COMMENT '是否有效';
ALTER TABLE system_param ADD CREATE_TIME DATETIME NULL COMMENT '创建时间';

#将现有系统参数类型修改为SYSTEM_PARAM
UPDATE system_param set DICT_TYPE="SYSTEM_PARAM";








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



INSERT INTO system_param (NAME, VALUE, REMARK, DICT_TYPE, DATA_TYPE, VALID, CREATE_TIME) VALUES ('RECOMMENDER_MAX_AGE', '86400', '推荐人cookie有效时间，默认一天', 'SYSTEM_PARAM', null, 'TRUE', null);
INSERT INTO system_param (NAME, VALUE, REMARK, DICT_TYPE, DATA_TYPE, VALID, CREATE_TIME) VALUES ('BROKER_PARAM_VERSION', '1', '版本号', 'BROKER_PARAM', 'TEXT', 'TRUE', null);
INSERT INTO system_param (NAME, VALUE, REMARK, DICT_TYPE, DATA_TYPE, VALID, CREATE_TIME) VALUES ('BROKER_PARAM_VALID', 'true', '是否有效', 'BROKER_PARAM', 'BOOLEAN', 'TRUE', null);
INSERT INTO system_param (NAME, VALUE, REMARK, DICT_TYPE, DATA_TYPE, VALID, CREATE_TIME) VALUES ('BROKER_PARAM_OLD_GIFT', 'true', '老用户赠礼', 'BROKER_PARAM', 'BOOLEAN', 'TRUE', null);
INSERT INTO system_param (NAME, VALUE, REMARK, DICT_TYPE, DATA_TYPE, VALID, CREATE_TIME) VALUES ('BROKER_PARAM_OLD_ID', '[{"type":"COMMODITY","id":"2","count":"10"},{"type":"COMMODITY","id":"4","count":"15"}]', '老用户赠礼商品', 'BROKER_PARAM', 'GIFT', 'TRUE', null);
INSERT INTO system_param (NAME, VALUE, REMARK, DICT_TYPE, DATA_TYPE, VALID, CREATE_TIME) VALUES ('BROKER_PARAM_NEW_GIFT', 'true', '新用户赠礼', 'BROKER_PARAM', 'BOOLEAN', 'TRUE', null);
INSERT INTO system_param (NAME, VALUE, REMARK, DICT_TYPE, DATA_TYPE, VALID, CREATE_TIME) VALUES ('BROKER_PARAM_NEW_ID', '[{"type":"COMMODITY","id":"5","count":"15"},{"type":"COMMODITY","id":"3","count":"20"}]', '新用户赠礼商品', 'BROKER_PARAM', 'GIFT', 'TRUE', null);
INSERT INTO system_param (NAME, VALUE, REMARK, DICT_TYPE, DATA_TYPE, VALID, CREATE_TIME) VALUES ('CERTER_USER_ID', '10', '发放推荐相关礼品的平台账户ID', 'SYSTEM_PARAM', null, 'TRUE', null);
