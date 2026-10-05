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
