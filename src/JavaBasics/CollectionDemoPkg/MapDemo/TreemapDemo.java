package JavaBasics.CollectionDemoPkg.MapDemo;

import java.util.TreeMap;

public class TreemapDemo {

    public static void main(String[] args) {
        TreeMap <Integer,Integer> tm = new TreeMap<>();
        tm.put(1,1000);
        tm.put(2,2000);
        tm.put(3,3000);
        tm.put(4,4000);
        tm.put(10,5000);
        tm.put(9,6000);
        tm.put(8,7000);
        System.out.println(tm.size());
        System.out.println(tm);
        tm.put(0,0);
        System.out.println(tm);
        System.out.println(tm.comparator());
        System.out.println(tm.reversed());
        System.out.println(tm);
        System.out.println(tm.descendingKeySet());
        System.out.println(tm.lastKey());
        System.out.println(tm.firstKey());
        System.out.println(tm.descendingMap());
    }
}
