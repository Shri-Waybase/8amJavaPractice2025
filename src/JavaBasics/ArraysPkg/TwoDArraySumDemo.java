package JavaBasics.ArraysPkg;

public class TwoDArraySumDemo {
    public static void main(String[] args) {
        int [][] firstArr= new int[][]{{1,2,3,4},{4,5,6,7}};
        int [][] secondArr=  {{8,7,6,1},{6,7,3,0}};;

        int [][] sumArr = new int[firstArr.length][firstArr[0].length];

        for(int i = 0; i < firstArr.length;i++)
        {
            for(int j=0; j< secondArr.length; j++)
            {
                sumArr[i][j] = firstArr[i][j] + secondArr[i][j];
            }
        }

        for(int [] row : sumArr)
        {
            for(int col : row)
            {
                System.out.print(col + " ");
            }
            System.out.println();
        }

    }
}
