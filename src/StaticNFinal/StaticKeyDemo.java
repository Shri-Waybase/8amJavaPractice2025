package StaticNFinal;

class Student
{
    int rollNo;
    int age;
    String college;

    void display()
    {
        System.out.println("rollNo: "+rollNo+"\n"+ "age: "+age+"\n"+"college: "+college+"\n");
    }
}

public class StaticKeyDemo {
    public static void main(String[] args) {

        Student rajesh = new Student();
        rajesh.age=23;
        rajesh.rollNo=342;
        rajesh.college="AGPIT";

        Student Nilesh = new Student();
        Nilesh.age=24;
        Nilesh.rollNo=453;
        Nilesh.college="AGPIT";

        rajesh.display();
        Nilesh.display();
    }
}
