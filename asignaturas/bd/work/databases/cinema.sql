-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 24, 2023 at 05:02 PM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `cinema`
--

DELIMITER $$
--
-- Procedures
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `rutina` (OUT `actor_name` VARCHAR(200))   SELECT *
FROM actors$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `actors`
--

CREATE TABLE `actors` (
  `actor_id` int(11) NOT NULL,
  `actor_forename` varchar(50) DEFAULT NULL,
  `actor_surname` varchar(200) DEFAULT NULL,
  `actor_birthday` date DEFAULT NULL,
  `actor_phone` varchar(30) DEFAULT NULL,
  `actor_email` varchar(255) DEFAULT NULL,
  `actor_height` double(2,1) DEFAULT NULL,
  `actor_skin` varchar(10) DEFAULT NULL,
  `actor_race` varchar(25) DEFAULT NULL,
  `actor_salary` double(5,2) DEFAULT NULL,
  `actor_skills` varchar(255) DEFAULT NULL,
  `actor_genre` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `actors`
--

INSERT INTO `actors` (`actor_id`, `actor_forename`, `actor_surname`, `actor_birthday`, `actor_phone`, `actor_email`, `actor_height`, `actor_skin`, `actor_race`, `actor_salary`, `actor_skills`, `actor_genre`) VALUES
(1, 'Chris', 'Rock', '1965-02-07', '+1 202-918-2132', 'realchrisrock@gmail.com', 1.8, 'Black', 'Negroide', 450.25, 'Funny, Black, Funny', 'Male'),
(2, 'Will', 'Smith', '1968-07-25', '+1 323-927-3936', 'realwillsmith@gmail.com', 1.9, 'Black', 'Negroide', 999.99, 'Funny, Black, Smart', 'Male'),
(3, 'Jennifer', 'Lawrence', '1990-08-15', '+1 505-646-5662', 'jennifer5678lawrence@gmail.com', 1.8, 'White', 'White', 333.00, 'Women, Pretty, Women', 'Female'),
(4, 'Brad', 'Pitt', '1963-12-18', '+1 505-317-2288', 'williambradleypitt1963@gmail.com', 1.8, 'White', 'White', 123.00, 'Rich, Pretty, Brad Pitt', 'Male'),
(5, 'George', 'Clooney', '1961-05-06', '+1 240-213-6485', 'georgeclooneyreal@gmail.com', 1.8, 'White', 'White', 123.00, 'George, Rich, Clooney', 'Male');

-- --------------------------------------------------------

--
-- Table structure for table `characters`
--

CREATE TABLE `characters` (
  `character_id` int(11) NOT NULL,
  `character_name` varchar(255) DEFAULT NULL,
  `character_personality` varchar(200) DEFAULT NULL,
  `character_height` double(3,2) DEFAULT NULL,
  `character_race` varchar(25) DEFAULT NULL,
  `character_movie` int(11) DEFAULT NULL,
  `character_weight` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `movies`
--

CREATE TABLE `movies` (
  `movie_id` int(11) NOT NULL,
  `movie_name` varchar(255) DEFAULT NULL,
  `movie_genre` varchar(255) DEFAULT NULL,
  `movie_director` varchar(255) DEFAULT NULL,
  `movie_duration` time DEFAULT NULL,
  `movie_score` double(2,1) DEFAULT NULL,
  `movie_year` year(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `movies`
--

INSERT INTO `movies` (`movie_id`, `movie_name`, `movie_genre`, `movie_director`, `movie_duration`, `movie_score`, `movie_year`) VALUES
(1, 'Avatar', 'Action, Adventure, Science Fiction, Fantasy', 'James Cameron', '00:02:46', 7.9, 2009),
(2, 'Scarface', 'Drama, Murder', 'Brian de Palma', '00:02:50', 8.3, 1983),
(3, 'The Wolf of Wall Street', 'Comedy, Murder, Biography', 'Martin Scorsease', '00:03:00', 8.2, 2013),
(4, 'Avengers: Endgame', 'Action, Adventure, Drame', 'Anthony Russo, Joe Russo', '03:01:00', 8.4, 2019);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `actors`
--
ALTER TABLE `actors`
  ADD PRIMARY KEY (`actor_id`);

--
-- Indexes for table `characters`
--
ALTER TABLE `characters`
  ADD PRIMARY KEY (`character_id`),
  ADD KEY `character_movie` (`character_movie`);

--
-- Indexes for table `movies`
--
ALTER TABLE `movies`
  ADD PRIMARY KEY (`movie_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `actors`
--
ALTER TABLE `actors`
  MODIFY `actor_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `characters`
--
ALTER TABLE `characters`
  MODIFY `character_id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `movies`
--
ALTER TABLE `movies`
  MODIFY `movie_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `characters`
--
ALTER TABLE `characters`
  ADD CONSTRAINT `characters_ibfk_1` FOREIGN KEY (`character_movie`) REFERENCES `movies` (`movie_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
