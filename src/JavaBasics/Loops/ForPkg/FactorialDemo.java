package JavaBasics.Loops.ForPkg;

import java.util.Scanner;

public class FactorialDemo {
    public static void main(String[] args) {
        System.out.print("Enter a Number : ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int fact =1;
        for(int i = number; i >= 1; i--)
        {
           fact = fact * i;
        }
        System.out.println("factorial is : "+ fact);

    }
}
