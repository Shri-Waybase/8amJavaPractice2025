package JavaBasics.ClassNConstrutors;

public class StudentDemo {
    public static void main(String[] args) {
    Student s1 = new Student();
    s1.age =20;
    s1.std =34;
    s1.name ="rajesh";
        System.out.println(s1.getAge());
        System.out.println(s1.getName());
        System.out.println(s1.getStd());
    }
}

class Student{
    int age;
    String name;
    int std;

    public int getAge(){
        return  this.age;
    }

    public String getName(){
        return this.name;
    }

    public int getStd() {
        return std;
    }
}

