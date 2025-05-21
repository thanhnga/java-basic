public class FloatClass {
    public static void main(String[] args) {
        // 1. Tạo đối tượng Float từ giá trị float
        float value = 10.5f;
        Float floatObject = Float.valueOf(value);
        System.out.println("Float Object: " + floatObject);

        // 2. Chuyển đổi chuỗi sang kiểu Float
        String floatString = "20.75";
        Float floatFromString = Float.valueOf(floatString);
        System.out.println("Float from String: " + floatFromString);

        // 3. Lấy giá trị nguyên thủy từ Float
        float primitiveValue = floatObject.floatValue();
        System.out.println("Primitive float value: " + primitiveValue);

        // 4. So sánh các giá trị Float
        Float f1 = 15.5f;
        Float f2 = 30.25f;
        int comparison = f1.compareTo(f2);
        System.out.println("Comparison result (f1 vs f2): " + (comparison < 0 ? "f1 < f2" : comparison > 0 ? "f1 > f2" : "f1 == f2"));

        // 5. Chuyển đổi Float sang kiểu số khác
        double doubleValue = floatObject.doubleValue();
        int intValue = floatObject.intValue();
        System.out.println("Double value: " + doubleValue);
        System.out.println("Integer value: " + intValue);

        // 6. Giá trị tối đa và tối thiểu của Float
        System.out.println("Maximum float value: " + Float.MAX_VALUE);
        System.out.println("Minimum float value: " + Float.MIN_VALUE);

        // 7. Chuyển đổi chuỗi sang float với parseFloat()
        float parsedValue = Float.parseFloat("-45.89");
        System.out.println("Parsed float value: " + parsedValue);

        // 8. Chuyển float thành chuỗi bằng toString
        String floatAsString = Float.toString(value);
        System.out.println("Float as String: " + floatAsString);

        // 9. Kiểm tra giá trị Float bằng equals
        Float f3 = 10.5f;
        if (floatObject.equals(f3)) {
            System.out.println("floatObject is equal to f3.");
        } else {
            System.out.println("floatObject is not equal to f3.");
        }

        // 10. Kiểm tra NaN (Not-a-Number)
        Float nanValue = Float.NaN;
        if (nanValue.isNaN()) {
            System.out.println("The value is NaN (Not-a-Number).");
        }

        // 11. Kiểm tra giá trị vô hạn (Infinity)
        Float positiveInfinity = Float.POSITIVE_INFINITY;
        Float negativeInfinity = Float.NEGATIVE_INFINITY;
        System.out.println("Positive Infinity: " + positiveInfinity);
        System.out.println("Negative Infinity: " + negativeInfinity);

        // 12. Kiểm tra số hữu hạn (finite)
        if (Float.isFinite(value)) {
            System.out.println("The value is finite.");
        } else {
            System.out.println("The value is infinite.");
        }
        
    }
}
