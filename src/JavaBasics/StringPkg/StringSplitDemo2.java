package JavaBasics.StringPkg;

public class StringSplitDemo2 {
    public static void main(String[] args) {

        String str = "This is a java program ";

        String [] strArr= str.split(" ");
        for(int i = 0; i < strArr.length; i++)
        {
            //Print a word from array whose length is greater than 5
            if(strArr[i].length() > 5) {
                System.out.println(strArr[i]);
            }/**/

            // print words from an array whose length is less than 5

            if(strArr[i].length() < 5)
            {
                System.out.println(strArr[i]);
            }
        }


        System.out.println("Length of String : " + str.length());
        System.out.println("Length of String array : " + strArr.length);

        
    }
}
