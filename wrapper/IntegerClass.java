public class IntegerClass {
    public static void main(String[] args) {
        // 1. Tạo đối tượng Integer từ giá trị int
        int value = 500;
        Integer intObject = Integer.valueOf(value);
        System.out.println("Integer Object: " + intObject);

        // 2. Chuyển đổi chuỗi sang kiểu Integer
        String intString = "1000";
        Integer intFromString = Integer.valueOf(intString);
        System.out.println("Integer from String: " + intFromString);


        // 3. Lấy giá trị nguyên thủy từ Integer
        int primitiveValue = intObject.intValue();
        System.out.println("Primitive int value: " + primitiveValue);

        // 4. So sánh các giá trị Integer
        Integer i1 = 1500;
        Integer i2 = 3000;
        int comparison = i1.compareTo(i2);
        System.out.println("Comparison result (i1 vs i2): " + (comparison < 0 ? "i1 < i2" : comparison > 0 ? "i1 > i2" : "i1 == i2"));

        // 5. Chuyển đổi Integer sang kiểu số khác
        double doubleValue = intObject.doubleValue();
        long longValue = intObject.longValue();
        System.out.println("Double value: " + doubleValue);
        System.out.println("Long value: " + longValue);

        // 6. Giá trị tối đa và tối thiểu của Integer
        System.out.println("Maximum int value: " + Integer.MAX_VALUE);
        System.out.println("Minimum int value: " + Integer.MIN_VALUE);

        // 7. Chuyển đổi chuỗi sang int với parseInt()
        int parsedValue = Integer.parseInt("-2500");
        System.out.println("Parsed int value: " + parsedValue);

        // 8. Chuyển int thành chuỗi bằng toString
        String intAsString = Integer.toString(value);
        System.out.println("Integer as String: " + intAsString);

        // 9. Kiểm tra giá trị Integer bằng equals
        Integer i3 = 500;
        if (intObject.equals(i3)) {
            System.out.println("intObject is equal to i3.");
        } else {
            System.out.println("intObject is not equal to i3.");
        }

        // 10. Chuyển đổi int sang mã nhị phân
        String binaryString = Integer.toBinaryString(value);
        System.out.println("Binary representation of " + value + ": " + binaryString);

        // 11. Chuyển đổi int sang mã thập lục phân (hexadecimal)
        String hexString = Integer.toHexString(value);
        System.out.println("Hexadecimal representation of " + value + ": " + hexString);

        // 12. Chuyển đổi int sang mã bát phân (octal)
        String octalString = Integer.toOctalString(value);
        System.out.println("Octal representation of " + value + ": " + octalString);
    }
}
