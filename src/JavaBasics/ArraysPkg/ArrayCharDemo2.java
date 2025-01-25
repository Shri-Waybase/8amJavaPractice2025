package JavaBasics.ArraysPkg;

public class ArrayCharDemo2 {

  public static void main(String[] args) {
      char[][] chArr = {{'a','b','c'},{'e','f','g'},{'h','i','j'}};

      for(int i=0; i<chArr.length; i++)
      {
          for (int j = 0; j <chArr[i].length; j++)
          {
              System.out.print(chArr[i][j]+ "\t");
          }
          System.out.println();
      }
    }
}
