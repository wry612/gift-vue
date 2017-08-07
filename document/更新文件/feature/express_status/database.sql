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