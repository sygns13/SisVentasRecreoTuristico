-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.7.20-log


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema bdhuertolazaro
--

CREATE DATABASE IF NOT EXISTS bdhuertolazaro;
USE bdhuertolazaro;

--
-- Definition of table `almacens`
--

DROP TABLE IF EXISTS `almacens`;
CREATE TABLE `almacens` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(500) DEFAULT NULL,
  `direccion` varchar(500) DEFAULT NULL,
  `empresa_id` int(11) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `activo` tinyint(4) DEFAULT NULL,
  `borrado` tinyint(4) DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `almacens`
--

/*!40000 ALTER TABLE `almacens` DISABLE KEYS */;
/*!40000 ALTER TABLE `almacens` ENABLE KEYS */;


--
-- Definition of table `bancos`
--

DROP TABLE IF EXISTS `bancos`;
CREATE TABLE `bancos` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(500) DEFAULT NULL,
  `dir` varchar(500) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `empresa_id` int(11) DEFAULT NULL,
  `activo` tinyint(4) DEFAULT NULL,
  `borrado` tinyint(4) DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `bancos`
--

/*!40000 ALTER TABLE `bancos` DISABLE KEYS */;
/*!40000 ALTER TABLE `bancos` ENABLE KEYS */;


--
-- Definition of table `cabeceras`
--

