package JavaBasics.ArraysPkg;

public class TwoDArray {
    public static void main(String[] args) {
        int [][] arr = new int[3][4];
        System.out.println("Row count of an array : " +arr.length);
        System.out.println("Col count of an array : " + arr[0].length);

        arr[0][0]=89;
        arr[0][1]=86;
        arr[0][2]=99;
        arr[0][3]=34;

        arr[1][0]=12;
        arr[1][1]=32;
        arr[1][2]=25;
        arr[1][3]=52;

        arr[2][0]=12;
        arr[2][1]=32;
        arr[2][2]=25;
        arr[2][3]=52;

        for(int i =0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[0].length; j++)
            {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        //System.out.println(arr[2][2]);

    }
}
