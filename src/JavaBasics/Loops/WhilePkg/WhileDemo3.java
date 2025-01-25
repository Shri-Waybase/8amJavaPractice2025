package JavaBasics.Loops.WhilePkg;

public class WhileDemo3 {
    public static void main(String[] args) {
        int i = 5;
        int j = 1;
        int multi = 0;
        while (j <= 10){
            multi = j * i;
           System.out.println(multi);

            j = j + 1;
        }
    }
}
