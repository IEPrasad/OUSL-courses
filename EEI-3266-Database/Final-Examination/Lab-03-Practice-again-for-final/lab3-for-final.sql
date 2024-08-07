CREATE DATABASE CarSales;

USE CarSales;

CREATE TABLE CarVarieties(
	car_id VARCHAR(10) PRIMARY KEY,
	car_name VARCHAR(50),
	car_brand VARCHAR(50),
	car_year DATE,
	car_price INT,
	car_color VARCHAR(30)
);

INSERT DATA CarVarieties (car_id, car_name, car_brand, car_year, car_price, car_color)VALUES 
("C1", "Corolla", "Toyota", "Corolla 2021", "2021", 1300000, "Blue"),
("C1", "Civic", "Honda", "Civic 2021", "2021", 2000000, "Red"),
("C3", "Accord", "Honda", "Accord 2023", "2023", 3200000, "Black");


CREATE TABLE Employees (
	employee_id VARCHAR(10) PRIMARY KEY,
	emp_name VARCHAR(50),
	emp_position VARCHAR(50),
	emp_salary INT,
	emp_department VARCHAR(50),
	Emp_joined_date DATE
);

INSERT DATA Employees (employee_id, emp_name, emp_position, emp_salary, emp_department, Emp_joined_date)
VALUES ("E002", "Johnson", "Sales Manager", 60000, "Sales", "2021-05-18"),
("E005", "Jacqueline", "Sales Rep", 40000, "Sales", "2022-06-01"),
("E007", "Michael", "Mechanic", 50000, "Maintenance", "2022-04-01");

