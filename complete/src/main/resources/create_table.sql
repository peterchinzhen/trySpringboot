CREATE TABLE `t_staff` (
  `pkey` int(11) NOT NULL AUTO_INCREMENT,
  `staff_name` varchar(128) NOT NULL,
  `corp_name` varchar(128) DEFAULT NULL,
  `work_no` varchar(128) DEFAULT NULL,
  `created_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `deleted_at` datetime DEFAULT NULL COMMENT 'deletedAt',
  PRIMARY KEY (`pkey`),
  UNIQUE KEY `t_staff_pkey_uindex` (`pkey`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='スータフテーブル';
