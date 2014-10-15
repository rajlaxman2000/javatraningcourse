/*
SQLyog Trial v12.01 (64 bit)
MySQL - 5.6.20 : Database - test
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`test` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `test`;

/*Table structure for table `book` */

DROP TABLE IF EXISTS `book`;

CREATE TABLE `book` (
  `bookID` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(200) NOT NULL,
  `author` varchar(200) DEFAULT NULL,
  `publishedYear` year(4) DEFAULT NULL,
  `category` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`title`),
  KEY `bookID` (`bookID`)
) ENGINE=InnoDB AUTO_INCREMENT=103 DEFAULT CHARSET=latin1;

/*Data for the table `book` */

insert  into `book`(`bookID`,`title`,`author`,`publishedYear`,`category`) values (101,'Are you afraid of the dark','Shakespeare',1977,NULL),(102,'Bloodline','Shakespeare',2004,NULL);

/*Table structure for table `class` */

DROP TABLE IF EXISTS `class`;

CREATE TABLE `class` (
  `classNumber` int(11) NOT NULL,
  `section` int(11) NOT NULL,
  `classTeacher` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`classNumber`,`section`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `class` */

/*Table structure for table `employee` */

DROP TABLE IF EXISTS `employee`;

CREATE TABLE `employee` (
  `empID` int(11) NOT NULL AUTO_INCREMENT,
  `empName` varchar(200) NOT NULL,
  `position` varchar(200) DEFAULT NULL,
  `salary` double DEFAULT NULL,
  PRIMARY KEY (`empID`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

/*Data for the table `employee` */

insert  into `employee`(`empID`,`empName`,`position`,`salary`) values (1,'Ram','Librarian',8.5),(2,'Jim','Library Assistant',8.5),(3,'Ashley','receptionist',7.25),(4,'Ashley','receptionist',7.25),(5,'Ashley','receptionist',7.25),(6,'Rahul','librarian',10);

/*Table structure for table `parent` */

DROP TABLE IF EXISTS `parent`;

CREATE TABLE `parent` (
  `parentID` int(10) NOT NULL AUTO_INCREMENT,
  `parentName` varchar(50) NOT NULL,
  `designation` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`parentName`,`parentID`),
  KEY `parentID` (`parentID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `parent` */

/*Table structure for table `schoolbranch` */

DROP TABLE IF EXISTS `schoolbranch`;

CREATE TABLE `schoolbranch` (
  `branchLocationCode` int(50) NOT NULL,
  `branchPhone` decimal(10,0) DEFAULT NULL,
  PRIMARY KEY (`branchLocationCode`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `schoolbranch` */

/*Table structure for table `student` */

DROP TABLE IF EXISTS `student`;

CREATE TABLE `student` (
  `studentID` int(11) NOT NULL,
  `studentName` varchar(50) DEFAULT NULL,
  `branchLoc` int(11) DEFAULT NULL,
  PRIMARY KEY (`studentID`),
  KEY `branchLocation` (`branchLoc`),
  CONSTRAINT `branchLocation` FOREIGN KEY (`branchLoc`) REFERENCES `schoolbranch` (`branchLocationCode`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `student` */

/*Table structure for table `subject` */

DROP TABLE IF EXISTS `subject`;

CREATE TABLE `subject` (
  `subjectID` int(11) NOT NULL AUTO_INCREMENT,
  `subjectName` varchar(50) NOT NULL,
  `subjectTeacher` varchar(50) DEFAULT NULL,
  `classNumber` int(11) DEFAULT NULL,
  `sectionNumber` int(11) DEFAULT NULL,
  `timings` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `schoolBranch` int(11) DEFAULT NULL,
  PRIMARY KEY (`subjectID`,`subjectName`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `subject` */

/*Table structure for table `teacher` */

DROP TABLE IF EXISTS `teacher`;

CREATE TABLE `teacher` (
  `teacherName` varchar(50) NOT NULL,
  `subject` varchar(50) DEFAULT NULL,
  `schoolBranch` varchar(50) DEFAULT NULL,
  `salary` double DEFAULT NULL,
  PRIMARY KEY (`teacherName`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `teacher` */

/* Procedure structure for procedure `studentBook` */

/*!50003 DROP PROCEDURE IF EXISTS  `studentBook` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `studentBook`()
begin
select student.`name`,student.`bookName`,book.`author`
from student,book
where `student`.`bookName`=book.`title`;
End */$$
DELIMITER ;

/* Procedure structure for procedure `studentBookExample` */

/*!50003 DROP PROCEDURE IF EXISTS  `studentBookExample` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `studentBookExample`()
BEGIN
SELECT student.`name`,student.`bookName`,book.`author`
FROM student,book
WHERE `student`.`bookName`=book.`title`;
    END */$$
DELIMITER ;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
