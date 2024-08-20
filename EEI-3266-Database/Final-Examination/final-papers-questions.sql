

    -- Create a new database and use it
    CREATE DATABASE CompanyDB;
    USE CompanyDB;

    -- Creating Salesman table with integrity constraints
    CREATE TABLE Salesman (
      Salesman_Id INT PRIMARY KEY,
      Salesman_Name VARCHAR(50) NOT NULL,
      Region VARCHAR(50) NOT NULL
    );

    -- Creating Customer table with a Foreign Key referencing Salesman table
    CREATE TABLE Customer (
      Customer_Id INT PRIMARY KEY,
      Customer_Name VARCHAR(50) NOT NULL,
      City VARCHAR(50) NOT NULL,
      Grade INT CHECK (Grade >= 0),
      Salesman_Id INT,
      Date_of_Birth DATE,
      FOREIGN KEY (Salesman_Id) REFERENCES Salesman(Salesman_Id)
    );

    -- Inserting data into Salesman table
    INSERT INTO Salesman (Salesman_Id, Salesman_Name, Region) VALUES
    (5001, 'John Doe', 'North'),
    (5002, 'Jane Smith', 'East');

    -- Inserting data into Customer table
    INSERT INTO Customer (Customer_Id, Customer_Name, City, Grade, Salesman_Id, Date_of_Birth) VALUES
    (1001, 'Roshan Bandara', 'Colombo', 200, 5001, '1985-03-15'),
    (1002, 'Amal Perera', 'Kurunegala', 150, 5002, '1990-07-25');

    -- Displaying Customer details sorted by Grade in Ascending Order (ASC)
    SELECT Customer_Name, Grade 
    FROM Customer 
    ORDER BY Grade ASC;

    -- Displaying Customer details sorted by Grade in Descending Order (DESC)
    SELECT Customer_Name, Grade 
    FROM Customer 
    ORDER BY Grade DESC;

    -- Display minimum grade obtained by any customer
    SELECT Customer_Id, Customer_Name, MIN(Grade) AS MinGrade
    FROM Customer;

    -- Display Customer name, city, and grade for customers who purchased from salesman with 
    --Salesman_Id '5002'
    SELECT Customer_Name, City, Grade 
    FROM Customer 
    WHERE Salesman_Id = 5002 
    ORDER BY Grade DESC;

    -- Delete customers from the city of 'Kurunegala'
    DELETE FROM Customer 
    WHERE City = 'Kurunegala';

    -- Update grade for customer 'Roshan Bandara' to 300
    UPDATE Customer 
    SET Grade = 300 
    WHERE Customer_Name = 'Roshan Bandara';

    -- Add a 'Contact_Number' column to the Salesman table
    ALTER TABLE Salesman 
    ADD Contact_Number VARCHAR(15);

    -- Add a 'Date of Birth' column to the Customer table
    ALTER TABLE Customer 
    ADD Date_of_Birth DATE;

    -- Select all customer details along with their associated Salesman details
    SELECT C.Customer_Name, C.City, C.Grade, S.Salesman_Name, S.Region
    FROM Customer C
    JOIN Salesman S ON C.Salesman_Id = S.Salesman_Id;

    -- Find the maximum grade for each customer
    SELECT Customer_Name, MAX(Grade) AS MaxGrade
    FROM Customer 
    GROUP BY Customer_Name;

    -- Sort customers by their grade in ascending order (included again for clarity)
    SELECT Customer_Name, Grade 
    FROM Customer 
    ORDER BY Grade ASC;

    -- Sort customers by their grade in descending order (included again for clarity)
    SELECT Customer_Name, Grade 
    FROM Customer 
    ORDER BY Grade DESC;

    -- Example of using LIKE with %
    -- Find customers whose names start with 'Roshan'
    SELECT Customer_Name, City, Grade 
    FROM Customer 
    WHERE Customer_Name LIKE 'Roshan%';

    -- Find customers whose names contain 'Bandara'
    SELECT Customer_Name, City, Grade 
    FROM Customer 
    WHERE Customer_Name LIKE '%Bandara%';

    -- Find customers whose names end with 'Perera'
    SELECT Customer_Name, City, Grade 
    FROM Customer 
    WHERE Customer_Name LIKE '%Perera';
