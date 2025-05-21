public class Debug {
    /*
     * Danh sách phím tắt: File > Preferences > Keyboard Shortcuts
     * F5	Start Debugging: Bắt đầu hoặc tiếp tục debug chương trình.
     * Shift + F5	Stop Debugging: Dừng phiên debug hiện tại.
     * F10	Step Over: Chuyển qua dòng code hiện tại, không đi vào hàm.
     * F11	Step Into: Đi vào chi tiết của hàm hoặc phương thức được gọi.
     * Shift + F11	Step Out: Thoát khỏi hàm hiện tại và quay lại nơi nó được gọi.
     */

    public static void main(String[] args) {
        System.out.println("Chương trình bắt đầu!");

        int a = 10;
        int b = 10;

        // Gọi hàm sum
        int result = sum(a, b);

        // In kết quả
        System.out.println("Tổng của " + a + " và " + b + " là: " + result);
    }

    // Hàm tính tổng hai số
    public static int sum(int x, int y) {
        return x + y;
    }
}
