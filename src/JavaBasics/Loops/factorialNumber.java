package JavaBasics.Loops;

public class factorialNumber {
    public static void main(String[] args) {

        int a = 5;
        int mult = 1;
        for (int i = a; i > 1; i--) {
            mult = mult * i;

        }
        System.out.println(mult);
    }

}
