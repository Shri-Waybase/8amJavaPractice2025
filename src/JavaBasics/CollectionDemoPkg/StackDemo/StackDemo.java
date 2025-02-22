package JavaBasics.CollectionDemoPkg.StackDemo;

import java.util.Iterator;
import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {
        Stack s = new Stack();

        s.push("Sachin");
        s.push(454);
        s.add("Sagar");
        s.addElement("Mahesh");;
        s.push("Rajesh");
        s.add(90);
        System.out.println("stack: "+s);
        s.pop();
        System.out.println(s.size());
        System.out.println(s.capacity());
        System.out.println(s);
        System.out.println(s.peek());
        Iterator itr = s.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }

        System.out.println(s.search("Rajesh"));
        System.out.println(s.search("Mahesh"));
    }
}
