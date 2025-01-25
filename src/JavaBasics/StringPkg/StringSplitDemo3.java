package JavaBasics.StringPkg;

public class StringSplitDemo3 {
    public static void main(String[] args) {
        String str = "Hey Baby you are so lovely";
        String[] strArr = str.split(" ");

        //Print word which ends with y

        for(int i =0; i < strArr.length; i++)
        {
            String temp = strArr[i];
            int len = temp.length();
            if(temp.charAt(len -1) == 'y')
            {
                System.out.println(strArr[i]);
            }
        }

        System.out.println("Alternate way without using temp ");

        for(int i =0; i < strArr.length; i++)
        {

            int len = strArr[i].length();
            if(strArr[i].charAt(len-1)=='y')
            {
                System.out.println(strArr[i]);
            }
        }
    }
}
