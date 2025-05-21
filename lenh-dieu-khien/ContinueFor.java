public class ContinueFor {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                continue; // Bỏ qua khi i = 2
            }
            System.out.println("Gia tri cua i la: " + i);
        }
    }
}
