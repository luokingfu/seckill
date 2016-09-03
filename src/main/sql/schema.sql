-- 数据库初始化脚本
--创建数据库
CREATE DATABASE seckill;

--使用数据库
use seckill;

-- 秒杀表
CREATE TABLE seckill(
  'seckill_id' bigint NOT NULL AUTO_INCREMENT COMMENT '商品库存id'
  'name' VARCHAR(120) NOT NULL comment '商品名称',
  'number' INT NOT NULL comment '库存数量',
  'start_time' TIMESTAMP NOT NULL comment '秒杀开启时间',
  'end_time' TIMESTAMP NOT NULL comment '秒杀结束时间',
  'create_time' TIMESTAMP NOT NULL DEFAULT CURRENT_TIME comment '秒杀创建时间',
  PRIMARY KEY (seckill_id),
  KEY idx_start_time(start_time),
  KEY idx_end_time(end_time),
  KEY idx_create_time(create_time)
)ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT="秒杀库存表";
--初始化数据
INSERT INTO seckill
  (name,number,start_time,end_time)
  VALUES
   ('2000元秒杀iPhone6',100,'2016-12-12','2016-12-13'),
   ('1000元秒杀ipad',200,'2016-12-12','2016-12-13'),
   ('800元秒杀iPhone5',300,'2016-12-12','2016-12-13'),
   ('500元秒杀iPhone3',500,'2016-12-12','2016-12-13');


-- 成功秒杀明细表
-- 用户登录认证相关信息
CREATE TABLE success_killed(
  'seckill_id' bigint NOT null comment '秒杀成功商品id',
  'user_phone' bigint not NULL comment '用户手机号',
  'state' tinyint NOT null DEFAULT -1 comment '状态标识：-1 无效，0 成功，1 已付款',
  'create_time' TIMESTAMP not null comment '创建时间',
  PRIMARY KEY (seckill_id,user_phone),-- 联合主键
  KEY idx_create_time(create_time)
)ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT="秒杀成功明细表";



-- 连接数据库控制台
mysql -uroot -p