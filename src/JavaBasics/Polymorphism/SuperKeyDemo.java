package JavaBasics.Polymorphism;

class  Animal
{
    String name = "I am an Animal.";

}
class Dog extends  Animal
{
    String name= "I am a Dog.";

}

public class SuperKeyDemo {
    public static void main(String[] args) {

        Dog dog = new Dog();
        System.out.println(dog.name);
        System.out.println(dog.name);
    }
}
