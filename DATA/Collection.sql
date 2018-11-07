-- auto-generated definition
create table collection
(
  ID      int auto_increment
    primary key,
  symbol  char(3)                   null,
  content varchar(255) charset utf8 null
);