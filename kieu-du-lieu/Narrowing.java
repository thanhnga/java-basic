public class Narrowing {
     public static void main(String[] args) {
          double d = 100.04;
          System.out.println("double: " + d);

          long l = (long) d; // yêu cầu chỉ định kiểu dữ liệu (long)
          System.out.println("long: " + l);

          int i = (int) l; // yêu cầu chỉ định kiểu dữ liệu (int)
          System.out.println("int:  " + i);
     }
}
