package JavaBasics.Inheritance.MultiLevelInheritance;

class A
{
    int a=0;

    void displyA()
    {
        System.out.println(" Class A");
    }
}

class B extends A
{
    int b =1;

    void displayB()
    {
        System.out.println(" Class B");
    }
}


class C extends  B
{
    int c=2;

    void displayC()
    {
        System.out.println(" Class C");
    }
}



public class TestInheritance {
    public static void main(String[] args) {
        C cobj = new C();
        System.out.println(cobj.c);
        cobj.displayC();

        System.out.println(cobj.b);
        cobj.displayB();

        System.out.println(cobj.a);
        cobj.displyA();


    }
}
