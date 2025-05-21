public class MangHaiChieu {
    public static void main(String[] args) {
        // Khởi tạo mảng hai chiều
        int[][] matrix = new int[2][2];

        // Gán giá trị cho các phần tử
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[1][0] = 3;
        matrix[1][1] = 4;

        // Hiển thị giá trị của từng phần tử
        System.out.println("Phần tử tại [0][0]: " + matrix[0][0]);
        System.out.println("Phần tử tại [0][1]: " + matrix[0][1]);
        System.out.println("Phần tử tại [1][0]: " + matrix[1][0]);
        System.out.println("Phần tử tại [1][1]: " + matrix[1][1]);

        // Thay đổi giá trị của một phần tử
        matrix[1][1] = 10;
        System.out.println("Phần tử tại [1][1] sau khi thay đổi: " + matrix[1][1]);
    }
}
