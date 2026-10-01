# Java & SQL Training Repository

A placement-training repository containing beginner-to-intermediate **Java programs** and **SQL exercises**, each documented with the full source and a line-by-line explanation. This README summarizes the repository so instructors can quickly assess its scope.

> **Note:** These are learning/training programs, not production-ready code. All outputs shown in the program documents are **expected outputs / examples** for the given inputs, not necessarily captured runtime logs.

---

## 1. Purpose

- Practice core Java fundamentals through small, self-contained programs, building from syntax basics to OOP, collections, and polymorphism.
- Practice SQL fundamentals: DDL, DML, CRUD operations, and conditional querying.
- Every program is paired with a **line-by-line explanation** so each file doubles as a study note.

---

## 2. Repository Organization

| Item | Description |
| --- | --- |
| [java programs.md](java%20programs.md) | Combines two collections: *Placement Training Programs* (12 programs) and *Other Java Programs* (24 programs), with full code, line-by-line explanations, expected outputs, and compile/run commands. |
| [SQL programs.md](SQL%20programs.md) | Four SQL exercises (table creation, insert, SELECT with conditions, full CRUD) with line-by-line explanations and expected outputs. |
| Program documents structure | Each entry contains: the filename/class name in the heading, the complete source code, a **Line-by-line explanation** section, the expected output, and (where relevant) notes on corrections or assumptions. |
| File conventions | Each Java program must be saved in its own file named after its public class (e.g., `GradeEvaluator.java`). Programs using public class `Main` must be compiled separately as `Main.java` and **cannot coexist** as multiple source files in the same compilation unit. |

---

## 3. Java Topics Practiced

Grouped logically based on the programs present:

- **Basics & Operators:** variables, compound assignment (`+=`), increment/decrement (`++`/`--`), ternary operator (simple and nested)
- **Control Flow:** `switch`/`case`/`default`, `if`/`else`, `break` and `continue`, loops (`for`, nested `for`)
- **Methods:** parameterized and non-parameterized methods, return types, `static` methods, recursion (with base condition)
- **Arrays:** 1D arrays (declaration, initialization, `.length`), 2D arrays/matrices, linear search, pair-sum search (TwoSum)
- **Strings:** creation with `new`, String pool vs. object comparison (`==` vs `.equals()`), `length()`, `toUpperCase()`, case-sensitive comparison, concatenation with strings and numbers
- **Input & Type Conversion:** `Scanner` (`nextInt`, `nextDouble`), arithmetic conversion (Celsius → Fahrenheit)
- **Pass-by-value & References:** primitive pass-by-value, primitive vs. array-reference behavior
- **OOP:** classes and objects, instance variables, `new` keyword, constructors (no-arg and parameterized), `this`, encapsulation (private fields, getters/setters)
- **Polymorphism:** compile-time (method overloading) and runtime (method overriding)
- **Abstraction & Inheritance:** interfaces and inheritance
- **Collections Framework:** `ArrayList` (vs. arrays), `Stack` via `LinkedList` (LIFO), `HashMap` (key–value pairs, key replacement), `LinkedList`
- **Formatted Output:** `System.out.printf` with format specifiers

---

## 4. Java Programs & Concepts Demonstrated

### A. Placement Training Programs ([java programs.md](java%20programs.md))

| # | File | Concept Demonstrated |
| --- | --- | --- |
| 1 | `GradeEvaluator.java` | `switch` statement with `case`, `break`, and `default` |
| 2 | `BreakContinue.java` | `break` and `continue` inside a `for` loop, logical OR (`\|\|`) |
| 3 | `ReturnTypeExample.java` | Methods with parameters and an `int` return value |
| 4 | `Methods.java` | Parameterized vs. non-parameterized `void` methods; math formula implementation |
| 5 | `Arrays.java` | Array declaration, initialization, `.length`, traversal, sum, and integer average |
| 6 | `Block.java` | Nested `for` loops (row/column printing) and counting iterations (5×5 = 25) |
| 7 | `ArrayMani.java` | Linear search using a boolean flag |
| 8 | `TwoDArray.java` | 2D array creation, nested-loop traversal, summing all elements |
| 9 | `ArrayExample.java` | 2D array default values, `.length` for rows, indexing with `matrix[1][2]` |
| 10 | `StringComparison.java` | `==` (reference comparison) vs. `.equals()` (content comparison) for `new String` objects |
| 11 | `StringPractice.java` | String methods: `length()`, `toUpperCase()`, case-sensitive `.equals()` |
| 12 | `ConcatDemo.java` | String concatenation with `+`, including automatic number-to-text conversion |

### B. Other Java Programs ([java programs.md](java%20programs.md))

