public class BooleanClass {
    public static void main(String[] args) {
        // Sử dụng phương thức valueOf để tạo đối tượng Boolean từ giá trị boolean
        Boolean b1 = Boolean.valueOf(true);
        Boolean b2 = Boolean.valueOf(false);

        // Lấy giá trị boolean từ đối tượng Boolean sử dụng phương thức booleanValue
        boolean value1 = b1.booleanValue();
        System.out.println("Value of b1: " + value1);

        boolean value2 = b2.booleanValue();
        System.out.println("Value of b2: " + value2);

         // So sánh hai đối tượng Boolean sử dụng phương thức equals
         if (b1.equals(b2)) {
            System.out.println("b1 is equal to b2.");
        } else {
            System.out.println("b1 is not equal to b2.");
        }

        // Sử dụng phương thức parseBoolean để chuyển đổi một chuỗi thành giá trị boolean
        String str = "true";
        Boolean b3 = Boolean.parseBoolean(str);

        // Sử dụng phương thức toString để chuyển đối tượng Boolean thành chuỗi
        System.out.println("b3 as string: " + b3.toString());
    }
}
