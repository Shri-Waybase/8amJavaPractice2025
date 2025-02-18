package JavaBasics.WrapperPkg.Conversion;

public class ConversioneDemo1 {

    public static void main(String[] args) {
        String str ="123";

        int i =Integer.parseInt(str);
        System.out.println(i);

        Integer i1 = 12;

        int a2 = i1.intValue();
        System.out.println(a2);

        float f1 = i1.floatValue();
        System.out.println(f1);

        double d1 = i1.doubleValue();
        System.out.println(d1);
        String str2 = i1.toString();
        System.out.println(str2);



    }
}
