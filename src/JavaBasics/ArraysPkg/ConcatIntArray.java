package JavaBasics.ArraysPkg;

public class ConcatIntArray {
    public static void main(String[] args) {
        int [] array1 = new int[]{9,7,3,1,5};
        int [] array2 = {0,2,8,6,4};

        int lenArra1 = array1.length;
        int lenArra2 = array2.length;

        System.out.println("lenArray1 = "+lenArra1);
        System.out.println("lenArray2 = "+lenArra2);

        int [] array3 = new int[lenArra1+lenArra2];
        for(int i =0; i<array1.length; i++){
            array3[i]=array1[i];
            System.out.print(array3[i] + " ");
        }


        for (int i = 0; i<array2.length;i++)
        {
            array3[array1.length +i] = array2[i];
            System.out.print(array3[array1.length + i] + " ");

        }


    }

}
