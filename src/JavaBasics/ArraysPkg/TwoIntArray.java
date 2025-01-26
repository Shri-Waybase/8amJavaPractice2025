package JavaBasics.ArraysPkg;

public class TwoIntArray {
    public static void main(String[] args) {
        int [][] arr = {
                {12,45,23,78,98},
                {46,15,13,73,67},
                {13,58,53,37,77},
                {10,30,28,27,47}
        };

        int CCount =0;
        int OCount = 0;
        for(int i = 0; i < arr.length;i++)
        {
            for(int j = 0; j < arr[i].length; j ++)
            {
                if(arr[i][j] % 2 == 0)
                {
                    System.out.println("Even Number : "+ arr[i][j]);
                    OCount++;
                }
                else
                {
                    System.out.println("Odd Number : "+ arr[i][j]);
                    CCount++;
                }
                System.out.println();

            }
            System.out.println();

        }
        System.out.println("Count of Vowels: "+ OCount);
        System.out.println("Count of Consonants : "+CCount);
    }
}
