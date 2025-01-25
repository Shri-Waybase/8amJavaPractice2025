package JavaBasics.ArraysPkg;

public class TwoDArray3 {
    public static void main(String[] args) {

        int [][] arr1 = {{11,22,33,44,55},{66,77,88,99,00},{25,50,75,100,125}};

        System.out.println("Row: "+ arr1.length);
        System.out.println("Col: "+ arr1[0].length);

        for(int i =0; i < arr1.length;i++)
        {
            for(int j = 0 ; j < arr1[0].length; j++)
            {
                System.out.print(arr1[i][j]+"\t");
            }
            System.out.println();
        }


        System.out.println("Reverse order");

        for(int i = arr1.length-1;i >=0;i--)
        {
            for(int j = arr1[0].length-1;j >= 0 ; j--)
            {
                System.out.print(arr1[i][j]+"\t");
            }
            System.out.println();
        }

        /*int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        for(int i =0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[0].length; j++)
            {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Row = "+ arr.length);
        System.out.println("Col = "+ arr[0].length);
        //System.out.println(arr[2][2]);*/
    }
}
