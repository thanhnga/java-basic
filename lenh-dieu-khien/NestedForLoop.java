public class NestedForLoop {
    public static void main(String[] args) {
        // Một mảng hai chiều đơn giản
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        // Duyệt qua từng hàng
        for (int i = 0; i < array.length; i++) {
            // Duyệt qua từng phần tử trong hàng đó
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            // In xuống dòng sau khi duyệt xong mỗi hàng
            System.out.println();
        }
    }
}
