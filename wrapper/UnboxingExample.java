public class UnboxingExample {
    public static void main(String[] args) {
        Integer a = 10; // Autoboxing
        int b = a; // Unboxing: Biến a có kiểu Integer, nhưng khi gán vào b (kiểu int), Java tự động gọi a.intValue() để lấy giá trị nguyên thủy.

        System.out.println("b: " + b);
    }
}
