package JavaBasics.WrapperPkg;

public class IntegerDemo {
    public static void main(String[] args) {

        //crate primitive data types.

        int a =20;
        int b =30;

        //Convert it primitive datatypes in to wrapper class objects

        Integer a1 =Integer.valueOf(a);
        System.out.println(a1);
        System.out.println(a1 instanceof Integer);

        Integer b2 = Integer.valueOf(b);
        System.out.println(b2 instanceof Integer);


        Integer i = 10;
        System.out.println(i instanceof Integer);


    }
}
