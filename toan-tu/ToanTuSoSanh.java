public class ToanTuSoSanh {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        boolean c = (a == b);  // So sánh bằng
        System.out.println("c = " + c);

        int d = 3;
        int e = 4;
        boolean f = (d != e);  // So sánh không bằng
        System.out.println("f = " + f);

        int g = 7;
        int h = 6;
        boolean i = (g > h);    // So sánh lớn hơn
        System.out.println("i = " + i);

        int j = 8;
        int k = 9;
        boolean l = (j < k);    // So sánh nhỏ hơn
        System.out.println("l = " + l);

        int m = 10;
        int n = 10;
        boolean o = (m >= n);   // So sánh lớn hơn hoặc bằng
        System.out.println("o = " + o);

        int p = 11;
        int q = 12;
        boolean r = (p <= q);   // So sánh nhỏ hơn hoặc bằng
        System.out.println("r = " + r);
        
    }
}
