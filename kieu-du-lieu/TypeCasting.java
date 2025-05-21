public class TypeCasting {
   public static void main(String[] args) {
      int i = 10;
      double d = 2.5;
      //int sum = i + d;
      //int sum = i + (int)d;
      int sum = (int)(i + d);
      System.out.println("sum:" + sum);
   }
}