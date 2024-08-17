Normalization is a process in database design that organizes data to reduce 
redundancy and improve data integrity. It involves dividing a database into tables 
and defining relationships between them. The main goal of normalization is to 
ensure that data is stored efficiently and consistently

Key Concepts in Normalization:

1) Redundancy: Repeating the same data in multiple places within a database. Normalization aims to 
  reduce this redundancy to avoid inconsistencies.

2) Anomalies: Problems that arise due to redundancy and unnormalized data, including:
    ** Rule: Meet all 1NF requirements and remove partial dependencies (where non-key attributes depend on 
       part of a composite key).

    ** Goal: Ensure that each non-key attribute is fully dependent on the primary key.

3) Third Normal Form (3NF):

    ** Rule: Meet all 2NF requirements and remove transitive dependencies (where non-key attributes depend 
       on other non-key attributes).
    ** Goal: Ensure that non-key attributes depend only on the primary key.

4) Boyce-Codd Normal Form (BCNF):
    ** Rule: A stronger version of 3NF where every determinant is a candidate key.
    ** Goal: Address anomalies that 3NF might not fully resolve.

5) Fourth Normal Form (4NF):
    ** Rule: Meet all BCNF requirements and remove multi-valued dependencies 
       (where one attribute determines multiple values of another).
    ** Goal: Further eliminate redundancy related to multi-valued facts.
  
6) Fifth Normal Form (5NF):
    ** Rule: Meet all 4NF requirements and remove join dependencies (where data can be split 
       into multiple tables and joined without loss of information).

    ** Goal: Decompose tables to the point where anomalies are eliminated.


  














