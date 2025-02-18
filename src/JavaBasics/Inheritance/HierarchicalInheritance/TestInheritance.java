package JavaBasics.Inheritance.HierarchicalInheritance;


class Animal
{
    void eat()
    {
        System.out.println("Animal Eat");
    }
}

class Mammels extends Animal
{
    void walk()
    {
        System.out.println("Mammels walks");
    }
}

class Reptiles extends  Animal
{
    void crawl()
    {
        System.out.println("Reptiles crawl");
    }
}

class Amphibians extends Animal
{
    void swim()
    {
        System.out.println("Amphibians Swim");
    }
}


class Bird extends Animal
{
    void fly()
    {
        System.out.println("Birds fly");
    }
}


class Sparrwo extends Bird
{
    void sound()
    {
        System.out.println("Sparrow Chirp");
    }
}
public class TestInheritance {
    public static void main(String[] args) {

        System.out.println("--Mammels Object--");
        Mammels mammels = new Mammels();
        mammels.walk();
        mammels.eat();

        System.out.println("--Reptiles Object--");
        Reptiles  reptiles = new Reptiles();
        reptiles.crawl();
        reptiles.eat();

        System.out.println("--Amphibians Object--");
        Amphibians amphibians  = new Amphibians();
        amphibians.swim();
        amphibians.eat();

        System.out.println("--Bird Object--");
        Bird bird = new Bird();
        bird.fly();
        bird.eat();

        System.out.println("--Sparrow Object--");
        Sparrwo sparrwo = new Sparrwo();
        sparrwo.sound();
        sparrwo.fly();
        sparrwo.eat();

    }
}
