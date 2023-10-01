package qSpriders;

public class Student {
    private String name;
    private String branch;
    private int semester;
    private double[] marks;

    public Student(String name, String branch, int semester, double[] marks) {
        this.name = name;
        this.branch = branch;
        this.semester = semester;
        this.marks = marks;
    }

    public boolean checkDetails() {
        // Check if the branch is CS, IS, EC, or EEE
        boolean isValidBranch = branch.equals("CS") || branch.equals("IS") || branch.equals("EC") || branch.equals("EEE");

        // Return true or false based on branch validity
        return isValidBranch;
    }

    public static void main(String[] args) {
        // Create multiple instances of the Student class
        Student student1 = new Student("John", "CS", 3, new double[]{85, 88, 92});
        Student student2 = new Student("Alice", "EC", 2, new double[]{78, 90, 86});
        Student student3 = new Student("Bob", "ME", 4, new double[]{75, 82, 88});

        // Check the details for each student and print the result
        System.out.println(student1.name + "'s branch is CS: " + student1.checkDetails());
        System.out.println(student2.name + "'s branch is EC: " + student2.checkDetails());
        System.out.println(student3.name + "'s branch is ME: " + student3.checkDetails());
    }
}

