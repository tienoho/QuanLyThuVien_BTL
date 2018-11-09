-- auto-generated definition
create table z36
(
  Z36_REC_KEY        char(15)                  not null,
  Z36_ID             char(12)                  not null,
  Z36_NUMBER         char(9)                   not null,
  Z36_SUB_LIBRARY    char(5)                   null,
  Z36_STATUS         char                      null,
  Z36_LOAN_DATE      char(10)                  null,
  Z36_DUE_DATE       char(10)                  null,
  Z36_RETURNED_DATE  char(10)                  null,
  Z36_ITEM_STATUS    char(2)                   null,
  Z36_NOTE_1         varchar(255) charset utf8 null,
  Z36_MONEY          decimal                   null,
  Z36_MONEY_FINE     decimal                   null,
  Z36_PROCESS_STATUS char(2)                   null,
  constraint Z36_Z36_REC_KEY_uindex
  unique (Z36_REC_KEY)
)
  comment 'Bảng Mượn trả';

