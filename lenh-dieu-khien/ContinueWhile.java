public class ContinueWhile {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            i++;
            if (i == 3) {
                continue; // Bỏ qua khi i = 3
            }
            System.out.println("Gia tri cua i la: " + i);
        }
    }
}
