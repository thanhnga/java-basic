public class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display person's details
    public void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}