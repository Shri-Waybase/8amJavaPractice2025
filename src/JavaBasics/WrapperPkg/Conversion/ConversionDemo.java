package JavaBasics.WrapperPkg.Conversion;

public class ConversionDemo {


    public static void main(String[] args) {

        String s1 = new String("12");
        String s2 = "13";

        System.out.println(s1 + s2);

        int i1 = Integer.parseInt(s1);
        int i2 = Integer.parseInt(s2);

        System.out.println(i1 + i2);

        String s3 = "23.56";
        String s4 = "45.12";

        float f1 = Float.parseFloat(s3);
        float f2 = Float.parseFloat(s4);

        System.out.println(f1 + f2);

        double d1 = Double.parseDouble(s3);
        double d2 = Double.parseDouble(s4);

        System.out.println(d1+d2);

        String s5 ="g";
        char ch = s5.charAt(0);
        System.out.println(ch);
    }

}
