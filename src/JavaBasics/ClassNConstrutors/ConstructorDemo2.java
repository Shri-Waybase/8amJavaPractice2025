package JavaBasics.ClassNConstrutors;

public class ConstructorDemo2 {
    public static void main(String[] args) {
        PenDemo3 pd3 = new PenDemo3("Tata","Blue",234);
        /*pd3.printDetails();*/
        pd3.printDetails();
    }
}
class PenDemo3 {

    String name;
    String color;
    int number;

    PenDemo3(String a, String b, int c){
        this.name=a;
        this.color=b;
        this.number=c;
        System.out.println("constructor is called.");
    }

    public void printDetails()
    {
        System.out.println(this.name);
        System.out.println(this.color);
        System.out.println(this.number);
    }
}

