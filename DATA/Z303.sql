-- auto-generated definition
create table z303
(
  Z303_REC_KEY              char(12)                  not null,
  Z303_BARCODE              char(100)                 not null,
  Z303_NAME_KEY             char(50)                  null,
  Z303_USER_TYPE            char(5)                   null,
  Z303_USER_LIBRARY         char(5)                   null,
  Z303_OPEN_DATE            char(12)                  null,
  Z303_UPDATE_DATE          char(12)                  null,
  Z303_CON_LNG              char(3)                   null,
  Z303_NAME                 varchar(200) charset utf8 null,
  Z303_TITLE                char(10)                  null,
  Z303_DELINQ_1             char(2)                   null,
  Z303_DELINQ_N_1           varchar(200) charset utf8 null,
  Z303_DELINQ_1_UPDATE_DATE char(12)                  null,
  Z303_DELINQ_1_CAT_NAME    char(12)                  null,
  Z303_PROFILE_ID           varchar(12) charset utf8  null,
  Z303_FIELD_1              varchar(200) charset utf8 null,
  Z303_FIELD_2              varchar(200) charset utf8 null,
  Z303_FIELD_3              varchar(200) charset utf8 null,
  Z303_NOTE_1               varchar(200) charset utf8 null,
  Z303_NOTE_2               varchar(200) charset utf8 null,
  Z303_SALUTATION           varchar(100) charset utf8 null,
  Z303_BIRTH_DATE           char(12)                  null,
  Z303_PLACE_BIRTH          varchar(255) charset utf8 null,
  Z303_GENDER               char(12)                  null,
  Z303_UPD_TIME_STAMP       char(15)                  null,
  constraint Z303_Z303_REC_KEY_uindex
  unique (Z303_REC_KEY)
)
  comment 'Bảng Người dùng';

