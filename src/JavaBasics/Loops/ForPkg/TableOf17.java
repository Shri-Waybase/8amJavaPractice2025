package JavaBasics.Loops.ForPkg;

import java.util.Scanner;

public class TableOf17 {
    public static void main(String[] args) {
        System.out.println("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i =1; i <=10; i++)
        {
            int result = i*num;
            System.out.println(result);
        }
    }
}
