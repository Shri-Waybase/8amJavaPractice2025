package JavaBasics.CollectionDemoPkg.SetDemo;

import java.net.Socket;
import java.util.HashSet;

public class SetDemo {

    public static void main(String[] args) {

        HashSet hs = new HashSet();
        System.out.println("Size : "+hs.size());

        hs.add("Sachin");
        hs.add("12");
        hs.add("Science");
        hs.add("78");
        hs.add("A+");
        hs.add("78%");

        System.out.println(hs);
        System.out.println("Size : "+hs.size());

        hs.remove(78);
        System.out.println(hs);
        System.out.println(hs.size());
        System.out.println(hs.add("Sachin"));
        System.out.println(hs);
        System.out.println(hs.remove("A+"));
        System.out.println(hs.size());
        System.out.println(hs);
        hs.add("null");
        System.out.println(hs.size());
        System.out.println(hs);


    }
}
