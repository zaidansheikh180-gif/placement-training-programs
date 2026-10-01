# SQL Programs Collection

A comprehensive collection of SQL scripts demonstrating table creation, data manipulation, and querying, complete with line-by-line explanations and expected outputs.

## Table of Contents
1. [Create Employees Table](#1-create-employees-table)
2. [Create and Insert into EMP Table](#2-create-and-insert-into-emp-table)
3. [SELECT Queries](#3-select-queries)
4. [Comprehensive CRUD Operations](#4-comprehensive-crud-operations)

---

## 1. Create Employees Table

### 📄 Code
```sql
CREATE TABLE employees (
    eid INT,
    name VARCHAR(50),
    age INT,
    salary INT
);
```

### 📖 Line-by-Line Explanation
*   `CREATE TABLE employees`: Defines a new table in the database named `employees`.
*   `eid INT`: Creates a column named `eid` to store integer values.
*   `name VARCHAR(50)`: Creates a column named `name` to store variable-length strings, with a maximum length of 50 characters.
*   `age INT`: Creates a column named `age` to store integer values.
*   `salary INT`: Creates a column named `salary` to store integer values.
*   `);`: Closes the table definition and terminates the statement.

### 💻 Expected Output
> **Note:** DDL (Data Definition Language) statements like `CREATE TABLE` do not return rows of data.
```text
SQL query successfully executed. However, the result set is empty.
```

---

## 2. Create and Insert into EMP Table

### 📄 Code
```sql
CREATE TABLE emp (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    age INT,
    salary INT
);

INSERT INTO emp VALUES (1, 'Jugs Bunny', 79, 20000);
```

### 📖 Line-by-Line Explanation
*   `CREATE TABLE emp`: Creates a new table named `emp`.
*   `id INT PRIMARY KEY`: Creates an integer column `id` and sets it as the Primary Key, meaning each value must be unique and cannot be NULL.
*   `name VARCHAR(50)`: Creates a string column `name` with a maximum length of 50 characters.
*   `age INT`: Creates an integer column `age`.
*   `salary INT`: Creates an integer column `salary`.
*   `INSERT INTO emp VALUES (...)`: Inserts a new row into the `emp` table.
*   `(1, 'Jugs Bunny', 79, 20000)`: The values for the columns in the order: `id=1`, `name='Jugs Bunny'`, `age=79`, `salary=20000`. Note the use of single quotes for string values.

### 💻 Expected Output
```text
Table 'emp' created successfully.
1 row inserted.
```

---

## 3. SELECT Queries

### 📄 Code
> **Note:** I added `DROP TABLE IF EXISTS` and a `CREATE/INSERT` for `emp` so the script is self-contained and works. I also fixed the double quotes to single quotes for string literals, as double quotes are invalid in standard SQL/MySQL for strings.

```sql
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
```

### 📖 Line-by-Line Explanation
*   `DROP TABLE IF EXISTS emp;`: Deletes the `emp` table if it already exists to avoid errors when re-running the script.
*   `CREATE TABLE emp (...)`: Creates the `emp` table with `id`, `name`, `age`, and `salary` columns.
*   `INSERT INTO emp VALUES (1, 'Jugs Bunny', 79, 20000);`: Populates the `emp` table with one row of data.
*   `SELECT * FROM emp;`: Retrieves all columns and rows from the `emp` table.
*   `SELECT * FROM Customers WHERE NOT (country = 'USA');`: Selects all columns from the `Customers` table where the country is **not** 'USA'.
*   `SELECT * FROM Customers WHERE country = 'USA' OR country = 'UK';`: Selects all columns where the country is either 'USA' or 'UK'.
*   `SELECT * FROM Customers WHERE country = 'USA' AND first_name = 'John';`: Selects all columns where the country is 'USA' **and** the first name is 'John'.

### 💻 Expected Output

**Output from: `SELECT * FROM emp;`**
| id | name | age | salary |
| :--- | :--- | :--- | :--- |
| 1 | Jugs Bunny | 79 | 20000 |

**Output from: `SELECT * FROM Customers WHERE NOT (country = 'USA');`**
| customer_id | first_name | last_name | age | country |
| :--- | :--- | :--- | :--- | :--- |
| 3 | David | Robinson | 22 | UK |
| 4 | John | Reinhardt | 25 | UK |
| 5 | Betty | Doe | 28 | UAE |

**Output from: `SELECT * FROM Customers WHERE country = 'USA' OR country = 'UK';`**
| customer_id | first_name | last_name | age | country |
| :--- | :--- | :--- | :--- | :--- |
| 1 | John | Doe | 31 | USA |
| 2 | Robert | Luna | 22 | USA |
| 3 | David | Robinson | 22 | UK |
| 4 | John | Reinhardt | 25 | UK |

**Output from: `SELECT * FROM Customers WHERE country = 'USA' AND first_name = 'John';`**
| customer_id | first_name | last_name | age | country |
| :--- | :--- | :--- | :--- | :--- |
| 1 | John | Doe | 31 | USA |

---

## 4. Comprehensive CRUD Operations

### 📄 Code
> **Note:** I fixed the `//` comment to `--`, fixed the table name `Bugs Bunny` to `Jugs Bunny` to match the insert, added the missing `VARCHAR(50)` length, and commented out the final `SELECT` after the `DROP` to prevent a "Table doesn't exist" error.

```sql
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
```

### 📖 Line-by-Line Explanation
*   `CREATE TABLE emp (...)`: Creates the `emp` table with a primary key `id` and other columns.
*   `INSERT INTO emp VALUES (1, 'Jugs Bunny', 79, 20000);`: Inserts the initial record.
*   `-- insert with 10 other data`: A comment explaining that more data could be inserted here.
*   `SELECT * FROM emp;`: Displays all current records in the table.
*   `SELECT * FROM emp WHERE name = 'Tweety';`: Attempts to find a record with the name 'Tweety'. Since no such record exists, it returns nothing.
*   `SELECT * FROM emp WHERE salary > 30000;`: Attempts to find records with a salary greater than 30000. Since the only record has a salary of 20000, it returns nothing.
*   `UPDATE emp SET salary = 25000 WHERE name = 'Jugs Bunny';`: Modifies the salary of 'Jugs Bunny' to 25000.
*   `DELETE FROM emp WHERE id = 5;`: Attempts to delete a record with `id = 5`. Since no such record exists, 0 rows are affected.
*   `DELETE FROM emp WHERE name = 'Speedy Gonzales';`: Attempts to delete a record with the name 'Speedy Gonzales'. Since no such record exists, 0 rows are affected.
*   `SELECT * FROM emp;`: Displays the current state of the table (showing the updated salary for 'Jugs Bunny').
*   `DROP TABLE emp;`: Completely removes the `emp` table from the database.
*   `-- SELECT * FROM emp;`: This final line is commented out because attempting to select from a dropped table would cause an error.

### 💻 Expected Output

> **Note:** Only `SELECT` statements return table outputs. Other statements return status messages.

**Output from: `SELECT * FROM emp;` (Initial state)**
| id | name | age | salary |
| :--- | :--- | :--- | :--- |
| 1 | Jugs Bunny | 79 | 20000 |

**Output from: `SELECT * FROM emp WHERE name = 'Tweety';`**
```text
(0 rows returned)
```

**Output from: `SELECT * FROM emp WHERE salary > 30000;`**
```text
(0 rows returned)
```

**Output from: `SELECT * FROM emp;` (After UPDATE)**
| id | name | age | salary |
| :--- | :--- | :--- | :--- |
| 1 | Jugs Bunny | 79 | 25000 |

**Final status after `DROP TABLE emp;`**
```text
Table 'emp' dropped successfully.
```
