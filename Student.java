package two;

public class Student {
    // Instance variables
    private String name;
    private int age;

    // Parameterized constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display object data
    public void display() {
        System.out.println("Name: " + name + " and Age: " + age);
    }

    // Main method to create objects
    public static void main(String[] args) {
        // Invokes the parameterized constructor
        Student student1 = new Student("Alice", 20);
        Student student2 = new Student("Bob", 22);

        student1.display();
        student2.display();
    }
}
