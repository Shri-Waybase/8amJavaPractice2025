package JavaBasics.ClassNConstrutors;

class Pen {

    String name;
    String type;
    int number;

    public void write()
    {
        System.out.println(this.name);
        System.out.println(this.type);
        System.out.println(this.number);
    }
}

public class PenDemo{
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.name="pointpen";
        p1.number=123;
        p1.type="Blue";

        p1.write();
    }
}

