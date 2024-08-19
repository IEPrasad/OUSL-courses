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


Here are the answers to the SQL questions:

### i. Create the two tables including referential integrity constraints to link the two tables.
```sql
CREATE DATABASE Details;
USE Details;

CREATE TABLE SHOP (
  Shop_Id varchar(10) PRIMARY KEY,
  Shop_Name varchar(50),
  Area varchar(30)
);

CREATE TABLE ACCESSORY (
  AccNo varchar(50),
  Name varchar(50),
  Price INT,
  Shop_Id varchar(10),
  FOREIGN KEY (Shop_Id) REFERENCES SHOP(Shop_Id)
);
```

### ii. Insert TWO (2) rows to each of the two tables created using the given values.
```sql
-- Insert into SHOP
INSERT INTO SHOP (Shop_Id, Shop_Name, Area) VALUES 
  ('S001', 'ABC Computers', 'CP'),
  ('S002', 'All Infotech Media', 'GK II');

-- Insert into ACCESSORY
INSERT INTO ACCESSORY (AccNo, Name, Price, Shop_Id) VALUES 
  ('A01', 'Mother Board', 12000, 'S001'),
  ('A02', 'Hard Disk', 5000, 'S002');
```

### iii. To display Name and price of all the accessories in descending order of their price.
```sql
SELECT Name, Price 
FROM ACCESSORY 
ORDER BY Price DESC;
```

### iv. To display Shop_Id and Shop_Name of all Shops located in Ward Place.
```sql
SELECT Shop_Id, Shop_Name 
FROM SHOP 
WHERE Area = 'Ward Place';
```

### v. To display Maximum price pertaining to each of the given names of accessories.
```sql
SELECT Name, MAX(Price) AS Max_Price 
FROM ACCESSORY 
GROUP BY Name;
```

### vi. To delete all the accessories with price less than 500/-.
```sql
DELETE FROM ACCESSORY 
WHERE Price < 500;
```

### vii. To modify the Area of ‘ABC Computers’ to ‘WP’.
```sql
UPDATE SHOP 
SET Area = 'WP' 
WHERE Shop_Name = 'ABC Computers';
```

### viii. To modify the ‘Shop’ table to include the ‘Contact Number’ of each shop.
```sql
ALTER TABLE SHOP 
ADD Contact_Number varchar(15);
```
