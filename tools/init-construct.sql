DROP TABLE IF EXISTS ADVERTISEMENT;

DROP TABLE IF EXISTS COMMODITY_ALLOT_APPLY;

DROP TABLE IF EXISTS COMMODITY_CONTRACT;

DROP TABLE IF EXISTS COMMODITY_CONTRACT_EXTEND;

DROP TABLE IF EXISTS COMMODITY_FLOW_RECORD;

DROP TABLE IF EXISTS COMMODITY_GIFT_DONATION_DETAIL;

DROP TABLE IF EXISTS COMMODITY_GIFT_INFO;

DROP TABLE IF EXISTS COMMODITY_PRICE;

DROP TABLE IF EXISTS COMMODITY_PRICE_HISTORY;

DROP TABLE IF EXISTS COMMODITY_TYPE;

DROP TABLE IF EXISTS CONVERT_OBJ;

DROP TABLE IF EXISTS CONVERT_OBJ_FLOW_RECORD;

DROP TABLE IF EXISTS CONVERT_OBJ_ORDER;

DROP TABLE IF EXISTS CONVERT_RULE;

DROP TABLE IF EXISTS COUPON;

DROP TABLE IF EXISTS COUPON_DETAIL;

DROP TABLE IF EXISTS COUPON_HISTORY;

DROP TABLE IF EXISTS COUPON_TYPE;

DROP TABLE IF EXISTS DELIVERY_ORDER;

DROP TABLE IF EXISTS GIFT_ACCOUNT;

DROP TABLE IF EXISTS MCH_PAY_RESULT_WX;

DROP TABLE IF EXISTS MCH_PAY_WX;

DROP TABLE IF EXISTS MEMBER_INFO;

DROP TABLE IF EXISTS OPERATOR_INFO;

DROP TABLE IF EXISTS OPERATOR_RELT_GIFT_ACCOUNT;

DROP TABLE IF EXISTS PAY_INFO;

DROP TABLE IF EXISTS PAY_ORDER_WX;

DROP TABLE IF EXISTS REFUND_ORDER_WX;

DROP TABLE IF EXISTS SPEC_USER_INFO;

DROP TABLE IF EXISTS SYSTEM_PARAM;

DROP TABLE IF EXISTS TRADE_ORDER;

DROP TABLE IF EXISTS USER_BIZ_BRIEF;

DROP TABLE IF EXISTS USER_DELIVERY_INFO;

DROP TABLE IF EXISTS USER_INFO;

DROP TABLE IF EXISTS USER_RELT_GIFT_ACCOUNT;

DROP TABLE IF EXISTS USER_WX_INFO;

DROP TABLE IF EXISTS USER_WX_RELT;

DROP TABLE IF EXISTS WXMP_MSG;

DROP TABLE IF EXISTS WXMP_USER_INFO;

/*==============================================================*/
/* Table: ADVERTISEMENT                                         */
/*==============================================================*/
CREATE TABLE ADVERTISEMENT
(
   ADVERTISEMENT_ID     BIGINT(18) NOT NULL AUTO_INCREMENT COMMENT '广告id',
   TITLE                VARCHAR(512) COMMENT '标题',
   ICON                 VARCHAR(512) COMMENT 'icon，存放广告图片文件夹的相对路径',
   LINK                 VARCHAR(512) COMMENT '链接地址，完整的url地址',
   CREATE_TIME          DATETIME COMMENT '广告创建时间',
   TYPE                 VARCHAR(32) COMMENT '广告类型， BANNER：展示在banner，  NORMAL:普通广告 ',
   BANNER_SEQ           INT COMMENT 'banner展示顺序， 展示在banner上的顺序号， 值越小越靠前',
   PRIMARY KEY (ADVERTISEMENT_ID)
);

ALTER TABLE ADVERTISEMENT COMMENT '广告';

/*==============================================================*/
/* Table: COMMODITY_ALLOT_APPLY                                 */
/*==============================================================*/
CREATE TABLE COMMODITY_ALLOT_APPLY
(
   COMMODITY_ALLOT_APPLY BIGINT(18) NOT NULL AUTO_INCREMENT COMMENT '商品对外系统出入申请id',
   GIFT_ACCOUNT_ID      BIGINT(18) COMMENT '礼包账户id',
   ACCOUNT_TYPE         VARCHAR(18) COMMENT '操作账户类型    user:用户     operator：运营商',
   IN_OR_OUT            VARCHAR(12) COMMENT '转入/转出   in：转入   out：转出',
   COMMODITY_UNIT_QUANTITY DECIMAL(20,0) COMMENT '操作商品单位数量',
   STATUS               VARCHAR(18) COMMENT 'applied: 已提交申请    deny：审核驳回     pass：审核通过    success：通过审核后，系统执行完成相应的操作      fail：通过审核后操作失败',
   COMMODITY_FLOW_RECORD_IDS VARCHAR(512) COMMENT '商品流通记录ids，  包括提交审核时的冻结记录， 审核完成后的解冻及可用单位记录，之间用逗号隔开',
   PRIMARY KEY (COMMODITY_ALLOT_APPLY)
);

ALTER TABLE COMMODITY_ALLOT_APPLY COMMENT '商品对外系统出入申请';

/*==============================================================*/
/* Table: COMMODITY_CONTRACT                                    */
/*==============================================================*/
CREATE TABLE COMMODITY_CONTRACT
(
   COMMODITY_CONTRACT_ID BIGINT(18) NOT NULL AUTO_INCREMENT COMMENT '商品合约信息id',
   OPERATOR_INFO_ID     BIGINT(18)  COMMENT '运营商id',
   COMMODITY_TYPE_ID    BIGINT(18) COMMENT '商品类型id',
   COMMODITY_CODE       VARCHAR(18) COMMENT '商品编号',
   SUBJECT_MATTER       VARCHAR(256) COMMENT '标的物',
   COMMODITY_NAME       VARCHAR(256) COMMENT '商品名称',
   UNIT                 VARCHAR(16) COMMENT '基本单位名称   毫升、毫克、克等',
   UNIT_EN              VARCHAR(16) COMMENT '基本单位名称（英文）',
   STANDARD_UNIT_NAME   VARCHAR(32) COMMENT '规格单位名称， 瓶、饼、罐等',
   STANDARD_UNIT_MULTIPLE DECIMAL(20,0) COMMENT '规格单位对应基本单位数， 一瓶/罐对应多少基本单位',
   TRADE_UNIT_MULTIPLE  DECIMAL(20,0) COMMENT '交易单位对应基本单位数（一手）,一手对应多少毫升、毫克',
   STATUS               VARCHAR(256) COMMENT '状态',
   CREATE_TIME          DATETIME COMMENT '创建时间',
   MODIFY_TIME          DATETIME COMMENT '修改时间',
   EXPIRE_TIME          DATETIME COMMENT '过期时间',
   PRIMARY KEY (COMMODITY_CONTRACT_ID)
);

ALTER TABLE COMMODITY_CONTRACT COMMENT '商品合约';

/*==============================================================*/
/* Table: COMMODITY_CONTRACT_EXTEND                             */
/*==============================================================*/
CREATE TABLE COMMODITY_CONTRACT_EXTEND
(
   COMMODITY_CONTRACT_ID BIGINT(18) NOT NULL COMMENT '商品合约信息id',
   PACK_TYPE            VARCHAR(512) COMMENT '包装种类，透气棉纸等等',
   PACK_SIZE            VARCHAR(512) COMMENT '包装尺寸',
   INTRO_BRIEF          VARCHAR(512) COMMENT '精简介绍',
   INTRO_DETAIL_CHAR    VARCHAR(4096) COMMENT '详细介绍（文字）',
   INTRO_DETAIL_LINK    VARCHAR(4096) COMMENT '详细介绍（生成的图文链接）',
   PIC_URL              VARCHAR(2048) COMMENT '图片url,   url中不允许出现逗号， 多个url用逗号分隔',
   ICON_URL             VARCHAR(512) COMMENT 'icon图标url',
   PROPERTIES           VARCHAR(4096) COMMENT '商品属性， json格式， key作为属性名， value作为属性值',
   PRIMARY KEY (COMMODITY_CONTRACT_ID)
);

