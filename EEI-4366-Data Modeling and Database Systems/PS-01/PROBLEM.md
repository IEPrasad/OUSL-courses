# Lab-01 Practice Sheet  
**Course**: EEI4366 / EEX4366 – Data Modelling and Database Systems  
**Program**: Bachelor of Software Engineering Honours / Bachelor of Technology  
**Department**: Electrical and Computer Engineering  
**University**: The Open University of Sri Lanka  
**Academic Year**: 2022/2023  

---

## 🧪 Task 01 – MySQL Workbench Practice

Use **MySQL Workbench** to perform the following operations on the database `eei_2023_studentdetails`.

### 📋 Tables & Descriptions

| Table Name         | Description                              |
|--------------------|------------------------------------------|
| `subject`          | Subjects offered by ABC Institute        |
| `student`          | Students' primary data                   |
| `student_subject`  | Students' registered subjects            |
| `classschedule`    | Class schedule for subjects              |
| `classattendence`  | Class attendance of students             |

### 🗂 Table Fields

- `subject(s_code, s_title)`
- `student(s_reg, s_fname, s_sname, tel_no, address)`
- `student_subject(s_reg, s_code, year_reg)`
- `classschedule(s_code, classhall, classdate, c_day, c_time)`
- `classattendence(s_reg, classdate, s_code, classhall, attendance)`

### 🔤 Abbreviations

- `s_code` – Subject Code  
- `s_title` – Subject Title  
- `s_reg` – Student Registration Number  
- `s_fname` – Student First Name  
- `s_sname` – Student Surname  
- `tel_no` – Student Telephone Number  
- `address` – Student Postal Address  
- `year_reg` – Year first registered for a subject  

---

## 🧾 SQL Queries

1. View all subjects:
```sql
SELECT * FROM subject;
```

2. First 5 students by descending surname:
```sql
SELECT * FROM student ORDER BY s_sname DESC LIMIT 5;
```

3. Students in Colombo:
```sql
SELECT s_reg, address FROM student WHERE address LIKE '%Colombo%';
```

4. Students registered in 2010:
```sql
SELECT s.s_reg, s.s_fname, s.s_sname, ss.s_code, ss.year_reg 
FROM student s, student_subject ss 
WHERE s.s_reg = ss.s_reg AND ss.year_reg = '2010';
```

5. Rename columns:
```sql
SELECT s_fname AS First_Name, s_sname AS Surname FROM student;
```

6. Students registered for EED001:
```sql
SELECT s.s_reg, s.tel_no, ss.s_code 
FROM student s 
INNER JOIN student_subject ss ON s.s_reg = ss.s_reg 
WHERE s_code = 'EED001';
```

7. Oldest registration year:
```sql
SELECT MIN(year_reg) AS Oldest_Reg_Year FROM student_subject;
```

8. Subjects with weekend classes:
```sql
SELECT DISTINCT c.s_code, s.s_title 
FROM subject s 
RIGHT JOIN classschedule c ON s.s_code = c.s_code 
WHERE c_day = 'Saturday' OR c_day = 'Sunday';
```

9. Sunday classes in hall '01':
```sql
SELECT c.s_code, s.s_title, c.c_day, c.classhall 
FROM subject s 
INNER JOIN classschedule c ON s.s_code = c.s_code 
WHERE c_day = 'Sunday' AND classhall = '01';
```

10. Subjects not on Sunday:
```sql
SELECT s_code, classdate, c_day 
FROM classschedule 
WHERE c_day <> 'Sunday';
```

11. Length of first name:
```sql
SELECT s_reg, s_fname, LENGTH(s_fname) FROM student;
```

12. Student count per subject:
```sql
SELECT s_code, COUNT(s_reg) 
FROM student_subject 
GROUP BY s_code;
```

13. Attendance count for EED001 by hall:
```sql
SELECT classhall, COUNT(s_reg) AS Student_count 
FROM classattendance 
WHERE s_code = 'EED001' 
GROUP BY classhall;
```

14. Students who attended at least one class:
```sql
SELECT s.s_reg, s_fname, s_sname 
FROM student s, classattendance c 
WHERE s.s_reg = c.s_reg AND attendance = 'Yes';
```

15. Students registered for more than one subject:
```sql
SELECT s_reg, COUNT(s_reg) AS Count_Reg_Subjects 
FROM student_subject 
GROUP BY s_reg 
HAVING COUNT(s_reg) > 1;
```

---

## 📚 Additional Resources

- Learn more about SQL Joins:  
  [W3Schools SQL JOIN Tutorial](https://www.w3schools.com/sql/sql_join.asp)

---

> 💡 Feel free to modify or extend these queries to explore more insights from the database.
