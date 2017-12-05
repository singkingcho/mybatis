/*
 * 一个作者，写过多篇博客
 * 一篇博客，有多个评论
 * */
-- 作者表
drop table if exists author;
create table author(
  id int(11) primary key,
  username varchar(32) ,
  password varchar(32)  
 
);

-- 博客表
drop table if exists blog;
create table blog(
  id int(11) primary key,
  title varchar(255),
  content varchar(10000),
  author_id   int(11)

);
-- 评论表
drop table if exists comment;
create table comment(
  id int(11) primary key,
  content varchar(10000),
  blog_id int(11)
);


insert into author values(1,'王菲','123'),(2,'韩雪','123abc'),(3,'陈慧琳','bbsds1'),(4,'李小龙','xiloollll123');

insert into blog values
(1,'容易受伤的女人','真的受伤啊，很大的伤害啊1',1),
(2,'容易受伤的男人','真的受伤啊，很大的伤害啊2',1),
(3,'容易受伤的好人','真的受伤啊，很大的伤害啊3',2),
(4,'容易受伤的坏人','真的受伤啊，很大的伤害啊4',2),
(5,'今晚打老虎','喝酒再大虎',3),
(6,'今晚吃火锅','吃火锅有益于身心健康',3),
(7,'今晚搓麻将','大四喜，中',4),
(8,'今晚你懂得','不要欺负我懂得少',5);


insert into comment values
(1,'确实啊确实',1),
(2,'痛啊痛',1),
(3,'这位同志你。。。',2),
(4,'好人难当啊',3),
(5,'坏起来，为新的力量喝彩',4),
(6,'打得过吗',5),
(7,'多放点酱油',6),
(8,'没钱了，跑路了',7),
(9,'几个意思？',8),
(10,'想晃点我，不可能的',8);
							
 
