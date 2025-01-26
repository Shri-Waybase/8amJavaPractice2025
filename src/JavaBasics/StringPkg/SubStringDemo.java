package JavaBasics.StringPkg;

public class SubStringDemo {
    public static void main(String[] args) {
        String str = "Welcome to java programming class";
        String str1 = str.substring(6);
        System.out.println(str1);
        String str2 = str.substring(5,15);
        System.out.println(str2);
        System.out.println(str.substring(str.length()-5));

        //calculate length of string using. length() method.
        int len = str.length();
        System.out.println("len : "+ len);
        //print the last character of string.

        System.out.println(str.substring(len-1,len-1));

    }
}
