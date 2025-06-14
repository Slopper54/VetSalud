-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 08-06-2025 a las 19:28:28
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `clinicaveterinaria`
--
CREATE DATABASE IF NOT EXISTS `clinicaveterinaria` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `clinicaveterinaria`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cita`
--

CREATE TABLE `cita` (
  `id` int(11) NOT NULL,
  `fecha` datetime NOT NULL,
  `motivo` varchar(255) DEFAULT NULL,
  `id_mascota` int(11) DEFAULT NULL,
  `id_veterinario` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `cita`
--

INSERT INTO `cita` (`id`, `fecha`, `motivo`, `id_mascota`, `id_veterinario`) VALUES
(1, '2025-05-10 09:00:00', 'Vacunación anual', 1, 1),
(2, '2025-05-11 10:30:00', 'Control dermatológico', 2, 3),
(3, '2025-05-12 11:15:00', 'Chequeo general', 3, 2),
(4, '2025-05-13 16:00:00', 'Problema dental', 4, 4),
(5, '2025-05-14 13:45:00', 'Control de peso', 5, 5);


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `dueno`
--

CREATE TABLE `dueno` (
  `id` int(11) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `email` varchar(100) DEFAULT NULL,
  `telefono` varchar(20) DEFAULT NULL,
  `DNI` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `dueno`
--

INSERT INTO `dueno` (`id`, `nombre`, `email`, `telefono`, `DNI`) VALUES
(1, 'Pepe Martínez', 'pepe.martinez@gmail.com', '643719896', '39678349F'),
(2, 'Laura Gómez', 'laura.gomez@gmail.com', '689123456', '45678123T'),
(3, 'Carlos Pérez', 'carlos.perez@gmail.com', '677891234', '34562987Z'),
(4, 'Ana Martínez', 'ana.martinez@gmail.com', '666987321', '78125644L'),
(5, 'Jorge Rivera', 'jorge.rivera@gmail.com', '695456789', '12034567X');


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `factura`
--

CREATE TABLE `factura` (
  `id` int(11) NOT NULL,
  `fecha_emision` date NOT NULL,
  `total` decimal(10,2) DEFAULT NULL,
  `metodo_pago` varchar(50) DEFAULT NULL,
  `id_cita` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `factura`
--

INSERT INTO `factura` (`id`, `fecha_emision`, `total`, `metodo_pago`, `id_cita`) VALUES
(1, '2025-05-10', 45.00, 'Efectivo', 1),
(2, '2025-05-11', 60.50, 'Tarjeta', 2),
(3, '2025-05-12', 40.00, 'Transferencia', 3),
(4, '2025-05-13', 85.75, 'Tarjeta', 4),
(5, '2025-05-14', 35.00, 'Efectivo', 5);


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `historiaclinica`
--

CREATE TABLE `historiaclinica` (
  `id` int(11) NOT NULL,
  `fecha` date NOT NULL,
  `resumen` text DEFAULT NULL,
  `id_mascota` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `historiaclinica`
--

INSERT INTO `historiaclinica` (`id`, `fecha`, `resumen`, `id_mascota`) VALUES
(1, '2025-05-11', 'Alto sobrepeso, se inicia una dieta.', 1),
(2, '2025-05-11', 'Dermatitis tratada con antibióticos.', 2),
(3, '2025-05-12', 'Ligero sobrepeso, se recomienda dieta.', 3),
(4, '2025-05-13', 'Extracción dental realizada sin complicaciones.', 4),
(5, '2025-05-14', 'Buen estado general. Se aplicó vacuna.', 5);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mascota`
--