| # | File | Concept Demonstrated |
| --- | --- | --- |
| 1 | `a+=5.java` | Compound assignment operator (`+=` equivalent to `a = a + 5`) |
| 2 | `age calculator.java` | `Scanner` input (`nextInt`), arithmetic age calculation, `sc.close()` |
| 3 | `celsius to fahrenheit.java` | `Scanner` decimal input (`nextDouble`), type conversion via formula `F = (C × 9/5) + 32` |
| 4 | `increment and decrement.java` | `++` and `--` operators |
| 5 | `largest number.java` | Nested ternary operator to find the largest of three numbers |
| 6 | `ternary operator.java` | Basic ternary operator returning a String |
| 7 | `APICostTracker.java` | Classes, objects, constructor with `this`, private fields, instance methods, loops, formatted `printf` output |
| 8 | `TwoSum.java` | Arrays, nested loops, pair-sum search |
| 9 | `StringCompare.java` | String objects, String pool, reference comparison |
| 10 | `RecursiveMethod.java` | Recursion and base condition |
| 11 | `PrimePrimitive.java` | Primitive pass-by-value behavior |
| 12 | `PrimNonPrimitive1.java` | Primitive vs. array-reference behavior when passed to methods |
| 13 | `ClassObjectDemo.java` | Classes, objects, instance variables, methods, `new` keyword |
| 14 | `ClassDemo2.java` | Parameterized constructors, static variables, static methods |
| 15 | `ClassDemo3.java` | No-argument and parameterized constructors, static variables/methods |
| 16 | `Encapsulation.java` | Getters/setters; direct vs. encapsulated field access |
| 17 | `PolymorphismDemo1.java` | Compile-time polymorphism (method overloading) |
| 18 | `PolyDemo2.java` | Compile-time polymorphism (method overloading) |
| 19 | `PolyDemo3.java` | Runtime polymorphism (method overriding) |
| 20 | `interfacedemo.java` | Interfaces and inheritance |
| 21 | `ArraylistDemo.java` | Arrays vs. `ArrayList` |
| 22 | `StackDemo.java` | Stack using `LinkedList`; LIFO behavior |
| 23 | `HashMapDemo.java` | `HashMap` key–value pairs and key replacement |
| 24 | `ArraylistDemo2.java` | `Array`, `ArrayList`, and `LinkedList` comparison |

### C. Compile & Run

The source documents include standard commands:

```bash
javac GradeEvaluator.java
java GradeEvaluator
```

- Programs with public class `Main` must be saved as `Main.java` and run one at a time.
- `celsius to fahrenheit.java` uses class `CelsiusToFahrenheit`; `APICostTracker.java` must be named after its public class `APICostTracker`.

---

## 5. SQL Topics Practiced

- **DDL:** `CREATE TABLE` with typed columns (`INT`, `VARCHAR(50)`), `PRIMARY KEY` constraint, `DROP TABLE`, `DROP TABLE IF EXISTS`
- **DML:** `INSERT INTO ... VALUES (...)`
- **Querying:** `SELECT *`, column/row retrieval
- **Filtering:** `WHERE` with `NOT`, `OR`, `AND` conditions, comparison operators (`=`)
- **CRUD:** full Create–Read–Update–Delete cycle, including `UPDATE ... SET ... WHERE` and `DELETE FROM ... WHERE`
- **Practical habits:** single quotes for string literals, `--` comments, self-contained re-runnable scripts

---

## 6. SQL Exercises & Concepts Demonstrated ([SQL programs.md](SQL%20programs.md))

| # | Exercise | Concept Demonstrated |
| --- | --- | --- |
| 1 | Create Employees Table | `CREATE TABLE` with `INT` and `VARCHAR(50)` columns; DDL returns no result set (status message only) |
| 2 | Create and Insert into EMP Table | `PRIMARY KEY` (unique, non-NULL); `INSERT INTO` with correct value ordering and single-quoted strings |
| 3 | SELECT Queries | Self-contained script (`DROP TABLE IF EXISTS`, create, insert); `SELECT *`; conditional filtering with `NOT`, `OR`, and `AND` on a `Customers` table, each with expected result tables |
| 4 | Comprehensive CRUD Operations | Full cycle: create, insert, `SELECT` with `WHERE` (returns 0 rows for non-matching conditions), `UPDATE ... SET ... WHERE`, `DELETE ... WHERE`, final `DROP TABLE`, with a commented-out `SELECT` after the drop to avoid an error |

Only `SELECT` statements return table outputs; other statements return status messages.

---

## 7. Learning Progression / Skills Demonstrated

1. **Syntax & operators** → variables, compound assignment, increment/decrement, ternary (simple → nested)
2. **Control flow** → conditionals, `switch`, loops, `break`/`continue`
3. **Methods & recursion** → parameters, return types, static methods, recursion with base conditions
4. **Data structures (arrays)** → 1D/2D arrays, traversal, searching (linear search, pair-sum)
5. **Strings** → creation, comparison semantics (`==` vs `.equals()`, String pool), common methods, concatenation
6. **User input & conversion** → `Scanner`, numeric type conversion
7. **OOP** → classes/objects → constructors → encapsulation → polymorphism (overloading/overriding) → interfaces/inheritance
8. **Collections** → `ArrayList`, `LinkedList`, `Stack`, `HashMap`
9. **SQL** → DDL → insert → conditional SELECT → full CRUD

---

## 8. Important Notes & Assumptions (from the source documents)

- **Age calculator:** calculates age by year only; it does **not** check whether the birthday has occurred in the current year. The current year is hardcoded (`2026`).
- **APICostTracker:** the public class is `APICostTracker`, so the source file must be named `APICostTracker.java` when compiled directly.
- **Main-class programs:** several "Other" programs use public class `Main` and must be compiled/run separately — they cannot be treated as multiple source files in one compilation unit.
- **SQL – SELECT Queries exercise:** the author added `DROP TABLE IF EXISTS` plus a self-contained `CREATE`/`INSERT` so the script runs independently, and **corrected double quotes to single quotes** for string literals (double quotes are invalid for strings in standard SQL/MySQL).
- **SQL – CRUD exercise corrections:** `//` comment fixed to `--`; table name `Bugs Bunny` fixed to `Jugs Bunny` to match the insert; missing `VARCHAR(50)` length added; final `SELECT` after `DROP TABLE` commented out to prevent a "table doesn't exist" error.
- **Outputs:** all shown outputs (Java and SQL) are expected/example outputs for the documented inputs, not captured execution logs.