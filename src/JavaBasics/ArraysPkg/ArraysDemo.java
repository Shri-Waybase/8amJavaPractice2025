package JavaBasics.ArraysPkg;

public class ArraysDemo {

    public static void main(String[] args) {

        int [] arr = new int[5];

        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        int len = arr.length;
        System.out.println("length of array : " + len);

        for(int i =0; i<len; i++)
        {
            System.out.println("elements of arrays : " + arr[i]);
        }

       /* for(int i = 0; i < 5; i++)
        {
            System.out.println(arr[i]);
        }*/
        /*System.out.println(arr[1]);
        System.out.println(arr[0]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);*/

    }
}
