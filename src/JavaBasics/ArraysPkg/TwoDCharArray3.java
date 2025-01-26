package JavaBasics.ArraysPkg;

public class TwoDCharArray3 {
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
                System.out.print(chaArray[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
