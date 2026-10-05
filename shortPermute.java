public class ShortPermute {
    // Fixed: Changed the period to a comma between the two String parameters
    public static void permute(String str, String ans) {
        if (str.isEmpty()) {
            System.out.println(ans + " ");
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            String remaining = str.substring(0, i) + str.substring(i + 1);
            permute(remaining, ans + str.charAt(i));
        }
    }

    public static void main(String[] args) {
        permute("ABCDE", "");
    }
}
