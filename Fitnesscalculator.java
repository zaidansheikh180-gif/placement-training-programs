import java.util.Scanner;

public class FitnessCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Get user's weight
        System.out.print("Enter your weight (kg): ");
        double weight = sc.nextDouble();

        // Get calories consumed
        System.out.print("Enter calories consumed today: ");
        double calories = sc.nextDouble();

        // Get protein consumed
        System.out.print("Enter protein consumed today (grams): ");
        double protein = sc.nextDouble();

        // Calculate recommended values
        double recommendedCalories = weight * 30;
        double recommendedProtein = weight * 1.6;

        // Display results
        System.out.println("\n===== FITNESS REPORT =====");

        System.out.println("Recommended Calories: "
                + recommendedCalories + " kcal");

        System.out.println("Recommended Protein: "
                + recommendedProtein + " g");

        System.out.println("Your Calories: "
                + calories + " kcal");

        System.out.println("Your Protein: "
                + protein + " g");

        // Check calories
        if (calories >= recommendedCalories) {
            System.out.println("Calories: Goal reached!");
        } else {
            System.out.println("Calories: You need more calories.");
        }

        // Check protein
        if (protein >= recommendedProtein) {
            System.out.println("Protein: Goal reached!");
        } else {
            System.out.println("Protein: You need more protein.");
        }

        sc.close();
    }
}
