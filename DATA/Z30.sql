-- auto-generated definition
create table Z30
(
  Z30_REC_KEY                CHAR(15) not null,
  Z30_BARCODE                CHAR(30),
  Z30_SUB_LIBRARY            CHAR(5),
  Z30_MATERIAL               CHAR(5),
  Z30_ITEM_STATUS            CHAR(2),
  Z30_OPEN_DATE              CHAR(8),
  Z30_UPDATE_DATE            CHAR(8),
  Z30_CATALOGER              CHAR(10),
  Z30_DATE_LAST_RETURN       CHAR(8),
  Z30_HOUR_LAST_RETURN       CHAR(4),
  Z30_NO_LOANS               int,
  Z30_ALPHA                  CHAR,
  Z30_COLLECTION             CHAR(5),
  Z30_CALL_NO_TYPE           CHAR,
  Z30_CALL_NO                NVARCHAR(80),
  Z30_CALL_NO_KEY            CHAR(80),
  Z30_DESCRIPTION            NVARCHAR(200),
  Z30_NOTE_OPAC              NVARCHAR(200),
  Z30_NOTE_CIRCULATION       NVARCHAR(200),
  Z30_NOTE_INTERNAL          NVARCHAR(200),
  Z30_ORDER_NUMBER           NVARCHAR(30),
  Z30_INVENTORY_NUMBER       NVARCHAR(20),
  Z30_INVENTORY_NUMBER_DATE  CHAR(8),
  Z30_LAST_SHELF_REPORT_DATE CHAR(8),
  Z30_PRICE                  CHAR(10),
  Z30_REC_KEY_2              CHAR(19),
  Z30_REC_KEY_3              CHAR(40),
  Z30_PAGES                  NVARCHAR(30),
  Z30_ISSUE_DATE             CHAR(8),
  Z30_EXPECTED_ARRIVAL_DATE  CHAR(8),
  Z30_ARRIVAL_DATE           CHAR(8),
  Z30_ITEM_STATISTIC         CHAR(10),
  Z30_ITEM_PROCESS_STATUS    CHAR(2),
  Z30_HOL_DOC_NUMBER_X       CHAR(9)
);
CREATE UNIQUE INDEX Z30_Z30_REC_KEY_uindex ON Z30 (Z30_REC_KEY);
ALTER TABLE Z00 COMMENT = 'Bảng ITEM';