ALTER TABLE COMMODITY_CONTRACT_EXTEND COMMENT '商品扩展信息';

/*==============================================================*/
/* Table: COMMODITY_FLOW_RECORD                                 */
/*==============================================================*/
CREATE TABLE COMMODITY_FLOW_RECORD
(
   COMMODITY_FLOW_RECORD_ID BIGINT(18) NOT NULL AUTO_INCREMENT COMMENT '商品流通记录id',
   GIFT_ACCOUNT_ID      BIGINT(18) COMMENT '礼包账户id',
   GIFT_ACCOUNT_OP_SEQ  BIGINT(18) COMMENT '礼包账户操作序列，当前礼包账户新增一条记录时，序列值+1，账户刚开户时序列为0',
   OPPONENT_GIFT_ACCOUNT_ID BIGINT(18) COMMENT '用户礼包账户id',
   TYPE                 VARCHAR(64) COMMENT '0：外部系统调拨  1：礼包赠送   2：变现    3：提货',
   ALLOT_OR_TRANSFER    VARCHAR(18) COMMENT '调拨/内部流转, allot:调拨     transfer:内部流转    调拨：从外部系统调入或者从内部系统拨离，   内部流转：账户与账户之间流通',
   IN_OR_OUT            VARCHAR(18) COMMENT 'out：转出  in：转入',
   FREEZE_OR_UNFREEZE   VARCHAR(18) COMMENT 'freeze:冻结     unfreeze:解冻',
   BEFORE_UNIT_QUANTITY DECIMAL(20,0) COMMENT '转入转出之前账户中持有的商品数量',
   TRADE_UNIT_QUANTITY  DECIMAL(20,0) COMMENT '交易商品单位数量',
   AFTER_UNIT_QUANTITY  DECIMAL(20,0) COMMENT '转入转出之后账户中持有的商品数量',
   UNIT_PRICE           BIGINT(18) COMMENT '商品单位价格， 单位：分',
   TRADE_TIME           DATETIME COMMENT '交易时间',
   EXTEND_INFO          VARCHAR(1024) COMMENT '附加信息,json格式',
   REMARK               VARCHAR(512) COMMENT '描述说明',
   PRIMARY KEY (COMMODITY_FLOW_RECORD_ID)
);

ALTER TABLE COMMODITY_FLOW_RECORD COMMENT '商品流通记录';

/*==============================================================*/
/* Table: COMMODITY_GIFT_DONATION_DETAIL                        */
/*==============================================================*/
CREATE TABLE COMMODITY_GIFT_DONATION_DETAIL
(
   COMMODITY_GIFT_DONATION_DETAIL_ID BIGINT(18) NOT NULL AUTO_INCREMENT,
   COMMODITY_GIFT_ID    BIGINT(18) COMMENT '商品礼包id',
   DONEE_USER_ID        BIGINT(18) COMMENT '受赠人用户id',
   COMMODITY_FLOW_RECORD_IDS VARCHAR(512) COMMENT '商品流通记录ids，包括赠与人与受赠人受此单影响的流通记录，多个用逗号隔开',
   COMMODITY_UNIT_QUANTITY DECIMAL(20,0) COMMENT '商品单位数量',
   ADOPT_TIME           DATETIME COMMENT '受赠时间',
   PRIMARY KEY (COMMODITY_GIFT_DONATION_DETAIL_ID)
);

ALTER TABLE COMMODITY_GIFT_DONATION_DETAIL COMMENT '礼包赠与明细';

/*==============================================================*/
/* Table: COMMODITY_GIFT_INFO                                   */
/*==============================================================*/
CREATE TABLE COMMODITY_GIFT_INFO
(
   COMMODITY_GIFT_INFO_ID BIGINT(18) NOT NULL AUTO_INCREMENT COMMENT 'id',
   CODE                 VARCHAR(512) NOT NULL COMMENT '礼包唯一性code',
   DONATOR_GIFT_ACCOUNT_ID BIGINT(18) COMMENT '赠与人礼包账户',
   COMMODITY_CONTRACT_ID BIGINT(18) COMMENT '商品合约信息id',
   GREETING             VARCHAR(512) COMMENT '祝福语',
   TYPE                 VARCHAR(16) COMMENT '0：指定单个受赠人     1：拼手气    2：普通、平均   3：指定配额',
   SPECIFIED_DONEE_USER_ID BIGINT(18) COMMENT '指定受赠人用户id，礼包类型为指定单个受赠人才生效',
   DONEE_QUOTA          INT COMMENT '受赠人数配额',
   DONEE_SURPLUS        INT COMMENT '受赠人数剩余数量',
   COMMODITY_TOTAL_QUANTITY DECIMAL(20,0) COMMENT '礼包中商品单位总数量',
   COMMODITY_SURPLUS_QUANTITY DECIMAL(20,0) COMMENT '礼包中商品剩余单位数量',
   CREATE_TIME          DATETIME COMMENT '礼包生成时间',
   EXPIRED_TIME         DATETIME COMMENT '礼包过期时间',
   COMMODITY_FLOW_RECORD_IDS VARCHAR(512) COMMENT '赠与人生成红包的商品流通记录ids， 多个用逗号隔开',
   REFUNDED             VARCHAR(10) COMMENT '过期是否已处理     true：已处理   false:未处理',
   REFUND_FLOW_RECORD_ID VARCHAR(32) COMMENT '过期退还商品流通记录id',
   DONEE_USER_IDS       VARCHAR(1900) COMMENT '已抢用户id, 多个用户用逗号隔开',
   PRIMARY KEY (COMMODITY_GIFT_INFO_ID)
);

ALTER TABLE COMMODITY_GIFT_INFO COMMENT '赠与人发送的商品礼包';

/*==============================================================*/
/* Table: COMMODITY_PRICE                                       */
/*==============================================================*/
CREATE TABLE COMMODITY_PRICE
(
   COMMODITY_CONTRACT_ID BIGINT(18) NOT NULL COMMENT '商品合约信息id',
   UNIT_PRICE           BIGINT(18) COMMENT '价格， 单位分',
   TIME                 DATETIME COMMENT '时间',
   PRIMARY KEY (COMMODITY_CONTRACT_ID)
);

ALTER TABLE COMMODITY_PRICE COMMENT '商品价格';

/*==============================================================*/
/* Table: COMMODITY_PRICE_HISTORY                               */
/*==============================================================*/
CREATE TABLE COMMODITY_PRICE_HISTORY
(
   COMMODITY_PRICE_HISTORY_ID BIGINT(18) NOT NULL AUTO_INCREMENT,
   COMMODITY_CONTRACT_ID BIGINT(18) COMMENT '商品合约信息id',
   UNIT_PRICE           BIGINT(18) COMMENT '单位价格, 单位分',
   TIME                 DATETIME COMMENT '时间',
   PRIMARY KEY (COMMODITY_PRICE_HISTORY_ID)
);

ALTER TABLE COMMODITY_PRICE_HISTORY COMMENT '商品历史价格';

/*==============================================================*/
/* Table: COMMODITY_TYPE                                        */
/*==============================================================*/
CREATE TABLE COMMODITY_TYPE
(
   COMMODITY_TYPE_ID    BIGINT(18) NOT NULL AUTO_INCREMENT COMMENT '商品类型id',
   CODE                 VARCHAR(32) COMMENT '类型编码',
   NAME                 VARCHAR(32) COMMENT '类型名称',
   REMARK               VARCHAR(32) COMMENT '注释',
   CREATE_TIME          DATETIME COMMENT '创建时间',
   PRIMARY KEY (COMMODITY_TYPE_ID)
);

ALTER TABLE COMMODITY_TYPE COMMENT '商品类型';

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

