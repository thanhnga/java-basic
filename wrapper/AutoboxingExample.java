public class AutoboxingExample {
    public static void main(String[] args) {
        
        // Autoboxing: Chuyển đổi từ kiểu nguyên thủy (int) sang lớp bao bọc (Integer)
        Integer a = 100; // Java tự động chuyển 100 (int) thành Integer.valueOf(100)

        // Autoboxing với phép tính toán
        Integer b = 20;
        Integer sum = a + b; // Java tự động unboxing a và b thành int, thực hiện phép cộng và autoboxing kết quả

        // In kết quả
        System.out.println("a = " + a);  // Kết quả: a = 100
        System.out.println("b = " + b);  // Kết quả: b = 20
        System.out.println("Sum = " + sum); // Kết quả: Tổng = 120
    }
}
