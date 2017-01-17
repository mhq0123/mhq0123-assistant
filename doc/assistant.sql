-- service                      服务--大厅表
-- service_data                 服务--数据表
-- message_template             消息--模板表
-- message_record               消息--记录表
-- customer_service             客户--服务表
-- customer_subscribe           客户--订阅表
-- customer_setting             客户--配置表


CREATE TABLE `service` (
  `account_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '表索引编号',
  `account_name` varchar(20) NOT NULL COMMENT '账号',
  `password` varchar(50) NOT NULL COMMENT '密码',
  `email` varchar(50) NOT NULL COMMENT '个人邮箱',
  `nick_name` varchar(30) NOT NULL COMMENT '昵称',
  `real_name` varchar(20) DEFAULT NULL COMMENT '真实姓名',
  `sex` varchar(5) DEFAULT NULL COMMENT '性别：MEN男/WOMEN女',
  `phone_no` varchar(20) DEFAULT NULL COMMENT '个人号码',
  `status` varchar(10) NOT NULL COMMENT '状态：初始待验证INIT/生效VALID/冻结FREEZE/注销CANCEL',
  `inst_date` varchar(10) NOT NULL COMMENT '初始写入日期',
  `inst_datetime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '初始写入时间',
  `lupd_datetime` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '最后更新时间',
  PRIMARY KEY (`account_id`),
  UNIQUE KEY `customer_account_account_name` (`account_name`) USING BTREE,
  UNIQUE KEY `customer_account_email` (`email`) USING BTREE,
  KEY `customer_account_phone_no` (`phone_no`) USING BTREE,
  KEY `customer_account_inst_date` (`inst_date`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='服务--大厅表';

