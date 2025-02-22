package JavaBasics.CollectionDemoPkg.SetDemo;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(12);
        ts.add(23);
      //  ts.add("Priya");
      //  ts.add("Raja");
      //  ts.add('c');
        ts.add(5);
        System.out.println(ts);
        System.out.println(ts.size());
        ts.add(34);
        ts.add(55);
        System.out.println(ts);
        System.out.println(ts.size());
        System.out.println(ts.ceiling(22));


    }
}
