public class CharacterClass {
    public static void main(String[] args) {
        // Kiểm tra xem một ký tự có phải là chữ cái
        char ch1 = 'A';
        boolean isLetter = Character.isLetter(ch1);
        System.out.println(ch1 + " is a letter? " + isLetter);

        // Kiểm tra xem một ký tự có phải là số
        char ch2 = '5';
        boolean isDigit = Character.isDigit(ch2);
        System.out.println(ch2 + " is a digit? " + isDigit);

        // Chuyển đổi ký tự thành chữ thường hoặc chữ hoa
        char ch3 = 'a';
        char upperCase = Character.toUpperCase(ch3);
        char lowerCase = Character.toLowerCase(ch3);
        System.out.println("Uppercase of " + ch3 + " is " + upperCase);
        System.out.println("Lowercase of " + ch3 + " is " + lowerCase);

        // Kiểm tra xem một ký tự có phải là một ký tự trắng (space) hay không
        char ch4 = ' ';
        boolean isWhitespace = Character.isWhitespace(ch4);
        System.out.println(ch4 + " is whitespace? " + isWhitespace);

        // Chuyển đổi một ký tự thành một số nguyên (theo mã Unicode)
        char ch5 = 'A';
        int unicode = Character.getNumericValue(ch5);
        System.out.println("Unicode of " + ch5 + " is " + unicode);

        // Kiểm tra xem một ký tự có phải là một ký tự điều khiển hay không
        char ch6 = '\n'; // ký tự xuống dòng
        boolean isControl = Character.isISOControl(ch6);
        System.out.println(ch6 + " is a control character? " + isControl);
    }
}
