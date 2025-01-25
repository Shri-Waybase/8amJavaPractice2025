package JavaBasics.ControlStructure;

public class SwitchCaseDemo2 {
    public static void main(String[] args) {
        int operation = 3;

        switch(operation){
            case 1 :
                System.out.println("Addition");
                break;
            case 2:
                System.out.println("Substraction");
                break;
            case 3:
                System.out.println("Mulitplication");
                break;
            case 4:
                System.out.println("Division");
                break;
            case 5:
                System.out.println("Modulous");
                break;
            default:
                System.out.println("Invalid choice.");

        }
    }
}
