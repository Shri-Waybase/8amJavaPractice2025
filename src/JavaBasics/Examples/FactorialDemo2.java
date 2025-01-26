package JavaBasics.Examples;

import java.util.Scanner;

public class FactorialDemo2 {
    public static void main(String[] args) {
        System.out.print("Enter Number :  " );
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int fact =1;
        for(int i = number;i >=1; i--)
        {
            fact = fact * i;
        }
        System.out.println("Factorial is :  " + fact);
    }
}
