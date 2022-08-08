-- MySQL dump 10.13  Distrib 8.0.30, for Win64 (x86_64)
--
-- Host: localhost    Database: demo
-- ------------------------------------------------------
-- Server version	8.0.30

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
-- Table structure for table `lienhe`
--

DROP TABLE IF EXISTS `lienhe`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `lienhe` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `Name` varchar(45) DEFAULT NULL,
  `Email` varchar(45) DEFAULT NULL,
  `Subject` varchar(45) DEFAULT NULL,
  `Message` text,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lienhe`
--

LOCK TABLES `lienhe` WRITE;
/*!40000 ALTER TABLE `lienhe` DISABLE KEYS */;
INSERT INTO `lienhe` VALUES (1,'Vũ Đức Hải','hai13032001@gmail.com','abcd','abcdefadsaa');
/*!40000 ALTER TABLE `lienhe` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `taikhoan`
--

DROP TABLE IF EXISTS `taikhoan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `taikhoan` (
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `taikhoan`
--

LOCK TABLES `taikhoan` WRITE;
/*!40000 ALTER TABLE `taikhoan` DISABLE KEYS */;
INSERT INTO `taikhoan` VALUES ('admin','admin');
/*!40000 ALTER TABLE `taikhoan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tintuc`
--

DROP TABLE IF EXISTS `tintuc`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tintuc` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `caption` varchar(45) DEFAULT NULL,
  `image` varchar(45) DEFAULT NULL,
  `category` varchar(45) DEFAULT NULL,
  `trending` varchar(45) DEFAULT NULL,
  `date` date DEFAULT NULL,
  `detailssss` varchar(10000) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tintuc`
--

LOCK TABLES `tintuc` WRITE;
/*!40000 ALTER TABLE `tintuc` DISABLE KEYS */;
INSERT INTO `tintuc` VALUES (1,' Welcome To The Best Model Winner Contest ','assets/img/trending/trending_top.jpg','Đời Sống','false','2022-08-08','ace'),(2,'Welcome To The Best Model Winner Contest','assets/img/trending/trending_top.jpg','Đời Sống','true','2022-03-02',NULL),(3,' Welcome To The Best Model Winner Contest ','assets/img/trending/trending_top.jpg','Đời Sống','false','2022-08-08','a'),(4,'Welcome To The Best Model Winner Contest','assets/img/trending/trending_top.jpg','Thể Thao','false','2021-08-02',NULL),(5,'Welcome To The Best Model Winner Contest','assets/img/trending/trending_top.jpg','Công Nghệ','true','2021-08-02',NULL),(6,'Welcome To The Best Model Winner Contest','assets/img/trending/right1.jpg','Công Nghệ','true','2021-08-02',NULL),(7,'Welcome To The Best Model Winner Contest','assets/img/trending/right2.jpg','Công Nghệ','true','2021-08-02',NULL),(8,'Welcome To The Best Model Winner Contest','assets/img/trending/right3.jpg','Thời Trang','true','2021-08-02',NULL),(9,'Welcome To The Best Model Winner Contest','assets/img/trending/right4.jpg','Thời Trang','true','2021-08-02',NULL),(10,'Welcome To The Best Model Winner Contest','assets/img/trending/right5.jpg','Thể Thao','true','2021-08-02',NULL),(11,'Welcome To The Best Model Winner Contest','assets/img/news/weeklyNews1.jpg','Thể Thao','false','2022-08-03',NULL),(12,'Welcome To The Best Model Winner Contest','assets/img/news/weeklyNews1.jpg','Thể Thao','false','2022-08-03',NULL),(13,'Welcome To The Best Model Winner Contest','assets/img/news/weeklyNews2.jpg','Công Nghệ','false','2022-08-03',NULL),(14,'Welcome To The Best Model Winner Contest','assets/img/news/weeklyNews2.jpg','Công Nghệ','false','2022-08-03',NULL),(15,'Welcome To The Best Model Winner Contest','assets/img/news/weeklyNews2.jpg','Thể Thao','false','2022-08-03',NULL),(16,'Welcome To The Best Model Winner Contest','assets/img/news/weeklyNews2.jpg','Thể Thao','false','2022-08-03',NULL),(17,'Welcome To The Best Model Winner Contest','assets/img/news/weeklyNews2.jpg','Công Nghệ','false','2022-08-03',NULL),(18,'Welcome To The Best Model Winner Contest','assets/img/news/weeklyNews2.jpg','Công Nghệ','false','2022-08-03',NULL),(19,'Welcome To The Best Model Winner Contest','assets/img/news/weeklyNews2.jpg','Đời Sống','false','2022-08-03',NULL),(20,'Welcome To The Best Model Winner Contest','assets/img/news/weeklyNews2.jpg','Thể Thao','false','2022-08-03',NULL);
/*!40000 ALTER TABLE `tintuc` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-08-08 11:34:09
