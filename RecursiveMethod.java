public class RecursiveMethod {
    public static void main(String[] args) {
        // print from 100 to 0
        printNums(100);
    }

    static void printNums(int num) {
        if (num == 0) {
            // stop my recursion
            return;
        }
        System.out.println(num);
        printNums(num - 1);
    }
}
