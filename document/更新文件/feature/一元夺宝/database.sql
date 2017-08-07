
ALTER TABLE convert_obj ADD SIGN_QUANTITY_MIN INT NULL COMMENT '报名人数下限';
ALTER TABLE convert_obj ADD SIGN_QUANTITY_MAX INT NULL COMMENT '报名人数上限';


ALTER TABLE convert_obj_order ADD SIGN_SEQ INT NULL COMMENT '参加活动序号， 针对对应的活动，报名或参加的顺序编号';
ALTER TABLE convert_obj_order
  MODIFY COLUMN SIGN_SEQ INT COMMENT '参加活动序号， 针对对应的活动，报名或参加的顺序编号' AFTER CONVERT_OBJ_ORDER_ID;




ALTER TABLE convert_obj_order MODIFY ORDER_TIME DATETIME(6) COMMENT '下单时间';

INSERT INTO system_param (NAME, VALUE, REMARK) VALUES ('ACTIVITY_BEGIN_SEQ', '500000', '用户参加抽奖活动的初始默认开始编号');

ALTER TABLE convert_obj_order AUTO_INCREMENT = 1000000;