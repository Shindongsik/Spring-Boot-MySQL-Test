# Spring-Boot-MySQL-Test
간단한 spring-boot + MySQL 연동 테스트

생성된 테이블에 insert, select 테스트


테이블 생성 쿼리<br/>
CREATE TABLE `blogs` (<br/>
  `id` int(11) NOT NULL AUTO_INCREMENT,<br/>
  `content` varchar(200) NOT NULL,<br/>
  PRIMARY KEY (`id`)<br/>
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


