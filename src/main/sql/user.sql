/***
�������ݿ��û���
 CREATE TABLE 'user' (
 'login_id' varchar(20) NOT NULL COMMENT '��½ID',
 'pwd' varchar(20) NOT NULL COMMENT '�û�����',
 'name' varchar(100) NOT NULL COMMENT '�û�����',
 'age' int(3) NOT NULL COMMENT '�û�����',
 'sex' varchar(3) NOT NULL COMMENT '�Ա�',
 'duty' varchar(15) COMMENT 'ְ��',
 'cell_number' varchar(15) COMMENT '�ֻ���',
 'photo_url' varchar(75) COMMENT 'ͷ���ַ',
 'used' boolean NOT NULL COMMENT '�˺��Ƿ����',
 PRIMARY KEY ('login_id')
 ) ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='�û���';

 ����Ĭ�����ݣ�
 INSERT INTO 'user' ('login_id','pwd','name','age','sex','used')
 VALUES
 ('pc859107393','123456','����',20,'��',true),
 ('pc228568859','123456','chengcheng',20,'Ů',true),
 ('pangpang','123456','����һ��ҹ',25,'��',true),
 ('111111','123456','������ϵ�н̳�',22,'Ů',true);
 */
