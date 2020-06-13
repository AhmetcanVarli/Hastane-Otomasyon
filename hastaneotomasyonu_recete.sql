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
-- Table structure for table `recete`
--

DROP TABLE IF EXISTS `recete`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `recete` (
  `HastaTc` varchar(45) DEFAULT NULL,
  `HastaAdı` varchar(45) DEFAULT NULL,
  `HastaSoyad` varchar(45) DEFAULT NULL,
  `DoktorAdı` varchar(45) NOT NULL,
  `Recete` varchar(250) DEFAULT NULL,
  `ReceteTarihi` varchar(45) DEFAULT NULL,
  `ReceteSaati` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `recete`
--

LOCK TABLES `recete` WRITE;
/*!40000 ALTER TABLE `recete` DISABLE KEYS */;
INSERT INTO `recete` VALUES ('11111111111',NULL,NULL,'Mehmet','Dikkat et Gardaş','Çarşamba','09:30'),('55555555555',NULL,NULL,'Emine Çetin','dikkatli ol sinir yapma iki kutu ilaç yazdım al onları','Cuma','14:30'),('22222222222',NULL,NULL,'Fatma Arslan','aaaaaaaaaa\r\nbbbbbbbbbbbbbbbbbbbbbbbbbb\r\ncccccccccccccccccccccccccccc\r\nddddddddddddddddddddddddd\r\neeeeeeeeeeeeeeeeeeeeeeeeeeeeee\r\nff\r\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa','Salı','16.00'),('55555555555','Niilgün','Varlı','Fatma Arslan','sa gardas','Perşembe','09:00'),('11111111111','Ahmetcan','Varlı','Fatma Arslan','asdsasdasdadsa\r\ndasdas\r\nd\r\nasd\r\nasd\r\nsad\r\nasd\r\nadas','Çarşamba','09:30'),('11111111111','Ahmetcan','Varlı','Fatma Arslan','sa beyler cs go\r\n','Çarşamba','09:00');
/*!40000 ALTER TABLE `recete` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-06-14  2:21:48
