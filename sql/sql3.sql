DROP TABLE IF EXISTS team;
CREATE TABLE team(
  team_id INT(11) PRIMARY KEY,
  team_name VARCHAR(100) NOT NULL
);

DROP TABLE IF EXISTS player;
CREATE TABLE player(
  player_id INT(11) PRIMARY KEY,
  player_name VARCHAR(11),
  team_id INT(11)
);

INSERT INTO team VALUES(1,'骑士队'),(2,'湖人队');

INSERT INTO player VALUES(1,'詹姆斯',1),(2,'韦德',1),(3,'科比',2),(4,'奥尼尔','2');

SELECT t2.`player_name` FROM team t1 , player t2 WHERE t1.`team_id` = t2.`team_id`
AND t1.`team_name` = '骑士队';