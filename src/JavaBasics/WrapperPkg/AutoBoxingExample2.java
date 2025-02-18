package JavaBasics.WrapperPkg;

import java.util.ArrayList;

public class AutoBoxingExample2 {
    public static void main(String[] args) {

        ArrayList al = new ArrayList<>();
        //All types of primitive data type are being autoboxing internaly.
        al.add(2);
        al.add('T');
        al.add(34.56);
        al.add("Saniya");
        System.out.println(al);

        ArrayList<Integer> al1 = new ArrayList<>();
        //All types of primitive data type are being autoboxing internaly.
        al1.add(2);
       // al1.add('T');
       // al1.add(34.56);
       // al1.add("Saniya");
        System.out.println(al1);
    }
}
