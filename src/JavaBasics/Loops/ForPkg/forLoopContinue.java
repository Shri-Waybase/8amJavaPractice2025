package JavaBasics.Loops.ForPkg;

public class forLoopContinue {


    public static void main(String[] args) {
        int n = 10;

        for(int i =0; i <n; i++)
        {
            if(i==6) {
                continue;
            }
            System.out.println(i);
        }

    }
}
