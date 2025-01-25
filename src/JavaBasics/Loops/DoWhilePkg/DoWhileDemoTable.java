package JavaBasics.Loops.DoWhilePkg;

import java.util.Scanner;

public class DoWhileDemoTable {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int counter =1;

        do {
            int result = counter*number;
            System.out.println(result);
            counter++;

        }while (counter<=10);

    }
}
