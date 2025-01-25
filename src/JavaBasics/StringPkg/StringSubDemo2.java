package JavaBasics.StringPkg;

public class StringSubDemo2 {
    public static void main(String[] args) {
        String str = "Lion came on the bank of river to drink water";
        System.out.println("Length of String = "+ str.length());

        System.out.println(str.substring(40));
        System.out.println(str.substring(0,7));
        System.out.println(str.substring(5,30));

        System.out.println(str.substring(0,4)+" "+str.substring(33));
        System.out.println(str.substring(0,4)+" "+ str.substring(10,30));

    }
}