DROP TABLE IF EXISTS `cabeceras`;
CREATE TABLE `cabeceras` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'Codigo de tabla Autogenerado',
  `idexterno` varchar(50) DEFAULT NULL,
  `empr_razonsocial` varchar(200) DEFAULT NULL COMMENT 'Razon social de la empresa',
  `empr_ubigeo` varchar(6) DEFAULT NULL COMMENT 'Codigo de Ubigeo de la empresa',
  `empr_nombrecomercial` varchar(200) DEFAULT NULL COMMENT 'Nombre Comercial de la empresa',
  `empr_direccion` varchar(200) DEFAULT NULL COMMENT 'Direccion de la Empresa',
  `empr_provincia` varchar(200) DEFAULT NULL COMMENT 'Provincia de la empresa',
  `empr_departamento` varchar(200) DEFAULT NULL COMMENT 'Departamento de la empresa',
  `empr_distrito` varchar(200) DEFAULT NULL COMMENT 'Distrito de la empresa',
  `empr_pais` varchar(200) DEFAULT NULL COMMENT 'Pais de la empresa - PE',
  `empr_nroruc` varchar(11) DEFAULT NULL COMMENT 'Numero de Ruc de la empresa',
  `empr_tipodoc` varchar(45) DEFAULT NULL COMMENT 'Tiop de documento de la empresa - 6 - RUC',
  `clie_numero` varchar(45) DEFAULT NULL COMMENT 'Documento del cliente',
  `clie_tipodoc` varchar(45) DEFAULT NULL COMMENT 'Tipo de documento del cliente  - 6  - RUC',
  `clie_nombre` varchar(200) DEFAULT NULL COMMENT 'Nombre / Razon Social del cliente',
  `docu_fecha` date DEFAULT NULL COMMENT 'fecha del documento formato YYYY-MM-DD',
  `docu_tipodocumento` varchar(45) DEFAULT NULL COMMENT 'Tipo de Documento \n01 - Factura\n03 - Boleta de Venta\n07 - Nota de Credito\n08 - Nota de Debito\n20 - Retenciones',
  `docu_numero` varchar(45) DEFAULT NULL COMMENT 'Numero de Documento\nformat \nserie - numero\nserie: \nF000 factura\nB000 Boleta \nR000 Retenciones\n-------------\nNota de credito  y Nota de Debito\nsi e a una factura\nF000\nsi es a una Boleta\nB000',
  `docu_moneda` varchar(45) DEFAULT NULL COMMENT 'Moneda del documento\nPEN - Soles\nUSD - Dollar',
  `docu_gravada` varchar(45) DEFAULT NULL COMMENT 'Importe total de Documento grabado al IGV',
  `docu_inafecta` varchar(45) DEFAULT NULL COMMENT 'importe inafecto del documento',
  `docu_exonerada` varchar(45) DEFAULT NULL COMMENT 'importe exonerado del IGV  del documento',
  `docu_gratuita` varchar(45) DEFAULT NULL COMMENT 'importe de valor gratuito  del documento',
  `docu_descuento` varchar(45) DEFAULT NULL COMMENT 'importe de descuento del documento',
  `docu_subtotal` varchar(45) DEFAULT NULL COMMENT 'importe subtotal del documento',
  `docu_total` varchar(45) DEFAULT NULL COMMENT 'importe total  del documento\n/ importe total retenido',
  `docu_igv` varchar(45) DEFAULT NULL COMMENT 'Importe del IGV del documento',
  `tasa_igv` varchar(45) DEFAULT NULL COMMENT 'Tasa del IGV =18 ',
  `docu_isc` varchar(45) DEFAULT NULL COMMENT 'Importe  del ISC',
  `tasa_isc` varchar(45) DEFAULT NULL COMMENT 'Tasa ISC',
  `docu_otrostributos` varchar(45) DEFAULT NULL COMMENT 'Otros importes de otros tributos',
  `tasa_otrostributos` varchar(45) DEFAULT NULL COMMENT 'Tasa de otros tributos',
  `docu_otroscargos` varchar(45) DEFAULT NULL COMMENT 'Otros cargos',
  `docu_percepcion` varchar(45) DEFAULT NULL COMMENT 'Importe de percepcion',
  `hashcode` varchar(100) DEFAULT NULL COMMENT 'Has code de la impresion\n\nsYlI7o6ndTiOEYz+Yv4jmz3CnWY=',
  `cdr` varchar(200) DEFAULT NULL COMMENT 'Estado del CDR',
  `cdr_nota` varchar(500) DEFAULT NULL COMMENT 'Nota del CDR',
  `cdr_observacion` varchar(2000) DEFAULT ' ' COMMENT 'Notas de Observaciones del CDR',
  `docu_enviaws` varchar(45) DEFAULT 'S' COMMENT 'Estado si el documento se envia al ws de SUNAT\nS- Si se envia.\nN- No se envia.',
  `docu_proce_status` varchar(45) DEFAULT 'N' COMMENT 'N - Nuevo\nB - Bloqueo\nP - Proceso-\nE - Enviado\nX - Error de Envio\n\n',
  `docu_proce_fecha` datetime DEFAULT NULL,
  `docu_link_pdf` varchar(200) DEFAULT NULL,
  `docu_link_cdr` varchar(200) DEFAULT NULL,
  `docu_link_xml` varchar(200) DEFAULT NULL,
  `clie_correo_cpe1` varchar(100) DEFAULT NULL COMMENT 'Correo cliente 1',
  `clie_correo_cpe2` varchar(100) DEFAULT NULL COMMENT 'Correo cliente 2',
  `user_id` int(11) DEFAULT NULL,
  `empresa_id` int(11) DEFAULT NULL,
  `activo` tinyint(4) DEFAULT NULL,
  `borrado` tinyint(4) DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  `venta_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `idExterno_UNIQUE` (`idexterno`),
  KEY `idventa` (`venta_id`),
  KEY `idExterno_Cab_idx` (`idexterno`),
  KEY `fk_cabeceras_ventas1_idx` (`venta_id`),
  CONSTRAINT `cabecera_ibfk_1` FOREIGN KEY (`venta_id`) REFERENCES `ventas` (`id`),
  CONSTRAINT `fk_cabeceras_ventas1` FOREIGN KEY (`venta_id`) REFERENCES `ventas` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `cabeceras`
--

/*!40000 ALTER TABLE `cabeceras` DISABLE KEYS */;
/*!40000 ALTER TABLE `cabeceras` ENABLE KEYS */;


--
-- Definition of table `caja_accions`
--

DROP TABLE IF EXISTS `caja_accions`;
CREATE TABLE `caja_accions` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `accion` tinyint(4) DEFAULT NULL,
  `fecha` date DEFAULT NULL,
  `hora` time DEFAULT NULL,
  `monto` double DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `empresa_id` int(11) DEFAULT NULL,
  `activo` tinyint(4) DEFAULT NULL,
  `borrado` tinyint(4) DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  `caja_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_caja_accions_cajas1_idx` (`caja_id`),
  CONSTRAINT `fk_caja_accions_cajas1` FOREIGN KEY (`caja_id`) REFERENCES `cajas` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `caja_accions`
--

/*!40000 ALTER TABLE `caja_accions` DISABLE KEYS */;
/*!40000 ALTER TABLE `caja_accions` ENABLE KEYS */;


--
-- Definition of table `cajas`
--

DROP TABLE IF EXISTS `cajas`;
CREATE TABLE `cajas` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `numero` varchar(45) DEFAULT NULL,
  `descripcion` varchar(500) DEFAULT NULL,
  `monto` double DEFAULT NULL,
  `activo` tinyint(4) DEFAULT NULL,
  `borrado` tinyint(4) DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `user_id_gestiona` int(11) DEFAULT NULL,
  `sede_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_cajas_sedes1_idx` (`sede_id`),
  CONSTRAINT `fk_cajas_sedes1` FOREIGN KEY (`sede_id`) REFERENCES `sedes` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `cajas`
--

/*!40000 ALTER TABLE `cajas` DISABLE KEYS */;
/*!40000 ALTER TABLE `cajas` ENABLE KEYS */;


--
-- Definition of table `clientes`
--

DROP TABLE IF EXISTS `clientes`;
CREATE TABLE `clientes` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(500) DEFAULT NULL,
  `tipo_documento_id` int(11) DEFAULT NULL,
  `documento` varchar(45) DEFAULT NULL,
  `direccion` varchar(500) DEFAULT NULL,
  `telefono` varchar(15) DEFAULT NULL,
  `correo1` varchar(1000) DEFAULT NULL,
  `correo2` varchar(1000) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `empresa_id` int(11) DEFAULT NULL,
  `ativo` tinyint(4) DEFAULT NULL,
  `borrado` tinyint(4) DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `clientes`
--

/*!40000 ALTER TABLE `clientes` DISABLE KEYS */;
/*!40000 ALTER TABLE `clientes` ENABLE KEYS */;


--
-- Definition of table `cobro_ventas`
--

DROP TABLE IF EXISTS `cobro_ventas`;
CREATE TABLE `cobro_ventas` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `venta_id` int(11) NOT NULL,
  `fecha` date DEFAULT NULL,
  `tipo_pago` tinyint(4) DEFAULT NULL,
  `importe` double DEFAULT NULL,
  `numero_tarjeta` varchar(200) DEFAULT NULL,
  `numero_cheque` varchar(200) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `empresa_id` int(11) DEFAULT NULL,
  `activo` tinyint(4) DEFAULT NULL,
  `borrado` tinyint(4) DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  `tipo_tarjeta_id` int(11) DEFAULT NULL,
  `banco_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_cobro_ventas_ventas1_idx` (`venta_id`),
  KEY `fk_cobro_ventas_tipo_tarjetas1_idx` (`tipo_tarjeta_id`),
  KEY `fk_cobro_ventas_bancos1_idx` (`banco_id`),
  CONSTRAINT `fk_cobro_ventas_bancos1` FOREIGN KEY (`banco_id`) REFERENCES `bancos` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_cobro_ventas_tipo_tarjetas1` FOREIGN KEY (`tipo_tarjeta_id`) REFERENCES `tipo_tarjetas` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_cobro_ventas_ventas1` FOREIGN KEY (`venta_id`) REFERENCES `ventas` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `cobro_ventas`
--

/*!40000 ALTER TABLE `cobro_ventas` DISABLE KEYS */;
/*!40000 ALTER TABLE `cobro_ventas` ENABLE KEYS */;


--
-- Definition of table `comprobantes`
--

DROP TABLE IF EXISTS `comprobantes`;
CREATE TABLE `comprobantes` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `serie` varchar(45) DEFAULT NULL,
  `numero` varchar(45) DEFAULT NULL,
  `cantidad_digitos` int(11) DEFAULT NULL,
  `estado` tinyint(4) DEFAULT NULL,
  `empresa_id` int(11) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  `activo` tinyint(4) DEFAULT NULL,
  `borrado` tinyint(4) DEFAULT NULL,
  `sede_id` int(11) NOT NULL,
  `tipo_comprobante_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_comprobantes_sedes1_idx` (`sede_id`),
  KEY `fk_comprobantes_tipo_comprobantes1_idx` (`tipo_comprobante_id`),
  CONSTRAINT `fk_comprobantes_sedes1` FOREIGN KEY (`sede_id`) REFERENCES `sedes` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_comprobantes_tipo_comprobantes1` FOREIGN KEY (`tipo_comprobante_id`) REFERENCES `tipo_comprobantes` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `comprobantes`
