package JavaBasics.ArraysPkg;

import javax.print.DocFlavor;

public class TwoDCharArray4 {
    public static void main(String[] args) {

        char[][] chaArray = new char[][]{
                {'Q','W','E','R','T'},
                {'A','S','D','F','G'},
                {'Z','X','F','G','K'},
                {'H','M','B','D','V'}
        };

        int rowCount = chaArray.length;
        System.out.println("Row count : "+ rowCount);
        int colCount = chaArray[0].length;
        System.out.println("Col Count : "+ colCount);

        for(int i =0; i < rowCount; i ++)
        {
            for(int j = 0; j<colCount; j++)
            {
                if(chaArray[i][j]=='A'|| chaArray[i][j]=='E'|| chaArray[i][j]=='I'||chaArray[i][j]=='O'||chaArray[i][j]=='U')
                {
                    System.out.println("Vowels: " +chaArray[i][j]);
                }
                else
                {
                    System.out.println("Consonents: "+chaArray[i][j]);
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
