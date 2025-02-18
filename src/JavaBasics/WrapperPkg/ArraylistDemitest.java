package JavaBasics.WrapperPkg;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistDemitest {
    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();
        al.add("Shrinivas");
        al.add("Raja");
        al.add("Sukumar");
        al.add("umesh");
        al.add("raghav");
        al.add("saniya");

        System.out.println(al.size());

        System.out.println(al);
        System.out.println("- - - - - ");

        for (int i =0; i <al.size();i++)
        {
            System.out.println(al.get(i));
        }

        System.out.println(" - - - -");

        for(String s : al)
        {
            System.out.println(s);
        }
        System.out.println(al.add("Waybase"));
        System.out.println(al.size());
        System.out.println(al.remove("Raja"));
        System.out.println(al.remove(3));
        System.out.println(al.size());

        System.out.println("-- Print using iterator---");
        Iterator itr = al.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }

    }
}
