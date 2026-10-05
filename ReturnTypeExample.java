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
