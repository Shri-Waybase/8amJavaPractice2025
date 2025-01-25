package JavaBasics.ControlStructure;

public class IfelseDemo {
    public static void main(String[] args) {
        int marks = 78;
        if (marks <= 1 && marks > 100)
            if (marks < 40)
                System.out.println("Fail");
            if (marks >= 40 && marks < 50)
                System.out.println("Pass");
            if (marks >= 50 && marks < 60)
                System.out.println("Second class");
            if (marks >= 60 && marks < 70)
                System.out.println("First class");
            if (marks >= 70 && marks <= 100)
                System.out.println("Distinction");
        System.out.println("Enter valid marks");
    }
}
