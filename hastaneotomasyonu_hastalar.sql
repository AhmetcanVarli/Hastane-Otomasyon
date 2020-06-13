-- MySQL dump 10.13  Distrib 8.0.20, for Win64 (x86_64)
--
-- Host: localhost    Database: hastaneotomasyonu
-- ------------------------------------------------------
-- Server version	8.0.20

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
-- Table structure for table `hastalar`
--

DROP TABLE IF EXISTS `hastalar`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hastalar` (
  `tc_no` varchar(11) NOT NULL,
  `ad` varchar(45) NOT NULL,
  `soyad` varchar(45) DEFAULT NULL,
  `cinsiyet` varchar(45) DEFAULT NULL,
  `telefon` varchar(11) DEFAULT NULL,
  `sifre` varchar(45) DEFAULT NULL,
  `sifre_tekrar` varchar(45) DEFAULT NULL,
  `guvenlik_sorusu` varchar(45) DEFAULT NULL,
  `guvenlik_cevap` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`tc_no`),
  UNIQUE KEY `tc_no_UNIQUE` (`tc_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hastalar`
--

LOCK TABLES `hastalar` WRITE;
/*!40000 ALTER TABLE `hastalar` DISABLE KEYS */;
INSERT INTO `hastalar` VALUES ('11111111111','Ahmetcan','Varlı','ERKEK','55555468798','1234','1234','Ya da rastgale cümle giriniz(önerilir).','JAVA'),('55555555555','Niilgün','Varlı','KADIN ','46513268465','123456','640235','İlkokul öğretmeninizin adı nedir?','Sadık'),('78945612345','Dorukan','Eskiçeri','ERKEK','98789789879','drk99','drk99','İlkokul öğretmeninizin adı nedir?','Mehmet');
/*!40000 ALTER TABLE `hastalar` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-06-14  2:21:47
