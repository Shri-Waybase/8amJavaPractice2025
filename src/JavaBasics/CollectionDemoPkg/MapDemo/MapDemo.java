package JavaBasics.CollectionDemoPkg.MapDemo;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {

        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(12,"Shrinivas");
        hm.put(13,"Raghav");
        hm.put(15,"Priya");
        hm.put(23,"Chad");

        System.out.println(hm.size());
        System.out.println(hm);
        hm.put(null,null);
        System.out.println(hm.size());
        System.out.println(hm);
        hm.put(22,"null");
        System.out.println(hm);
        System.out.println(hm.remove(15));
        System.out.println(hm);

    }
}
