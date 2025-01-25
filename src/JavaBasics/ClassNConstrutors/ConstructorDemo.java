package JavaBasics.ClassNConstrutors;

public class ConstructorDemo {
    public static void main(String[] args) {
        PenDemo2 pd2 = new PenDemo2();
        pd2.printDetails();
    }
}

class PenDemo2{

    String name;
    String color;
    int number;

    PenDemo2(){
        System.out.println("constructor is colled.");
    }

    public void printDetails()
    {
        System.out.println(this.name);
        System.out.println(this.color);
        System.out.println(this.number);
    }
}
