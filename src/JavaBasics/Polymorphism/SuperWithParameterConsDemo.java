package JavaBasics.Polymorphism;

class  Geometry{

    String name ;
    int marks ;

    Geometry(String arg1, int afr2)
    {
        this.marks=afr2;
        this.name=arg1;

    }
    public void display()
    {

        System.out.println("Super"+name);
        System.out.println("Super"+marks);
    }
}

class  Shape extends Geometry
{
    String name;
    int marks;

    Shape(String name, int marks)
    {
        super(name,marks);
        this.name=name;
        this.marks=marks;
    }

    public void display()
    {

        System.out.println("Child" +name);
        System.out.println("Child" +marks);
    }
}

public class SuperWithParameterConsDemo {
    public static void main(String[] args) {
    Shape shape = new Shape("Figure",50);

    shape.display();
    }
}