--

/*!40000 ALTER TABLE `comprobantes` DISABLE KEYS */;
/*!40000 ALTER TABLE `comprobantes` ENABLE KEYS */;


--
-- Definition of table `configs`
--

DROP TABLE IF EXISTS `configs`;
CREATE TABLE `configs` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(500) DEFAULT NULL,
  `valor` varchar(500) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `empresa_id` int(11) DEFAULT NULL,
  `activo` tinyint(4) DEFAULT NULL,
  `borrado` tinyint(4) DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `configs`
--

/*!40000 ALTER TABLE `configs` DISABLE KEYS */;
/*!40000 ALTER TABLE `configs` ENABLE KEYS */;


--
-- Definition of table `cuenta_proveedors`
--

DROP TABLE IF EXISTS `cuenta_proveedors`;
CREATE TABLE `cuenta_proveedors` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `numero_cuenta` varchar(200) DEFAULT NULL,
  `banco_id` int(11) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `empresa_id` int(11) DEFAULT NULL,
  `activo` tinyint(4) DEFAULT NULL,
  `borrado` tinyint(4) DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  `proveedor_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_cuenta_proveedors_proveedors1_idx` (`proveedor_id`),
  CONSTRAINT `fk_cuenta_proveedors_proveedors1` FOREIGN KEY (`proveedor_id`) REFERENCES `proveedors` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `cuenta_proveedors`
--

/*!40000 ALTER TABLE `cuenta_proveedors` DISABLE KEYS */;
/*!40000 ALTER TABLE `cuenta_proveedors` ENABLE KEYS */;


--
-- Definition of table `datos_users`
--

DROP TABLE IF EXISTS `datos_users`;
CREATE TABLE `datos_users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombres` varchar(500) DEFAULT NULL,
  `apellido_paterno` varchar(250) DEFAULT NULL,
  `apellido_materno` varchar(250) DEFAULT NULL,
  `direccion` varchar(500) DEFAULT NULL,
  `telefono` varchar(45) DEFAULT NULL,
  `tipo_documento_id` int(11) DEFAULT NULL,
  `documento` varchar(45) DEFAULT NULL,
  `email` varchar(500) DEFAULT NULL,
  `user_gestiona_id` int(11) DEFAULT NULL,
  `empresa_id` int(11) DEFAULT NULL,
  `activo` tinyint(4) DEFAULT NULL,
  `borrado` tinyint(4) DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  `user_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_datos_users_users1_idx` (`user_id`),
  CONSTRAINT `fk_datos_users_users1` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `datos_users`
--

/*!40000 ALTER TABLE `datos_users` DISABLE KEYS */;
/*!40000 ALTER TABLE `datos_users` ENABLE KEYS */;


--
-- Definition of table `detalle_entrada_stoks`
--

DROP TABLE IF EXISTS `detalle_entrada_stoks`;
CREATE TABLE `detalle_entrada_stoks` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cantidad` double DEFAULT NULL,
  `costo` double DEFAULT NULL,
  `almacen_id` int(11) DEFAULT NULL,
  `cantreal` int(11) DEFAULT NULL,
  `unidad` varchar(200) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `empresa_id` int(11) DEFAULT NULL,
  `activo` tinyint(4) DEFAULT NULL,
  `borrado` tinyint(4) DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  `lote_id` int(11) DEFAULT NULL,
  `producto_id` int(11) NOT NULL,
  `entrada_stock_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_detalle_entrada_stoks_productos1_idx` (`producto_id`),
  KEY `fk_detalle_entrada_stoks_entrada_stocks1_idx` (`entrada_stock_id`),
  CONSTRAINT `fk_detalle_entrada_stoks_entrada_stocks1` FOREIGN KEY (`entrada_stock_id`) REFERENCES `entrada_stocks` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_detalle_entrada_stoks_productos1` FOREIGN KEY (`producto_id`) REFERENCES `productos` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `detalle_entrada_stoks`
--

/*!40000 ALTER TABLE `detalle_entrada_stoks` DISABLE KEYS */;
/*!40000 ALTER TABLE `detalle_entrada_stoks` ENABLE KEYS */;


--
-- Definition of table `detalle_unidad_productos`
--

