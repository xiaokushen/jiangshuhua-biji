/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 80015
Source Host           : localhost:3306
Source Database       : psd

Target Server Type    : MYSQL
Target Server Version : 80015
File Encoding         : 65001

Date: 2020-10-28 11:33:32
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `jcxxt_abnormal_info`
-- ----------------------------
DROP TABLE IF EXISTS `jcxxt_abnormal_info`;
CREATE TABLE `jcxxt_abnormal_info` (
  `ABNORMAL_ID` varchar(40) NOT NULL,
  `ABNORMAL_DATE` varchar(80) DEFAULT NULL,
  `ABNORMAL_GOODSNAME` varchar(80) DEFAULT NULL,
  `ABNORMAL_NUMBER` int(11) DEFAULT NULL,
  `ABNORMAL_OPERATOR` varchar(80) DEFAULT NULL,
  `ABNORMAL_SORT` varchar(80) DEFAULT NULL,
  `ABNORMAL_STATE` varchar(80) DEFAULT NULL,
  `ABNORMAL_CREATDATE` varchar(80) DEFAULT NULL,
  `ABNORMAL_CRTATOR` varchar(80) DEFAULT NULL,
  `ABNORMAL_MODIFYDATE` varchar(80) DEFAULT NULL,
  `ABNORMAL_REVISER` varchar(80) DEFAULT NULL,
  `ABNORMAL_DELET` varchar(80) DEFAULT NULL,
  `APPROVAL_STATE` int(11) DEFAULT NULL,
  PRIMARY KEY (`ABNORMAL_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of jcxxt_abnormal_info
-- ----------------------------

-- ----------------------------
-- Table structure for `jcxxt_collection_goods`
-- ----------------------------
DROP TABLE IF EXISTS `jcxxt_collection_goods`;
CREATE TABLE `jcxxt_collection_goods` (
  `COLLECTION_LISTID` varchar(40) NOT NULL,
  `TRANSFER_ID` varchar(40) DEFAULT NULL,
  `COLLECTION_TOTAL` int(11) DEFAULT NULL,
  `COLLECTION_CREATDATE` varchar(80) DEFAULT NULL,
  `COLLECTION_CRTATOR` varchar(80) DEFAULT NULL,
  `COLLECTION_MODIFYDATE` varchar(80) DEFAULT NULL,
  `COLLECTION_REVISER` varchar(80) DEFAULT NULL,
  `COLLECTION_DELET` varchar(80) DEFAULT NULL,
  PRIMARY KEY (`COLLECTION_LISTID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of jcxxt_collection_goods
-- ----------------------------

-- ----------------------------
-- Table structure for `jcxxt_cousromer_transfer`
-- ----------------------------
DROP TABLE IF EXISTS `jcxxt_cousromer_transfer`;
CREATE TABLE `jcxxt_cousromer_transfer` (
  `TRANSFER_ID` varchar(40) NOT NULL,
  `ACCOUNT_ID` varchar(40) DEFAULT NULL,
  `TRANSFER_MONEY` int(11) DEFAULT NULL,
  `TRANSFER_REMARKS` varchar(80) DEFAULT NULL,
  `TRANSFER_CREATDATE` varchar(80) DEFAULT NULL,
  `TRANSFER_CRTATOR` varchar(80) DEFAULT NULL,
  `TRANSFER_MODIFYDATE` varchar(80) DEFAULT NULL,
  `TRANSFER_REVISER` varchar(80) DEFAULT NULL,
  `TRANSFER_DELET` varchar(80) DEFAULT NULL,
  PRIMARY KEY (`TRANSFER_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of jcxxt_cousromer_transfer
-- ----------------------------

-- ----------------------------
-- Table structure for `jcxxt_detailed_list`
-- ----------------------------
DROP TABLE IF EXISTS `jcxxt_detailed_list`;
CREATE TABLE `jcxxt_detailed_list` (
  `DETAILEDLIST_ID` varchar(40) NOT NULL,
  `DETAILEDLIST_MONEY` int(11) DEFAULT NULL,
  `DETAILEDLIST_REMARKS` varchar(80) DEFAULT NULL,
  `DETAILEDLIST_CREATDATE` varchar(80) DEFAULT NULL,
  `DETAILEDLIST_CRTATOR` varchar(80) DEFAULT NULL,
  `DETAILEDLIST_MODIFYDATE` varchar(80) DEFAULT NULL,
  `DETAILEDLIST_REVISER` varchar(80) DEFAULT NULL,
  `DETAILEDLIST_DELET` varchar(80) DEFAULT NULL,
  PRIMARY KEY (`DETAILEDLIST_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of jcxxt_detailed_list
-- ----------------------------

-- ----------------------------
-- Table structure for `jcxxt_goods_info`
-- ----------------------------
DROP TABLE IF EXISTS `jcxxt_goods_info`;
CREATE TABLE `jcxxt_goods_info` (
  `GOODS_ID` varchar(40) NOT NULL,
  `GOODS_NAME` varchar(80) DEFAULT NULL,
  `GOODS_MODEL` varchar(80) DEFAULT NULL,
  `GOODS_NUMBER` int(80) DEFAULT NULL,
  `GOODS_BID` int(80) DEFAULT NULL,
  `GOODS_PRICE` int(80) DEFAULT NULL,
  `GOODS_NEARBID` int(80) DEFAULT NULL,
  `GOODS_NEARPRICE` int(80) DEFAULT NULL,
  `GOODS_CREATDATE` varchar(80) DEFAULT NULL,
  `GOODS_CRTATOR` varchar(80) DEFAULT NULL,
  `MODIFY_DATE` varchar(80) DEFAULT NULL,
  `GOODS_REVISER` varchar(80) DEFAULT NULL,
  `GOODS_DELET` varchar(80) DEFAULT NULL,
  `cate_id` varchar(40) DEFAULT NULL,
  `cate_code` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`GOODS_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of jcxxt_goods_info
-- ----------------------------

-- ----------------------------
-- Table structure for `jcxxt_payment_goods`
-- ----------------------------
DROP TABLE IF EXISTS `jcxxt_payment_goods`;
CREATE TABLE `jcxxt_payment_goods` (
  `PAYMENT_ID` varchar(40) NOT NULL,
  `SHIPGOODS_ID` varchar(80) DEFAULT NULL,
  `ACCOUNT_ID` varchar(40) DEFAULT NULL,
  `DETAILEDLIST_ID` int(11) DEFAULT NULL,
  `PAYMENT_TOTSL` varchar(80) DEFAULT NULL,
  `PAYMENT_CREATDATE` varchar(80) DEFAULT NULL,
  `PAYMENT_CRTATOR` varchar(80) DEFAULT NULL,
  `PAYMENT_MODIFYDATE` varchar(80) DEFAULT NULL,
  `PAYMENT_REVISER` varchar(80) DEFAULT NULL,
  `PAYMENT_DELET` varchar(80) DEFAULT NULL,
  PRIMARY KEY (`PAYMENT_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of jcxxt_payment_goods
-- ----------------------------

-- ----------------------------
-- Table structure for `jcxxt_police_info`
-- ----------------------------
DROP TABLE IF EXISTS `jcxxt_police_info`;
CREATE TABLE `jcxxt_police_info` (
  `ROW_ID` varchar(40) NOT NULL,
  `POLICEINFO_ID` varchar(80) DEFAULT NULL,
  `POLICEINFO_DATE` varchar(80) DEFAULT NULL,
  `POLICEINFO_OPERATOR` varchar(80) DEFAULT NULL,
  `GOODSINFO_NAME` varchar(80) DEFAULT NULL,
  `POLICEINFO_NUMBER` varchar(80) DEFAULT NULL,
  `POLICEINFO_STATE` varchar(80) DEFAULT NULL,
  `POLICEINFO_CREATDATE` varchar(80) DEFAULT NULL,
  `POLICEINFO_CRTATOR` varchar(80) DEFAULT NULL,
  `POLICEINFO_MODIFYDATE` varchar(80) DEFAULT NULL,
  `POLICEINFO_REVISER` varchar(80) DEFAULT NULL,
  `POLICEINFO_DELET` varchar(80) DEFAULT NULL,
  `APPROVAL_STATE` int(11) DEFAULT NULL,
  PRIMARY KEY (`ROW_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of jcxxt_police_info
-- ----------------------------

-- ----------------------------
-- Table structure for `psd_accounts_list`
-- ----------------------------
DROP TABLE IF EXISTS `psd_accounts_list`;
CREATE TABLE `psd_accounts_list` (
  `GOODS_ID` varchar(40) DEFAULT NULL,
  `CUS_ID` varchar(40) DEFAULT NULL,
  `ACCOUNT_ID` varchar(40) DEFAULT NULL,
  `CREAT_DATE` varchar(20) DEFAULT NULL,
  `CRTAT_USER` varchar(30) DEFAULT NULL,
  `MODIFY_DATE` varchar(20) DEFAULT NULL,
  `REVISE_USER` varchar(30) DEFAULT NULL,
  `DELET_STATE` int(11) DEFAULT NULL,
  `ac_id` varchar(40) NOT NULL,
  PRIMARY KEY (`ac_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of psd_accounts_list
-- ----------------------------

-- ----------------------------
-- Table structure for `psd_account_info`
-- ----------------------------
DROP TABLE IF EXISTS `psd_account_info`;
CREATE TABLE `psd_account_info` (
  `ACCOUNT_ID` varchar(40) NOT NULL,
  `ACCINFO_NAME` varchar(30) DEFAULT NULL,
  `ACCIBFO_MONEY` int(11) DEFAULT NULL,
  `CREAT_DATE` varchar(20) DEFAULT NULL,
  `CRTAT_USER` varchar(30) DEFAULT NULL,
  `MODIFY_DATE` varchar(20) DEFAULT NULL,
  `REVISE_USER` varchar(30) DEFAULT NULL,
  `DELET_STATE` int(11) DEFAULT NULL,
  PRIMARY KEY (`ACCOUNT_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of psd_account_info
-- ----------------------------

-- ----------------------------
-- Table structure for `psd_account_list`
-- ----------------------------
DROP TABLE IF EXISTS `psd_account_list`;
CREATE TABLE `psd_account_list` (
  `ACCOUNTS_ID` varchar(40) NOT NULL,
  `ACCOUNTS_NAME` varchar(30) DEFAULT NULL,
  `CREAT_DATE` varchar(20) DEFAULT NULL,
  `CRTAT_USER` varchar(30) DEFAULT NULL,
  `MODIFY_DATE` varchar(20) DEFAULT NULL,
  `REVISE_USER` varchar(30) DEFAULT NULL,
  `DELET_STATE` int(11) DEFAULT NULL,
  PRIMARY KEY (`ACCOUNTS_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of psd_account_list
-- ----------------------------

-- ----------------------------
-- Table structure for `psd_customer_account`
-- ----------------------------
DROP TABLE IF EXISTS `psd_customer_account`;
CREATE TABLE `psd_customer_account` (
  `ROW_ID` varchar(40) NOT NULL,
  `CUS_ID` varchar(40) NOT NULL,
  `CUS_QUOTA` varchar(40) DEFAULT NULL,
  `CUS_RECEIVABLE` int(11) DEFAULT NULL,
  `CUS_METET` int(11) DEFAULT NULL,
  `SALES_ID` varchar(40) DEFAULT NULL,
  `CREAT_DATE` varchar(20) DEFAULT NULL,
  `CRTAT_USER` varchar(30) DEFAULT NULL,
  `MODIFY_DATE` varchar(20) DEFAULT NULL,
  `REVISE_USER` varchar(30) DEFAULT NULL,
  `DELET_STATE` int(11) DEFAULT NULL,
  PRIMARY KEY (`ROW_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of psd_customer_account
-- ----------------------------

-- ----------------------------
-- Table structure for `psd_customer_info`
-- ----------------------------
DROP TABLE IF EXISTS `psd_customer_info`;
CREATE TABLE `psd_customer_info` (
  `CUS_ID` varchar(40) NOT NULL,
  `CUS_SORT` varchar(20) DEFAULT NULL,
  `CUS_LEVEL` varchar(20) DEFAULT NULL,
  `CUS_NAME` varchar(30) DEFAULT NULL,
  `CUS_TELE` varchar(20) DEFAULT NULL,
  `CUS_ADS` varchar(255) DEFAULT NULL,
  `CUS_ZIP` varchar(10) DEFAULT NULL,
  `CUS_EMAIL` varchar(40) DEFAULT NULL,
  `CREAT_DATE` varchar(20) DEFAULT NULL,
  `CRTAT_USER` varchar(30) DEFAULT NULL,
  `MODIFY_DATE` varchar(20) DEFAULT NULL,
  `REVISE_USER` varchar(30) DEFAULT NULL,
  `DELET_STATE` int(11) DEFAULT NULL,
  PRIMARY KEY (`CUS_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of psd_customer_info
-- ----------------------------

-- ----------------------------
-- Table structure for `psd_function_list`
-- ----------------------------
DROP TABLE IF EXISTS `psd_function_list`;
CREATE TABLE `psd_function_list` (
  `FUN_ID` varchar(40) NOT NULL,
  `FUN_NAME` varchar(30) DEFAULT NULL,
  `FUN_URL` varchar(255) DEFAULT NULL,
  `PARENT_ID` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`FUN_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of psd_function_list
-- ----------------------------

-- ----------------------------
-- Table structure for `psd_function_role`
-- ----------------------------
DROP TABLE IF EXISTS `psd_function_role`;
CREATE TABLE `psd_function_role` (
  `ROW_ID` varchar(40) NOT NULL,
  `FUN_ID` varchar(40) DEFAULT NULL,
  `ROLE_ID` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`ROW_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of psd_function_role
-- ----------------------------

-- ----------------------------
-- Table structure for `psd_give_info2`
-- ----------------------------
DROP TABLE IF EXISTS `psd_give_info2`;
CREATE TABLE `psd_give_info2` (
  `PRODUCT_ID` varchar(80) NOT NULL,
  `PRODUCT_NAME` varchar(80) DEFAULT NULL,
  `GIVEINFO_NUMBER` int(80) DEFAULT NULL,
  `CREAT_DATE` varchar(80) DEFAULT NULL,
  `CRTAT_USER` varchar(80) DEFAULT NULL,
  `MODIFY_DATE` varchar(80) DEFAULT NULL,
  `REVISE_USER` varchar(80) DEFAULT NULL,
  `DELET_STATE` varchar(80) DEFAULT NULL,
  `SALSTRATEGY_GOODS` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`PRODUCT_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of psd_give_info2
-- ----------------------------

-- ----------------------------
-- Table structure for `psd_give_list2`
-- ----------------------------
DROP TABLE IF EXISTS `psd_give_list2`;
CREATE TABLE `psd_give_list2` (
  `ROW_ID` varchar(40) NOT NULL,
  `PRODUCT_ID` varchar(80) DEFAULT NULL,
  `LIST_DATE` varchar(80) DEFAULT NULL,
  `GIVE_STATE` varchar(80) DEFAULT NULL,
  `CREAT_DATE` varchar(80) DEFAULT NULL,
  `CRTAT_USER` varchar(80) DEFAULT NULL,
  `MODIFY_DATE` varchar(80) DEFAULT NULL,
  `REVISE_USER` varchar(80) DEFAULT NULL,
  `DELET_STATE` varchar(80) DEFAULT NULL,
  PRIMARY KEY (`ROW_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of psd_give_list2
-- ----------------------------

-- ----------------------------
-- Table structure for `psd_order_purchase`
-- ----------------------------
DROP TABLE IF EXISTS `psd_order_purchase`;
CREATE TABLE `psd_order_purchase` (
  `ROW_ID` varchar(40) NOT NULL,
  `ORDER_ID` varchar(80) DEFAULT NULL,
  `CUS_ID` varchar(80) DEFAULT NULL,
  `WAREHOUSE_ID` varchar(80) DEFAULT NULL,
  `OPERATOR_ID` varchar(80) DEFAULT NULL,
  `PRODUCT_ID` int(11) DEFAULT NULL,
  `LIST_REMARKS` varchar(80) DEFAULT NULL,
  `ORDER_TOTAL` int(11) DEFAULT NULL,
  `ORDER_STATE` varchar(80) DEFAULT NULL,
  `CREAT_DATE` varchar(80) DEFAULT NULL,
  `CRTAT_USER` varchar(80) DEFAULT NULL,
  `MODIFY_DATE` varchar(80) DEFAULT NULL,
  `REVISE_USER` varchar(80) DEFAULT NULL,
  `DELET_STATE` varchar(80) DEFAULT NULL,
  `APPROVAL_STATE` int(11) DEFAULT NULL,
  PRIMARY KEY (`ROW_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of psd_order_purchase
-- ----------------------------

-- ----------------------------
-- Table structure for `psd_price_packs2`
-- ----------------------------
DROP TABLE IF EXISTS `psd_price_packs2`;
CREATE TABLE `psd_price_packs2` (
  `SP_ID` varchar(40) NOT NULL,
  `PRODUCT_ID` varchar(80) DEFAULT NULL,
  `PRODUCT_NAME` varchar(80) DEFAULT NULL,
  `PRODUCT_MODEL` varchar(80) DEFAULT NULL,
  `PRODUCT_NUMBE` int(80) DEFAULT NULL,
  `PRODUCT_PRICE` varchar(80) DEFAULT NULL,
  `TOTAL_MONEY` int(80) DEFAULT NULL,
  `CREAT_DATE` varchar(80) DEFAULT NULL,
  `CRTAT_USER` varchar(80) DEFAULT NULL,
  `MODIFY_DATE` varchar(80) DEFAULT NULL,
  `REVISE_USER` varchar(80) DEFAULT NULL,
  `DELET_STATE` varchar(80) DEFAULT NULL,
  PRIMARY KEY (`SP_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of psd_price_packs2
-- ----------------------------

-- ----------------------------
-- Table structure for `psd_product_list`
-- ----------------------------
DROP TABLE IF EXISTS `psd_product_list`;
CREATE TABLE `psd_product_list` (
  `ROW_ID` varchar(40) NOT NULL,
  `PROLIST_ID` varchar(40) DEFAULT NULL,
  `PRODUCT_ID` varchar(40) DEFAULT NULL,
  `STOCK_CHECK` varchar(80) NOT NULL,
  `PRODUCT_NAME` varchar(80) DEFAULT NULL,
  `PRODUCT_MODEL` varchar(80) DEFAULT NULL,
  `STOCK_NUMBER` int(11) DEFAULT NULL,
  `STOCK_AVEPRICE` varchar(80) DEFAULT NULL,
  `STOCK_BATCH` varchar(80) DEFAULT NULL,
  `STOCK_BATCHNUMB` varchar(80) DEFAULT NULL,
  `PRODUCT_DATE` varchar(80) DEFAULT NULL,
  `STOCK_CREATDATE` varchar(80) DEFAULT NULL,
  `STOCK_CRTATOR` varchar(80) DEFAULT NULL,
  `STOCK_MODIFYDATE` varchar(80) DEFAULT NULL,
  `STOCK_REVISER` varchar(80) DEFAULT NULL,
  `DELET_STATE` varchar(80) DEFAULT NULL,
  `APPROVAL_STATE` varchar(80) DEFAULT NULL,
  PRIMARY KEY (`ROW_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of psd_product_list
-- ----------------------------

-- ----------------------------
-- Table structure for `psd_product_sort`
-- ----------------------------
DROP TABLE IF EXISTS `psd_product_sort`;
CREATE TABLE `psd_product_sort` (
  `PRODUCT_ID` varchar(40) NOT NULL,
  `PRODUCT_NAME` varchar(30) DEFAULT NULL,
  `PRODUCT_FASORT` varchar(40) DEFAULT NULL,
  `PRODUCT_SONSORT` int(11) DEFAULT NULL,
  `CREAT_DATE` varchar(20) DEFAULT NULL,
  `CRTAT_USER` varchar(30) DEFAULT NULL,
  `MODIFY_DATE` varchar(20) DEFAULT NULL,
  `REVISE_USER` varchar(30) DEFAULT NULL,
  `DELET_STATE` int(11) DEFAULT NULL,
  `CATEGORY_COE` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`PRODUCT_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of psd_product_sort
-- ----------------------------

-- ----------------------------
-- Table structure for `psd_role_cus`
-- ----------------------------
DROP TABLE IF EXISTS `psd_role_cus`;
CREATE TABLE `psd_role_cus` (
  `ROW_ID` varchar(40) NOT NULL,
  `USER_ID` varchar(40) DEFAULT NULL,
  `ROLE_ID` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`ROW_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of psd_role_cus
-- ----------------------------

-- ----------------------------
-- Table structure for `psd_role_list`
-- ----------------------------
DROP TABLE IF EXISTS `psd_role_list`;
CREATE TABLE `psd_role_list` (
  `ROLE_ID` varchar(40) NOT NULL,
  `ROLE_NAME` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`ROLE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of psd_role_list
-- ----------------------------

-- ----------------------------
-- Table structure for `psd_sales_slip`
-- ----------------------------
DROP TABLE IF EXISTS `psd_sales_slip`;
CREATE TABLE `psd_sales_slip` (
  `ROW_ID` varchar(40) NOT NULL,
  `SALORDER_ID` varchar(80) DEFAULT NULL,
  `CUS_ID` varchar(80) DEFAULT NULL,
  `SALES_NAME` varchar(80) DEFAULT NULL,
  `WAREHOUSE_ID` varchar(80) DEFAULT NULL,
  `SHIPLIST_ID` int(11) DEFAULT NULL,
  `SALES_BEFOMONEY` int(11) DEFAULT NULL,
  `SALES_DISCOUNT` varchar(80) DEFAULT NULL,
  `SALES_COUPONMONEY` int(11) DEFAULT NULL,
  `SALES_REMARKS` varchar(80) DEFAULT NULL,
  `SALES_STATE` varchar(80) DEFAULT NULL,
  `CREAT_DATE` varchar(80) DEFAULT NULL,
  `CRTAT_USER` varchar(80) DEFAULT NULL,
  `MODIFY_DATE` varchar(80) DEFAULT NULL,
  `REVISE_USER` varchar(80) DEFAULT NULL,
  `DELET_STAT` varchar(80) DEFAULT NULL,
  `APPROVAL_STATE` int(11) DEFAULT NULL,
  PRIMARY KEY (`ROW_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of psd_sales_slip
-- ----------------------------

-- ----------------------------
-- Table structure for `psd_sales_strategy2`
-- ----------------------------
DROP TABLE IF EXISTS `psd_sales_strategy2`;
CREATE TABLE `psd_sales_strategy2` (
  `ROW_ID` varchar(40) NOT NULL,
  `SALS_ID` varchar(40) DEFAULT NULL,
  `START_DATE` varchar(80) DEFAULT NULL,
  `END_DATE` varchar(80) DEFAULT NULL,
  `SALSLIST_ID` varchar(80) DEFAULT NULL,
  `CREAT_DATE` varchar(80) DEFAULT NULL,
  `CRTAT_USER` varchar(80) DEFAULT NULL,
  `MODIFY_DATE` varchar(80) DEFAULT NULL,
  `REVISE_USER` varchar(80) DEFAULT NULL,
  `DELET_STATE` varchar(80) DEFAULT NULL,
  PRIMARY KEY (`ROW_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of psd_sales_strategy2
-- ----------------------------

-- ----------------------------
-- Table structure for `psd_salstrategy_list2`
-- ----------------------------
DROP TABLE IF EXISTS `psd_salstrategy_list2`;
CREATE TABLE `psd_salstrategy_list2` (
  `SALS_ID` varchar(40) NOT NULL,
  `PRODUCT_ID` varchar(80) DEFAULT NULL,
  `SALSTRATEGY_GOODS` varchar(40) DEFAULT NULL,
  `SALSTRATEGY_VOUCHER` varchar(80) DEFAULT NULL,
  `SALSTRATEGY_DISCOUNT` varchar(80) DEFAULT NULL,
  `CREAT_DATE` varchar(80) DEFAULT NULL,
  `CRTAT_USER` varchar(80) DEFAULT NULL,
  `MODIFY_DATE` varchar(80) DEFAULT NULL,
  `REVISE_USER` varchar(80) DEFAULT NULL,
  `DELET_STATE` varchar(80) DEFAULT NULL,
  `SP_ID` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`SALS_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of psd_salstrategy_list2
-- ----------------------------

-- ----------------------------
-- Table structure for `psd_ship_list`
-- ----------------------------
DROP TABLE IF EXISTS `psd_ship_list`;
CREATE TABLE `psd_ship_list` (
  `SHIPLIST_ID` varchar(40) NOT NULL,
  `PRODUCT_ID` varchar(80) DEFAULT NULL,
  `PRODUCT_NAME` varchar(80) DEFAULT NULL,
  `PRODUCT_MODEL` varchar(80) DEFAULT NULL,
  `PRODUCT_NUMBE` varchar(80) DEFAULT NULL,
  `PRODUCT_PRICE` int(11) DEFAULT NULL,
  `TOTAL_MONEY` int(11) DEFAULT NULL,
  `PRODUCT_REMARKS` varchar(80) DEFAULT NULL,
  `CREAT_DATE` varchar(80) DEFAULT NULL,
  `CRTAT_USER` varchar(80) DEFAULT NULL,
  `MODIFY_DATE` varchar(80) DEFAULT NULL,
  `REVISE_USER` varchar(80) DEFAULT NULL,
  `DELET_STATE` varchar(80) DEFAULT NULL,
  PRIMARY KEY (`SHIPLIST_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of psd_ship_list
-- ----------------------------

-- ----------------------------
-- Table structure for `psd_stock_info`
-- ----------------------------
DROP TABLE IF EXISTS `psd_stock_info`;
CREATE TABLE `psd_stock_info` (
  `PROLIST_ID` varchar(40) NOT NULL,
  `STOCK_CHECK` varchar(80) DEFAULT NULL,
  `STOCK_CREATDATE` varchar(80) DEFAULT NULL,
  `STOCK_CRTATOR` varchar(80) DEFAULT NULL,
  `STOCK_MODIFYDATE` varchar(80) DEFAULT NULL,
  `STOCK_REVISER` varchar(80) DEFAULT NULL,
  `DELET_STATE` varchar(80) DEFAULT NULL,
  `APPROVAL_STATE` varchar(80) DEFAULT NULL,
  PRIMARY KEY (`PROLIST_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of psd_stock_info
-- ----------------------------

-- ----------------------------
-- Table structure for `psd_user_info`
-- ----------------------------
DROP TABLE IF EXISTS `psd_user_info`;
CREATE TABLE `psd_user_info` (
  `USER_ID` varchar(40) NOT NULL,
  `USER_PSD` varchar(20) DEFAULT NULL,
  `USER_NAME` varchar(30) DEFAULT NULL,
  `USER_ROLE` varchar(100) DEFAULT NULL,
  `CREAT_DATE` varchar(20) DEFAULT NULL,
  `CRTAT_USER` varchar(30) DEFAULT NULL,
  `MODIFY_DATE` varchar(20) DEFAULT NULL,
  `REVISE_USER` varchar(30) DEFAULT NULL,
  `DELET_STATE` int(11) DEFAULT NULL,
  PRIMARY KEY (`USER_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of psd_user_info
-- ----------------------------

-- ----------------------------
-- Table structure for `psd_warehouse_goods`
-- ----------------------------
DROP TABLE IF EXISTS `psd_warehouse_goods`;
CREATE TABLE `psd_warehouse_goods` (
  `WAREGOODS_ID` varchar(40) NOT NULL,
  `PRODUCT_ID` varchar(40) DEFAULT NULL,
  `PRODUCT_NAME` varchar(80) DEFAULT NULL,
  `PRODUCT_MODEL` varchar(80) DEFAULT NULL,
  `PRODUCT_NUMBE` int(11) DEFAULT NULL,
  `PRODUCT_PRICE` int(11) DEFAULT NULL,
  `TOTAL_MONEY` int(11) DEFAULT NULL,
  `WAREGOODS_REMARKS` varchar(80) DEFAULT NULL,
  `CREAT_DATE` varchar(80) DEFAULT NULL,
  `CRTAT_USER` varchar(80) DEFAULT NULL,
  `MODIFY_DATE` varchar(80) DEFAULT NULL,
  `REVISE_USER` varchar(80) DEFAULT NULL,
  `DELET_STATE` varchar(80) DEFAULT NULL,
  PRIMARY KEY (`WAREGOODS_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of psd_warehouse_goods
-- ----------------------------
