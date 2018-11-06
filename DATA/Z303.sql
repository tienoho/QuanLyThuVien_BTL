-- Bảng thông tin người dùng--
-- auto-generated definition
create table Z303
(
  Z303_REC_KEY              CHAR(12) not null,
  Z303_NAME_KEY             CHAR(50),
  Z303_USER_TYPE            CHAR(5),
  Z303_USER_LIBRARY         CHAR(5),
  Z303_OPEN_DATE            CHAR(8),
  Z303_UPDATE_DATE          CHAR(8),
  Z303_CON_LNG              CHAR(3),
  Z303_NAME                 NVARCHAR(200),
  Z303_TITLE                CHAR(10),
  Z303_DELINQ_1             CHAR(2),
  Z303_DELINQ_N_1           NVARCHAR(200),
  Z303_DELINQ_1_UPDATE_DATE CHAR(8),
  Z303_DELINQ_1_CAT_NAME    CHAR(10),
  Z303_PROFILE_ID           NVARCHAR(12),
  Z303_FIELD_1              NVARCHAR(200),
  Z303_FIELD_2              NVARCHAR(200),
  Z303_FIELD_3              NVARCHAR(200),
  Z303_NOTE_1               NVARCHAR(200),
  Z303_NOTE_2               NVARCHAR(200),
  Z303_SALUTATION           NVARCHAR(100),
  Z303_BIRTH_DATE           CHAR(8),
  Z303_GENDER               CHAR,
  Z303_UPD_TIME_STAMP       CHAR(15)
);
CREATE UNIQUE INDEX Z303_Z303_REC_KEY_uindex ON Z303 (Z303_REC_KEY);
ALTER TABLE Z303 COMMENT = 'Bảng Người dùng';


