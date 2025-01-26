package JavaBasics.StringPkg;

public class SubStringDemo2 {
    public static void main(String[] args) {
        String str = new String("This is a very nice place");
        int len = str.length();
        System.out.println("len : "+ len);
        System.out.println(str.substring(0));
        System.out.println(str.substring(5));
        System.out.println(str.substring(0,5));
        System.out.println(str.substring(5,10));
        System.out.println(str.substring(10));
        System.out.println(str.substring(11,25));
        System.out.println(str.substring(0,25));
        //System.out.println(str.substring(0,26));

        //System.out.println(str.substring(-1,3));
        System.out.println(str.substring(-0));
        System.out.println(str.substring(-0,25));

        //Another way of substring.

        String str2 = "India is my country".substring(6);
        System.out.println(str2);

    }
}