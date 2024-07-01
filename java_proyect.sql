-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 01-07-2024 a las 02:50:10
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
-- Base de datos: `java_proyect`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `adulto`
--

CREATE TABLE `adulto` (
  `id_adulto` int(11) NOT NULL,
  `id_alumnos` int(11) NOT NULL,
  `Nombre` varchar(50) NOT NULL,
  `Apellido` varchar(50) NOT NULL,
  `DNI` int(15) NOT NULL,
  `Nacionalidad` varchar(20) NOT NULL,
  `Direccion` varchar(20) NOT NULL,
  `Telefono` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `adulto`
--

INSERT INTO `adulto` (`id_adulto`, `id_alumnos`, `Nombre`, `Apellido`, `DNI`, `Nacionalidad`, `Direccion`, `Telefono`) VALUES
(3, 200234, 'Billy', 'Butcher', 42141, 'Peru', 'Pe.29344352', 325255626);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `alumnos`
--

CREATE TABLE `alumnos` (
  `id_alumnos` int(11) NOT NULL,
  `fecha_admision` date DEFAULT NULL,
  `Nro_legajo` int(20) DEFAULT NULL,
  `Procedencia` varchar(50) DEFAULT NULL,
  `Nombre` varchar(30) DEFAULT NULL,
  `Apellido` varchar(30) DEFAULT NULL,
  `DNI` int(12) DEFAULT NULL,
  `Fecha_nacimiento` date DEFAULT NULL,
  `Nacionalidad` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `id_usuarios` int(11) NOT NULL,
  `Nombre_usuario` varchar(50) NOT NULL,
  `Contraseña` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`id_usuarios`, `Nombre_usuario`, `Contraseña`) VALUES
(0, 'To', 'Bias');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `adulto`
--
ALTER TABLE `adulto`
  ADD PRIMARY KEY (`id_adulto`),
  ADD UNIQUE KEY `unique_dni` (`DNI`);

--
-- Indices de la tabla `alumnos`
--
ALTER TABLE `alumnos`
  ADD PRIMARY KEY (`id_alumnos`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`id_usuarios`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `adulto`
--
ALTER TABLE `adulto`
  MODIFY `id_adulto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `alumnos`
--
ALTER TABLE `alumnos`
  MODIFY `id_alumnos` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