/*==============================================================*/
/* Table: COUPON                                                */
/*==============================================================*/
CREATE TABLE COUPON
(
   COUPON_ID            BIGINT(18) NOT NULL AUTO_INCREMENT COMMENT 'coupon_id',
   COUPON_TYPE_ID       BIGINT(18) COMMENT '券类型id',
   NAME                 VARCHAR(32) COMMENT '名称',
   ISVALID              VARCHAR(18) COMMENT '0:不启用  1:启用',
   DISCOUNT_TYPE        VARCHAR(18) COMMENT '0：固定金额   1：固定折扣',
   UNIT                 VARCHAR(18) COMMENT '0：分      1：毫升   2：毫克  ',
   UNIT_QUANTITY        DECIMAL(20,0) COMMENT '单位数量',
   DISCOUNT             DECIMAL(20,0) COMMENT '万分比为单位',
   REMARK               VARCHAR(256) COMMENT '注释',
   FIXED_START_TIME     DATETIME COMMENT '固定有效期开始时间，不赋值可在券明细中设置',
   FIXED_END_TIME       DATETIME COMMENT '固定有效期结束时间，不赋值可在券明细中设置',
   DYNAMIC_AVALID_DAY   VARCHAR(18) COMMENT '结束时间从发券当天开始计算',
   CREATE_TIME          DATETIME COMMENT '添加时间',
   MODIFY_TIME          DATETIME COMMENT '修改时间',
   CONDITION_ENOUGH_MONEY DECIMAL(20,0) COMMENT '满多少钱才可使用券',
   CONDITION_ENOUGH_UNIT_QUANTITY DECIMAL(20,0) COMMENT '满多少单位数量才可使用券',
   INCLUDE_COMMODITY_GROUP VARCHAR(512) COMMENT '对现有商品分组，多个群组号用逗号隔开',
   EXCLUDE_COMMODITY_GROUP VARCHAR(512) COMMENT '对现有商品分组，多个群组号用逗号隔开',
   IS_DELIVERY_FREE     VARCHAR(18) COMMENT '是否免运费    0或空：不免运费   1：免运费',
   MODIFY_ADMIN_ID      VARCHAR(18) COMMENT '后台账户id',
   FIXED_CREATE_SUBJECT_ID BIGINT(18) COMMENT '固定某一用户或运营商上生产此券, 空值表示不固定,在券明细中指定生产人',
   FIXED_CREATE_SUBJECT_TYPE VARCHAR(18) COMMENT '固定生产人类型，固定生产人id不为空才有效    0：用户   1：运营商',
   PRIMARY KEY (COUPON_ID)
);

ALTER TABLE COUPON COMMENT '券';

/*==============================================================*/
/* Table: COUPON_DETAIL                                         */
/*==============================================================*/
CREATE TABLE COUPON_DETAIL
(
   COUPON_DETAIL_ID     BIGINT(18) NOT NULL AUTO_INCREMENT COMMENT '券明细id',
   COUPON_ID            BIGINT(18) COMMENT '券id',
   CODE                 VARCHAR(18) COMMENT '券编号',
   PASSWORD             VARCHAR(20) COMMENT '券密码',
   TIME_CREATE          DATETIME COMMENT '生成时间',
   TIME_EXPIRE          DATETIME COMMENT '过期时间',
   TIME_RECEIVE         DATETIME COMMENT '领取时间',
   IS_USED              VARCHAR(18) COMMENT '0：未使用   1：已使用',
   IS_AVALID            VARCHAR(18) COMMENT '是否启用',
   PRODUCER_ID          BIGINT(18) COMMENT '发送券的主体id， 可为运营商、用户、特别用户',
   PRODUCER_TYPE        VARCHAR(18) COMMENT '0： 普通用户  1：特别用户    2：运营商',
   CONSUMER_ID          BIGINT(18) COMMENT '领取券的主体id， 可为运营商、用户、特别用户',
   CONSUMER_TYPE        VARCHAR(18) COMMENT '消费者类型',
   MODIFY_USER          VARCHAR(18) COMMENT '后台操作人',
   PRIMARY KEY (COUPON_DETAIL_ID)
);

ALTER TABLE COUPON_DETAIL COMMENT '券明细';

/*==============================================================*/
/* Table: COUPON_HISTORY                                        */
/*==============================================================*/
CREATE TABLE COUPON_HISTORY
(
   COUPON_HISTORY_ID    BIGINT(18) NOT NULL AUTO_INCREMENT COMMENT '券历史记录id',
   COUPON_DETAIL_ID     BIGINT(18) COMMENT '券明细id',
   CODE                 VARCHAR(18) COMMENT '券号',
   RESULT_DETAIL        VARCHAR(18) COMMENT '记录相关的发券用券明细',
   ACCOUNT_TYPE         VARCHAR(18) COMMENT '0:用户   1：运营商',
   ACCOUNT_ID           BIGINT(18) COMMENT '账户id',
   GIVE_OR_USE          VARCHAR(18) COMMENT '0:发券    1：用券',
   OPERATE_TIME         DATETIME COMMENT '操作时间',
   PRIMARY KEY (COUPON_HISTORY_ID)
);

ALTER TABLE COUPON_HISTORY COMMENT '用券历史记录';

/*==============================================================*/
/* Table: COUPON_TYPE                                           */
/*==============================================================*/
CREATE TABLE COUPON_TYPE
(
   COUPON_TYPE_ID       BIGINT(18) NOT NULL AUTO_INCREMENT COMMENT '券类型id',
   NAME                 VARCHAR(512) COMMENT '名称',
   PRIMARY KEY (COUPON_TYPE_ID)
);

ALTER TABLE COUPON_TYPE COMMENT '现金券、免运费券、折扣券、减运费券、商品券';

