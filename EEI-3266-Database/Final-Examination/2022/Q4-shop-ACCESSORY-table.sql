CREATE DATABASE Details;
USE Details;

CREATE TABLE SHOP (
  Shop_Id varchar(10) PRIMARY KEY,
  Shop_Name varchar(50),
  Area varchar(30)
);

INSERT DATA shops (Shop_Id, Shop_Name, Area) VALUES 
  ("S001", "ABC Computers", "CP"),
  ("S002", "All Infotech Media", "GK II"),
  ("S003", "Tech Shope", "CP"),
  ("S004", "Geek Techno Soft", "Ward Place"),
  ("S005", "Hitech Tech Store", "Ward Place");

CREATE TABLE ACCESSORY (
  AccNo varchar(50),
  Name varchar(50),
  Price INT,
  Shop_Id varchar(10)
);

INSERT DATA ACCESSORY (AccNo, Name, Price, Shop_Id) VALUES 
  ('A01', 'Mother Board', 12000, 'S001'),
  ('A02', 'Hard Disk', 5000, 'S001'),
  ('A03', 'Key Board',  500, 'S002'),
  ('A04', 'Mouse', 300, 'S001'),
  ('A05', 'Mother Board', 13000, 'S002');



