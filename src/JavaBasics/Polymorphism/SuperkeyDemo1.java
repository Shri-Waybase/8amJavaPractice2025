package JavaBasics.Polymorphism;


class Bird
{
    String name = "I am a Bird.";

}

class Sparrow extends  Bird {
    String name = "I am a Sparrow";

    public void display() {
        System.out.println(name);
        System.out.println(super.name);
    }
}
public class SuperkeyDemo1 {
    public static void main(String[] args) {

        Sparrow sparrow = new Sparrow();
        sparrow.display();
    }
}
