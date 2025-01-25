package JavaBasics.StringPkg;

public class StringDemo {
    public static void main(String[] args) {
        String str = new String("Today is a beautiful day");
        System.out.println(str);

        String str2 = "India is my country";
        System.out.println(str2);

        System.out.println(str.length());
        System.out.println(str2.length());

        System.out.println("India".length());
        //System.out.println("Wonderful".lines());

        System.out.println(str.equals(str2));
        System.out.println("Water".equals("Water"));

        String str3 ="elephant";
        String str4 = str3;
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str3.equals(str4));
        System.out.println(str3==str4);
    }
}
