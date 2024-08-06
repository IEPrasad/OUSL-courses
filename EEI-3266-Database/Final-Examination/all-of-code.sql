-- 1. Create a new database
CREATE DATABASE SchoolDB;

-- 2. Use the new database
USE SchoolDB;

-- 3. Create the Departments table
CREATE TABLE Departments (
    department_id INT PRIMARY KEY,
    department_name VARCHAR(50)
);

-- 4. Create the Employees table
CREATE TABLE Employees (
    employee_id INT PRIMARY KEY,
    emp_name VARCHAR(50),
    emp_position VARCHAR(50),
    salary INT,
    department_id INT,
    FOREIGN KEY (department_id) REFERENCES Departments(department_id)
);

-- 5. Insert data into Departments
INSERT INTO Departments (department_id, department_name)
VALUES (1, 'HR'), (2, 'IT'), (3, 'Finance');

-- 6. Insert data into Employees
INSERT INTO Employees (employee_id, emp_name, emp_position, salary, department_id)
VALUES (101, 'John Doe', 'Developer', 60000, 2),
       (102, 'Jane Smith', 'Manager', 75000, 1),
       (103, 'Emily Davis', 'Analyst', 55000, 3),
       (104, 'Michael Brown', 'Developer', 62000, 2),
       (105, 'Laura Wilson', 'Manager', 70000, 3);

-- 7. Create an index on emp_name
CREATE INDEX idx_emp_name ON Employees(emp_name);

-- 8. Select unique department IDs
SELECT DISTINCT department_id
FROM Employees;

-- 9. Select all employees ordered by salary in descending order
SELECT * FROM Employees
ORDER BY salary DESC;

-- 10. Select the first 5 employees
SELECT * FROM Employees
LIMIT 5;

-- 11. Count the number of employees in the IT department
SELECT COUNT(*) AS num_employees
FROM Employees
WHERE department_id = 2;

-- 12. Calculate the total salary of all employees
SELECT SUM(salary) AS total_salary
FROM Employees;

-- 13. Calculate the average salary of employees
SELECT AVG(salary) AS average_salary
FROM Employees;

-- 14. Drop the index on emp_name
DROP INDEX idx_emp_name ON Employees;

-- 15. View the structure of the Employees table
DESCRIBE Employees;

-- 16. Select all data from Employees
SELECT * FROM Employees;

-- 17. Select employees with salary greater than 50000
SELECT * FROM Employees
WHERE salary > 50000;

-- 18. Update the salary of an employee
UPDATE Employees
SET salary = 65000
WHERE employee_id = 101;

-- 19. Delete an employee
DELETE FROM Employees
WHERE employee_id = 101;

-- 20. Add a new column to Employees
ALTER TABLE Employees
ADD COLUMN email VARCHAR(100);

-- 21. Join Employees and Departments tables
SELECT Employees.emp_name, Departments.department_name
FROM Employees
JOIN Departments ON Employees.department_id = Departments.department_id;

-- 22. Group employees by department
SELECT department_id, COUNT(*) AS num_employees
FROM Employees
GROUP BY department_id;

-- 23. Use LIKE to find names containing 'a'
SELECT * FROM Employees
WHERE emp_name LIKE '%a%';

-- 24. Use LIKE to find names starting with 'J'
SELECT * FROM Employees
WHERE emp_name LIKE 'J%';

-- 25. Use LIKE to find names ending with 'n'
SELECT * FROM Employees
WHERE emp_name LIKE '%n';

-- 26. Use LIKE to find names containing 'ar'
SELECT * FROM Employees
WHERE emp_name LIKE '%ar%';

-- 27. Use LIKE to find names with 'a' as the second character
SELECT * FROM Employees
WHERE emp_name LIKE '_a%';
