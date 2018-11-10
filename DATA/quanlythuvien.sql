-- phpMyAdmin SQL Dump
-- version 4.7.9
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 10, 2018 at 11:14 AM
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
-- Table structure for table `itemstatus`
--

CREATE TABLE `itemstatus` (
  `ID` int(11) NOT NULL,
  `symbol` char(3) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `content` varchar(255) CHARACTER SET utf8 DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `itemstatus`
--

INSERT INTO `itemstatus` (`ID`, `symbol`, `content`) VALUES
  (1, 'RD', 'Sẵn Sàng'),
  (2, 'P', 'Đang xử lý'),
  (3, 'L', 'Mất'),
  (4, 'LO', 'Đang mượn');

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
  (3, 'chi', 'china');

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
  (2, 'CD', 'CD'),
  (3, 'M', 'Đĩa mềm');

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
  ('000000001', 0, 407, '0018LDR  L00132nam^a2200407^a^45000015001  L0000000010046008  L181108s2018^^^^vm^^^^^^^^n^^^000^^^eng^^0012041  L$$aeng0024082  L$$a636.098$$bK58210019100  L$$aKing, G.J.0061245  L$$aReproduction in domesticated Animals. /$$cKing, G.J.0060260  L$$aNetherlands :$$bElsevier Science Publishers,$$c19930027300  L$$a590 p.$$cChăn nuôi0034650  L$$aSEARCA$$vSinh lý,Sinh sản0012911  LMaster0007925  LG0008927  LTK'),
  ('000000002', 0, 517, '0018LDR  L00132nam^a2200517^a^45000015001  L0000000020046008  L181108s2018^^^^vm^^^^^^^^n^^^000^^^vie^^0012041  L$$avie0029082  L$$a636.508 2$$bPHP 19940025100  L$$aPhan Liên Phương0170245  L$$aNghiên cứu các tổ hợp lai đơn giản giữa các dòng khác nhau thuộc bộ giống gà Hybro HV-85 tại xí nghiệp gà giống thịt Tam Đảo :$$bLuận án MST /$$cPhan Liên Phương0063260  L$$aHà Nội :$$bTrường Đại học Nông nghiệp I-Hà Nội,$$c19960025300  L$$a72 Tr. ;$$c24 cm0023650  L$$aChăn nuôi$$vGà0012911  LMaster0007925  LG0008927  LLA'),
  ('000000003', 0, 498, '0018LDR  L00132nam^a2200498^a^45000015001  L0000000030046008  L181108s2018^^^^vm^^^^^^^^n^^^000^^^vie^^0012041  L$$avie0027082  L$$a628.116$$bVUP 20160020100  L$$aVũ Ngọc Phú0146245  L$$aĐánh giá chất lượng nước biển ven bờ vịnh Hạ Long, tỉnh Quảng Ninh :$$bLuận văn Thạc sĩ. Khoa học môi trường: 60.44.03.01 /$$cVũ Ngọc Phú0053260  L$$aH. :$$bHọc viện nông nghiệp Việt Nam$$c2016.0030300  L$$aix,69 Tr. ;$$c27 cm ,0040650  L$$aChất lượng nước biển$$vĐánh giá0012911  LMaster0007925  LG0008927  LGT'),
  ('000000004', 0, 533, '0018LDR  L00132nam^a2200533^a^45000015001  L0000000040046008  L181108s2018^^^^vm^^^^^^^^n^^^000^^^vie^^0012041  L$$avie0027082  L$$a333.337$$bNOH 20170024100  L$$aNông, Quốc Hưng0173245  L$$aĐánh giá việc thực hiện các quyền của người sử dụng đất tại thành phố Lạng Sơn, tỉnh Lạng Sơn :$$bLuận văn thạc sĩ. Quản lý đất đai: 60.85.01.03 /$$cNông, Quốc Hưng0059260  L$$aHà Nội :$$bHọc viện nông nghiệp Việt Nam ,$$c2017.0031300  L$$avi, 89 tr. ;$$c27 cm ,0037650  L$$aQuyền sử dụng đất$$vĐánh giá0012911  LMaster0007925  LG0008927  LTK'),
  ('000000005', 0, 647, '0018LDR  L00132nam^a2200647^a^45000015001  L0000000050046008  L181108s2018^^^^vm^^^^^^^^n^^^000^^^vie^^0012041  L$$avie0027082  L$$a333.337$$bDUD 20170024100  L$$aDương, Văn Dũng0276245  L$$aĐánh giá ảnh hưởng của việc thu hồi đất đến đời sống, việc làm của người dân tại dự án đầu tư xây dựng hạ tầng kỹ thuật khu đô thị và dịch vụ Từ Sơn, phường Đồng Kỵ - thị xã Từ Sơn - tỉnh Bắc Ninh :$$bLuận văn thạc sĩ. Quản lý đất đai: 60.85.01.03 /$$cDương, Văn Dũng0059260  L$$aHà Nội :$$bHọc viện nông nghiệp Việt Nam ,$$c2017.0048300  L$$aix, 97 tr. ;$$b27 cm ,$$c1CD + Phụ lục.0031650  L$$aThu hồi đất$$vBắc Ninh0012911  LMaster0007925  LG0008927  LGT');

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
  ('000000001', 'Reproduction in domesticated Animals. /', 'King, G.J.'),
  ('000000002', 'Nghiên cứu các tổ hợp lai đơn giản giữa các dòng khác nhau thuộc bộ giống gà Hybro HV-85 tại xí nghiệp gà giống thịt Tam Đảo :', 'Phan Liên Phương'),
  ('000000003', 'Đánh giá chất lượng nước biển ven bờ vịnh Hạ Long, tỉnh Quảng Ninh :', 'Vũ Ngọc Phú'),
  ('000000004', 'Đánh giá việc thực hiện các quyền của người sử dụng đất tại thành phố Lạng Sơn, tỉnh Lạng Sơn :', 'Nông, Quốc Hưng'),
  ('000000005', 'Đánh giá ảnh hưởng của việc thu hồi đất đến đời sống, việc làm của người dân tại dự án đầu tư xây dựng hạ tầng kỹ thuật khu đô thị và dịch vụ Từ Sơn, phường Đồng Kỵ - thị xã Từ Sơn - tỉnh Bắc Ninh :', 'Dương, Văn Dũng');

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
  ('000000001-HAUI-1', '000000001', 'HAUI', 'G', 'RD', '10/11/2018', 'MASTER', '', 1, 'GT', '', '', '72000'),
  ('000000001-HAUI-10', '000000001', 'HAUI', 'G', 'RD', '10/11/2018', 'MASTER', '', 1, 'GT', '', '', '72000'),
  ('000000001-HAUI-11', '000000001', 'HAUI', 'G', 'RD', '10/11/2018', 'MASTER', '', 1, 'GT', '', '', '72000'),
  ('000000001-HAUI-2', '000000001', 'HAUI', 'G', 'RD', '10/11/2018', 'MASTER', '', 1, 'GT', '', '', '72000'),
  ('000000001-HAUI-3', '000000001', 'HAUI', 'G', 'RD', '10/11/2018', 'MASTER', '', 1, 'GT', '', '', '72000'),
  ('000000001-HAUI-4', '000000001', 'HAUI', 'G', 'RD', '10/11/2018', 'MASTER', '', 1, 'GT', '', '', '72000'),
  ('000000001-HAUI-5', '000000001', 'HAUI', 'G', 'RD', '10/11/2018', 'MASTER', '', 1, 'GT', '', '', '72000'),
  ('000000001-HAUI-6', '000000001', 'HAUI', 'G', 'RD', '10/11/2018', 'MASTER', '', 1, 'GT', '', '', '72000'),
  ('000000001-HAUI-7', '000000001', 'HAUI', 'G', 'RD', '10/11/2018', 'MASTER', '', 1, 'GT', '', '', '72000'),
  ('000000001-HAUI-8', '000000001', 'HAUI', 'G', 'RD', '10/11/2018', 'MASTER', '', 1, 'GT', '', '', '72000'),
  ('000000001-HAUI-9', '000000001', 'HAUI', 'G', 'RD', '10/11/2018', 'MASTER', '', 1, 'GT', '', '', '72000'),
  ('000000002-HAUI-1', '000000002', 'HAUI', 'G', 'RD', '10/11/2018', 'MASTER', '', 1, 'GT', '', '', '100000'),
  ('000000002-HAUI-10', '000000002', 'HAUI', 'G', 'RD', '10/11/2018', 'MASTER', '', 1, 'GT', '', '', '100000'),
  ('000000002-HAUI-11', '000000002', 'HAUI', 'G', 'RD', '10/11/2018', 'MASTER', '', 1, 'GT', '', '', '100000'),
  ('000000002-HAUI-2', '000000002', 'HAUI', 'G', 'RD', '10/11/2018', 'MASTER', '', 1, 'GT', '', '', '100000'),
  ('000000002-HAUI-3', '000000002', 'HAUI', 'G', 'RD', '10/11/2018', 'MASTER', '', 1, 'GT', '', '', '100000'),
  ('000000002-HAUI-4', '000000002', 'HAUI', 'G', 'RD', '10/11/2018', 'MASTER', '', 1, 'GT', '', '', '100000'),
  ('000000002-HAUI-5', '000000002', 'HAUI', 'G', 'RD', '10/11/2018', 'MASTER', '', 1, 'GT', '', '', '100000'),
  ('000000002-HAUI-6', '000000002', 'HAUI', 'G', 'RD', '10/11/2018', 'MASTER', '', 1, 'GT', '', '', '100000'),
  ('000000002-HAUI-7', '000000002', 'HAUI', 'G', 'RD', '10/11/2018', 'MASTER', '', 1, 'GT', '', '', '100000'),
  ('000000002-HAUI-8', '000000002', 'HAUI', 'G', 'RD', '10/11/2018', 'MASTER', '', 1, 'GT', '', '', '100000'),
  ('000000002-HAUI-9', '000000002', 'HAUI', 'G', 'RD', '10/11/2018', 'MASTER', '', 1, 'GT', '', '', '100000'),
  ('000000003-HAUI-1', '000000003', 'HAUI', 'G', 'RD', '10/11/2018', 'MASTER', '', 1, 'GT', '', '', '150000'),
  ('000000003-HAUI-10', '000000003', 'HAUI', 'G', 'RD', '10/11/2018', 'MASTER', '', 1, 'GT', '', '', '150000'),
  ('000000003-HAUI-2', '000000003', 'HAUI', 'G', 'RD', '10/11/2018', 'MASTER', '', 1, 'GT', '', '', '150000'),
  ('000000003-HAUI-3', '000000003', 'HAUI', 'G', 'RD', '10/11/2018', 'MASTER', '', 1, 'GT', '', '', '150000'),
  ('000000003-HAUI-4', '000000003', 'HAUI', 'G', 'RD', '10/11/2018', 'MASTER', '', 1, 'GT', '', '', '150000'),
  ('000000003-HAUI-5', '000000003', 'HAUI', 'G', 'RD', '10/11/2018', 'MASTER', '', 1, 'GT', '', '', '150000'),
  ('000000003-HAUI-6', '000000003', 'HAUI', 'G', 'RD', '10/11/2018', 'MASTER', '', 1, 'GT', '', '', '150000'),
  ('000000003-HAUI-7', '000000003', 'HAUI', 'G', 'RD', '10/11/2018', 'MASTER', '', 1, 'GT', '', '', '150000'),
  ('000000003-HAUI-8', '000000003', 'HAUI', 'G', 'RD', '10/11/2018', 'MASTER', '', 1, 'GT', '', '', '150000'),
  ('000000003-HAUI-9', '000000003', 'HAUI', 'G', 'RD', '10/11/2018', 'MASTER', '', 1, 'GT', '', '', '150000'),
  ('000000004-HAUI-1', '000000004', 'HAUI', 'G', 'RD', '10/11/2018', 'MASTER', '', 1, 'GT', '', '', '52000'),
  ('000000004-HAUI-10', '000000004', 'HAUI', 'G', 'RD', '10/11/2018', 'MASTER', '', 1, 'GT', '', '', '52000'),
  ('000000004-HAUI-2', '000000004', 'HAUI', 'G', 'RD', '10/11/2018', 'MASTER', '', 1, 'GT', '', '', '52000'),
  ('000000004-HAUI-3', '000000004', 'HAUI', 'G', 'RD', '10/11/2018', 'MASTER', '', 1, 'GT', '', '', '52000'),
  ('000000004-HAUI-4', '000000004', 'HAUI', 'G', 'RD', '10/11/2018', 'MASTER', '', 1, 'GT', '', '', '52000'),
  ('000000004-HAUI-5', '000000004', 'HAUI', 'G', 'RD', '10/11/2018', 'MASTER', '', 1, 'GT', '', '', '52000'),
  ('000000004-HAUI-6', '000000004', 'HAUI', 'G', 'RD', '10/11/2018', 'MASTER', '', 1, 'GT', '', '', '52000'),
  ('000000004-HAUI-7', '000000004', 'HAUI', 'G', 'RD', '10/11/2018', 'MASTER', '', 1, 'GT', '', '', '52000'),
  ('000000004-HAUI-8', '000000004', 'HAUI', 'G', 'RD', '10/11/2018', 'MASTER', '', 1, 'GT', '', '', '52000'),
  ('000000004-HAUI-9', '000000004', 'HAUI', 'G', 'RD', '10/11/2018', 'MASTER', '', 1, 'GT', '', '', '52000'),
  ('000000005-HAUI-1', '000000005', 'HAUI', 'G', 'RD', '10/11/2018', 'MASTER', '', 1, 'GT', '', '', '90200'),
  ('000000005-HAUI-10', '000000005', 'HAUI', 'G', 'RD', '10/11/2018', 'MASTER', '', 1, 'GT', '', '', '90200'),
  ('000000005-HAUI-11', '000000005', 'HAUI', 'G', 'RD', '10/11/2018', 'MASTER', '', 1, 'GT', '', '', '90200'),
  ('000000005-HAUI-2', '000000005', 'HAUI', 'G', 'RD', '10/11/2018', 'MASTER', '', 1, 'GT', '', '', '90200'),
  ('000000005-HAUI-3', '000000005', 'HAUI', 'G', 'RD', '10/11/2018', 'MASTER', '', 1, 'GT', '', '', '90200'),
  ('000000005-HAUI-4', '000000005', 'HAUI', 'G', 'RD', '10/11/2018', 'MASTER', '', 1, 'GT', '', '', '90200'),
  ('000000005-HAUI-5', '000000005', 'HAUI', 'G', 'RD', '10/11/2018', 'MASTER', '', 1, 'GT', '', '', '90200'),
  ('000000005-HAUI-6', '000000005', 'HAUI', 'G', 'RD', '10/11/2018', 'MASTER', '', 1, 'GT', '', '', '90200'),
  ('000000005-HAUI-7', '000000005', 'HAUI', 'G', 'RD', '10/11/2018', 'MASTER', '', 1, 'GT', '', '', '90200'),
  ('000000005-HAUI-8', '000000005', 'HAUI', 'G', 'RD', '10/11/2018', 'MASTER', '', 1, 'GT', '', '', '90200'),
  ('000000005-HAUI-9', '000000005', 'HAUI', 'G', 'RD', '10/11/2018', 'MASTER', '', 1, 'GT', '', '', '90200');

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
  ('000000001', '000000002', '000000002-HAUI-1', '000000001', '1', 'HAUI', 'A', '10/11/2018', '10/11/2018', NULL, 'RD', NULL, '100000', '0', 'M'),
  ('000000001', '000000005', '000000005-HAUI-1', '000000001', '1', 'HAUI', 'A', '10/11/2018', '10/11/2018', NULL, 'RD', NULL, '90200', '0', 'M'),
  ('000000001', '000000002', '000000002-HAUI-2', '000000001', '1', 'HAUI', 'A', '10/11/2018', '10/11/2018', NULL, 'RD', NULL, '100000', '0', 'M'),
  ('000000001', '000000002', '000000002-HAUI-3', '000000001', '1', 'HAUI', 'A', '10/11/2018', '10/11/2018', NULL, 'RD', NULL, '100000', '0', 'M'),
  ('000000001', '000000004', '000000004-HAUI-1', '000000001', '1', 'HAUI', 'A', '10/11/2018', '10/11/2018', NULL, 'RD', NULL, '52000', '0', 'M');

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
  ('000000001', 'HAUI-000000001', 'Lê Văn Tiến', 'REG', 'HAUI', '10/11/2018', '10/11/2018', 'vie', 'Lê Văn Tiến', 'Ms.', '00', NULL, NULL, NULL, '11', '2', '2', '1333', '1', '2', 'Xin chòa', '29/09/1995', 'Thanh hóa', 'M', 'image2900.jpg', '10112018042926'),
  ('000000002', 'HAUI-000000002', 'Nguyễn Quang Trường', 'REG', 'HAUI', '10/11/2018', '10/11/2018', 'vie', 'Nguyễn Quang Trường', 'Mr.', '00', NULL, NULL, NULL, '11', 'z', 'zz', 'zzz', 'zzzz', 'zzzz', 'Xin chòa', '04/10/1996', 'Hà Nội', 'M', '', '10112018050243');

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
-- Indexes for table `itemstatus`
--
ALTER TABLE `itemstatus`
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
-- AUTO_INCREMENT for table `itemstatus`
--
ALTER TABLE `itemstatus`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `material`
--
ALTER TABLE `material`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

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
