-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 12-06-2023 a las 12:27:17
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `hotel`
--

DELIMITER $$
--
-- Procedimientos
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `randomReservations` ()   BEGIN

DECLARE date1 DATE;
DECLARE date2 DATE;
DECLARE room INT DEFAULT 0;
DECLARE precio INT DEFAULT 0;

SELECT FLOOR(1 + (RAND() * 100)) INTO room;

SELECT habitaciones.precio FROM habitaciones WHERE id = room LIMIT 1 INTO precio;

SET date1 = randomDATE();
SET date2 = randomDATE();

WHILE (DATEDIFF(date2, date1) < 1) DO
	SET date1 = randomDATE();
	SET date2 = randomDATE();
END WHILE;

INSERT INTO reservas (id_reserva, id_habitacion, id_cliente, data_entrada, data_salida, precio_inicial, precio_final, estado, json_servicios)
VALUES
(DEFAULT, room, (FLOOR(1 + (RAND() * 500))), date1, date2, precio, (precio + FLOOR(10 + (RAND() * 300))),"Check-in",trueValuesJSON(room));
END$$

--
-- Funciones
--
CREATE DEFINER=`root`@`localhost` FUNCTION `randomDATE` () RETURNS DATE  RETURN (SELECT CURDATE() - INTERVAL FLOOR(RAND() * 14) DAY)$$

CREATE DEFINER=`root`@`localhost` FUNCTION `trueValuesJSON` (`var_id_room` INT) RETURNS LONGTEXT CHARSET utf8mb4 COLLATE utf8mb4_bin  BEGIN

DECLARE len INT DEFAULT 0;
DECLARE json_len INT DEFAULT 0;
DECLARE json JSON;
DECLARE result JSON;
DECLARE j INT DEFAULT 0;

SET result = JSON_ARRAY();
SET json = JSON_ARRAY();
SET len = (SELECT COUNT(*) FROM habitaciones);

SET json = (SELECT JSON_SEARCH(json_caracteristicas, 'all', '1') FROM habitaciones WHERE id = var_id_room);
SET json_len = JSON_LENGTH(json, '$');
	WHILE j < json_len DO
		SELECT JSON_ARRAY_INSERT( result, CONCAT('$[',j,']') , REPLACE(JSON_UNQUOTE(JSON_EXTRACT(json,CONCAT('$[',j,']'))), '$.', '') ) INTO result;
		SET j = j + 1;
	END WHILE;
RETURN result;

