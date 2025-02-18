package JavaBasics.Polymorphism;


class Amphibians
{
    /*String name = " I am an amphibians.";
    int age = 300;*/

    Amphibians() {
        System.out.println("I am an Amphibians.");
    }
}

class  Fish extends Amphibians
{

    Fish()
    {
        super();
        System.out.println(" I am a Fish.");
    }
}
public class SuperConstrutorDemo {
    public static void main(String[] args) {
        Fish fish = new Fish();

    }
}
