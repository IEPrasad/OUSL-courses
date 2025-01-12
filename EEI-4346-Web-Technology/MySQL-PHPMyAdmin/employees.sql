-- Create Database
CREATE DATABASE employees_db;

-- Use the Database
USE employees_db;

-- Create Table
CREATE TABLE employees (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    department VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL
);

-- Insert Sample Data
INSERT INTO employees (name, department, email) VALUES
('John Doe', 'HR', 'john.doe@example.com'),
('Jane Smith', 'IT', 'jane.smith@example.com'),
('Mike Johnson', 'Finance', 'mike.johnson@example.com'),
('Emily Davis', 'Marketing', 'emily.davis@example.com');