/*==============================================================*/
/* Table: DELIVERY_ORDER                                        */
/*==============================================================*/
CREATE TABLE DELIVERY_ORDER
(
   DELIVERY_ORDER_ID    BIGINT(18) NOT NULL AUTO_INCREMENT,
   COMMODITY_CONTRACT_ID BIGINT(18) COMMENT '商品合约id',
   USER_ID              BIGINT(18) COMMENT '用户id',
   USER_TRADE_ACCOUNT_ID BIGINT(18)  COMMENT '当前交易账户id',
   COMMODITY_UNIT_PRICE BIGINT(18)  COMMENT '商品单位单价, 分为单位',
   APPLY_COMMODITY_UNIT_QUANTITY DECIMAL(20,0) COMMENT '申请提货的商品单位数量',
   APPLY_COMMODITY_STANDARD_UNIT_QUANTITY DECIMAL(20,0) COMMENT '申请提货的商品规格数量 (商品单位数量除以规格单位对应基本单位数)',
   COUPON_UNIT_QUANTITY DECIMAL(20,0) COMMENT '优惠折扣商品数量，使用优惠券折扣券获取或折扣的商品数量',
   ADD_ON_COMMODITY_UNIT_QUANTITY DECIMAL(20,0) COMMENT '凑单购买商品单位数量',
   ACT_CONSUME_COMM_UNIT_QUANTITY DECIMAL(20,0) COMMENT '实际消耗礼包商品数量',
   FEE_PERCENT          DECIMAL(20,0) COMMENT '手续费比例, 百分比为单位',
   ADD_ON_PRICE         BIGINT(18)  COMMENT '凑单补购商品需要额外支付的金额， 单位为分',
   FEE_PRICE            BIGINT(18)  COMMENT '手续费, 单位为分',
   POSTAGE_PRICE        BIGINT(18)  COMMENT '邮费， 单位分',
   COUPON_INFO          VARCHAR(1024) COMMENT '优惠券折扣明细， json格式，包含优惠券id， 折扣金额，折扣注释信息  {couponDetailId:123, price:1000, remark: "首单减10元"}',
   COUPON_PRICE         BIGINT(18)  COMMENT '优惠折扣金额，单位分， 优惠券 折扣券抵扣的金额',
   ACTUAL_PRICE         BIGINT(18)  COMMENT '实际需支付的金额 分为单位，  计算公式： 凑单补购金额+手续费+邮费——优惠折扣金额',
   INCOME_PAY_INFO      VARCHAR(1024) COMMENT '收支信息， 包含支付信息id和状态  json格式   [{payid:123, status: "finish"},{payid:234, "status:handling"}, {payid:4545, status:"refund finish"}]',
   ADDRESSEE_NAME       VARCHAR(30) COMMENT '收货人姓名',
   ADDRESSEE_MOBILE_PHONE VARCHAR(30) COMMENT '收货人手机号',
   STORAGEOUT_MODE      VARCHAR(30) COMMENT '0：自提 （需要填写出库地点与联系方式）1：邮寄（需要填写邮寄地址与联系方式）',
   PROVICE_FIRST_STAGE_NAME VARCHAR(128) COMMENT '收货地址第一级地址',
   ADDRESS_CITY_SECOND_STAGE_NAME VARCHAR(128) COMMENT '收货地址第二级地址',
   ADDRESS_COUNTIES_THIRD_STAGE_NAME VARCHAR(128) COMMENT '收货地址第三级地址',
   ADDRESS_DETAIL_INFO  VARCHAR(128) COMMENT '详细收货地址信息',
   ADDRESS_POSTAL_CODE  VARCHAR(32) COMMENT '邮编',
   DATE_EXPECT          DATETIME COMMENT '期望的提货日期',
   COMMODITY_FLOW_RECORD_IDS VARCHAR(256) COMMENT '商品流通记录信息ids， 多个用逗号隔开',
   LOGISTICS_OPERATOR   VARCHAR(256) COMMENT '物流运营商',
   LOGISTICS_ORDER_ID   VARCHAR(256) COMMENT '物流单号',
   STATUS               VARCHAR(30) COMMENT '订单状态：包含所有流程 例如ABC, 末尾C为当前状态，    A:订单已提交，未支付  B:已取消  C:已支付  D：退款中 E：已退款    F:商家已发货  G:退货中  H:已退货   ',
   ORDER_TIME           DATETIME COMMENT '下单时间',
   APPLY_CANCEL_TIME    DATETIME COMMENT '申请取消时间',
   DELIVERY_TIME        DATETIME COMMENT '发货时间',
   SUCCESS_TIME         DATETIME COMMENT '完成时间',
   CLOSE_TIME           DATETIME COMMENT '关闭时间',
   EXPIRE_TIME          DATETIME COMMENT '超时时间',
   PRIMARY KEY (DELIVERY_ORDER_ID)
)
   AUTO_INCREMENT = 1000000;

ALTER TABLE DELIVERY_ORDER COMMENT '提货单';

/*==============================================================*/
/* Table: GIFT_ACCOUNT                                          */
/*==============================================================*/
CREATE TABLE GIFT_ACCOUNT
(
   GIFT_ACCOUNT_ID      BIGINT(18) NOT NULL AUTO_INCREMENT COMMENT '用户礼包账户id',
   COMMODITY_CONTRACT_ID BIGINT(18) NOT NULL COMMENT '商品合约id',
   LAST_OP_SEQ          BIGINT(18) COMMENT '礼包账户最新操作序列，开户时值设为0，操作一次，增加1',
   AVAILABLE_UNIT_QUANTITY DECIMAL(20,0) COMMENT '可用单位数量',
   FROZEN_UNIT_QUANTITY DECIMAL(20,0) COMMENT '冻结单位数量',
   TYPE                 VARCHAR(18) COMMENT 'user:用户    operator:运营商',
   TOTAL_COST_PRICE     BIGINT(18) COMMENT '成本总价, 单位分',
   UPDATE_TIME          DATETIME COMMENT '更新时间',
   CREATE_TIME          DATETIME COMMENT '创建时间',
   REMARK               VARCHAR(512) COMMENT '备注',
   PRIMARY KEY (GIFT_ACCOUNT_ID)
);

ALTER TABLE GIFT_ACCOUNT COMMENT '持有商品的账户';

/*==============================================================*/
/* Table: MCH_PAY_RESULT_WX                                     */
/*==============================================================*/
CREATE TABLE MCH_PAY_RESULT_WX
(
   PARTNER_TRADE_NO     VARCHAR(28) COMMENT '商户订单号，需保持唯一性
            (只能是字母或者数字，不能包含有符号)',
   MCH_ID               VARCHAR(32) COMMENT '商户号，微信支付分配的商户号',
   APPID                VARCHAR(32) COMMENT 'Appid，商户号的appid',
   DETAIL_ID            VARCHAR(32) COMMENT '付款单号，调用企业付款API时，微信系统内部产生的单号',
   SIGN                 VARCHAR(32) COMMENT '签名',
   RESULT_CODE          VARCHAR(32) COMMENT '业务结果 SUCCESS/FAIL',
   ERR_CODE             VARCHAR(32) COMMENT '错误码信息',
   ERR_CODE_DES         VARCHAR(128) COMMENT '错误代码描述，结果信息描述',
   TRANSFER_STATUS      VARCHAR(16) COMMENT '转账状态',
   REASON               VARCHAR(32) COMMENT '失败原因,如果失败则有失败原因',
   OPENID               VARCHAR(32) COMMENT '收款用户openid',
   TRANSFER_NAME        VARCHAR(32) COMMENT '收款用户姓名',
   PAYMENT_AMOUNT       INT COMMENT '付款金额',
   TRANSFER_TIME        VARCHAR(32) COMMENT '转账时间，示例 2015-04-21 20:00:00',
   REMARK               VARCHAR(32) COMMENT '付款描述'
);

ALTER TABLE MCH_PAY_RESULT_WX COMMENT '微信企业付款订单结果';

/*==============================================================*/
/* Table: MCH_PAY_WX                                            */
/*==============================================================*/
CREATE TABLE MCH_PAY_WX
(
   PARTNER_TRADE_NO     VARCHAR(32) NOT NULL COMMENT '商户订单号，需保持唯一性
            (只能是字母或者数字，不能包含有符号)',
   MCH_APPID            VARCHAR(32) COMMENT '公众账号appid，微信分配的公众账号ID（企业号corpid即为此appId）',
   MCHID                VARCHAR(32) COMMENT '商户号，微信支付分配的商户号',
   DEVICE_INFO          VARCHAR(32) COMMENT '设备号，微信支付分配的终端设备号',
   SIGN                 VARCHAR(32) COMMENT '签名，详见 https://pay.weixin.qq.com/wiki/doc/api/tools/mch_pay.php?chapter=4_3',
   OPENID               VARCHAR(32) COMMENT '用户openid，商户appid下，某用户的openid',
   CHECK_NAME           VARCHAR(32) COMMENT '校验用户姓名选项，NO_CHECK：不校验真实姓名
            FORCE_CHECK：强校验真实姓名（未实名认证的用户会校验失败，无法转账）
            OPTION_CHECK：针对已实名认证的用户才校验真实姓名（未实名认证用户不校验，可以转账成功）',
   RE_USER_NAME         VARCHAR(32) COMMENT '收款用户姓名，收款用户真实姓名。
            如果check_name设置为FORCE_CHECK或OPTION_CHECK，则必填用户真实姓名',
   AMOUNT               INT COMMENT '金额，企业付款金额，单位为分',
   REMARK               VARCHAR(32) COMMENT '企业付款描述信息',
   SPBILL_CREATE_IP     VARCHAR(32) COMMENT 'Ip地址，调用接口的机器Ip地址',
   RETURN_CODE          VARCHAR(16) COMMENT '返回状态码，SUCCESS/FAIL
            此字段是通信标识，非交易标识，交易是否成功需要查看result_code来判断',
   RETURN_MSG           VARCHAR(32) COMMENT '返回信息，如非空，为错误原因
            签名失败
            参数格式校验错误',
   RESULT_CODE          VARCHAR(16) COMMENT '业务结果，SUCCESS/FAIL',
   ERR_CODE             VARCHAR(32) COMMENT '错误代码，错误码信息',
   ERR_CODE_DES         VARCHAR(128) COMMENT '错误代码描述，结果信息描述',
   PAYMENT_NO           VARCHAR(32) COMMENT '微信订单号，企业付款成功，返回的微信订单号',
   PAYMENT_TIME         VARCHAR(32) COMMENT '微信支付成功时间，企业付款成功时间，示例 2015-05-19 15：26：59',
   PRIMARY KEY (PARTNER_TRADE_NO)
);

