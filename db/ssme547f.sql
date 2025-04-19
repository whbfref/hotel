-- MySQL dump 10.13  Distrib 5.7.31, for Linux (x86_64)
--
-- Host: localhost    Database: ssme547f
-- ------------------------------------------------------
-- Server version	5.7.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `chat`
--

DROP TABLE IF EXISTS `chat`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `chat` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `adminid` bigint(20) DEFAULT NULL COMMENT '管理员id',
  `ask` longtext COMMENT '提问',
  `reply` longtext COMMENT '回复',
  `isreply` int(11) DEFAULT NULL COMMENT '是否回复',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1614683126043 DEFAULT CHARSET=utf8 COMMENT='在线交流';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chat`
--

LOCK TABLES `chat` WRITE;
/*!40000 ALTER TABLE `chat` DISABLE KEYS */;
INSERT INTO `chat` VALUES (101,'2021-03-02 10:53:32',1,1,'提问1','回复1',1),(102,'2021-03-02 10:53:32',2,2,'提问2','回复2',2),(103,'2021-03-02 10:53:32',3,3,'提问3','回复3',3),(104,'2021-03-02 10:53:32',4,4,'提问4','回复4',4),(105,'2021-03-02 10:53:32',5,5,'提问5','回复5',5),(106,'2021-03-02 10:53:32',6,6,'提问6','回复6',6),(1614682811702,'2021-03-02 11:00:11',1614682740775,NULL,'请问每月费用怎么计算',NULL,0),(1614683126042,'2021-03-02 11:05:25',1614682740775,1,NULL,'包括床位费，护理费，餐饮费等',NULL);
/*!40000 ALTER TABLE `chat` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `chuangweixinxi`
--

DROP TABLE IF EXISTS `chuangweixinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `chuangweixinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `chuangweibianhao` varchar(200) NOT NULL COMMENT '床位编号',
  `weizhi` varchar(200) DEFAULT NULL COMMENT '位置',
  `tupian` varchar(200) DEFAULT NULL COMMENT '图片',
  `meiyuejiage` int(11) DEFAULT NULL COMMENT '每月价格',
  `feiyongbaohan` varchar(200) DEFAULT NULL COMMENT '费用包含',
  `chuangweizhuangtai` varchar(200) DEFAULT NULL COMMENT '床位状态',
  `yajin` int(11) DEFAULT NULL COMMENT '押金',
  PRIMARY KEY (`id`),
  UNIQUE KEY `chuangweibianhao` (`chuangweibianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=1614682672724 DEFAULT CHARSET=utf8 COMMENT='床位信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chuangweixinxi`
--

