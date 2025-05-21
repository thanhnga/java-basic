public class LongClass {
    public static void main(String[] args) {
        // 1. Tạo đối tượng Long từ giá trị long
        long value = 100000L;
        Long longObject = Long.valueOf(value);
        System.out.println("Long Object: " + longObject);

        // 2. Chuyển đổi chuỗi sang kiểu Long
        String longString = "2000000000";
        Long longFromString = Long.valueOf(longString);
        System.out.println("Long from String: " + longFromString);

        // 3. Lấy giá trị nguyên thủy từ Long
        long primitiveValue = longObject.longValue();
        System.out.println("Primitive long value: " + primitiveValue);

        // 4. So sánh các giá trị Long
        Long l1 = 500000L;
        Long l2 = 1000000L;
        int comparison = l1.compareTo(l2);
        System.out.println("Comparison result (l1 vs l2): " + (comparison < 0 ? "l1 < l2" : comparison > 0 ? "l1 > l2" : "l1 == l2"));

        // 5. Chuyển đổi Long sang kiểu số khác
        int intValue = longObject.intValue();
        double doubleValue = longObject.doubleValue();
        System.out.println("Integer value: " + intValue);
        System.out.println("Double value: " + doubleValue);

        // 6. Giá trị tối đa và tối thiểu của Long
        System.out.println("Maximum long value: " + Long.MAX_VALUE);
        System.out.println("Minimum long value: " + Long.MIN_VALUE);

        // 7. Chuyển đổi chuỗi sang long với parseLong()
        long parsedValue = Long.parseLong("-5000000");
        System.out.println("Parsed long value: " + parsedValue);

        // 8. Chuyển long thành chuỗi bằng toString
        String longAsString = Long.toString(value);
        System.out.println("Long as String: " + longAsString);

        // 9. Kiểm tra giá trị Long bằng equals
        Long l3 = 100000L;
        if (longObject.equals(l3)) {
            System.out.println("longObject is equal to l3.");
        } else {
            System.out.println("longObject is not equal to l3.");
        }

        // 10. Kiểm tra NaN (Not-a-Number) – Long không có NaN như Float hoặc Double, nhưng có thể kiểm tra infinity
        System.out.println("Long does not have NaN or Infinity checks.");

        // 11. Kiểm tra giá trị vô hạn (Infinity) – Long không có Infinity như Float hoặc Double
        System.out.println("Long does not have Infinity values.");
        
        // 12. Chuyển đổi long sang mã nhị phân
        String binaryString = Long.toBinaryString(value);
        System.out.println("Binary representation of " + value + ": " + binaryString);

        // 13. Chuyển đổi long sang mã thập lục phân (hexadecimal)
        String hexString = Long.toHexString(value);
        System.out.println("Hexadecimal representation of " + value + ": " + hexString);

        // 14. Chuyển đổi long sang mã bát phân (octal)
        String octalString = Long.toOctalString(value);
        System.out.println("Octal representation of " + value + ": " + octalString);
    }
}
