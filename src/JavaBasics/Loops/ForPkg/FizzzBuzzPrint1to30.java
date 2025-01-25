package JavaBasics.Loops.ForPkg;

public class FizzzBuzzPrint1to30 {
    public static void main(String[] args) {
        for (int i=1; i<=30; i++)
        {
            if(i%3==0) {
                System.out.println(i + " Fizz");

            }
            if(i%5==0)
            {
                System.out.println(i+" Buzz");

            }
            if (i%3==0 && i%5==0)
            {
                System.out.println(i + "FizzBuzz");
            }
            else
            {
                System.out.println(i + " -- ");
            }
        }
    }
}
