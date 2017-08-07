DROP TABLE IF EXISTS ADVERTISEMENT;

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
