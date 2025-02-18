package JavaBasics.CollectionDemoPkg;

import java.util.LinkedList;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {

        Vector <String > v = new Vector<>();
        System.out.println("Size: "+v.size());
        System.out.println("Capacity: "+v.capacity());

        v.add("mike ");
        v.add(" Wase");
        v.add("Maya ");
        v.add(" Chamay");
        v.add(" swikrty");
        v.add("scrity ");

        System.out.println("Size: "+v.size());
        System.out.println("Capacity: "+v.capacity());
        v.add("Kumar ");
        v.add("Lakhan");
        v.add("Swaastik");
        v.add("Kujria");
        v.add("Raj");
        System.out.println("Size: "+v.size());
        System.out.println("Capacity: "+v.capacity());
        v.add("Kumar ");
        v.add("Lakhan");
        v.add("Swaastik");
        v.add("Kujria");
        v.add("Raj"); v.add("Kumar ");
        v.add("Lakhan");
        v.add("Swaastik");
        v.add("Kujria");
        v.add("Raj");
        v.add("Kumar ");
        v.add("Lakhan");
        v.add("Swaastik");
        v.add("Kujria");
        v.add("Raj");
        System.out.println("Size: "+v.size());
        System.out.println("Capacity: "+v.capacity());
        v.set(2,"WWWW");
        System.out.println(v);

    }


}
