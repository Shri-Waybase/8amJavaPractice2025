package JavaBasics.CollectionDemoPkg.LinkedListDemo;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {

        LinkedList <Integer> ll = new LinkedList<>();
        ll.add(12);
        ll.add(45);
        ll.add(36);
        ll.add(36);
        ll.add(56);
        ll.add(89);
        System.out.println(ll.size());
        System.out.println(ll);
        ll.add(2,20);
        System.out.println(ll.size());
        System.out.println(ll);
        Integer i = ll.get(3);
        System.out.println(i);
        ll.addFirst(11);
        System.out.println(ll);
        ll.addLast(99);
        System.out.println(ll);
        ll.removeFirstOccurrence(36);
        System.out.println(ll);
        ll.removeLastOccurrence(36);
        System.out.println(ll);

        ll.peek();
        System.out.println(ll);
        ll.pop();
        System.out.println(ll);
    }
}
