// import gói java.util để sử dụng class Arrays
import java.util.Arrays;

public class ArraysClass {
    public static void main(String[] args) {
        int[] arr = {4, 2, 1, 5, 3};

        String[] strs = {"B", "A", "C"};
        Arrays.sort(strs);
        System.out.println("Sorted array: " + Arrays.toString(strs));

        // Sắp xếp mảng
        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));

        // Tìm kiếm phần tử 5
        int index = Arrays.binarySearch(arr, 5);
        System.out.println("Index of 5: " + index);

        // So sánh hai mảng
        int[] arr2 = {1, 2, 3, 4, 5};
        boolean isEqual = Arrays.equals(arr, arr2);
        System.out.println("Arrays are equal: " + isEqual);

        // Điền giá trị 10 vào tất cả phần tử trong mảng
        int[] filledArray = new int[5];
        Arrays.fill(filledArray, 10);
        System.out.println("Filled array: " + Arrays.toString(filledArray));

        // Sao chép mảng
        int[] copiedArray = Arrays.copyOf(arr, 3);
        System.out.println("Copied array: " + Arrays.toString(copiedArray));

    }
}
