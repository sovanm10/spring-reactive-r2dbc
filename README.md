# spring-reactive-r2dbc

Create Table command: 

CREATE TABLE medsdb.`item` (
`id` bigint NOT NULL AUTO_INCREMENT,
`brand` varchar(255) DEFAULT NULL,
`name` varchar(255) DEFAULT NULL,
PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


Data Insert Command:

INSERT INTO `medsdb`.`item`
(`id`,
`brand`,
`name`)
VALUES
(3,
'B',
'N');
