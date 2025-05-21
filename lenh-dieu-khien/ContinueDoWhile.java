public class ContinueDoWhile {
    public static void main(String[] args) {
        int i = 0;
        do {
            i++;
            if (i == 3) {
                continue; // Bỏ qua khi i = 3
            }
            System.out.println("Gia tri cua i la: " + i);
        } while (i < 5);
    }
}
