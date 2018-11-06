-- bảng mượn trả sách --
-- auto-generated definition
create table Z36
(
  Z36_REC_KEY                CHAR(15) not null,
  Z36_ID                     CHAR(12) not null,
  Z36_NUMBER                 CHAR(9)  not null,
  Z36_MATERIAL               CHAR(5),
  Z36_SUB_LIBRARY            CHAR(5),
  Z36_STATUS                 CHAR,
  Z36_LOAN_DATE              CHAR(8),
  Z36_LOAN_HOUR              CHAR(4),
  Z36_DUE_DATE               CHAR(8),
  Z36_DUE_HOUR               CHAR(4),
  Z36_RETURNED_DATE          CHAR(8),
  Z36_RETURNED_HOUR          CHAR(4),
  Z36_ITEM_STATUS            CHAR(2),
  Z36_NOTE_1                 NVARCHAR(30),
  Z36_PROCESS_STATUS         CHAR(2)
);
CREATE UNIQUE INDEX Z36_Z36_REC_KEY_uindex ON Z36 (Z36_REC_KEY);
ALTER TABLE Z36 COMMENT = 'Bảng Mượn trả';
