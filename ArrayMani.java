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
