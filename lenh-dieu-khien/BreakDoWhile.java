public class BreakDoWhile {
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println(i);
            if (i == 5) {
                break; // Thoát khỏi vòng lặp khi i = 5
            }
            i++;
        }while(i < 10);
    }
}
