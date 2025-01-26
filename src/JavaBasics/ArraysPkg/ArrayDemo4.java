package JavaBasics.ArraysPkg;

public class ArrayDemo4 {
    public static void main(String[] args) {

        double[] dArry = new double[]{1,5,45,-7,4,23,18,-2,9,22};

        double length = dArry.length;

        System.out.println("Length of array : "+  length);

        double sum = 0.0;

        for(double d : dArry)
        {
            sum = sum + d;
        }

        System.out.println("Sum of All elements : "+ sum);

        double average = sum / length;
        System.out.println("Average of all numbers:  "+ average);
    }
}
