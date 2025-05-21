public class ByteClass {
    public static void main(String[] args) {
        // 1. Tạo đối tượng Byte từ giá trị byte
        byte value = 10;
        Byte byteObject = Byte.valueOf(value);
        System.out.println("Byte Object: " + byteObject);

        // 2. Chuyển đổi chuỗi sang kiểu Byte
        String byteString = "25";
        Byte byteFromString = Byte.valueOf(byteString);
        System.out.println("Byte from String: " + byteFromString);

        // 3. Lấy giá trị nguyên thủy từ Byte
        byte primitiveValue = byteObject.byteValue();
        System.out.println("Primitive byte value: " + primitiveValue);

        // 4. So sánh các giá trị Byte
        Byte b1 = 10;
        Byte b2 = 20;
        int comparison = b1.compareTo(b2);
        System.out.println("Comparison result (b1 vs b2): " + (comparison < 0 ? "b1 < b2" : comparison > 0 ? "b1 > b2" : "b1 == b2"));

        // 5. Chuyển đổi Byte sang kiểu số khác
        int intValue = byteObject.intValue();
        double doubleValue = byteObject.doubleValue();
        System.out.println("Integer value: " + intValue);
        System.out.println("Double value: " + doubleValue);

        // 6. Giá trị tối đa và tối thiểu của Byte
        System.out.println("Minimum byte value: " + Byte.MIN_VALUE);
        System.out.println("Maximum byte value: " + Byte.MAX_VALUE);

        // 7. Chuyển đổi chuỗi sang byte với parseByte()
        byte parsedValue = Byte.parseByte("-12");
        System.out.println("Parsed byte value: " + parsedValue);

        // 8. Chuyển byte thành chuỗi bằng toString
        String byteAsString = Byte.toString(value);
        System.out.println("Byte as String: " + byteAsString);

        // 9. Kiểm tra giá trị Byte bằng equals
        Byte b3 = 10;
        if (byteObject.equals(b3)) {
            System.out.println("byteObject is equal to b3.");
        } else {
            System.out.println("byteObject is not equal to b3.");
        }

        // 10. Chuyển đổi byte sang mã nhị phân
        String binaryString = Integer.toBinaryString(Byte.toUnsignedInt(value));
        System.out.println("Binary representation of " + value + ": " + binaryString);
    }
}
