-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Dec 27, 2016 at 12:39 PM
-- Server version: 10.1.16-MariaDB
-- PHP Version: 7.0.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bus_ticket_management`
--

-- --------------------------------------------------------

--
-- Table structure for table `bookedticket`
--

CREATE TABLE `bookedticket` (
  `bid` varchar(20) DEFAULT NULL,
  `Pid` varchar(20) DEFAULT NULL,
  `SeatAvailable` varchar(20) DEFAULT NULL,
  `BookedDate` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bookedticket`
--

INSERT INTO `bookedticket` (`bid`, `Pid`, `SeatAvailable`, `BookedDate`) VALUES
('1010', '2', '1', '10/10/2016');

-- --------------------------------------------------------

--
-- Table structure for table `bus`
--

CREATE TABLE `bus` (
  `Bid` varchar(20) NOT NULL,
  `BusType` varchar(50) NOT NULL,
  `FromWhere` varchar(30) NOT NULL,
  `ToWhere` varchar(20) NOT NULL,
  `Dept.Time` varchar(20) NOT NULL,
  `Arr.Time` varchar(20) NOT NULL,
  `SeatAvailable` int(11) NOT NULL,
  `Available` int(11) NOT NULL,
  `Price` int(11) NOT NULL,
  `position` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bus`
--

INSERT INTO `bus` (`Bid`, `BusType`, `FromWhere`, `ToWhere`, `Dept.Time`, `Arr.Time`, `SeatAvailable`, `Available`, `Price`, `position`) VALUES
('1010', 'Buisness Class', 'Dhaka', 'Rangpur', '10.00', '4.00', 38, 0, 800, 'Available'),
('1011', 'Buisness Class', 'Dhaka', 'Rangpur', '3.00', '9.00', 38, 0, 800, 'Available(today)'),
('1012', 'Buisness Class', 'Dhaka', 'syllet', '3.00', '9.00', 38, 0, 800, 'Available'),
('1013', 'Buisness Class', 'Dhaka', 'syllet', '10.00', '4.00', 38, 0, 800, 'Available'),
('2020', 'Economy Class', 'Dhaka', 'Rangpur', '10.00', '4.00', 38, 0, 600, 'Available'),
('2021', 'Economy Class', 'Dhaka', 'Rangpur', '3.00', '9.00', 38, 0, 600, 'Available'),
('2023', 'Economy Class', 'Dhaka', 'syllet', '10.00', '4.00', 38, 0, 600, 'Available'),
('2024', 'Economy Class', 'Dhaka', 'syllet', '3.00', '9.00', 38, 0, 600, 'Available'),
('3030', 'Local Class', 'Dhaka', 'mymensingh', '10.00', '1.00', 38, 0, 300, 'Available');

-- --------------------------------------------------------

--
-- Table structure for table `busreturn`
--

CREATE TABLE `busreturn` (
  `Bid` varchar(20) NOT NULL,
  `BusType` varchar(50) NOT NULL,
  `FromWhere` varchar(20) NOT NULL,
  `ToWhere` varchar(20) NOT NULL,
  `Dept.Time` varchar(20) NOT NULL,
  `Arr.Time` varchar(20) NOT NULL,
  `SeatAvailable` int(11) NOT NULL,
  `Available` int(11) NOT NULL,
  `Price` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `busreturn`
--

INSERT INTO `busreturn` (`Bid`, `BusType`, `FromWhere`, `ToWhere`, `Dept.Time`, `Arr.Time`, `SeatAvailable`, `Available`, `Price`) VALUES
('1010', 'Buisness Class', 'Rangpur', 'Dhaka', '10.00', '4.00', 38, 0, 800),
('1011', 'Buisness Class', 'Rangpur', 'Dhaka', '3.00', '9.00', 38, 0, 800),
('1012', 'Buisness Class', 'Syllet', 'Dhaka', '10.00', '4.00', 38, 0, 800),
('1013', 'Buisness Class', 'Syllet', 'Dhaka', '3.00', '9.00', 38, 0, 800);

-- --------------------------------------------------------

--
-- Table structure for table `chooseseat`
--

CREATE TABLE `chooseseat` (
  `Bid` varchar(20) DEFAULT NULL,
  `DATE` varchar(20) DEFAULT NULL,
  `selectedseat` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `chooseseat`
--

INSERT INTO `chooseseat` (`Bid`, `DATE`, `selectedseat`) VALUES
('2020', '29-12-2016', 'A1'),
('1013', '30-12-2016', 'A13'),
('2020', '29-12-2016', 'B10'),
('1013', '29-12-2016', 'A10'),
('1010', '16-12-2016', 'B4'),
('1010', '14-12-2016', 'A6'),
('1010', '14-12-2016', 'B13'),
('1010', '29-12-2016', 'B2'),
('1010', '29-12-2016', 'B11');

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `EmpId` varchar(20) NOT NULL,
  `UserName` varchar(20) NOT NULL,
  `Mobile` varchar(20) NOT NULL,
  `EmpType` varchar(20) NOT NULL,
  `Password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`EmpId`, `UserName`, `Mobile`, `EmpType`, `Password`) VALUES