CREATE TABLE `mascota` (
  `id` int(11) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `especie` varchar(50) DEFAULT NULL,
  `raza` varchar(50) DEFAULT NULL,
  `fecha_nacimiento` date DEFAULT NULL,
  `id_dueno` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `mascota`
--

INSERT INTO `mascota` (`id`, `nombre`, `especie`, `raza`, `fecha_nacimiento`, `id_dueno`) VALUES
(1, 'Luna', 'Perro', 'Husky', '2020-05-10', 1),
(2, 'Milo', 'Gato', 'Persa', '2019-09-23', 2),
(3, 'Rocky', 'Perro', 'Bulldog', '2021-01-15', 3),
(4, 'Nina', 'Gato', 'Siamés', '2018-03-04', 4),
(5, 'Toby', 'Conejo', 'Enano', '2022-07-30', 5);


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tratamiento`
--

CREATE TABLE `tratamiento` (
  `id` int(11) NOT NULL,
  `descripcion` text DEFAULT NULL,
  `medicamento` varchar(100) DEFAULT NULL,
  `fecha_inicio` date DEFAULT NULL,
  `fecha_fin` date DEFAULT NULL,
  `id_mascota` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `tratamiento`
--

INSERT INTO `tratamiento` (`id`, `descripcion`, `medicamento`, `fecha_inicio`, `fecha_fin`, `id_mascota`) VALUES
(1, 'Antibiótico para infección', 'Amoxicilina', '2025-05-10', '2025-05-15', 1),
(2, 'Control de dolor post-cirugía', 'Meloxicam', '2025-05-11', '2025-05-13', 2),
(3, 'Desinflamatorio', 'Carprofeno', '2025-05-12', '2025-05-14', 3),
(4, 'Anestesia local pre-extracción', 'Isofluorano', '2025-05-13', '2025-05-13', 4),
(5, 'Vitaminas post-esterilización', 'Complejo B', '2025-05-14', '2025-05-20', 5);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vacunacion`
--

CREATE TABLE `vacunacion` (
  `id` int(11) NOT NULL,
  `tipo_vacuna` varchar(100) DEFAULT NULL,
  `fecha` date DEFAULT NULL,
  `dosis` varchar(50) DEFAULT NULL,
  `id_mascota` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `vacunacion`
--

INSERT INTO `vacunacion` (`id`, `tipo_vacuna`, `fecha`, `dosis`, `id_mascota`) VALUES
(1, 'Rabia', '2025-05-10', '1 mL', 1),
(2, 'Triple felina', '2025-05-11', '0.5 mL', 2),
(3, 'Parvovirus', '2025-05-12', '1 mL', 3),
(4, 'Leucemia felina', '2025-05-13', '0.5 mL', 4),
(5, 'Mixomatosis', '2025-05-14', '0.3 mL', 5);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `veterinario`
--

CREATE TABLE `veterinario` (
  `id` int(11) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `especialidad` varchar(100) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `veterinario`
--

INSERT INTO `veterinario` (`id`, `nombre`, `especialidad`, `email`) VALUES
(1, 'Dr. Fernández', 'Medicina General', 'fernandez.vet@gmail.com'),
(2, 'Dra. Ruiz', 'Cirugía', 'ruiz.cirugia@gmail.com'),
(3, 'Dr. Gómez', 'Dermatología', 'gomez.derma@gmail.com'),
(4, 'Dra. Torres', 'Odontología', 'torres.odon@gmail.com'),
(5, 'Dr. Castillo', 'Cardiología', 'castillo.cardio@gmail.com');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cita`
--
ALTER TABLE `cita`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_mascota` (`id_mascota`),
  ADD KEY `id_veterinario` (`id_veterinario`);

--
-- Indices de la tabla `dueno`
--
ALTER TABLE `dueno`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `factura`
--
ALTER TABLE `factura`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `id_cita` (`id_cita`);

--
-- Indices de la tabla `historiaclinica`
--
ALTER TABLE `historiaclinica`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_mascota` (`id_mascota`);

--
-- Indices de la tabla `mascota`
--
ALTER TABLE `mascota`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_dueno` (`id_dueno`);

--
-- Indices de la tabla `tratamiento`
--
ALTER TABLE `tratamiento`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_mascota` (`id_mascota`);

--
-- Indices de la tabla `vacunacion`
--
ALTER TABLE `vacunacion`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_mascota` (`id_mascota`);

--
-- Indices de la tabla `veterinario`
--
ALTER TABLE `veterinario`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `cita`
--
ALTER TABLE `cita`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `dueno`
--
ALTER TABLE `dueno`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `factura`
--
ALTER TABLE `factura`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `historiaclinica`
--
ALTER TABLE `historiaclinica`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `mascota`
--
ALTER TABLE `mascota`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `tratamiento`
--
ALTER TABLE `tratamiento`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `vacunacion`
--
ALTER TABLE `vacunacion`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `veterinario`
--
ALTER TABLE `veterinario`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `cita`
--
ALTER TABLE `cita`
  ADD CONSTRAINT `cita_ibfk_1` FOREIGN KEY (`id_mascota`) REFERENCES `mascota` (`id`) ON DELETE CASCADE,
  ADD CONSTRAINT `cita_ibfk_2` FOREIGN KEY (`id_veterinario`) REFERENCES `veterinario` (`id`) ON DELETE SET NULL;

--
-- Filtros para la tabla `factura`
--
ALTER TABLE `factura`
  ADD CONSTRAINT `factura_ibfk_1` FOREIGN KEY (`id_cita`) REFERENCES `cita` (`id`) ON DELETE CASCADE;

--
-- Filtros para la tabla `historiaclinica`
--
ALTER TABLE `historiaclinica`
  ADD CONSTRAINT `historiaclinica_ibfk_1` FOREIGN KEY (`id_mascota`) REFERENCES `mascota` (`id`) ON DELETE CASCADE;

--
-- Filtros para la tabla `mascota`
--
ALTER TABLE `mascota`
  ADD CONSTRAINT `mascota_ibfk_1` FOREIGN KEY (`id_dueno`) REFERENCES `dueno` (`id`) ON DELETE CASCADE;

--
-- Filtros para la tabla `tratamiento`
--
ALTER TABLE `tratamiento`
  ADD CONSTRAINT `tratamiento_ibfk_1` FOREIGN KEY (`id_mascota`) REFERENCES `mascota` (`id`) ON DELETE CASCADE;

--
-- Filtros para la tabla `vacunacion`
--
ALTER TABLE `vacunacion`
  ADD CONSTRAINT `vacunacion_ibfk_1` FOREIGN KEY (`id_mascota`) REFERENCES `mascota` (`id`) ON DELETE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
