CREATE DATABASE  IF NOT EXISTS `e419` /*!40100 DEFAULT CHARACTER SET utf8 */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `e419`;
-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: 14.29.54.53    Database: e419
-- ------------------------------------------------------
-- Server version	8.0.19

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
-- Table structure for table `basic`
--

DROP TABLE IF EXISTS `basic`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `basic` (
  `id` int NOT NULL AUTO_INCREMENT,
  `language` varchar(45) NOT NULL DEFAULT 'English',
  `adapter` int NOT NULL DEFAULT '-1',
  `Performance` float NOT NULL DEFAULT '1',
  `Resolution_W` int NOT NULL DEFAULT '800',
  `Resolution_H` int NOT NULL DEFAULT '600',
  `Resolution_Bpp` int NOT NULL DEFAULT '2',
  `MinBandwidth` int NOT NULL DEFAULT '131072',
  `MaxBandwidth` bigint NOT NULL DEFAULT '10000000000',
  `MaxMsgSend` int NOT NULL DEFAULT '128',
  `MaxSizeGuaranteed` int NOT NULL DEFAULT '512',
  `MaxSizeNonguaranteed` int NOT NULL DEFAULT '256',
  `MinErrorToSend` float NOT NULL DEFAULT '0.001',
  `MinErrorToSendNear` float NOT NULL DEFAULT '0.01',
  `MaxCustomFileSize` int NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `basic`
--

LOCK TABLES `basic` WRITE;
/*!40000 ALTER TABLE `basic` DISABLE KEYS */;
INSERT INTO `basic` VALUES (1,'English',-1,1,0,0,0,131072,10000000000,128,512,256,0.001,0.01,0);
/*!40000 ALTER TABLE `basic` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cfg`
--

DROP TABLE IF EXISTS `cfg`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cfg` (
  `id` int NOT NULL AUTO_INCREMENT,
  `hostName` varchar(45) NOT NULL DEFAULT 'My Arma 3 Server',
  `password` varchar(45) DEFAULT NULL,
  `passwordAdmin` varchar(45) DEFAULT 'AdminPassword',
  `maxPlayers` int NOT NULL DEFAULT '40',
  `persistent` int NOT NULL DEFAULT '1',
  `disableVoN` int NOT NULL DEFAULT '0',
  `vonCodecQuality` int NOT NULL DEFAULT '10',
  `voteMissionPlayers` int NOT NULL DEFAULT '1',
  `voteThreshold` float NOT NULL DEFAULT '0.33',
  `motdInterval` int NOT NULL DEFAULT '5',
  `template` varchar(45) NOT NULL DEFAULT 'MyMission.Altis',
  `difficulty` varchar(45) NOT NULL DEFAULT 'Regular',
  `timeStampFormat` varchar(45) NOT NULL DEFAULT 'short',
  `logFile` varchar(45) NOT NULL DEFAULT 'server_console.log',
  `BattlEye` int NOT NULL DEFAULT '0',
  `verifySignatures` int NOT NULL DEFAULT '0',
  `kickDuplicate` int NOT NULL DEFAULT '1',
  `allowedFilePatching` int NOT NULL DEFAULT '0',
  `headlessClients1` varchar(45) DEFAULT '127.0.0.1',
  `headlessClients2` varchar(45) DEFAULT '127.0.0.1',
  `headlessClients3` varchar(45) DEFAULT '127.0.0.1',
  `localClient` varchar(45) DEFAULT '127.0.0.1',
  `motd` varchar(45) DEFAULT 'Welcome',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cfg`
--

LOCK TABLES `cfg` WRITE;
/*!40000 ALTER TABLE `cfg` DISABLE KEYS */;
INSERT INTO `cfg` VALUES (1,'Test','','',40,1,0,10,1,0.33,5,'MyMission.Altis','Regular','short','server_console.log',0,0,1,0,'','','','','');
/*!40000 ALTER TABLE `cfg` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `difficulty`
--

DROP TABLE IF EXISTS `difficulty`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `difficulty` (
  `id` int NOT NULL AUTO_INCREMENT,
  `reducedDamage` int NOT NULL DEFAULT '0',
  `groupIndicators` int NOT NULL DEFAULT '0',
  `friendlyTags` int NOT NULL DEFAULT '0',
  `enemyTags` int NOT NULL DEFAULT '0',
  `detectedMines` int NOT NULL DEFAULT '0',
  `commands` int NOT NULL DEFAULT '1',
  `waypoints` int NOT NULL DEFAULT '1',
  `tacticalPing` int NOT NULL DEFAULT '0',
  `weaponInfo` int NOT NULL DEFAULT '2',
  `stanceIndicator` int NOT NULL DEFAULT '2',
  `staminaBar` int NOT NULL DEFAULT '0',
  `weaponCrosshair` int NOT NULL DEFAULT '0',
  `visionAid` int NOT NULL DEFAULT '0',
  `thirdPersonView` int NOT NULL DEFAULT '0',
  `cameraShake` int NOT NULL DEFAULT '1',
  `scoreTable` int NOT NULL DEFAULT '1',
  `deathMessages` int NOT NULL DEFAULT '1',
  `vonID` int NOT NULL DEFAULT '1',
  `mapContent` int NOT NULL DEFAULT '0',
  `autoReport` int NOT NULL DEFAULT '0',
  `multipleSaves` int NOT NULL DEFAULT '0',
  `aiLevelPreset` int NOT NULL DEFAULT '3',
  `skillAI` float NOT NULL DEFAULT '0.5',
  `precisionAI` float NOT NULL DEFAULT '0.5',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `difficulty`
--

LOCK TABLES `difficulty` WRITE;
/*!40000 ALTER TABLE `difficulty` DISABLE KEYS */;
INSERT INTO `difficulty` VALUES (1,0,0,0,0,0,1,1,0,2,2,0,0,0,0,1,1,1,1,0,0,0,3,0.5,0.6);
/*!40000 ALTER TABLE `difficulty` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `params`
--

DROP TABLE IF EXISTS `params`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `params` (
  `id` int NOT NULL AUTO_INCREMENT,
  `port` int NOT NULL DEFAULT '2302',
  `config` varchar(100) DEFAULT NULL,
  `cfg` varchar(100) DEFAULT NULL,
  `profiles` varchar(100) DEFAULT NULL,
  `name` varchar(20) DEFAULT 'A3Server',
  `filePatching` int NOT NULL DEFAULT '0',
  `autoInit` int NOT NULL DEFAULT '0',
  `netlog` int NOT NULL DEFAULT '0',
  `ranking` varchar(20) DEFAULT 'ranking.log',
  `pid` varchar(20) DEFAULT 'pid.log',
  `mods` varchar(3000) DEFAULT NULL,
  `servermod` varchar(3000) DEFAULT NULL,
  `exe` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `params`
--

LOCK TABLES `params` WRITE;
/*!40000 ALTER TABLE `params` DISABLE KEYS */;
INSERT INTO `params` VALUES (1,2302,'E:\\A3Server.cfg','E:\\basic.cfg','','A3Server',0,0,0,'ranking.log','pid.log',NULL,NULL,NULL);
/*!40000 ALTER TABLE `params` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `players`
--

DROP TABLE IF EXISTS `players`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `players` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `steamID` varchar(50) NOT NULL,
  `name` tinytext NOT NULL,
  `lastJoined` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `model` varchar(50) NOT NULL,
  `loadout` text NOT NULL,
  `overallDamage` varchar(20) NOT NULL,
  `selectionsDamages` tinytext NOT NULL,
  `lastPosition` varchar(50) NOT NULL,
  `direction` varchar(10) NOT NULL,
  `stance` varchar(15) NOT NULL,
  `isIncapacitated` varchar(10) NOT NULL,
  `money` int NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=17 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `sequity`
--

DROP TABLE IF EXISTS `sequity`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sequity` (
  `id` int NOT NULL AUTO_INCREMENT,
  `securityCode` varchar(45) NOT NULL DEFAULT '000000000',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sequity`
--

LOCK TABLES `sequity` WRITE;
/*!40000 ALTER TABLE `sequity` DISABLE KEYS */;
INSERT INTO `sequity` VALUES (1,'000000000');
/*!40000 ALTER TABLE `sequity` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `steamID` varchar(45) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'S034','123321','76561198342036539');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-03-25 17:10:32
