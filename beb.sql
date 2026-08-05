-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 06-08-2026 a las 00:43:35
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
-- Base de datos: `beb`
--
CREATE DATABASE IF NOT EXISTS `beb` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `beb`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `asesores_financieros`
--

DROP TABLE IF EXISTS `asesores_financieros`;
CREATE TABLE `asesores_financieros` (
  `id_asesor` int(11) NOT NULL,
  `nombres` varchar(50) NOT NULL,
  `apellidos` varchar(50) NOT NULL,
  `codigo_empleado` varchar(20) NOT NULL,
  `clave` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `asesores_financieros`
--

INSERT INTO `asesores_financieros` (`id_asesor`, `nombres`, `apellidos`, `codigo_empleado`, `clave`) VALUES
(1, 'Josemanuel', 'Cantorin', 'EMP001', '1234'),
(2, 'Sofia', 'Vilchez', 'EMP002', '2222'),
(3, 'Carla', 'Peña', 'EMP003', '3333'),
(4, 'Pepe', 'Castro', 'EMP004', '4444');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

DROP TABLE IF EXISTS `clientes`;
CREATE TABLE `clientes` (
  `id_cliente` int(11) NOT NULL,
  `nombres` varchar(50) NOT NULL,
  `apellidos` varchar(50) NOT NULL,
  `sexo` varchar(10) NOT NULL,
  `dni` varchar(50) NOT NULL,
  `telefono` varchar(9) NOT NULL,
  `direccion` varchar(100) NOT NULL,
  `Asesores_Financieros_id_asesor` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `clientes`
--

INSERT INTO `clientes` (`id_cliente`, `nombres`, `apellidos`, `sexo`, `dni`, `telefono`, `direccion`, `Asesores_Financieros_id_asesor`) VALUES
(7, 'marco', 'Alvares', 'Masculino', '68687878', '9343434', 'punta negra', 1),
(11, 'Luis', 'Ramirez', 'Masculino', '12345678', '987654321', 'Miraflores', 2),
(12, 'Ana', 'Torres', 'Femenino', '87654321', '912345678', 'Barranco', 2),
(13, 'Pedro', 'Gomez', 'Masculino', '11223344', '934567890', 'Surco', 3),
(14, 'Lucia', 'Martinez', 'Femenino', '22334455', '945678901', 'San Isidro', 3),
(15, 'Carlos', 'Lopez', 'Masculino', '33445566', '956789012', 'La Molina', 4),
(16, 'Maria', 'Fernandez', 'Femenino', '44556677', '967890123', 'Chorrillos', 4),
(17, 'Jorge', 'Diaz', 'Masculino', '55667788', '978901234', 'Villa El Salvador', 1),
(18, 'Valeria', 'Rojas', 'Femenino', '66778899', '989012345', 'San Miguel', 1),
(19, 'Diego', 'Castillo', 'Masculino', '77889900', '990123456', 'Callao', 2),
(20, 'Camila', 'Sanchez', 'Femenino', '88990011', '901234567', 'Lince', 3),
(22, 'Claudio', 'Fernandez', 'Femenino', '6023424', '945763456', 'Callao', 1),
(23, 'Camila', 'Fox', 'Femenino', '65757', '65745645', 'Villa el Salvador', 1),
(24, 'Miguel', 'Chavez', 'Masculino', '65757', '99677777', 'Santa Maria', 1),
(25, 'marco', 'hinostroza', 'Masculino', '60993493', '929342834', 'villa maria del tirunfu', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cuentas_ahorro`
--

DROP TABLE IF EXISTS `cuentas_ahorro`;
CREATE TABLE `cuentas_ahorro` (
  `id_cuenta` int(11) NOT NULL,
  `numero_cuenta` varchar(20) NOT NULL,
  `saldo_actual` decimal(10,2) NOT NULL,
  `estado` varchar(15) NOT NULL,
  `Clientes_id_cliente` int(11) NOT NULL,
  `Productos_Financieros_id_producto` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `cuentas_ahorro`
--

INSERT INTO `cuentas_ahorro` (`id_cuenta`, `numero_cuenta`, `saldo_actual`, `estado`, `Clientes_id_cliente`, `Productos_Financieros_id_producto`) VALUES
(1, '100001', 745.00, 'Activa', 11, 1),
(2, '100002', 12000.50, 'Activa', 12, 2),
(3, '100003', 500.00, 'Activa', 13, 1),
(4, '100004', 7500.00, 'Activa', 14, 2),
(5, '100005', 1200.00, 'Inactiva', 15, 7),
(6, '100006', 3000.00, 'Activa', 16, 10),
(7, '100007', 4500.75, 'Activa', 17, 2),
(8, '100008', 600.00, 'Activa', 18, 1),
(9, '100009', 9100.00, 'Activa', 19, 2),
(10, '100010', 200.00, 'Inactiva', 20, 7),
(11, '4611143020', 455.00, 'Activa', 11, 1),
(12, '1665011293', 7878.00, 'Activa', 11, 3),
(13, '3976663474', 800.00, 'Activa', 23, 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `historial_auditoria`
--

DROP TABLE IF EXISTS `historial_auditoria`;
CREATE TABLE `historial_auditoria` (
  `id_auditoria` int(11) NOT NULL,
  `tabla_afectada` varchar(30) NOT NULL,
  `accion_realizada` varchar(20) NOT NULL,
  `fecha_cambio` datetime NOT NULL,
  `Asesores_Financieros_id_asesor` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `historial_auditoria`
--

INSERT INTO `historial_auditoria` (`id_auditoria`, `tabla_afectada`, `accion_realizada`, `fecha_cambio`, `Asesores_Financieros_id_asesor`) VALUES
(1, 'clientes', 'INSERT', '2025-01-10 10:35:00', 1),
(2, 'cuentas_ahorro', 'INSERT', '2025-01-15 14:50:00', 2),
(3, 'transacciones', 'INSERT', '2025-02-01 09:05:00', 3),
(4, 'planes_inversion', 'INSERT', '2025-02-20 16:25:00', 4),
(5, 'clientes', 'UPDATE', '2025-03-05 11:15:00', 1),
(6, 'cuentas_ahorro', 'UPDATE', '2025-03-18 13:45:00', 2),
(7, 'transacciones', 'DELETE', '2025-04-02 15:05:00', 3),
(8, 'planes_inversion', 'UPDATE', '2025-04-12 12:30:00', 4),
(9, 'clientes', 'DELETE', '2025-05-01 17:55:00', 1),
(10, 'cuentas_ahorro', 'INSERT', '2025-05-20 08:20:00', 2),
(11, 'planes_inversion', 'INSERT', '2026-04-08 03:37:19', 1),
(12, 'planes_inversion', 'INSERT', '2026-04-08 05:03:05', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `planes_inversion`
--

DROP TABLE IF EXISTS `planes_inversion`;
CREATE TABLE `planes_inversion` (
  `id_inversion` int(11) NOT NULL,
  `monto_invertido` decimal(10,2) NOT NULL,
  `plazo_meses` int(11) NOT NULL,
  `fecha_inicio` date NOT NULL,
  `fecha_vencimiento` date NOT NULL,
  `estado` varchar(20) NOT NULL DEFAULT 'Activo',
  `Clientes_id_cliente` int(11) NOT NULL,
  `Productos_Financieros_id_producto` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `planes_inversion`
--

INSERT INTO `planes_inversion` (`id_inversion`, `monto_invertido`, `plazo_meses`, `fecha_inicio`, `fecha_vencimiento`, `estado`, `Clientes_id_cliente`, `Productos_Financieros_id_producto`) VALUES
(1, 5000.00, 12, '2025-01-01', '2026-01-01', 'Activo', 11, 3),
(2, 10000.00, 24, '2025-02-15', '2027-02-15', 'Activo', 12, 4),
(3, 7500.00, 18, '2025-03-10', '2026-09-10', 'Activo', 13, 5),
(4, 2000.00, 6, '2025-04-20', '2025-10-20', 'Activo', 14, 9),
(5, 15000.00, 36, '2025-05-05', '2028-05-05', 'Activo', 15, 8),
(6, 3000.00, 12, '2025-06-01', '2026-06-01', 'Activo', 16, 3),
(7, 4500.00, 9, '2025-07-12', '2026-04-12', 'Activo', 17, 5),
(8, 8000.00, 24, '2025-08-25', '2027-08-25', 'Activo', 18, 6),
(9, 2500.00, 12, '2025-09-30', '2026-09-30', 'Activo', 19, 3),
(10, 6000.00, 18, '2025-10-15', '2027-04-15', 'Activo', 20, 4),
(12, 255.00, 3, '2026-04-08', '2026-07-08', 'Activo', 11, 3),
(13, 223.00, 3, '2026-04-08', '2026-07-08', 'Activo', 11, 3),
(14, 100.00, 3, '2026-04-08', '2026-07-08', 'Activo', 11, 3),
(15, 700.00, 12, '2026-04-08', '2027-04-08', 'Activo', 19, 3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productos_financieros`
--

DROP TABLE IF EXISTS `productos_financieros`;
CREATE TABLE `productos_financieros` (
  `id_producto` int(11) NOT NULL,
  `nombre_producto` varchar(50) NOT NULL,
  `tipo_producto` varchar(50) NOT NULL,
  `tasa_interes` decimal(5,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `productos_financieros`
--

INSERT INTO `productos_financieros` (`id_producto`, `nombre_producto`, `tipo_producto`, `tasa_interes`) VALUES
(1, 'Cuenta Ahorro Básica', 'Ahorro', 1.50),
(2, 'Cuenta Ahorro Premium', 'Ahorro', 2.00),
(3, 'Depósito Plazo Fijo', 'Inversión', 3.50),
(4, 'Fondo Mutuo Conservador', 'Inversión', 4.20),
(5, 'Fondo Mutuo Balanceado', 'Inversión', 5.00),
(6, 'Fondo Mutuo Agresivo', 'Inversión', 6.50),
(7, 'Cuenta Corriente', 'Ahorro', 0.50),
(8, 'Plan Jubilación', 'Inversión', 7.00),
(9, 'Certificado Depósito', 'Inversión', 2.80),
(10, 'Cuenta Digital', 'Ahorro', 1.20);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `transacciones`
--

DROP TABLE IF EXISTS `transacciones`;
CREATE TABLE `transacciones` (
  `id_transaccion` int(11) NOT NULL,
  `tipo_operacion` varchar(30) NOT NULL,
  `monto` decimal(10,2) NOT NULL,
  `fecha_hora` datetime NOT NULL,
  `Cuentas_Ahorro_id_cuenta` int(11) NOT NULL,
  `Asesores_Financieros_id_asesor` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `transacciones`
--

INSERT INTO `transacciones` (`id_transaccion`, `tipo_operacion`, `monto`, `fecha_hora`, `Cuentas_Ahorro_id_cuenta`, `Asesores_Financieros_id_asesor`) VALUES
(1, 'Depósito', 500.00, '2025-01-10 10:30:00', 1, 1),
(2, 'Retiro', 200.00, '2025-01-15 14:45:00', 2, 1),
(3, 'Depósito', 1000.00, '2025-02-01 09:00:00', 3, 1),
(4, 'Retiro', 300.00, '2025-02-20 16:20:00', 4, 1),
(5, 'Depósito', 150.00, '2025-03-05 11:10:00', 5, 1),
(6, 'Depósito', 700.00, '2025-03-18 13:40:00', 6, 1),
(7, 'Retiro', 250.00, '2025-04-02 15:00:00', 7, 1),
(8, 'Depósito', 400.00, '2025-04-12 12:25:00', 8, 1),
(9, 'Retiro', 600.00, '2025-05-01 17:50:00', 9, 1),
(10, 'Depósito', 800.00, '2025-05-20 08:15:00', 10, 1),
(11, 'Retiro', 277.00, '2026-04-08 02:08:39', 1, 1),
(12, 'Depósito', 600.00, '2026-04-08 02:08:46', 1, 1),
(13, 'Retiro', 500.00, '2026-04-08 20:42:12', 1, 1),
(14, 'Depósito', 10000.00, '2026-04-08 20:42:12', 1, 1),
(15, 'Retiro', 500.00, '2026-04-08 20:45:20', 2, 1),
(16, 'Depósito', 10000.00, '2026-04-08 20:46:46', 2, 1),
(17, 'Retiro', 10000.00, '2026-04-09 19:01:34', 1, 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `asesores_financieros`
--
ALTER TABLE `asesores_financieros`
  ADD PRIMARY KEY (`id_asesor`);

--
-- Indices de la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`id_cliente`),
  ADD KEY `Clientes_Asesores_Financieros_FK` (`Asesores_Financieros_id_asesor`);

--
-- Indices de la tabla `cuentas_ahorro`
--
ALTER TABLE `cuentas_ahorro`
  ADD PRIMARY KEY (`id_cuenta`),
  ADD KEY `Cuentas_Ahorro_Clientes_FK` (`Clientes_id_cliente`),
  ADD KEY `Cuentas_Ahorro_Productos_Financieros_FK` (`Productos_Financieros_id_producto`);

--
-- Indices de la tabla `historial_auditoria`
--
ALTER TABLE `historial_auditoria`
  ADD PRIMARY KEY (`id_auditoria`),
  ADD KEY `Historial_Auditoria_Asesores_Financieros_FK` (`Asesores_Financieros_id_asesor`);

--
-- Indices de la tabla `planes_inversion`
--
ALTER TABLE `planes_inversion`
  ADD PRIMARY KEY (`id_inversion`),
  ADD KEY `Planes_Inversion_Clientes_FK` (`Clientes_id_cliente`),
  ADD KEY `Planes_Inversion_Productos_Financieros_FK` (`Productos_Financieros_id_producto`);

--
-- Indices de la tabla `productos_financieros`
--
ALTER TABLE `productos_financieros`
  ADD PRIMARY KEY (`id_producto`);

--
-- Indices de la tabla `transacciones`
--
ALTER TABLE `transacciones`
  ADD PRIMARY KEY (`id_transaccion`),
  ADD KEY `Transacciones_Cuentas_Ahorro_FK` (`Cuentas_Ahorro_id_cuenta`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `asesores_financieros`
--
ALTER TABLE `asesores_financieros`
  MODIFY `id_asesor` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `clientes`
--
ALTER TABLE `clientes`
  MODIFY `id_cliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=26;

--
-- AUTO_INCREMENT de la tabla `cuentas_ahorro`
--
ALTER TABLE `cuentas_ahorro`
  MODIFY `id_cuenta` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT de la tabla `historial_auditoria`
--
ALTER TABLE `historial_auditoria`
  MODIFY `id_auditoria` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT de la tabla `planes_inversion`
--
ALTER TABLE `planes_inversion`
  MODIFY `id_inversion` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT de la tabla `productos_financieros`
--
ALTER TABLE `productos_financieros`
  MODIFY `id_producto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `transacciones`
--
ALTER TABLE `transacciones`
  MODIFY `id_transaccion` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD CONSTRAINT `Clientes_Asesores_Financieros_FK` FOREIGN KEY (`Asesores_Financieros_id_asesor`) REFERENCES `asesores_financieros` (`id_asesor`);

--
-- Filtros para la tabla `cuentas_ahorro`
--
ALTER TABLE `cuentas_ahorro`
  ADD CONSTRAINT `Cuentas_Ahorro_Clientes_FK` FOREIGN KEY (`Clientes_id_cliente`) REFERENCES `clientes` (`id_cliente`),
  ADD CONSTRAINT `Cuentas_Ahorro_Productos_Financieros_FK` FOREIGN KEY (`Productos_Financieros_id_producto`) REFERENCES `productos_financieros` (`id_producto`);

--
-- Filtros para la tabla `historial_auditoria`
--
ALTER TABLE `historial_auditoria`
  ADD CONSTRAINT `Historial_Auditoria_Asesores_Financieros_FK` FOREIGN KEY (`Asesores_Financieros_id_asesor`) REFERENCES `asesores_financieros` (`id_asesor`);

--
-- Filtros para la tabla `planes_inversion`
--
ALTER TABLE `planes_inversion`
  ADD CONSTRAINT `Planes_Inversion_Clientes_FK` FOREIGN KEY (`Clientes_id_cliente`) REFERENCES `clientes` (`id_cliente`),
  ADD CONSTRAINT `Planes_Inversion_Productos_Financieros_FK` FOREIGN KEY (`Productos_Financieros_id_producto`) REFERENCES `productos_financieros` (`id_producto`);

--
-- Filtros para la tabla `transacciones`
--
ALTER TABLE `transacciones`
  ADD CONSTRAINT `Transacciones_Cuentas_Ahorro_FK` FOREIGN KEY (`Cuentas_Ahorro_id_cuenta`) REFERENCES `cuentas_ahorro` (`id_cuenta`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
