package JavaBasics.Loops.ForPkg;

public class ForLoopDemo2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++){
            if(i % 2 ==0)
            {
                System.out.println("Even Number : "+ i);
            }
            else
            {
                System.out.println("Odd Number " + i);
            }

        }
    }
}
