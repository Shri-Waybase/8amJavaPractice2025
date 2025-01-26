package JavaBasics.StringPkg;

import java.util.StringJoiner;

public class StringConcatAppend {
    public static void main(String[] args) {

        //1. Concantinate Strins using + {plus} operator./method 1
        String str1 = "Indian";
        String str2 = new String("Republic");
        String str3 = str1 +" " + str2;
        System.out.println(str3);

        //2. Concatinate string usig method 2 , concat method.// method 2.

        String str4 = "Sachin";
        String str5 = " Tendulkar";
        String str6 = str4.concat(str5);
        System.out.println(str6);

        //3. Concatinate string using .append method of
        // StringBuilder  & String Buffer class.
        StringBuffer sb1 = new StringBuffer("Pacific ");
        StringBuffer sb2 = new StringBuffer("Ocean");
        sb1 = sb1.append(sb2);
        System.out.println(sb1);

        StringBuilder stringBuilder = new StringBuilder("Indian");
        StringBuilder stringBuilder1 = new StringBuilder(" Ocean");
        stringBuilder = stringBuilder.append(stringBuilder1);
        System.out.println(stringBuilder);

        //4. Concaniate strinfg using the .format method of string class.
        // (String.format())
        String s = String.format("%s%s", "rabbit"," tortoise");
        System.out.println(s);

       /* //5.Concatinate the string sing StringJoiner.

        StringJoiner sj1 = new StringJoiner();
        StringJoiner sj2 = new StringJoiner(2);
        sj1.add("Akash");
        sj2.add("mehata");
        System.out.println(sj1);
*/



    }
}
