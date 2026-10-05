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
