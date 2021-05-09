-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 09-05-2021 a las 21:44:51
-- Versión del servidor: 10.4.18-MariaDB
-- Versión de PHP: 8.0.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `emple_dep`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleados`
--

CREATE TABLE `empleados` (
  `nro_legajo` int(11) NOT NULL,
  `dni` varchar(11) COLLATE utf8_spanish_ci NOT NULL,
  `apellido` varchar(30) COLLATE utf8_spanish_ci NOT NULL,
  `nombre` varchar(40) COLLATE utf8_spanish_ci NOT NULL,
  `fecha_nac` date NOT NULL,
  `fecha_incorporacion` date NOT NULL,
  `cargo` varchar(20) COLLATE utf8_spanish_ci NOT NULL,
  `sueldo_neto` double NOT NULL,
  `departamentos_id_depto` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `empleados`
--

INSERT INTO `empleados` (`nro_legajo`, `dni`, `apellido`, `nombre`, `fecha_nac`, `fecha_incorporacion`, `cargo`, `sueldo_neto`, `departamentos_id_depto`) VALUES
(1, '12345678', 'perez', 'maria', '1991-05-13', '2020-11-09', 'Administrativa', 45789.5, 1),
(2, '44333322', 'rodriguez', 'daniel', '1978-10-01', '2000-01-30', 'Vendedor', 63865, 3),
(3, '99666777', 'vascue', 'carla', '1995-02-20', '2020-03-13', 'Vendedora', 37000.92, 3),
(4, '36755667', 'carranza', 'astor', '2000-04-25', '2021-05-03', 'Despachador', 28956, 4),
(5, '33440144', 'Brown', 'Otto', '2013-10-12', '2009-11-03', 'Auxiliar', 31992.9, 5),
(6, '18455360', 'Hess', 'Zeph', '2014-10-27', '2005-03-10', 'Despachador', 65368.87, 4),
(7, '22887010', 'Murray', 'Britanni', '2016-06-30', '2004-05-03', 'Auxiliar', 36223, 5),
(8, '26693741', 'Wood', 'Troy', '2016-06-24', '2012-01-25', 'Ingeniero', 63594.44, 2),
(9, '35625591', 'Holt', 'Cleo', '2008-01-17', '2018-10-27', 'Vendedora', 84478, 3),
(10, '35019916', 'Kelly', 'Ima', '2014-04-12', '2004-04-28', 'Administrativo', 77229, 1),
(11, '24205340', 'Mann', 'Rhoda', '2018-08-05', '2010-08-18', 'Administrativa', 23625, 1),
(12, '30445557', 'Nieves', 'Charde', '2007-12-23', '2016-12-03', 'Ingeniera', 72586, 2),
(13, '32873120', 'Porter', 'Fletcher', '2006-12-26', '2010-02-07', 'Auxiliar', 27543.56, 5),
(14, '25704234', 'Velasquez', 'Cassidy', '2008-08-29', '2015-08-18', 'Ingeniero', 87342, 2),
(15, '24356780', 'ramos', 'pilar', '1984-08-16', '2014-09-08', 'Ingeniera', 95644.23, 2);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `empleados`
--
ALTER TABLE `empleados`
  ADD PRIMARY KEY (`nro_legajo`),
  ADD KEY `Empleados_departamentos` (`departamentos_id_depto`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `empleados`
--
ALTER TABLE `empleados`
  ADD CONSTRAINT `Empleados_departamentos` FOREIGN KEY (`departamentos_id_depto`) REFERENCES `departamentos` (`id_depto`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
