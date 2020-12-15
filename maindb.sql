-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 28, 2019 at 08:17 PM
-- Server version: 10.4.6-MariaDB
-- PHP Version: 7.3.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `maindb`
--

-- --------------------------------------------------------

--
-- Table structure for table `categoryinfo`
--

CREATE TABLE `categoryinfo` (
  `cID` int(100) NOT NULL,
  `cName` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `categoryinfo`
--

INSERT INTO `categoryinfo` (`cID`, `cName`) VALUES
(1, 'electr'),
(4, ' cv'),
(5, 'vb'),
(8, 'i'),
(58, 'Snacks');

-- --------------------------------------------------------

--
-- Table structure for table `companyinfo`
--

CREATE TABLE `companyinfo` (
  `companyName` text NOT NULL,
  `address` text NOT NULL,
  `contactNum` text NOT NULL,
  `specialty` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `connectedclients`
--

CREATE TABLE `connectedclients` (
  `clientID` text NOT NULL,
  `conTime` datetime(6) NOT NULL,
  `disTime` datetime(6) NOT NULL,
  `uID` int(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `hostdetails`
--

CREATE TABLE `hostdetails` (
  `hostID` int(255) NOT NULL,
  `hostName` text NOT NULL,
  `portNum` int(50) NOT NULL,
  `other` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `logrecords`
--

CREATE TABLE `logrecords` (
  `logID` text NOT NULL,
  `logInDate` date NOT NULL,
  `logInTime` datetime(6) NOT NULL,
  `logOutTime` datetime(6) NOT NULL,
  `uID` text NOT NULL,
  `terminalID` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `sales`
--

CREATE TABLE `sales` (
  `saleID` int(50) NOT NULL,
  `tilliD` text NOT NULL,
  `barcode` int(11) NOT NULL,
  `QuantityPurchased` int(50) NOT NULL,
  `totalCost` decimal(25,0) NOT NULL,
  `Date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `sales`
--

INSERT INTO `sales` (`saleID`, `tilliD`, `barcode`, `QuantityPurchased`, `totalCost`, `Date`) VALUES
(3, 'tr', 23, 12, '1344', '2019-10-09');

-- --------------------------------------------------------

--
-- Table structure for table `stocks`
--

CREATE TABLE `stocks` (
  `ItemBarcode` int(100) NOT NULL,
  `itemName` text NOT NULL,
  `ItemQuantity` int(255) NOT NULL,
  `ItemReorderLevel` int(50) NOT NULL,
  `Category` text NOT NULL,
  `PurchasePrice` int(11) NOT NULL,
  `ItemPrice` int(255) NOT NULL,
  `itemVat` int(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `stocks`
--

INSERT INTO `stocks` (`ItemBarcode`, `itemName`, `ItemQuantity`, `ItemReorderLevel`, `Category`, `PurchasePrice`, `ItemPrice`, `itemVat`) VALUES
(1, 'dovi', 1000, 150, 'electr', 8, 10, 2),
(2, 'rice', 100, 15, 'electr', 13, 16, 1),
(3, 'wee', 212, 21, 'electr', 12, 10, 3),
(12, '3s', 221, 21, 'electr', 333, 132, 31),
(45, 'fdf', 343, 34, 'i', 345, 45, 3);

-- --------------------------------------------------------

--
-- Table structure for table `supplierinfo`
--

CREATE TABLE `supplierinfo` (
  `supID` int(100) NOT NULL,
  `supName` text NOT NULL,
  `supAddress` text NOT NULL,
  `supProducts` varchar(255) NOT NULL,
  `supContactNum` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `uID` varchar(100) NOT NULL,
  `uPhone` varchar(25) NOT NULL,
  `uFirstName` text NOT NULL,
  `uLastName` text NOT NULL,
  `uName` text NOT NULL,
  `UcostPerHour` int(11) NOT NULL,
  `uPass` text NOT NULL,
  `uPriveledge` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`uID`, `uPhone`, `uFirstName`, `uLastName`, `uName`, `UcostPerHour`, `uPass`, `uPriveledge`) VALUES
('1', '0782864353', 'ashton', 'tafy', 'ashy', 5, '123', 'Administrator'),
('2', '78', 'ropah', 'fadzo', 'ro', 6, '234', 'User');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `categoryinfo`
--
ALTER TABLE `categoryinfo`
  ADD PRIMARY KEY (`cID`);

--
-- Indexes for table `hostdetails`
--
ALTER TABLE `hostdetails`
  ADD PRIMARY KEY (`hostID`);

--
-- Indexes for table `sales`
--
ALTER TABLE `sales`
  ADD PRIMARY KEY (`saleID`);

--
-- Indexes for table `stocks`
--
ALTER TABLE `stocks`
  ADD PRIMARY KEY (`ItemBarcode`);

--
-- Indexes for table `supplierinfo`
--
ALTER TABLE `supplierinfo`
  ADD PRIMARY KEY (`supID`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`uID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
