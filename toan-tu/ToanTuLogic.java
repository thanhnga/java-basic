public class ToanTuLogic {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = (a && b);  // AND
        System.out.println("c = " + c);

        boolean d = true;
        boolean e = false;
        boolean f = (d || e);  // OR
        System.out.println("f = " + f);

        boolean g = true;
        boolean h = !g;        // NOT
        System.out.println("h = " + h);
    }
}
