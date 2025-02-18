package JavaBasics.Inheritance.SingleInheritance;

class Parent{
    int salaryP = 30000;

    public void parentSal()
    {
        System.out.println("parentSal ");
    }
}

class Child extends Parent {
    int salaryCh = 15000;

    public void childSal()
    {
        System.out.println("childSal ");
    }
}

public class TestInheritance {
    public static void main(String[] args) {

        Child c = new Child();
        System.out.println("Chile salary"+ c.salaryCh);
        System.out.println("Parent salary"+ c.salaryP);
    }
}
