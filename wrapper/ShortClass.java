public class ShortClass {
    public static void main(String[] args) {
        // 1. Tạo đối tượng Short từ giá trị short
        short value = 100;
        Short shortObject = Short.valueOf(value);
        System.out.println("Short Object: " + shortObject);

        // 2. Chuyển đổi chuỗi sang kiểu Short
        String shortString = "200";
        Short shortFromString = Short.valueOf(shortString);
        System.out.println("Short from String: " + shortFromString);

        // 3. Lấy giá trị nguyên thủy từ Short
        short primitiveValue = shortObject.shortValue();
        System.out.println("Primitive short value: " + primitiveValue);

        // 4. So sánh các giá trị Short
        Short s1 = 150;
        Short s2 = 300;
        int comparison = s1.compareTo(s2);
        System.out.println("Comparison result (s1 vs s2): " + (comparison < 0 ? "s1 < s2" : comparison > 0 ? "s1 > s2" : "s1 == s2"));

        // 5. Chuyển đổi Short sang kiểu số khác
        int intValue = shortObject.intValue();
        double doubleValue = shortObject.doubleValue();
        System.out.println("Integer value: " + intValue);
        System.out.println("Double value: " + doubleValue);

        // 6. Giá trị tối đa và tối thiểu của Short
        System.out.println("Maximum short value: " + Short.MAX_VALUE);
        System.out.println("Minimum short value: " + Short.MIN_VALUE);

        // 7. Chuyển đổi chuỗi sang short với parseShort()
        short parsedValue = Short.parseShort("-32000");
        System.out.println("Parsed short value: " + parsedValue);

        // 8. Chuyển short thành chuỗi bằng toString
        String shortAsString = Short.toString(value);
        System.out.println("Short as String: " + shortAsString);

        // 9. Kiểm tra giá trị Short bằng equals
        Short s3 = 100;
        if (shortObject.equals(s3)) {
            System.out.println("shortObject is equal to s3.");
        } else {
            System.out.println("shortObject is not equal to s3.");
        }

        // 10. Chuyển đổi short sang mã nhị phân
        String binaryString = Integer.toBinaryString(Short.toUnsignedInt(value));
        System.out.println("Binary representation of " + value + ": " + binaryString);
    }
}