DROP TABLE IF EXISTS `detalle_unidad_productos`;
CREATE TABLE `detalle_unidad_productos` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `codigo` varchar(45) DEFAULT NULL,
  `precio` double DEFAULT NULL,
  `costo_compra` double DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `empresa_id` int(11) DEFAULT NULL,
  `activo` tinyint(4) DEFAULT NULL,
  `borrado` tinyint(4) DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  `producto_id` int(11) NOT NULL,
  `unidad_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_detalle_unidad_productos_productos1_idx` (`producto_id`),
  KEY `fk_detalle_unidad_productos_unidads1_idx` (`unidad_id`),
  CONSTRAINT `fk_detalle_unidad_productos_productos1` FOREIGN KEY (`producto_id`) REFERENCES `productos` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_detalle_unidad_productos_unidads1` FOREIGN KEY (`unidad_id`) REFERENCES `unidads` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `detalle_unidad_productos`
--

/*!40000 ALTER TABLE `detalle_unidad_productos` DISABLE KEYS */;
/*!40000 ALTER TABLE `detalle_unidad_productos` ENABLE KEYS */;


--
-- Definition of table `detalle_ventas`
--

DROP TABLE IF EXISTS `detalle_ventas`;
CREATE TABLE `detalle_ventas` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `venta_id` int(11) NOT NULL,
  `producto_id` int(11) DEFAULT NULL,
  `precio_venta` double DEFAULT NULL,
  `precio_compra` double DEFAULT NULL,
  `cantidad` double DEFAULT NULL,
  `almacen_id` int(11) DEFAULT NULL,
  `es_grabado` tinyint(4) DEFAULT NULL,
  `descuento` double DEFAULT NULL,
  `tipo_descuento` tinyint(4) DEFAULT NULL,
  `cantidad_real` double DEFAULT NULL,
  `unidad` varchar(200) DEFAULT NULL,
  `lote_id` int(11) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `empresa_id` int(11) DEFAULT NULL,
  `activo` tinyint(4) DEFAULT NULL,
  `borrado` tinyint(4) DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  `platos_ventas_id` int(11) DEFAULT NULL,
  `tipo` tinyint(4) DEFAULT NULL COMMENT 'tipo\n1->platos\n2->productos',
  PRIMARY KEY (`id`),
  KEY `fk_detalle_ventas_ventas1_idx` (`venta_id`),
  KEY `fk_detalle_ventas_productos1_idx` (`producto_id`),
  KEY `fk_detalle_ventas_platos_ventas1_idx` (`platos_ventas_id`),
  CONSTRAINT `fk_detalle_ventas_platos_ventas1` FOREIGN KEY (`platos_ventas_id`) REFERENCES `platos_ventas` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_detalle_ventas_productos1` FOREIGN KEY (`producto_id`) REFERENCES `productos` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_detalle_ventas_ventas1` FOREIGN KEY (`venta_id`) REFERENCES `ventas` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `detalle_ventas`
--

/*!40000 ALTER TABLE `detalle_ventas` DISABLE KEYS */;
/*!40000 ALTER TABLE `detalle_ventas` ENABLE KEYS */;


--
-- Definition of table `detalles`
--

DROP TABLE IF EXISTS `detalles`;
CREATE TABLE `detalles` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'Codigo autogenerado de la tabla',
  `cabecera_id` int(11) NOT NULL COMMENT 'Codigo relacion de la tabla cabecera',
  `item_orden` varchar(45) DEFAULT NULL COMMENT 'Numero de Orden',
  `item_unidad` varchar(45) DEFAULT NULL COMMENT 'Unidad de Medida del Item\ndefecto NIU',
  `item_cantidad` varchar(45) DEFAULT NULL COMMENT 'Cantidad de Item',
  `item_codproducto` varchar(45) DEFAULT NULL COMMENT 'Codigo del Producto',
  `item_descripcion` varchar(255) DEFAULT NULL COMMENT 'Descripcion del Producto ',
  `item_afectacion` varchar(45) DEFAULT NULL COMMENT 'Tipo de afectacion\n\n10 Gravado - Operación Onerosa (uso comun)\n\nverificar CATALOGO No. 07',
  `item_tipo_precio_venta` varchar(45) DEFAULT '01' COMMENT 'Código de tipo de precio - Catálogo No. 16',
  `item_pventa` varchar(45) DEFAULT NULL COMMENT 'Precio de venta unitario sin IGV',
  `item_pventa_no_onerosa` varchar(45) DEFAULT '0.00' COMMENT 'Valor referencial unitario por ítem en operaciones no onerosas ( gratuito)',
  `item_to_subtotal` varchar(45) DEFAULT NULL COMMENT 'Importe sub total',
  `item_to_igv` varchar(45) DEFAULT NULL COMMENT 'Importe del IGV',
  `item_preunitfin` varchar(45) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `empresa_id` int(11) DEFAULT NULL,
  `activo` tinyint(4) DEFAULT NULL,
  `borrado` tinyint(4) DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_detalle_cabecera_idx` (`cabecera_id`),
  CONSTRAINT `fk_detalle_cabecera` FOREIGN KEY (`cabecera_id`) REFERENCES `cabeceras` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `detalles`
--

/*!40000 ALTER TABLE `detalles` DISABLE KEYS */;
/*!40000 ALTER TABLE `detalles` ENABLE KEYS */;


--
-- Definition of table `empresas`
--

