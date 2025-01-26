package JavaBasics.StringPkg;

public class StringPoolNnew {
    public static void main(String[] args) {
        //Create a string using literal.
        //Using literal string is created as String = " Literal";
        //if string is created using literal then,
        // compiler will check if similar type of string is available in string pool or not.
        //if it is available  then an object will points to that or refer to it.
        //
        String s = "Literal";

        //Create s string using new keyword.
        //When using new keyword an String object is created then the compiler will always
        //create a new memory on heap or  create a new object regardless
        // of any such string is already  created or is avaialbe.
        String s1 = new String("Literal");

        System.out.println(s);
        System.out.println(s1);

        //It will check if both are pointing to same object or not.
        System.out.println(s==s1);


    }
}
