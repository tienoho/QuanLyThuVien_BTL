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
  Z303_BUDGET               VARCHAR2(50),
  Z303_PROFILE_ID           VARCHAR2(12),
  Z303_ILL_LIBRARY          VARCHAR2(20),
  Z303_HOME_LIBRARY         CHAR(5),
  Z303_FIELD_1              VARCHAR2(200),
  Z303_FIELD_2              VARCHAR2(200),
  Z303_FIELD_3              VARCHAR2(200),
  Z303_NOTE_1               VARCHAR2(200),
  Z303_NOTE_2               VARCHAR2(200),
  Z303_SALUTATION           VARCHAR2(100),
  Z303_ILL_TOTAL_LIMIT      NUMBER(4),
  Z303_ILL_ACTIVE_LIMIT     NUMBER(4),
  Z303_DISPATCH_LIBRARY     CHAR(5),
  Z303_BIRTH_DATE           NUMBER(8),
  Z303_EXPORT_CONSENT       CHAR,
  Z303_PROXY_ID_TYPE        NUMBER(2),
  Z303_SEND_ALL_LETTERS     CHAR,
  Z303_PLAIN_HTML           CHAR,
  Z303_WANT_SMS             CHAR,
  Z303_PLIF_MODIFICATION    VARCHAR2(50),
  Z303_TITLE_REQ_LIMIT      NUMBER(4),
  Z303_GENDER               CHAR,
  Z303_BIRTHPLACE           VARCHAR2(30),
  Z303_UPD_TIME_STAMP       CHAR(15),
  Z303_LAST_NAME            VARCHAR2(100),
  Z303_FIRST_NAME           VARCHAR2(100)
)
  /

create unique index Z303_ID
  on Z303 (Z303_REC_KEY)
  /

