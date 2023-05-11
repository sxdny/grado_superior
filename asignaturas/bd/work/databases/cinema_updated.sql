-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 25-01-2023 a las 16:33:24
-- Versión del servidor: 10.4.27-MariaDB
-- Versión de PHP: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `cinema`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `actors`
--

CREATE TABLE `actors` (
  `actor_id` int(11) NOT NULL,
  `actor_forename` varchar(255) DEFAULT NULL,
  `actor_surname` varchar(255) DEFAULT NULL,
  `actor_birthday` date DEFAULT NULL,
  `actor_email` varchar(255) DEFAULT NULL,
  `actor_height` decimal(3,2) DEFAULT NULL,
  `actor_weight` decimal(6,2) DEFAULT NULL,
  `actor_skin` varchar(100) DEFAULT NULL,
  `actor_race` varchar(100) DEFAULT NULL,
  `actor_languages` varchar(255) DEFAULT NULL,
  `actor_skills` varchar(255) DEFAULT NULL,
  `actor_salary` decimal(12,2) DEFAULT NULL,
  `actor_personality` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `actors`
--

INSERT INTO `actors` (`actor_id`, `actor_forename`, `actor_surname`, `actor_birthday`, `actor_email`, `actor_height`, `actor_weight`, `actor_skin`, `actor_race`, `actor_languages`, `actor_skills`, `actor_salary`, `actor_personality`) VALUES
(1, 'Brad', 'Pitt', '1963-12-18', 'realbradpitt@tutanota.com', '1.80', '85.20', 'White', 'White', 'English, French, Spanish', 'Handsome, Strong, Athletic', '30000000.00', 'Badass, Sympathetic, Chill');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `characters`
--

CREATE TABLE `characters` (
  `character_id` int(11) NOT NULL,
  `character_forename` varchar(255) DEFAULT NULL,
  `character_surname` varchar(255) DEFAULT NULL,
  `character_age` int(100) DEFAULT NULL,
  `character_height` decimal(3,2) DEFAULT NULL,
  `character_weight` decimal(6,2) DEFAULT NULL,
  `character_skin` varchar(100) DEFAULT NULL,
  `character_race` varchar(100) DEFAULT NULL,
  `character_movie` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `genres`
--

CREATE TABLE `genres` (
  `genre_id` int(11) NOT NULL,
  `genre_name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `movies`
--

CREATE TABLE `movies` (
  `movie_id` int(11) NOT NULL,
  `movie_name` varchar(255) DEFAULT NULL,
  `movie_genre` varchar(255) DEFAULT NULL,
  `movie_director` varchar(255) DEFAULT NULL,
  `movie_income` varchar(255) DEFAULT NULL,
  `movie_score` decimal(3,2) DEFAULT NULL,
  `movie_duration` time DEFAULT NULL,
  `movie_TVcertification` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `movies`
--

INSERT INTO `movies` (`movie_id`, `movie_name`, `movie_genre`, `movie_director`, `movie_income`, `movie_score`, `movie_duration`, `movie_TVcertification`) VALUES
(1, 'Avengers: Endgame', 'Action, Adventure, Drama', 'Anthony Russo, Joe Russo', '2800 millones de dolares', '8.40', '03:01:00', '7'),
(2, 'Avatar', 'Action, Adventure, Fantasy', 'James Cameron', '2900 millones de dolares', '7.90', '02:42:00', '7'),
(3, 'Ocean\'s Eleven', 'Crime, Suspense', 'Steven Soderbergh', '1200 millones de dolares', '7.70', '01:56:00', '18'),
(4, 'Scarface', 'Crime, Drame', 'Brian De Palma', '2100 millones de dolares', '8.30', '02:50:00', '18'),
(5, 'Avatar: The Way of Water', 'Action, Adventure, Fantasy', 'James Cameron', '1920 millones de dolares', '7.80', '03:12:00', '12'),
(6, 'Knight of Cups', 'Comedy, Drama', 'Alejandro G. Iñárritu', '970 millones de dolares', '7.70', '01:59:00', '16'),
(7, 'Pig', 'Mistery, Drama', 'Michael Sarnoski', '780 millones de dolares', '6.90', '01:32:00', '12'),
(8, 'A Hidden Life', 'Biography, Drama, Romance', 'Terreck Malick', '880 millones de dolares', '7.40', '02:54:00', '7'),
(9, 'Lost in Translation', 'Comedy, Drama', 'Sofia Coppola', '1200 millones de dolares', '7.70', '01:42:00', '13'),
(10, 'Titanic', 'Drama, Romance', 'James Cameron', '2002 millones de dolares', '7.90', '03:14:00', '13'),
(11, 'Black Panther', 'Action, Adventure, Science Fiction', 'Ryan Coogler', '1300 millones de dolares', '7.30', '02:14:00', '12'),
(12, 'Independence Day', 'Action, Adventure, Science Fiction', 'Roland Emmerich', '820 millones de dolares', '7.00', '02:25:00', '7'),
(13, 'The Shawshank Redemption', 'Drama', 'Frank Darabont', '1400 millones de dolares', '9.30', '02:22:00', '13'),
(14, 'The Godfather', 'Crime, Drama', 'Frank Ford Coppola', '1700 millones de dolares', '9.20', '02:55:00', '18'),
(15, 'Fight Club', 'Drama', 'David Fincher', '2000 millones de dolares', '8.80', '02:19:00', '18'),
(16, 'Matrix', 'Action, Science Fiction', 'Lana Wachowski, Lilly Wachowski', '2200 millones de dolares', '8.70', '02:16:00', '18'),
(17, 'The Empire Strikes Back', 'Action, Adventure, Fantasy', 'Irvin Kershner', '1700 millones de dolares', '8.70', '02:04:00', 'A'),
(18, 'Interstellar', 'Drama, Adventure, Science Fiction', 'Cristopher Nolan', '1900 millones de dolares', '8.60', '02:49:00', '12'),
(19, 'Gladiator', 'Action, Adventure, Drama', 'Ridley Scott', '1980 millones de dolares', '8.50', '02:35:00', '12'),
(20, 'Joker', 'Crime, Drama, Suspense', 'Todd Phillips', '1780 millones de dolares', '8.40', '02:02:00', '18');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `actors`
--
ALTER TABLE `actors`
  ADD PRIMARY KEY (`actor_id`);

--
-- Indices de la tabla `characters`
--
ALTER TABLE `characters`
  ADD PRIMARY KEY (`character_id`),
  ADD KEY `character_movie` (`character_movie`);

--
-- Indices de la tabla `genres`
--
ALTER TABLE `genres`
  ADD PRIMARY KEY (`genre_id`);

--
-- Indices de la tabla `movies`
--
ALTER TABLE `movies`
  ADD PRIMARY KEY (`movie_id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `actors`
--
ALTER TABLE `actors`
  MODIFY `actor_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `characters`
--
ALTER TABLE `characters`
  MODIFY `character_id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `genres`
--
ALTER TABLE `genres`
  MODIFY `genre_id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `movies`
--
ALTER TABLE `movies`
  MODIFY `movie_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `characters`
--
ALTER TABLE `characters`
  ADD CONSTRAINT `characters_ibfk_1` FOREIGN KEY (`character_movie`) REFERENCES `movies` (`movie_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
