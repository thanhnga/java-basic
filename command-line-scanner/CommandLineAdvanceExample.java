/**
 * javac -encoding UTF-8 .\CommandLineAdvanceExample.java
 * java CommandLineAdvanceExample -name "Nga" -age 30
 * java CommandLineAdvanceExample -age 30 -name "Nga"
 */
public class CommandLineAdvanceExample {
    public static void main(String[] args) {
        String name = null;
        int age = -1;

        // Duyệt qua các đối số
        for (int i = 0; i < args.length; i+=2) {
            switch (args[i]) {
                case "-name":
                    if (i + 1 < args.length) {
                        name = args[i + 1];
                    }
                    break;
                case "-age":
                    if (i + 1 < args.length) {
                        age = Integer.parseInt(args[i + 1]);
                    }
                    break;
            }
        }

        // Kiểm tra nếu cả tên và tuổi đều được nhập vào
        if (name != null && age != -1) {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        } else {
            System.out.println("Please provide both a name and an age using the format -name \"YourName\" -age YourAge.");
        }
    }
}
