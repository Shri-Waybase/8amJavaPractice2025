package JavaBasics.Inheritance.SingleInheritance;

public class TestInheritance2 {
    public static void main(String[] args) {

        Programmer p = new Programmer();
        System.out.println(p.proBonus);
        p.displayProBonus();

        System.out.println(p.EmpSal);
        p.displayEmpSal();
    }
}

class Employee
{
    double EmpSal = 1245.023;
    public void displayEmpSal()
    {
        System.out.println("displayEmpSal");
    }
}

class Programmer extends Employee
{
    int proBonus = 7854;
    public void displayProBonus()
    {
        System.out.println("displayProBonus");

    }
}