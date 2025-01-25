package JavaBasics.StringPkg;

public class StringDemo1 {
    public static void main(String[] args) {

        String str1 = "This is a java";//Find a character at 3 and length
        System.out.println("Char at index 3 is : " + str1.charAt(3) + " ,and length is : " + str1.length());

        String str2 = "Hi I am here";// find character at 2  & length
        System.out.println("Char at index 2 is : " + str2.charAt(2)+ " , and length is : " + str2.length());

        String str3 = "Where are you.";// find character at 0 &  length
        System.out.println("Char at index 0 is : " + str3.charAt(0)+ " , and length is : " + str3.length());

        String str4 = "This is a demo";// find character at 5 & length
        System.out.println("Char at index 5 is : " + str4.charAt(5) + " , and length is : " + str4.length());

        String str5 = "Core Java";// find character at 6 & length
        System.out.println("Char at index 6 is : " + str5.charAt(6) + " , and length is : "+ str5.length());

    }
}