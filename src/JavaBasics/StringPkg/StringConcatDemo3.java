package JavaBasics.StringPkg;

public class StringConcatDemo3 {
    public static void main(String[] args) {

        String s1 = " Knowledge";
        System.out.println(s1);
        String s2 = s1;
        System.out.println(s1==s2);
        s1= s1.concat(" base");
        System.out.println(s1);
    }
}
