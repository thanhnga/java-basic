public class BreakLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if (i == 5) {
                break; // Thoát khỏi vòng lặp khi i = 5
            }
        }
    }
}
