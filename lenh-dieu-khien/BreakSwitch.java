public class BreakSwitch {
    public static void main(String[] args) {
        int choice = 2;
        switch (choice) {
            case 1:
                System.out.println("Case 1");
                break;// Thoát khỏi switch-case statement sau khi thực hiện case 1
            case 2:
                System.out.println("Case 2");
                break; // Thoát khỏi switch-case statement sau khi thực hiện case 2
            default:
                System.out.println("Default case");
        }
    }
}
