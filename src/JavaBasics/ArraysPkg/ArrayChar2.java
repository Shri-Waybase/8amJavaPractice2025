package JavaBasics.ArraysPkg;

public class ArrayChar2 {
    public static void main(String[] args) {

        char [] ch = new char[5];
        ch[0]='a';
        ch[1]='b';
        ch[2]='3';
        ch[3]='s';
        ch[4]='Z';

        //System.out.println(ch[0]);

        for(char c : ch){
            System.out.println(c);
        }
    }
}
