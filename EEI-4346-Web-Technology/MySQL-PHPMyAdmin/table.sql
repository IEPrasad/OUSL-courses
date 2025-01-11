CREATE TABLE `final_practice` (
    `st_reg_no` INT NOT NULL,
    `st_name` VARCHAR(45) NOT NULL,
    `st_dob` DATE NOT NULL,
    `st_gender` CHAR(1) NOT NULL,
    `st_address` VARCHAR(60) NOT NULL,
    `st_tele` DECIMAL(10) NOT NULL,
    PRIMARY KEY (`st_reg_no`)
) ENGINE = InnoDB;


CREATE TABLE course (
    c_code VARCHAR(7) PRIMARY KEY,
    c_title VARCHAR(40),
    c_credit INT(1),
    c_level INT(1)
);


CREATE TABLE marks (
    st_reg_no INT(4),
    c_code VARCHAR(45),
    reg_year DATE,
    marks INT(3),
    PRIMARY KEY (st_reg_no, c_code),
    FOREIGN KEY (st_reg_no) REFERENCES students(st_reg_no),
    FOREIGN KEY (c_code) REFERENCES course(c_code)
);


