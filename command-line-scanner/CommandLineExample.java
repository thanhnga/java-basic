public class CommandLineExample {
    /*
        javac -encoding UTF-8 .\CommandLineExample.java
        java CommandLineExample "Nga" 30
     */
    public static void main(String[] args) {
        // Kiểm tra xem có ít nhất 2 đối số được truyền vào không
        if (args.length < 2) {
            System.out.println("Please provide your name and age as arguments.");
            return;
        }

        // Đối số đầu tiên là tên, nên ta lấy giá trị của nó
        String name = args[0];

        // Đối số thứ hai là tuổi, nên ta chuyển đổi nó sang kiểu int
        int age = Integer.parseInt(args[1]);

        // In ra tên và tuổi
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
