public class ForEachObject {
    public static void main(String[] args) {
        // Tạo một mảng các đối tượng Person
        Person[] people = new Person[3];
        people[0] = new Person("Alice", 25);
        people[1] = new Person("Bob", 30);
        people[2] = new Person("Charlie", 35);
        
        // Dùng vòng lặp for-each để in ra thông tin của các đối tượng trong mảng
        for (Person person : people) {
            System.out.println("Name: " + person.getName() + ", Age: " + person.getAge());
        }
    }
}

// Định nghĩa lớp Person
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
