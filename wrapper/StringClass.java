public class StringClass {
    public static void main(String[] args) {
        String str = "Hello, Java World!";
        // 1. length() - Độ dài của chuỗi
        int length = str.length();
        System.out.println("Length: " + length);

        // 2. charAt() - Lấy ký tự tại một vị trí nhất định
        char charAtPos = str.charAt(7);
        System.out.println("Character at position 7: " + charAtPos);

        // 3. substring() - Lấy một phần của chuỗi
        String substring = str.substring(7, 11);
        System.out.println("Substring from position 7 to 11: " + substring);

        // 4. contains() - Kiểm tra xem chuỗi có chứa một chuỗi con nhất định không
        boolean containsJava = str.contains("Java");
        System.out.println("Contains 'Java': " + containsJava);

        // 5. replace() - Thay thế các ký tự hoặc chuỗi con
        String replacedStr = str.replace("Java", "C++");
        System.out.println("Replaced string: " + replacedStr);

        // 6. toUpperCase() - Chuyển đổi toàn bộ chuỗi thành chữ hoa
        String upperStr = str.toUpperCase();
        System.out.println("Uppercase string: " + upperStr);

        // 7. toLowerCase() - Chuyển đổi toàn bộ chuỗi thành chữ thường
        String lowerStr = str.toLowerCase();
        System.out.println("Lowercase string: " + lowerStr);

        // 8. trim() - Loại bỏ khoảng trắng ở đầu và cuối chuỗi
        String strWithSpaces = "   Hello, World!   ";
        String trimmedStr = strWithSpaces.trim();
        System.out.println("Trimmed string: '" + trimmedStr + "'");

        // 9. split() - Tách chuỗi thành mảng các chuỗi con
        String[] words = str.split(" ");
        System.out.println("Splitted words:");
        for (String word : words) {
            System.out.println(word);
        }

        // 10. equals() - So sánh nội dung của hai chuỗi
        String str2 = "Hello, Java World!";
        boolean isEqual = str.equals(str2);
        System.out.println("Strings are equal: " + isEqual);
    }
}
