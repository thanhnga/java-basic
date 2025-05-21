public class DoubleClass {
    public static void main(String[] args) {
        // 1. Tạo đối tượng Double từ giá trị double
        double value = 12345.6789;
        Double doubleObject = Double.valueOf(value);
        System.out.println("Double Object: " + doubleObject);

        // 2. Chuyển đổi chuỗi sang kiểu Double
        String doubleString = "98765.4321";
        Double doubleFromString = Double.valueOf(doubleString);
        System.out.println("Double from String: " + doubleFromString);

        // 3. Lấy giá trị nguyên thủy từ Double
        double primitiveValue = doubleObject.doubleValue();
        System.out.println("Primitive double value: " + primitiveValue);

        // 4. So sánh các giá trị Double
        Double d1 = 1234.56;
        Double d2 = 5678.90;
        int comparison = d1.compareTo(d2);
        System.out.println("Comparison result (d1 vs d2): " + (comparison < 0 ? "d1 < d2" : comparison > 0 ? "d1 > d2" : "d1 == d2"));

        // 5. Chuyển đổi Double sang kiểu số khác
        int intValue = doubleObject.intValue();
        float floatValue = doubleObject.floatValue();
        System.out.println("Integer value: " + intValue);
        System.out.println("Float value: " + floatValue);

        // 6. Giá trị tối đa và tối thiểu của Double
        System.out.println("Maximum double value: " + Double.MAX_VALUE);
        System.out.println("Minimum double value: " + Double.MIN_VALUE);

        // 7. Chuyển đổi chuỗi sang double với parseDouble()
        double parsedValue = Double.parseDouble("-4567.891");
        System.out.println("Parsed double value: " + parsedValue);

        // 8. Chuyển double thành chuỗi bằng toString
        String doubleAsString = Double.toString(value);
        System.out.println("Double as String: " + doubleAsString);

        // 9. Kiểm tra giá trị Double bằng equals
        Double d3 = 12345.6789;
        if (doubleObject.equals(d3)) {
            System.out.println("doubleObject is equal to d3.");
        } else {
            System.out.println("doubleObject is not equal to d3.");
        }

        // 10. Kiểm tra NaN (Not-a-Number)
        Double nanValue = Double.NaN;
        if (nanValue.isNaN()) {
            System.out.println("The value is NaN (Not-a-Number).");
        }

        // 11. Kiểm tra giá trị vô hạn (Infinity)
        Double positiveInfinity = Double.POSITIVE_INFINITY;
        Double negativeInfinity = Double.NEGATIVE_INFINITY;
        System.out.println("Positive Infinity: " + positiveInfinity);
        System.out.println("Negative Infinity: " + negativeInfinity);

        // 12. Kiểm tra số hữu hạn (finite)
        if (Double.isFinite(value)) {
            System.out.println("The value is finite.");
        } else {
            System.out.println("The value is infinite.");
        }

        // 13. Biểu diễn nhị phân IEEE 754
        long bits = Double.doubleToLongBits(value);
        System.out.println("IEEE 754 binary representation: " + Long.toBinaryString(bits));

        // 14. Chuyển đổi từ nhị phân IEEE 754 về giá trị double
        double reconstructedValue = Double.longBitsToDouble(bits);
        System.out.println("Reconstructed double from binary: " + reconstructedValue);
    }
}