ALTER TABLE MCH_PAY_WX COMMENT '微信企业付款订单，企业付款业务是基于微信支付商户平台的资金管理能力，为了协助商户方便地实现企业向个人付款，针对部分有开发';

/*==============================================================*/
/* Table: MEMBER_INFO                                           */
/*==============================================================*/
CREATE TABLE MEMBER_INFO
(
   MEMBER_INFO_ID       BIGINT(18) NOT NULL AUTO_INCREMENT COMMENT 'member_info_id',
   CODE                 VARCHAR(30) COMMENT '会员单位编号',
   NAME                 VARCHAR(30) COMMENT '名称',
   ADDRESS              VARCHAR(1024) COMMENT '地址',
   CONTACT_MOBILE_PHONE VARCHAR(30) COMMENT '联系人手机号',
   CONTACT_NAME         VARCHAR(30) COMMENT '联系人姓名',
   PRIMARY KEY (MEMBER_INFO_ID)
);

ALTER TABLE MEMBER_INFO COMMENT '会员单位信息';

/*==============================================================*/
/* Table: OPERATOR_INFO                                         */
/*==============================================================*/
CREATE TABLE OPERATOR_INFO
(
   OPERATOR_INFO_ID     BIGINT(18)  NOT NULL AUTO_INCREMENT COMMENT 'operator_info_id',
   CODE                 VARCHAR(18) COMMENT '运营商编号',
   NAME                 VARCHAR(18) COMMENT '运营商名称',
   TELEPHONE            VARCHAR(18) COMMENT '联系电话',
   MOBILEPHONE          VARCHAR(18) COMMENT '手机号',
   ADDRESS              VARCHAR(256) COMMENT '地址',
   POSTCODE             VARCHAR(18) COMMENT '邮编',
   CONTACT_NAME         VARCHAR(18) COMMENT '负责人姓名',
   BIND_ACCOUNT         VARCHAR(18) COMMENT '绑定的外部账号',
   WX_MERCHANT_CODE     VARCHAR(18) COMMENT '微信商户号',
   WX_CONTACT_PHONE     VARCHAR(18) COMMENT '微信商户联系人手机号',
   PRIMARY KEY (OPERATOR_INFO_ID)
);

ALTER TABLE OPERATOR_INFO COMMENT '运营商信息';

/*==============================================================*/
/* Table: OPERATOR_RELT_GIFT_ACCOUNT                            */
/*==============================================================*/
CREATE TABLE OPERATOR_RELT_GIFT_ACCOUNT
(
   OPERATOR_INFO_ID     BIGINT(18) NOT NULL COMMENT '运营商id',
   GIFT_ACCOUNT_ID      BIGINT(18) NOT NULL COMMENT '用户礼包账户id',
   COMMODITY_CONTRACT_ID BIGINT(18) COMMENT '商品合约信息id',
   CREATE_TIME          DATETIME COMMENT '创建时间',
   PRIMARY KEY (OPERATOR_INFO_ID, GIFT_ACCOUNT_ID),
   UNIQUE KEY UNIQUE_COMMODITY_ACCOUNT (OPERATOR_INFO_ID, COMMODITY_CONTRACT_ID)
);

ALTER TABLE OPERATOR_RELT_GIFT_ACCOUNT COMMENT '账户与礼包账户关联表';

/*==============================================================*/
/* Table: PAY_INFO                                              */
/*==============================================================*/
CREATE TABLE PAY_INFO
(
   PAY_INFO_ID          BIGINT(18) NOT NULL AUTO_INCREMENT,
   USER_INFO_ID         BIGINT(18) COMMENT '支付发起人id,发起付款申请的人, 与实际付款人有别，因为支付订单可被代付，实际付款人在对应的付款明细中提现，若业务上发生退款只会将退款退还给实际付款人。',
   OPERATOR_INFO_ID     BIGINT(18)  COMMENT '运营商id',
   PAY_AMOUNT           BIGINT(18) COMMENT '支付金额',
   CHANNEL              VARCHAR(18) COMMENT '支付渠道     wx:微信   ali:支付宝   jd：京东支付  union:银联',
   PAY_DETAIL_ID        VARCHAR(64) COMMENT '当前绑定的支付订单明细id， 对应渠道下的订单明细id',
   BIZ_TYPE             VARCHAR(18) COMMENT '业务类型   自己系统的业务类型     暂定  buy:购买业务    delivery：提货业务',
   BIZ_ID               VARCHAR(64) COMMENT '业务id, 关联的业务id',
   BIZ_PROCESSED        VARCHAR(18) COMMENT '是否已处理关联的业务订单,     true:已处理    false: 未处理',
   STATUS               VARCHAR(18) COMMENT '支付状态   NO_CHANNEL：订单已生成，但未选择支付渠道  UNPAYING：支付渠道已选择，但未付款  CANCELLED：支付已取消  SUCCESS:支付成功',
   STATUS_HISTORY       VARCHAR(1024) COMMENT '状态历史',
   TIME_START           DATETIME COMMENT '创建时间',
   TIME_EXPIRE          DATETIME COMMENT '支付过期时间',
   REFUND_STATUS        VARCHAR(32) COMMENT '退款状态, 退款是按原支付渠道退回，退款详细信息请到对应的支付渠道查询',
   REFUNDED_PRICE       BIGINT(18) COMMENT '已退款金额，单位为分',
   CREATE_TIME          DATETIME COMMENT '创建时间',
   UPDATE_TIME          DATETIME COMMENT '修改时间',
   PAY_SUCCESS_TIME     DATETIME COMMENT '支付完成时间',
   REFUND_APPLY_TIME    DATETIME COMMENT '退款发起时间',
   REFUND_SUCCESS_TIME  DATETIME COMMENT '退款完成时间',
   QUERY_TIME           DATETIME COMMENT '上次查询时间',
   PRIMARY KEY (PAY_INFO_ID)
);

ALTER TABLE PAY_INFO COMMENT '支付基本信息';

