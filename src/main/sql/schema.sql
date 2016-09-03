-- ���ݿ��ʼ���ű�
--�������ݿ�
CREATE DATABASE seckill;

--ʹ�����ݿ�
use seckill;

-- ��ɱ��
CREATE TABLE seckill(
  'seckill_id' bigint NOT NULL AUTO_INCREMENT COMMENT '��Ʒ���id'
  'name' VARCHAR(120) NOT NULL comment '��Ʒ����',
  'number' INT NOT NULL comment '�������',
  'start_time' TIMESTAMP NOT NULL comment '��ɱ����ʱ��',
  'end_time' TIMESTAMP NOT NULL comment '��ɱ����ʱ��',
  'create_time' TIMESTAMP NOT NULL DEFAULT CURRENT_TIME comment '��ɱ����ʱ��',
  PRIMARY KEY (seckill_id),
  KEY idx_start_time(start_time),
  KEY idx_end_time(end_time),
  KEY idx_create_time(create_time)
)ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT="��ɱ����";
--��ʼ������
INSERT INTO seckill
  (name,number,start_time,end_time)
  VALUES
   ('2000Ԫ��ɱiPhone6',100,'2016-12-12','2016-12-13'),
   ('1000Ԫ��ɱipad',200,'2016-12-12','2016-12-13'),
   ('800Ԫ��ɱiPhone5',300,'2016-12-12','2016-12-13'),
   ('500Ԫ��ɱiPhone3',500,'2016-12-12','2016-12-13');


-- �ɹ���ɱ��ϸ��
-- �û���¼��֤�����Ϣ
CREATE TABLE success_killed(
  'seckill_id' bigint NOT null comment '��ɱ�ɹ���Ʒid',
  'user_phone' bigint not NULL comment '�û��ֻ���',
  'state' tinyint NOT null DEFAULT -1 comment '״̬��ʶ��-1 ��Ч��0 �ɹ���1 �Ѹ���',
  'create_time' TIMESTAMP not null comment '����ʱ��',
  PRIMARY KEY (seckill_id,user_phone),-- ��������
  KEY idx_create_time(create_time)
)ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT="��ɱ�ɹ���ϸ��";



-- �������ݿ����̨
mysql -uroot -p