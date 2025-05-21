public class MathClass {
    public static void main(String[] args) {
        double num1 = 10.6;
        double num2 = -7.8;
    
        // Tính giá trị tuyệt đối
        System.out.println("Giá trị tuyệt đối của " + num1 + " là: " + Math.abs(num1));
        
        // Làm tròn lên
        System.out.println("Số lớn nhất gần nhất của " + num1 + " là: " + Math.ceil(num1));
        
        // Làm tròn xuống
        System.out.println("Số nhỏ nhất gần nhất của " + num1 + " là: " + Math.floor(num1));
        
        // Tìm giá trị lớn nhất giữa hai số
        System.out.println("Giá trị lớn nhất giữa " + num1 + " và " + num2 + " là: " + Math.max(num1, num2));
        
        // Tìm giá trị nhỏ nhất giữa hai số
        System.out.println("Giá trị nhỏ nhất giữa " + num1 + " và " + num2 + " là: " + Math.min(num1, num2));
        
        // Tính số mũ
        System.out.println("2 mũ 3 là: " + Math.pow(2, 3));
        
        // Tính căn bậc hai
        System.out.println("Căn bậc hai của " + num1 + " là: " + Math.sqrt(num1));
        
        // Sinh số ngẫu nhiên
        System.out.println("Số ngẫu nhiên giữa 0 và 1: " + Math.random());
    }
    
}
