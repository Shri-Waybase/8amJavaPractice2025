package JavaBasics.StringPkg;

public class StringConcatDemo2 {
    public static void main(String[] args) {

        String s1 = "Computer";
        System.out.println(s1);
        String s2 ="Science";
        System.out.println(s2);
        String s3 = s1.concat(" "+ s2);
        System.out.println(s3);
        String s4 = "Portal";

        String s5 = s3.concat(" "  + s4);
        System.out.println(s5);
    }
}
