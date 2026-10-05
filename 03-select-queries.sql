DROP TABLE IF EXISTS emp;

CREATE TABLE emp (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    age INT,
    salary INT
);

INSERT INTO emp VALUES (1, 'Jugs Bunny', 79, 20000);

SELECT * FROM emp;

SELECT * FROM Customers
WHERE NOT (country = 'USA');

SELECT * FROM Customers
WHERE country = 'USA' OR country = 'UK';

SELECT * FROM Customers
WHERE country = 'USA' AND first_name = 'John';
