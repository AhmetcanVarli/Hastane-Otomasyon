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
-- Table structure for table `randevular`
--

DROP TABLE IF EXISTS `randevular`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `randevular` (
  `hasta_tc_no` varchar(45) NOT NULL,
  `hasta_ad` varchar(45) DEFAULT NULL,
  `hasta_soyad` varchar(45) DEFAULT NULL,
  `klinik` varchar(45) DEFAULT NULL,
  `doktor_ad_soyad` varchar(45) DEFAULT NULL,
  `tarih` varchar(45) DEFAULT NULL,
  `saat` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `randevular`
--

LOCK TABLES `randevular` WRITE;
/*!40000 ALTER TABLE `randevular` DISABLE KEYS */;
INSERT INTO `randevular` VALUES ('11111111111','Ahmetcan','Varlı','Diş Hekimliği','Fatma Arslan','Pazartesi','08:00'),('11111111111','Ahmetcan','Varlı','Diş Hekimliği','Fatma Arslan','Pazartesi','08:00'),('11111111111','Ahmetcan','Varlı','Kalp Damar Cerrahisi','Emine Çetin','Çarşamba','09:00'),('11111111111','Ahmetcan','Varlı','İç Hastalıkları(Dahiliye)','Mehmet Yılmaz','Çarşamba','09:00'),('11111111111','Ahmetcan','Varlı','Göz Hastalıkları','Emine Çetin','Cuma','16:30'),('11111111111','Ahmetcan','Varlı','Nörolaji','Fatma Arslan','Çarşamba','10:30'),('11111111111','Ahmetcan','Varlı','Diş Hekimliği','Mehmet Yılmaz','Pazartesi','08:00'),('11111111111','Ahmetcan','Varlı','Diş Hekimliği','Fatma Arslan','Pazartesi','08:00'),('11111111111','Ahmetcan','Varlı','Diş Hekimliği','Fatma Arslan','Pazartesi','08:00'),('11111111111','Ahmetcan','Varlı','Diş Hekimliği','Emine Çetin','Çarşamba','09:30'),('78945612345','Dorukan','Eskiçeri','İç Hastalıkları(Dahiliye)','Emine Çetin','Perşembe','08:30'),('78945612345','Dorukan','Eskiçeri','İç Hastalıkları(Dahiliye)','Emine Çetin','Perşembe','08:30'),('78945612345','Dorukan','Eskiçeri','İç Hastalıkları(Dahiliye)','Fatma Arslan','Perşembe','09:30'),('11111111111','Ahmetcan','Varlı','Göz Hastalıkları','Emine Çetin','Salı','08:30'),('11111111111','Ahmetcan','Varlı','Göz Hastalıkları','Mehmet Yılmaz','Çarşamba','11:00'),('11111111111','Ahmetcan','Varlı','İç Hastalıkları(Dahiliye)','Mehmet Yılmaz','Cuma','10:30'),('11111111111','Ahmetcan','Varlı','Göz Hastalıkları','Mehmet Yılmaz','Çarşamba','10:00'),('78945612345','Dorukan','Eskiçeri','Nörolaji','Fatma Arslan','Çarşamba','09:00'),('78945612345','Dorukan','Eskiçeri','Göz Hastalıkları','Mehmet Yılmaz','Salı','09:30'),('78945612345','Dorukan','Eskiçeri','İç Hastalıkları(Dahiliye)','Fatma Arslan','Perşembe','09:00'),('11111111111','Ahmetcan','Varlı','Diş Hekimliği','Mehmet Yılmaz','Perşembe','09:30'),('11111111111','Ahmetcan','Varlı','Göz Hastalıkları','Mehmet Yılmaz','Salı','09:00'),('11111111111','Ahmetcan','Varlı','Kalp Damar Cerrahisi','Emine Çetin','Çarşamba','08:30'),('78945612345','Dorukan','Eskiçeri','Nörolaji','Mehmet Yılmaz','Cuma','17:00'),('78945612345','Dorukan','Eskiçeri','İç Hastalıkları(Dahiliye)','Emine Çetin','Çarşamba','09:00'),('78945612345','Dorukan','Eskiçeri','Göz Hastalıkları','Emine Çetin','Çarşamba','15:00'),('55555555555','Niilgün','Varlı','Kalp Damar Cerrahisi','Mehmet Yılmaz','Perşembe','15:00'),('11111111111','Ahmetcan','Varlı','İç Hastalıkları(Dahiliye)','Mehmet Yılmaz','Pazartesi','08:00');
/*!40000 ALTER TABLE `randevular` ENABLE KEYS */;
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
