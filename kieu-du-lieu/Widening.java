public class Widening {
     public static void main(String[] args) {
          int i = 100;
          System.out.println("int: " + i);

          long l = i;    // không yêu cầu chỉ định ép kiểu
          System.out.println("long: " + l);

          float f = l;   // không yêu cầu chỉ định ép kiểu
          System.out.println("float:  " + f);

     }
}