/*==============================================================*/
/* Table: PAY_ORDER_WX                                          */
/*==============================================================*/
CREATE TABLE PAY_ORDER_WX
(
   PAY_ORDER_WX_ID      VARCHAR(32) NOT NULL COMMENT '微信渠道支付明细id， 用于微信平台的商户订单号，商户系统内部订单号，要求32个字符内、且在同一个商户号下唯一。',
   PAY_INFO_ID          BIGINT(18) COMMENT '基本支付信息id',
   APPID                VARCHAR(32) COMMENT '微信支付分配的公众账号ID（企业号corpid即为此appId）
            微信支付分配的公众账号ID（企业号corpid即为此appId）',
   MCH_ID               VARCHAR(32) COMMENT '微信支付分配的商户号',
   DEVICE_INFO          VARCHAR(32) COMMENT '自定义参数，可以为终端设备号(门店号或收银设备ID)，PC网页或公众号内支付可以传"WEB"',
   BODY                 VARCHAR(128) COMMENT '商品简单描述，该字段请按照规范传递',
   DETAIL               VARCHAR(6000) COMMENT '商品详细列表，使用Json格式，传输签名前请务必使用CDATA标签将JSON文本串保护起来。
            cost_price Int 可选 32 订单原价，商户侧一张小票订单可能被分多次支付，订单原价用于记录整张小票的支付金额。当订单原价与支付金额不相等则被判定为拆单，无法享受优惠。
             receipt_id String 可选 32 商家小票ID
            goods_detail 服务商必填 []：
            └ goods_id String 必填 32 商品的编号
            └ wxpay_goods_id String 可选 32 微信支付定义的统一商品编号
            └ goods_name String 可选 256 商品名称
            └ quantity Int 必填  32 商品数量
            └ price Int 必填 32 商品单价，如果商户有优惠，需传输商户优惠后的单价
            注意：单品总金额应<=订单总金额total_fee，否则会无法享受优惠。',
   ATTACH               VARCHAR(127) COMMENT '附加数据，在查询API和支付通知中原样返回，可作为自定义参数使用。',
   FEE_TYPE             VARCHAR(16) COMMENT '符合ISO 4217标准的三位字母代码，默认人民币：CNY',
   TOTAL_FEE            INT COMMENT '订单总金额，单位为分',
   SPBILL_CREATE_IP     VARCHAR(16) COMMENT 'APP和网页支付提交用户端ip，Native支付填调用微信支付API的机器IP。',
   TIME_START           VARCHAR(14) COMMENT '订单生成时间，格式为yyyyMMddHHmmss，如2009年12月25日9点10分10秒表示为20091225091010。',
   TIME_EXPIRE          VARCHAR(14) COMMENT '订单失效时间，格式为yyyyMMddHHmmss，如2009年12月27日9点10分10秒表示为20091227091010。注意：最短失效时间间隔必须大于5分钟',
   GOODS_TAG            VARCHAR(32) COMMENT '商品标记，使用代金券或立减优惠功能时需要的参数',
   TRADE_TYPE           VARCHAR(16) COMMENT '取值如下：JSAPI，NATIVE，APP等',
   PRODUCT_ID           VARCHAR(32) COMMENT 'trade_type=NATIVE时（即扫码支付），此参数必传。此参数为二维码中包含的商品ID，商户自行定义。',
   LIMIT_PAY            VARCHAR(32) COMMENT '上传此参数no_credit--可限制用户不能使用信用卡支付',
   OPENID               VARCHAR(128) COMMENT 'trade_type=JSAPI时（即公众号支付），此参数必传，此参数为微信用户在商户对应appid下的唯一标识。openid如何获取，可参考【获取openid】。企业号请使用【企业号OAuth2.0接口】获取企业号内成员userid，再调用【企业号userid转openid接口】进行转换',
   PREPAY_ID            VARCHAR(64) COMMENT '微信支付系统返回的预付单信息',
   CODE_URL             VARCHAR(64) COMMENT 'trade_type为NATIVE时有返回，用于生成二维码，展示给用户进行扫码支付',
   PREPAY_RESULT_CODE   VARCHAR(32) COMMENT '预付单业务结果，SUCCESS/FAIL',
   PAY_TRANSACTION_ID   VARCHAR(32) COMMENT '微信支付订单号，微信服务器返回的支付订单号',
   PAY_RESULT_CODE      VARCHAR(16) COMMENT '支付结果',
   BANK_TYPE            VARCHAR(16) COMMENT '付款银行',
   SETTLEMENT_TOTAL_FEE INT COMMENT '应结订单金额， 应结订单金额=订单金额-非充值代金券金额，应结订单金额<=订单金额。',
   CASH_FEE             INT COMMENT '现金支付金额， 订单现金支付金额',
   CASH_FEE_TYPE        VARCHAR(16) COMMENT '货币类型，符合ISO4217标准的三位字母代码，默认人民币：CNY',
   COUPON_FEE           INT COMMENT '总代金券金额， 现金支付金额=订单金额-代金券金额，代金券金额<=订单金额',
   COUPON_COUNT         INT COMMENT '代金券使用数量',
   COUPON_DETAIL_LIST   VARCHAR(2048) COMMENT '所有代金券明细， json格式数组   包含字段     couponType:代金券类型   couponId:代金券ID    coupon_fee:单个代金券支付金额',
   TIME_END             VARCHAR(14) COMMENT '支付完成时间，格式为yyyyMMddHHmmss',
   IS_VALID             VARCHAR(16) COMMENT '是否有效, true:有效     false:无效     由于系统生成订单可能会有异常情况，此单作废，重新生成一条记录  ',
   PRIMARY KEY (PAY_ORDER_WX_ID)
);

ALTER TABLE PAY_ORDER_WX COMMENT '微信渠道商户订单明细
jsapi支付参考https://pay.weixin.qq.com/wiki/doc';

/*==============================================================*/
/* Table: REFUND_ORDER_WX                                       */
/*==============================================================*/
CREATE TABLE REFUND_ORDER_WX
(
   OUT_REFUND_NO        VARCHAR(32) NOT NULL COMMENT '商户退款单号',
   REFUND_ID            VARCHAR(32) COMMENT '微信退款单号',
   TRANSACTION_ID       VARCHAR(32) COMMENT '微信支付订单号',
   OUT_TRADE_NO         VARCHAR(32) COMMENT '商户订单号',
   APPID                VARCHAR(32) NOT NULL COMMENT '微信分配的公众账号ID',
   TOTAL_FEE            BIGINT(18) NOT NULL COMMENT '订单总金额，单位为分，只能为整数',
   REFUND_FEE           BIGINT(18) NOT NULL COMMENT '退款总金额，订单总金额，单位为分，只能为整数',
   REFUND_FEE_TYPE      VARCHAR(16) COMMENT '货币类型，符合ISO 4217标准的三位字母代码，默认人民币：CNY',
   SETTLEMENT_REFUND_FEE BIGINT(18) COMMENT '去掉非充值代金券退款金额后的退款金额，退款金额=申请退款金额-非充值代金券退款金额，退款金额<=申请退款金额',
   SETTLEMENT_TOTAL_FEE BIGINT(18) COMMENT '去掉非充值代金券金额后的订单总金额，应结订单金额=订单金额-非充值代金券金额，应结订单金额<=订单金额',
   CASH_FEE             BIGINT(18) COMMENT '现金支付金额，单位为分，只能为整数',
   CASH_FEE_TYPE        VARCHAR(16) COMMENT '货币类型，符合ISO 4217标准的三位字母代码，默认人民币：CNY',
   CASH_REFUND_FEE      BIGINT(18) COMMENT '现金退款金额，单位为分，只能为整数',
   COUPON_REFUND_FEE    BIGINT(18) COMMENT '代金券退款金额<=退款金额，退款金额-代金券或立减优惠退款金额为现金',
   COUPON_REFUND_COUNT  INT COMMENT '退款代金券使用数量',
   COUPON_INFO          VARCHAR(2048) COMMENT '代金券退款信息JSON',
   RESULT_CODE          VARCHAR(64) COMMENT 'SUCCESS/FAIL，SUCCESS退款申请接收成功，结果通过退款查询接口查询',
   REFUND_STATUS        VARCHAR(64) COMMENT '退款状态：SUCCESS—退款成功；REFUNDCLOSE—退款关闭；NOTSURE—未确定，需要商户用原退款单号重新发起退款申请。
            PROCESSING—退款处理中；CHANGE—退款异常',
   QUERY_COUNT          INT(3) NOT NULL COMMENT '已查询次数',
   QUERY_TIME           DATETIME COMMENT '下次查询退款状态时间',
   CREATETIME           DATETIME NOT NULL COMMENT '创建时间',
   PRIMARY KEY (OUT_REFUND_NO)
);

ALTER TABLE REFUND_ORDER_WX COMMENT '微信渠道退款订单明细';

/*==============================================================*/
/* Table: SPEC_USER_INFO                                        */
/*==============================================================*/
CREATE TABLE SPEC_USER_INFO
(
   USER_INFO_ID         BIGINT(18) NOT NULL COMMENT '用户id',
   MEMBER_INFO_ID       BIGINT(18) COMMENT '会员单位id',
   PRIMARY KEY (USER_INFO_ID)
);

ALTER TABLE SPEC_USER_INFO COMMENT '特别用户专属信息表';

