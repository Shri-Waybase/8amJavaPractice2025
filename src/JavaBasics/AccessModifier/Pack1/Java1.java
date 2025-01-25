package JavaBasics.AccessModifier.Pack1;

public class Java1 {
    public int a ;
    public double d;
    public char c;
    public String str ;
    private boolean b= true;

    public Java1(){}

   public void display()
    {
        System.out.println(a);
        System.out.println(d);
        System.out.println(c);
        System.out.println(str);
        System.out.println(b);
    }

    public static void main(String[] args) {
        Java1 j1 = new Java1();
        j1.a=10;
        j1.d=23.80;
        j1.c='C';
        j1.str="Access";

        j1.display();
    }

}
