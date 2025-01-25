package JavaBasics.StringPkg;

public class StringSplitDemo {
    public static void main(String[] args) {

        String str = "This is a java program ";

        String [] strArr= str.split(" ");
        for(int i = 0; i < strArr.length; i++)
        {
            System.out.println(strArr[i]);
        }
        System.out.println("Length of String : " + str.length());
        System.out.println("Length of String array : " + strArr.length);


    }
}
