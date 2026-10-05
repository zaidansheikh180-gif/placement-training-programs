public class PrimePrimitive {
    public static void main(String[] args) {
        int passingnum = 5;
        callingvariable(passingnum);
        System.out.println("after method call");
        System.out.println(passingnum);
    }

    static void callingvariable(int num){
        num++;
        System.out.println(num);
    }
}