DROP TABLE IF EXISTS `empresas`;
CREATE TABLE `empresas` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ruc` varchar(20) DEFAULT NULL,
  `razonSocial` varchar(500) DEFAULT NULL,
  `descripcion` text,
  `telefono` varchar(45) DEFAULT NULL,
  `direccion` varchar(500) DEFAULT NULL,
  `email` varchar(500) DEFAULT NULL,
  `activo` tinyint(4) DEFAULT NULL,
  `borrado` tinyint(4) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `empresas`
--

/*!40000 ALTER TABLE `empresas` DISABLE KEYS */;
/*!40000 ALTER TABLE `empresas` ENABLE KEYS */;


--
-- Definition of table `entrada_stocks`
--

DROP TABLE IF EXISTS `entrada_stocks`;
CREATE TABLE `entrada_stocks` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `numero` int(11) DEFAULT NULL,
  `fecha` date DEFAULT NULL,
  `facturado` tinyint(4) DEFAULT NULL,
  `actualizado` tinyint(4) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `empresa_id` int(11) DEFAULT NULL,
  `activo` tinyint(4) DEFAULT NULL,
  `borrado` tinyint(4) DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  `proveedor_id` int(11) NOT NULL,
  `almacen_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_entrada_stocks_proveedors1_idx` (`proveedor_id`),
  CONSTRAINT `fk_entrada_stocks_proveedors1` FOREIGN KEY (`proveedor_id`) REFERENCES `proveedors` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `entrada_stocks`
--

/*!40000 ALTER TABLE `entrada_stocks` DISABLE KEYS */;
/*!40000 ALTER TABLE `entrada_stocks` ENABLE KEYS */;


--
-- Definition of table `factura_proveedors`
--

DROP TABLE IF EXISTS `factura_proveedors`;
CREATE TABLE `factura_proveedors` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `serie` varchar(45) DEFAULT NULL,
  `numero` varchar(45) DEFAULT NULL,
  `fecha` date DEFAULT NULL,
  `pagado` tinyint(4) DEFAULT NULL,
  `total` double DEFAULT NULL,
  `observaciones` text,
  `total_soles` double DEFAULT NULL,
  `en_soles` tinyint(4) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `empresa_id` int(11) DEFAULT NULL,
  `activo` tinyint(4) DEFAULT NULL,
  `borrado` tinyint(4) DEFAULT NULL,
  `entrada_stock_id` int(11) NOT NULL,
  `tipo_comprobantes_id` int(11) NOT NULL,
  `sede_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_factura_proveedors_entrada_stocks1_idx` (`entrada_stock_id`),
  KEY `fk_factura_proveedors_tipo_comprobantes1_idx` (`tipo_comprobantes_id`),
  KEY `fk_factura_proveedors_sedes1_idx` (`sede_id`),
  CONSTRAINT `fk_factura_proveedors_entrada_stocks1` FOREIGN KEY (`entrada_stock_id`) REFERENCES `entrada_stocks` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_factura_proveedors_sedes1` FOREIGN KEY (`sede_id`) REFERENCES `sedes` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_factura_proveedors_tipo_comprobantes1` FOREIGN KEY (`tipo_comprobantes_id`) REFERENCES `tipo_comprobantes` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `factura_proveedors`
--

/*!40000 ALTER TABLE `factura_proveedors` DISABLE KEYS */;
/*!40000 ALTER TABLE `factura_proveedors` ENABLE KEYS */;


--
-- Definition of table `ingreso_salida_cajas`
--

DROP TABLE IF EXISTS `ingreso_salida_cajas`;
CREATE TABLE `ingreso_salida_cajas` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `monto` double DEFAULT NULL,
  `concepto` varchar(45) DEFAULT NULL,
  `comprobante` varchar(45) DEFAULT NULL,
  `fecha` date DEFAULT NULL,
  `tipo` tinyint(4) DEFAULT NULL,
  `tipo_comprobante` tinyint(4) DEFAULT NULL,
  `hora` time DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `empresa_id` int(11) DEFAULT NULL,
  `activo` tinyint(4) DEFAULT NULL,
  `borrado` tinyint(4) DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  `caja_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_ingreso_salida_cajas_cajas1_idx` (`caja_id`),
  CONSTRAINT `fk_ingreso_salida_cajas_cajas1` FOREIGN KEY (`caja_id`) REFERENCES `cajas` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `ingreso_salida_cajas`
--

/*!40000 ALTER TABLE `ingreso_salida_cajas` DISABLE KEYS */;
/*!40000 ALTER TABLE `ingreso_salida_cajas` ENABLE KEYS */;


--
-- Definition of table `leyendas`
--

DROP TABLE IF EXISTS `leyendas`;
CREATE TABLE `leyendas` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cabecera_id` int(11) NOT NULL,
  `leyenda_codigo` varchar(10) NOT NULL,
  `leyenda_texto` varchar(500) NOT NULL,
  `user_id` int(11) DEFAULT NULL,
  `empresa_id` int(11) DEFAULT NULL,
  `activo` tinyint(4) DEFAULT NULL,
  `borrado` tinyint(4) DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_table1_cabecera1_idx` (`cabecera_id`),
  CONSTRAINT `fk_table1_cabecera1` FOREIGN KEY (`cabecera_id`) REFERENCES `cabeceras` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `leyendas`
--

/*!40000 ALTER TABLE `leyendas` DISABLE KEYS */;
/*!40000 ALTER TABLE `leyendas` ENABLE KEYS */;


--
-- Definition of table `lotes`
--

DROP TABLE IF EXISTS `lotes`;
CREATE TABLE `lotes` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(250) DEFAULT NULL,
  `fecha_ingreso` date DEFAULT NULL,
  `fecha_vencimiento` date DEFAULT NULL,
  `activo_vencimiento` tinyint(4) DEFAULT NULL COMMENT '1->Activo\n0->Inactivo',
  `cantidad` double DEFAULT NULL,
  `observacion` text,
  `user_id` int(11) DEFAULT NULL,
  `empresa_id` int(11) DEFAULT NULL,
  `activo` tinyint(4) DEFAULT NULL,
  `borrado` tinyint(4) DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  `producto_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_lotes_productos1_idx` (`producto_id`),
  CONSTRAINT `fk_lotes_productos1` FOREIGN KEY (`producto_id`) REFERENCES `productos` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `lotes`
--

/*!40000 ALTER TABLE `lotes` DISABLE KEYS */;
/*!40000 ALTER TABLE `lotes` ENABLE KEYS */;


--
-- Definition of table `marcas`
--

DROP TABLE IF EXISTS `marcas`;
CREATE TABLE `marcas` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(250) DEFAULT NULL,
  `activo` tinyint(4) DEFAULT NULL,
  `borrado` tinyint(4) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `empresa_id` int(11) DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `marcas`
--

/*!40000 ALTER TABLE `marcas` DISABLE KEYS */;
/*!40000 ALTER TABLE `marcas` ENABLE KEYS */;


--
-- Definition of table `notas_creditos`
--

DROP TABLE IF EXISTS `notas_creditos`;
CREATE TABLE `notas_creditos` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cabecera_id` int(11) DEFAULT NULL,
  `docu_numero` varchar(50) DEFAULT NULL,
  `serie` varchar(4) DEFAULT NULL,
  `numero` int(11) DEFAULT NULL,
  `codigo` varchar(50) DEFAULT NULL,
  `descripcion` varchar(500) DEFAULT NULL,
  `hashcode` varchar(100) DEFAULT NULL,
  `cdr` varchar(200) DEFAULT NULL,
  `cdr_nota` varchar(500) DEFAULT NULL,
  `cdr_observacion` varchar(2000) DEFAULT NULL,
  `docu_enviaws` varchar(45) DEFAULT NULL,
  `docu_proce_status` varchar(45) DEFAULT NULL,
  `tipo` varchar(45) DEFAULT NULL,
  `proce_fecha` date DEFAULT NULL,
  `tipoanulado` varchar(45) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `empresa_id` int(11) DEFAULT NULL,
  `activo` tinyint(4) DEFAULT NULL,
  `borrado` tinyint(4) DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `notas_creditos`
