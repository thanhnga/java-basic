public class BreakWhile {
    public static void main(String[] args) {
        int i = 0;
        while(i < 10) {
            System.out.println(i);
            if (i == 5) {
                break; // Thoát khỏi vòng lặp khi i = 5
            }
            i++;
        }
    }
}
