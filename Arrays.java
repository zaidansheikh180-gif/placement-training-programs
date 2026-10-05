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
