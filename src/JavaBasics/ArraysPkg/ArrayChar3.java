package JavaBasics.ArraysPkg;

public class ArrayChar3 {
    public static void main(String[] args) {

       char [] ch = new char[]{'a','g','r','i','p','x'};

       int len= ch.length;

        System.out.println(len);

        for(char ch1 : ch){

            System.out.println(ch1);
        }
    }
}
