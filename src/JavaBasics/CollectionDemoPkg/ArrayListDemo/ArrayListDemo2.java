package JavaBasics.CollectionDemoPkg.ArrayListDemo;

import java.util.ArrayList;

class Book
{
    int bNumber;
    String bName,bAuther,bPublisher;

    Book(int number, String auther,String name,String publisher)
    {
        this.bAuther=auther;
        this.bName=name;
        this.bPublisher=publisher;
        this.bNumber=number;
    }


}

public class ArrayListDemo2 {
    public static void main(String[] args) {

        //Createa an object of Book
        Book book = new Book(12,"Mical","Shri","Xysgz");
        Book book1 = new Book(124,"raj","meera","Xysgsdz");
        Book book2 = new Book(125,"seema","punit","Xysgz");
        Book book3 = new Book(123,"kariya","waykar","dfgfsf");
        Book book4 = new Book(122,"sushan","marim","sgsd");


        ArrayList<Book> alb = new ArrayList<>();
        alb.add(book);
        alb.add(book1);
        alb.add(book2);
        alb.add(book3);
        alb.add(book4);

        for(int i=0; i< alb.size();i++)
        {
            System.out.println(alb.get(i));
        }
    }
}
