package JavaBasics.ArraysPkg;

public class ThreeDArray {
    public static void main(String[] args) {
        int [][][] arr = new int[][][]{
                {
                        { 1,2,3,4,5,6},
                        { 7,8,9},
                        {10,20,30,40}
                },
                {
                        {11,22,23,33,44,55},
                        { 0,2,0,0,0},
                        {44,55,66,77,88,99}
                },
                {
                        {7,5,3},
                        {1,5,9,0},
                        {4,8,2,6,0}
                }
        };

        System.out.println(arr.length);
        System.out.println(arr[0].length);

        for(int[][] first: arr)
        {
            for(int [] second : first)
            {
                for(int third : second)
                {
                    System.out.print(third +" ");
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println();
    }
}
