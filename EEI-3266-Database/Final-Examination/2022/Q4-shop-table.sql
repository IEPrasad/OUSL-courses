CREATE DATABASE Details;
USE Details;
CREATE TABLE shops (
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


  
