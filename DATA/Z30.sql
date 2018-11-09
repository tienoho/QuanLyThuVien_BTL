-- auto-generated definition
create table z30
(
  Z30_BARCODE                char(30)                  not null
    primary key,
  Z30_REC_KEY                char(15)                  not null,
  Z30_SUB_LIBRARY            char(5)                   null,
  Z30_MATERIAL               char(5)                   null,
  Z30_ITEM_STATUS            char(2)                   null,
  Z30_UPDATE_DATE            char(10)                  null,
  Z30_CATALOGER              char(10)                  null,
  Z30_DATE_LAST_RETURN       char(8)                   null,
  Z30_HOUR_LAST_RETURN       char(4)                   null,
  Z30_NO_LOANS               int                       null,
  Z30_COLLECTION             char(5)                   null,
  Z30_DESCRIPTION            varchar(200) charset utf8 null,
  Z30_NOTE_OPAC              varchar(200) charset utf8 null,
  Z30_NOTE_CIRCULATION       varchar(200) charset utf8 null,
  Z30_NOTE_INTERNAL          varchar(200) charset utf8 null,
  Z30_ORDER_NUMBER           varchar(30) charset utf8  null,
  Z30_INVENTORY_NUMBER       varchar(20) charset utf8  null,
  Z30_INVENTORY_NUMBER_DATE  char(10)                  null,
  Z30_LAST_SHELF_REPORT_DATE char(10)                  null,
  Z30_PRICE                  char(10)                  null,
  Z30_REC_KEY_2              char(19)                  null,
  Z30_REC_KEY_3              char(40)                  null,
  Z30_PAGES                  varchar(30) charset utf8  null,
  Z30_ISSUE_DATE             char(10)                  null,
  Z30_EXPECTED_ARRIVAL_DATE  char(10)                  null,
  Z30_ARRIVAL_DATE           char(10)                  null,
  Z30_ITEM_STATISTIC         char(10)                  null,
  Z30_ITEM_PROCESS_STATUS    char(2)                   null
);

