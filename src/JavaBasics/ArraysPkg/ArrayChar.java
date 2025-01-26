package JavaBasics.ArraysPkg;

public class ArrayChar {
    public static void main(String[] args) {

        char [] ch = new char[5];
        ch[0]='a';
        ch[1]='b';
        ch[2]='3';
        ch[3]='s';
        ch[4]='Z';

        //System.out.println(ch[0]);

        for(int i=0; i <ch.length;i++)
        {
            System.out.println(ch[i]);
        }
    }
}