--

/*!40000 ALTER TABLE `notas_creditos` DISABLE KEYS */;
/*!40000 ALTER TABLE `notas_creditos` ENABLE KEYS */;


--
-- Definition of table `pago_proveedors`
--

DROP TABLE IF EXISTS `pago_proveedors`;
CREATE TABLE `pago_proveedors` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `fecha` date DEFAULT NULL,
  `monto_pago` double DEFAULT NULL,
  `monto_real` double DEFAULT NULL,
  `tipo_pago` tinyint(4) DEFAULT NULL,
  `banco_id_emisor` int(11) DEFAULT NULL,
  `banco_id_receptor` int(11) DEFAULT NULL,
  `numero_cheque` varchar(200) DEFAULT NULL,
  `es_soles` tinyint(4) DEFAULT NULL,
  `codigo_operacion` varchar(200) DEFAULT NULL,
  `empresa_id` int(11) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `activo` tinyint(4) DEFAULT NULL,
  `borrado` tinyint(4) DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  `factura_proveedor_id` int(11) NOT NULL,
  `cuenta_proveedor_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_pago_proveedors_factura_proveedors1_idx` (`factura_proveedor_id`),
  KEY `fk_pago_proveedors_cuenta_proveedors1_idx` (`cuenta_proveedor_id`),
  CONSTRAINT `fk_pago_proveedors_cuenta_proveedors1` FOREIGN KEY (`cuenta_proveedor_id`) REFERENCES `cuenta_proveedors` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_pago_proveedors_factura_proveedors1` FOREIGN KEY (`factura_proveedor_id`) REFERENCES `factura_proveedors` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `pago_proveedors`
--

/*!40000 ALTER TABLE `pago_proveedors` DISABLE KEYS */;
/*!40000 ALTER TABLE `pago_proveedors` ENABLE KEYS */;


--
-- Definition of table `permisos`
--

DROP TABLE IF EXISTS `permisos`;
CREATE TABLE `permisos` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(200) DEFAULT NULL,
  `activo` tinyint(4) DEFAULT NULL,
  `borrado` tinyint(4) DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `permisos`
--

/*!40000 ALTER TABLE `permisos` DISABLE KEYS */;
/*!40000 ALTER TABLE `permisos` ENABLE KEYS */;


--
-- Definition of table `permisos_usuarios`
--

DROP TABLE IF EXISTS `permisos_usuarios`;
CREATE TABLE `permisos_usuarios` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_gestiona_id` int(11) DEFAULT NULL,
  `empresa_id` int(11) DEFAULT NULL,
  `activo` tinyint(4) DEFAULT NULL,
  `borrado` tinyint(4) DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  `user_id` int(11) NOT NULL,
  `permiso_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_permisos_usuarios_users1_idx` (`user_id`),
  KEY `fk_permisos_usuarios_permisos1_idx` (`permiso_id`),
  CONSTRAINT `fk_permisos_usuarios_permisos1` FOREIGN KEY (`permiso_id`) REFERENCES `permisos` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_permisos_usuarios_users1` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `permisos_usuarios`
--

/*!40000 ALTER TABLE `permisos_usuarios` DISABLE KEYS */;
/*!40000 ALTER TABLE `permisos_usuarios` ENABLE KEYS */;


--
-- Definition of table `platos_ventas`
--

DROP TABLE IF EXISTS `platos_ventas`;
CREATE TABLE `platos_ventas` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `precio_unitario` double DEFAULT NULL,
  `cantidad` int(11) DEFAULT NULL,
  `fecha` date DEFAULT NULL,
  `costo_produccion` double DEFAULT NULL,
  `activo` tinyint(4) DEFAULT NULL,
  `borrado` tinyint(4) DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  `producto_plato_id` int(11) NOT NULL,
  `user_id` int(11) DEFAULT NULL,
  `empresa_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_platos_ventas_producto_platos_idx` (`producto_plato_id`),
  CONSTRAINT `fk_platos_ventas_producto_platos` FOREIGN KEY (`producto_plato_id`) REFERENCES `producto_platos` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `platos_ventas`
--

/*!40000 ALTER TABLE `platos_ventas` DISABLE KEYS */;
/*!40000 ALTER TABLE `platos_ventas` ENABLE KEYS */;


--
-- Definition of table `producto_platos`
--

DROP TABLE IF EXISTS `producto_platos`;
CREATE TABLE `producto_platos` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(500) DEFAULT NULL,
  `precio_venta` double DEFAULT NULL,
  `codigo` varchar(200) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `empresa_id` int(11) DEFAULT NULL,
  `activo` tinyint(4) DEFAULT NULL,
  `borrado` tinyint(4) DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  `tipo_producto_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_producto_platos_tipo_productos1_idx` (`tipo_producto_id`),
  CONSTRAINT `fk_producto_platos_tipo_productos1` FOREIGN KEY (`tipo_producto_id`) REFERENCES `tipo_productos` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `producto_platos`
--

/*!40000 ALTER TABLE `producto_platos` DISABLE KEYS */;
/*!40000 ALTER TABLE `producto_platos` ENABLE KEYS */;


--
-- Definition of table `productos`
--

DROP TABLE IF EXISTS `productos`;
CREATE TABLE `productos` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(250) DEFAULT NULL,
  `stock_minimo` double DEFAULT NULL,
  `precio_unidad` double DEFAULT NULL,
  `grabado` tinyint(4) DEFAULT NULL,
  `precio_compra` double DEFAULT NULL,
  `fecha` date DEFAULT NULL,
  `ubicacion` varchar(500) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `empresa_id` int(11) DEFAULT NULL,
  `activo` tinyint(4) DEFAULT NULL,
  `borrado` tinyint(4) DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  `tipo_producto_id` int(11) NOT NULL,
  `marca_id` int(11) NOT NULL,
  `activo_lotes` tinyint(4) DEFAULT NULL COMMENT 'Activo_lotes\n1->Activo\n0->Inactivo',
  PRIMARY KEY (`id`),
  KEY `fk_productos_tipo_productos1_idx` (`tipo_producto_id`),
  KEY `fk_productos_marcas1_idx` (`marca_id`),
  CONSTRAINT `fk_productos_marcas1` FOREIGN KEY (`marca_id`) REFERENCES `marcas` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_productos_tipo_productos1` FOREIGN KEY (`tipo_producto_id`) REFERENCES `tipo_productos` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `productos`
