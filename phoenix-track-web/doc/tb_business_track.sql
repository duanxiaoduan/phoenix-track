/*
Navicat MySQL Data Transfer

Source Server         : 192.168.130.220
Source Server Version : 50158
Source Host           : 192.168.130.220:3306
Source Database       : gintong_track

Target Server Type    : MYSQL
Target Server Version : 50158
File Encoding         : 65001

Date: 2017-09-06 15:26:32
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
  `model_function` tinyint(4) unsigned DEFAULT NULL COMMENT '业务模块下的功能，1--新增消息，2--新增动态，3--新增文件，4--新增成员，5--新增回答，6--新增视频',
  `opt_type` tinyint(4) unsigned DEFAULT NULL COMMENT '操作类型，1-新增，2-浏览，3-收藏，4-分享，5-回答',
  `share_type` tinyint(4) unsigned DEFAULT NULL COMMENT 'opt_type为分享时，11-动态，12-畅聊，13-社群，14-事务，21-朋友圈，22-QQ，23-微信，24-微博，25-其它方式',
  `user_id` tinyint(4) unsigned DEFAULT NULL COMMENT '用户id',
  `user_name` varchar(64) DEFAULT NULL COMMENT '用户昵称',
  `remarks` varchar(255) DEFAULT NULL COMMENT '备注',
  `client_ip` varchar(32) DEFAULT NULL COMMENT 'ip',
  `method_type` tinyint(4) unsigned DEFAULT NULL COMMENT '请求方法，1-get，2-post，3-put，4-delete',
  `url` varchar(1024) DEFAULT NULL COMMENT '请求url',
  `parameter` varchar(1024) DEFAULT NULL COMMENT '请求参数，json',
  `useragent` varchar(1024) DEFAULT NULL COMMENT '浏览器userAgent',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
