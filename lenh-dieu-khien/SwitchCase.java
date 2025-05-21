public class SwitchCase {

    public static void main(String[] args) {
        int thang = 13;
        switch (thang) {
            case 1:
            case 2:
            case 3:
                System.out.println("Tháng " + thang + " là mùa xuân");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Tháng " + thang + " là mùa hạ");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("Tháng " + thang + " là mùa thu");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("Tháng " + thang + " là mùa đông");
                break;
            default:
                System.out.println("Tháng " + thang + " không hợp lệ");
        }

    }
}