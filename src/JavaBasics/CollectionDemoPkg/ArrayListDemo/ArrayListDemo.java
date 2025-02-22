package JavaBasics.CollectionDemoPkg.ArrayListDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList al = new ArrayList();

        al.add("Shrinivas");
        al.add(12);
        al.add(23.67);
        al.add("F");
        al.add("Saniya");
        al.add("Mayur");
        al.add("23");
        al.add(123.0215452);
        System.out.println(al);

        System.out.println(al.size());

        System.out.println(al.add(45));
        System.out.println(al+"\n"+al.size());
        al.add(5,"Data");
        System.out.println(al+"\n"+al.size());
        al.addFirst(00);
        System.out.println(al+"\n"+al.size());

        al.addLast("Umbrella");
        System.out.println(al+"\n"+al.size());

        al.remove(6);
        System.out.println(al+"\n"+al.size());
        al.remove("Mayur");
        System.out.println(al+"\n"+al.size());
        al.removeFirst();
        System.out.println(al+"\n"+al.size());
        al.removeLast();
        System.out.println(al+"\n"+al.size());
        /*Object ob = al.get(5);
        System.out.println(ob);*/
        System.out.println(al.get(5));
        System.out.println(al.getFirst());
        System.out.println(al.getLast());
        System.out.println(al.clone());

        System.out.println("- - Print using ForLoop - -");
        for(int i = 0; i < al.size(); i ++)
        {
            System.out.println(al.get(i));
        }

        System.out.println("- - Print using ForEach Loop - -");

        for (Object obj : al)
        {
            System.out.println(obj);
        }

        System.out.println("- - Print using Iterator --");
        Iterator itr = al.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }

    }
}
