package JavaBasics.ArraysPkg;

public class ConcatArray {
    public static void main(String[] args) {

        double [] dArray1 = new double[]{10.50,51.36,14.23};
        double [] dArray2 = {78.21,83.46,56.14,0.00};
        double [] dArray3 = new double[dArray1.length + dArray2.length];

        for(int i = 0 ; i < dArray1.length; i ++)
        {
            dArray3 [i] = dArray1[i];
            System.out.print(dArray3 [i]+ " ");
        }

        for(int i = 0;i< dArray2.length;i++)
        {
            dArray3[dArray1.length +i] = dArray2[i];
            System.out.print( dArray3[dArray1.length +i] + " ");
        }


    }
}