LOCK TABLES `chuangweixinxi` WRITE;
/*!40000 ALTER TABLE `chuangweixinxi` DISABLE KEYS */;
INSERT INTO `chuangweixinxi` VALUES (21,'2021-03-02 10:53:32','床位编号1','位置1','http://localhost:8080/ssme547f/upload/chuangweixinxi_tupian1.jpg',1,'费用包含1','可预订',1),(22,'2021-03-02 10:53:32','床位编号2','位置2','http://localhost:8080/ssme547f/upload/chuangweixinxi_tupian2.jpg',2,'费用包含2','可预订',2),(23,'2021-03-02 10:53:32','床位编号3','位置3','http://localhost:8080/ssme547f/upload/chuangweixinxi_tupian3.jpg',3,'费用包含3','可预订',3),(24,'2021-03-02 10:53:32','床位编号4','位置4','http://localhost:8080/ssme547f/upload/chuangweixinxi_tupian4.jpg',4,'费用包含4','可预订',4),(25,'2021-03-02 10:53:32','床位编号5','位置5','http://localhost:8080/ssme547f/upload/chuangweixinxi_tupian5.jpg',5,'费用包含5','可预订',5),(26,'2021-03-02 10:53:32','床位编号6','位置6','http://localhost:8080/ssme547f/upload/chuangweixinxi_tupian6.jpg',6,'费用包含6','可预订',6),(1614682672723,'2021-03-02 10:57:52','C08','2楼','http://localhost:8080/ssme547f/upload/1614682661837.jpg',2000,'床位','可预订',5000);
/*!40000 ALTER TABLE `chuangweixinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `config`
--

DROP TABLE IF EXISTS `config`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) NOT NULL COMMENT '配置参数名称',
  `value` varchar(100) DEFAULT NULL COMMENT '配置参数值',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='配置文件';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `config`
--

LOCK TABLES `config` WRITE;
/*!40000 ALTER TABLE `config` DISABLE KEYS */;
INSERT INTO `config` VALUES (1,'picture1','http://localhost:8080/ssme547f/upload/picture1.jpg'),(2,'picture2','http://localhost:8080/ssme547f/upload/1614682682208.jpg'),(3,'picture3','http://localhost:8080/ssme547f/upload/picture3.jpg'),(6,'homepage',NULL);
/*!40000 ALTER TABLE `config` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `discusschuangweixinxi`
--

DROP TABLE IF EXISTS `discusschuangweixinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `discusschuangweixinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `refid` bigint(20) NOT NULL COMMENT '关联表id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `content` longtext NOT NULL COMMENT '评论内容',
  `reply` longtext COMMENT '回复内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=137 DEFAULT CHARSET=utf8 COMMENT='床位信息评论表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `discusschuangweixinxi`
--

LOCK TABLES `discusschuangweixinxi` WRITE;
/*!40000 ALTER TABLE `discusschuangweixinxi` DISABLE KEYS */;
INSERT INTO `discusschuangweixinxi` VALUES (131,'2021-03-02 10:53:32',1,1,'评论内容1','回复内容1'),(132,'2021-03-02 10:53:32',2,2,'评论内容2','回复内容2'),(133,'2021-03-02 10:53:32',3,3,'评论内容3','回复内容3'),(134,'2021-03-02 10:53:32',4,4,'评论内容4','回复内容4'),(135,'2021-03-02 10:53:32',5,5,'评论内容5','回复内容5'),(136,'2021-03-02 10:53:32',6,6,'评论内容6','回复内容6');
/*!40000 ALTER TABLE `discusschuangweixinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `feiyongxinxi`
--

DROP TABLE IF EXISTS `feiyongxinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `feiyongxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `chuangweibianhao` varchar(200) DEFAULT NULL COMMENT '床位编号',
  `laorenxingming` varchar(200) DEFAULT NULL COMMENT '老人姓名',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `yuefen` varchar(200) DEFAULT NULL COMMENT '月份',
  `chuangweifei` int(11) DEFAULT NULL COMMENT '床位费',
  `hulifei` int(11) DEFAULT NULL COMMENT '护理费',
  `canyinfei` int(11) DEFAULT NULL COMMENT '餐饮费',
  `kongdiaonuanqi` int(11) DEFAULT NULL COMMENT '空调暖气',
  `qitafeiyong` int(11) DEFAULT NULL COMMENT '其他费用',
  `zongfeiyong` varchar(200) DEFAULT NULL COMMENT '总费用',
  `dengjiriqi` date DEFAULT NULL COMMENT '登记日期',
  `yonghuming` varchar(200) DEFAULT NULL COMMENT '用户名',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `lianxidianhua` varchar(200) DEFAULT NULL COMMENT '联系电话',
  `ispay` varchar(200) DEFAULT '未支付' COMMENT '是否支付',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1614682986974 DEFAULT CHARSET=utf8 COMMENT='费用信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `feiyongxinxi`
--

LOCK TABLES `feiyongxinxi` WRITE;
/*!40000 ALTER TABLE `feiyongxinxi` DISABLE KEYS */;
INSERT INTO `feiyongxinxi` VALUES (71,'2021-03-02 10:53:32','床位编号1','老人姓名1','性别1','月份1',1,1,1,1,1,'总费用1','2021-03-02','用户名1','姓名1','联系电话1','未支付'),(72,'2021-03-02 10:53:32','床位编号2','老人姓名2','性别2','月份2',2,2,2,2,2,'总费用2','2021-03-02','用户名2','姓名2','联系电话2','未支付'),(73,'2021-03-02 10:53:32','床位编号3','老人姓名3','性别3','月份3',3,3,3,3,3,'总费用3','2021-03-02','用户名3','姓名3','联系电话3','未支付'),(74,'2021-03-02 10:53:32','床位编号4','老人姓名4','性别4','月份4',4,4,4,4,4,'总费用4','2021-03-02','用户名4','姓名4','联系电话4','未支付'),(75,'2021-03-02 10:53:32','床位编号5','老人姓名5','性别5','月份5',5,5,5,5,5,'总费用5','2021-03-02','用户名5','姓名5','联系电话5','未支付'),(76,'2021-03-02 10:53:32','床位编号6','老人姓名6','性别6','月份6',6,6,6,6,6,'总费用6','2021-03-02','用户名6','姓名6','联系电话6','未支付'),(1614682986973,'2021-03-02 11:03:06','C08','张一','女','2021年2月',2000,1000,1000,1000,1000,'6000','2021-03-02','1','陈一','12312312312','已支付');
/*!40000 ALTER TABLE `feiyongxinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `laifangdengji`
--

DROP TABLE IF EXISTS `laifangdengji`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `laifangdengji` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `chuangweibianhao` varchar(200) DEFAULT NULL COMMENT '床位编号',
  `laorenxingming` varchar(200) DEFAULT NULL COMMENT '老人姓名',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `laorennianling` varchar(200) DEFAULT NULL COMMENT '老人年龄',
  `laifangren` varchar(200) DEFAULT NULL COMMENT '来访人',
  `laifangshijian` datetime DEFAULT NULL COMMENT '来访时间',
  `laifangshizhang` float DEFAULT NULL COMMENT '来访时长',
  `yonghuming` varchar(200) DEFAULT NULL COMMENT '用户名',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1614682966471 DEFAULT CHARSET=utf8 COMMENT='来访登记';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `laifangdengji`
--

LOCK TABLES `laifangdengji` WRITE;
/*!40000 ALTER TABLE `laifangdengji` DISABLE KEYS */;
INSERT INTO `laifangdengji` VALUES (61,'2021-03-02 10:53:32','床位编号1','老人姓名1','性别1','老人年龄1','来访人1','2021-03-02 18:53:32',1,'用户名1','姓名1'),(62,'2021-03-02 10:53:32','床位编号2','老人姓名2','性别2','老人年龄2','来访人2','2021-03-02 18:53:32',2,'用户名2','姓名2'),(63,'2021-03-02 10:53:32','床位编号3','老人姓名3','性别3','老人年龄3','来访人3','2021-03-02 18:53:32',3,'用户名3','姓名3'),(64,'2021-03-02 10:53:32','床位编号4','老人姓名4','性别4','老人年龄4','来访人4','2021-03-02 18:53:32',4,'用户名4','姓名4'),(65,'2021-03-02 10:53:32','床位编号5','老人姓名5','性别5','老人年龄5','来访人5','2021-03-02 18:53:32',5,'用户名5','姓名5'),(66,'2021-03-02 10:53:32','床位编号6','老人姓名6','性别6','老人年龄6','来访人6','2021-03-02 18:53:32',6,'用户名6','姓名6'),(1614682966470,'2021-03-02 11:02:46','C08','张一','女','72','张张','2021-03-02 19:02:42',1.5,'1','陈一');
/*!40000 ALTER TABLE `laifangdengji` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `laorenxinxi`
--

DROP TABLE IF EXISTS `laorenxinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `laorenxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `chuangweibianhao` varchar(200) DEFAULT NULL COMMENT '床位编号',
  `laorenxingming` varchar(200) NOT NULL COMMENT '老人姓名',
  `xingbie` varchar(200) NOT NULL COMMENT '性别',
  `zhaopian` varchar(200) NOT NULL COMMENT '照片',
  `laorennianling` int(11) NOT NULL COMMENT '老人年龄',
  `yonghuming` varchar(200) DEFAULT NULL COMMENT '用户名',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `lianxidianhua` varchar(200) DEFAULT NULL COMMENT '联系电话',
  `zhuzhi` varchar(200) DEFAULT NULL COMMENT '住址',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1614682952282 DEFAULT CHARSET=utf8 COMMENT='老人信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `laorenxinxi`
--

LOCK TABLES `laorenxinxi` WRITE;
/*!40000 ALTER TABLE `laorenxinxi` DISABLE KEYS */;
INSERT INTO `laorenxinxi` VALUES (51,'2021-03-02 10:53:32','床位编号1','老人姓名1','男','http://localhost:8080/ssme547f/upload/laorenxinxi_zhaopian1.jpg',1,'用户名1','姓名1','联系电话1','住址1'),(52,'2021-03-02 10:53:32','床位编号2','老人姓名2','男','http://localhost:8080/ssme547f/upload/laorenxinxi_zhaopian2.jpg',2,'用户名2','姓名2','联系电话2','住址2'),(53,'2021-03-02 10:53:32','床位编号3','老人姓名3','男','http://localhost:8080/ssme547f/upload/laorenxinxi_zhaopian3.jpg',3,'用户名3','姓名3','联系电话3','住址3'),(54,'2021-03-02 10:53:32','床位编号4','老人姓名4','男','http://localhost:8080/ssme547f/upload/laorenxinxi_zhaopian4.jpg',4,'用户名4','姓名4','联系电话4','住址4'),(55,'2021-03-02 10:53:32','床位编号5','老人姓名5','男','http://localhost:8080/ssme547f/upload/laorenxinxi_zhaopian5.jpg',5,'用户名5','姓名5','联系电话5','住址5'),(56,'2021-03-02 10:53:32','床位编号6','老人姓名6','男','http://localhost:8080/ssme547f/upload/laorenxinxi_zhaopian6.jpg',6,'用户名6','姓名6','联系电话6','住址6'),(1614682952281,'2021-03-02 11:02:32','C08','张一','女','http://localhost:8080/ssme547f/upload/1614682947747.jpg',72,'1','陈一','12312312312','梅州');
/*!40000 ALTER TABLE `laorenxinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `news`
--

DROP TABLE IF EXISTS `news`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `news` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `title` varchar(200) NOT NULL COMMENT '标题',
  `introduction` longtext COMMENT '简介',
  `picture` varchar(200) NOT NULL COMMENT '图片',
  `content` longtext NOT NULL COMMENT '内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1614682718150 DEFAULT CHARSET=utf8 COMMENT='公告信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `news`
--

LOCK TABLES `news` WRITE;
/*!40000 ALTER TABLE `news` DISABLE KEYS */;
INSERT INTO `news` VALUES (121,'2021-03-02 10:53:32','标题1','简介1','http://localhost:8080/ssme547f/upload/news_picture1.jpg','内容1'),(122,'2021-03-02 10:53:32','标题2','简介2','http://localhost:8080/ssme547f/upload/news_picture2.jpg','内容2'),(123,'2021-03-02 10:53:32','标题3','简介3','http://localhost:8080/ssme547f/upload/news_picture3.jpg','内容3'),(124,'2021-03-02 10:53:32','标题4','简介4','http://localhost:8080/ssme547f/upload/news_picture4.jpg','内容4'),(125,'2021-03-02 10:53:32','标题5','简介5','http://localhost:8080/ssme547f/upload/news_picture5.jpg','内容5'),(126,'2021-03-02 10:53:32','标题6','简介6','http://localhost:8080/ssme547f/upload/news_picture6.jpg','内容6'),(1614682718149,'2021-03-02 10:58:37','养老院入住流程','床位预订','http://localhost:8080/ssme547f/upload/1614682696324.jpg','<p>养老院床位预订流程</p><p><img src=\"http://localhost:8080/ssme547f/upload/1614682716183.jpg\"></p>');
/*!40000 ALTER TABLE `news` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ruzhubanli`
--

DROP TABLE IF EXISTS `ruzhubanli`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ruzhubanli` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `chuangweibianhao` varchar(200) DEFAULT NULL COMMENT '床位编号',
  `weizhi` varchar(200) DEFAULT NULL COMMENT '位置',
  `ruzhuriqi` date DEFAULT NULL COMMENT '入住日期',
  `yajin` varchar(200) DEFAULT NULL COMMENT '押金',
  `yonghuming` varchar(200) DEFAULT NULL COMMENT '用户名',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `lianxidianhua` varchar(200) DEFAULT NULL COMMENT '联系电话',
  `laorenxingming` varchar(200) DEFAULT NULL COMMENT '老人姓名',
  `laorennianling` varchar(200) DEFAULT NULL COMMENT '老人年龄',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1614682862320 DEFAULT CHARSET=utf8 COMMENT='入住办理';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ruzhubanli`
--

LOCK TABLES `ruzhubanli` WRITE;
/*!40000 ALTER TABLE `ruzhubanli` DISABLE KEYS */;
INSERT INTO `ruzhubanli` VALUES (41,'2021-03-02 10:53:32','床位编号1','位置1','2021-03-02','押金1','用户名1','姓名1','联系电话1','老人姓名1','老人年龄1','性别1'),(42,'2021-03-02 10:53:32','床位编号2','位置2','2021-03-02','押金2','用户名2','姓名2','联系电话2','老人姓名2','老人年龄2','性别2'),(43,'2021-03-02 10:53:32','床位编号3','位置3','2021-03-02','押金3','用户名3','姓名3','联系电话3','老人姓名3','老人年龄3','性别3'),(44,'2021-03-02 10:53:32','床位编号4','位置4','2021-03-02','押金4','用户名4','姓名4','联系电话4','老人姓名4','老人年龄4','性别4'),(45,'2021-03-02 10:53:32','床位编号5','位置5','2021-03-02','押金5','用户名5','姓名5','联系电话5','老人姓名5','老人年龄5','性别5'),(46,'2021-03-02 10:53:32','床位编号6','位置6','2021-03-02','押金6','用户名6','姓名6','联系电话6','老人姓名6','老人年龄6','性别6'),(1614682862319,'2021-03-02 11:01:02','C08','2楼','2021-03-02','5000','1','陈一','12312312312','张一','72','女');
/*!40000 ALTER TABLE `ruzhubanli` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ruzhushenqing`
--

DROP TABLE IF EXISTS `ruzhushenqing`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ruzhushenqing` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `chuangweibianhao` varchar(200) DEFAULT NULL COMMENT '床位编号',
  `weizhi` varchar(200) DEFAULT NULL COMMENT '位置',
  `yajin` varchar(200) DEFAULT NULL COMMENT '押金',
  `shenqingneirong` varchar(200) DEFAULT NULL COMMENT '申请内容',
  `shenqingriqi` date DEFAULT NULL COMMENT '申请日期',
  `yonghuming` varchar(200) DEFAULT NULL COMMENT '用户名',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `lianxidianhua` varchar(200) DEFAULT NULL COMMENT '联系电话',
  `laorenxingming` varchar(200) DEFAULT NULL COMMENT '老人姓名',
  `laorennianling` varchar(200) DEFAULT NULL COMMENT '老人年龄',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `sfsh` varchar(200) DEFAULT '否' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  `ispay` varchar(200) DEFAULT '未支付' COMMENT '是否支付',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1614682786869 DEFAULT CHARSET=utf8 COMMENT='入住申请';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ruzhushenqing`
--

LOCK TABLES `ruzhushenqing` WRITE;
/*!40000 ALTER TABLE `ruzhushenqing` DISABLE KEYS */;
INSERT INTO `ruzhushenqing` VALUES (31,'2021-03-02 10:53:32','床位编号1','位置1','押金1','申请内容1','2021-03-02','用户名1','姓名1','联系电话1','老人姓名1','老人年龄1','男','是','','未支付'),(32,'2021-03-02 10:53:32','床位编号2','位置2','押金2','申请内容2','2021-03-02','用户名2','姓名2','联系电话2','老人姓名2','老人年龄2','男','是','','未支付'),(33,'2021-03-02 10:53:32','床位编号3','位置3','押金3','申请内容3','2021-03-02','用户名3','姓名3','联系电话3','老人姓名3','老人年龄3','男','是','','未支付'),(34,'2021-03-02 10:53:32','床位编号4','位置4','押金4','申请内容4','2021-03-02','用户名4','姓名4','联系电话4','老人姓名4','老人年龄4','男','是','','未支付'),(35,'2021-03-02 10:53:32','床位编号5','位置5','押金5','申请内容5','2021-03-02','用户名5','姓名5','联系电话5','老人姓名5','老人年龄5','男','是','','未支付'),(36,'2021-03-02 10:53:32','床位编号6','位置6','押金6','申请内容6','2021-03-02','用户名6','姓名6','联系电话6','老人姓名6','老人年龄6','男','是','','未支付'),(1614682786868,'2021-03-02 10:59:46','C08','2楼','5000','老人入住','2021-03-02','1','陈一','12312312312','张一','72','女','是','ok','已支付');
/*!40000 ALTER TABLE `ruzhushenqing` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `storeup`
--

DROP TABLE IF EXISTS `storeup`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `storeup` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `refid` bigint(20) DEFAULT NULL COMMENT '收藏id',
  `tablename` varchar(200) DEFAULT NULL COMMENT '表名',
  `name` varchar(200) NOT NULL COMMENT '收藏名称',
  `picture` varchar(200) NOT NULL COMMENT '收藏图片',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1614682768021 DEFAULT CHARSET=utf8 COMMENT='收藏表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `storeup`
--

LOCK TABLES `storeup` WRITE;
/*!40000 ALTER TABLE `storeup` DISABLE KEYS */;
/*!40000 ALTER TABLE `storeup` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `token`
--

DROP TABLE IF EXISTS `token`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `token` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `tablename` varchar(100) DEFAULT NULL COMMENT '表名',
  `role` varchar(100) DEFAULT NULL COMMENT '角色',
  `token` varchar(200) NOT NULL COMMENT '密码',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  `expiratedtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '过期时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='token表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `token`
--

LOCK TABLES `token` WRITE;
/*!40000 ALTER TABLE `token` DISABLE KEYS */;
INSERT INTO `token` VALUES (1,11,'用户1','yonghu','用户','d3o1qq56tlnrubgifq3mxxi7lkag2asq','2021-03-02 10:54:20','2021-03-02 11:54:21'),(2,1,'abo','users','管理员','q9rqv40vejethutvupsby0omvlr8fndg','2021-03-02 10:54:40','2021-03-02 12:04:05'),(3,1614682740775,'1','yonghu','用户','sw44v2u9sa1oa2947oynjlfjejbdbr7p','2021-03-02 10:59:06','2021-03-02 12:05:33');
/*!40000 ALTER TABLE `token` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tuizhushenqing`
--

DROP TABLE IF EXISTS `tuizhushenqing`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tuizhushenqing` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `chuangweibianhao` varchar(200) DEFAULT NULL COMMENT '床位编号',
  `weizhi` varchar(200) DEFAULT NULL COMMENT '位置',
  `yajin` varchar(200) DEFAULT NULL COMMENT '押金',
  `tuizhushenqing` varchar(200) NOT NULL COMMENT '退住申请',
  `tuizhuriqi` date NOT NULL COMMENT '退住日期',
  `yonghuming` varchar(200) DEFAULT NULL COMMENT '用户名',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `lianxidianhua` varchar(200) DEFAULT NULL COMMENT '联系电话',
  `laorenxingming` varchar(200) DEFAULT NULL COMMENT '老人姓名',
  `sfsh` varchar(200) DEFAULT '否' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1614683032685 DEFAULT CHARSET=utf8 COMMENT='退住申请';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tuizhushenqing`
--

LOCK TABLES `tuizhushenqing` WRITE;
/*!40000 ALTER TABLE `tuizhushenqing` DISABLE KEYS */;
INSERT INTO `tuizhushenqing` VALUES (81,'2021-03-02 10:53:32','床位编号1','位置1','押金1','退住申请1','2021-03-02','用户名1','姓名1','联系电话1','老人姓名1','是',''),(82,'2021-03-02 10:53:32','床位编号2','位置2','押金2','退住申请2','2021-03-02','用户名2','姓名2','联系电话2','老人姓名2','是',''),(83,'2021-03-02 10:53:32','床位编号3','位置3','押金3','退住申请3','2021-03-02','用户名3','姓名3','联系电话3','老人姓名3','是',''),(84,'2021-03-02 10:53:32','床位编号4','位置4','押金4','退住申请4','2021-03-02','用户名4','姓名4','联系电话4','老人姓名4','是',''),(85,'2021-03-02 10:53:32','床位编号5','位置5','押金5','退住申请5','2021-03-02','用户名5','姓名5','联系电话5','老人姓名5','是',''),(86,'2021-03-02 10:53:32','床位编号6','位置6','押金6','退住申请6','2021-03-02','用户名6','姓名6','联系电话6','老人姓名6','是',''),(1614683032684,'2021-03-02 11:03:51','C08','2楼','5000','不住了','2021-03-13','1','陈一','12312312312','张一','是','ok');
/*!40000 ALTER TABLE `tuizhushenqing` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `password` varchar(100) NOT NULL COMMENT '密码',
  `role` varchar(100) DEFAULT '管理员' COMMENT '角色',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='用户表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'abo','abo','管理员','2021-03-02 10:53:32');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yajintuihai`
--

DROP TABLE IF EXISTS `yajintuihai`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yajintuihai` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `chuangweibianhao` varchar(200) DEFAULT NULL COMMENT '床位编号',
  `weizhi` varchar(200) DEFAULT NULL COMMENT '位置',
  `yajin` varchar(200) DEFAULT NULL COMMENT '押金',
  `tuihaiyajin` int(11) DEFAULT NULL COMMENT '退还押金',
  `tuihairiqi` date DEFAULT NULL COMMENT '退还日期',
  `yonghuming` varchar(200) DEFAULT NULL COMMENT '用户名',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `laorenxingming` varchar(200) DEFAULT NULL COMMENT '老人姓名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1614683101503 DEFAULT CHARSET=utf8 COMMENT='押金退还';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yajintuihai`
--

LOCK TABLES `yajintuihai` WRITE;
/*!40000 ALTER TABLE `yajintuihai` DISABLE KEYS */;
INSERT INTO `yajintuihai` VALUES (91,'2021-03-02 10:53:32','床位编号1','位置1','押金1',1,'2021-03-02','用户名1','姓名1','老人姓名1'),(92,'2021-03-02 10:53:32','床位编号2','位置2','押金2',2,'2021-03-02','用户名2','姓名2','老人姓名2'),(93,'2021-03-02 10:53:32','床位编号3','位置3','押金3',3,'2021-03-02','用户名3','姓名3','老人姓名3'),(94,'2021-03-02 10:53:32','床位编号4','位置4','押金4',4,'2021-03-02','用户名4','姓名4','老人姓名4'),(95,'2021-03-02 10:53:32','床位编号5','位置5','押金5',5,'2021-03-02','用户名5','姓名5','老人姓名5'),(96,'2021-03-02 10:53:32','床位编号6','位置6','押金6',6,'2021-03-02','用户名6','姓名6','老人姓名6'),(1614683101502,'2021-03-02 11:05:01','C08','2楼','5000',5000,'2021-03-02','1','陈一','张一');
/*!40000 ALTER TABLE `yajintuihai` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yonghu`
--

DROP TABLE IF EXISTS `yonghu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yonghu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yonghuming` varchar(200) NOT NULL COMMENT '用户名',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `touxiang` varchar(200) DEFAULT NULL COMMENT '头像',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `nianling` int(11) DEFAULT NULL COMMENT '年龄',
  `zhuzhi` varchar(200) DEFAULT NULL COMMENT '住址',
  `lianxidianhua` varchar(200) DEFAULT NULL COMMENT '联系电话',
  PRIMARY KEY (`id`),
  UNIQUE KEY `yonghuming` (`yonghuming`)
) ENGINE=InnoDB AUTO_INCREMENT=1614682740776 DEFAULT CHARSET=utf8 COMMENT='用户';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yonghu`
--

LOCK TABLES `yonghu` WRITE;
/*!40000 ALTER TABLE `yonghu` DISABLE KEYS */;
INSERT INTO `yonghu` VALUES (11,'2021-03-02 10:53:32','用户1','123456','姓名1','http://localhost:8080/ssme547f/upload/yonghu_touxiang1.jpg','男',1,'住址1','13823888881'),(12,'2021-03-02 10:53:32','用户2','123456','姓名2','http://localhost:8080/ssme547f/upload/yonghu_touxiang2.jpg','男',2,'住址2','13823888882'),(13,'2021-03-02 10:53:32','用户3','123456','姓名3','http://localhost:8080/ssme547f/upload/yonghu_touxiang3.jpg','男',3,'住址3','13823888883'),(14,'2021-03-02 10:53:32','用户4','123456','姓名4','http://localhost:8080/ssme547f/upload/yonghu_touxiang4.jpg','男',4,'住址4','13823888884'),(15,'2021-03-02 10:53:32','用户5','123456','姓名5','http://localhost:8080/ssme547f/upload/yonghu_touxiang5.jpg','男',5,'住址5','13823888885'),(16,'2021-03-02 10:53:32','用户6','123456','姓名6','http://localhost:8080/ssme547f/upload/yonghu_touxiang6.jpg','男',6,'住址6','13823888886'),(1614682740775,'2021-03-02 10:59:00','1','1','陈一','http://localhost:8080/ssme547f/upload/1614682756262.jpg','女',25,'梅州','12312312312');
/*!40000 ALTER TABLE `yonghu` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-03-02 23:31:29
