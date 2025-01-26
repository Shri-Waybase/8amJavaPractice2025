package JavaBasics.ArraysPkg;

public class CopyArray {
    public static void main(String[] args) {

        int [] array1 = new int[]{10,20,30,60,50,40};
        int [] array2 = array1;
        System.out.println(array2[0]);
        System.out.println(array2[5]);
        for(int i =0 ; i <array2.length; i++)
        {
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        for(int i =0 ; i <array2.length; i++)
        {
            System.out.print( +array2[i]  + " ");
        }
        System.out.println();
    }
}
