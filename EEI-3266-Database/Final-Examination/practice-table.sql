CREATE DATABASE FINAL_EXAMINATION;
USE FINAL_EXAMINATION;

CREATE TABLE FINAL_EXAM_SUBJECT 
(
  course_code INT PRIMARY KEY,
  course_name VARCHAR(50),
  examination_date DATE,
  number_of_students INT
);

INSERT INTO FINAL_EXAM_SUBJECT (course_code, course_name, examination_date, number_of_students) VALUES
(3346, 'Web Application Development','2024-08-13', 400),
(3372, 'Programming with Python', '2024-08-15', 400),
(3366, 'Introduction to Business studies', '2024-08-18'),
(3266, 'Information systems', '2024-08-20', 400),
(3467, 'Software Engineering Concept and Programming', '2024-08-22', 400);

SHOW TABLES;
SELECT * FROM FINAL_EXAM_SUBJECT;


