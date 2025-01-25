package JavaBasics.Loops.WhilePkg;

import java.util.Scanner;

public class WhileDemo4 {
    public static void main(String[] args) {

        System.out.print("Enter a number : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int counter=1;

        while (counter<=10)
        {
            int result = counter*number;
            System.out.println(result);
            counter++;
        }
    }
}

