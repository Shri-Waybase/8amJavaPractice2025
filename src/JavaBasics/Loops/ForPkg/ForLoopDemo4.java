package JavaBasics.Loops.ForPkg;

public class ForLoopDemo4 {
    public static void main(String[] args) {

        int[] array ={1,2,3,4,5,6,7,8,9,10};

        for(int i =0; i <array.length; i++)
        {
            System.out.println(array[i]);
        }
        System.out.println("Reverse an arrays:");

        for(int j = array.length-1;j>=0; j--)
        {
            System.out.println(array[j]);
        }
    }
}