('101', 'Reza', '01750425444', 'Manager', 'rezwan10'),
('102', 'Mijan', '01728030032', 'Seller', 'mijan10');

-- --------------------------------------------------------

--
-- Table structure for table `passenger`
--

CREATE TABLE `passenger` (
  `Pid` varchar(20) NOT NULL,
  `Bid` varchar(20) NOT NULL,
  `Name` varchar(20) NOT NULL,
  `Mobile` varchar(20) NOT NULL,
  `Email` varchar(30) NOT NULL,
  `FromWhere` varchar(20) DEFAULT NULL,
  `ToWhere` varchar(20) DEFAULT NULL,
  `JourneyDate` varchar(20) DEFAULT NULL,
  `seatno` varchar(20) DEFAULT NULL,
  `price` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `passenger`
--

INSERT INTO `passenger` (`Pid`, `Bid`, `Name`, `Mobile`, `Email`, `FromWhere`, `ToWhere`, `JourneyDate`, `seatno`, `price`) VALUES
('10', '1010', 'Mustak', '01688153856', 'mustak@outlook.com', 'Dhaka', 'Rangpur', '29-12-2016', ' B2B11', 1600),
('2', '1011', 'Mijan', '01728030032', 'mijan@gmail.com', NULL, NULL, NULL, NULL, NULL),
('3', '2020', 'reza', '7892', 'yta@gmail.com', 'Dhaka', 'Rangpur', '29-12-2016', ' A1', 600),
('4', '1013', 'sanjida', '7861', 'hfs@gna.com', 'Dhaka', 'Syllet', '30-12-2016', ' A13', 800),
('5', '2020', 'parth', '8952', 'red@gm.com', 'Dhaka', 'Rangpur', '29-12-2016', ' B10', 600),
('6', '1013', 'oiu', '98745', 'kjh@hm.com', 'Dhaka', 'Syllet', '29-12-2016', ' A10', 800),
('7', '1010', 'rana', '0169080980', 'a@gmail.com', 'Dhaka', 'Rangpur', '16-12-2016', ' B4', 800),
('8', '1010', 'rana', '01780929498', 'm@gmail.com', 'Dhaka', 'Rangpur', '14-12-2016', ' A6B13', 1600),
('9', '1011', 'Rozario', '01665754723', 'rozario@gmail.com', 'Dhaka', 'Rangpur', '28-12-2016', ' B4B13', 1600);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `bookedticket`
--
ALTER TABLE `bookedticket`
  ADD KEY `Bus_Id_BID_fk` (`bid`),
  ADD KEY `passenger_Id_BID_fk` (`Pid`);

--
-- Indexes for table `bus`
--
ALTER TABLE `bus`
  ADD PRIMARY KEY (`Bid`);

--
-- Indexes for table `chooseseat`
--
ALTER TABLE `chooseseat`
  ADD KEY `Bus_Id_fk` (`Bid`);

--
-- Indexes for table `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`EmpId`);

--
-- Indexes for table `passenger`
--
ALTER TABLE `passenger`
  ADD PRIMARY KEY (`Pid`),
  ADD KEY `passenger_BID_fk` (`Bid`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `bookedticket`
--
ALTER TABLE `bookedticket`
  ADD CONSTRAINT `Bus_Id_BID_fk` FOREIGN KEY (`bid`) REFERENCES `bus` (`Bid`),
  ADD CONSTRAINT `passenger_Id_BID_fk` FOREIGN KEY (`Pid`) REFERENCES `passenger` (`Pid`);

--
-- Constraints for table `chooseseat`
--
ALTER TABLE `chooseseat`
  ADD CONSTRAINT `Bus_Id_fk` FOREIGN KEY (`Bid`) REFERENCES `bus` (`Bid`);

--
-- Constraints for table `passenger`
--
ALTER TABLE `passenger`
  ADD CONSTRAINT `passenger_BID_fk` FOREIGN KEY (`Bid`) REFERENCES `bus` (`Bid`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
