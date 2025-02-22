package JavaBasics.CollectionDemoPkg.SetDemo;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {

        LinkedHashSet lhs = new LinkedHashSet();
        lhs.add("Ram");
        lhs.add("Lakhan");
        lhs.add("Meera");
        lhs.add("Param");
        lhs.add("Prity");
        lhs.add("Vinay");
        System.out.println(lhs.size());
        System.out.println(lhs);

        lhs.add(12);
        lhs.add("null");
        System.out.println(lhs.size());
        System.out.println(lhs);
        lhs.addLast(101);
        System.out.println(lhs);
        lhs.addFirst(1.00);
        System.out.println(lhs);
        System.out.println(lhs.contains("Meera"));
        System.out.println(lhs.getFirst());
        System.out.println(lhs.getLast());
        System.out.println(lhs.removeFirst());
        System.out.println(lhs);
        System.out.println(lhs.removeLast());
        System.out.println(lhs.remove("Vinay"));
        System.out.println(lhs);
        System.out.println(lhs.reversed());
        System.out.println(lhs);
    }

}
