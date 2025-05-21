import java.util.Scanner;

public class SannerMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // Hiển thị menu
            System.out.println("\n=== Menu ===");
            System.out.println("1. Tùy chọn 1");
            System.out.println("2. Tùy chọn 2");
            System.out.println("3. Tùy chọn 3");
            System.out.println("4. Thoát");

            // Yêu cầu người dùng nhập lựa chọn
            System.out.print("Nhập lựa chọn của bạn (1-4): ");
            while (!scanner.hasNextInt()) { // Kiểm tra nhập sai kiểu dữ liệu
                System.out.print("Vui lòng nhập một số từ 1 đến 4: ");
                scanner.next(); // Bỏ qua dữ liệu không hợp lệ
            }
            choice = scanner.nextInt();

            // Xử lý lựa chọn và in ra kết quả
            switch (choice) {
                case 1:
                    System.out.println("Bạn đã chọn Tùy chọn 1");
                    break;
                case 2:
                    System.out.println("Bạn đã chọn Tùy chọn 2");
                    break;
                case 3:
                    System.out.println("Bạn đã chọn Tùy chọn 3");
                    break;
                case 4:
                    System.out.println("Thoát chương trình. Tạm biệt!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn từ 1 đến 4.");
            }
        } while (choice != 4); // Lặp lại cho đến khi người dùng chọn "Thoát"

        scanner.close();
    }
}
