-- phpMyAdmin SQL Dump
-- version 4.7.9
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 17, 2019 at 02:31 PM
-- Server version: 10.1.31-MariaDB
-- PHP Version: 7.2.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `loket`
--

-- --------------------------------------------------------

--
-- Table structure for table `tb_adm`
--

CREATE TABLE `tb_adm` (
  `kode_admin` varchar(4) NOT NULL,
  `nama_admin` varchar(6) NOT NULL,
  `Pass` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_adm`
--

INSERT INTO `tb_adm` (`kode_admin`, `nama_admin`, `Pass`) VALUES
('A001', 'Deva', 'admin'),
('A002', 'Era', 'admin'),
('A003', 'Lingga', 'admin'),
('A004', 'Yosua', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `tb_kereta`
--

CREATE TABLE `tb_kereta` (
  `id_kereta` varchar(45) NOT NULL DEFAULT '',
  `Nama_kereta` varchar(45) NOT NULL DEFAULT '',
  `Tujuan` varchar(45) NOT NULL DEFAULT '',
  `st_asal` varchar(20) NOT NULL,
  `st_tujuan` varchar(20) NOT NULL,
  `berangkat` datetime NOT NULL,
  `tiba` datetime NOT NULL,
  `Kelas` varchar(45) NOT NULL DEFAULT '',
  `Harga` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_kereta`
--

INSERT INTO `tb_kereta` (`id_kereta`, `Nama_kereta`, `Tujuan`, `st_asal`, `st_tujuan`, `berangkat`, `tiba`, `Kelas`, `Harga`) VALUES
('KA001', 'Argo Lawu Eksekutif', 'Solo - Jakarta', 'Balapan', 'Gambir', '2017-04-07 04:00:00', '2017-04-07 15:45:00', 'Eksekutif', 150000),
('KA002', 'Argo Lawu Bisnis', 'Solo - Jakarta', 'Purwosari', 'Pasar Senen', '2017-04-07 05:00:00', '2017-04-07 16:45:00', 'Bisnis', 100000),
('KA003', 'Argo Lawu Eksekutif', 'Jakarta - Solo', 'Gambir', 'Balapan', '2017-04-07 16:00:00', '2017-04-08 03:45:00', 'Eksekutif', 150000),
('KA004', 'Argo Lawu Bisnis', 'Jakarta - Solo', 'Pasar Senen', 'Purwosari', '2017-04-07 17:00:00', '2017-04-08 04:45:00', 'Bisnis', 100000),
('KA005', 'Sembrani Eksekutif', 'Surabaya - Jakarta', 'Pasar Turi', 'Pasar Senen', '2017-04-07 02:00:00', '2017-04-07 13:50:00', 'Eksekutif', 200000),
('KA006', 'Sembrani Bisnis', 'Surabaya - Jakarta', 'Gubeng', 'Gambir', '2017-04-07 05:00:00', '2017-04-07 16:45:00', 'Bisnis', 150000),
('KA007', 'Sembrani Eksekutif', 'Jakarta - Surabaya', 'Pasar Senen', 'Pasar Turi', '2017-04-07 14:00:00', '2017-04-08 01:45:00', 'Eksekutif', 200000),
('KA008', 'Sembrani Bisnis', 'Jakarta - Surabaya', 'Gambir', 'Gubeng', '2017-04-07 17:00:00', '2017-04-08 04:45:00', 'Bisnis', 150000),
('KA009', 'Lodaya Eksekutif', 'Bandung - Solo', 'Bandung Kota', 'Balapan', '2017-04-07 05:00:00', '2017-04-07 15:00:00', 'Eksekutif', 140000),
('KA010', 'Lodaya Bisnis', 'Bandung - Solo', 'Bandung Kota', 'Purwosari', '2017-04-07 04:00:00', '2017-04-07 14:00:00', 'Bisnis', 80000),
('KA011', 'Lodaya Eksekutif', 'Solo - Bandung', 'Balapan', 'Bandung Kota', '2017-04-07 17:00:00', '2017-04-08 03:00:00', 'Eksekutif', 140000),
('KA012', 'Lodaya Bisnis', 'Solo - Bandung', 'Purwosari', 'Bandung Kota', '2017-04-07 16:00:00', '2017-04-08 02:00:00', 'Bisnis', 80000),
('KA013', 'Malabar Eksekutif', 'Malang - Bandung', 'Malang Kota', 'Bandung Kota', '2017-04-07 10:00:00', '2017-04-07 21:45:00', 'Eksekutif', 220000),
('KA014', 'Malabar Bisnis', 'Malang - Bandung', 'Malang Kota', 'Bandung Kota', '2017-04-07 12:00:00', '2017-04-07 23:45:00', 'Bisnis', 150000),
('KA015', 'Malabar Eksekutif', 'Bandung - Malang', 'Bandung Kota', 'Malang Kota', '2017-04-07 22:00:00', '2017-04-08 09:45:00', 'Eksekutif', 220000),
('KA016', 'Malabar Bisnis', 'Bandung - Malang', 'Bandung Kota', 'Malang Kota', '2017-04-08 00:00:00', '2017-04-08 11:45:00', 'Bisnis', 150000),
('KA017', 'Malioboro Ekspres Eksekutif', 'Yogyakarta - Malang', 'Tugu', 'Malang Kota', '2017-04-07 06:00:00', '2017-04-07 16:00:00', 'Eksekutif', 180000),
('KA018', 'Malioboro Ekspres Bisnis', 'Yogyakarta - Malang', 'Lempuyangan', 'Malang Kota', '2017-04-07 08:00:00', '2017-04-07 18:00:00', 'Bisnis', 120000),
('KA019', 'Malioboro Ekspress Eksekutif', 'Malang - Yogyakarta', 'Malang Kota', 'Tugu', '2017-04-07 18:00:00', '2017-04-08 04:00:00', 'Eksekutif', 180000),
('KA020', 'Malioboro Ekspres Bisnis', 'Malang - Yogyakarta', 'Malang Kota', 'Lempuyangan', '2017-04-07 20:00:00', '2017-04-08 06:00:00', 'Bisnis', 120000),
('KA021', 'Prameks', 'Solo - Yogyakarta', 'Balapan', 'Tugu', '2017-04-07 07:00:00', '2017-04-07 09:00:00', 'Bisnis', 10000),
('KA022', 'Prameks', 'Yogyakarta - Solo', 'Tugu', 'Balapan', '2017-04-07 10:00:00', '2017-04-07 12:00:00', 'Bisnis', 10000),
('KA023', 'Solo Ekspres', 'Solo - Yogyakarta', 'Purwosari', 'Lempuyangan', '2017-04-07 08:00:00', '2017-04-07 09:30:00', 'Eksekutif', 30000),
('KA024', 'Solo Ekspres', 'Yogyakarta - Solo', 'Lempuyangan', 'Purwosari', '2017-04-07 11:00:00', '2017-04-07 12:30:00', 'Eksekutif', 30000),
('KA025', 'Tawang Ekspress', 'Semarang - Jakarta', 'Tawang', 'Gambir', '2017-04-07 04:30:00', '2017-04-07 12:40:00', 'Bisnis', 144000),
('KA026', 'Tawang Ekspres', 'Jakarta - Semarang', 'Gambir', 'Tawang', '2017-04-07 16:00:00', '2017-04-08 00:10:00', 'Bisnis', 144000),
('KA027', 'Argo Kencana Eksekutif', 'Semarang - Surabaya', 'Poncol', 'Gubeng', '2017-04-07 03:00:00', '2017-04-07 11:00:00', 'Eksekutif', 175000),
('KA028', 'Argo Kencana Eksekutif', 'Surabaya - Semarang', 'Gubeng', 'Poncol', '2017-04-07 15:00:00', '2017-04-07 23:00:00', 'Eksekutif', 175000),
('KA029', 'Sindoro', 'Solo - Semarang', 'Balapan', 'Tawang', '2017-04-07 06:00:00', '2017-04-07 09:00:00', 'Bisnis', 15000),
('KA030', 'Sindoro', 'Semarang - Solo', 'Tawang', 'Balapan', '2017-04-04 12:00:00', '2017-04-04 15:00:00', 'Bisnis', 15000),
('KA031', 'Argo Lawu Eksekutif', 'Solo - Jakarta', 'Balapan', 'Gambir', '2017-04-08 04:00:00', '2017-04-08 15:45:00', 'Eksekutif', 150000),
('KA032', 'Argo Lawu Bisnis', 'Solo - Jakarta', 'Purwosari', 'Pasar Senen', '2017-04-08 05:00:00', '2017-04-08 16:45:00', 'Bisnis', 100000),
('KA033', 'Argo Lawu Eksekutif', 'Jakarta - Solo', 'Gambir', 'Balapan', '2017-04-08 16:00:00', '2017-04-09 03:45:00', 'Eksekutif', 150000),
('KA034', 'Argo Lawu Bisnis', 'Jakarta - Solo', 'Pasar Senen', 'Purwosari', '2017-04-08 17:00:00', '2017-04-09 04:45:00', 'Bisnis', 100000),
('KA035', 'Sembrani Eksekutif', 'Surabaya - Jakarta', 'Pasar Turi', 'Pasar Senen', '2017-04-08 02:00:00', '2017-04-08 13:45:00', 'Eksekutif', 200000),
('KA036', 'Sembrani Bisnis', 'Surabaya - Jakarta', 'Gubeng', 'Gambir', '2017-04-05 05:00:00', '2017-04-08 16:45:00', 'Bisnis', 150000),
('KA037', 'Sembrani Eksekutif', 'Jakarta - Surabaya', 'Pasar Senen', 'Pasar Turi', '2017-04-08 14:00:00', '2017-04-09 01:45:00', 'Eksekutif', 200000),
('KA038', 'Sembrani Bisnis', 'Jakarta - Surabaya', 'Gambir', 'Gubeng', '2017-04-08 17:00:00', '2017-04-09 04:45:00', 'Bisnis', 150000),
('KA039', 'Lodaya Eksekutif', 'Bandung - Solo', 'Bandung Kota', 'Balapan', '2017-04-08 05:00:00', '2017-04-08 15:00:00', 'Eksekutif', 140000),
('KA040', 'Lodaya Bisnis', 'Bandung - Solo', 'Bandung Kota', 'Purwosari', '2017-04-08 04:00:00', '2017-04-08 14:00:00', 'Bisnis', 80000),
('KA041', 'Lodaya Eksekutif', 'Solo - Bandung', 'Balapan', 'Bandung Kota', '2017-04-08 17:00:00', '2017-04-09 03:00:00', 'Eksekutif', 140000),
('KA042', 'Lodaya Bisnis', 'Solo - Bandung', 'Purwosari', 'Bandung Kota', '2017-04-08 16:00:00', '2017-04-08 02:00:00', 'Bisnis', 80000),
('KA043', 'Malabar Eksekutif', 'Malang - Bandung', 'Malang Kota', 'Bandung Kota', '2017-04-08 10:00:00', '2017-04-08 21:45:00', 'Eksekutif', 220000),
('KA044', 'Malabar Bisnis', 'Malang - Bandung', 'Malang Kota', 'Bandung Kota', '2017-04-08 12:00:00', '2017-04-08 23:45:00', 'Bisnis', 150000),
('KA045', 'Malabar Eksekutif', 'Bandung - Malang', 'Bandung Kota', 'Malang Kota', '2017-04-08 22:00:00', '2017-04-09 09:45:00', 'Eksekutif', 220000),
('KA046', 'Malabar Bisnis', 'Bandung - Malang', 'Bandung Kota', 'Malang Kota', '2017-04-09 00:00:00', '2017-04-09 11:45:00', 'Bisnis', 150000),
('KA047', 'Malioboro Ekspres Eksekutif', 'Yogyakarta - Malang', 'Tugu', 'Malang Kota', '2017-04-08 06:00:00', '2017-04-08 16:00:00', 'Eksekutif', 180000),
('KA048', 'Malioboro Ekspres Bisnis', 'Yogyakarta - Malang', 'Lempuyangan', 'Malang Kota', '2017-04-08 08:00:00', '2017-04-08 18:00:00', 'Bisnis', 120000),
('KA049', 'Malioboro Ekspress Eksekutif', 'Malang - Yogyakarta', 'Malang Kota', 'Tugu', '2017-04-08 18:00:00', '2017-04-09 04:00:00', 'Eksekutif', 180000),
('KA050', 'Malioboro Ekspres Bisnis', 'Malang - Yogyakarta', 'Malang Kota', 'Lempuyangan', '2017-04-08 20:00:00', '2017-04-09 06:00:00', 'Bisnis', 120000),
('KA051', 'Prameks', 'Solo - Yogyakarta', 'Balapan', 'Tugu', '2017-04-08 07:00:00', '2017-04-08 09:00:00', 'Bisnis', 10000),
('KA052', 'Prameks', 'Yogyakarta - Solo', 'Tugu', 'Balapan', '2017-04-08 10:00:00', '2017-04-08 12:00:00', 'Bisnis', 10000),
('KA053', 'Solo Ekspres', 'Solo - Yogyakarta', 'Purwosari', 'Lempuyangan', '2017-04-08 08:00:00', '2017-04-08 09:30:00', 'Eksekutif', 30000),
('KA054', 'Solo Ekspres', 'Yogyakarta - Solo', 'Lempuyangan', 'Purwosari', '2017-04-08 12:00:00', '2017-04-08 12:30:00', 'Eksekutif', 30000),
('KA055', 'Tawang Ekspress', 'Semarang - Jakarta', 'Tawang', 'Gambir', '2017-04-08 04:30:00', '2017-04-08 12:40:00', 'Bisnis', 144000),
('KA056', 'Tawang Ekspres', 'Jakarta - Semarang', 'Gambir', 'Tawang', '2017-04-08 16:00:00', '2017-04-09 00:10:00', 'Bisnis', 144000),
('KA057', 'Argo Kencana Eksekutif', 'Semarang - Surabaya', 'Poncol', 'Gubeng', '2017-04-08 03:00:00', '2017-04-08 11:00:00', 'Eksekutif', 175000),
('KA058', 'Argo Kencana Eksekutif', 'Surabaya - Semarang', 'Gubeng', 'Poncol', '2017-04-08 15:00:00', '2017-04-08 23:00:00', 'Eksekutif', 175000),
('KA059', 'Sindoro', 'Solo - Semarang', 'Balapan', 'Tawang', '2017-04-08 06:00:00', '2017-04-08 09:00:00', 'Bisnis', 15000),
('KA060', 'Sindoro', 'Semarang - Solo', 'Tawang', 'Balapan', '2017-04-08 12:00:00', '2017-04-08 15:00:00', 'Bisnis', 15000),
('KA061', 'Argo Lawu Eksekutif', 'Solo - Jakarta', 'Balapan', 'Gambir', '2017-04-09 04:00:00', '2017-04-09 15:45:00', 'Eksekutif', 150000),
('KA062', 'Argo Lawu Bisnis', 'Solo - Jakarta', 'Purwosari', 'Pasar Senen', '2017-04-09 05:00:00', '2017-04-09 16:45:00', 'Bisnis', 100000),
('KA063', 'Argo Lawu Eksekutif', 'Jakarta - Solo', 'Gambir', 'Balapan', '2017-04-09 16:00:00', '2017-04-10 03:45:00', 'Eksekutif', 150000),
('KA064', 'Argo Lawu Bisnis', 'Jakarta - Solo', 'Pasar Senen', 'Purwosari', '2017-04-09 17:00:00', '2017-04-10 04:45:00', 'Bisnis', 100000),
('KA065', 'Sembrani Eksekutif', 'Surabaya - Jakarta', 'Pasar Turi', 'Pasar Senen', '2017-04-09 02:00:00', '2017-04-09 13:45:00', 'Eksekutif', 200000),
('KA066', 'Sembrani Bisnis', 'Surabaya - Jakarta', 'Gubeng', 'Gambir', '2017-04-09 05:00:00', '2017-04-09 16:45:00', 'Bisnis', 150000),
('KA067', 'Sembrani Eksekutif', 'Jakarta - Surabaya', 'Pasar Senen', 'Pasar Turi', '2017-04-09 14:00:00', '2017-04-10 01:45:00', 'Eksekutif', 200000),
('KA068', 'Sembrani Bisnis', 'Jakarta - Surabaya', 'Gambir', 'Gubeng', '2017-04-09 17:00:00', '2017-04-10 04:45:00', 'Bisnis', 150000),
('KA069', 'Lodaya Eksekutif', 'Bandung - Solo', 'Bandung Kota', 'Balapan', '2017-04-09 05:00:00', '2017-04-09 15:00:00', 'Eksekutif', 140000),
('KA070', 'Lodaya Bisnis', 'Bandung - Solo', 'Bandung Kota', 'Purwosari', '2017-04-09 04:00:00', '2017-04-09 14:00:00', 'Bisnis', 80000),
('KA071', 'Lodaya Eksekutif', 'Solo - Bandung', 'Balapan', 'Bandung Kota', '2017-04-09 17:00:00', '2017-04-10 03:00:00', 'Eksekutif', 140000),
('KA072', 'Lodaya Bisnis', 'Solo - Bandung', 'Purwosari', 'Bandung Kota', '2017-04-09 16:00:00', '2017-04-10 02:00:00', 'Bisnis', 80000),
('KA073', 'Malabar Eksekutif', 'Malang - Bandung', 'Malang Kota', 'Bandung Kota', '2017-04-09 10:00:00', '2017-04-09 21:45:00', 'Eksekutif', 220000),
('KA074', 'Malabar Bisnis', 'Malang - Bandung', 'Malang Kota', 'Bandung Kota', '2017-04-09 12:00:00', '2017-04-09 23:45:00', 'Bisnis', 150000),
('KA075', 'Malabar Eksekutif', 'Bandung - Malang', 'Bandung Kota', 'Malang Kota', '2017-04-09 22:00:00', '2017-04-10 09:45:00', 'Eksekutif', 220000),
('KA076', 'Malabar Bisnis', 'Bandung - Malang', 'Bandung Kota', 'Malang Kota', '2017-04-10 00:00:00', '2017-04-10 11:45:00', 'Bisnis', 150000),
('KA077', 'Malioboro Ekspres Eksekutif', 'Yogyakarta - Malang', 'Tugu', 'Malang Kota', '2017-04-09 06:00:00', '2017-04-09 16:00:00', 'Eksekutif', 180000),
('KA078', 'Malioboro Ekspres Bisnis', 'Yogyakarta - Malang', 'Lempuyangan', 'Malang Kota', '2017-04-09 08:00:00', '2017-04-09 18:00:00', 'Bisnis', 120000),
('KA079', 'Malioboro Ekspress Eksekutif', 'Malang - Yogyakarta', 'Malang Kota', 'Tugu', '2017-04-09 18:00:00', '2017-04-10 04:00:00', 'Eksekutif', 180000),
('KA080', 'Malioboro Ekspres Bisnis', 'Malang - Yogyakarta', 'Malang Kota', 'Lempuyangan', '2017-04-09 20:00:00', '2017-04-10 06:00:00', 'Bisnis', 120000),
('KA081', 'Prameks', 'Solo - Yogyakarta', 'Balapan', 'Tugu', '2017-04-09 07:00:00', '2017-04-09 09:00:00', 'Bisnis', 10000),
('KA082', 'Prameks', 'Yogyakarta - Solo', 'Tugu', 'Balapan', '2017-04-09 10:00:00', '2017-04-09 12:00:00', 'Bisnis', 10000),
('KA083', 'Solo Ekspres', 'Solo - Yogyakarta', 'Purwosari', 'Lempuyangan', '2017-04-09 08:00:00', '2017-04-09 09:30:00', 'Eksekutif', 30000),
('KA084', 'Solo Ekspres', 'Yogyakarta - Solo', 'Lempuyangan', 'Purwosari', '2017-04-09 11:00:00', '2017-04-09 12:30:00', 'Eksekutif', 30000),
('KA085', 'Tawang Ekspress', 'Semarang - Jakarta', 'Tawang', 'Gambir', '2017-04-09 04:30:00', '2017-04-09 12:40:00', 'Bisnis', 144000),
('KA086', 'Tawang Ekspres', 'Jakarta - Semarang', 'Gambir', 'Tawang', '2017-04-09 16:00:00', '2017-04-10 00:10:00', 'Bisnis', 144000),
('KA087', 'Argo Kencana Eksekutif', 'Semarang - Surabaya', 'Poncol', 'Gubeng', '2017-04-09 03:00:00', '2017-04-09 11:00:00', 'Eksekutif', 175000),
('KA088', 'Argo Kencana Eksekutif', 'Surabaya - Semarang', 'Gubeng', 'Poncol', '2017-04-09 15:00:00', '2017-04-09 23:00:00', 'Eksekutif', 175000),
('KA089', 'Sindoro', 'Solo - Semarang', 'Balapan', 'Tawang', '2017-04-09 06:00:00', '2017-04-09 09:00:00', 'Bisnis', 15000),
('KA090', 'Sindoro', 'Semarang - Solo', 'Tawang', 'Balapan', '2017-04-09 12:00:00', '2017-04-09 12:00:00', 'Bisnis', 15000),
('KA091', 'Argo Lawu Eksekutif', 'Solo - Jakarta', 'Balapan', 'Gambir', '2017-04-10 04:00:00', '2017-04-10 15:45:00', 'Eksekutif', 150000),
('KA092', 'Argo Lawu Bisnis', 'Solo - Jakarta', 'Purwosari', 'Pasar Senen', '2017-04-10 05:00:00', '2017-04-10 16:45:00', 'Bisnis', 100000),
('KA093', 'Argo Lawu Eksekutif', 'Jakarta - Solo', 'Gambir', 'Balapan', '2017-04-10 16:00:00', '2017-04-11 03:45:00', 'Eksekutif', 150000),
('KA094', 'Argo Lawu Bisnis', 'Jakarta - Solo', 'Pasar Senen', 'Purwosari', '2017-04-10 17:00:00', '2017-04-11 04:45:00', 'Bisnis', 100000),
('KA095', 'Sembrani Eksekutif', 'Surabaya - Jakarta', 'Pasar Turi', 'Pasar Senen', '2017-04-10 02:00:00', '2017-04-10 13:45:00', 'Eksekutif', 200000),
('KA096', 'Sembrani Bisnis', 'Surabaya - Jakarta', 'Gubeng', 'Gambir', '2017-04-10 05:00:00', '2017-04-10 16:45:00', 'Bisnis', 150000),
('KA097', 'Sembrani Eksekutif', 'Jakarta - Surabaya', 'Pasar Senen', 'Pasar Turi', '2017-04-10 14:00:00', '2017-04-11 01:45:00', 'Eksekutif', 200000),
('KA098', 'Sembrani Bisnis', 'Jakarta - Surabaya', 'Gambir', 'Gubeng', '2017-04-10 17:00:00', '2017-04-11 04:45:00', 'Bisnis', 150000),
('KA099', 'Lodaya Eksekutif', 'Bandung - Solo', 'Bandung Kota', 'Balapan', '2017-04-10 05:00:00', '2017-04-10 15:00:00', 'Eksekutif', 140000),
('KA100', 'Lodaya Bisnis', 'Bandung - Solo', 'Bandung Kota', 'Purwosari', '2017-04-10 04:00:00', '2017-04-10 14:00:00', 'Bisnis', 80000),
('KA101', 'Lodaya Eksekutif', 'Solo - Bandung', 'Balapan', 'Bandung Kota', '2017-04-10 17:00:00', '2017-04-11 03:00:00', 'Eksekutif', 140000),
('KA102', 'Lodaya Bisnis', 'Solo - Bandung', 'Purwosari', 'Bandung Kota', '2017-04-10 16:00:00', '2017-04-11 02:00:00', 'Bisnis', 80000),
('KA103', 'Malabar Eksekutif', 'Malang - Bandung', 'Malang Kota', 'Bandung Kota', '2017-04-10 10:00:00', '2017-04-10 21:45:00', 'Eksekutif', 220000),
('KA104', 'Malabar Bisnis', 'Malang - Bandung', 'Malang Kota', 'Bandung Kota', '2017-04-10 12:00:00', '2017-04-10 23:45:00', 'Bisnis', 150000),
('KA105', 'Malabar Eksekutif', 'Bandung - Malang', 'Bandung Kota', 'Malang Kota', '2017-04-10 22:00:00', '2017-04-11 09:45:00', 'Eksekutif', 220000),
('KA106', 'Malabar Bisnis', 'Bandung - Malang', 'Bandung Kota', 'Malang Kota', '2017-04-11 00:00:00', '2017-04-11 11:45:00', 'Bisnis', 150000),
('KA107', 'Malioboro Ekspres Eksekutif', 'Yogyakarta - Malang', 'Tugu', 'Malang Kota', '2017-04-10 06:00:00', '2017-04-10 16:00:00', 'Eksekutif', 180000),
('KA108', 'Malioboro Ekspres Bisnis', 'Yogyakarta - Malang', 'Lempuyangan', 'Malang Kota', '2017-04-10 08:00:00', '2017-04-10 18:00:00', 'Bisnis', 120000),
('KA109', 'Malioboro Ekspress Eksekutif', 'Malang - Yogyakarta', 'Malang Kota', 'Tugu', '2017-04-10 18:00:00', '2017-04-11 04:00:00', 'Eksekutif', 180000),
('KA110', 'Malioboro Ekspres Bisnis', 'Malang - Yogyakarta', 'Malang Kota', 'Lempuyangan', '2017-04-10 20:00:00', '2017-04-11 06:00:00', 'Bisnis', 120000),
('KA111', 'Prameks', 'Solo - Yogyakarta', 'Balapan', 'Tugu', '2017-04-10 07:00:00', '2017-04-10 09:00:00', 'Bisnis', 10000),
('KA112', 'Prameks', 'Yogyakarta - Solo', 'Tugu', 'Balapan', '2017-04-10 10:00:00', '2017-04-10 10:00:00', 'Bisnis', 10000),
('KA113', 'Solo Ekspres', 'Solo - Yogyakarta', 'Purwosari', 'Lempuyangan', '2017-04-10 08:00:00', '2017-04-10 09:30:00', 'Eksekutif', 30000),
('KA114', 'Solo Ekspres', 'Yogyakarta - Solo', 'Lempuyangan', 'Purwosari', '2017-04-10 11:00:00', '2017-04-10 12:30:00', 'Eksekutif', 30000),
('KA115', 'Tawang Ekspress', 'Semarang - Jakarta', 'Tawang', 'Gambir', '2017-04-10 04:30:00', '2017-04-10 12:40:00', 'Bisnis', 144000),
('KA116', 'Tawang Ekspres', 'Jakarta - Semarang', 'Gambir', 'Tawang', '2017-04-10 16:00:00', '2017-04-11 00:10:00', 'Bisnis', 144000),
('KA117', 'Argo Kencana Eksekutif', 'Semarang - Surabaya', 'Poncol', 'Gubeng', '2017-04-10 03:00:00', '2017-04-10 11:00:00', 'Eksekutif', 175000),
('KA118', 'Argo Kencana Eksekutif', 'Surabaya - Semarang', 'Gubeng', 'Poncol', '2017-04-10 15:00:00', '2017-04-10 23:00:00', 'Eksekutif', 175000),
('KA119', 'Sindoro', 'Solo - Semarang', 'Balapan', 'Tawang', '2017-04-10 06:00:00', '2017-04-10 09:00:00', 'Bisnis', 15000),
('KA120', 'Sindoro', 'Semarang - Solo', 'Tawang', 'Balapan', '2017-04-10 12:00:00', '2017-04-10 15:00:00', 'Bisnis', 15000),
('KA121', 'Argo Lawu Eksekutif', 'Solo - Jakarta', 'Balapan', 'Gambir', '2017-04-11 04:00:00', '2017-04-11 15:45:00', 'Eksekutif', 150000),
('KA122', 'Argo Lawu Bisnis', 'Solo - Jakarta', 'Purwosari', 'Pasar Senen', '2017-04-11 05:00:00', '2017-04-11 16:45:00', 'Bisnis', 100000),
('KA123', 'Argo Lawu Eksekutif', 'Jakarta - Solo', 'Gambir', 'Balapan', '2017-04-11 16:00:00', '2017-04-12 03:45:00', 'Eksekutif', 150000),
('KA124', 'Argo Lawu Bisnis', 'Jakarta - Solo', 'Pasar Senen', 'Purwosari', '2017-04-11 17:00:00', '2017-04-12 04:45:00', 'Bisnis', 100000),
('KA125', 'Sembrani Eksekutif', 'Surabaya - Jakarta', 'Pasar Turi', 'Pasar Senen', '2017-04-11 02:00:00', '2017-04-11 13:45:00', 'Eksekutif', 200000),
('KA126', 'Sembrani Bisnis', 'Surabaya - Jakarta', 'Gubeng', 'Gambir', '2017-04-11 05:00:00', '2017-04-11 16:45:00', 'Bisnis', 150000),
('KA127', 'Sembrani Eksekutif', 'Jakarta - Surabaya', 'Pasar Senen', 'Pasar Turi', '2017-04-11 14:00:00', '2017-04-12 01:45:00', 'Eksekutif', 200000),
('KA128', 'Sembrani Bisnis', 'Jakarta - Surabaya', 'Gambir', 'Gubeng', '2017-04-11 17:00:00', '2017-04-12 04:45:00', 'Bisnis', 150000),
('KA129', 'Lodaya Eksekutif', 'Bandung - Solo', 'Bandung Kota', 'Balapan', '2017-04-11 05:00:00', '2017-04-11 15:00:00', 'Eksekutif', 140000),
('KA130', 'Lodaya Bisnis', 'Bandung - Solo', 'Bandung Kota', 'Purwosari', '2017-04-11 04:00:00', '2017-04-11 14:00:00', 'Bisnis', 80000),
('KA131', 'Lodaya Eksekutif', 'Solo - Bandung', 'Balapan', 'Bandung Kota', '2017-04-11 17:00:00', '2017-04-12 03:00:00', 'Eksekutif', 140000),
('KA132', 'Lodaya Bisnis', 'Solo - Bandung', 'Purwosari', 'Bandung Kota', '2017-04-11 16:00:00', '2017-04-12 02:00:00', 'Bisnis', 80000),
('KA133', 'Malabar Eksekutif', 'Malang - Bandung', 'Malang Kota', 'Bandung Kota', '2017-04-11 10:00:00', '2017-04-11 21:45:00', 'Eksekutif', 220000),
('KA134', 'Malabar Bisnis', 'Malang - Bandung', 'Malang Kota', 'Bandung Kota', '2017-04-11 12:00:00', '2017-04-11 23:45:00', 'Bisnis', 150000),
('KA135', 'Malabar Eksekutif', 'Bandung - Malang', 'Bandung Kota', 'Malang Kota', '2017-04-11 22:00:00', '2017-04-12 09:45:00', 'Eksekutif', 220000),
('KA136', 'Malabar Bisnis', 'Bandung - Malang', 'Bandung Kota', 'Malang Kota', '2017-04-12 00:00:00', '2017-04-12 11:45:00', 'Bisnis', 150000),
('KA137', 'Malioboro Ekspres Eksekutif', 'Yogyakarta - Malang', 'Tugu', 'Malang Kota', '2017-04-11 06:00:00', '2017-04-11 16:00:00', 'Eksekutif', 180000),
('KA138', 'Malioboro Ekspres Bisnis', 'Yogyakarta - Malang', 'Lempuyangan', 'Malang Kota', '2017-04-11 08:00:00', '2017-04-11 18:00:00', 'Bisnis', 120000),
('KA139', 'Malioboro Ekspress Eksekutif', 'Malang - Yogyakarta', 'Malang Kota', 'Tugu', '2017-04-11 18:00:00', '2017-04-11 04:00:00', 'Eksekutif', 180000),
('KA140', 'Malioboro Ekspres Bisnis', 'Malang - Yogyakarta', 'Malang Kota', 'Lempuyangan', '2017-04-11 20:00:00', '2017-04-12 06:00:00', 'Bisnis', 120000),
('KA141', 'Prameks', 'Solo - Yogyakarta', 'Balapan', 'Tugu', '2017-04-11 07:00:00', '2017-04-11 09:00:00', 'Bisnis', 10000),
('KA142', 'Prameks', 'Yogyakarta - Solo', 'Tugu', 'Balapan', '2017-04-11 10:00:00', '2017-04-11 12:00:00', 'Bisnis', 10000),
('KA143', 'Solo Ekspres', 'Solo - Yogyakarta', 'Purwosari', 'Lempuyangan', '2017-04-11 08:00:00', '2017-04-11 09:30:00', 'Eksekutif', 30000),
('KA144', 'Solo Ekspres', 'Yogyakarta - Solo', 'Lempuyangan', 'Purwosari', '2017-04-11 11:00:00', '2017-04-11 12:30:00', 'Eksekutif', 30000),
('KA145', 'Tawang Ekspress', 'Semarang - Jakarta', 'Tawang', 'Gambir', '2017-04-11 04:30:00', '2017-04-11 12:40:00', 'Bisnis', 144000),
('KA146', 'Tawang Ekspres', 'Jakarta - Semarang', 'Gambir', 'Tawang', '2017-04-11 16:00:00', '2017-04-12 00:10:00', 'Bisnis', 144000),
('KA147', 'Argo Kencana Eksekutif', 'Semarang - Surabaya', 'Poncol', 'Gubeng', '2017-04-11 03:00:00', '2017-04-11 11:00:00', 'Eksekutif', 175000),
('KA148', 'Argo Kencana Eksekutif', 'Surabaya - Semarang', 'Gubeng', 'Poncol', '2017-04-11 15:00:00', '2017-04-11 23:00:00', 'Eksekutif', 175000),
('KA149', 'Sindoro', 'Solo - Semarang', 'Balapan', 'Tawang', '2017-04-11 06:00:00', '2017-04-11 09:00:00', 'Bisnis', 15000),
('KA150', 'Sindoro', 'Semarang - Solo', 'Tawang', 'Balapan', '2017-04-11 12:00:00', '2017-04-11 15:00:00', 'Bisnis', 15000),
('KA151', 'Argo Lawu Eksekutif', 'Solo - Jakarta', 'Balapan', 'Gambir', '2017-04-12 04:00:00', '2017-04-12 15:45:00', 'Eksekutif', 150000),
('KA152', 'Argo Lawu Bisnis', 'Solo - Jakarta', 'Purwosari', 'Pasar Senen', '2017-04-12 05:00:00', '2017-04-12 16:45:00', 'Bisnis', 100000),
('KA153', 'Argo Lawu Eksekutif', 'Jakarta - Solo', 'Gambir', 'Balapan', '2017-04-12 16:00:00', '2017-04-13 03:45:00', 'Eksekutif', 150000),
('KA154', 'Argo Lawu Bisnis', 'Jakarta - Solo', 'Pasar Senen', 'Purwosari', '2017-04-12 17:00:00', '2017-04-13 04:45:00', 'Bisnis', 100000),
('KA155', 'Sembrani Eksekutif', 'Surabaya - Jakarta', 'Pasar Turi', 'Pasar Senen', '2017-04-12 02:00:00', '2017-04-12 13:45:00', 'Eksekutif', 200000),
('KA156', 'Sembrani Bisnis', 'Surabaya - Jakarta', 'Gubeng', 'Gambir', '2017-04-12 05:00:00', '2017-04-12 16:45:00', 'Bisnis', 150000),
('KA157', 'Sembrani Eksekutif', 'Jakarta - Surabaya', 'Pasar Senen', 'Pasar Turi', '2017-04-12 14:00:00', '2017-04-13 01:45:00', 'Eksekutif', 200000),
('KA158', 'Sembrani Bisnis', 'Jakarta - Surabaya', 'Gambir', 'Gubeng', '2017-04-12 17:00:00', '2017-04-13 04:45:00', 'Bisnis', 150000),
('KA159', 'Lodaya Eksekutif', 'Bandung - Solo', 'Bandung Kota', 'Balapan', '2017-04-12 05:00:00', '2017-04-12 15:00:00', 'Eksekutif', 140000),
('KA160', 'Lodaya Bisnis', 'Bandung - Solo', 'Bandung Kota', 'Purwosari', '2017-04-12 04:00:00', '2017-04-12 14:00:00', 'Bisnis', 80000),
('KA161', 'Lodaya Eksekutif', 'Solo - Bandung', 'Balapan', 'Bandung Kota', '2017-04-12 17:00:00', '2017-04-13 03:00:00', 'Eksekutif', 140000),
('KA162', 'Lodaya Bisnis', 'Solo - Bandung', 'Purwosari', 'Bandung Kota', '2017-04-12 16:00:00', '2017-04-13 02:00:00', 'Bisnis', 80000),
('KA163', 'Malabar Eksekutif', 'Malang - Bandung', 'Malang Kota', 'Bandung Kota', '2017-04-12 10:00:00', '2017-04-12 21:45:00', 'Eksekutif', 220000),
('KA164', 'Malabar Bisnis', 'Malang - Bandung', 'Malang Kota', 'Bandung Kota', '2017-04-12 12:00:00', '2017-04-12 23:45:00', 'Bisnis', 150000),
('KA165', 'Malabar Eksekutif', 'Bandung - Malang', 'Bandung Kota', 'Malang Kota', '2017-04-12 22:00:00', '2017-04-13 09:45:00', 'Eksekutif', 220000),
('KA166', 'Malabar Bisnis', 'Bandung - Malang', 'Bandung Kota', 'Malang Kota', '2017-04-13 00:00:00', '2017-04-13 11:45:00', 'Bisnis', 150000),
('KA167', 'Malioboro Ekspres Eksekutif', 'Yogyakarta - Malang', 'Tugu', 'Malang Kota', '2017-04-12 06:00:00', '2017-04-12 16:00:00', 'Eksekutif', 180000),
('KA168', 'Malioboro Ekspres Bisnis', 'Yogyakarta - Malang', 'Lempuyangan', 'Malang Kota', '2017-04-12 08:00:00', '2017-04-12 18:00:00', 'Bisnis', 120000),
('KA169', 'Malioboro Ekspress Eksekutif', 'Malang - Yogyakarta', 'Malang Kota', 'Tugu', '2017-04-12 18:00:00', '2017-04-13 04:00:00', 'Eksekutif', 180000),
('KA170', 'Malioboro Ekspres Bisnis', 'Malang - Yogyakarta', 'Malang Kota', 'Lempuyangan', '2017-04-12 20:00:00', '2017-04-13 06:00:00', 'Bisnis', 120000),
('KA171', 'Prameks', 'Solo - Yogyakarta', 'Balapan', 'Tugu', '2017-04-12 07:00:00', '2017-04-12 09:00:00', 'Bisnis', 10000),
('KA172', 'Prameks', 'Yogyakarta - Solo', 'Tugu', 'Balapan', '2017-04-12 10:00:00', '2017-04-12 12:00:00', 'Bisnis', 10000),
('KA173', 'Solo Ekspres', 'Solo - Yogyakarta', 'Purwosari', 'Lempuyangan', '2017-04-12 08:00:00', '2017-04-12 09:30:00', 'Eksekutif', 30000),
('KA174', 'Solo Ekspres', 'Yogyakarta - Solo', 'Lempuyangan', 'Purwosari', '2017-04-12 11:00:00', '2017-04-12 12:30:00', 'Eksekutif', 30000),
('KA175', 'Tawang Ekspress', 'Semarang - Jakarta', 'Tawang', 'Gambir', '2017-04-12 04:30:00', '2017-04-12 12:40:00', 'Bisnis', 144000),
('KA176', 'Tawang Ekspres', 'Jakarta - Semarang', 'Gambir', 'Tawang', '2017-04-12 16:00:00', '2017-04-13 00:10:00', 'Bisnis', 144000),
('KA177', 'Argo Kencana Eksekutif', 'Semarang - Surabaya', 'Poncol', 'Gubeng', '2017-04-12 03:00:00', '2017-04-12 11:00:00', 'Eksekutif', 175000),
('KA178', 'Argo Kencana Eksekutif', 'Surabaya - Semarang', 'Gubeng', 'Poncol', '2017-04-12 15:00:00', '2017-04-12 23:00:00', 'Eksekutif', 175000),
('KA179', 'Sindoro', 'Solo - Semarang', 'Balapan', 'Tawang', '2017-04-12 06:00:00', '2017-04-12 09:00:00', 'Bisnis', 15000),
('KA180', 'Sindoro', 'Semarang - Solo', 'Tawang', 'Balapan', '2017-04-12 12:00:00', '2017-04-12 15:00:00', 'Bisnis', 15000),
('KA181', 'Argo Lawu Eksekutif', 'Solo - Jakarta', 'Balapan', 'Gambir', '2017-04-13 04:00:00', '2017-04-13 15:45:00', 'Eksekutif', 150000),
('KA182', 'Argo Lawu Bisnis', 'Solo - Jakarta', 'Purwosari', 'Pasar Senen', '2017-04-13 05:00:00', '2017-04-13 16:45:00', 'Bisnis', 100000),
('KA183', 'Argo Lawu Eksekutif', 'Jakarta - Solo', 'Gambir', 'Balapan', '2017-04-13 16:00:00', '2017-04-14 03:45:00', 'Eksekutif', 150000),
('KA184', 'Argo Lawu Bisnis', 'Jakarta - Solo', 'Pasar Senen', 'Purwosari', '2017-04-13 17:00:00', '2017-04-14 04:45:00', 'Bisnis', 100000),
('KA185', 'Sembrani Eksekutif', 'Surabaya - Jakarta', 'Pasar Turi', 'Pasar Senen', '2017-04-13 02:00:00', '2017-04-13 13:45:00', 'Eksekutif', 200000),
('KA186', 'Sembrani Bisnis', '', 'Gubeng', 'Gambir', '0000-00-00 00:00:00', '0000-00-00 00:00:00', 'Bisnis', 150000),
('KA187', 'Sembrani Eksekutif', 'Jakarta - Surabaya', 'Pasar Senen', 'Pasar Turi', '0000-00-00 00:00:00', '0000-00-00 00:00:00', 'Eksekutif', 200000),
('KA188', 'Sembrani Bisnis', 'Jakarta - Surabaya', 'Gambir', 'Gubeng', '0000-00-00 00:00:00', '0000-00-00 00:00:00', 'Bisnis', 150000),
('KA189', 'Lodaya Eksekutif', 'Bandung - Solo', 'Bandung Kota', 'Balapan', '2017-04-13 05:00:00', '2017-04-13 15:00:00', 'Eksekutif', 140000),
('KA190', 'Lodaya Bisnis', 'Bandung - Solo', 'Bandung Kota', 'Purwosari', '2017-04-13 04:00:00', '2017-04-13 14:00:00', 'Bisnis', 80000),
('KA191', 'Lodaya Eksekutif', 'Solo - Bandung', 'Balapan', 'Bandung Kota', '2017-04-13 17:00:00', '2017-04-14 03:00:00', 'Eksekutif', 140000),
('KA192', 'Lodaya Bisnis', 'Solo - Bandung', 'Purwosari', 'Bandung Kota', '2017-04-13 16:00:00', '2017-04-14 02:00:00', 'Bisnis', 80000),
('KA193', 'Malabar Eksekutif', 'Malang - Bandung', 'Malang Kota', 'Bandung Kota', '2017-04-13 10:00:00', '2017-04-13 21:45:00', 'Eksekutif', 220000),
('KA194', 'Malabar Bisnis', 'Malang - Bandung', 'Malang Kota', 'Bandung Kota', '2017-04-13 12:00:00', '2017-04-13 23:45:00', 'Bisnis', 150000),
('KA195', 'Malabar Eksekutif', 'Bandung - Malang', 'Bandung Kota', 'Malang Kota', '2017-04-13 22:00:00', '2017-04-14 09:45:00', 'Eksekutif', 220000),
('KA196', 'Malabar Bisnis', 'Bandung - Malang', 'Bandung Kota', 'Malang Kota', '2017-04-14 00:00:00', '2017-04-14 11:45:00', 'Bisnis', 150000),
('KA197', 'Malioboro Ekspres Eksekutif', 'Yogyakarta - Malang', 'Tugu', 'Malang Kota', '2017-04-13 06:00:00', '2017-04-13 16:00:00', 'Eksekutif', 180000),
('KA198', 'Malioboro Ekspres Bisnis', 'Yogyakarta - Malang', 'Lempuyangan', 'Malang Kota', '2017-04-13 08:00:00', '2017-04-13 18:00:00', 'Bisnis', 120000),
('KA199', 'Malioboro Ekspress Eksekutif', 'Malang - Yogyakarta', 'Malang Kota', 'Tugu', '2017-04-13 18:00:00', '2017-04-14 04:00:00', 'Eksekutif', 180000),
('KA200', 'Malioboro Ekspres Bisnis', 'Malang - Yogyakarta', 'Malang Kota', 'Lempuyangan', '2017-04-13 20:00:00', '2017-04-14 06:00:00', 'Bisnis', 120000),
('KA201', 'Prameks', 'Solo - Yogyakarta', 'Balapan', 'Tugu', '2017-04-13 07:00:00', '2017-04-13 09:00:00', 'Bisnis', 10000),
('KA202', 'Prameks', 'Yogyakarta - Solo', 'Tugu', 'Balapan', '2017-04-13 10:00:00', '2017-04-13 12:00:00', 'Bisnis', 10000),
('KA203', 'Solo Ekspres', 'Solo - Yogyakarta', 'Purwosari', 'Lempuyangan', '2017-04-13 08:00:00', '2017-04-13 09:30:00', 'Eksekutif', 30000),
('KA204', 'Solo Ekspres', 'Yogyakarta - Solo', 'Lempuyangan', 'Purwosari', '2017-04-13 11:00:00', '2017-04-04 12:30:00', 'Eksekutif', 30000),
('KA205', 'Tawang Ekspress', 'Semarang - Jakarta', 'Tawang', 'Gambir', '2017-04-13 04:30:00', '2017-04-13 12:40:00', 'Bisnis', 144000),
('KA206', 'Tawang Ekspres', 'Jakarta - Semarang', 'Gambir', 'Tawang', '2017-04-13 16:00:00', '2017-04-14 00:10:00', 'Bisnis', 144000),
('KA207', 'Argo Kencana Eksekutif', 'Semarang - Surabaya', 'Poncol', 'Gubeng', '2017-04-13 03:00:00', '2017-04-13 11:00:00', 'Eksekutif', 175000),
('KA208', 'Argo Kencana Eksekutif', 'Surabaya - Semarang', 'Gubeng', 'Poncol', '2017-04-13 15:00:00', '2017-04-13 23:00:00', 'Eksekutif', 175000),
('KA209', 'Sindoro', 'Solo - Semarang', 'Balapan', 'Tawang', '2017-04-13 06:00:00', '2017-04-13 09:00:00', 'Bisnis', 15000),
('KA210', 'Sindoro', 'Semarang - Solo', 'Tawang', 'Balapan', '2017-04-13 12:00:00', '2017-04-13 15:00:00', 'Bisnis', 15000),
('KA211', 'Argo Lawu Eksekutif', 'Solo - Jakarta', 'Balapan', 'Gambir', '2017-04-14 04:00:00', '2017-04-14 15:45:00', 'Eksekutif', 150000),
('KA212', 'Argo Lawu Bisnis', 'Solo - Jakarta', 'Purwosari', 'Pasar Senen', '2017-04-14 05:00:00', '2017-04-14 16:45:00', 'Bisnis', 100000),
('KA213', 'Argo Lawu Eksekutif', 'Jakarta - Solo', 'Gambir', 'Balapan', '2017-04-14 16:00:00', '2017-04-15 03:45:00', 'Eksekutif', 150000),
('KA214', 'Argo Lawu Bisnis', 'Jakarta - Solo', 'Pasar Senen', 'Purwosari', '2017-04-14 17:00:00', '2017-04-15 04:45:00', 'Bisnis', 100000),
('KA215', 'Sembrani Eksekutif', 'Surabaya - Jakarta', 'Pasar Turi', 'Pasar Senen', '2017-04-14 02:00:00', '2017-04-14 13:40:00', 'Eksekutif', 200000),
('KA216', 'Sembrani Bisnis', 'Surabaya - Jakarta', 'Gubeng', 'Gambir', '2017-04-14 05:00:00', '2017-04-14 15:30:00', 'Bisnis', 150000),
('KA217', 'Sembrani Eksekutif', 'Jakarta - Surabaya', 'Pasar Senen', 'Pasar Turi', '2017-04-14 14:00:00', '2017-04-15 01:30:00', 'Eksekutif', 200000),
('KA218', 'Sembrani Bisnis', 'Jakarta - Surabaya', 'Gambir', 'Gubeng', '2017-04-14 16:00:00', '2017-04-15 04:30:00', 'Bisnis', 150000),
('KA219', 'Lodaya Eksekutif', 'Bandung - Solo', 'Bandung Kota', 'Balapan', '2017-04-14 05:00:00', '2017-04-14 15:00:00', 'Eksekutif', 140000),
('KA220', 'Lodaya Bisnis', 'Bandung - Solo', 'Bandung Kota', 'Purwosari', '2017-04-14 04:00:00', '2017-04-14 04:00:00', 'Bisnis', 80000),
('KA221', 'Lodaya Eksekutif', 'Solo - Bandung', 'Balapan', 'Bandung Kota', '2017-04-14 17:00:00', '2017-04-15 03:00:00', 'Eksekutif', 140000),
('KA222', 'Lodaya Bisnis', 'Solo - Bandung', 'Purwosari', 'Bandung Kota', '2017-04-14 16:00:00', '2017-04-15 02:00:00', 'Bisnis', 80000),
('KA223', 'Malabar Eksekutif', 'Malang - Bandung', 'Malang Kota', 'Bandung Kota', '2017-04-14 10:00:00', '2017-04-14 21:45:00', 'Eksekutif', 220000),
('KA224', 'Malabar Bisnis', 'Malang - Bandung', 'Malang Kota', 'Bandung Kota', '2017-04-14 12:00:00', '2017-04-14 23:45:00', 'Bisnis', 150000),
('KA225', 'Malabar Eksekutif', 'Bandung - Malang', 'Bandung Kota', 'Malang Kota', '2017-04-14 22:00:00', '2017-04-15 09:45:00', 'Eksekutif', 220000),
('KA226', 'Malabar Bisnis', 'Bandung - Malang', 'Bandung Kota', 'Malang Kota', '2017-04-15 00:00:00', '2017-04-15 11:45:00', 'Bisnis', 150000),
('KA227', 'Malioboro Ekspres Eksekutif', 'Yogyakarta - Malang', 'Tugu', 'Malang Kota', '2017-04-14 06:00:00', '2017-04-14 16:00:00', 'Eksekutif', 180000),
('KA228', 'Malioboro Ekspres Bisnis', 'Yogyakarta - Malang', 'Lempuyangan', 'Malang Kota', '2017-04-14 08:00:00', '2017-04-14 18:00:00', 'Bisnis', 120000),
('KA229', 'Malioboro Ekspress Eksekutif', 'Malang - Yogyakarta', 'Malang Kota', 'Tugu', '2017-04-14 18:00:00', '2017-04-15 04:00:00', 'Eksekutif', 180000),
('KA230', 'Malioboro Ekspres Bisnis', 'Malang - Yogyakarta', 'Malang Kota', 'Lempuyangan', '2017-04-14 20:00:00', '2017-04-15 06:00:00', 'Bisnis', 120000),
('KA231', 'Prameks', 'Solo - Yogyakarta', 'Balapan', 'Tugu', '2017-04-14 07:00:00', '2017-04-14 09:00:00', 'Bisnis', 10000),
('KA232', 'Prameks', 'Yogyakarta - Solo', 'Tugu', 'Balapan', '2017-04-14 10:00:00', '2017-04-14 12:00:00', 'Bisnis', 10000),
('KA233', 'Solo Ekspres', 'Solo - Yogyakarta', 'Purwosari', 'Lempuyangan', '2017-04-14 08:00:00', '2017-04-14 09:30:00', 'Eksekutif', 30000),
('KA234', 'Solo Ekspres', 'Yogyakarta - Solo', 'Lempuyangan', 'Purwosari', '2017-04-14 11:00:00', '2017-04-14 12:30:00', 'Eksekutif', 30000),
('KA235', 'Tawang Ekspress', 'Semarang - Jakarta', 'Tawang', 'Gambir', '2017-04-14 04:30:00', '2017-04-14 12:40:00', 'Bisnis', 144000),
('KA236', 'Tawang Ekspres', 'Jakarta - Semarang', 'Gambir', 'Tawang', '2017-04-14 16:00:00', '2017-04-15 00:10:00', 'Bisnis', 144000),
('KA237', 'Argo Kencana Eksekutif', 'Semarang - Surabaya', 'Poncol', 'Gubeng', '2017-04-14 03:00:00', '2017-04-14 11:00:00', 'Eksekutif', 175000),
('KA238', 'Argo Kencana Eksekutif', 'Surabaya - Semarang', 'Gubeng', 'Poncol', '2017-04-14 15:00:00', '2017-04-14 23:00:00', 'Eksekutif', 175000),
('KA239', 'Sindoro', 'Solo - Semarang', 'Balapan', 'Tawang', '2017-04-14 06:00:00', '2017-04-14 09:00:00', 'Bisnis', 15000),
('KA240', 'Sindoro', 'Semarang - Solo', 'Tawang', 'Balapan', '2017-04-14 12:00:00', '2017-04-14 15:00:00', 'Bisnis', 15000),
('KA241', 'Prameks', 'Solo - Yogyakarta', 'Balapan', 'Tugu', '2017-04-07 13:00:00', '2017-04-07 15:00:00', 'Bisnis', 10000),
('KA242', 'Prameks', 'Yogyakarta - Solo', 'Tugu', 'Balapan', '2017-04-07 16:00:00', '2017-04-07 18:00:00', 'Bisnis', 10000),
('KA243', 'Prameks', 'Solo - Yogyakarta', 'Balapan', 'Tugu', '2017-04-08 13:00:00', '2017-04-08 15:00:00', 'Bisnis', 10000),
('KA244', 'Prameks', 'Yogyakarta - Solo', 'Tugu', 'Balapan', '2017-04-08 16:00:00', '2017-04-08 18:00:00', 'Bisnis', 10000),
('KA245', 'Prameks', 'Solo - Yogyakarta', 'Balapan', 'Tugu', '2017-04-09 13:00:00', '2017-04-09 15:00:00', 'Bisnis', 10000),
('KA246', 'Prameks', 'Yogyakarta - Solo', 'Tugu', 'Balapan', '2017-04-09 16:00:00', '2017-04-09 18:00:00', 'Bisnis', 10000),
('KA247', 'Prameks', 'Solo - Yogyakarta', 'Balapan', 'Tugu', '2017-04-10 13:00:00', '2017-04-10 15:00:00', 'Bisnis', 10000),
('KA248', 'Prameks', 'Yogyakarta - Solo', 'Tugu', 'Balapan', '2017-04-10 16:00:00', '2017-04-10 18:00:00', 'Bisnis', 10000),
('KA249', 'Prameks', 'Solo - Yogyakarta', 'Balapan', 'Tugu', '2017-04-11 13:00:00', '2017-04-11 15:00:00', 'Bisnis', 10000),
('KA250', 'Prameks', 'Yogyakarta - Solo', 'Tugu', 'Balapan', '2017-04-11 16:00:00', '2017-04-11 18:00:00', 'Bisnis', 10000),
('KA251', 'Prameks', 'Solo - Yogyakarta', 'Balapan', 'Tugu', '2017-04-12 13:00:00', '2017-04-12 15:00:00', 'Bisnis', 10000),
('KA252', 'Prameks', 'Yogyakarta - Solo', 'Tugu', 'Balapan', '2017-04-12 16:00:00', '2017-04-12 18:00:00', 'Bisnis', 10000),
('KA253', 'Prameks', 'Solo - Yogyakarta', 'Balapan', 'Tugu', '2017-04-13 13:00:00', '2017-04-13 15:00:00', 'Bisnis', 10000),
('KA254', 'Prameks', 'Yogyakarta - Solo', 'Tugu', 'Balapan', '2017-04-13 16:00:00', '2017-04-13 18:00:00', 'Bisnis', 10000),
('KA255', 'Prameks', 'Solo - Yogyakarta', 'Balapan', 'Tugu', '2017-04-14 13:00:00', '2017-04-14 15:00:00', 'Bisnis', 10000),
('KA256', 'Prameks', 'Yogyakarta - Solo', 'Tugu', 'Balapan', '2017-04-14 16:00:00', '2017-04-14 18:00:00', 'Bisnis', 10000);

-- --------------------------------------------------------

--
-- Table structure for table `tb_transaksi`
--

CREATE TABLE `tb_transaksi` (
  `id_transaksi` varchar(45) NOT NULL,
  `id_kereta` varchar(45) NOT NULL,
  `id_user` varchar(45) NOT NULL,
  `Keberangkatan` datetime NOT NULL,
  `Kelas` varchar(45) NOT NULL,
  `Harga` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `tb_user`
--

CREATE TABLE `tb_user` (
  `no_identitas` varchar(45) NOT NULL,
  `Nama_user` varchar(45) NOT NULL,
  `Alamat` varchar(45) NOT NULL,
  `No_hp` varchar(45) NOT NULL,
  `email` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_user`
--

INSERT INTO `tb_user` (`no_identitas`, `Nama_user`, `Alamat`, `No_hp`, `email`) VALUES
('235742874892', 'era susanti', 'dalangan sumogawe getasan', '08975385714971', 'era@gmail.com'),
('337204150919980001', 'Lingga Alfius', 'Karanganyar', '085728119672', '');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tb_adm`
--
ALTER TABLE `tb_adm`
  ADD PRIMARY KEY (`kode_admin`);

--
-- Indexes for table `tb_kereta`
--
ALTER TABLE `tb_kereta`
  ADD PRIMARY KEY (`id_kereta`);

--
-- Indexes for table `tb_user`
--
ALTER TABLE `tb_user`
  ADD PRIMARY KEY (`no_identitas`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
