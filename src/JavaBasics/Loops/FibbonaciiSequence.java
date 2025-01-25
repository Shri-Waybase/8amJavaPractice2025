package JavaBasics.Loops;

import java.util.Scanner;

public class FibbonaciiSequence {
    public static void main(String[] args) {

        System.out.println("Enter number 1st: " );
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();

        System.out.println("Enter number 2nd: " );
        Scanner sc2 = new Scanner(System.in);
        int num2 = sc2.nextInt();

        System.out.println("Enter length : " );
        Scanner sc3 = new Scanner(System.in);
        int length = sc3.nextInt();

        for(int i =0; i<length;i++)
        {
            int temp = num1 + num2;
            num1 = num2;
            num2 = temp;

            System.out.println(temp);
        }

    }
}
