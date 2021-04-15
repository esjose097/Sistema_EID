-- MySQL dump 10.13  Distrib 8.0.23, for Win64 (x86_64)
--
-- Host: localhost    Database: tortilleria
-- ------------------------------------------------------
-- Server version	8.0.23

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `detallemovimientomp`
--

DROP TABLE IF EXISTS `detallemovimientomp`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `detallemovimientomp` (
  `iddetallemovimientomp` int NOT NULL AUTO_INCREMENT,
  `movimientomp` int NOT NULL,
  `nummovimiento` int NOT NULL,
  `cantidad` int NOT NULL,
  PRIMARY KEY (`iddetallemovimientomp`),
  KEY `movimintomp_idx` (`movimientomp`),
  CONSTRAINT `movimintomp` FOREIGN KEY (`movimientomp`) REFERENCES `movimientomp` (`idmovimientomp`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `detallemovimientomp`
--

LOCK TABLES `detallemovimientomp` WRITE;
/*!40000 ALTER TABLE `detallemovimientomp` DISABLE KEYS */;
INSERT INTO `detallemovimientomp` VALUES (3,1,1,2),(4,2,1,2),(5,3,2,1),(6,4,3,1),(7,5,3,1);
/*!40000 ALTER TABLE `detallemovimientomp` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `detallemovimientop`
--

DROP TABLE IF EXISTS `detallemovimientop`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `detallemovimientop` (
  `iddetallemovimientop` int NOT NULL AUTO_INCREMENT,
  `movimientop` int NOT NULL,
  `nummovimiento` int NOT NULL,
  `cantidad` int NOT NULL,
  PRIMARY KEY (`iddetallemovimientop`),
  KEY `movimientop_idx` (`movimientop`),
  CONSTRAINT `movimientop` FOREIGN KEY (`movimientop`) REFERENCES `movimientop` (`idmovimientop`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `detallemovimientop`
--

LOCK TABLES `detallemovimientop` WRITE;
/*!40000 ALTER TABLE `detallemovimientop` DISABLE KEYS */;
INSERT INTO `detallemovimientop` VALUES (1,1,1,0);
/*!40000 ALTER TABLE `detallemovimientop` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `detallepedidosmp`
--

DROP TABLE IF EXISTS `detallepedidosmp`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `detallepedidosmp` (
  `iddetallepedidosmp` int NOT NULL AUTO_INCREMENT,
  `materiaprima` int NOT NULL,
  `fecha` date NOT NULL,
  `cantidad` int NOT NULL,
  PRIMARY KEY (`iddetallepedidosmp`),
  UNIQUE KEY `idmovimientomp_UNIQUE` (`iddetallepedidosmp`),
  KEY `materiaprima_idx` (`materiaprima`),
  KEY `mate_idx` (`materiaprima`),
  CONSTRAINT `mate` FOREIGN KEY (`materiaprima`) REFERENCES `materiaprima` (`idmateriaprima`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `detallepedidosmp`
--

LOCK TABLES `detallepedidosmp` WRITE;
/*!40000 ALTER TABLE `detallepedidosmp` DISABLE KEYS */;
/*!40000 ALTER TABLE `detallepedidosmp` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `detallepedidosp`
--

DROP TABLE IF EXISTS `detallepedidosp`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `detallepedidosp` (
  `iddetallepedidosp` int NOT NULL AUTO_INCREMENT,
  `producto` int NOT NULL,
  `fecha` date NOT NULL,
  `cantidad` int NOT NULL,
  `sucursale` int NOT NULL,
  PRIMARY KEY (`iddetallepedidosp`),
  UNIQUE KEY `idmovimientop_UNIQUE` (`iddetallepedidosp`),
  KEY `produccto_idx` (`producto`),
  KEY `sucursalee_idx` (`sucursale`),
  KEY `su_idx` (`sucursale`),
  CONSTRAINT `produccto` FOREIGN KEY (`producto`) REFERENCES `producto` (`idproducto`),
  CONSTRAINT `su` FOREIGN KEY (`sucursale`) REFERENCES `sucursale` (`idsucursale`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `detallepedidosp`
--

LOCK TABLES `detallepedidosp` WRITE;
/*!40000 ALTER TABLE `detallepedidosp` DISABLE KEYS */;
/*!40000 ALTER TABLE `detallepedidosp` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `empleado`
--

DROP TABLE IF EXISTS `empleado`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `empleado` (
  `idempleado` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  `username` varchar(45) NOT NULL,
  `pass` varchar(45) NOT NULL,
  `puesto` varchar(45) NOT NULL,
  `sucursal` int NOT NULL,
  PRIMARY KEY (`idempleado`),
  UNIQUE KEY `idempleado_UNIQUE` (`idempleado`),
  KEY `sucursal_idx` (`sucursal`),
  CONSTRAINT `sucursal` FOREIGN KEY (`sucursal`) REFERENCES `sucursal` (`idsucursal`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `empleado`
--

LOCK TABLES `empleado` WRITE;
/*!40000 ALTER TABLE `empleado` DISABLE KEYS */;
INSERT INTO `empleado` VALUES (1,'pedro','pedrox','pedro123','conserje',1);
/*!40000 ALTER TABLE `empleado` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `existenciamp`
--

DROP TABLE IF EXISTS `existenciamp`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `existenciamp` (
  `idexistenciamp` int NOT NULL AUTO_INCREMENT,
  `materiaprima` int NOT NULL,
  `cantidad` int NOT NULL,
  PRIMARY KEY (`idexistenciamp`),
  UNIQUE KEY `idexistenciamp_UNIQUE` (`idexistenciamp`),
  KEY `materiaprima_idx` (`materiaprima`),
  CONSTRAINT `materiaprima` FOREIGN KEY (`materiaprima`) REFERENCES `materiaprima` (`idmateriaprima`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `existenciamp`
--

LOCK TABLES `existenciamp` WRITE;
/*!40000 ALTER TABLE `existenciamp` DISABLE KEYS */;
INSERT INTO `existenciamp` VALUES (6,1,2),(7,2,1);
/*!40000 ALTER TABLE `existenciamp` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `existenciap`
--

DROP TABLE IF EXISTS `existenciap`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `existenciap` (
  `idexistenciap` int NOT NULL AUTO_INCREMENT,
  `producto` int NOT NULL,
  `cantidad` int NOT NULL,
  PRIMARY KEY (`idexistenciap`),
  UNIQUE KEY `idexistenciap_UNIQUE` (`idexistenciap`),
  KEY `producto_idx` (`producto`),
  CONSTRAINT `producto` FOREIGN KEY (`producto`) REFERENCES `producto` (`idproducto`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `existenciap`
--

LOCK TABLES `existenciap` WRITE;
/*!40000 ALTER TABLE `existenciap` DISABLE KEYS */;
INSERT INTO `existenciap` VALUES (1,1,5);
/*!40000 ALTER TABLE `existenciap` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `listapedidosmat`
--

DROP TABLE IF EXISTS `listapedidosmat`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `listapedidosmat` (
  `idlistapedidosmat` int NOT NULL AUTO_INCREMENT,
  `materiaprima` int NOT NULL,
  `empleado` int NOT NULL,
  `cantidad` int NOT NULL,
  PRIMARY KEY (`idlistapedidosmat`),
  UNIQUE KEY `idlistapedidosmat_UNIQUE` (`idlistapedidosmat`),
  KEY `empleado_idx` (`empleado`),
  KEY `materiaprima_idx` (`materiaprima`),
  KEY `materiaprima` (`materiaprima`),
  KEY `mp_idx` (`materiaprima`),
  CONSTRAINT `empleado` FOREIGN KEY (`empleado`) REFERENCES `empleado` (`idempleado`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `mp` FOREIGN KEY (`materiaprima`) REFERENCES `materiaprima` (`idmateriaprima`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `listapedidosmat`
--

LOCK TABLES `listapedidosmat` WRITE;
/*!40000 ALTER TABLE `listapedidosmat` DISABLE KEYS */;
/*!40000 ALTER TABLE `listapedidosmat` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `listapedidosprod`
--

DROP TABLE IF EXISTS `listapedidosprod`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `listapedidosprod` (
  `idlistapedidosprod` int NOT NULL AUTO_INCREMENT,
  `producto` int NOT NULL,
  `sucursale` int NOT NULL,
  `empleado` int NOT NULL,
  `cantidad` int NOT NULL,
  PRIMARY KEY (`idlistapedidosprod`),
  UNIQUE KEY `idlistapedidosprod_UNIQUE` (`idlistapedidosprod`),
  KEY `empleado_idx` (`empleado`),
  KEY `empleado` (`empleado`),
  KEY `sucursalee_idx` (`sucursale`),
  KEY `prod_idx` (`producto`),
  CONSTRAINT `empleados` FOREIGN KEY (`empleado`) REFERENCES `empleado` (`idempleado`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `prod` FOREIGN KEY (`producto`) REFERENCES `producto` (`idproducto`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `sucursalee` FOREIGN KEY (`sucursale`) REFERENCES `sucursale` (`idsucursale`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `listapedidosprod`
--

LOCK TABLES `listapedidosprod` WRITE;
/*!40000 ALTER TABLE `listapedidosprod` DISABLE KEYS */;
/*!40000 ALTER TABLE `listapedidosprod` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `materiaprima`
--

DROP TABLE IF EXISTS `materiaprima`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `materiaprima` (
  `idmateriaprima` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  `distribuidora` varchar(45) NOT NULL,
  `unidad` varchar(45) NOT NULL,
  PRIMARY KEY (`idmateriaprima`),
  UNIQUE KEY `idmateriaprima_UNIQUE` (`idmateriaprima`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `materiaprima`
--

LOCK TABLES `materiaprima` WRITE;
/*!40000 ALTER TABLE `materiaprima` DISABLE KEYS */;
INSERT INTO `materiaprima` VALUES (1,'harina','coppel','costal'),(2,'manteca','yanovai','kilo');
/*!40000 ALTER TABLE `materiaprima` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `movimientomp`
--

DROP TABLE IF EXISTS `movimientomp`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `movimientomp` (
  `idmovimientomp` int NOT NULL AUTO_INCREMENT,
  `materiaprima` int NOT NULL,
  `tipo` varchar(20) NOT NULL,
  `fecha` date NOT NULL,
  PRIMARY KEY (`idmovimientomp`),
  UNIQUE KEY `iddetallemovimientomp_UNIQUE` (`idmovimientomp`),
  KEY `mat_idx` (`materiaprima`),
  CONSTRAINT `mat` FOREIGN KEY (`materiaprima`) REFERENCES `materiaprima` (`idmateriaprima`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `movimientomp`
--

LOCK TABLES `movimientomp` WRITE;
/*!40000 ALTER TABLE `movimientomp` DISABLE KEYS */;
INSERT INTO `movimientomp` VALUES (1,1,'Entrada','2021-04-15'),(2,2,'Entrada','2021-04-15'),(3,1,'Entrada','2021-04-15'),(4,1,'Salida','2021-04-15'),(5,2,'Salida','2021-04-15');
/*!40000 ALTER TABLE `movimientomp` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `movimientop`
--

DROP TABLE IF EXISTS `movimientop`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `movimientop` (
  `idmovimientop` int NOT NULL AUTO_INCREMENT,
  `producto` int NOT NULL,
  `tipo` varchar(45) NOT NULL,
  `fecha` date NOT NULL,
  PRIMARY KEY (`idmovimientop`),
  UNIQUE KEY `iddetallemovimientop_UNIQUE` (`idmovimientop`),
  KEY `prodcuto_idx` (`producto`),
  CONSTRAINT `prodcuto` FOREIGN KEY (`producto`) REFERENCES `producto` (`idproducto`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `movimientop`
--

LOCK TABLES `movimientop` WRITE;
/*!40000 ALTER TABLE `movimientop` DISABLE KEYS */;
INSERT INTO `movimientop` VALUES (1,1,'Entrada','2021-04-08');
/*!40000 ALTER TABLE `movimientop` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `producto`
--

DROP TABLE IF EXISTS `producto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `producto` (
  `idproducto` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  `tipo` varchar(45) NOT NULL,
  `unidad` varchar(45) NOT NULL,
  PRIMARY KEY (`idproducto`),
  UNIQUE KEY `idproducto_UNIQUE` (`idproducto`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `producto`
--

LOCK TABLES `producto` WRITE;
/*!40000 ALTER TABLE `producto` DISABLE KEYS */;
INSERT INTO `producto` VALUES (1,'Random','Tipo','Unidad');
/*!40000 ALTER TABLE `producto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sucursal`
--

DROP TABLE IF EXISTS `sucursal`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sucursal` (
  `idsucursal` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  PRIMARY KEY (`idsucursal`),
  UNIQUE KEY `idsucursal_UNIQUE` (`idsucursal`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sucursal`
--

LOCK TABLES `sucursal` WRITE;
/*!40000 ALTER TABLE `sucursal` DISABLE KEYS */;
INSERT INTO `sucursal` VALUES (1,'Tortilleria la 14');
/*!40000 ALTER TABLE `sucursal` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sucursale`
--

DROP TABLE IF EXISTS `sucursale`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sucursale` (
  `idsucursale` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  `direccion` varchar(45) NOT NULL,
  `telefono` varchar(45) NOT NULL,
  PRIMARY KEY (`idsucursale`),
  UNIQUE KEY `idsucursale_UNIQUE` (`idsucursale`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sucursale`
--

LOCK TABLES `sucursale` WRITE;
/*!40000 ALTER TABLE `sucursale` DISABLE KEYS */;
/*!40000 ALTER TABLE `sucursale` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-04-15 15:23:14
