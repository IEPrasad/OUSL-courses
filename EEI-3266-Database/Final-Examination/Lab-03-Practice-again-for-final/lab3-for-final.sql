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

CREATE TABLE Sales (
	sale_id VARCHAR(10) PRIMARY KEY,
	sale_date DATE,
	sale_amount INT,
	employee_id VARCHAR(10),
	car_id VARCHAR(10)
);

INSERT DATA Sales (sale_id, sale_date, sale_amount, employee_id, car_id) 
VALUES ("S1", "2021-04-02", 1300000, "E005", "C1"),
("S2", "2021-03-10", 2000000, "E005", "C2"),
("S3", "2023-07-19", 3200000, "E002", "C3");

CREATE TABLE Dependents (
	dependent_id VARCHAR(10) PRIMARY KEY,
	depen_name VARCHAR(40),
	depen_relation VARCHAR(40),
	depen_dob DATE,
	depen_gender VARCHAR(20),
	employee_id VARCHAR(10)
);

INSERT DATA Dependents (dependent_id, depen_name, depen_relation, depen_gender, employee_id) 
VALUES ("D1", "Mary", "Spouse", "1995-07-13", "Female", "E002"),
("D2", "Sarah", "Child", "2024-03-10", "Female", "E002"),
("D3", "Sophia", "Child", "2022-07-10", "Female", "E005"),
("D4", "David", "Spouse", "1991-10-01", "Male", "E007");
