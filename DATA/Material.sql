-- auto-generated definition
create table material
(
  ID      int auto_increment
    primary key,
  symbol  char(2)                   null,
  content varchar(255) charset utf8 null
)
  comment 'Loại vật liệu';

