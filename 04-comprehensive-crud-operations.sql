CREATE TABLE emp (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    age INT,
    salary INT
);

INSERT INTO emp VALUES (1, 'Jugs Bunny', 79, 20000);
-- insert with 10 other data (commented out)
SELECT * FROM emp;
SELECT * FROM emp WHERE name = 'Tweety';
SELECT * FROM emp WHERE salary > 30000;

UPDATE emp
SET salary = 25000
WHERE name = 'Jugs Bunny';

DELETE FROM emp WHERE id = 5;
DELETE FROM emp
WHERE name = 'Speedy Gonzales';
SELECT * FROM emp;
DROP TABLE emp;
-- SELECT * FROM emp; (commented out because the table is dropped)
