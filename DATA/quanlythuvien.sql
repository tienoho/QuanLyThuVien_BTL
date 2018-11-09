-- phpMyAdmin SQL Dump
-- version 4.7.9
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 09, 2018 at 09:45 AM
-- Server version: 10.1.30-MariaDB
-- PHP Version: 5.6.34

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `quanlythuvien`
--

-- --------------------------------------------------------

--
-- Table structure for table `block`
--

CREATE TABLE `block` (
  `ID` int(11) NOT NULL,
  `symbol` char(3) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `content` varchar(255) CHARACTER SET utf8 DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `block`
--

INSERT INTO `block` (`ID`, `symbol`, `content`) VALUES
(2, '00', 'Mở'),
(3, '01', 'Khóa');

-- --------------------------------------------------------

--
-- Table structure for table `collection`
--

CREATE TABLE `collection` (
  `ID` int(11) NOT NULL,
  `symbol` char(3) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `content` varchar(255) CHARACTER SET utf8 DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `collection`
--

INSERT INTO `collection` (`ID`, `symbol`, `content`) VALUES
(1, 'GT', 'Giáo Trình'),
(2, 'TK', 'Tham Khảo'),
(3, 'LA', 'Luận án, luận văn'),
(4, 'TD', 'Từ Điển'),
(5, 'BT', 'Báo - Tạp Chí');

-- --------------------------------------------------------

--
-- Table structure for table `gender`
--

CREATE TABLE `gender` (
  `ID` int(11) NOT NULL,
  `symbol` char(3) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `content` varchar(255) CHARACTER SET utf8 DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `gender`
--

INSERT INTO `gender` (`ID`, `symbol`, `content`) VALUES
(1, 'M', 'Male'),
(2, 'F', 'Female');

-- --------------------------------------------------------

--
-- Table structure for table `language`
--

CREATE TABLE `language` (
  `ID` int(11) NOT NULL,
  `symbol` char(3) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `content` varchar(255) CHARACTER SET utf8 DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `language`
--

INSERT INTO `language` (`ID`, `symbol`, `content`) VALUES
(1, 'vie', 'Việt Nam'),
(2, 'eng', 'English'),
(3, 'cn', 'china');

-- --------------------------------------------------------

--
-- Table structure for table `material`
--

CREATE TABLE `material` (
  `ID` int(11) NOT NULL,
  `symbol` char(2) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `content` varchar(255) CHARACTER SET utf8 DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Loại vật liệu';

--
-- Dumping data for table `material`
--

INSERT INTO `material` (`ID`, `symbol`, `content`) VALUES
(1, 'G', 'Giấy'),
(2, 'CD', 'CD');

-- --------------------------------------------------------

--
-- Table structure for table `title`
--

CREATE TABLE `title` (
  `ID` int(11) NOT NULL,
  `symbol` char(5) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `content` varchar(255) CHARACTER SET utf8 DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `title`
--

INSERT INTO `title` (`ID`, `symbol`, `content`) VALUES
(1, 'Ms.', 'Ms.'),
(2, 'Mis', 'Miss'),
(3, 'Mrs.', 'Mistress'),
(4, 'Mr.', 'Mister'),
(5, 'Dr.', 'Doctor'),
(6, 'Prof.', 'Professor');

-- --------------------------------------------------------

--
-- Table structure for table `z00`
--

CREATE TABLE `z00` (
  `Z00_DOC_NUMBER` char(9) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Z00_NO_LINES` int(11) DEFAULT NULL,
  `Z00_DATA_LEN` int(11) DEFAULT NULL,
  `Z00_DATA` longtext COLLATE utf8mb4_unicode_ci
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Bảng ITEM';

--
-- Dumping data for table `z00`
--

INSERT INTO `z00` (`Z00_DOC_NUMBER`, `Z00_NO_LINES`, `Z00_DATA_LEN`, `Z00_DATA`) VALUES
('000000001', 0, 452, '0018LDR  L00132nam^a2200452^a^45000015001  L0000000010046008  L181108s2018^^^^vm^^^^^^^^n^^^000^^^eng^^0012041  L$$aeng0016082  L$$ac$$bccc0027100  L$$aấtcsac$$esadsadsad0056245  L$$aTên nhan đề$$bPhần còn lại cua nhan đề$$cấtcsac0051260  L$$aNăm sản xuất$$bNhà sản xuất$$cNăm sản xuất0052300  L$$aKích thước$$bCác đặc điểm khác$$cKích thước0067650  L$$aThuật ngữ chủ đề tiêu đề $$vĐề mục con hình thức, thể loại0012911  LMaster0008925  LCD0008927  LTK'),
('000000002', 0, 479, '0018LDR  L00132nam^a2200479^a^45000015001  L0000000020046008  L181108s2018^^^^vm^^^^^^^^n^^^000^^^vie^^0012041  L$$avie0036082  L$$ajTextField11$$bjTextField110030100  L$$atên tác giả$$bvai trò0061245  L$$aTên nhan đề$$bPhần còn lại cua nhan đề$$ctên tác giả0051260  L$$aNơi xuất bản$$bNhà sản xuất$$cNăm sản xuất0052300  L$$aKhối lượng$$bCác đặc điểm khác$$cKích thước0067650  L$$aThuật ngữ chủ đề tiêu đề $$vĐề mục con hình thức, thể loại0012911  LMaster0007925  LG0008927  LGT'),
('000000003', 0, 479, '0018LDR  L00132nam^a2200479^a^45000015001  L0000000030046008  L181108s2018^^^^vm^^^^^^^^n^^^000^^^vie^^0012041  L$$avie0036082  L$$ajTextField11$$bjTextField110030100  L$$atên tác giả$$bvai trò0061245  L$$aTên nhan đề$$bPhần còn lại cua nhan đề$$ctên tác giả0051260  L$$aNơi xuất bản$$bNhà sản xuất$$cNăm sản xuất0052300  L$$aKhối lượng$$bCác đặc điểm khác$$cKích thước0067650  L$$aThuật ngữ chủ đề tiêu đề $$vĐề mục con hình thức, thể loại0012911  LMaster0007925  LG0008927  LGT'),
('000000004', 0, 479, '0018LDR  L00132nam^a2200479^a^45000015001  L0000000040046008  L181108s2018^^^^vm^^^^^^^^n^^^000^^^vie^^0012041  L$$avie0036082  L$$ajTextField11$$bjTextField110030100  L$$atên tác giả$$bvai trò0061245  L$$aTên nhan đề$$bPhần còn lại cua nhan đề$$ctên tác giả0051260  L$$aNơi xuất bản$$bNhà sản xuất$$cNăm sản xuất0052300  L$$aKhối lượng$$bCác đặc điểm khác$$cKích thước0067650  L$$aThuật ngữ chủ đề tiêu đề $$vĐề mục con hình thức, thể loại0012911  LMaster0007925  LG0008927  LGT'),
('000000005', 0, 479, '0018LDR  L00132nam^a2200479^a^45000015001  L0000000050046008  L181108s2018^^^^vm^^^^^^^^n^^^000^^^vie^^0012041  L$$avie0036082  L$$ajTextField11$$bjTextField110030100  L$$atên tác giả$$bvai trò0061245  L$$aTên nhan đề$$bPhần còn lại cua nhan đề$$ctên tác giả0051260  L$$aNơi xuất bản$$bNhà sản xuất$$cNăm sản xuất0052300  L$$aKhối lượng$$bCác đặc điểm khác$$cKích thước0067650  L$$aThuật ngữ chủ đề tiêu đề $$vĐề mục con hình thức, thể loại0012911  LMaster0007925  LG0008927  LGT'),
('000000006', 0, 479, '0018LDR  L00132nam^a2200479^a^45000015001  L0000000060046008  L181108s2018^^^^vm^^^^^^^^n^^^000^^^vie^^0012041  L$$avie0036082  L$$ajTextField11$$bjTextField110030100  L$$atên tác giả$$bvai trò0061245  L$$aTên nhan đề$$bPhần còn lại cua nhan đề$$ctên tác giả0051260  L$$aNơi xuất bản$$bNhà sản xuất$$cNăm sản xuất0052300  L$$aKhối lượng$$bCác đặc điểm khác$$cKích thước0067650  L$$aThuật ngữ chủ đề tiêu đề $$vĐề mục con hình thức, thể loại0012911  LMaster0007925  LG0008927  LGT'),
('000000007', 0, 479, '0018LDR  L00132nam^a2200479^a^45000015001  L0000000070046008  L181108s2018^^^^vm^^^^^^^^n^^^000^^^vie^^0012041  L$$avie0036082  L$$ajTextField11$$bjTextField110030100  L$$atên tác giả$$evai trò0061245  L$$aTên nhan đề$$bPhần còn lại cua nhan đề$$ctên tác giả0051260  L$$aNơi xuất bản$$bNhà sản xuất$$cNăm sản xuất0052300  L$$aKhối lượng$$bCác đặc điểm khác$$cKích thước0067650  L$$aThuật ngữ chủ đề tiêu đề $$vĐề mục con hình thức, thể loại0012911  LMaster0007925  LG0008927  LGT');

-- --------------------------------------------------------

--
-- Table structure for table `z00r`
--

CREATE TABLE `z00r` (
  `Z00R_DOC_NUMBER` char(9) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Z00R_TITLE` longtext COLLATE utf8mb4_unicode_ci,
  `Z00R_AUTHOR` varchar(255) CHARACTER SET utf8 DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Bảng Danh mục BIB';

--
-- Dumping data for table `z00r`
--

INSERT INTO `z00r` (`Z00R_DOC_NUMBER`, `Z00R_TITLE`, `Z00R_AUTHOR`) VALUES
('000000001', 'Tên nhan đề', 'ấtcsac'),
('000000002', 'Văn học', 'Lê tiemn');

-- --------------------------------------------------------

--
-- Table structure for table `z30`
--

CREATE TABLE `z30` (
  `Z30_BARCODE` char(30) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Z30_REC_KEY` char(15) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Z30_SUB_LIBRARY` char(5) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `Z30_MATERIAL` char(5) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `Z30_ITEM_STATUS` char(2) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `Z30_UPDATE_DATE` char(10) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `Z30_CATALOGER` char(10) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `Z30_DATE_LAST_RETURN` char(10) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `Z30_NO_LOANS` int(11) DEFAULT NULL,
  `Z30_COLLECTION` char(5) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `Z30_DESCRIPTION` varchar(200) CHARACTER SET utf8 DEFAULT NULL,
  `Z30_ORDER_NUMBER` varchar(30) CHARACTER SET utf8 DEFAULT NULL,
  `Z30_PRICE` char(10) COLLATE utf8mb4_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `z30`
--

INSERT INTO `z30` (`Z30_BARCODE`, `Z30_REC_KEY`, `Z30_SUB_LIBRARY`, `Z30_MATERIAL`, `Z30_ITEM_STATUS`, `Z30_UPDATE_DATE`, `Z30_CATALOGER`, `Z30_DATE_LAST_RETURN`, `Z30_NO_LOANS`, `Z30_COLLECTION`, `Z30_DESCRIPTION`, `Z30_ORDER_NUMBER`, `Z30_PRICE`) VALUES
('000000001-haui-1', '000000001', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('000000001-haui-2', '000000001', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('000000001-haui-3', '000000001', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('000000001-haui-4', '000000001', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('000000002-haui-1', '000000002', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('000000002-haui-2', '000000002', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `z36`
--

CREATE TABLE `z36` (
  `Z36_ID` char(12) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Z36_REC_KEY` char(15) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Z36_BARCODE` char(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Z36_PARTRON_ID` char(9) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Z36_NUMBER` char(9) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Z36_SUB_LIBRARY` char(5) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `Z36_STATUS` char(1) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `Z36_LOAN_DATE` char(10) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `Z36_DUE_DATE` char(10) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `Z36_RETURNED_DATE` char(10) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `Z36_ITEM_STATUS` char(2) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `Z36_NOTE_1` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `Z36_MONEY` decimal(10,0) DEFAULT NULL,
  `Z36_MONEY_FINE` decimal(10,0) DEFAULT NULL,
  `Z36_PROCESS_STATUS` char(10) COLLATE utf8mb4_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Bảng Mượn trả';

--
-- Dumping data for table `z36`
--

INSERT INTO `z36` (`Z36_ID`, `Z36_REC_KEY`, `Z36_BARCODE`, `Z36_PARTRON_ID`, `Z36_NUMBER`, `Z36_SUB_LIBRARY`, `Z36_STATUS`, `Z36_LOAN_DATE`, `Z36_DUE_DATE`, `Z36_RETURNED_DATE`, `Z36_ITEM_STATUS`, `Z36_NOTE_1`, `Z36_MONEY`, `Z36_MONEY_FINE`, `Z36_PROCESS_STATUS`) VALUES
('000000001', '000000002', '000000002-haui-1', '000000002', '1', 'HAUI', 'A', '09/11/2018', '09/11/2018', NULL, NULL, NULL, '0', '0', 'M'),
('000000001', '000000001', '000000001-haui-1', '000000002', '1', 'HAUI', 'A', '09/11/2018', '09/11/2018', NULL, NULL, NULL, '0', '0', 'M');

-- --------------------------------------------------------

--
-- Table structure for table `z36_status`
--

CREATE TABLE `z36_status` (
  `ID` int(11) NOT NULL,
  `symbol` char(1) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `content` varchar(255) CHARACTER SET utf8 DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `z36_status`
--

INSERT INTO `z36_status` (`ID`, `symbol`, `content`) VALUES
(1, 'A', 'Đang mượn'),
(2, 'C', 'Đã Trả'),
(3, 'M', 'Làm Mất');

-- --------------------------------------------------------

--
-- Table structure for table `z303`
--

CREATE TABLE `z303` (
  `Z303_REC_KEY` char(12) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Z303_BARCODE` char(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Z303_NAME_KEY` char(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `Z303_USER_TYPE` char(5) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `Z303_USER_LIBRARY` char(5) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `Z303_OPEN_DATE` char(12) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `Z303_UPDATE_DATE` char(12) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `Z303_CON_LNG` char(3) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `Z303_NAME` varchar(200) CHARACTER SET utf8 DEFAULT NULL,
  `Z303_TITLE` char(10) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `Z303_DELINQ_1` char(2) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `Z303_DELINQ_N_1` varchar(200) CHARACTER SET utf8 DEFAULT NULL,
  `Z303_DELINQ_1_UPDATE_DATE` char(12) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `Z303_DELINQ_1_CAT_NAME` char(12) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `Z303_PROFILE_ID` varchar(12) CHARACTER SET utf8 DEFAULT NULL,
  `Z303_FIELD_1` varchar(200) CHARACTER SET utf8 DEFAULT NULL,
  `Z303_FIELD_2` varchar(200) CHARACTER SET utf8 DEFAULT NULL,
  `Z303_FIELD_3` varchar(200) CHARACTER SET utf8 DEFAULT NULL,
  `Z303_NOTE_1` varchar(200) CHARACTER SET utf8 DEFAULT NULL,
  `Z303_NOTE_2` varchar(200) CHARACTER SET utf8 DEFAULT NULL,
  `Z303_SALUTATION` varchar(100) CHARACTER SET utf8 DEFAULT NULL,
  `Z303_BIRTH_DATE` char(12) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `Z303_PLACE_BIRTH` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `Z303_GENDER` char(12) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `Z303_IMAGE` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `Z303_UPD_TIME_STAMP` char(15) COLLATE utf8mb4_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Bảng Người dùng';

--
-- Dumping data for table `z303`
--

INSERT INTO `z303` (`Z303_REC_KEY`, `Z303_BARCODE`, `Z303_NAME_KEY`, `Z303_USER_TYPE`, `Z303_USER_LIBRARY`, `Z303_OPEN_DATE`, `Z303_UPDATE_DATE`, `Z303_CON_LNG`, `Z303_NAME`, `Z303_TITLE`, `Z303_DELINQ_1`, `Z303_DELINQ_N_1`, `Z303_DELINQ_1_UPDATE_DATE`, `Z303_DELINQ_1_CAT_NAME`, `Z303_PROFILE_ID`, `Z303_FIELD_1`, `Z303_FIELD_2`, `Z303_FIELD_3`, `Z303_NOTE_1`, `Z303_NOTE_2`, `Z303_SALUTATION`, `Z303_BIRTH_DATE`, `Z303_PLACE_BIRTH`, `Z303_GENDER`, `Z303_IMAGE`, `Z303_UPD_TIME_STAMP`) VALUES
('000000001', 'Haui-000000002', 'jTextField1', 'REG', 'HAUI', '09/11/2018', '09/11/2018', 'vie', 'jTextField1', 'Ms.', '00', NULL, NULL, NULL, '11', 'jTextField1', 'jTextField1', 'jTextField1', 'sad', 'sadsa', 'Xin chòa', '01/01/1990', 'jTextField1', 'M', NULL, '09112018090653'),
('000000002', 'Haui-000000002', 'jTextField1', 'REG', 'HAUI', '09/11/2018', '09/11/2018', 'vie', 'jTextField2', 'Ms.', '00', NULL, NULL, NULL, '11', 'jTextField1', 'jTextField1', 'jTextField1', '', 'jTextField1', 'Xin chòa', '01/01/1990', 'jTextField1', 'M', NULL, '09112018101605'),
('000000003', 'Haui-000000003', 'jTextField1', 'REG', 'HAUI', '09/11/2018', '09/11/2018', 'eng', 'jTextField3', 'Mrs.', '01', NULL, NULL, NULL, '11', 'jTextField1', 'jTextField1', 'jTextField1', '', 'jTextField1', 'Xin chòa', '01/01/1990', 'jTextField1', 'F', NULL, '09112018093230'),
('000000005', 'Haui-000000005', 'jTextField1', 'REG', 'HAUI', '09/11/2018', '09/11/2018', 'vie', 'jTextField5', 'Ms.', '00', NULL, NULL, NULL, '11', 'jTextField1', 'jTextField1', 'jTextField1', '', '', 'Xin chòa', '01/01/1990', 'jTextField1', 'M', NULL, '09112018094111'),
('000000006', 'Haui-000000006', 'jTextField1', 'REG', 'HAUI', 'jTextField1', '09/11/2018', 'vie', 'jTextField1', 'Ms.', '00', NULL, NULL, NULL, '11', 'jTextField1', 'jTextField1', 'jTextField1', '', '', 'Xin chòa', '01/01/1990', 'jTextField1', 'M', 'M', '09112018112059'),
('000000007', 'Haui-000000007', 'jTextField1', 'REG', 'HAUI', 'jTextField1', '09/11/2018', 'vie', 'jTextField1', 'Ms.', '00', NULL, NULL, NULL, '11', 'jTextField1', 'jTextField1', 'jTextField1', '', '', 'Xin chòa', '01/01/1990', 'jTextField1', 'M', 'M', '09112018112856'),
('000000008', 'Haui-000000008', 'jTextField1', 'REG', 'HAUI', 'jTextField1', '09/11/2018', 'vie', 'jTextField1', 'Ms.', '00', NULL, NULL, NULL, '11', 'jTextField1', 'jTextField1', 'jTextField1', '', '', 'Xin chòa', '01/01/1990', 'jTextField1', 'M', '2054.jpg', '09112018113114'),
('000000009', 'Haui-000000009', 'jTextField1', 'REG', 'HAUI', 'jTextField1', '09/11/2018', 'vie', 'jTextField1', 'Ms.', '00', NULL, NULL, NULL, '11', 'jTextField1', 'jTextField1', 'jTextField1', '', '', 'Xin chòa', '01/01/1990', 'jTextField1', 'M', 'image3699.jpg', '09112018113227'),
('000000010', 'Haui-000000010', 'jTextField1', 'REG', 'HAUI', 'jTextField1', '09/11/2018', 'vie', 'jTextField1', 'Ms.', '00', NULL, NULL, NULL, '11', 'jTextField1', 'jTextField1', 'jTextField1', '', '', 'Xin chòa', '01/01/1990', 'jTextField1', 'M', 'image4153.jpg', '09112018113727'),
('000000011', 'Haui-000000011', 'jTextField1', 'REG', 'HAUI', 'jTextField1', '09/11/2018', 'vie', 'jTextField1', 'Ms.', '00', NULL, NULL, NULL, '11', 'jTextField1', 'jTextField1', 'jTextField1', '', '', 'Xin chòa', '01/01/1990', 'jTextField1', 'M', 'image11897.jpg', '09112018113837');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `block`
--
ALTER TABLE `block`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `collection`
--
ALTER TABLE `collection`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `gender`
--
ALTER TABLE `gender`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `material`
--
ALTER TABLE `material`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `title`
--
ALTER TABLE `title`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `z00`
--
ALTER TABLE `z00`
  ADD UNIQUE KEY `Z00_Z00_DOC_NUMBER_uindex` (`Z00_DOC_NUMBER`);

--
-- Indexes for table `z30`
--
ALTER TABLE `z30`
  ADD PRIMARY KEY (`Z30_BARCODE`);

--
-- Indexes for table `z36_status`
--
ALTER TABLE `z36_status`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `z303`
--
ALTER TABLE `z303`
  ADD UNIQUE KEY `Z303_Z303_REC_KEY_uindex` (`Z303_REC_KEY`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `block`
--
ALTER TABLE `block`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `collection`
--
ALTER TABLE `collection`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `gender`
--
ALTER TABLE `gender`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `material`
--
ALTER TABLE `material`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `title`
--
ALTER TABLE `title`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `z36_status`
--
ALTER TABLE `z36_status`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
