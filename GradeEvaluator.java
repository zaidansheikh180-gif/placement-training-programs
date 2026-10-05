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
