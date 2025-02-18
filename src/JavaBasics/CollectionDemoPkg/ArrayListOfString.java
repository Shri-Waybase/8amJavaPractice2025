package JavaBasics.CollectionDemoPkg;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListOfString {
    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();
        System.out.println("Size of array list :"+al.size()+"\n"+al);

        al.add("Sachin");
        al.add("Ram");
        al.add("Rajesh");
        al.add("Mira");
        al.add("Payal");
        System.out.println("Size of array list :"+al.size());
        System.out.println("ArrayList : "+al);
        al.add(2,"Prakash");
        System.out.println("ArrayList: "+al.size());
        System.out.println("ArrayList: "+al);

        al.addLast("Last");
        System.out.println("Size :"+al.size());
        System.out.println("ArrayList :"+al);
        al.addFirst("First");
        System.out.println("Size: "+al.size());
        System.out.println("Size: "+al);

        al.remove("Mira");
        System.out.println(al);
        al.remove(3);
        System.out.println(al);

        al.removeLast();
        System.out.println(al);

        al.removeFirst();
        System.out.println(al);

        ArrayList<String> al2 = new ArrayList<>();
        al2.addAll(al);
        System.out.println(al);
        System.out.println(al2);
        al2.addAll(2,al);
        System.out.println(al);
        System.out.println(al2);
    }
}
