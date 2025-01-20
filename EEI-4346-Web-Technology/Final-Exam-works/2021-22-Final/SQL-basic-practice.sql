-- SQL Basics Practice 

1. ALTER TABLE

  ** Used to modify the structure of a table (columns, constraints, etc.).

** Add a column:
  ALTER TABLE table_name
  ADD column_name data_type;

** Drop a column:
  ALTER TABLE table_name
  DROP COLUMN column_name;

** Modify a column:
  ALTER TABLE table_name
  RENAME COLUMN old_name TO new_name;

** Add a constraint:
  ALTER TABLE table_name
  ADD CONSTRAINT constraint_name constraint_definition;

** Drop a constraint:
  ALTER TABLE table_name
  DROP CONSTRAINT constraint_name;

______________________________________________________


2. INSERT INTO 

  ** Add new records to a table.

** Single row:
  INSERT INTO table_name (column1, column2)
  VALUES (value1, value2);

** Multiple rows:
  INSERT INTO table_name (column1, column2)
  VALUES 
  (value1, value2),
  (value3, value4);


______________________________________________________

3. UPDATE 

  ** Modify existing records.

** Syntax:
  UPDATE table_name
  SET column1 = value1, column2 = value2
  WHERE condition;

______________________________________________________


4. DELETE
  ** Remove records from a table.

** Specific rows:
  DELETE FROM table_name
  WHERE condition;

** All rows (careful);
  DELETE FROM table_name;


______________________________________________________


5. SELECT

  ** Retrieve data.

** All columns: 
  SELECT * FROM table_name;


** Specific columns:
  SELECT column1, column2 FROM table_name;


** With condition:
  SELECT * FROM table_name
  WHERE condition;

______________________________________________________


What ALTER TABLE Can Do: 

  ** Add, drop, or modify columns.
  ** Rename table or columns.
  ** Add or remove constraints.
  ** Change data types or properties.
  ** Enable/disable constraints like FOREIGN KEY or UNIQUE.

                        ------