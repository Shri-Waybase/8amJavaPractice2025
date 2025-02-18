package JavaBasics.WrapperPkg;

public class DoubleCharLongIntDeno {
    Integer i =10;
    Double d1 = 20.45;
    Byte b = 90;

    public void disply(){
        System.out.println(i);
        System.out.println(d1);
        System.out.println(b);
    }

    public static void main(String[] args) {

        int a =10;
        double d =20;
        char l = 'P';

        System.out.println(Integer.valueOf(a));
        System.out.println(Double.valueOf(d));
        System.out.println(Character.valueOf(l));

DoubleCharLongIntDeno obj = new DoubleCharLongIntDeno();
obj.disply();

    }
}
