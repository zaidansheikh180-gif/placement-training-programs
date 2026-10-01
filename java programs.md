# Java Programs Collection

> This file combines the placement-training and other Java program collections.

## Table of Contents

### Placement Training Programs
- [1. GradeEvaluator.java](#1.-gradeevaluator.java)
- [2. BreakContinue.java](#2.-breakcontinue.java)
- [3. ReturnTypeExample.java](#3.-returntypeexample.java)
- [4. Methods.java](#4.-methods.java)
- [5. Arrays.java](#5.-arrays.java)
- [6. Block.java](#6.-block.java)
- [7. ArrayMani.java](#7.-arraymani.java)
- [8. TwoDArray.java](#8.-twodarray.java)
- [9. ArrayExample.java](#9.-arrayexample.java)
- [10. StringComparison.java](#10.-stringcomparison.java)
- [11. StringPractice.java](#11.-stringpractice.java)
- [12. ConcatDemo.java](#12.-concatdemo.java)

### Other Java Programs
- [1. a+=5.java](#1.-a5.java)
- [2. age calculator.java](#2.-age-calculator.java)
- [3. celsius to fahrenheit.java](#3.-celsius-to-fahrenheit.java)
- [4. increment and decrement.java](#4.-increment-and-decrement.java)
- [5. largest number.java](#5.-largest-number.java)
- [6. ternary operator.java](#6.-ternary-operator.java)
- [7. APICostTracker.java](#7.-apicosttracker.java)
- [8. TwoSum.java](#8.-twosum.java)
- [9. StringCompare.java](#9.-stringcompare.java)
- [10. RecursiveMethod.java](#10.-recursivemethod.java)
- [11. PrimePrimitive.java](#11.-primeprimitive.java)
- [12. PrimNonPrimitive1.java](#12.-primnonprimitive1.java)
- [13. ClassObjectDemo.java](#13.-classobjectdemo.java)
- [14. ClassDemo2.java](#14.-classdemo2.java)
- [15. ClassDemo3.java](#15.-classdemo3.java)
- [16. Encapsulation.java](#16.-encapsulation.java)
- [17. PolymorphismDemo1.java](#17.-polymorphismdemo1.java)
- [18. PolyDemo2.java](#18.-polydemo2.java)
- [19. PolyDemo3.java](#19.-polydemo3.java)
- [20. interfacedemo.java](#20.-interfacedemo.java)
- [21. ArraylistDemo.java](#21.-arraylistdemo.java)
- [22. StackDemo.java](#22.-stackdemo.java)
- [23. HashMapDemo.java](#23.-hashmapdemo.java)
- [24. ArraylistDemo2.java](#24.-arraylistdemo2.java)

## Placement Training Programs

> **How to use:** Save this content as `placement training java programs.md`.  
> Each Java program must be saved separately using the filename shown in its heading, for example `GradeEvaluator.java`.

### 1. GradeEvaluator.java

```java
public class GradeEvaluator {
    public static void main(String[] args) {
        int marks = 7;

        switch (marks) {
            case 10:
                System.out.println("Your grade is A+");
                break;
            case 9:
                System.out.println("Your grade is A");
                break;
            case 8:
                System.out.println("Your grade is B");
                break;
            case 7:
                System.out.println("Your grade is C");
                break;
            case 6:
                System.out.println("Your grade is D");
                break;
            case 5:
                System.out.println("Your grade is E");
                break;
            default:
                System.out.println("You failed, Grade F");
        }
    }
}
```

### Line-by-line explanation

- `public class GradeEvaluator {` creates a public class named `GradeEvaluator`. The filename must be `GradeEvaluator.java`.
- `public static void main(String[] args) {` is the entry point where Java starts running the program.
- `int marks = 7;` creates an integer variable named `marks` and stores `7`.
- `switch (marks) {` checks the value of `marks` against different `case` values.
- `case 10:` runs when marks are exactly `10`.
- `System.out.println("Your grade is A+");` prints the grade message.
- `break;` exits the `switch` statement after a matching case runs.
- `case 9:` checks whether marks are `9`.
- `case 8:` checks whether marks are `8`.
- `case 7:` checks whether marks are `7`; this is the matching case for the current value.
- `case 6:` checks whether marks are `6`.
- `case 5:` checks whether marks are `5`.
- `default:` runs if none of the listed cases matches.
- With `marks = 7`, the output is `Your grade is C`.

---

### 2. BreakContinue.java

```java
public class BreakContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 3 || i == 5) {
                continue;
            }

            if (i == 8) {
                break;
            }

            System.out.println(i);
        }
    }
}
```

### Line-by-line explanation

- `public class BreakContinue {` declares the class named `BreakContinue`.
- `public static void main(String[] args) {` starts the program.
- `for (int i = 0; i < 10; i++) {` creates a loop where `i` starts at `0`, continues while it is less than `10`, and increases by `1` each time.
- `if (i == 3 || i == 5) {` checks whether `i` is `3` or `5`.
- `continue;` skips the remaining code in the current loop iteration and moves to the next value of `i`.
- `if (i == 8) {` checks whether `i` is `8`.
- `break;` immediately stops the entire loop when `i` becomes `8`.
- `System.out.println(i);` prints the current value of `i`.
- The output is:

```text
0
1
2
4
6
7
```

---

### 3. ReturnTypeExample.java

```java
public class ReturnTypeExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int c = addNums(a, b);

        System.out.println(c);
    }

    static int addNums(int val1, int val2) {
        int sum = val1 + val2;
        return sum;
    }
}
```

### Line-by-line explanation

- `public class ReturnTypeExample {` declares the class.
- `int a = 10;` creates variable `a` with value `10`.
- `int b = 20;` creates variable `b` with value `20`.
- `int c = addNums(a, b);` calls the `addNums` method using `a` and `b`, then stores the returned value in `c`.
- `System.out.println(c);` prints the value stored in `c`.
- `static int addNums(int val1, int val2) {` defines a method named `addNums` that accepts two integers and returns one integer.
- `int sum = val1 + val2;` adds the values received by the method.
- `return sum;` sends the calculated result back to the line that called the method.
- The output is:

```text
30
```

---

### 4. Methods.java

```java
public class Methods {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        printSquare(a, b);
        welcome();
    }

    static void welcome() {
        System.out.println("Welcome to Bangalore!!");
    }

    public static void printSquare(int a, int b) {
        int sq = (a * a) + (b * b) + (2 * a * b);

        System.out.println(sq);
    }
}
```

### Line-by-line explanation

- `public class Methods {` creates the `Methods` class.
- `int a = 5;` stores `5` in variable `a`.
- `int b = 10;` stores `10` in variable `b`.
- `printSquare(a, b);` calls the method that calculates the square of `(a + b)`.
- `welcome();` calls a method that does not need any input values.
- `static void welcome() {` defines a non-parameterized method; it accepts no values and returns no value.
- `System.out.println("Welcome to Bangalore!!");` prints a greeting.
- `public static void printSquare(int a, int b) {` defines a parameterized method with two integer parameters.
- `int sq = (a * a) + (b * b) + (2 * a * b);` uses the formula \((a+b)^2 = a^2+b^2+2ab\).
- `System.out.println(sq);` prints the calculated result.
- With `a = 5` and `b = 10`, the result is `225`.

---

### 5. Arrays.java

```java
public class Arrays {
    public static void main(String[] args) {
        int[] marks = new int;
        marks = 100;

        int[] luckyNos = {12, 11, 2, 7, 8};

        System.out.println(luckyNos);
        System.out.println("The length is " + luckyNos.length);

        for (int i = 0; i < luckyNos.length; i++) {
            System.out.println(luckyNos[i]);
        }

        int sum = 0;

        for (int i = 0; i < luckyNos.length; i++) {
            sum = sum + luckyNos[i];
        }

        int avg = sum / luckyNos.length;

        System.out.println("Sum: " + sum + " Avg: " + avg);
    }
}
```

### Line-by-line explanation

- `int[] marks = new int[5];` creates an integer array named `marks` with five positions: indexes `0` through `4`.
- `marks[0] = 100;` stores `100` in the first array position.
- `int[] luckyNos = {12, 11, 2, 7, 8};` creates an array and assigns five values at once.
- Array indexes start from `0`, so the index positions are `0, 1, 2, 3, 4`.
- `System.out.println(luckyNos[4]);` prints the value at index `4`, which is `8`.
- `luckyNos.length` gives the number of elements in the array, which is `5`.
- The first `for` loop visits every index from `0` until the last index.
- `System.out.println(luckyNos[i]);` prints each array value one by one.
- `int sum = 0;` creates a variable to store the total.
- The second `for` loop adds each array item to `sum`.
- `int avg = sum / luckyNos.length;` calculates the integer average.
- The sum is `40`, and the average is `8`.

---

### 6. Block.java

```java
public class Block {
    public static void main(String[] args) {
        int n = 5;
        int iters = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(n);
                iters++;
            }

            System.out.println();
        }

        System.out.println("iters = " + iters);
    }
}
```

### Line-by-line explanation

- `int n = 5;` sets the grid size and the number that will be printed.
- `int iters = 0;` creates a counter for how many times the inner loop executes.
- `for (int i = 0; i < n; i++) {` is the outer loop; it controls the rows.
- Since `n` is `5`, the outer loop runs five times.
- `for (int j = 0; j < n; j++) {` is the inner loop; it controls the columns.
- `System.out.print(n);` prints `5` without moving to the next line.
- `iters++;` increases the counter after each printed `5`.
- `System.out.println();` moves to a new line after one full row is printed.
- `System.out.println("iters = " + iters);` prints the total number of executions.
- The inner loop runs \(5 \times 5 = 25\) times.

```text
55555
55555
55555
55555
55555
iters = 25
```

---

### 7. ArrayMani.java

```java
public class ArrayMani {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 4, 11, 9, 8};

        int target = 5;
        boolean isPresent = false;

        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                isPresent = true;
            }
        }

        if (isPresent) {
            System.out.println("Present");
        } else {
            System.out.println("Not Present");
        }
    }
}
```

### Line-by-line explanation

- `int[] arr = {1, 2, 5, 4, 11, 9, 8};` creates an integer array.
- `int target = 5;` stores the number that the program will search for.
- `boolean isPresent = false;` creates a Boolean flag; initially the target is assumed not to be in the array.
- `for (int i = 0; i < arr.length; i++) {` loops through every item in `arr`.
- `if (target == arr[i]) {` compares `target` with the current array value.
- `isPresent = true;` changes the flag to `true` if a matching value is found.
- `if (isPresent) {` checks the result after the loop ends.
- `System.out.println("Present");` prints this when the target exists in the array.
- `else` runs when no matching value was found.
- This technique is called **linear search**.
- The output is:

```text
Present
```

---

### 8. TwoDArray.java

```java
public class TwoDArray {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum = sum + matrix[i][j];
            }
        }

        System.out.println(sum);
    }
}
```

### Line-by-line explanation

- `int[][] matrix = { ... };` creates a two-dimensional integer array, also called a matrix.
- `{1, 2, 3}` is the first row.
- `{4, 5, 6}` is the second row.
- `{7, 8, 9}` is the third row.
- `int sum = 0;` creates a variable for the total of all matrix elements.
- `for (int i = 0; i < matrix.length; i++) {` loops through the rows.
- `matrix.length` is `3` because the matrix has three rows.
- `for (int j = 0; j < matrix[i].length; j++) {` loops through columns in the current row.
- `matrix[i][j]` accesses the value at row `i` and column `j`.
- `sum = sum + matrix[i][j];` adds every matrix item to the total.
- `System.out.println(sum);` prints the total of all values.
- The output is:

```text
45
```

---

### 9. ArrayExample.java

```java
public class ArrayExample {
    public static void main(String[] args) {
        int[][] array = new int;

        System.out.println("Number of rows: " + array.length);

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println(matrix);[1]
    }
}
```

### Line-by-line explanation

- `int[][] array = new int[3][3];` creates a 2D array with three rows and three columns.
- Because no values are manually assigned, every integer position starts with the default value `0`.
- `array.length` gives the number of rows, which is `3`.
- `System.out.println("Number of rows: " + array.length);` prints the row count and ensures the `array` variable is actually used.
- `int[][] matrix = { ... };` creates another 3-by-3 matrix with predefined values.
- `matrix[1][2]` means row index `1`, column index `2`.
- Java starts indexing from zero, so `matrix[1][2]` refers to `6`.
- The output is:

```text
Number of rows: 3
6
```

---

### 10. StringComparison.java

```java
public class StringComparison {
    public static void main(String[] args) {
        String a = new String("Java");
        String b = new String("Java");

        System.out.println(a == b);
        System.out.println(a.equals(b));
    }
}
```

### Line-by-line explanation

- `String a = new String("Java");` creates a new String object containing `Java`.
- `String b = new String("Java");` creates another separate String object with the same characters.
- `System.out.println(a == b);` checks whether `a` and `b` point to the exact same object in memory.
- Since `a` and `b` are separate objects, `a == b` returns `false`.
- `System.out.println(a.equals(b));` compares the actual text inside both String objects.
- Since both strings contain `Java`, `a.equals(b)` returns `true`.
- Use `.equals()` to compare String contents, not `==`.
- The output is:

```text
false
true
```

---

### 11. StringPractice.java

```java
public class StringPractice {
    public static void main(String[] args) {
        String city = "Bengaluru";

        System.out.println(city.length());
        System.out.println(city.toUpperCase());
        System.out.println(city.equals("Bengaluru"));
    }
}
```

### Line-by-line explanation

- `String city = "Bengaluru";` creates a String variable named `city`.
- `city.length()` counts the characters in the string.
- `System.out.println(city.length());` prints the length, which is `9`.
- `city.toUpperCase()` creates a new version of the string in uppercase letters.
- `System.out.println(city.toUpperCase());` prints `BENGALURU`.
- `city.equals("Bengaluru")` checks whether the content exactly matches `Bengaluru`.
- String comparison using `.equals()` is case-sensitive.
- The output is:

```text
9
BENGALURU
true
```

---

### 12. ConcatDemo.java

```java
public class ConcatDemo {
    public static void main(String[] args) {
        String first = "Java";
        String second = "Programming";

        String combined = first + " " + second;
        String withNumber = "Score: " + 95;

        System.out.println(combined);
        System.out.println(withNumber);
    }
}
```

### Line-by-line explanation

- `String first = "Java";` creates a String variable containing `Java`.
- `String second = "Programming";` creates another String variable.
- `String combined = first + " " + second;` joins both strings with a space between them.
- The `+` operator joins text values; this operation is called **concatenation**.
- `String withNumber = "Score: " + 95;` joins text with an integer.
- Java automatically converts `95` into text because it is being joined with a String.
- `System.out.println(combined);` prints the combined String.
- `System.out.println(withNumber);` prints the String containing the score.
- The output is:

```text
Java Programming
Score: 95
```

---

## Other Java Programs

> **How to use:** Save this content as `other java programs.md`.  
> This file documents the Java programs in this folder that are not included in `placement training java programs.md`. Each Java program should be saved separately using the filename shown in its heading.

### 1. a+=5.java

```java
public class Main {
    public static void main(String[] args) {
        int a = 10;
        a += 5;
        System.out.println(a);
    }
}
```

### Line-by-line explanation

- `public class Main {` creates a public class named `Main`.
- `public static void main(String[] args) {` is the entry point of the Java program.
- `int a = 10;` creates an integer variable `a) and stores `10`.
- `a += 5;` is the compound assignment operator. It is equivalent to `a = a + 5;`.
- `System.out.println(a);` prints the updated value of `a`.
- The output is:

```text
15
```

---

### 2. age calculator.java

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Create Scanner object to take input
        Scanner sc = new Scanner(System.in);

        // Get birth year from the user
        System.out.print("Enter your birth year: ");
        int birthYear = sc.nextInt();

        // Get the current year
        int currentYear = 2026;

        // Calculate age
        int age = currentYear - birthYear;

        // Display the age
        System.out.println("Your current age is: " + age);

        // Close Scanner
        sc.close();
    }
}
```

### Line-by-line explanation

- `import java.util.Scanner;` imports the `Scanner` class so the program can receive input from the keyboard.
- `public class Main {` creates a class named `Main`.
- `public static void main(String[] args) {` is the starting point of the program.
- `Scanner sc = new Scanner(System.in);` creates a Scanner object connected to standard input.
- `System.out.print("Enter your birth year: ");` asks the user to enter their birth year.
- `int birthYear = sc.nextInt();` reads the entered year and stores it in `birthYear`.
- `int currentYear = 2026;` stores the current year used by the program.
- `int age = currentYear - birthYear;` calculates the age by subtracting the birth year from the current year.
- `System.out.println("Your current age is: " + age);` displays the calculated age.
- `sc.close();` closes the Scanner.
- For example, if the user enters `2006`, the output is:

```text
Enter your birth year: 2006
Your current age is: 20
```

> **Note:** This program calculates age by year only. It does not check whether the user's birthday has occurred yet in the current year.

---

### 3. celsius to fahrenheit.java

```java
import java.util.Scanner;

class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double c = sc.nextDouble();

        double f = (c * 9 / 5) + 32;

        System.out.println("Temperature in Fahrenheit = " + f);
    }
}
```

### Line-by-line explanation

- `import java.util.Scanner;` imports the Scanner class for user input.
- `class CelsiusToFahrenheit {` creates a class named `CelsiusToFahrenheit`.
- `public static void main(String[] args) {` is the program entry point.
- `Scanner sc = new Scanner(System.in);` creates a Scanner object.
- `System.out.print("Enter temperature in Celsius: ");` asks the user for a Celsius temperature.
- `double c = sc.nextDouble();` reads the temperature as a decimal number.
- `double f = (c * 9 / 5) + 32;` converts Celsius to Fahrenheit using the formula `F = (C × 9/5) + 32`.
- `System.out.println(...);` displays the converted temperature.
- For an input of `25`, the output is:

```text
Enter temperature in Celsius: 25
Temperature in Fahrenheit = 77.0
```

---

### 4. increment and decrement.java

```java
public class Main {
    public static void main(String[] args) {
        int a = 10;

        a++;
        System.out.println(a);

        a--;
        System.out.println(a);
    }
}
```

### Line-by-line explanation

- `public class Main {` creates a class named `Main`.
- `public static void main(String[] args) {` is the entry point of the program.
- `int a = 10;` creates an integer variable with the initial value `10`.
- `a++;` is the increment operator. It increases `a) by `1`.
- `System.out.println(a);` prints the new value, `11`.
- `a--;` is the decrement operator. It decreases `a) by `1`.
- `System.out.println(a);` prints the new value, `10`.
- The output is:

```text
11
10
```

---

### 5. largest number.java

```java
public class Main {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 30;
        int num3 = 15;

        int largest = (num1 > num2)
                ? (num1 > num3 ? num1 : num3)
                : (num2 > num3 ? num2 : num3);

        System.out.println("Largest number: " + largest);
    }
}
```

### Line-by-line explanation

- `public class Main {` creates a class named `Main`.
- `public static void main(String[] args) {` is the entry point of the program.
- `int num1 = 20;`, `int num2 = 30;`, and `int num3 = 15;` store the three numbers.
- `int largest = ...;` creates a variable to store the largest number.
- `(num1 > num2) ? ... : ...` is the ternary operator. It first checks whether `num1) is greater than `num2`.
- If `num1) is greater, the nested ternary operator compares `num1) and `num3`.
- Otherwise, the nested ternary operator compares `num2) and `num3`.
- `System.out.println(...);` prints the largest value.
- With the current values, the output is:

```text
Largest number: 30
```

---

### 6. ternary operator.java

```java
public class Main {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 30;

        // Ternary operator
        String output = num1 > num2 ? "num1 is greater" : "num2 is greater";

        System.out.println(output);
    }
}
```

### Line-by-line explanation

- `public class Main {` creates a class named `Main`.
- `public static void main(String[] args) {` is the entry point of the program.
- `int num1 = 20;` stores `20) in `num1`.
- `int num2 = 30;` stores `30) in `num2`.
- `num1 > num2 ? ... : ...` is the ternary operator. It returns one of two values depending on the condition.
- If `num1 > num2` is true, `"num1 is greater"` is selected.
- Otherwise, `"num2 is greater"` is selected.
- `System.out.println(output);` prints the selected message.
- The output is:

```text
num2 is greater
```

---

### 7. APICostTracker.java

**Source file:** `code/object-oriented-programming-with-java-api-usage.java`

```java
class APIUsage {
    private String provider;
    private double costPerCall;
    private int calls;

    public APIUsage(String provider, double costPerCall) {
        this.provider = provider;
        this.costPerCall = costPerCall;
    }

    public void logCall() {
        calls++;
    }

    public double getTotalCost() {
        return calls * costPerCall;
    }

    public void printCost() {
        System.out.printf("%-12s Rs.%.4f x %d calls = Rs.%.2f%n",
                provider, costPerCall, calls, getTotalCost());
    }
}

public class APICostTracker {
    public static void main(String[] args) {
        APIUsage openai = new APIUsage("OpenAI", 0.15);
        APIUsage claude = new APIUsage("Claude", 0.20);

        for (int i = 0; i < 12; i++) openai.logCall();
        for (int i = 0; i < 8; i++) claude.logCall();

        openai.printCost();
        claude.printCost();
    }
}
```

### Line-by-line explanation

- `class APIUsage {` creates a class used to store API usage information.
- `private String provider;` stores the API provider name.
- `private double costPerCall;` stores the cost of one API call.
- `private int calls;` stores the number of API calls.
- `public APIUsage(String provider, double costPerCall) {` is a constructor used to initialize a new `APIUsage` object.
- `this.provider = provider;` stores the provider name in the object's field.
- `this.costPerCall = costPerCall;` stores the cost per call.
- `public void logCall() {` defines a method for recording one API call.
- `calls++;` increases the number of calls by one.
- `public double getTotalCost() {` defines a method that returns the total cost.
- `return calls * costPerCall;` calculates total cost by multiplying the number of calls by the cost of each call.
- `public void printCost() {` defines a method that prints the usage information.
- `System.out.printf(...);` prints formatted text using the provider name, cost per call, number of calls, and total cost.
- `public class APICostTracker {` creates the main public class.
- `APIUsage openai = new APIUsage("OpenAI", 0.15);` creates an object representing OpenAI API usage.
- `APIUsage claude = new APIUsage("Claude", 0.20);` creates an object representing Claude API usage.
- `for (int i = 0; i < 12; i++) openai.logCall();` records 12 OpenAI calls.
- `for (int i = 0; i < 8; i++) claude.logCall();` records 8 Claude calls.
- `openai.printCost();` prints the OpenAI usage and calculated cost.
- `claude.printCost();` prints the Claude usage and calculated cost.
- The output is approximately:

```text
OpenAI       Rs.0.1500 x 12 calls = Rs.1.80
Claude       Rs.0.2000 x 8 calls = Rs.1.60
```

> **Important:** The public class is `APICostTracker`, so the Java source file should normally be named `APICostTracker.java` when compiling it directly.

---

## Compile and Run Commands

### Placement Training

For every program, first save it using the same name as its public class.

```bash
javac GradeEvaluator.java
java GradeEvaluator
```

Replace `GradeEvaluator` with the class name you want to run.

Examples:

```bash
javac Arrays.java
java Arrays
```

```bash
javac TwoDArray.java
java TwoDArray
```

```bash
javac StringComparison.java
java StringComparison
```

### Other Programs

For programs whose public class is `Main`, save or copy the program into a file named `Main.java` before compiling.

```bash
javac Main.java
java Main
```

For the Celsius program:

```bash
javac CelsiusToFahrenheit.java
java CelsiusToFahrenheit
```

For the API cost tracker:

```bash
javac APICostTracker.java
java APICostTracker
```

> **Note:** Several programs in this folder use the public class name `Main`. They should be compiled and run separately rather than treated as multiple source files in the same compilation unit.

---

## Updated Programs Covered

| # | Program | Main concept |
| --- | --- | --- |
| 1 | `a+=5.java` | Compound assignment operator |
| 2 | `age calculator.java` | Scanner input and age calculation |
| 3 | `celsius to fahrenheit.java` | User input and type conversion |
| 4 | `increment and decrement.java` | Increment and decrement operators |
| 5 | `largest number.java` | Nested ternary operator |
| 6 | `ternary operator.java` | Ternary operator |
| 7 | `APICostTracker.java` | Classes, objects, constructor, methods, encapsulation, loops, formatted output |
| 8 | `TwoSum.java` | Arrays, nested loops, pair-sum search |
| 9 | `StringCompare.java` | String objects, String pool, reference comparison |
| 10 | `RecursiveMethod.java` | Recursion and base condition |
| 11 | `PrimePrimitive.java` | Primitive pass-by-value |
| 12 | `PrimNonPrimitive1.java` | Primitive vs array reference behavior |
| 13 | `ClassObjectDemo.java` | Classes, objects, instance variables, methods, and `new` keyword |
| 14 | `ClassDemo2.java` | Parameterized constructors, static variables, and static methods |
| 15 | `ClassDemo3.java` | No-argument and parameterized constructors, static variables, and static methods |
| 16 | `Encapsulation.java` | Getter and setter methods, direct vs encapsulated field access |
| 17 | `PolymorphismDemo1.java` | Compile-time polymorphism through method overloading |
| 18 | `PolyDemo2.java` | Compile-time polymorphism through method overloading |
| 19 | `PolyDemo3.java` | Runtime polymorphism through method overriding |
| 20 | `interfacedemo.java` | Interfaces and inheritance |
| 21 | `ArraylistDemo.java` | Arrays vs ArrayList |
| 22 | `StackDemo.java` | Stack using LinkedList and LIFO |
| 23 | `HashMapDemo.java` | HashMap key-value pairs and key replacement |
| 24 | `ArraylistDemo2.java` | Array, ArrayList, and LinkedList |
