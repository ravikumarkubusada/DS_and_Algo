package qSpriders;

public class Person {
    // Member variables (instance variables)
    String name;
    int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display information
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        // Creating instances of the Person class
        Person person1 = new Person("Alice", 25);
        Person person2 = new Person("Bob", 30);

        // Accessing member variables and calling a method
        person1.displayInfo(); // Output: Name: Alice, Age: 25
        person2.displayInfo(); // Output: Name: Bob, Age: 30
    }
}

