package JavaBasics.ClassNConstrutors;

public class CarDemo {
    public static void main(String[] args) {
        Car c1 = new Car();
        /*c1.color="Orange";
        c1.number= 23;
        c1.name ="Scoda";
        c1.peddles =5;*//**/

        c1.getName("Tata");
        c1.getNumber(23453);
        c1.setPeddles(6);
        c1.setColor("Yellow");

    }

}

class Car{

    String name;
    int number;
    int peddles;
    String color;
    void getName(String name){
        System.out.println(this.name=name);
    }

    void getNumber(int carnum){
        System.out.println( this.number=carnum);
    }

    void setColor(String color){
        System.out.println(this.color=color);
    }

    public void setPeddles(int peddles) {
        System.out.println(this.peddles = peddles);
    }
}