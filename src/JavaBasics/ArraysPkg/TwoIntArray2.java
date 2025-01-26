package JavaBasics.ArraysPkg;

import java.util.Scanner;

public class TwoIntArray2 {
    public static void main(String[] args)
    {
        int [][] array  = new int[][]{
                {1,8,2,4,6},{9,8,56,4,77,45},{4,6,7},{8,0}
    };

        System.out.println("length of 1st row: "+array[0].length);
        System.out.println("length of 2nd row: "+array[1].length);
        System.out.println("length of 3rd row: "+array[2].length);
        System.out.println("length of 4th row: "+array[3].length);

        for(int[] a : array)
        {
            for(int b : a ) {

            System.out.print(b + " ");
        }
            System.out.println();
        }
        System.out.println();

    }
}
