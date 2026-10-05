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
