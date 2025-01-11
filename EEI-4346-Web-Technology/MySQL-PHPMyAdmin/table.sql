CREATE TABLE `final_practice` (
    `st_reg_no` INT NOT NULL,
    `st_name` VARCHAR(45) NOT NULL,
    `st_dob` DATE NOT NULL,
    `st_gender` CHAR(1) NOT NULL,
    `st_address` VARCHAR(60) NOT NULL,
    `st_tele` DECIMAL(10) NOT NULL,
    PRIMARY KEY (`st_reg_no`)
) ENGINE = InnoDB;
