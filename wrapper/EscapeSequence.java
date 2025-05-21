public class EscapeSequence {
    public static void main(String[] args) {
        // \t: Tab - Chèn khoảng cách tab giữa các từ
        String tab = "Tab: Hello\tWorld";
        System.out.println(tab);

        // \b: Backspace - Xóa 1 ký tự ngay trước đó
        String backspace = "Backspace: Hello\bWorld";
        System.out.println(backspace);

        // \n: Newline - Xuống dòng mới tính từ vị trí xuất hiện của \n
        String newline = "Newline: Hello\nWorld";
        System.out.println(newline);

        // \r: Carriage Return - Di chuyển con trỏ về đầu dòng, ghi đè từ đầu dòng
        String carriageReturn = "Carriage Return: Hello\rWorld";
        System.out.println(carriageReturn);

        // \': Single Quote - Hiển thị dấu nháy đơn (') trong chuỗi
        String singleQuote = "Single Quote: Hello\'World";
        System.out.println(singleQuote);

        // \": Double Quote - Hiển thị dấu nháy kép (") trong chuỗi
        String doubleQuote = "Double Quote: Hello\"World";
        System.out.println(doubleQuote);

        // \\: Backslash - Hiển thị dấu gạch chéo ngược (\) trong chuỗi
        String backslash = "Backslash: Hello\\World";
        System.out.println(backslash);
    }

    
}
