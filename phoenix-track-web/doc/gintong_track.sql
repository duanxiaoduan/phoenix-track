/*
Navicat MySQL Data Transfer

Source Server         : 192.168.130.220
Source Server Version : 50158
Source Host           : 192.168.130.220:3306
Source Database       : gintong_track

Target Server Type    : MYSQL
Target Server Version : 50158
File Encoding         : 65001

Date: 2017-08-24 17:59:21
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tb_business_track
-- ----------------------------
DROP TABLE IF EXISTS `tb_business_track`;
CREATE TABLE `tb_business_track` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `server_type` tinyint(4) unsigned DEFAULT NULL COMMENT '服务端类型，1-web,2-ios,3-android,4-后端接口',
  `business_model` tinyint(4) unsigned DEFAULT NULL COMMENT '业务模块，1-动态，2-社群，3-畅聊，4-事务，5-组织，6-视频，7-问答，8-热门，9-头条，10-搜索',
  `business_model_id` bigint(20) unsigned DEFAULT NULL COMMENT '业务模块对应的Id                                                                                                                                                                        ',
  `opt_type` tinyint(4) unsigned DEFAULT NULL COMMENT '操作类型，1-新增，2-浏览，3-收藏，4-分享，5-回答',
  `share_type` tinyint(4) unsigned DEFAULT NULL COMMENT 'opt_type为分享时，11-动态，12-畅聊，13-社群，14-事务，21-朋友圈，22-QQ，23-微信，24-微博，25-其它方式',
  `user_id` tinyint(4) unsigned DEFAULT NULL COMMENT '用户id',
  `remarks` varchar(255) DEFAULT NULL COMMENT '备注',
  `client_ip` varchar(32) DEFAULT NULL COMMENT 'ip',
  `method_type` tinyint(4) unsigned DEFAULT NULL COMMENT '请求方法，1-get，2-post，3-put，4-delete',
  `url` varchar(1024) DEFAULT NULL COMMENT '请求url',
  `parameter` varchar(1024) DEFAULT NULL COMMENT '请求参数，json',
  `useragent` varchar(1024) DEFAULT NULL COMMENT '浏览器userAgent',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_business_track
-- ----------------------------
INSERT INTO `tb_business_track` VALUES ('1', '1', '1', '1', '1', null, '1', '11', null, null, null, null, null, '2017-08-07 17:41:35');
INSERT INTO `tb_business_track` VALUES ('2', '2', '1', '1', '1', '1', '1', '11', null, '1', null, null, null, '2017-08-07 17:41:55');
INSERT INTO `tb_business_track` VALUES ('3', '4', '10', null, '2', '0', null, null, '192.168.130.109', '1', 'http://192.168.101.9:4550/video/v1/video/getVideo/145', null, null, '2017-08-22 16:08:08');
INSERT INTO `tb_business_track` VALUES ('4', '4', '10', null, '2', '0', null, null, '192.168.130.109', '1', 'http://192.168.101.9:4550/video/v1/video/getVideo/145', null, null, '2017-08-22 16:10:08');
INSERT INTO `tb_business_track` VALUES ('5', '4', '10', null, '2', '0', null, null, '192.168.130.109', '1', 'http://192.168.101.9:4550/video/v1/video/getVideo/145', null, null, '2017-08-22 16:14:08');
INSERT INTO `tb_business_track` VALUES ('6', '4', '10', null, '2', null, null, null, '192.168.130.109', '1', 'http://192.168.101.9:4550/video/v1/video/getVideo/148', null, null, '2017-08-23 09:35:17');
INSERT INTO `tb_business_track` VALUES ('7', '4', '10', null, '2', null, null, null, '192.168.130.109', '1', 'http://192.168.101.9:4550/video/v1/video/getVideo/148', null, null, '2017-08-23 10:35:17');

-- ----------------------------
-- Table structure for tb_business_track_201708
-- ----------------------------
DROP TABLE IF EXISTS `tb_business_track_201708`;
CREATE TABLE `tb_business_track_201708` (
  `id` bigint(20) unsigned NOT NULL DEFAULT '0' COMMENT '主键',
  `server_type` tinyint(4) unsigned DEFAULT NULL COMMENT '服务端类型，1-web,2-ios,3-android,4-后端接口',
  `business_model` tinyint(4) unsigned DEFAULT NULL COMMENT '业务模块，1-动态，2-社群，3-畅聊，4-事务，5-组织，6-视频，7-问答，8-热门，9-头条，10-搜索',
  `opt_type` tinyint(4) unsigned DEFAULT NULL COMMENT '操作类型，1-新增，2-浏览，3-收藏，4-分享，5-回答',
  `share_type` tinyint(4) unsigned DEFAULT NULL COMMENT 'opt_type为分享时，11-动态，12-畅聊，13-社群，14-事务，21-朋友圈，22-QQ，23-微信，24-微博，25-其它方式',
  `user_id` tinyint(4) unsigned DEFAULT NULL COMMENT '用户id',
  `remarks` varchar(255) DEFAULT NULL COMMENT '备注',
  `client_ip` varchar(32) DEFAULT NULL COMMENT 'ip',
  `method_type` tinyint(4) unsigned DEFAULT NULL COMMENT '请求方法，1-get，2-post，3-put，4-delete',
  `url` varchar(1024) DEFAULT NULL COMMENT '请求url',
  `parameter` varchar(1024) DEFAULT NULL COMMENT '请求参数，json',
  `userAgent` varchar(1024) DEFAULT NULL COMMENT '浏览器userAgent',
  `gmt_create` datetime NOT NULL COMMENT '创建时间'
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_business_track_201708
-- ----------------------------
INSERT INTO `tb_business_track_201708` VALUES ('1', '1', '1', '1', null, '1', '11', null, null, null, null, null, '2017-08-07 17:41:35');
INSERT INTO `tb_business_track_201708` VALUES ('2', '2', '1', '1', null, '1', '11', null, null, null, null, null, '2017-08-07 17:41:55');