--

/*!40000 ALTER TABLE `productos` DISABLE KEYS */;
/*!40000 ALTER TABLE `productos` ENABLE KEYS */;


--
-- Definition of table `proveedors`
--

DROP TABLE IF EXISTS `proveedors`;
CREATE TABLE `proveedors` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `tipo_documento_id` int(11) DEFAULT NULL,
  `documento` varchar(20) DEFAULT NULL,
  `nombre` varchar(500) DEFAULT NULL,
  `direccion` varchar(500) DEFAULT NULL,
  `telefono` varchar(45) DEFAULT NULL,
  `anexo` varchar(45) DEFAULT NULL,
  `celular` varchar(45) DEFAULT NULL,
  `responsable` varchar(500) DEFAULT NULL,
  `activo` tinyint(4) DEFAULT NULL,
  `borrado` tinyint(4) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `empresa_id` int(11) DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `proveedors`
--

/*!40000 ALTER TABLE `proveedors` DISABLE KEYS */;
/*!40000 ALTER TABLE `proveedors` ENABLE KEYS */;


--
-- Definition of table `resumen_boletas`
--

DROP TABLE IF EXISTS `resumen_boletas`;
CREATE TABLE `resumen_boletas` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `razonsocial` varchar(2000) DEFAULT NULL,
  `ruc` varchar(15) DEFAULT NULL,
  `fecha_emision` date DEFAULT NULL,
  `fecha_envio` date DEFAULT NULL,
  `enviar` varchar(45) DEFAULT NULL,
  `docstatus` varchar(45) DEFAULT NULL,
  `hashcode` varchar(500) DEFAULT NULL,
  `cdr` varchar(500) DEFAULT NULL,
  `cdr_nota` varchar(2000) DEFAULT NULL,
  `docu_link_pdf` varchar(2000) DEFAULT NULL,
  `docu_link_cdr` varchar(2000) DEFAULT NULL,
  `docu_link_xml` varchar(2000) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `empresa_id` int(11) DEFAULT NULL,
  `activo` tinyint(4) DEFAULT NULL,
  `borrado` tinyint(4) DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `resumen_boletas`
--

/*!40000 ALTER TABLE `resumen_boletas` DISABLE KEYS */;
/*!40000 ALTER TABLE `resumen_boletas` ENABLE KEYS */;


--
-- Definition of table `resumen_detalles`
--

DROP TABLE IF EXISTS `resumen_detalles`;
CREATE TABLE `resumen_detalles` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `resumen_boleta_id` int(11) DEFAULT NULL,
  `cabecera_id` int(11) DEFAULT NULL,
  `activo` tinyint(4) DEFAULT NULL,
  `borrado` tinyint(4) DEFAULT NULL,
  `empresa_id` int(11) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `idresumen` (`resumen_boleta_id`),
  KEY `docu_codigo` (`cabecera_id`),
  CONSTRAINT `resumendetalle_ibfk_1` FOREIGN KEY (`resumen_boleta_id`) REFERENCES `resumen_boletas` (`id`),
  CONSTRAINT `resumendetalle_ibfk_2` FOREIGN KEY (`cabecera_id`) REFERENCES `cabeceras` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `resumen_detalles`
--

/*!40000 ALTER TABLE `resumen_detalles` DISABLE KEYS */;
/*!40000 ALTER TABLE `resumen_detalles` ENABLE KEYS */;


--
-- Definition of table `retiro_productos`
--

DROP TABLE IF EXISTS `retiro_productos`;
CREATE TABLE `retiro_productos` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `fecha` date DEFAULT NULL,
  `motivo` text,
  `hora` time DEFAULT NULL,
  `cantidad` double DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `empresa_id` int(11) DEFAULT NULL,
  `activo` tinyint(4) DEFAULT NULL,
  `borrado` tinyint(4) DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  `lote_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_retiro_productos_lotes1_idx` (`lote_id`),
  CONSTRAINT `fk_retiro_productos_lotes1` FOREIGN KEY (`lote_id`) REFERENCES `lotes` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `retiro_productos`
--

/*!40000 ALTER TABLE `retiro_productos` DISABLE KEYS */;
/*!40000 ALTER TABLE `retiro_productos` ENABLE KEYS */;


--
-- Definition of table `sedes`
--

DROP TABLE IF EXISTS `sedes`;
CREATE TABLE `sedes` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(500) DEFAULT NULL,
  `codigo_sunat` varchar(500) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `empresa_id` int(11) DEFAULT NULL,
  `activo` tinyint(4) DEFAULT NULL,
  `borrado` tinyint(4) DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `sedes`
--

/*!40000 ALTER TABLE `sedes` DISABLE KEYS */;
/*!40000 ALTER TABLE `sedes` ENABLE KEYS */;


--
-- Definition of table `stocks`
--