END$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE `clientes` (
  `id` int(11) NOT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `DNI` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `telefono` varchar(255) DEFAULT NULL,
  `metodo_pago` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `clientes`
--

INSERT INTO `clientes` (`id`, `nombre`, `DNI`, `email`, `telefono`, `metodo_pago`) VALUES
(1, 'Pedro García', '270606463', 'PGarcía@hotmail.com', '921057739', 'Transferencia'),
(2, 'Pedro Gómez', '654430564', 'PGómez@outlook.com', '989067770', 'Tarjeta'),
(3, 'Pedro García', '471146074', 'PGarcía@gmail.com', '963676456', 'Tarjeta'),
(4, 'Pedro García', '307181323', 'PGarcía@yahoo.com', '933920919', 'PayPal'),
(5, 'Pedro Gómez', '140777364', 'PGómez@hotmail.com', '951383531', 'Transferencia'),
(6, 'Pedro García', '498736994', 'PGarcía@outlook.com', '953637752', 'Tarjeta'),
(7, 'Pedro Gómez', '230492451', 'PGómez@yahoo.com', '937050429', 'Tarjeta'),
(8, 'Pedro Gómez', '680466614', 'PGómez@yahoo.com', '917329888', 'PayPal'),
(9, 'Pedro García', '596282804', 'PGarcía@hotmail.com', '997055919', 'Transferencia'),
(10, 'Pedro Gómez', '192483541', 'PGómez@gmail.com', '963365011', 'Transferencia'),
(11, 'Pedro García', '706791661', 'PGarcía@yahoo.com', '954480533', 'Tarjeta'),
(12, 'Pedro García', '545590954', 'PGarcía@yahoo.com', '963599591', 'PayPal'),
(13, 'Pedro Gómez', '664245281', 'PGómez@outlook.com', '963764894', 'Transferencia'),
(14, 'Pedro García', '563716051', 'PGarcía@gmail.com', '987627207', 'Transferencia'),
(15, 'Pedro Gómez', '934917162', 'PGómez@yahoo.com', '916252653', 'Tarjeta'),
(16, 'Pedro Gómez', '906658831', 'PGómez@hotmail.com', '935252770', 'PayPal'),
(17, 'Pedro García', '941917091', 'PGarcía@outlook.com', '978911610', 'Transferencia'),
(18, 'Pedro Gómez', '261658482', 'PGómez@gmail.com', '930780030', 'Transferencia'),
(19, 'Pedro García', '533513282', 'PGarcía@yahoo.com', '976001822', 'Tarjeta'),
(20, 'Pedro García', '252887321', 'PGarcía@hotmail.com', '991356477', 'PayPal'),
(21, 'Pedro Gómez', '402820462', 'PGómez@outlook.com', '922465848', 'Transferencia'),
(22, 'Pedro García', '953944222', 'PGarcía@gmail.com', '977083885', 'Transferencia'),
(23, 'Pedro Gómez', '796054703', 'PGómez@yahoo.com', '942127348', 'Tarjeta'),
(24, 'Pedro Gómez', '408138972', 'PGómez@hotmail.com', '910209958', 'PayPal'),
(25, 'Pedro García', '653932382', 'PGarcía@outlook.com', '956681441', 'Transferencia'),
(26, 'Pedro Gómez', '983243113', 'PGómez@gmail.com', '918942889', 'Transferencia'),
(27, 'Pedro García', '926164353', 'PGarcía@yahoo.com', '961647169', 'Tarjeta'),
(28, 'Pedro García', '711850202', 'PGarcía@hotmail.com', '973248422', 'PayPal'),
(29, 'Pedro Gómez', '413596023', 'PGómez@outlook.com', '932979593', 'Transferencia'),
(30, 'Pedro García', '643144533', 'PGarcía@gmail.com', '914126505', 'Transferencia'),
(31, 'Pedro Gómez', '379991384', 'PGómez@yahoo.com', '970379595', 'Tarjeta'),
(32, 'Pedro Gómez', '891358313', 'PGómez@hotmail.com', '974902151', 'PayPal'),
(33, 'Pedro García', '199458043', 'PGarcía@outlook.com', '960204267', 'Transferencia'),
(34, 'Pedro Gómez', '434035404', 'PGómez@gmail.com', '952105776', 'Transferencia'),
(35, 'Pedro García', '772487494', 'PGarcía@yahoo.com', '991291847', 'Tarjeta'),
(36, 'Pedro García', '129485623', 'PGarcía@hotmail.com', '995801597', 'PayPal'),
(37, 'Pedro Gómez', '304020834', 'PGómez@outlook.com', '921829034', 'Transferencia'),
(38, 'Pedro García', '456343794', 'PGarcía@gmail.com', '994036396', 'Transferencia'),
(39, 'Pedro Gómez', '656246911', 'PGómez@hotmail.com', '929100293', 'Tarjeta'),
(40, 'Pedro Gómez', '285458574', 'PGómez@hotmail.com', '999281242', 'PayPal'),
(41, 'Pedro García', '845345394', 'PGarcía@outlook.com', '970403720', 'Transferencia'),
(42, 'Pedro Gómez', '202289611', 'PGómez@yahoo.com', '977498804', 'Transferencia'),
(43, 'Pedro García', '627487031', 'PGarcía@hotmail.com', '977454261', 'Tarjeta'),
(44, 'Pedro García', '697996984', 'PGarcía@hotmail.com', '963741310', 'PayPal'),
(45, 'Pedro Gómez', '452971891', 'PGómez@gmail.com', '954152331', 'PayPal'),
(46, 'Pedro García', '284884681', 'PGarcía@yahoo.com', '960224924', 'Transferencia'),
(47, 'Pedro Gómez', '817300602', 'PGómez@hotmail.com', '982556073', 'Tarjeta'),
(48, 'Pedro Gómez', '662638861', 'PGómez@outlook.com', '976809453', 'PayPal'),
(49, 'Pedro García', '877494141', 'PGarcía@gmail.com', '982673383', 'PayPal'),
(50, 'Pedro Gómez', '477186052', 'PGómez@yahoo.com', '945610104', 'Transferencia'),
(51, 'Pedro García', '836059332', 'PGarcía@hotmail.com', '935928477', 'Tarjeta'),
(52, 'Pedro García', '240046851', 'PGarcía@outlook.com', '954305932', 'PayPal'),
(53, 'Pedro Gómez', '996000092', 'PGómez@gmail.com', '991553739', 'PayPal'),
(54, 'Pedro García', '958750352', 'PGarcía@yahoo.com', '931901957', 'Transferencia'),
(55, 'Pedro Gómez', '922883003', 'PGómez@hotmail.com', '911008358', 'Tarjeta'),
(56, 'Pedro Gómez', '218700992', 'PGómez@outlook.com', '998850887', 'PayPal'),
(57, 'Pedro García', '879217142', 'PGarcía@gmail.com', '971170904', 'PayPal'),
(58, 'Pedro Gómez', '757458363', 'PGómez@yahoo.com', '917269110', 'Transferencia'),
(59, 'Pedro García', '804869073', 'PGarcía@hotmail.com', '997152879', 'Tarjeta'),
(60, 'Pedro García', '528466292', 'PGarcía@outlook.com', '954934245', 'PayPal'),
(61, 'Pedro Gómez', '848235183', 'PGómez@gmail.com', '926284138', 'PayPal'),
(62, 'Pedro García', '217767543', 'PGarcía@yahoo.com', '939586071', 'Transferencia'),
(63, 'Pedro Gómez', '290536284', 'PGómez@hotmail.com', '968146974', 'Tarjeta'),
(64, 'Pedro García', '217275653', 'PGarcía@gmail.com', '961514006', 'PayPal'),
(65, 'Pedro Gómez', '811956724', 'PGómez@yahoo.com', '933865194', 'Transferencia'),
(66, 'Pedro García', '905495784', 'PGarcía@hotmail.com', '976714740', 'Tarjeta'),
(67, 'Pedro Gómez', '635296261', 'PGómez@gmail.com', '957578740', 'Tarjeta'),
(68, 'Pedro Gómez', '801054294', 'PGómez@gmail.com', '981050276', 'PayPal'),
(69, 'Pedro García', '902484044', 'PGarcía@yahoo.com', '995121587', 'Transferencia'),
(70, 'Pedro Gómez', '237799971', 'PGómez@outlook.com', '970380633', 'Tarjeta'),
(71, 'Pedro García', '270747131', 'PGarcía@gmail.com', '968114672', 'Tarjeta'),
(72, 'Pedro García', '886609454', 'PGarcía@gmail.com', '985880376', 'PayPal'),
(73, 'Pedro Gómez', '812578751', 'PGómez@hotmail.com', '927126482', 'Transferencia'),
(74, 'Pedro García', '152570391', 'PGarcía@outlook.com', '931702640', 'Tarjeta'),
(75, 'Pedro Gómez', '286500172', 'PGómez@gmail.com', '997337126', 'Tarjeta'),
(76, 'Pedro Gómez', '601472761', 'PGómez@yahoo.com', '948253276', 'PayPal'),
(77, 'Pedro García', '928802121', 'PGarcía@hotmail.com', '966933297', 'Transferencia'),
(78, 'Pedro Gómez', '604359752', 'PGómez@outlook.com', '981317616', 'Tarjeta'),
(79, 'Pedro García', '597535232', 'PGarcía@gmail.com', '993427269', 'Tarjeta'),
(80, 'Pedro García', '746798201', 'PGarcía@yahoo.com', '916167287', 'PayPal'),
(81, 'Pedro Gómez', '417058602', 'PGómez@hotmail.com', '913571545', 'Transferencia'),
(82, 'Pedro García', '600850072', 'PGarcía@outlook.com', '939640952', 'Tarjeta'),
(83, 'Pedro Gómez', '301678403', 'PGómez@gmail.com', '953842613', 'Tarjeta'),
(84, 'Pedro Gómez', '124654352', 'PGómez@yahoo.com', '996963096', 'PayPal'),
(85, 'Pedro García', '277723412', 'PGarcía@hotmail.com', '925573996', 'Transferencia'),
(86, 'Pedro Gómez', '856500533', 'PGómez@outlook.com', '980668320', 'Tarjeta'),
(87, 'Pedro García', '264091053', 'PGarcía@gmail.com', '918817519', 'Tarjeta'),
(88, 'Pedro García', '282485292', 'PGarcía@yahoo.com', '913160158', 'PayPal'),
(89, 'Pedro Gómez', '238946103', 'PGómez@hotmail.com', '927322500', 'Transferencia'),
(90, 'Pedro García', '242999973', 'PGarcía@outlook.com', '976384121', 'Tarjeta'),
(91, 'Pedro Gómez', '721827904', 'PGómez@gmail.com', '961017735', 'Tarjeta'),
(92, 'Pedro Gómez', '490223823', 'PGómez@yahoo.com', '954412511', 'PayPal'),
(93, 'Pedro García', '984646532', 'PGarcía@gmail.com', '933263303', 'Efectivo'),
(94, 'Pedro García', '908711472', 'PGarcía@outlook.com', '932086960', 'Efectivo'),
(95, 'Pedro Gómez', '308169843', 'PGómez@gmail.com', '922884051', 'Efectivo'),
(96, 'Pedro Gómez', '493577323', 'PGómez@outlook.com', '984160733', 'Efectivo'),
(97, 'Pedro García', '117024893', 'PGarcía@gmail.com', '981510812', 'Efectivo'),
(98, 'Pedro García', '211349013', 'PGarcía@outlook.com', '961599976', 'Efectivo'),
(99, 'Pedro Gómez', '311415054', 'PGómez@gmail.com', '914685153', 'Efectivo'),
(100, 'Pedro Gómez', '359368174', 'PGómez@outlook.com', '946266530', 'Efectivo'),
(101, 'Pedro García', '986696974', 'PGarcía@gmail.com', '987822206', 'Efectivo'),
(102, 'Pedro García', '476872254', 'PGarcía@outlook.com', '958638141', 'Efectivo'),
(103, 'Pedro Gómez', '873260361', 'PGómez@yahoo.com', '977815317', 'Efectivo'),
(104, 'Pedro García', '210798891', 'PGarcía@yahoo.com', '943282875', 'Efectivo'),
(105, 'Pedro Gómez', '465433052', 'PGómez@yahoo.com', '990345455', 'Efectivo'),
(106, 'Pedro García', '446550792', 'PGarcía@yahoo.com', '987310219', 'Efectivo'),
(107, 'Pedro Gómez', '709867723', 'PGómez@yahoo.com', '998694677', 'Efectivo'),
(108, 'Pedro García', '367961013', 'PGarcía@yahoo.com', '982111264', 'Efectivo'),
(109, 'Pedro Gómez', '643836774', 'PGómez@yahoo.com', '980164449', 'Efectivo'),
(110, 'Pedro García', '646647594', 'PGarcía@yahoo.com', '987715609', 'Efectivo'),
(111, 'Pedro Gómez', '854834131', 'PGómez@hotmail.com', '950767409', 'Efectivo'),
(112, 'Pedro García', '392512791', 'PGarcía@hotmail.com', '964445226', 'Efectivo'),
(113, 'Pedro Gómez', '644266682', 'PGómez@hotmail.com', '978712515', 'Efectivo'),
(114, 'Pedro García', '185960892', 'PGarcía@hotmail.com', '990915586', 'Efectivo'),
(115, 'Pedro Gómez', '590272703', 'PGómez@outlook.com', '998336099', 'PayPal'),
(116, 'Pedro Gómez', '821174913', 'PGómez@hotmail.com', '993434769', 'Efectivo'),
(117, 'Pedro García', '761755303', 'PGarcía@outlook.com', '979174795', 'PayPal'),
(118, 'Pedro García', '618208083', 'PGarcía@hotmail.com', '931933559', 'Efectivo'),
(119, 'Pedro Gómez', '849221754', 'PGómez@outlook.com', '978863701', 'PayPal'),
(120, 'Pedro Gómez', '135490874', 'PGómez@hotmail.com', '999254227', 'Efectivo'),
(121, 'Pedro García', '463059694', 'PGarcía@outlook.com', '953111376', 'PayPal'),
(122, 'Pedro García', '318032744', 'PGarcía@hotmail.com', '985027812', 'Efectivo'),
(123, 'Pedro Gómez', '982666891', 'PGómez@gmail.com', '982308968', 'Efectivo'),
(124, 'Pedro Gómez', '914942521', 'PGómez@outlook.com', '950534463', 'Efectivo'),
(125, 'Pedro García', '164810771', 'PGarcía@gmail.com', '935338565', 'Efectivo'),
(126, 'Pedro García', '537428471', 'PGarcía@outlook.com', '916532272', 'Efectivo'),
(127, 'Pedro Gómez', '769971062', 'PGómez@gmail.com', '963230403', 'Efectivo'),
(128, 'Pedro Gómez', '909014722', 'PGómez@outlook.com', '978646024', 'Efectivo'),
(129, 'María López', '929322264', 'MLópez@gmail.com', '982184383', 'Tarjeta'),
(130, 'María López', '555584393', 'MLópez@yahoo.com', '977776569', 'PayPal'),
(131, 'María Martínez', '682090763', 'MMartínez@hotmail.com', '960051218', 'Transferencia'),
(132, 'María López', '406475324', 'MLópez@outlook.com', '950895334', 'Tarjeta'),
(133, 'María Martínez', '709412094', 'MMartínez@gmail.com', '926682528', 'Tarjeta'),
(134, 'María Martínez', '396713943', 'MMartínez@yahoo.com', '941390891', 'PayPal'),
(135, 'María López', '716348054', 'MLópez@hotmail.com', '997044162', 'Transferencia'),
(136, 'María Martínez', '774167134', 'MMartínez@outlook.com', '965573215', 'Tarjeta'),
(137, 'María López', '173336471', 'MLópez@yahoo.com', '962894789', 'Tarjeta'),
(138, 'María López', '973511424', 'MLópez@yahoo.com', '942877389', 'PayPal'),
(139, 'María Martínez', '845203914', 'MMartínez@hotmail.com', '977167003', 'Transferencia'),
(140, 'María López', '546907271', 'MLópez@gmail.com', '981926617', 'Transferencia'),
(141, 'María Martínez', '624035101', 'MMartínez@yahoo.com', '995089026', 'Tarjeta'),
(142, 'María Martínez', '712729154', 'MMartínez@yahoo.com', '997691038', 'PayPal'),
(143, 'María López', '233203731', 'MLópez@outlook.com', '980046433', 'Transferencia'),
(144, 'María Martínez', '859269041', 'MMartínez@gmail.com', '948772480', 'Transferencia'),
(145, 'María López', '103355112', 'MLópez@yahoo.com', '995088283', 'Tarjeta'),
(146, 'María López', '178384411', 'MLópez@hotmail.com', '953372216', 'PayPal'),
(147, 'María Martínez', '812083931', 'MMartínez@outlook.com', '935406492', 'Transferencia'),
(148, 'María López', '973589052', 'MLópez@gmail.com', '921496653', 'Transferencia'),
(149, 'María Martínez', '711291792', 'MMartínez@yahoo.com', '946794417', 'Tarjeta'),
(150, 'María Martínez', '581272071', 'MMartínez@hotmail.com', '978103335', 'PayPal'),
(151, 'María López', '938247162', 'MLópez@outlook.com', '944675562', 'Transferencia'),
(152, 'María Martínez', '686840712', 'MMartínez@gmail.com', '993722704', 'Transferencia'),
(153, 'María López', '382233883', 'MLópez@yahoo.com', '983535994', 'Tarjeta'),
(154, 'María López', '108765402', 'MLópez@hotmail.com', '992644729', 'PayPal'),
(155, 'María Martínez', '718354062', 'MMartínez@outlook.com', '932265842', 'Transferencia'),
(156, 'María López', '755562623', 'MLópez@gmail.com', '982141573', 'Transferencia'),
(157, 'María Martínez', '686530683', 'MMartínez@yahoo.com', '999239954', 'Tarjeta'),
(158, 'María Martínez', '732064982', 'MMartínez@hotmail.com', '953408494', 'PayPal'),
(159, 'María López', '858534193', 'MLópez@outlook.com', '985765236', 'Transferencia'),
(160, 'María Martínez', '288158863', 'MMartínez@gmail.com', '979714480', 'Transferencia'),
(161, 'María López', '131466924', 'MLópez@yahoo.com', '999232127', 'Tarjeta'),
(162, 'María López', '381235483', 'MLópez@hotmail.com', '956812287', 'PayPal'),
(163, 'María Martínez', '260098503', 'MMartínez@outlook.com', '993075066', 'Transferencia'),
(164, 'María López', '100229864', 'MLópez@gmail.com', '936353923', 'Transferencia'),
(165, 'María Martínez', '894389304', 'MMartínez@yahoo.com', '999776534', 'Tarjeta'),
(166, 'María Martínez', '729291543', 'MMartínez@hotmail.com', '977103979', 'PayPal'),
(167, 'María López', '257456574', 'MLópez@outlook.com', '948283388', 'Transferencia'),
(168, 'María Martínez', '606781064', 'MMartínez@gmail.com', '968123779', 'Transferencia'),
(169, 'María López', '250206351', 'MLópez@hotmail.com', '988153912', 'Tarjeta'),
(170, 'María López', '192222484', 'MLópez@hotmail.com', '954733053', 'PayPal'),
(171, 'María Martínez', '166698004', 'MMartínez@outlook.com', '995014052', 'Transferencia'),
(172, 'María López', '569627771', 'MLópez@yahoo.com', '959541034', 'Transferencia'),
(173, 'María Martínez', '968431191', 'MMartínez@hotmail.com', '937976794', 'Tarjeta'),
(174, 'María Martínez', '704774194', 'MMartínez@hotmail.com', '980540643', 'PayPal'),
(175, 'María López', '284531091', 'MLópez@gmail.com', '946450999', 'PayPal'),
(176, 'María Martínez', '205181021', 'MMartínez@yahoo.com', '954247449', 'Transferencia'),
(177, 'María López', '959069932', 'MLópez@hotmail.com', '912433220', 'Tarjeta'),
(178, 'María López', '488515241', 'MLópez@outlook.com', '984679679', 'PayPal'),
(179, 'María Martínez', '266261291', 'MMartínez@gmail.com', '978636571', 'PayPal'),
(180, 'María López', '230572712', 'MLópez@yahoo.com', '961094241', 'Transferencia'),
(181, 'María Martínez', '596404952', 'MMartínez@hotmail.com', '957033388', 'Tarjeta'),
(182, 'María Martínez', '546944021', 'MMartínez@outlook.com', '954097338', 'PayPal'),
(183, 'María López', '353715532', 'MLópez@gmail.com', '978426355', 'PayPal'),
(184, 'María Martínez', '587767792', 'MMartínez@yahoo.com', '993337311', 'Transferencia'),
(185, 'María López', '869667093', 'MLópez@hotmail.com', '934074283', 'Tarjeta'),
(186, 'María López', '729536082', 'MLópez@outlook.com', '993661585', 'PayPal'),
(187, 'María Martínez', '908495742', 'MMartínez@gmail.com', '980613021', 'PayPal'),
(188, 'María López', '834935593', 'MLópez@yahoo.com', '960959106', 'Transferencia'),
(189, 'María Martínez', '416347403', 'MMartínez@hotmail.com', '927894856', 'Tarjeta'),
(190, 'María Martínez', '614590492', 'MMartínez@outlook.com', '936843298', 'PayPal'),
(191, 'María López', '416266793', 'MLópez@gmail.com', '961603698', 'PayPal'),
(192, 'María Martínez', '114094733', 'MMartínez@yahoo.com', '964061763', 'Transferencia'),
(193, 'María López', '398747594', 'MLópez@hotmail.com', '993887201', 'Tarjeta'),
(194, 'María Martínez', '549306703', 'MMartínez@gmail.com', '964034425', 'PayPal'),
(195, 'María López', '156520814', 'MLópez@yahoo.com', '937966809', 'Transferencia'),
(196, 'María Martínez', '536114524', 'MMartínez@hotmail.com', '918959604', 'Tarjeta'),
(197, 'María López', '677331341', 'MLópez@gmail.com', '917380650', 'Tarjeta'),
(198, 'María López', '691260514', 'MLópez@gmail.com', '967082241', 'PayPal'),
(199, 'María Martínez', '592039974', 'MMartínez@yahoo.com', '964216365', 'Transferencia'),
(200, 'María López', '918613681', 'MLópez@outlook.com', '934165082', 'Tarjeta'),
(201, 'María Martínez', '711530031', 'MMartínez@gmail.com', '937939915', 'Tarjeta'),
(202, 'María Martínez', '524830944', 'MMartínez@gmail.com', '922301510', 'PayPal'),
(203, 'María López', '491966631', 'MLópez@hotmail.com', '967272362', 'Transferencia'),
(204, 'María Martínez', '762622211', 'MMartínez@outlook.com', '976938316', 'Tarjeta'),
(205, 'María López', '697741882', 'MLópez@gmail.com', '981979592', 'Tarjeta'),
(206, 'María López', '450605861', 'MLópez@yahoo.com', '984452542', 'PayPal'),
(207, 'María Martínez', '485842361', 'MMartínez@hotmail.com', '938345887', 'Transferencia'),
(208, 'María López', '140650892', 'MLópez@outlook.com', '916367675', 'Tarjeta'),
(209, 'María Martínez', '244235462', 'MMartínez@gmail.com', '916118872', 'Tarjeta'),
(210, 'María Martínez', '822878491', 'MMartínez@yahoo.com', '945422904', 'PayPal'),
(211, 'María López', '628303962', 'MLópez@hotmail.com', '950375587', 'Transferencia'),
(212, 'María Martínez', '837736712', 'MMartínez@outlook.com', '982100036', 'Tarjeta'),
(213, 'María López', '470613803', 'MLópez@gmail.com', '993922438', 'Tarjeta'),
(214, 'María López', '999630812', 'MLópez@yahoo.com', '984041555', 'PayPal'),
(215, 'María Martínez', '335729022', 'MMartínez@hotmail.com', '983921346', 'Transferencia'),
(216, 'María López', '636297393', 'MLópez@outlook.com', '928914289', 'Tarjeta'),
(217, 'María Martínez', '748628583', 'MMartínez@gmail.com', '935002391', 'Tarjeta'),
(218, 'María Martínez', '109344992', 'MMartínez@yahoo.com', '939649887', 'PayPal'),
(219, 'María López', '389151693', 'MLópez@hotmail.com', '949758761', 'Transferencia'),
(220, 'María Martínez', '299602043', 'MMartínez@outlook.com', '992979512', 'Tarjeta'),
(221, 'María López', '508976152', 'MLópez@outlook.com', '996574138', 'Efectivo'),
(222, 'María Martínez', '872850162', 'MMartínez@gmail.com', '959629952', 'Efectivo'),
(223, 'María Martínez', '441536442', 'MMartínez@outlook.com', '914898009', 'Efectivo'),
(224, 'María López', '234916593', 'MLópez@gmail.com', '987248162', 'Efectivo'),
(225, 'María López', '709564603', 'MLópez@outlook.com', '930421308', 'Efectivo'),
(226, 'María Martínez', '300779353', 'MMartínez@gmail.com', '942249490', 'Efectivo'),
(227, 'María Martínez', '334363163', 'MMartínez@outlook.com', '964349943', 'Efectivo'),
(228, 'María López', '452435014', 'MLópez@gmail.com', '993520962', 'Efectivo'),
(229, 'María López', '646200674', 'MLópez@outlook.com', '910045370', 'Efectivo'),
(230, 'María Martínez', '993660034', 'MMartínez@gmail.com', '941573041', 'Efectivo'),
(231, 'María Martínez', '409057964', 'MMartínez@outlook.com', '968105468', 'Efectivo'),
(232, 'María López', '959128781', 'MLópez@yahoo.com', '983930435', 'Efectivo'),
(233, 'María Martínez', '828390161', 'MMartínez@yahoo.com', '959410596', 'Efectivo'),
(234, 'María López', '993694932', 'MLópez@yahoo.com', '977497230', 'Efectivo'),
(235, 'María Martínez', '442060982', 'MMartínez@yahoo.com', '921482526', 'Efectivo'),
(236, 'María López', '118648773', 'MLópez@yahoo.com', '934643963', 'Efectivo'),
(237, 'María Martínez', '870126383', 'MMartínez@yahoo.com', '975205894', 'Efectivo'),
(238, 'María López', '706615714', 'MLópez@yahoo.com', '949570681', 'Efectivo'),
(239, 'María Martínez', '558149544', 'MMartínez@yahoo.com', '940389804', 'Efectivo'),
(240, 'María López', '224929281', 'MLópez@hotmail.com', '999171338', 'Efectivo'),
(241, 'María Martínez', '922806231', 'MMartínez@hotmail.com', '926952841', 'Efectivo'),
(242, 'María López', '725081362', 'MLópez@hotmail.com', '977083577', 'Efectivo'),
(243, 'María Martínez', '240336072', 'MMartínez@hotmail.com', '936397711', 'Efectivo'),
(244, 'María López', '150774753', 'MLópez@outlook.com', '975307302', 'PayPal'),
(245, 'María López', '470335843', 'MLópez@hotmail.com', '971160056', 'Efectivo'),
(246, 'María Martínez', '602653533', 'MMartínez@outlook.com', '943930441', 'PayPal'),
(247, 'María Martínez', '489329293', 'MMartínez@hotmail.com', '948978250', 'Efectivo'),
(248, 'María López', '306075404', 'MLópez@outlook.com', '915734463', 'PayPal'),
(249, 'María López', '127128954', 'MLópez@hotmail.com', '913095162', 'Efectivo'),
(250, 'María Martínez', '185998404', 'MMartínez@outlook.com', '966942928', 'PayPal'),
(251, 'María Martínez', '963355164', 'MMartínez@hotmail.com', '914349034', 'Efectivo'),
(252, 'María López', '705575621', 'MLópez@gmail.com', '917702286', 'Efectivo'),
(253, 'María López', '672091351', 'MLópez@outlook.com', '977844026', 'Efectivo'),
(254, 'María Martínez', '235957021', 'MMartínez@gmail.com', '988878162', 'Efectivo'),
(255, 'María Martínez', '443264101', 'MMartínez@outlook.com', '946667831', 'Efectivo'),
(256, 'María López', '600622002', 'MLópez@gmail.com', '959130778', 'Efectivo'),
(257, 'Juan Gómez', '627749734', 'JGómez@outlook.com', '933985170', 'Tarjeta'),
(258, 'Juan García', '966742214', 'JGarcía@gmail.com', '960185401', 'Tarjeta'),
(259, 'Juan García', '365583883', 'JGarcía@yahoo.com', '933406018', 'PayPal'),
(260, 'Juan Gómez', '276093734', 'JGómez@hotmail.com', '963961013', 'Transferencia'),
(261, 'Juan García', '912686094', 'JGarcía@outlook.com', '921406335', 'Tarjeta'),
(262, 'Juan Gómez', '463870511', 'JGómez@yahoo.com', '957206258', 'Tarjeta'),
(263, 'Juan Gómez', '411697034', 'JGómez@yahoo.com', '968265757', 'PayPal'),
(264, 'Juan García', '918229034', 'JGarcía@hotmail.com', '943683577', 'Transferencia'),
(265, 'Juan Gómez', '685543401', 'JGómez@gmail.com', '915724576', 'Transferencia'),
(266, 'Juan García', '464460411', 'JGarcía@yahoo.com', '960590713', 'Tarjeta'),
(267, 'Juan García', '143544414', 'JGarcía@yahoo.com', '986441601', 'PayPal'),
(268, 'Juan Gómez', '574070111', 'JGómez@outlook.com', '988055654', 'Transferencia'),
(269, 'Juan García', '353259601', 'JGarcía@gmail.com', '943240893', 'Transferencia'),
(270, 'Juan Gómez', '575816142', 'JGómez@yahoo.com', '948672402', 'Tarjeta'),
(271, 'Juan Gómez', '543621491', 'JGómez@hotmail.com', '913248081', 'PayPal'),
(272, 'Juan García', '276272481', 'JGarcía@outlook.com', '960079894', 'Transferencia'),
(273, 'Juan Gómez', '172559252', 'JGómez@gmail.com', '919947966', 'Transferencia'),
(274, 'Juan García', '437101362', 'JGarcía@yahoo.com', '912086529', 'Tarjeta'),
(275, 'Juan García', '373361361', 'JGarcía@hotmail.com', '970836564', 'PayPal'),
(276, 'Juan Gómez', '127296542', 'JGómez@outlook.com', '933057254', 'Transferencia'),
(277, 'Juan García', '847327222', 'JGarcía@gmail.com', '939134253', 'Transferencia'),
(278, 'Juan Gómez', '226733333', 'JGómez@yahoo.com', '982063635', 'Tarjeta'),
(279, 'Juan Gómez', '697893662', 'JGómez@hotmail.com', '914914863', 'PayPal'),
(280, 'Juan García', '360629412', 'JGarcía@outlook.com', '913532077', 'Transferencia'),
(281, 'Juan Gómez', '266058013', 'JGómez@gmail.com', '910150601', 'Transferencia'),
(282, 'Juan García', '332548403', 'JGarcía@yahoo.com', '988604587', 'Tarjeta'),
(283, 'Juan García', '292107892', 'JGarcía@hotmail.com', '970411547', 'PayPal'),
(284, 'Juan Gómez', '458397123', 'JGómez@outlook.com', '988281899', 'Transferencia'),
(285, 'Juan García', '116369663', 'JGarcía@gmail.com', '941077411', 'Transferencia'),
(286, 'Juan Gómez', '550072434', 'JGómez@yahoo.com', '915983970', 'Tarjeta'),
(287, 'Juan Gómez', '245784153', 'JGómez@hotmail.com', '952224327', 'PayPal'),
(288, 'Juan García', '546719673', 'JGarcía@outlook.com', '924087322', 'Transferencia'),
(289, 'Juan Gómez', '803950644', 'JGómez@gmail.com', '929889239', 'Transferencia'),
(290, 'Juan García', '175557254', 'JGarcía@yahoo.com', '980378173', 'Tarjeta'),
(291, 'Juan García', '120347013', 'JGarcía@hotmail.com', '917128829', 'PayPal'),
(292, 'Juan Gómez', '380332654', 'JGómez@outlook.com', '915479974', 'Transferencia'),
(293, 'Juan García', '147037534', 'JGarcía@gmail.com', '926906126', 'Transferencia'),
(294, 'Juan Gómez', '651354531', 'JGómez@hotmail.com', '980153310', 'Tarjeta'),
(295, 'Juan Gómez', '389325724', 'JGómez@hotmail.com', '962506268', 'PayPal'),
(296, 'Juan García', '988428894', 'JGarcía@outlook.com', '963033317', 'Transferencia'),
(297, 'Juan Gómez', '758180151', 'JGómez@yahoo.com', '970991767', 'Transferencia'),
(298, 'Juan García', '605687121', 'JGarcía@hotmail.com', '910634565', 'Tarjeta'),
(299, 'Juan García', '144771994', 'JGarcía@hotmail.com', '999950470', 'PayPal'),
(300, 'Juan Gómez', '608898731', 'JGómez@gmail.com', '924884513', 'PayPal'),
(301, 'Juan García', '588940281', 'JGarcía@yahoo.com', '950794676', 'Transferencia'),
(302, 'Juan Gómez', '226514662', 'JGómez@hotmail.com', '936597123', 'Tarjeta'),
(303, 'Juan Gómez', '957411391', 'JGómez@outlook.com', '963528200', 'PayPal'),
(304, 'Juan García', '317967881', 'JGarcía@gmail.com', '961014077', 'PayPal'),
(305, 'Juan Gómez', '898018542', 'JGómez@yahoo.com', '920364642', 'Transferencia'),
(306, 'Juan García', '445879302', 'JGarcía@hotmail.com', '987856938', 'Tarjeta'),
(307, 'Juan García', '754179411', 'JGarcía@outlook.com', '963174618', 'PayPal'),
(308, 'Juan Gómez', '601086352', 'JGómez@gmail.com', '998808103', 'PayPal'),
(309, 'Juan García', '245951172', 'JGarcía@yahoo.com', '934306870', 'Transferencia'),
(310, 'Juan Gómez', '998780453', 'JGómez@hotmail.com', '942044623', 'Tarjeta'),
(311, 'Juan Gómez', '112844072', 'JGómez@outlook.com', '952701482', 'PayPal'),
(312, 'Juan García', '294906922', 'JGarcía@gmail.com', '930992708', 'PayPal'),
(313, 'Juan Gómez', '745615123', 'JGómez@yahoo.com', '982071637', 'Transferencia'),
(314, 'Juan García', '525879323', 'JGarcía@hotmail.com', '940329372', 'Tarjeta'),
(315, 'Juan García', '803150472', 'JGarcía@outlook.com', '944143575', 'PayPal'),
(316, 'Juan Gómez', '664916913', 'JGómez@gmail.com', '956666053', 'PayPal'),
(317, 'Juan García', '614323013', 'JGarcía@yahoo.com', '937329564', 'Transferencia'),
(318, 'Juan Gómez', '691231134', 'JGómez@hotmail.com', '986328200', 'Tarjeta'),
(319, 'Juan García', '965770903', 'JGarcía@gmail.com', '975955952', 'PayPal'),
(320, 'Juan Gómez', '992819454', 'JGómez@yahoo.com', '937724252', 'Transferencia'),
(321, 'Juan García', '251466444', 'JGarcía@hotmail.com', '999055031', 'Tarjeta'),
(322, 'Juan Gómez', '200449101', 'JGómez@gmail.com', '982910458', 'Tarjeta'),
(323, 'Juan Gómez', '206585844', 'JGómez@gmail.com', '978774440', 'PayPal'),
(324, 'Juan García', '864820684', 'JGarcía@yahoo.com', '969663840', 'Transferencia'),
(325, 'Juan Gómez', '676525831', 'JGómez@outlook.com', '942619478', 'Tarjeta'),
(326, 'Juan García', '313909211', 'JGarcía@gmail.com', '912725004', 'Tarjeta'),
(327, 'Juan García', '270826184', 'JGarcía@gmail.com', '948274880', 'PayPal'),
(328, 'Juan Gómez', '474994571', 'JGómez@hotmail.com', '943433915', 'Transferencia'),
(329, 'Juan García', '566466531', 'JGarcía@outlook.com', '984146695', 'Tarjeta'),
(330, 'Juan Gómez', '695164282', 'JGómez@gmail.com', '941123518', 'Tarjeta'),
(331, 'Juan Gómez', '439034001', 'JGómez@yahoo.com', '978608122', 'PayPal'),
(332, 'Juan García', '650536361', 'JGarcía@hotmail.com', '965225474', 'Transferencia'),
(333, 'Juan Gómez', '676931012', 'JGómez@outlook.com', '919349269', 'Tarjeta'),
(334, 'Juan García', '711555682', 'JGarcía@gmail.com', '993747588', 'Tarjeta'),
(335, 'Juan García', '971377151', 'JGarcía@yahoo.com', '989218620', 'PayPal'),
(336, 'Juan Gómez', '359061822', 'JGómez@hotmail.com', '958647513', 'Transferencia'),
(337, 'Juan García', '192454112', 'JGarcía@outlook.com', '938739811', 'Tarjeta'),
(338, 'Juan Gómez', '115259153', 'JGómez@gmail.com', '971903980', 'Tarjeta'),
(339, 'Juan Gómez', '271218472', 'JGómez@yahoo.com', '977815865', 'PayPal'),
(340, 'Juan García', '381402292', 'JGarcía@hotmail.com', '999842392', 'Transferencia'),
(341, 'Juan Gómez', '257701513', 'JGómez@outlook.com', '978594525', 'Tarjeta'),
(342, 'Juan García', '891809933', 'JGarcía@gmail.com', '940551101', 'Tarjeta'),
(343, 'Juan García', '484374602', 'JGarcía@yahoo.com', '941632850', 'PayPal'),
(344, 'Juan Gómez', '276204783', 'JGómez@hotmail.com', '921440485', 'Transferencia'),
(345, 'Juan García', '754593573', 'JGarcía@outlook.com', '932890710', 'Tarjeta'),
(346, 'Juan Gómez', '674824364', 'JGómez@gmail.com', '957221300', 'Tarjeta'),
(347, 'Juan Gómez', '171724283', 'JGómez@yahoo.com', '914446342', 'PayPal'),
(348, 'Juan García', '365101243', 'JGarcía@hotmail.com', '921018197', 'Transferencia'),
(349, 'Juan García', '491115922', 'JGarcía@outlook.com', '946549854', 'Efectivo'),
(350, 'Juan Gómez', '900020053', 'JGómez@gmail.com', '912746834', 'Efectivo'),
(351, 'Juan Gómez', '239758463', 'JGómez@outlook.com', '951386983', 'Efectivo'),
(352, 'Juan García', '725036003', 'JGarcía@gmail.com', '954388842', 'Efectivo'),
(353, 'Juan García', '379281183', 'JGarcía@outlook.com', '930467269', 'Efectivo'),
(354, 'Juan Gómez', '934788514', 'JGómez@gmail.com', '973902585', 'Efectivo'),
(355, 'Juan Gómez', '395412194', 'JGómez@outlook.com', '938375339', 'Efectivo'),
(356, 'Juan García', '831209574', 'JGarcía@gmail.com', '928575292', 'Efectivo'),
(357, 'Juan García', '310302774', 'JGarcía@outlook.com', '949638794', 'Efectivo'),
(358, 'Juan Gómez', '164678371', 'JGómez@yahoo.com', '990149507', 'Efectivo'),
(359, 'Juan García', '524666941', 'JGarcía@yahoo.com', '965198754', 'Efectivo'),
(360, 'Juan Gómez', '291777062', 'JGómez@yahoo.com', '946444966', 'Efectivo'),
(361, 'Juan García', '587587342', 'JGarcía@yahoo.com', '955607699', 'Efectivo'),
(362, 'Juan Gómez', '283653863', 'JGómez@yahoo.com', '948980022', 'Efectivo'),
(363, 'Juan García', '551732813', 'JGarcía@yahoo.com', '932191922', 'Efectivo'),
(364, 'Juan Gómez', '278679274', 'JGómez@yahoo.com', '967512281', 'Efectivo'),
(365, 'Juan García', '826531434', 'JGarcía@yahoo.com', '985681811', 'Efectivo'),
(366, 'Juan Gómez', '711088031', 'JGómez@hotmail.com', '939038572', 'Efectivo'),
(367, 'Juan García', '527342891', 'JGarcía@hotmail.com', '941891729', 'Efectivo'),
(368, 'Juan Gómez', '786767782', 'JGómez@hotmail.com', '942179936', 'Efectivo'),
(369, 'Juan García', '696150642', 'JGarcía@hotmail.com', '960980950', 'Efectivo'),
(370, 'Juan Gómez', '439533923', 'JGómez@outlook.com', '980525800', 'PayPal'),
(371, 'Juan Gómez', '907376773', 'JGómez@hotmail.com', '992429516', 'Efectivo'),
(372, 'Juan García', '907924373', 'JGarcía@outlook.com', '943141856', 'PayPal'),
(373, 'Juan García', '214941173', 'JGarcía@hotmail.com', '967794025', 'Efectivo'),
(374, 'Juan Gómez', '319891234', 'JGómez@outlook.com', '924170571', 'PayPal'),
(375, 'Juan Gómez', '510176034', 'JGómez@hotmail.com', '976428534', 'Efectivo'),
(376, 'Juan García', '272044624', 'JGarcía@outlook.com', '959282109', 'PayPal'),
(377, 'Juan García', '587641684', 'JGarcía@hotmail.com', '935581455', 'Efectivo'),
(378, 'Juan Gómez', '375521601', 'JGómez@gmail.com', '991649569', 'Efectivo'),
(379, 'Juan Gómez', '106219291', 'JGómez@outlook.com', '993710962', 'Efectivo'),
(380, 'Juan García', '118962651', 'JGarcía@gmail.com', '945490888', 'Efectivo'),
(381, 'Juan García', '798797461', 'JGarcía@outlook.com', '948587432', 'Efectivo'),
(382, 'Juan Gómez', '236410982', 'JGómez@gmail.com', '959024310', 'Efectivo'),
(383, 'Juan Gómez', '168806272', 'JGómez@outlook.com', '962052871', 'Efectivo'),
(384, 'Juan García', '338522292', 'JGarcía@gmail.com', '918975913', 'Efectivo'),
(385, 'Ana Gómez', '249954133', 'AGómez@yahoo.com', '941739532', 'PayPal'),
(386, 'Ana García', '141067593', 'AGarcía@hotmail.com', '987360579', 'Transferencia'),
(387, 'Ana Gómez', '590096864', 'AGómez@outlook.com', '917845124', 'Tarjeta'),
(388, 'Ana García', '770384614', 'AGarcía@gmail.com', '994162942', 'Tarjeta'),
(389, 'Ana García', '674502023', 'AGarcía@yahoo.com', '945488260', 'PayPal'),
(390, 'Ana Gómez', '246844524', 'AGómez@hotmail.com', '949271668', 'Transferencia'),
(391, 'Ana García', '185676674', 'AGarcía@outlook.com', '911925080', 'Tarjeta'),
(392, 'Ana Gómez', '161044151', 'AGómez@yahoo.com', '949370788', 'Tarjeta'),
(393, 'Ana Gómez', '525094594', 'AGómez@yahoo.com', '920557635', 'PayPal'),
(394, 'Ana García', '263947614', 'AGarcía@hotmail.com', '910806048', 'Transferencia'),
(395, 'Ana Gómez', '690799961', 'AGómez@gmail.com', '955304951', 'Transferencia'),
(396, 'Ana García', '503651711', 'AGarcía@yahoo.com', '978384260', 'Tarjeta'),
(397, 'Ana García', '543206754', 'AGarcía@yahoo.com', '970804604', 'PayPal'),
(398, 'Ana Gómez', '195508921', 'AGómez@outlook.com', '976459780', 'Transferencia'),
(399, 'Ana García', '790212231', 'AGarcía@gmail.com', '932224501', 'Transferencia'),
(400, 'Ana Gómez', '607881202', 'AGómez@yahoo.com', '965182646', 'Tarjeta'),
(401, 'Ana Gómez', '742662041', 'AGómez@hotmail.com', '975572714', 'PayPal'),
(402, 'Ana García', '119829271', 'AGarcía@outlook.com', '983179804', 'Transferencia'),
(403, 'Ana Gómez', '654026082', 'AGómez@gmail.com', '944672958', 'Transferencia'),
(404, 'Ana García', '299551302', 'AGarcía@yahoo.com', '991770185', 'Tarjeta'),
(405, 'Ana García', '109161931', 'AGarcía@hotmail.com', '940511535', 'PayPal'),
(406, 'Ana Gómez', '714831072', 'AGómez@outlook.com', '910017997', 'Transferencia'),
(407, 'Ana García', '892361632', 'AGarcía@gmail.com', '924929166', 'Transferencia'),
(408, 'Ana Gómez', '518203353', 'AGómez@yahoo.com', '932719636', 'Tarjeta'),
(409, 'Ana Gómez', '986081022', 'AGómez@hotmail.com', '992410644', 'PayPal'),
(410, 'Ana García', '772274952', 'AGarcía@outlook.com', '926093158', 'Transferencia'),
(411, 'Ana Gómez', '597415143', 'AGómez@gmail.com', '951878906', 'Transferencia'),
(412, 'Ana García', '203865433', 'AGarcía@yahoo.com', '986991208', 'Tarjeta'),
(413, 'Ana García', '526870572', 'AGarcía@hotmail.com', '933690023', 'PayPal'),
(414, 'Ana Gómez', '308191613', 'AGómez@outlook.com', '945157031', 'Transferencia'),
(415, 'Ana García', '476891673', 'AGarcía@gmail.com', '996066324', 'Transferencia'),
(416, 'Ana Gómez', '479005644', 'AGómez@yahoo.com', '918364041', 'Tarjeta'),
(417, 'Ana Gómez', '971032673', 'AGómez@hotmail.com', '970809885', 'PayPal'),
(418, 'Ana García', '511839253', 'AGarcía@outlook.com', '965306829', 'Transferencia'),
(419, 'Ana Gómez', '303182614', 'AGómez@gmail.com', '975273980', 'Transferencia'),
(420, 'Ana García', '347129964', 'AGarcía@yahoo.com', '969689437', 'Tarjeta'),
(421, 'Ana García', '701623083', 'AGarcía@hotmail.com', '953406751', 'PayPal'),
(422, 'Ana Gómez', '979389234', 'AGómez@outlook.com', '954207521', 'Transferencia'),
(423, 'Ana García', '532788534', 'AGarcía@gmail.com', '964285076', 'Transferencia'),
(424, 'Ana Gómez', '286273931', 'AGómez@hotmail.com', '945836089', 'Tarjeta'),
(425, 'Ana Gómez', '407686454', 'AGómez@hotmail.com', '975999502', 'PayPal'),
(426, 'Ana García', '884149864', 'AGarcía@outlook.com', '940863777', 'Transferencia'),
(427, 'Ana Gómez', '468071431', 'AGómez@yahoo.com', '981539306', 'Transferencia'),
(428, 'Ana García', '990252001', 'AGarcía@hotmail.com', '972763224', 'Tarjeta'),
(429, 'Ana García', '993074574', 'AGarcía@hotmail.com', '925313364', 'PayPal'),
(430, 'Ana Gómez', '348700901', 'AGómez@gmail.com', '991893462', 'PayPal'),
(431, 'Ana García', '256592201', 'AGarcía@yahoo.com', '927621332', 'Transferencia'),
(432, 'Ana Gómez', '675901892', 'AGómez@hotmail.com', '980282730', 'Tarjeta'),
(433, 'Ana Gómez', '852556121', 'AGómez@outlook.com', '995849703', 'PayPal'),
(434, 'Ana García', '501186801', 'AGarcía@gmail.com', '982573251', 'PayPal'),
(435, 'Ana Gómez', '748947102', 'AGómez@yahoo.com', '947643243', 'Transferencia'),
(436, 'Ana García', '988245862', 'AGarcía@hotmail.com', '916337507', 'Tarjeta'),
(437, 'Ana García', '995156101', 'AGarcía@outlook.com', '954660259', 'PayPal'),
(438, 'Ana Gómez', '589686722', 'AGómez@gmail.com', '910182146', 'PayPal'),
(439, 'Ana García', '418846802', 'AGarcía@yahoo.com', '913717532', 'Transferencia'),
(440, 'Ana Gómez', '381768903', 'AGómez@hotmail.com', '957859383', 'Tarjeta'),
(441, 'Ana Gómez', '586441472', 'AGómez@outlook.com', '976668076', 'PayPal'),
(442, 'Ana García', '820893802', 'AGarcía@gmail.com', '996934195', 'PayPal'),
(443, 'Ana Gómez', '291080433', 'AGómez@yahoo.com', '983732886', 'Transferencia'),
(444, 'Ana García', '543036803', 'AGarcía@hotmail.com', '960059763', 'Tarjeta'),
(445, 'Ana García', '161313412', 'AGarcía@outlook.com', '985853973', 'PayPal'),
(446, 'Ana Gómez', '469501363', 'AGómez@gmail.com', '955898269', 'PayPal'),
(447, 'Ana García', '326000963', 'AGarcía@yahoo.com', '934242271', 'Transferencia'),
(448, 'Ana Gómez', '635739904', 'AGómez@hotmail.com', '913429032', 'Tarjeta'),
(449, 'Ana García', '523873403', 'AGarcía@gmail.com', '967394684', 'PayPal'),
(450, 'Ana Gómez', '957389524', 'AGómez@yahoo.com', '997099188', 'Transferencia'),
(451, 'Ana García', '119249684', 'AGarcía@hotmail.com', '989480623', 'Tarjeta'),
(452, 'Ana Gómez', '873048251', 'AGómez@gmail.com', '973787910', 'Tarjeta'),
(453, 'Ana Gómez', '649350964', 'AGómez@gmail.com', '971524655', 'PayPal'),
(454, 'Ana García', '148627294', 'AGarcía@yahoo.com', '948948884', 'Transferencia'),
(455, 'Ana Gómez', '905631821', 'AGómez@outlook.com', '951674013', 'Tarjeta'),
(456, 'Ana García', '693492281', 'AGarcía@gmail.com', '942402126', 'Tarjeta'),
(457, 'Ana García', '634190464', 'AGarcía@gmail.com', '949454105', 'PayPal'),
(458, 'Ana Gómez', '618587861', 'AGómez@hotmail.com', '937914489', 'Transferencia'),
(459, 'Ana García', '127420891', 'AGarcía@outlook.com', '948602526', 'Tarjeta'),
(460, 'Ana Gómez', '307355872', 'AGómez@gmail.com', '931666556', 'Tarjeta'),
(461, 'Ana Gómez', '508245571', 'AGómez@yahoo.com', '999362960', 'PayPal'),
(462, 'Ana García', '460258521', 'AGarcía@hotmail.com', '919329373', 'Transferencia'),
(463, 'Ana Gómez', '352801602', 'AGómez@outlook.com', '912447953', 'Tarjeta'),
(464, 'Ana García', '978757812', 'AGarcía@gmail.com', '919097106', 'Tarjeta'),
(465, 'Ana García', '267969791', 'AGarcía@yahoo.com', '975483035', 'PayPal'),
(466, 'Ana Gómez', '227401472', 'AGómez@hotmail.com', '962986105', 'Transferencia'),
(467, 'Ana García', '979497422', 'AGarcía@outlook.com', '990825858', 'Tarjeta'),
(468, 'Ana Gómez', '787095493', 'AGómez@gmail.com', '942019911', 'Tarjeta'),
(469, 'Ana Gómez', '774191812', 'AGómez@yahoo.com', '986206620', 'PayPal'),
(470, 'Ana García', '345529622', 'AGarcía@hotmail.com', '986042823', 'Transferencia'),
(471, 'Ana Gómez', '463914443', 'AGómez@outlook.com', '969952262', 'Tarjeta'),
(472, 'Ana García', '948602813', 'AGarcía@gmail.com', '947848856', 'Tarjeta'),
(473, 'Ana García', '610552052', 'AGarcía@yahoo.com', '975795557', 'PayPal'),
(474, 'Ana Gómez', '549286723', 'AGómez@hotmail.com', '992675867', 'Transferencia'),
(475, 'Ana García', '290206223', 'AGarcía@outlook.com', '985950749', 'Tarjeta'),
(476, 'Ana Gómez', '785403094', 'AGómez@gmail.com', '919648343', 'Tarjeta'),
(477, 'Ana García', '409225572', 'AGarcía@gmail.com', '994822881', 'Efectivo'),
(478, 'Ana García', '578213612', 'AGarcía@outlook.com', '992845930', 'Efectivo'),
(479, 'Ana Gómez', '119693053', 'AGómez@gmail.com', '971194375', 'Efectivo'),
(480, 'Ana Gómez', '827304773', 'AGómez@outlook.com', '961170188', 'Efectivo'),
(481, 'Ana García', '924465993', 'AGarcía@gmail.com', '927700562', 'Efectivo'),
(482, 'Ana García', '545951813', 'AGarcía@outlook.com', '978175980', 'Efectivo'),
(483, 'Ana Gómez', '600012514', 'AGómez@gmail.com', '965950799', 'Efectivo'),
(484, 'Ana Gómez', '235222024', 'AGómez@outlook.com', '958811424', 'Efectivo'),
(485, 'Ana García', '431019424', 'AGarcía@gmail.com', '932043096', 'Efectivo'),
(486, 'Ana García', '501290364', 'AGarcía@outlook.com', '964730758', 'Efectivo'),
(487, 'Ana Gómez', '270984791', 'AGómez@yahoo.com', '972046446', 'Efectivo'),
(488, 'Ana García', '531747141', 'AGarcía@yahoo.com', '936024948', 'Efectivo'),
(489, 'Ana Gómez', '320973692', 'AGómez@yahoo.com', '959450481', 'Efectivo'),
(490, 'Ana García', '225858642', 'AGarcía@yahoo.com', '920998663', 'Efectivo'),
(491, 'Ana Gómez', '905130743', 'AGómez@yahoo.com', '956481344', 'Efectivo'),
(492, 'Ana García', '201680263', 'AGarcía@yahoo.com', '924506340', 'Efectivo'),
(493, 'Ana Gómez', '176712214', 'AGómez@yahoo.com', '917862759', 'Efectivo'),
(494, 'Ana García', '545837734', 'AGarcía@yahoo.com', '989772040', 'Efectivo'),
(495, 'Ana Gómez', '773868061', 'AGómez@hotmail.com', '944631811', 'Efectivo'),
(496, 'Ana García', '144722981', 'AGarcía@hotmail.com', '949025812', 'Efectivo'),
(497, 'Ana Gómez', '102825792', 'AGómez@hotmail.com', '975275349', 'Efectivo'),
(498, 'Ana García', '287896712', 'AGarcía@hotmail.com', '941201598', 'Efectivo'),
(499, 'Ana Gómez', '345986933', 'AGómez@outlook.com', '947985170', 'PayPal'),
(500, 'Ana Gómez', '308213753', 'AGómez@hotmail.com', '943802571', 'Efectivo');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleados`
--

CREATE TABLE `empleados` (
  `id` int(11) NOT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `apellidos` varchar(255) DEFAULT NULL,
  `DNI` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `telefono` varchar(255) DEFAULT NULL,
  `cargo` varchar(255) NOT NULL,
  `id_local` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `empleados`
--

INSERT INTO `empleados` (`id`, `nombre`, `apellidos`, `DNI`, `email`, `telefono`, `cargo`, `id_local`) VALUES
(1, 'Ana', 'López', '146522374', 'ana.lópez@company.com', '947685349', 'Recepcionista', 1),
(2, 'Pedro', 'Martínez', '390027642', 'pedro.martínez@company.com', '965449185', 'Gobernante', NULL),
(3, 'María', 'García', '123307944', 'maría.garcía@company.com', '920913954', 'Recepcionista', 5),
(4, 'Ana', 'López', '899796132', 'ana.lópez@company.com', '993272206', 'Camarero', 2),
(5, 'Ana', 'López', '565184154', 'ana.lópez@company.com', '961827937', 'Camarero', 2),
(6, 'Pedro', 'Martínez', '513194722', 'pedro.martínez@company.com', '940239663', 'Camarero', 2),
(7, 'Pedro', 'Martínez', '254993274', 'pedro.martínez@company.com', '957216520', 'Camarero', 2),
(8, 'Ana', 'López', '102045124', 'ana.lópez@company.com', '975817038', 'Entrenador', 5),
(9, 'Pedro', 'Martínez', '840216492', 'pedro.martínez@company.com', '973835536', 'Entrenador', 5),
(10, 'Ana', 'López', '117450202', 'ana.lópez@company.com', '945572801', 'Entrenador', 9),
(11, 'Pedro', 'Martínez', '962955054', 'pedro.martínez@company.com', '992454226', 'Entrenador', 9),
(12, 'María', 'García', '237840962', 'maría.garcía@company.com', '931665590', 'Presentadora', 7),
(13, 'Ana', 'López', '582755874', 'ana.lópez@company.com', '950629024', 'Presentadora', 8),
(14, 'Ana', 'López', '539919942', 'ana.lópez@company.com', '919956724', 'Boton', NULL),
(15, 'Pedro', 'Martínez', '253399584', 'pedro.martínez@company.com', '998542043', 'Boton', NULL),
(16, 'Pedro', 'Martínez', '709589282', 'pedro.martínez@company.com', '998331738', 'Boton', NULL),
(17, 'Ana', 'López', '454464772', 'ana.lópez@company.com', '980342373', 'Gobernanta', NULL),
(18, 'Pedro', 'Martínez', '947242934', 'pedro.martínez@company.com', '984052080', 'Recepcionista', 10),
(19, 'Ana', 'López', '841031944', 'ana.lópez@company.com', '981312790', 'Recepcionista', 11),
(20, 'Pedro', 'Martínez', '957322852', 'pedro.martínez@company.com', '970856470', 'Recepcionista', NULL),
(21, 'María', 'García', '528977584', 'maría.garcía@company.com', '985005347', 'Recepcionista', NULL),
(22, 'Ana', 'López', '120431884', 'ana.lópez@company.com', '958445752', 'Recepcionista', NULL),
(23, 'Pedro', 'Martínez', '608762462', 'pedro.martínez@company.com', '925140166', 'Cocinero', 2),
(24, 'Ana', 'López', '937142542', 'ana.lópez@company.com', '914165686', 'Cocinero', 2),
(25, 'Pedro', 'Martínez', '764331644', 'pedro.martínez@company.com', '983333142', 'Cocinero', 2),
(26, 'María', 'García', '871117772', 'maría.garcía@company.com', '953209635', 'Cocinero', 11),
(27, 'Ana', 'López', '819187724', 'ana.lópez@company.com', '981199476', 'Cocinero', 11),
(28, 'Ana', 'López', '345114242', 'ana.lópez@company.com', '911001049', 'Cocinero', 11),
(29, 'Pedro', 'Martínez', '800381194', 'pedro.martínez@company.com', '980193810', 'Cocinero', 2),
(30, 'Pedro', 'Martínez', '195425892', 'pedro.martínez@company.com', '956467541', 'Camarero', 11),
(31, 'Ana', 'López', '100335252', 'ana.lópez@company.com', '986753679', 'Camarero', 11),
(32, 'Pedro', 'Martínez', '146414094', 'pedro.martínez@company.com', '970541272', 'Camarero', 11),
(33, 'Pedro', 'Martínez', '827780893', 'pedro.martínez@company.com', '985716551', 'Socorrista', NULL),
(34, 'María', 'López', '367663082', 'maría.lópez@company.com', '965081149', 'Socorrista', NULL),
(35, 'María', 'López', '470899604', 'maría.lópez@company.com', '969752364', 'Socorrista', NULL),
(36, 'Pedro', 'Martínez', '471103753', 'pedro.martínez@company.com', '991161588', 'Socorrista', NULL),
(37, 'María', 'López', '620116272', 'maría.lópez@company.com', '973423339', 'Socorrista', NULL),
(38, 'Pedro', 'Martínez', '724339081', 'pedro.martínez@company.com', '977044366', 'Socorrista', NULL),
(39, 'María', 'López', '247272664', 'maría.lópez@company.com', '921383031', 'Masajista', NULL),
(40, 'Juan', 'Gómez', '409374432', 'juan.gómez@company.com', '990954151', 'Masajista', NULL),
(41, 'Pedro', 'Martínez', '218948213', 'pedro.martínez@company.com', '930432794', 'Masajista', NULL),
(42, 'Pedro', 'Martínez', '346661101', 'pedro.martínez@company.com', '957967453', 'Masajista', NULL),
(43, 'María', 'López', '809325044', 'maría.lópez@company.com', '910920998', 'Masajista', NULL),
(44, 'María', 'López', '906442702', 'maría.lópez@company.com', '982070974', 'Masajista', NULL),
(45, 'Pedro', 'Martínez', '852593051', 'pedro.martínez@company.com', '945939901', 'Camarero', 11),
(46, 'María', 'López', '151498994', 'maría.lópez@company.com', '995844400', 'Camarero', 2),
(47, 'Pedro', 'Martínez', '449583673', 'pedro.martínez@company.com', '959550592', 'Camarero', 11),
(48, 'María', 'López', '971125182', 'maría.lópez@company.com', '988733111', 'Camarero', 2),
(49, 'Juan', 'Gómez', '903206614', 'juan.gómez@company.com', '958575188', 'Camarero', 11),
(50, 'Pedro', 'Martínez', '383833223', 'pedro.martínez@company.com', '936128348', 'Camarero', 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `habitaciones`
--

CREATE TABLE `habitaciones` (
  `id` int(11) NOT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `descripcion` longtext DEFAULT NULL,
  `capacidad` int(11) DEFAULT NULL,
  `tipo` varchar(255) DEFAULT NULL,
  `json_caracteristicas` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL CHECK (json_valid(`json_caracteristicas`)),
  `disponible` tinyint(1) DEFAULT NULL,
  `precio` decimal(10,0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `habitaciones`
--

INSERT INTO `habitaciones` (`id`, `nombre`, `descripcion`, `capacidad`, `tipo`, `json_caracteristicas`, `disponible`, `precio`) VALUES
(1, 'Habitación 130', 'Descripción de la habitación 130', 1, 'Suite', '{\"wifi\": 0, \"aire_acondicionado\": 1, \"cocina\": 1, \"caja_fuerte\": 0, \"limpieza_diaria\": 1, \"cambio_sabanas_toallas\": 1, \"regalo\": 0}', 0, 212),
(2, 'Habitación 179', 'Descripción de la habitación 179', 1, 'Suite', '{\"wifi\": 1, \"aire_acondicionado\": 0, \"cocina\": 0, \"caja_fuerte\": 1, \"limpieza_diaria\": 1, \"cambio_sabanas_toallas\": 0, \"regalo\": 1}', 1, 214),
(3, 'Habitación 170', 'Descripción de la habitación 170', 4, 'Suite', '{\"wifi\": 1, \"aire_acondicionado\": 1, \"cocina\": 0, \"caja_fuerte\": 0, \"limpieza_diaria\": 0, \"cambio_sabanas_toallas\": 1, \"regalo\": 1}', 1, 146),
(4, 'Habitación 114', 'Descripción de la habitación 114', 3, 'Suite', '{\"wifi\": 0, \"aire_acondicionado\": 0, \"cocina\": 1, \"caja_fuerte\": 0, \"limpieza_diaria\": 0, \"cambio_sabanas_toallas\": 1, \"regalo\": 0}', 1, 119),
(5, 'Habitación 154', 'Descripción de la habitación 154', 2, 'Suite', '{\"wifi\": 0, \"aire_acondicionado\": 1, \"cocina\": 0, \"caja_fuerte\": 0, \"limpieza_diaria\": 1, \"cambio_sabanas_toallas\": 1, \"regalo\": 0}', 1, 217),
(6, 'Habitación 138', 'Descripción de la habitación 138', 2, 'Suite', '{\"wifi\": 1, \"aire_acondicionado\": 0, \"cocina\": 0, \"caja_fuerte\": 1, \"limpieza_diaria\": 1, \"cambio_sabanas_toallas\": 1, \"regalo\": 0}', 1, 257),
(7, 'Habitación 187', 'Descripción de la habitación 187', 2, 'Suite', '{\"wifi\": 0, \"aire_acondicionado\": 0, \"cocina\": 0, \"caja_fuerte\": 1, \"limpieza_diaria\": 1, \"cambio_sabanas_toallas\": 0, \"regalo\": 1}', 1, 272),
(8, 'Habitación 122', 'Descripción de la habitación 122', 1, 'Suite', '{\"wifi\": 1, \"aire_acondicionado\": 1, \"cocina\": 1, \"caja_fuerte\": 0, \"limpieza_diaria\": 0, \"cambio_sabanas_toallas\": 0, \"regalo\": 1}', 1, 260),
(9, 'Habitación 162', 'Descripción de la habitación 162', 2, 'Suite', '{\"wifi\": 1, \"aire_acondicionado\": 0, \"cocina\": 0, \"caja_fuerte\": 0, \"limpieza_diaria\": 1, \"cambio_sabanas_toallas\": 0, \"regalo\": 0}', 1, 245),
(10, 'Habitación 106', 'Descripción de la habitación 106', 1, 'Suite', '{\"wifi\": 1, \"aire_acondicionado\": 1, \"cocina\": 0, \"caja_fuerte\": 0, \"limpieza_diaria\": 0, \"cambio_sabanas_toallas\": 0, \"regalo\": 1}', 1, 143),
(11, 'Habitación 146', 'Descripción de la habitación 146', 3, 'Suite', '{\"wifi\": 1, \"aire_acondicionado\": 0, \"cocina\": 1, \"caja_fuerte\": 0, \"limpieza_diaria\": 0, \"cambio_sabanas_toallas\": 1, \"regalo\": 1}', 1, 179),
(12, 'Habitación 195', 'Descripción de la habitación 195', 4, 'Suite', '{\"wifi\": 0, \"aire_acondicionado\": 0, \"cocina\": 1, \"caja_fuerte\": 1, \"limpieza_diaria\": 0, \"cambio_sabanas_toallas\": 0, \"regalo\": 1}', 1, 155),
(13, 'Habitación 196', 'Descripción de la habitación 196', 4, 'Ejecutiva', '{\"wifi\": 1, \"aire_acondicionado\": 0, \"cocina\": 0, \"caja_fuerte\": 1, \"limpieza_diaria\": 1, \"cambio_sabanas_toallas\": 1, \"regalo\": 1}', 1, 228),
(14, 'Habitación 131', 'Descripción de la habitación 131', 4, 'Ejecutiva', '{\"wifi\": 0, \"aire_acondicionado\": 0, \"cocina\": 1, \"caja_fuerte\": 0, \"limpieza_diaria\": 0, \"cambio_sabanas_toallas\": 1, \"regalo\": 0}', 1, 252),
(15, 'Habitación 180', 'Descripción de la habitación 180', 3, 'Ejecutiva', '{\"wifi\": 0, \"aire_acondicionado\": 1, \"cocina\": 1, \"caja_fuerte\": 0, \"limpieza_diaria\": 0, \"cambio_sabanas_toallas\": 0, \"regalo\": 1}', 1, 277),
(16, 'Habitación 171', 'Descripción de la habitación 171', 4, 'Ejecutiva', '{\"wifi\": 0, \"aire_acondicionado\": 0, \"cocina\": 0, \"caja_fuerte\": 1, \"limpieza_diaria\": 0, \"cambio_sabanas_toallas\": 0, \"regalo\": 0}', 1, 210),
(17, 'Habitación 115', 'Descripción de la habitación 115', 3, 'Ejecutiva', '{\"wifi\": 1, \"aire_acondicionado\": 1, \"cocina\": 0, \"caja_fuerte\": 0, \"limpieza_diaria\": 1, \"cambio_sabanas_toallas\": 0, \"regalo\": 0}', 1, 288),
(18, 'Habitación 155', 'Descripción de la habitación 155', 3, 'Ejecutiva', '{\"wifi\": 1, \"aire_acondicionado\": 1, \"cocina\": 1, \"caja_fuerte\": 1, \"limpieza_diaria\": 0, \"cambio_sabanas_toallas\": 0, \"regalo\": 1}', 1, 208),
(19, 'Habitación 139', 'Descripción de la habitación 139', 2, 'Ejecutiva', '{\"wifi\": 1, \"aire_acondicionado\": 0, \"cocina\": 1, \"caja_fuerte\": 1, \"limpieza_diaria\": 0, \"cambio_sabanas_toallas\": 1, \"regalo\": 1}', 1, 265),
(20, 'Habitación 188', 'Descripción de la habitación 188', 4, 'Ejecutiva', '{\"wifi\": 1, \"aire_acondicionado\": 1, \"cocina\": 1, \"caja_fuerte\": 0, \"limpieza_diaria\": 0, \"cambio_sabanas_toallas\": 0, \"regalo\": 0}', 1, 267),
(21, 'Habitación 123', 'Descripción de la habitación 123', 3, 'Ejecutiva', '{\"wifi\": 1, \"aire_acondicionado\": 1, \"cocina\": 1, \"caja_fuerte\": 1, \"limpieza_diaria\": 0, \"cambio_sabanas_toallas\": 0, \"regalo\": 0}', 1, 277),
(22, 'Habitación 163', 'Descripción de la habitación 163', 1, 'Ejecutiva', '{\"wifi\": 0, \"aire_acondicionado\": 0, \"cocina\": 1, \"caja_fuerte\": 0, \"limpieza_diaria\": 1, \"cambio_sabanas_toallas\": 0, \"regalo\": 1}', 1, 117),
(23, 'Habitación 107', 'Descripción de la habitación 107', 3, 'Ejecutiva', '{\"wifi\": 0, \"aire_acondicionado\": 1, \"cocina\": 1, \"caja_fuerte\": 0, \"limpieza_diaria\": 0, \"cambio_sabanas_toallas\": 0, \"regalo\": 0}', 1, 207),
(24, 'Habitación 147', 'Descripción de la habitación 147', 2, 'Ejecutiva', '{\"wifi\": 0, \"aire_acondicionado\": 1, \"cocina\": 1, \"caja_fuerte\": 0, \"limpieza_diaria\": 1, \"cambio_sabanas_toallas\": 1, \"regalo\": 1}', 1, 175),
(25, 'Habitación 197', 'Descripción de la habitación 197', 3, 'Doble', '{\"wifi\": 1, \"aire_acondicionado\": 0, \"cocina\": 0, \"caja_fuerte\": 0, \"limpieza_diaria\": 1, \"cambio_sabanas_toallas\": 0, \"regalo\": 1}', 1, 288),
(26, 'Habitación 132', 'Descripción de la habitación 132', 4, 'Doble', '{\"wifi\": 1, \"aire_acondicionado\": 1, \"cocina\": 1, \"caja_fuerte\": 1, \"limpieza_diaria\": 0, \"cambio_sabanas_toallas\": 0, \"regalo\": 0}', 1, 226),
(27, 'Habitación 181', 'Descripción de la habitación 181', 2, 'Doble', '{\"wifi\": 0, \"aire_acondicionado\": 1, \"cocina\": 0, \"caja_fuerte\": 1, \"limpieza_diaria\": 1, \"cambio_sabanas_toallas\": 0, \"regalo\": 0}', 1, 218),
(28, 'Habitación 172', 'Descripción de la habitación 172', 4, 'Doble', '{\"wifi\": 1, \"aire_acondicionado\": 0, \"cocina\": 1, \"caja_fuerte\": 0, \"limpieza_diaria\": 0, \"cambio_sabanas_toallas\": 0, \"regalo\": 0}', 1, 181),
(29, 'Habitación 116', 'Descripción de la habitación 116', 3, 'Doble', '{\"wifi\": 1, \"aire_acondicionado\": 0, \"cocina\": 0, \"caja_fuerte\": 0, \"limpieza_diaria\": 0, \"cambio_sabanas_toallas\": 0, \"regalo\": 1}', 1, 241),
(30, 'Habitación 156', 'Descripción de la habitación 156', 4, 'Doble', '{\"wifi\": 0, \"aire_acondicionado\": 0, \"cocina\": 0, \"caja_fuerte\": 0, \"limpieza_diaria\": 0, \"cambio_sabanas_toallas\": 0, \"regalo\": 0}', 1, 123),
(31, 'Habitación 140', 'Descripción de la habitación 140', 3, 'Doble', '{\"wifi\": 0, \"aire_acondicionado\": 0, \"cocina\": 0, \"caja_fuerte\": 1, \"limpieza_diaria\": 0, \"cambio_sabanas_toallas\": 0, \"regalo\": 1}', 1, 276),
(32, 'Habitación 189', 'Descripción de la habitación 189', 3, 'Doble', '{\"wifi\": 1, \"aire_acondicionado\": 1, \"cocina\": 1, \"caja_fuerte\": 0, \"limpieza_diaria\": 0, \"cambio_sabanas_toallas\": 1, \"regalo\": 1}', 1, 117),
(33, 'Habitación 124', 'Descripción de la habitación 124', 1, 'Doble', '{\"wifi\": 1, \"aire_acondicionado\": 1, \"cocina\": 0, \"caja_fuerte\": 0, \"limpieza_diaria\": 0, \"cambio_sabanas_toallas\": 1, \"regalo\": 0}', 1, 174),
(34, 'Habitación 164', 'Descripción de la habitación 164', 3, 'Doble', '{\"wifi\": 1, \"aire_acondicionado\": 0, \"cocina\": 0, \"caja_fuerte\": 0, \"limpieza_diaria\": 0, \"cambio_sabanas_toallas\": 1, \"regalo\": 1}', 0, 251),
(35, 'Habitación 108', 'Descripción de la habitación 108', 4, 'Doble', '{\"wifi\": 0, \"aire_acondicionado\": 1, \"cocina\": 1, \"caja_fuerte\": 0, \"limpieza_diaria\": 1, \"cambio_sabanas_toallas\": 1, \"regalo\": 1}', 1, 250),
(36, 'Habitación 148', 'Descripción de la habitación 148', 4, 'Doble', '{\"wifi\": 0, \"aire_acondicionado\": 1, \"cocina\": 1, \"caja_fuerte\": 0, \"limpieza_diaria\": 1, \"cambio_sabanas_toallas\": 1, \"regalo\": 0}', 1, 187),
(37, 'Habitación 149', 'Descripción de la habitación 149', 2, 'Estándar', '{\"wifi\": 1, \"aire_acondicionado\": 0, \"cocina\": 0, \"caja_fuerte\": 0, \"limpieza_diaria\": 0, \"cambio_sabanas_toallas\": 0, \"regalo\": 1}', 1, 204),
(38, 'Habitación 198', 'Descripción de la habitación 198', 2, 'Estándar', '{\"wifi\": 1, \"aire_acondicionado\": 1, \"cocina\": 1, \"caja_fuerte\": 1, \"limpieza_diaria\": 0, \"cambio_sabanas_toallas\": 1, \"regalo\": 1}', 1, 201),
(39, 'Habitación 133', 'Descripción de la habitación 133', 1, 'Estándar', '{\"wifi\": 1, \"aire_acondicionado\": 0, \"cocina\": 0, \"caja_fuerte\": 0, \"limpieza_diaria\": 1, \"cambio_sabanas_toallas\": 1, \"regalo\": 1}', 1, 154),
(40, 'Habitación 182', 'Descripción de la habitación 182', 1, 'Estándar', '{\"wifi\": 0, \"aire_acondicionado\": 0, \"cocina\": 1, \"caja_fuerte\": 0, \"limpieza_diaria\": 0, \"cambio_sabanas_toallas\": 0, \"regalo\": 1}', 1, 170),
(41, 'Habitación 173', 'Descripción de la habitación 173', 3, 'Estándar', '{\"wifi\": 0, \"aire_acondicionado\": 1, \"cocina\": 1, \"caja_fuerte\": 0, \"limpieza_diaria\": 0, \"cambio_sabanas_toallas\": 0, \"regalo\": 1}', 1, 126),
(42, 'Habitación 117', 'Descripción de la habitación 117', 1, 'Estándar', '{\"wifi\": 1, \"aire_acondicionado\": 0, \"cocina\": 0, \"caja_fuerte\": 0, \"limpieza_diaria\": 1, \"cambio_sabanas_toallas\": 1, \"regalo\": 0}', 1, 263),
(43, 'Habitación 157', 'Descripción de la habitación 157', 4, 'Estándar', '{\"wifi\": 1, \"aire_acondicionado\": 1, \"cocina\": 1, \"caja_fuerte\": 0, \"limpieza_diaria\": 0, \"cambio_sabanas_toallas\": 1, \"regalo\": 0}', 1, 199),
(44, 'Habitación 101', 'Descripción de la habitación 101', 1, 'Estándar', '{\"wifi\": 1, \"aire_acondicionado\": 1, \"cocina\": 0, \"caja_fuerte\": 0, \"limpieza_diaria\": 1, \"cambio_sabanas_toallas\": 0, \"regalo\": 1}', 1, 222),
(45, 'Habitación 141', 'Descripción de la habitación 141', 2, 'Estándar', '{\"wifi\": 1, \"aire_acondicionado\": 1, \"cocina\": 1, \"caja_fuerte\": 1, \"limpieza_diaria\": 0, \"cambio_sabanas_toallas\": 1, \"regalo\": 1}', 0, 226),
(46, 'Habitación 190', 'Descripción de la habitación 190', 1, 'Estándar', '{\"wifi\": 0, \"aire_acondicionado\": 0, \"cocina\": 1, \"caja_fuerte\": 1, \"limpieza_diaria\": 0, \"cambio_sabanas_toallas\": 1, \"regalo\": 1}', 1, 266),
(47, 'Habitación 125', 'Descripción de la habitación 125', 3, 'Estándar', '{\"wifi\": 0, \"aire_acondicionado\": 0, \"cocina\": 0, \"caja_fuerte\": 1, \"limpieza_diaria\": 1, \"cambio_sabanas_toallas\": 1, \"regalo\": 1}', 1, 205),
(48, 'Habitación 165', 'Descripción de la habitación 165', 3, 'Estándar', '{\"wifi\": 1, \"aire_acondicionado\": 0, \"cocina\": 1, \"caja_fuerte\": 1, \"limpieza_diaria\": 1, \"cambio_sabanas_toallas\": 0, \"regalo\": 0}', 1, 218),
(49, 'Habitación 109', 'Descripción de la habitación 109', 1, 'Estándar', '{\"wifi\": 1, \"aire_acondicionado\": 1, \"cocina\": 0, \"caja_fuerte\": 0, \"limpieza_diaria\": 1, \"cambio_sabanas_toallas\": 1, \"regalo\": 1}', 1, 228),
(50, 'Habitación 149', 'Descripción de la habitación 149', 4, 'Suite', '{\"wifi\": 0, \"aire_acondicionado\": 1, \"cocina\": 1, \"caja_fuerte\": 1, \"limpieza_diaria\": 0, \"cambio_sabanas_toallas\": 0, \"regalo\": 0}', 1, 219),
(51, 'Habitación 198', 'Descripción de la habitación 198', 4, 'Suite', '{\"wifi\": 0, \"aire_acondicionado\": 1, \"cocina\": 0, \"caja_fuerte\": 0, \"limpieza_diaria\": 0, \"cambio_sabanas_toallas\": 0, \"regalo\": 1}', 0, 169),
(52, 'Habitación 133', 'Descripción de la habitación 133', 1, 'Suite', '{\"wifi\": 0, \"aire_acondicionado\": 1, \"cocina\": 0, \"caja_fuerte\": 1, \"limpieza_diaria\": 1, \"cambio_sabanas_toallas\": 1, \"regalo\": 0}', 1, 279),
(53, 'Habitación 182', 'Descripción de la habitación 182', 1, 'Suite', '{\"wifi\": 0, \"aire_acondicionado\": 0, \"cocina\": 1, \"caja_fuerte\": 0, \"limpieza_diaria\": 1, \"cambio_sabanas_toallas\": 1, \"regalo\": 1}', 1, 284),
(54, 'Habitación 173', 'Descripción de la habitación 173', 3, 'Suite', '{\"wifi\": 1, \"aire_acondicionado\": 1, \"cocina\": 1, \"caja_fuerte\": 1, \"limpieza_diaria\": 1, \"cambio_sabanas_toallas\": 0, \"regalo\": 0}', 1, 187),
(55, 'Habitación 117', 'Descripción de la habitación 117', 4, 'Suite', '{\"wifi\": 1, \"aire_acondicionado\": 1, \"cocina\": 1, \"caja_fuerte\": 0, \"limpieza_diaria\": 0, \"cambio_sabanas_toallas\": 0, \"regalo\": 1}', 1, 103),
(56, 'Habitación 157', 'Descripción de la habitación 157', 1, 'Suite', '{\"wifi\": 0, \"aire_acondicionado\": 0, \"cocina\": 1, \"caja_fuerte\": 0, \"limpieza_diaria\": 1, \"cambio_sabanas_toallas\": 0, \"regalo\": 1}', 1, 246),
(57, 'Habitación 101', 'Descripción de la habitación 101', 1, 'Suite', '{\"wifi\": 0, \"aire_acondicionado\": 1, \"cocina\": 0, \"caja_fuerte\": 0, \"limpieza_diaria\": 0, \"cambio_sabanas_toallas\": 0, \"regalo\": 0}', 1, 126),
(58, 'Habitación 141', 'Descripción de la habitación 141', 4, 'Suite', '{\"wifi\": 1, \"aire_acondicionado\": 0, \"cocina\": 1, \"caja_fuerte\": 0, \"limpieza_diaria\": 0, \"cambio_sabanas_toallas\": 0, \"regalo\": 0}', 1, 211),
(59, 'Habitación 190', 'Descripción de la habitación 190', 3, 'Suite', '{\"wifi\": 0, \"aire_acondicionado\": 1, \"cocina\": 1, \"caja_fuerte\": 0, \"limpieza_diaria\": 0, \"cambio_sabanas_toallas\": 0, \"regalo\": 1}', 1, 187),
(60, 'Habitación 125', 'Descripción de la habitación 125', 3, 'Suite', '{\"wifi\": 0, \"aire_acondicionado\": 1, \"cocina\": 1, \"caja_fuerte\": 1, \"limpieza_diaria\": 1, \"cambio_sabanas_toallas\": 0, \"regalo\": 0}', 1, 167),
(61, 'Habitación 165', 'Descripción de la habitación 165', 3, 'Suite', '{\"wifi\": 1, \"aire_acondicionado\": 0, \"cocina\": 1, \"caja_fuerte\": 1, \"limpieza_diaria\": 0, \"cambio_sabanas_toallas\": 0, \"regalo\": 0}', 1, 262),
(62, 'Habitación 109', 'Descripción de la habitación 109', 3, 'Suite', '{\"wifi\": 0, \"aire_acondicionado\": 0, \"cocina\": 0, \"caja_fuerte\": 1, \"limpieza_diaria\": 1, \"cambio_sabanas_toallas\": 0, \"regalo\": 1}', 1, 130),
(63, 'Habitación 150', 'Descripción de la habitación 150', 2, 'Ejecutiva', '{\"wifi\": 1, \"aire_acondicionado\": 0, \"cocina\": 1, \"caja_fuerte\": 0, \"limpieza_diaria\": 1, \"cambio_sabanas_toallas\": 1, \"regalo\": 1}', 1, 294),
(64, 'Habitación 199', 'Descripción de la habitación 199', 4, 'Ejecutiva', '{\"wifi\": 1, \"aire_acondicionado\": 0, \"cocina\": 0, \"caja_fuerte\": 0, \"limpieza_diaria\": 0, \"cambio_sabanas_toallas\": 1, \"regalo\": 1}', 1, 123),
(65, 'Habitación 134', 'Descripción de la habitación 134', 2, 'Ejecutiva', '{\"wifi\": 0, \"aire_acondicionado\": 1, \"cocina\": 1, \"caja_fuerte\": 0, \"limpieza_diaria\": 0, \"cambio_sabanas_toallas\": 1, \"regalo\": 1}', 1, 113),
(66, 'Habitación 183', 'Descripción de la habitación 183', 3, 'Ejecutiva', '{\"wifi\": 1, \"aire_acondicionado\": 1, \"cocina\": 0, \"caja_fuerte\": 0, \"limpieza_diaria\": 0, \"cambio_sabanas_toallas\": 0, \"regalo\": 1}', 1, 276),
(67, 'Habitación 174', 'Descripción de la habitación 174', 1, 'Ejecutiva', '{\"wifi\": 1, \"aire_acondicionado\": 1, \"cocina\": 0, \"caja_fuerte\": 0, \"limpieza_diaria\": 0, \"cambio_sabanas_toallas\": 0, \"regalo\": 1}', 1, 280),
(68, 'Habitación 118', 'Descripción de la habitación 118', 4, 'Ejecutiva', '{\"wifi\": 0, \"aire_acondicionado\": 0, \"cocina\": 0, \"caja_fuerte\": 1, \"limpieza_diaria\": 1, \"cambio_sabanas_toallas\": 0, \"regalo\": 1}', 0, 222),
(69, 'Habitación 158', 'Descripción de la habitación 158', 1, 'Ejecutiva', '{\"wifi\": 0, \"aire_acondicionado\": 0, \"cocina\": 0, \"caja_fuerte\": 0, \"limpieza_diaria\": 1, \"cambio_sabanas_toallas\": 0, \"regalo\": 1}', 1, 239),
(70, 'Habitación 102', 'Descripción de la habitación 102', 3, 'Ejecutiva', '{\"wifi\": 0, \"aire_acondicionado\": 0, \"cocina\": 1, \"caja_fuerte\": 0, \"limpieza_diaria\": 0, \"cambio_sabanas_toallas\": 1, \"regalo\": 0}', 0, 155),
(71, 'Habitación 142', 'Descripción de la habitación 142', 1, 'Ejecutiva', '{\"wifi\": 1, \"aire_acondicionado\": 0, \"cocina\": 1, \"caja_fuerte\": 1, \"limpieza_diaria\": 0, \"cambio_sabanas_toallas\": 0, \"regalo\": 1}', 1, 254),
(72, 'Habitación 191', 'Descripción de la habitación 191', 4, 'Ejecutiva', '{\"wifi\": 1, \"aire_acondicionado\": 1, \"cocina\": 0, \"caja_fuerte\": 1, \"limpieza_diaria\": 0, \"cambio_sabanas_toallas\": 1, \"regalo\": 0}', 0, 182),
(73, 'Habitación 126', 'Descripción de la habitación 126', 3, 'Ejecutiva', '{\"wifi\": 0, \"aire_acondicionado\": 1, \"cocina\": 1, \"caja_fuerte\": 1, \"limpieza_diaria\": 0, \"cambio_sabanas_toallas\": 0, \"regalo\": 1}', 1, 245),
(74, 'Habitación 166', 'Descripción de la habitación 166', 2, 'Ejecutiva', '{\"wifi\": 1, \"aire_acondicionado\": 1, \"cocina\": 0, \"caja_fuerte\": 1, \"limpieza_diaria\": 1, \"cambio_sabanas_toallas\": 1, \"regalo\": 0}', 1, 146),
(75, 'Habitación 110', 'Descripción de la habitación 110', 4, 'Ejecutiva', '{\"wifi\": 0, \"aire_acondicionado\": 0, \"cocina\": 0, \"caja_fuerte\": 1, \"limpieza_diaria\": 1, \"cambio_sabanas_toallas\": 0, \"regalo\": 0}', 1, 162),
(76, 'Habitación 111', 'Descripción de la habitación 111', 2, 'Doble', '{\"wifi\": 0, \"aire_acondicionado\": 0, \"cocina\": 0, \"caja_fuerte\": 1, \"limpieza_diaria\": 0, \"cambio_sabanas_toallas\": 0, \"regalo\": 1}', 1, 160),
(77, 'Habitación 151', 'Descripción de la habitación 151', 2, 'Doble', '{\"wifi\": 1, \"aire_acondicionado\": 1, \"cocina\": 1, \"caja_fuerte\": 0, \"limpieza_diaria\": 0, \"cambio_sabanas_toallas\": 0, \"regalo\": 0}', 1, 208),
(78, 'Habitación 200', 'Descripción de la habitación 200', 2, 'Doble', '{\"wifi\": 0, \"aire_acondicionado\": 0, \"cocina\": 1, \"caja_fuerte\": 1, \"limpieza_diaria\": 1, \"cambio_sabanas_toallas\": 1, \"regalo\": 1}', 1, 266),
(79, 'Habitación 135', 'Descripción de la habitación 135', 4, 'Doble', '{\"wifi\": 1, \"aire_acondicionado\": 0, \"cocina\": 0, \"caja_fuerte\": 0, \"limpieza_diaria\": 0, \"cambio_sabanas_toallas\": 0, \"regalo\": 1}', 1, 194),
(80, 'Habitación 184', 'Descripción de la habitación 184', 1, 'Doble', '{\"wifi\": 0, \"aire_acondicionado\": 0, \"cocina\": 0, \"caja_fuerte\": 1, \"limpieza_diaria\": 1, \"cambio_sabanas_toallas\": 1, \"regalo\": 0}', 1, 278),
(81, 'Habitación 175', 'Descripción de la habitación 175', 2, 'Doble', '{\"wifi\": 0, \"aire_acondicionado\": 1, \"cocina\": 1, \"caja_fuerte\": 1, \"limpieza_diaria\": 0, \"cambio_sabanas_toallas\": 0, \"regalo\": 0}', 1, 137),
(82, 'Habitación 119', 'Descripción de la habitación 119', 4, 'Doble', '{\"wifi\": 0, \"aire_acondicionado\": 1, \"cocina\": 0, \"caja_fuerte\": 1, \"limpieza_diaria\": 1, \"cambio_sabanas_toallas\": 1, \"regalo\": 1}', 1, 249),
(83, 'Habitación 159', 'Descripción de la habitación 159', 2, 'Doble', '{\"wifi\": 1, \"aire_acondicionado\": 1, \"cocina\": 0, \"caja_fuerte\": 0, \"limpieza_diaria\": 0, \"cambio_sabanas_toallas\": 1, \"regalo\": 0}', 1, 237),
(84, 'Habitación 103', 'Descripción de la habitación 103', 2, 'Doble', '{\"wifi\": 1, \"aire_acondicionado\": 1, \"cocina\": 1, \"caja_fuerte\": 0, \"limpieza_diaria\": 1, \"cambio_sabanas_toallas\": 1, \"regalo\": 0}', 1, 107),
(85, 'Habitación 143', 'Descripción de la habitación 143', 2, 'Doble', '{\"wifi\": 0, \"aire_acondicionado\": 1, \"cocina\": 1, \"caja_fuerte\": 1, \"limpieza_diaria\": 1, \"cambio_sabanas_toallas\": 0, \"regalo\": 1}', 1, 129),
(86, 'Habitación 192', 'Descripción de la habitación 192', 1, 'Doble', '{\"wifi\": 1, \"aire_acondicionado\": 0, \"cocina\": 0, \"caja_fuerte\": 1, \"limpieza_diaria\": 1, \"cambio_sabanas_toallas\": 0, \"regalo\": 1}', 1, 255),
(87, 'Habitación 127', 'Descripción de la habitación 127', 4, 'Doble', '{\"wifi\": 0, \"aire_acondicionado\": 0, \"cocina\": 1, \"caja_fuerte\": 0, \"limpieza_diaria\": 1, \"cambio_sabanas_toallas\": 0, \"regalo\": 1}', 1, 176),
(88, 'Habitación 167', 'Descripción de la habitación 167', 4, 'Doble', '{\"wifi\": 0, \"aire_acondicionado\": 0, \"cocina\": 1, \"caja_fuerte\": 1, \"limpieza_diaria\": 1, \"cambio_sabanas_toallas\": 0, \"regalo\": 0}', 1, 217),
(89, 'Habitación 177', 'Descripción de la habitación 177', 2, 'Estándar', '{\"wifi\": 0, \"aire_acondicionado\": 0, \"cocina\": 0, \"caja_fuerte\": 1, \"limpieza_diaria\": 0, \"cambio_sabanas_toallas\": 0, \"regalo\": 1}', 1, 152),
(90, 'Habitación 168', 'Descripción de la habitación 168', 3, 'Estándar', '{\"wifi\": 0, \"aire_acondicionado\": 1, \"cocina\": 1, \"caja_fuerte\": 1, \"limpieza_diaria\": 1, \"cambio_sabanas_toallas\": 0, \"regalo\": 0}', 1, 222),
(91, 'Habitación 112', 'Descripción de la habitación 112', 3, 'Estándar', '{\"wifi\": 1, \"aire_acondicionado\": 1, \"cocina\": 1, \"caja_fuerte\": 0, \"limpieza_diaria\": 0, \"cambio_sabanas_toallas\": 0, \"regalo\": 0}', 1, 197),
(92, 'Habitación 152', 'Descripción de la habitación 152', 2, 'Estándar', '{\"wifi\": 1, \"aire_acondicionado\": 0, \"cocina\": 1, \"caja_fuerte\": 1, \"limpieza_diaria\": 1, \"cambio_sabanas_toallas\": 1, \"regalo\": 0}', 1, 300),
(93, 'Habitación 136', 'Descripción de la habitación 136', 1, 'Estándar', '{\"wifi\": 1, \"aire_acondicionado\": 0, \"cocina\": 0, \"caja_fuerte\": 1, \"limpieza_diaria\": 0, \"cambio_sabanas_toallas\": 0, \"regalo\": 1}', 1, 124),
(94, 'Habitación 185', 'Descripción de la habitación 185', 2, 'Estándar', '{\"wifi\": 1, \"aire_acondicionado\": 0, \"cocina\": 0, \"caja_fuerte\": 0, \"limpieza_diaria\": 1, \"cambio_sabanas_toallas\": 0, \"regalo\": 1}', 1, 178),
(95, 'Habitación 176', 'Descripción de la habitación 176', 1, 'Estándar', '{\"wifi\": 0, \"aire_acondicionado\": 1, \"cocina\": 1, \"caja_fuerte\": 1, \"limpieza_diaria\": 0, \"cambio_sabanas_toallas\": 0, \"regalo\": 0}', 1, 250),
(96, 'Habitación 120', 'Descripción de la habitación 120', 4, 'Estándar', '{\"wifi\": 0, \"aire_acondicionado\": 1, \"cocina\": 1, \"caja_fuerte\": 1, \"limpieza_diaria\": 1, \"cambio_sabanas_toallas\": 0, \"regalo\": 1}', 1, 146),
(97, 'Habitación 160', 'Descripción de la habitación 160', 3, 'Estándar', '{\"wifi\": 0, \"aire_acondicionado\": 0, \"cocina\": 1, \"caja_fuerte\": 1, \"limpieza_diaria\": 0, \"cambio_sabanas_toallas\": 0, \"regalo\": 0}', 1, 197),
(98, 'Habitación 104', 'Descripción de la habitación 104', 4, 'Estándar', '{\"wifi\": 0, \"aire_acondicionado\": 0, \"cocina\": 1, \"caja_fuerte\": 1, \"limpieza_diaria\": 1, \"cambio_sabanas_toallas\": 0, \"regalo\": 0}', 1, 276),
(99, 'Habitación 144', 'Descripción de la habitación 144', 3, 'Estándar', '{\"wifi\": 1, \"aire_acondicionado\": 1, \"cocina\": 1, \"caja_fuerte\": 1, \"limpieza_diaria\": 0, \"cambio_sabanas_toallas\": 0, \"regalo\": 0}', 0, 267),
(100, 'Habitación 193', 'Descripción de la habitación 193', 4, 'Estándar', '{\"wifi\": 0, \"aire_acondicionado\": 0, \"cocina\": 0, \"caja_fuerte\": 0, \"limpieza_diaria\": 0, \"cambio_sabanas_toallas\": 1, \"regalo\": 0}', 1, 213);

-- --------------------------------------------------------

--
-- Estructura Stand-in para la vista `habitaciones_view`
-- (Véase abajo para la vista actual)
--
CREATE TABLE `habitaciones_view` (
`id` int(11)
,`nombre` varchar(255)
,`descripcion` longtext
,`capacidad` int(11)
,`tipo` varchar(255)
,`disponible` varchar(2)
,`precio` decimal(10,0)
,`wifi` varchar(2)
,`aire_acondicionado` varchar(2)
,`cocina` varchar(2)
,`caja_fuerte` varchar(2)
,`limpieza_diaria` varchar(2)
,`cambio_sabanas_y_toallas` varchar(2)
,`regalo` varchar(2)
);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `historic`
--

CREATE TABLE `historic` (
  `id_reserva` int(11) NOT NULL,
  `id_habitacion` int(11) NOT NULL,
  `id_cliente` int(11) NOT NULL,
  `data_entrada` date DEFAULT NULL,
  `data_salida` date DEFAULT NULL,
  `precio_inicial` decimal(10,0) DEFAULT NULL,
  `precio_final` decimal(10,0) DEFAULT NULL,
  `json_servicios` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL CHECK (json_valid(`json_servicios`))
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `locales`
--

CREATE TABLE `locales` (
  `id` int(11) NOT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `tipo` varchar(255) DEFAULT NULL,
  `ubicacion` varchar(255) DEFAULT NULL,
  `descripcion` longtext DEFAULT NULL,
  `json_caracteristicas` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL CHECK (json_valid(`json_caracteristicas`))
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `locales`
--

INSERT INTO `locales` (`id`, `nombre`, `tipo`, `ubicacion`, `descripcion`, `json_caracteristicas`) VALUES
(1, 'Local L´Atelier', 'Tienda', 'Planta baja', 'Tienda Local L\'Atelier en la Planta Baja', '{\n    \"wifi\" : false,\n    \"aire_acondicionado\" : true,\n    \"interior\" : true,\n    \"terraza\" : false,\n    \"piscina\" : false\n}'),
(2, 'Il Porto', 'Restaurante', 'Piso 4', 'Restaurante Il Porto en el Piso 4', '{\n    \"wifi\" : true,\n    \"aire_acondicionado\" : true,\n    \"interior\" : true,\n    \"terraza\" : true,\n    \"piscina\" : false\n}'),
(3, 'Salón de eventos 1', 'Salón de eventos', 'Lobby', 'Salón de eventos en el Lobby', '{\n    \"wifi\" : false,\n    \"aire_acondicionado\" : true,\n    \"interior\" : true,\n    \"terraza\" : false,\n    \"piscina\" : false\n}'),
(4, 'Maruja', 'Cafetería', 'Piso 3', 'Cafetería Maruja en el Piso 3', '{\n    \"wifi\" : true,\n    \"aire_acondicionado\" : true,\n    \"interior\" : true,\n    \"terraza\" : false,\n    \"piscina\" : false\n}'),
(5, 'Bio Sport', 'Gym', 'Piso 4', 'Gimnasio BioSport en el Piso 4', '{\n    \"wifi\" : false,\n    \"aire_acondicionado\" : false,\n    \"interior\" : false,\n    \"terraza\" : true,\n    \"piscina\" : false\n}'),
(6, 'Dior', 'Tienda', 'Piso 2', 'Tienda Dior en el Piso 2', '{\n    \"wifi\" : false,\n    \"aire_acondicionado\" : true,\n    \"interior\" : true,\n    \"terraza\" : false,\n    \"piscina\" : false\n}'),
(7, 'Salón de eventos 2', 'Salón de eventos', 'Terraza', 'Salón de eventos en la Terraza', '{\n    \"wifi\" : false,\n    \"aire_acondicionado\" : false,\n    \"interior\" : false,\n    \"terraza\" : true,\n    \"piscina\" : false\n}'),
(8, 'Salón de eventos 3', 'Salón de eventos', 'Piso 1', 'Salón de eventos en el Piso 1', '{\n    \"wifi\" : false,\n    \"aire_acondicionado\" : false,\n    \"interior\" : false,\n    \"terraza\" : true,\n    \"piscina\" : false\n}'),
(9, 'Bio Sport', 'Gym', 'Planta baja', 'Gimnasio BioSport en la Planta Baja', '{\n    \"wifi\" : true,\n    \"aire_acondicionado\" : true,\n    \"interior\" : true,\n    \"terraza\" : false,\n    \"piscina\" : true\n}'),
(10, 'Number (n)ine', 'Tienda', 'Piso 4', 'Tienda Number (nine) en el Piso 4', '{\n    \"wifi\" : true,\n    \"aire_acondicionado\" : true,\n    \"interior\" : true,\n    \"terraza\" : false,\n    \"piscina\" : false\n}'),
(11, 'Minerva', 'Restaurante', 'Planta baja', 'Restaurante Minerva en la Planta baja', '{\n    \"wifi\" : true,\n    \"aire_acondicionado\" : true,\n    \"interior\" : true,\n    \"terraza\" : false,\n    \"piscina\" : false\n}');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reservas`
--

CREATE TABLE `reservas` (
  `id_reserva` int(11) NOT NULL,
  `id_habitacion` int(11) NOT NULL,
  `id_cliente` int(11) NOT NULL,
  `data_entrada` date DEFAULT NULL,
  `data_salida` date DEFAULT NULL,
  `precio_inicial` decimal(10,0) DEFAULT NULL,
  `precio_final` decimal(10,0) DEFAULT NULL,
  `estado` varchar(255) NOT NULL,
  `json_servicios` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL CHECK (json_valid(`json_servicios`))
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `reservas`
--

INSERT INTO `reservas` (`id_reserva`, `id_habitacion`, `id_cliente`, `data_entrada`, `data_salida`, `precio_inicial`, `precio_final`, `estado`, `json_servicios`) VALUES
(1, 50, 223, '2023-05-31', '2023-06-12', 219, 269, 'Check-in', '[\"aire_acondicionado\", \"cocina\", \"caja_fuerte\"]'),
(2, 73, 18, '2023-05-31', '2023-06-05', 245, 428, 'Check-in', '[\"aire_acondicionado\", \"cocina\", \"caja_fuerte\", \"regalo\"]'),
(3, 20, 469, '2023-06-04', '2023-06-05', 267, 570, 'Check-in', '[\"wifi\", \"aire_acondicionado\", \"cocina\"]'),
(4, 37, 118, '2023-06-04', '2023-06-12', 204, 241, 'Check-in', '[\"wifi\", \"regalo\"]'),
(5, 18, 377, '2023-05-31', '2023-06-11', 208, 352, 'Check-in', '[\"wifi\", \"aire_acondicionado\", \"cocina\", \"caja_fuerte\", \"regalo\"]'),
(6, 18, 1, '2023-06-06', '2023-06-11', 208, 440, 'Check-in', '[\"wifi\", \"aire_acondicionado\", \"cocina\", \"caja_fuerte\", \"regalo\"]'),
(7, 28, 41, '2023-06-01', '2023-06-08', 181, 329, 'Check-in', '[\"wifi\", \"cocina\"]'),
(8, 49, 346, '2023-06-01', '2023-06-04', 228, 420, 'Check-in', '[\"wifi\", \"aire_acondicionado\", \"limpieza_diaria\", \"cambio_sabanas_toallas\", \"regalo\"]'),
(9, 97, 132, '2023-06-09', '2023-06-10', 197, 436, 'Check-in', '[\"cocina\", \"caja_fuerte\"]'),
(10, 63, 271, '2023-05-30', '2023-06-11', 294, 422, 'Check-in', '[\"wifi\", \"cocina\", \"limpieza_diaria\", \"cambio_sabanas_toallas\", \"regalo\"]'),
(11, 91, 192, '2023-05-30', '2023-06-12', 197, 436, 'Check-in', '[\"wifi\", \"aire_acondicionado\", \"cocina\"]'),
(12, 94, 182, '2023-06-03', '2023-06-09', 178, 486, 'Check-in', '[\"wifi\", \"limpieza_diaria\", \"regalo\"]'),
(13, 35, 441, '2023-06-09', '2023-06-11', 250, 559, 'Check-in', '[\"aire_acondicionado\", \"cocina\", \"limpieza_diaria\", \"cambio_sabanas_toallas\", \"regalo\"]'),
(14, 15, 259, '2023-05-30', '2023-06-09', 277, 520, 'Check-in', '[\"aire_acondicionado\", \"cocina\", \"regalo\"]'),
(15, 48, 24, '2023-06-04', '2023-06-10', 218, 443, 'Check-in', '[\"wifi\", \"cocina\", \"caja_fuerte\", \"limpieza_diaria\"]'),
(16, 32, 323, '2023-06-03', '2023-06-08', 117, 204, 'Check-in', '[\"wifi\", \"aire_acondicionado\", \"cocina\", \"cambio_sabanas_toallas\", \"regalo\"]'),
(17, 68, 148, '2023-05-31', '2023-06-07', 222, 325, 'Check-in', '[\"caja_fuerte\", \"limpieza_diaria\", \"regalo\"]'),
(18, 20, 273, '2023-06-03', '2023-06-11', 267, 385, 'Check-in', '[\"wifi\", \"aire_acondicionado\", \"cocina\"]'),
(19, 64, 259, '2023-06-06', '2023-06-10', 123, 162, 'Check-in', '[\"wifi\", \"cambio_sabanas_toallas\", \"regalo\"]'),
(20, 73, 203, '2023-05-30', '2023-06-09', 245, 334, 'Check-in', '[\"aire_acondicionado\", \"cocina\", \"caja_fuerte\", \"regalo\"]'),
(21, 84, 300, '2023-06-06', '2023-06-07', 107, 369, 'Check-in', '[\"wifi\", \"aire_acondicionado\", \"cocina\", \"limpieza_diaria\", \"cambio_sabanas_toallas\"]'),
(22, 13, 195, '2023-06-04', '2023-06-09', 228, 289, 'Check-in', '[\"wifi\", \"caja_fuerte\", \"limpieza_diaria\", \"cambio_sabanas_toallas\", \"regalo\"]'),
(23, 24, 202, '2023-06-05', '2023-06-12', 175, 482, 'Check-in', '[\"aire_acondicionado\", \"cocina\", \"limpieza_diaria\", \"cambio_sabanas_toallas\", \"regalo\"]'),
(24, 94, 345, '2023-05-30', '2023-06-11', 178, 205, 'Check-in', '[\"wifi\", \"limpieza_diaria\", \"regalo\"]'),
(25, 6, 402, '2023-06-02', '2023-06-04', 257, 319, 'Check-in', '[\"wifi\", \"caja_fuerte\", \"limpieza_diaria\", \"cambio_sabanas_toallas\"]'),
(26, 60, 172, '2023-06-06', '2023-06-08', 167, 383, 'Check-in', '[\"aire_acondicionado\", \"cocina\", \"caja_fuerte\", \"limpieza_diaria\"]'),
(27, 92, 378, '2023-06-03', '2023-06-05', 300, 351, 'Check-in', '[\"wifi\", \"cocina\", \"caja_fuerte\", \"limpieza_diaria\", \"cambio_sabanas_toallas\"]'),
(28, 91, 394, '2023-05-31', '2023-06-03', 197, 471, 'Check-in', '[\"wifi\", \"aire_acondicionado\", \"cocina\"]'),
(29, 92, 124, '2023-05-31', '2023-06-01', 300, 565, 'Check-in', '[\"wifi\", \"cocina\", \"caja_fuerte\", \"limpieza_diaria\", \"cambio_sabanas_toallas\"]'),
(30, 96, 500, '2023-06-11', '2023-06-12', 146, 400, 'Check-in', '[\"aire_acondicionado\", \"cocina\", \"caja_fuerte\", \"limpieza_diaria\", \"regalo\"]');

--
-- Disparadores `reservas`
--
DELIMITER $$
CREATE TRIGGER `tr_reservas_habitaciones` AFTER INSERT ON `reservas` FOR EACH ROW BEGIN

DECLARE i INT DEFAULT 1;
DECLARE id INT DEFAULT 1;
DECLARE reservas_id INT DEFAULT 1;

-- 1. bucle for para recorrer todos los IDs de la tabla habitaciones

-- 2. ir comprobando 1 a 1 si esta el valor.

-- 3. si esta, actualizar el status a 0 en la tabla habitaciones.

WHILE i <= 100 DO -- 1
	SET id = (SELECT habitaciones.id FROM habitaciones WHERE id = i LIMIT 1);
    SET reservas_id = (SELECT reservas.id_habitacion FROM reservas WHERE reservas.id_reserva = i LIMIT 1);
    	IF reservas_id = id THEN -- 2
			UPDATE habitaciones	
            SET disponible = false -- 3
            WHERE habitaciones.id = id;
        END IF;
	SET i = i + 1;
END WHILE;

END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura para la vista `habitaciones_view`
--
DROP TABLE IF EXISTS `habitaciones_view`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `habitaciones_view`  AS SELECT `habitaciones`.`id` AS `id`, `habitaciones`.`nombre` AS `nombre`, `habitaciones`.`descripcion` AS `descripcion`, `habitaciones`.`capacidad` AS `capacidad`, `habitaciones`.`tipo` AS `tipo`, CASE `habitaciones`.`disponible` WHEN 0 THEN 'No' ELSE 'Si' END AS `disponible`, `habitaciones`.`precio` AS `precio`, CASE json_value(`habitaciones`.`json_caracteristicas`,'$.wifi') WHEN 0 THEN 'No' ELSE 'Si' END AS `wifi`, CASE json_value(`habitaciones`.`json_caracteristicas`,'$.aire_acondicionado') WHEN 0 THEN 'No' ELSE 'Si' END AS `aire_acondicionado`, CASE json_value(`habitaciones`.`json_caracteristicas`,'$.cocina') WHEN 0 THEN 'No' ELSE 'Si' END AS `cocina`, CASE json_value(`habitaciones`.`json_caracteristicas`,'$.caja_fuerte') WHEN 0 THEN 'No' ELSE 'Si' END AS `caja_fuerte`, CASE json_value(`habitaciones`.`json_caracteristicas`,'$.limpieza_diaria') WHEN 0 THEN 'No' ELSE 'Si' END AS `limpieza_diaria`, CASE json_value(`habitaciones`.`json_caracteristicas`,'$.cambio_sabanas_toallas') WHEN 0 THEN 'No' ELSE 'Si' END AS `cambio_sabanas_y_toallas`, CASE json_value(`habitaciones`.`json_caracteristicas`,'$.regalo') WHEN 0 THEN 'No' ELSE 'Si' END AS `regalo` FROM `habitaciones` ;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `empleados`
--
ALTER TABLE `empleados`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_local` (`id_local`);

--
-- Indices de la tabla `habitaciones`
--
ALTER TABLE `habitaciones`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `historic`
--
ALTER TABLE `historic`
  ADD PRIMARY KEY (`id_reserva`),
  ADD KEY `id_habitacion` (`id_habitacion`),
  ADD KEY `id_cliente` (`id_cliente`);

--
-- Indices de la tabla `locales`
--
ALTER TABLE `locales`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `reservas`
--
ALTER TABLE `reservas`
  ADD PRIMARY KEY (`id_reserva`),
  ADD KEY `id_habitacion` (`id_habitacion`),
  ADD KEY `id_cliente` (`id_cliente`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `clientes`
--
ALTER TABLE `clientes`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=501;

--
-- AUTO_INCREMENT de la tabla `empleados`
--
ALTER TABLE `empleados`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=101;

--
-- AUTO_INCREMENT de la tabla `habitaciones`
--
ALTER TABLE `habitaciones`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=201;

--
-- AUTO_INCREMENT de la tabla `historic`
--
ALTER TABLE `historic`
  MODIFY `id_reserva` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `locales`
--
ALTER TABLE `locales`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT de la tabla `reservas`
--
ALTER TABLE `reservas`
  MODIFY `id_reserva` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=31;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `empleados`
--
ALTER TABLE `empleados`
  ADD CONSTRAINT `fk_local` FOREIGN KEY (`id_local`) REFERENCES `locales` (`id`);

--
-- Filtros para la tabla `historic`
--
ALTER TABLE `historic`
  ADD CONSTRAINT `historic_ibfk_1` FOREIGN KEY (`id_habitacion`) REFERENCES `habitaciones` (`id`),
  ADD CONSTRAINT `historic_ibfk_2` FOREIGN KEY (`id_cliente`) REFERENCES `clientes` (`id`);

--
-- Filtros para la tabla `reservas`
--
ALTER TABLE `reservas`
  ADD CONSTRAINT `reservas_ibfk_1` FOREIGN KEY (`id_habitacion`) REFERENCES `habitaciones` (`id`),
  ADD CONSTRAINT `reservas_ibfk_2` FOREIGN KEY (`id_cliente`) REFERENCES `clientes` (`id`);

DELIMITER $$
--
-- Eventos
--
CREATE DEFINER=`root`@`localhost` EVENT `reservationInsertEvery1min` ON SCHEDULE EVERY 1 MINUTE STARTS '2023-06-12 11:59:34' ON COMPLETION NOT PRESERVE ENABLE DO CALL randomReservations()$$

DELIMITER ;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
