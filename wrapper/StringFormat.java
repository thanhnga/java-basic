public class StringFormat {
    /*
        Số nguyên
            %d : Số nguyên thập phân.
            %o : Số nguyên hệ bát phân (octal).
            %x / %X : Số nguyên hệ thập lục phân (hexadecimal, chữ thường/chữ hoa).
        Số thực
            %f : Số thực (floating-point).
            %e / %E : Dạng khoa học (scientific notation, chữ thường/chữ hoa).
            %g / %G : Dạng ngắn gọn, chọn giữa %f và %e/%E tùy theo độ dài.
            %a / %A : Dạng hexadecimal floating-point (chữ thường/chữ hoa).
        Chuỗi và ký tự
            %s : Chuỗi.
            %c : Ký tự.
        Boolean
            %b : Giá trị boolean.
        Hashcode
            %h / %H : Hashcode của đối tượng (chữ thường/chữ hoa).
        Phần trăm
            %% : Ký tự %.
        Argument Index
            %< : Sử dụng lại giá trị của đối số trước đó.
     */
    public static void main(String[] args) {

        // Số nguyên
        System.out.println(String.format("Decimal: %d", 255));
        System.out.println(String.format("Octal: %o", 255));
        System.out.println(String.format("Hexadecimal: %x (lowercase)", 255));
        System.out.println(String.format("Hexadecimal: %X (uppercase)", 255));

        // Số thực
        System.out.println(String.format("Floating-point: %f", 123.456));
        System.out.println(String.format("Scientific notation: %e (lowercase)", 123.456));
        System.out.println(String.format("Scientific notation: %E (uppercase)", 123.456));
        System.out.println(String.format("Compact format: %g", 0.0000123456));
        System.out.println(String.format("Hexadecimal floating-point: %a (lowercase)", 123.456));
        System.out.println(String.format("Hexadecimal floating-point: %A (uppercase)", 123.456));

        // Ký tự và chuỗi
        System.out.println(String.format("Character: %c", 'A'));
        System.out.println(String.format("String: %s", "Hello, World!"));

        // Boolean
        System.out.println(String.format("Boolean (true): %b", true));
        System.out.println(String.format("Boolean (false): %b", false));
        System.out.println(String.format("Boolean (null): %b", null));

        // Hashcode
        Object obj = new Object();
        System.out.println(String.format("Hashcode (lowercase): %h", obj));
        System.out.println(String.format("Hashcode (uppercase): %H", obj));

        // Ký tự phần trăm
        System.out.println(String.format("Percentage: %%"));

        // Sử dụng lại giá trị trước đó
        System.out.println(String.format("Reused argument: %d %<d %<d", 42));
    }
}