DROP TABLE IF EXISTS `stocks`;
CREATE TABLE `stocks` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cantidad` double DEFAULT NULL,
  `activo` tinyint(4) DEFAULT NULL,
  `borrado` tinyint(4) DEFAULT NULL,
  `empresa_id` int(11) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  `almacen_id` int(11) NOT NULL,
  `producto_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_stocks_almacens1_idx` (`almacen_id`),
  KEY `fk_stocks_productos1_idx` (`producto_id`),
  CONSTRAINT `fk_stocks_almacens1` FOREIGN KEY (`almacen_id`) REFERENCES `almacens` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_stocks_productos1` FOREIGN KEY (`producto_id`) REFERENCES `productos` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `stocks`
--

/*!40000 ALTER TABLE `stocks` DISABLE KEYS */;
/*!40000 ALTER TABLE `stocks` ENABLE KEYS */;


--
-- Definition of table `tipo_comprobantes`
--

DROP TABLE IF EXISTS `tipo_comprobantes`;
CREATE TABLE `tipo_comprobantes` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  `para_venta` tinyint(4) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `empresa_id` int(11) DEFAULT NULL,
  `activo` tinyint(4) DEFAULT NULL,
  `borrado` tinyint(4) DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `tipo_comprobantes`
--

/*!40000 ALTER TABLE `tipo_comprobantes` DISABLE KEYS */;
/*!40000 ALTER TABLE `tipo_comprobantes` ENABLE KEYS */;


--
-- Definition of table `tipo_documentos`
--

DROP TABLE IF EXISTS `tipo_documentos`;
CREATE TABLE `tipo_documentos` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `tipo` varchar(200) DEFAULT NULL,
  `dockey` varchar(45) DEFAULT NULL,
  `descripcion` text,
  `activo` tinyint(4) DEFAULT NULL,
  `borrado` tinyint(4) DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `tipo_documentos`
--

/*!40000 ALTER TABLE `tipo_documentos` DISABLE KEYS */;
/*!40000 ALTER TABLE `tipo_documentos` ENABLE KEYS */;


--
-- Definition of table `tipo_productos`
--

DROP TABLE IF EXISTS `tipo_productos`;
CREATE TABLE `tipo_productos` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `tipo` varchar(250) DEFAULT NULL,
  `user_id` tinyint(4) DEFAULT NULL,
  `empresa_id` tinyint(4) DEFAULT NULL,
  `activo` tinyint(4) DEFAULT NULL,
  `borrado` tinyint(4) DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  `tipo_producto_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `tipo_productos`
--

/*!40000 ALTER TABLE `tipo_productos` DISABLE KEYS */;
/*!40000 ALTER TABLE `tipo_productos` ENABLE KEYS */;


--
-- Definition of table `tipo_tarjetas`
--

DROP TABLE IF EXISTS `tipo_tarjetas`;
CREATE TABLE `tipo_tarjetas` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(500) DEFAULT NULL,
  `activo` tinyint(4) DEFAULT NULL,
  `borrado` tinyint(4) DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `empresa_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `tipo_tarjetas`
--

/*!40000 ALTER TABLE `tipo_tarjetas` DISABLE KEYS */;
/*!40000 ALTER TABLE `tipo_tarjetas` ENABLE KEYS */;


--
-- Definition of table `tipo_users`
--

DROP TABLE IF EXISTS `tipo_users`;
CREATE TABLE `tipo_users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(500) DEFAULT NULL,
  `descripcion` text,
  `activo` tinyint(4) DEFAULT NULL,
  `borrado` tinyint(4) DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `tipo_users`
--

/*!40000 ALTER TABLE `tipo_users` DISABLE KEYS */;
/*!40000 ALTER TABLE `tipo_users` ENABLE KEYS */;


--
-- Definition of table `unidads`
--

DROP TABLE IF EXISTS `unidads`;
CREATE TABLE `unidads` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(250) DEFAULT NULL,
  `abreviatura` varchar(45) DEFAULT NULL,
  `cantidad` double DEFAULT NULL,
  `activo` tinyint(4) DEFAULT NULL,
  `borrado` tinyint(4) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `empresa_id` int(11) DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `unidads`
--

/*!40000 ALTER TABLE `unidads` DISABLE KEYS */;
/*!40000 ALTER TABLE `unidads` ENABLE KEYS */;


--
-- Definition of table `users`
--

DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(250) DEFAULT NULL,
  `email` varchar(500) DEFAULT NULL,
  `password` varchar(500) DEFAULT NULL,
  `remember_token` varchar(500) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `empresa_id` int(11) DEFAULT NULL,
  `activo` tinyint(4) DEFAULT NULL,
  `borrado` tinyint(4) DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  `verification_token` varchar(500) DEFAULT NULL,
  `tipo_user_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_users_tipo_users1_idx` (`tipo_user_id`),
  CONSTRAINT `fk_users_tipo_users1` FOREIGN KEY (`tipo_user_id`) REFERENCES `tipo_users` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `users`
--

/*!40000 ALTER TABLE `users` DISABLE KEYS */;
/*!40000 ALTER TABLE `users` ENABLE KEYS */;


--
-- Definition of table `ventas`
--

DROP TABLE IF EXISTS `ventas`;
CREATE TABLE `ventas` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `fecha` date DEFAULT NULL,
  `clientes_id` int(11) NOT NULL,
  `comprobantes_id` int(11) NOT NULL,
  `subtotal_inafecto` double DEFAULT NULL,
  `sub_total_afecto` double DEFAULT NULL,
  `igv` double DEFAULT NULL,
  `estado` tinyint(4) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `pagado` tinyint(4) DEFAULT NULL,
  `hora` time DEFAULT NULL,
  `empresa_id` int(11) DEFAULT NULL,
  `activo` tinyint(4) DEFAULT NULL,
  `borrado` tinyint(4) DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_ventas_clientes1_idx` (`clientes_id`),
  KEY `fk_ventas_comprobantes1_idx` (`comprobantes_id`),
  CONSTRAINT `fk_ventas_clientes1` FOREIGN KEY (`clientes_id`) REFERENCES `clientes` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_ventas_comprobantes1` FOREIGN KEY (`comprobantes_id`) REFERENCES `comprobantes` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `ventas`
--

/*!40000 ALTER TABLE `ventas` DISABLE KEYS */;
/*!40000 ALTER TABLE `ventas` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
