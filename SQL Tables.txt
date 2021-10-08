CREATE DATABASE BloodBankMS
USE BloodBankMS

CREATE TABLE DONOR
( 
  DonorName varchar(100) NOT NULL,
  DonorID int identity(1,1) not null primary key,
  DonorGender varchar(10) NOT NULL,
  DonorBloodGroup varchar(5) NOT NULL,
  DonorAddress varchar(2000) NOT NULL,
  DonorArea varchar(100) NOT NULL,
  DonorPhoneNumber int NOT NULL,
  DonorWeight int NOT NULL CHECK(DonorWeight>109),
  DonorAge int NOT NULL CHECK(DonorAge>17)
)

CREATE TABLE BloodInventory
 ( 
    DonorID int foreign key references donor(DonorID),
    BagNumber int identity(4000,1)not null primary key,
    QuantityAvailable varchar(100) NOT NULL,
    RedBloodCells varchar(100) NOT NULL,
    WhiteBloodCells varchar(100) NOT NULL,
    Platelets varchar(100) NOT NULL,
    Plasma varchar(100) NOT NULL,
    Heamoglobin int NOT NULL
 )

 CREATE TABLE DonationDetails
 (     
    DonationNumber int identity(20000,1) not null primary key,
	BagNumber int foreign key references BloodInventory(BagNumber),
    Hospital varchar(1000) NOT NULL,
    CollectionDate date NOT NULL,
    GivingDate date NOT NULL,
    GivenAmount int NOT NULL
 )

 CREATE TABLE Recipient
 ( 
    RecipientID int identity(2000,1) not null primary key,
    RecipientName varchar(100) NOT NULL,
    RecipientAge int NOT NULL,
    RecipientGender varchar(10) NOT NULL,
    RecipientBloodGroup varchar(10) NOT NULL,
    RecipientAddress varchar(2000) NOT NULL,
    RecipientArea varchar(500) NOT NULL,
    RecipientPhoneNumber int NOT NULL UNIQUE,
    DonationNumber int foreign key references DonationDetails(DonationNumber)
 )

 CREATE TABLE LogIn
 (
	UserName varchar(100) NOT NULL,
	Password varchar(100) NOT NULL
 )
 INSERT INTO LogIn(UserName, Password)
 VALUES('hrida', '4567')

SELECT * FROM DONOR
SELECT * FROM BloodInventory
SELECT * FROM DonationDetails
SELECT * FROM Recipient