/*==============================================================*/
/* Table: SYSTEM_PARAM                                          */
/*==============================================================*/
CREATE TABLE SYSTEM_PARAM
(
   SYSTEM_PARAM_ID      INT NOT NULL AUTO_INCREMENT,
   NAME                 VARCHAR(64) COMMENT '名称',
   VALUE                VARCHAR(512) COMMENT '值',
   REMARK               VARCHAR(512) COMMENT '注释',
   PRIMARY KEY (SYSTEM_PARAM_ID),
   UNIQUE KEY UNQ_SYSTEM_PARAM_NAME (NAME)
);

ALTER TABLE SYSTEM_PARAM COMMENT '系统参数';

/*==============================================================*/
/* Table: TRADE_ORDER                                           */
/*==============================================================*/
CREATE TABLE TRADE_ORDER
(
   TRADE_ORDER_ID       BIGINT(18)  NOT NULL AUTO_INCREMENT,
   ACCOUNT_ID           BIGINT(18)  COMMENT '当前交易账户id',
   ACCOUNT_TYPE         VARCHAR(18) COMMENT '当前主账户类型     USER:用户     OPERATOR:运营商',
   OPPONENT_ACCOUNT_ID  BIGINT(18)  COMMENT '对方交易账户id',
   OPPONENT_ACCOUNT_TYPE VARCHAR(18) COMMENT '对方主账户类型     USER:用户     OPERATOR:运营商',
   BUY_OR_SELL          VARCHAR(16) COMMENT '买卖方向   buy:买   sell:卖',
   COMMODITY_ID         BIGINT(18)  COMMENT '商品合约id',
   COMMODITY_UNIT_QUANTITY DECIMAL(20,0) COMMENT '商品单位数量',
   COMMODITY_UNIT_PRICE BIGINT(18)  COMMENT '商品单位单价, 分为单位',
   FEE_PERCENT          DECIMAL(20,0) COMMENT '手续费比例, 百分比为单位',
   FEE_PRICE            BIGINT(18)  COMMENT '手续费, 单位为分',
   COUPON_INFO          VARCHAR(1024) COMMENT '优惠券折扣明细， json格式，包含优惠券id， 折扣金额，折扣注释信息  {couponDetailId:123, price:1000, remark: "首单减10元"}',
   COUPON_PRICE         BIGINT(18)  COMMENT '优惠折扣金额， 使用优惠券折扣券折扣或额外获取的金额，  正数：用户获得的额外金额    负数：用户需要额外支付的金额',
   ACTUAL_PRICE         BIGINT(18)  COMMENT '用户实际金额变化， 商品总价加上优惠折扣金额  单位为分   正数：用户获得金额     负数：用户扣除金额',
   INCOME_PAY_INFO      VARCHAR(1024) COMMENT '收支信息， 包含支付信息id和状态  json格式   [{payid:123, status: "finish"},{payid:234, "status:handling"}, {payid:4545, status:"refund finish"}]',
   COMMODITY_FLOW_RECORD_IDS VARCHAR(256) COMMENT '商品流通记录信息ids， 多个用逗号隔开',
   REMARK               VARCHAR(1024) COMMENT '注释',
   STATUS               VARCHAR(256) COMMENT '状态        NOPAY：未支付   PAID：已支付   CANCELLED:已取消',
   CREATE_TIME          DATETIME COMMENT '创建时间',
   ORDER_TIME           DATETIME COMMENT '下单时间',
   APPLY_CANCEL_TIME    DATETIME COMMENT '申请取消时间',
   SUCCESS_TIME         DATETIME COMMENT '完成时间',
   CLOSE_TIME           DATETIME COMMENT '关闭时间',
   EXPIRE_TIME          DATETIME COMMENT '超时时间',
   PRIMARY KEY (TRADE_ORDER_ID)
)
   AUTO_INCREMENT = 1000000;

ALTER TABLE TRADE_ORDER COMMENT '买卖订单， 用户买入卖出的订单信息';

/*==============================================================*/
/* Table: USER_BIZ_BRIEF                                        */
/*==============================================================*/
CREATE TABLE USER_BIZ_BRIEF
(
   USERL_BIZ_BRIEF_ID   BIGINT(18) NOT NULL AUTO_INCREMENT COMMENT '用户所有业务概要记录id',
   USER_INFO_ID         BIGINT(18) COMMENT '用户id',
   COMMODITY_CONTRACT_ID BIGINT(18) COMMENT '商品合约信息id',
   BIZ_TYPE             VARCHAR(32) COMMENT '业务类型',
   BIZ_ID               VARCHAR(32) COMMENT '业务id',
   CREATE_TIME          DATETIME COMMENT '创建时间',
   COMMODITY_TYPE_ID    BIGINT(18) COMMENT '商品类型id',
   COMMODITY_NAME       VARCHAR(32) COMMENT '商品名称',
   OP_COMMODITY_UNIT_QUANTITY DECIMAL(20,0) COMMENT '商品操作单位数量',
   BIZ_STATUS           VARCHAR(32) COMMENT '业务状态， 针对不同的业务类型，有不同的状态',
   ATTACH               VARCHAR(6000) COMMENT '附加数据, 针对于业务附加的数据，可根据业务类型自由定义',
   PRIMARY KEY (USERL_BIZ_BRIEF_ID)
);

ALTER TABLE USER_BIZ_BRIEF COMMENT '所有业务概要记录';

/*==============================================================*/
/* Table: USER_DELIVERY_INFO                                    */
/*==============================================================*/
CREATE TABLE USER_DELIVERY_INFO
(
   USER_DELIVERY_INFO_ID BIGINT(18) NOT NULL AUTO_INCREMENT,
   USER_INFO_ID         BIGINT(18) COMMENT '用户id',
   USERNAME             VARCHAR(32) COMMENT '收货人姓名',
   TEL_NUMBER           VARCHAR(32) COMMENT '收货人电话',
   ADDRESS_POSTAL_CODE  VARCHAR(32) COMMENT '邮编',
   PROVICE_FIRST_STAGE_NAME VARCHAR(128) COMMENT '国标收货地址第一级地址',
   ADDRESS_CITY_SECOND_STAGE_NAME VARCHAR(128) COMMENT '国标收货地址第二级地址',
   ADDRESS_COUNTIES_THIRD_STAGE_NAME VARCHAR(128) COMMENT '国标收货地址第三级地址',
   ADDRESS_DETAIL_INFO  VARCHAR(512) COMMENT '详细收货地址信息',
   NATIONAL_CODE        VARCHAR(32) COMMENT '收货地址国家码',
   IS_DEFAULT           VARCHAR(8) COMMENT 'true  : 默认  false:不是默认',
   CREATE_TIME          DATETIME COMMENT '创建时间',
   UPDATE_TIME          DATETIME COMMENT '修改时间',
   PRIMARY KEY (USER_DELIVERY_INFO_ID)
);

ALTER TABLE USER_DELIVERY_INFO COMMENT '用户收货信息,  地区参考链接：http://www.stats.gov.cn/tjsj/tjbz/xzqhdm/201';

/*==============================================================*/
/* Table: USER_INFO                                             */
/*==============================================================*/
CREATE TABLE USER_INFO
(
   USER_INFO_ID         BIGINT(18) NOT NULL AUTO_INCREMENT COMMENT '用户id',
   BIND_ACCOUNT         VARCHAR(30) COMMENT '绑定的外部账户，现对应通行证账号',
   LOGIN_NAME           VARCHAR(16) COMMENT '唯一，自动生成，用户只能修改一次',
   PASSWORD             VARCHAR(256) COMMENT '密码',
   COUNTRY              VARCHAR(30) COMMENT '国家',
   PROVINCE             VARCHAR(30) COMMENT '省份',
   CITY                 VARCHAR(30) COMMENT '城市',
   NICKNAME             VARCHAR(256) COMMENT '昵称',
   SEX                  VARCHAR(16) COMMENT '性别',
   MOBILE_PHONE         VARCHAR(30) COMMENT '手机号',
   USER_TYPE            VARCHAR(16) COMMENT '用户类型， NORMAL:普通用户   SPECIAL:特殊用户  CENTER:平台用户',
   REGISTER_IP_ADDRESS  VARCHAR(48) COMMENT 'IP地址',
   REGISTER_TIME        DATETIME COMMENT '注册时间',
   LAST_LOGIN_TIME      VARCHAR(30) COMMENT '最后登录时间',
   SOURCE               VARCHAR(30) COMMENT '账号来源',
   RANK                 VARCHAR(30) COMMENT '等级',
   HEAD_IMG_PATH        VARCHAR(512) COMMENT '头像文件存储路径',
   IS_REFERRER          VARCHAR(10) COMMENT '是否可作为推荐人, true:可作为推荐人   false:不可作为推荐人',
   REFERRER_USER_ID     BIGINT(18) COMMENT '推荐人用户id',
   PRIMARY KEY (USER_INFO_ID),
   UNIQUE KEY UK_USER_PHONE (MOBILE_PHONE)
);

