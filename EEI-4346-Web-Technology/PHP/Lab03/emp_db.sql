-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Nov 09, 2024 at 02:40 PM
-- Server version: 8.3.0
-- PHP Version: 8.2.18

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `emp_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `emp_country`
--

DROP TABLE IF EXISTS `emp_country`;
CREATE TABLE IF NOT EXISTS `emp_country` (
  `EMP_ID` int NOT NULL,
  `EMP_Country` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`EMP_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Table structure for table `emp_dept`
--

DROP TABLE IF EXISTS `emp_dept`;
CREATE TABLE IF NOT EXISTS `emp_dept` (
  `EMP_DEPT` varchar(30) NOT NULL,
  `DEPT_TYPE` varchar(40) DEFAULT NULL,
  `EMP_DEPT_NO` int DEFAULT NULL,
  PRIMARY KEY (`EMP_DEPT`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `emp_dept`
--

INSERT INTO `emp_dept` (`EMP_DEPT`, `DEPT_TYPE`, `EMP_DEPT_NO`) VALUES
('PHP', 'admin', 12);

-- --------------------------------------------------------

--
-- Table structure for table `emp_dept_map`
--

DROP TABLE IF EXISTS `emp_dept_map`;
CREATE TABLE IF NOT EXISTS `emp_dept_map` (
  `EMP_ID` int NOT NULL,
  `EMP_DEPT` varchar(30) NOT NULL,
  PRIMARY KEY (`EMP_ID`,`EMP_DEPT`),
  KEY `EMP_DEPT` (`EMP_DEPT`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `emp_dept_map`
--
ALTER TABLE `emp_dept_map`
  ADD CONSTRAINT `emp_dept_map_ibfk_1` FOREIGN KEY (`EMP_ID`) REFERENCES `emp_country` (`EMP_ID`),
  ADD CONSTRAINT `emp_dept_map_ibfk_2` FOREIGN KEY (`EMP_DEPT`) REFERENCES `emp_dept` (`EMP_DEPT`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
