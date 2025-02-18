package JavaBasics.Inheritance.MultiLevelInheritance;

class  Dog
{
    String name = "Dog";
    void DisplayDog()
    {
        System.out.println("DisplayDog");
    }
}

class DogChild extends Dog
{
    String nameC = "Dog Child";
    void displayDogchild()
    {
        System.out.println("displayDogChild");
    }
}

class Puppy extends DogChild
{
    String nameP = "Puppy name";
    void DisplayPuppy(){
        System.out.println("DisplayPuppy");
    }
}

public class TestInheritance2 {
    public static void main(String[] args) {
        Puppy p = new Puppy();
        System.out.println(p.nameP);
        p.DisplayPuppy();

        System.out.println(p.nameC);
        p.displayDogchild();

        System.out.println(p.name);
        p.DisplayDog();

        DogChild dc = new DogChild();
        System.out.println(dc.nameC);
        dc.displayDogchild();

        System.out.println(dc.name);
        dc.DisplayDog();
    }
}
