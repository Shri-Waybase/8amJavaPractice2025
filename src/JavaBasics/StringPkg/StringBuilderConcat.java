package JavaBasics.StringPkg;

public class StringBuilderConcat {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder("Virat");
        StringBuilder s2 = new StringBuilder("Kohali");

        s1 = s1.append(s2);
        System.out.println(s1);

        //Below is the String buffer example.
        StringBuffer sb = new StringBuffer("Raja");
        sb = sb.append("Singh");
        System.out.println(sb);

        String str = String.format("%s%s","Sunil","Gavaskar");
        System.out.println(str);
    }
}
