package JavaBasics.ClassNConstrutors;

public class ParameterConstructor {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.name="elephant";
        a1.color="black";
        a1.age=200;
        a1.display();

        Animal a2 = new Animal("rabbit","white",34);
        a2.display();

        Animal a3 = new Animal(a2);
        a3.display();

    }
}

class Animal{

    String name;
    String color;
    int age;

    Animal(){
        System.out.println("Default constructor is invoked.");
    }

    Animal(String s,String s2, int a){
        this.age=a;
        this.name=s;
        this.color=s2;
        System.out.println("Parameterzed constructor.");
    }

    Animal(Animal obj){
        this.age=obj.age;
        this.color=obj.color;
        this.name= obj.name;
    }

    void display()
    {
        System.out.println(age);
        System.out.println(color);
        System.out.println(name);
    }

}