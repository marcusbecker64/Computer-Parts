CREATE DATABASE IF NOT EXISTS Computer_Parts;
USE Computer_Parts;

-- -----------------------------------------------------
-- Table `USER_INFO`
-- -----------------------------------------------------

CREATE TABLE IF NOT EXISTS USER_INFO (
    U_NUMBER INT,
    U_LNAME VARCHAR(15),
    U_FNAME VARCHAR(15),
    U_PHONE VARCHAR(12),
    U_EMAIL VARCHAR(30),
    U_USERNAME VARCHAR(15),
    U_PASSWORD VARCHAR(20)
);
INSERT INTO USER_INFO VALUES('10000','Marcus','Becker','630-373-2105','mbecker09@aurora.edu','mbecker','password!');

-- -----------------------------------------------------
-- Table `HDD`
-- -----------------------------------------------------

CREATE TABLE IF NOT EXISTS HDD (
    HDD_NUMBER INT,
    HDD_NAME VARCHAR(30),
    HDD_PRICE FLOAT,
    HDD_COMPANY VARCHAR(20)
);
INSERT INTO HDD VALUES('0001','Mainstream 1TB','49.99','WD');
INSERT INTO HDD VALUES('0002','Barracuda 2TB','49.99','Seagate');
INSERT INTO HDD VALUES('0003','N300 8TB','220.99','Toshiba');
INSERT INTO HDD VALUES('0004','970 EVO 500GB','54.99','Samsung');

-- -----------------------------------------------------
-- Table `SSD`
-- -----------------------------------------------------

CREATE TABLE IF NOT EXISTS SSD (
    SSD_NUMBER INT,
    SSD_NAME VARCHAR(30),
    SSD_PRICE FLOAT,
    SSD_COMPANY VARCHAR(20)
);
INSERT INTO SSD VALUES('1001','EVO 500GB','74.99','Samsung');
INSERT INTO SSD VALUES('1002','Blue 500GB','64.99','WD');
INSERT INTO SSD VALUES('1003','SATA SSD 240GB','29.99','PNY');
INSERT INTO SSD VALUES('1004','Ultra 1.024 TB','114.99','SanDisk');

-- -----------------------------------------------------
-- Table `CPU`
-- -----------------------------------------------------

CREATE TABLE IF NOT EXISTS CPU (
    CPU_NUMBER INT,
    CPU_NAME VARCHAR(30),
    CPU_PRICE FLOAT,
    CPU_COMPANY VARCHAR(20)
);
INSERT INTO CPU VALUES('2001','Core i9-9900K','484.99','Intel');
INSERT INTO CPU VALUES('2002','Ryzen 7 3700X','329.99','AMD');
INSERT INTO CPU VALUES('2003','Ryzen 5 3600','199.99','AMD');
INSERT INTO CPU VALUES('2004','Core i5-9600K','233.99','Intel');

-- -----------------------------------------------------
-- Table `FANS`
-- -----------------------------------------------------

CREATE TABLE IF NOT EXISTS FANS (
    FAN_NUMBER INT,
    FAN_NAME VARCHAR(30),
    FAN_PRICE FLOAT,
    FAN_COMPANY VARCHAR(20)
);
INSERT INTO FANS VALUES('3001','Hydro Series h100i','134.99','Corsair');
INSERT INTO FANS VALUES('3002','Hyper 212 RGB','41.99','Cooler Master');
INSERT INTO FANS VALUES('3003','Riing 12','11.99','Thermaltake');
INSERT INTO FANS VALUES('3004','AEOLUS M1-1205R','79.99','GAMDIAS');

-- -----------------------------------------------------
-- Table `POWER`
-- -----------------------------------------------------

CREATE TABLE IF NOT EXISTS POWER (
    POW_NUMBER INT,
    POW_NAME VARCHAR(30),
    POW_PRICE FLOAT,
    POW_COMPANY VARCHAR(20)
);
INSERT INTO POWER VALUES('4001','RM Series 750W ATX12V','119.99','Corsair');
INSERT INTO POWER VALUES('4002','600W ATX 12V/EPS 12V','39.99','EVGA');
INSERT INTO POWER VALUES('4003','SMART 700W ATX 80','59.99','Thermaltake');
INSERT INTO POWER VALUES('4004','SF Series 450W ATX12V ','105.99','Corsair');