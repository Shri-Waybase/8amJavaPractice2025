package JavaBasics.ArraysPkg;

public class ArrayChar4 {
    public static void main(String[] args) {

       char [] ch = new char[]{'a','g','r','i','p','x'};

       int len= ch.length;

        System.out.println("length of array : "+len);

        for(char ch1 : ch){

            System.out.print(ch1+ " ");
        }
        System.out.println();

        for(int i=0; i < len; i++)
        {
            if(ch[i]=='a'||ch[i]=='e'||ch[i]=='o'||ch[i]=='i'||ch[i]=='u')
            {
                System.out.println("vowels : "+ ch[i]+" ");
            }
            else
            {
                System.out.println("consonents : "+ch[i]+" ");
            }
        }
        System.out.println();
    }
}
