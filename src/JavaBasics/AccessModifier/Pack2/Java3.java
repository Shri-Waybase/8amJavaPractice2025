package JavaBasics.AccessModifier.Pack2;

import JavaBasics.AccessModifier.Pack1.Java1;

public class Java3 {
    public static void main(String[] args) {

        Java1 j1 = new Java1();
        j1.a=10;
        j1.d=23.80;
        j1.c='C';
        j1.str="Access";

        j1.display();
}
}