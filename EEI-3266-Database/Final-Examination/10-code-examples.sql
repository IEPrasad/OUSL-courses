-- 1. Create the Departments table
CREATE TABLE Departments (
    department_id INT PRIMARY KEY,
    department_name VARCHAR(50)
);

-- 2. Create the Employees table
CREATE TABLE Employees (
    employee_id INT PRIMARY KEY,
    emp_name VARCHAR(50),
    emp_position VARCHAR(50),
    salary INT,
    department_id INT,
    FOREIGN KEY (department_id) REFERENCES Departments(department_id)
);

-- 3. Insert data into Departments
INSERT INTO Departments (department_id, department_name)
VALUES (1, 'HR'), (2, 'IT'), (3, 'Finance');

-- 4. Insert data into Employees
INSERT INTO Employees (employee_id, emp_name, emp_position, salary, department_id)
VALUES (101, 'John Doe', 'Developer', 60000, 2),
       (102, 'Jane Smith', 'Manager', 75000, 1),
       (103, 'Emily Davis', 'Analyst', 55000, 3);

-- 5. Select all data from Employees
SELECT * FROM Employees;

-- 6. Select employees with salary greater than 50000
SELECT * FROM Employees
WHERE salary > 50000;

-- 7. Update the salary of an employee
UPDATE Employees
SET salary = 65000
WHERE employee_id = 101;

-- 8. Delete an employee
DELETE FROM Employees
WHERE employee_id = 101;

-- 9. Add a new column to Employees
ALTER TABLE Employees
ADD COLUMN email VARCHAR(100);

-- 10. Join Employees and Departments tables
SELECT Employees.emp_name, Departments.department_name
FROM Employees
JOIN Departments ON Employees.department_id = Departments.department_id;

-- 11. Group employees by department
SELECT department_id, COUNT(*) AS num_employees
FROM Employees
GROUP BY department_id;


