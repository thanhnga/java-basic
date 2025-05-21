public class IfNested {
    public static void main(String[] args) {
        int age = 20;
        int height = 180;

        if (age >= 18) {
            if (height >= 160) {
                System.out.println("Bạn đủ điều kiện để tham gia trò chơi.");
            } else {
                System.out.println("Bạn không đủ chiều cao để tham gia trò chơi.");
            }
        } else {
            System.out.println("Bạn chưa đủ tuổi để tham gia trò chơi.");
        }

    }
}