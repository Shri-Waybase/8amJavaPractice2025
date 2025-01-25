package JavaBasics.Loops.DoWhilePkg;

public class DowhileDemo3
{
    public static void main(String[] args) {
        int i = 1;
        int j = 6;
        int multi = 0;
        do {
            multi = i * j;
            System.out.println(multi);
            i++;
        }while(i <=10);
    }
}
