public class MangMotChieu {
    public static void main(String[] args) {
        // Khởi tạo mảng một chiều
        int[] array = new int[3];

        // Gán giá trị cho các phần tử
        array[0] = 10;
        array[1] = 20;
        array[2] = 30;

        // Hiển thị giá trị của các phần tử
        System.out.println("Phần tử thứ 1: " + array[0]);
        System.out.println("Phần tử thứ 2: " + array[1]);
        System.out.println("Phần tử thứ 3: " + array[2]);

        // Thay đổi giá trị của một phần tử
        array[1] = 50;
        System.out.println("Phần tử thứ 2 sau khi thay đổi: " + array[1]);
    }
}
