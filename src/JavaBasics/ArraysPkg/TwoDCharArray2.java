package JavaBasics.ArraysPkg;

public class TwoDCharArray2 {
    public static void main(String[] args) {

        char [][] chArr = new char[3][4];
        chArr[0][0]='q';
        chArr[0][1]='w';
        chArr[0][2]='E';
        chArr[0][3]='d';

        chArr[1][0]='S';
        chArr[1][1]='X';
        chArr[1][2]='A';
        chArr[1][3]='i';

        chArr[2][0]='o';
        chArr[2][1]='p';
        chArr[2][2]='s';
        chArr[2][3]='e';

       for(char [] chi : chArr)
       {
           for(char chj: chi)
           {
               System.out.print(chj + " ");
           }
           System.out.println();
       }
        System.out.println();
    }
}
