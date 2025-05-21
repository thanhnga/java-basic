public class ToanTuBit {
    public static void main(String[] args) {

        int a = 5; // 0000 0101 
        int b = 3; // 0000 0011

        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));

        /*
            AND Bitwise (&):
            Sử dụng để thực hiện phép AND bitwise giữa các bit tại cùng một vị trí của hai số.
            Kết quả sẽ là 1 nếu cả hai bit đều là 1, ngược lại sẽ là 0.
         */
        int andResult = a & b; // 0000 0001
        System.out.println("AND Result: " + andResult); //AND Result: 1

        /*
            OR Bitwise (|):
            Sử dụng để thực hiện phép OR bitwise giữa các bit tại cùng một vị trí của hai số.
            Kết quả sẽ là 1 nếu ít nhất một trong hai bit là 1, và là 0 nếu cả hai bit đều là 0.
         */
        int orResult = a | b;  // 0000 0111
        System.out.println("OR Result: " + orResult); //OR Result: 7

        /*
            XOR Bitwise (^):
            Sử dụng để thực hiện phép XOR bitwise giữa các bit tại cùng một vị trí của hai số.
            Kết quả sẽ là 1 nếu chỉ một trong hai bit là 1, và là 0 nếu cả hai bit đều giống nhau.
         */
        int xorResult = a ^ b; // 0000 0110
        System.out.println("XOR Result: " + xorResult); //XOR Result: 6

        /*
            NOT Bitwise (~):
            Sử dụng để đảo ngược các bit của một số.
            Tức là tất cả các bit 1 sẽ trở thành 0 và tất cả các bit 0 sẽ trở thành 1.
         */
        int notResult = ~a;    // 1111 1010
        System.out.println("NOT Result: " + notResult); //NOT Result: -6

        /*
            Dịch Bit Trái (<<):
            Sử dụng để dịch các bit của một số sang trái một số lượng cố định của bit.
            Các bit dịch ra khỏi số sẽ bị loại bỏ và các bit 0 sẽ được thêm vào từ phía bên phải.
        */
        int leftShiftResult = a << 1; // 0000 1010
        System.out.println("Left Shift Result: " + leftShiftResult); //Left Shift Result: 10

        /*
            Dịch Bit Phải (>>):
            Sử dụng để dịch các bit của một số sang phải một số lượng cố định của bit.
            Các bit dịch ra khỏi số sẽ bị loại bỏ và các bit 0 sẽ được thêm vào từ phía bên trái (nếu số là dương) hoặc các bit 1 sẽ được thêm vào từ phía bên trái (nếu số là âm).
         */
        int rightShiftResult = a >> 1; // 0000 0010
        System.out.println("Right Shift Result: " + rightShiftResult); //Right Shift Result: 2

        /*
            Dịch Bit Phải Không Dấu (>>>):
            Sử dụng để dịch các bit của một số sang phải một số lượng cố định của bit, bằng cách thêm vào các bit 0 từ bên trái.
            Không quan tâm đến dấu của số, vì vậy các bit 0 sẽ được thêm vào từ phía bên trái.
         */
        int unsignedRightShiftResult = a >>> 1; // 0000 0010
        System.out.println("Unsigned Right Shift Result: " + unsignedRightShiftResult); //Unsigned Right Shift Result: 2

    }
}
