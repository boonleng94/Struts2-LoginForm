CREATE SCHEMA `cz3002_db` ;
CREATE TABLE `cz3002_db`.`users` (
  `username` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`username`));
INSERT INTO `cz3002_db`.`users` (`username`, `password`) VALUES ('cz3002', 'cz3002');
