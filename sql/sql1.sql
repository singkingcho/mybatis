
DROP DATABASE mybatis;
CREATE DATABASE mybatis;

USE mybatis;
DROP TABLE IF EXISTS users;
CREATE TABLE users(
  id INT PRIMARY KEY,
  username VARCHAR(32),
  PASSWORD VARCHAR(32)
);

INSERT INTO users VALUES(1,'admin','123');
INSERT INTO users VALUES(2,'admin','123');