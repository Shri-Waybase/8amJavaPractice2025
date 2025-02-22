package JavaBasics.CollectionDemoPkg.QueueDemo;

import java.util.PriorityQueue;

public class PriorityQDemo {
    public static void main(String[] args) {
        PriorityQueue <String> pq = new PriorityQueue<>();
        pq.offer("Raja");
        pq.add("Maza");
        pq.offer("Yown");
        pq.offer("kapur");

        System.out.println(pq);
        pq.offer("Rohan");
        System.out.println(pq.element());
        System.out.println(pq.size());
        System.out.println(pq);
        System.out.println(pq.comparator());

        pq.poll();
        System.out.println(pq);
        pq.peek();
        System.out.println(pq);
        Boolean b = pq.contains("Raja");
        System.out.println(b);
    }
}

