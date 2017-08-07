
#v2.0.0
# 修改用户表字段
ALTER TABLE user_info
  CHANGE IS_SPECIAL USER_TYPE VARCHAR(16) COMMENT '用户类型， normal:普通用户   special:特殊用户  center:平台用户';

ALTER TABLE user_info ADD IS_REFERRER VARCHAR(10) NULL COMMENT '是否可作为推荐人, true:可作为推荐人   false:不可作为推荐人';

ALTER TABLE user_info ADD REFERRER_USER_ID BIGINT(18) NULL COMMENT '推荐人用户id';


# 将所有用户类型更新为普通用户
UPDATE user_info
SET USER_TYPE = 'NORMAL';


# 删除特别用户专属信息表
DROP TABLE spec_user_info;

# 删除会员单位信息表
DROP TABLE member_info;

#删除线上用户手机号
UPDATE user_info
SET MOBILE_PHONE = NULL;

#为用户手机号创建唯一索引
CREATE UNIQUE INDEX user_info_MOBILE_PHONE_uindex ON user_info (MOBILE_PHONE);












