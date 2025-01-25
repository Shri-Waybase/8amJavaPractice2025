package JavaBasics.Operators.Arithmatic;

import java.util.Scanner;

public class InputfromConsole {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value of a : " );
        int a = scanner.nextInt();
        System.out.println("Enter value of b : ");
        int b = scanner.nextInt();
        int sum = a + b;
        System.out.println("sum of a & b : "+ sum);


    }
}
