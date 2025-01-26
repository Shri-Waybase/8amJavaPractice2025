package JavaBasics.ArraysPkg;

import java.util.Arrays;

public class ConcatCharArray {
    public static void main(String[] args) {
        char [] chArr1 = new char[]{'a','f','r','b','p'};
        char [] chArr2 = {'w','z','q'};

        int len1 = chArr1.length;
        int len2 = chArr2.length;

        System.out.println("Char Arr leng 1 :" + len1);
        System.out.println("Char Arr leng 2 :" + len2);

        char [] chArr3 = new char[len1+len2];

        int position =0;
        for(char ch1 : chArr1)
        {
            chArr3 [position] =ch1;
            System.out.print(chArr3[position] + " ");
            position++;
        }
        System.out.println();

        for(char ch2 : chArr2)
        {
            chArr3[position] =ch2;
            System.out.print(chArr3[position]+ " ");
            position=position+1;
        }
        System.out.println();
        System.out.println(Arrays.toString(chArr3));
    }

}
