package JavaBasics.WrapperPkg;

import java.util.ArrayList;

public class UnboxingDemiExample2 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();

        //Internaly autoboxing all the types of primitive datatypes int o corrosponding wrapper class.
        al.add(12);
        al.add(23);
        al.add('Y');
        al.add(45.00);
        al.add("Saniya");

        System.out.println(al);

        //Now convert the all wrapper class object above into primitive datatype.
        int a = (int) al.get(0);
        int b = (int) al.get(1);
        char c = (char) al.get(2);
        double d = (double) al.get(3);
        String s = (String) al.get(4);

        System.out.println(a +"\n"+b+"\n"+c+"\n"+d+"\n"+s+"\n");

    }
}
