import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tên của bạn: ");
        String name = scanner.nextLine();

        System.out.print("Nhập tuổi của bạn: ");
        int age = scanner.nextInt();

        System.out.println("Chào " + name + ", bạn " + age + " tuổi.");
        scanner.close();
    }
}
