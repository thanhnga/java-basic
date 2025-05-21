public class NestedWhileLoop {
    public static void main(String[] args) {
        int outer = 0;
        while (outer < 3) {
            int inner = 0;
            while (inner < 3) {
                System.out.println("Outer: " + outer + ", Inner: " + inner);
                inner++;
            }
            outer++;
        }
    }
}