ALTER TABLE USER_INFO COMMENT '用户（包含特别用户）基本信息';

/*==============================================================*/
/* Table: USER_RELT_GIFT_ACCOUNT                                */
/*==============================================================*/
CREATE TABLE USER_RELT_GIFT_ACCOUNT
(
   USER_INFO_ID         BIGINT(18) NOT NULL COMMENT '用户id',
   GIFT_ACCOUNT_ID      BIGINT(18) NOT NULL COMMENT '用户礼包账户id',
   COMMODITY_CONTRACT_ID BIGINT(18) COMMENT '商品合约信息id',
   COST_PRICE           BIGINT(18) COMMENT '成本金额，当前商品累计的历史价值， 单位为分',
   CREATE_TIME          DATETIME COMMENT '创建时间',
   UPDATE_TIME          DATETIME COMMENT '修改时间',
   PRIMARY KEY (USER_INFO_ID, GIFT_ACCOUNT_ID),
   UNIQUE KEY UNIQUE_COMMODITY_ACCOUNT (USER_INFO_ID, COMMODITY_CONTRACT_ID)
);

/*==============================================================*/
/* Table: USER_WX_INFO                                          */
/*==============================================================*/
CREATE TABLE USER_WX_INFO
(
   OPENID               VARCHAR(64) NOT NULL COMMENT '微信用户的唯一标识',
   APPID                VARCHAR(64) NOT NULL COMMENT '微信公众号或应用id',
   NICKNAME             VARCHAR(256) COMMENT '用户昵称',
   SEX                  VARCHAR(10) COMMENT '用户的性别，值为1时是男性，值为2时是女性，值为0时是未知',
   PROVINCE             VARCHAR(30) COMMENT '用户个人资料填写的省份',
   CITY                 VARCHAR(30) COMMENT '普通用户个人资料填写的城市',
   COUNTRY              VARCHAR(30) COMMENT '国家，如中国为CN',
   HEADIMGURL           VARCHAR(512) COMMENT '用户头像，最后一个数值代表正方形头像大小（有0、46、64、96、132数值可选，0代表640*640正方形头像），用户没有头像时该项为空。若用户更换头像，原有头像URL将失效。',
   PRIVILEGE            VARCHAR(256) COMMENT '用户特权信息，json 数组，如微信沃卡用户为（chinaunicom）',
   UNIONID              VARCHAR(64) NOT NULL COMMENT '只有在用户将公众号绑定到微信开放平台帐号后，才会出现该字段。',
   SUBSCRIBE            INT COMMENT '用户是否订阅该公众号标识，值为1时，代表用户当前关注了公众号，值为0时，代表此用户没有关注该公众号',
   SUBSCRIBE_TIME       BIGINT(18) COMMENT '用户关注时间，为时间戳。如果用户曾多次关注，则取最后关注时间',
   PRIMARY KEY (OPENID, UNIONID)
);

ALTER TABLE USER_WX_INFO COMMENT '用户微信信息';

/*==============================================================*/
/* Table: USER_WX_RELT                                          */
/*==============================================================*/
CREATE TABLE USER_WX_RELT
(
   USER_INFO_ID         BIGINT(18) NOT NULL COMMENT '用户id',
   UNIONID              VARCHAR(64) NOT NULL COMMENT '只有在用户将公众号绑定到微信开放平台帐号后，才会出现该字段。',
   CREATE_TIME          DATETIME COMMENT '创建时间',
   REMARK               VARCHAR(512) COMMENT '注释',
   PRIMARY KEY (USER_INFO_ID, UNIONID)
);

ALTER TABLE USER_WX_RELT COMMENT '微信用户与基本用户关联信息';

/*==============================================================*/
/* Table: WXMP_MSG                                              */
/*==============================================================*/
CREATE TABLE WXMP_MSG
(
   WXMP_MSG_ID          BIGINT NOT NULL COMMENT '本系统消息id',
   MSG_ID               INT COMMENT '在微信公众号服务器的消息id，64位整型',
   APPID                VARCHAR(64) COMMENT '公众号id',
   FROM_USER            VARCHAR(64) COMMENT '发送方帐号（一个OpenID）',
   TO_USER              VARCHAR(64) COMMENT '开发者微信号',
   CREATE_TIME          BIGINT COMMENT '消息创建时间 （整型）',
   MSG_TYPE             VARCHAR(20) COMMENT '消息类型，text：文本消息；   image：图片消息；   voice：语音消息；  video：视频消息；    shortvideo：小视频消息；  location：地理位置消息； link：链接消息；  music：音乐消息；  news ：图文消息（点击跳转到外链）； mpnews：图文消息（点击跳转到图文消息页面） ；  wxcard：卡券；   event：事件类型；    ',
   PRIMARY KEY (WXMP_MSG_ID),
   UNIQUE KEY UK_MSG_ID (MSG_ID)
);

ALTER TABLE WXMP_MSG COMMENT '微信公众号消息记录';

/*==============================================================*/
/* Table: WXMP_USER_INFO                                        */
/*==============================================================*/
CREATE TABLE WXMP_USER_INFO
(
   OPENID               VARCHAR(64) COMMENT '用户的标识，对当前公众号唯一',
   APPID                VARCHAR(64) COMMENT '公众号id',
   UNIONID              VARCHAR(64) COMMENT '只有在用户将公众号绑定到微信开放平台帐号后，才会出现该字段。',
   NICKNAME             VARCHAR(64) COMMENT '用户的昵称',
   SEX                  VARCHAR(64) COMMENT '用户的性别，值为1时是男性，值为2时是女性，值为0时是未知',
   CITY                 VARCHAR(64) COMMENT '用户所在城市',
   COUNTRY              VARCHAR(64) COMMENT '用户所在国家',
   PROVINCE             VARCHAR(64) COMMENT '用户所在省份',
   LANGUAGE             VARCHAR(64) COMMENT '用户的语言，简体中文为zh_CN',
   HEADIMGURL           VARCHAR(64) COMMENT '用户头像，最后一个数值代表正方形头像大小（有0、46、64、96、132数值可选，0代表640*640正方形头像），用户没有头像时该项为空。若用户更换头像，原有头像URL将失效。',
   REMARK               VARCHAR(64) COMMENT '公众号运营者对粉丝的备注，公众号运营者可在微信公众平台用户管理界面对粉丝添加备注',
   GROUPID              VARCHAR(64) COMMENT '用户所在的分组ID（兼容旧的用户分组接口）',
   TAGID_LIST           VARCHAR(64) COMMENT '用户被打上的标签ID列表',
   SUBSCRIBE            VARCHAR(64) COMMENT '用户是否订阅该公众号标识，值为0时，代表此用户没有关注该公众号，拉取不到其余信息。',
   SUBSCRIBE_TIME       VARCHAR(64) COMMENT '用户关注时间，为时间戳。如果用户曾多次关注，则取最后关注时间'
);

ALTER TABLE WXMP_USER_INFO COMMENT '公众号用户信息，用户关注公众号后才可获取用户信息，不是web应用中用户授权获取到的微信用户信息';
