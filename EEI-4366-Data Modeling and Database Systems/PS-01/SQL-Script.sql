-- Database: `eei_2019_studentdetails`

Create database eei_2023_studentdetails;

Use eei_2023_studentdetails;

CREATE TABLE subject(
  s_code varchar(30) NOT NULL,
  s_title varchar(30) NOT NULL
);

INSERT INTO subject (s_code, s_title) VALUES
('EED001', 'Mathematics'),
('EED002', 'Science'),
('EED003', 'History'),
('EED004', 'Sinhala'),
('EED005', 'English'),
('EED006', 'Commerce');

CREATE TABLE student(
  s_reg varchar(30) NOT NULL,
  s_fname varchar(30) NOT NULL,
  s_sname varchar(30) NOT NULL,
  tel_no varchar(30) NOT NULL,
  address varchar(30) NOT NULL
);

INSERT INTO student(s_reg, s_fname, s_sname, tel_no, address) VALUES
('00000', 'Ross', 'Geller', '0777585656', '67,Feeth Road, Colombo 7'),
('11111', 'James', 'Daniel', '0777-897564', '17, Jaya Mawatha,Colombo 10'),
('22222', 'Peter ', 'Thomas', '0777-543412', '56, Han Mawatha, Colombo 12'),
('33333', 'Dupont', 'Kate', '07778989361', '13, kalutara, colombo 10'),
('44444', 'Alex', 'Young', '0777856985', '85, ban Mawatha, Colombo  2'),
('55555', 'George', 'Bill', '0112694739', '12,Pan, Panadura'),
('66666', 'Roger', 'Thames', '0116352545', '23, Kan, Colombo 05'),
('77777', 'Emiliy', 'Watson', '112565898', '34,Dambulla Road Matala.'),
('88888', 'Elizabeth', 'Troy', '011256547', '45,Sanra Road, Colombo 3'),
('99999', 'Racheal', 'Buffet', '112565455', '34, KA Mel Road, Colombo 04');

CREATE TABLE student_subject(
  s_reg varchar(30) NOT NULL,
  s_code varchar(30) NOT NULL,
  year_reg varchar(30) NOT NULL
);

INSERT INTO student_subject(s_reg, s_code, year_reg) VALUES
('11111', 'EED001', '2011'),
('11111', 'EED006', '2012'),
('22222', 'EED001', '2010'),
('33333', 'EED003', '2009'),
('44444', 'EED004', '2011'),
('55555', 'EED005', '2010'),
('55555', 'EED006', '2010'),
('66666', 'EED004', '2010');

CREATE TABLE classschedule(
  s_code varchar(30) NOT NULL,
  classhall varchar(30) NOT NULL,
  classdate date NOT NULL,
  c_day varchar(30) NOT NULL,
  c_time time NOT NULL
);

INSERT INTO classschedule(s_code, classhall, classdate, c_day, c_time) VALUES
('EED002', '01', '2013-01-14', 'Monday', '09:30:00'),
('EED002', '01', '2013-01-23', 'Wednesday', '11:30:00'),
('EED003', '01', '2010-07-10', 'Saturday', '12:00:00'),
('EED003', '02', '2013-01-20', 'Sunday', '11:00:00'),
('EED006', '01', '2011-01-16', 'Sunday', '09:00:00'),
('EED006', '02', '2011-01-15', 'Saturday', '09:45:00'),
('EED006', '02', '2013-01-14', 'Monday', '06:00:00'),
('EED006', '02', '2013-01-15', 'Tuesday', '10:00:00');

CREATE TABLE classattendance(
  s_reg varchar(30) NOT NULL,
  classdate date NOT NULL DEFAULT '0000-00-00',
  s_code varchar(30) NOT NULL,
  classhall varchar(30) NOT NULL,
  attendance varchar(30) NOT NULL
);

INSERT INTO classattendance(s_reg, classdate, s_code, classhall, attendance) VALUES
('77777', '2011-01-15', 'EED001', '01', 'YES'),
('88888', '2011-01-15', 'EED001', '01', 'NO'),
('88888', '2011-01-16', 'EED001', '01', 'YES'),
('11111', '2010-07-10', 'EED001', '02', 'YES'),
('55555', '2011-01-16', 'EED003', '01', 'YES'),
('66666', '2013-01-23', 'EED003', '02', 'YES'),
('22222', '2010-07-10', 'EED004', '01', 'NO'),
('33333', '2010-07-10', 'EED005', '01', 'YES'),
('00000', '2011-01-15', 'EED006', '02', 'YES'),
('44444', '2013-01-20', 'EED006', '02', 'YES');

-- Adding Primary Key Constraints

ALTER TABLE subject
  ADD PRIMARY KEY (s_code);
  
ALTER TABLE student
  ADD PRIMARY KEY (s_reg);
  
ALTER TABLE student_subject
  ADD PRIMARY KEY (s_reg,s_code),
  ADD KEY student_subject_ssubject_fk (s_code);
  
ALTER TABLE classschedule
  ADD PRIMARY KEY (s_code,classhall,classdate),
  ADD KEY classdate (classdate),
  ADD KEY classhall (classhall);

ALTER TABLE classattendance
  ADD PRIMARY KEY (s_code,classhall,classdate,s_reg),
  ADD KEY classattendance_sreg_fk (s_reg),
  ADD KEY classattendance_classdate (classdate),
  ADD KEY classhall (classhall);

-- Adding Feoreign Key Constraints

ALTER TABLE student_subject
  ADD CONSTRAINT student_subject_sreg_fk FOREIGN KEY (s_reg) REFERENCES student (s_reg),
  ADD CONSTRAINT student_subject_ssubject_fk FOREIGN KEY (s_code) REFERENCES subject (s_code);
  
ALTER TABLE classschedule
  ADD CONSTRAINT classschedule_s_code_k FOREIGN KEY (s_code) REFERENCES subject (s_code);
  
ALTER TABLE classattendance
  ADD CONSTRAINT classattendance_classdate FOREIGN KEY (classdate) REFERENCES classschedule (classdate),
  ADD CONSTRAINT classattendance_ibfk_1 FOREIGN KEY (classhall) REFERENCES classschedule (classhall),
  ADD CONSTRAINT classattendance_scode_fk FOREIGN KEY (s_code) REFERENCES subject (s_code),
  ADD CONSTRAINT classattendance_sreg_fk FOREIGN KEY (s_reg) REFERENCES student (s_reg);


