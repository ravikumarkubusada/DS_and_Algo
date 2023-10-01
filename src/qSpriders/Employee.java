package qSpriders;

public class Employee {
    // Non-static attributes
    private String name;
    private int empid;
    private double sal;
    private String companyname;

    // Static attribute (common for all employees)
    private static String commonCompanyName = "XYZ Corp"; // Example company name

    // Constructor to initialize non-static attributes
    public Employee(String name, int empid, double sal) {
        this.name = name;
        this.empid = empid;
        this.sal = sal;
        this.companyname = commonCompanyName; // Assigning the common company name
    }

    // Method to update the salary of an employee
    public void updateSalary(double newSalary) {
        this.sal = newSalary;
    }

    // Method to display employee details
    public void displayEmpDetails() {
        System.out.println("Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + empid);
        System.out.println("Salary: $" + sal);
        System.out.println("Company Name: " + companyname);
    }

    // Static method to update the common company name
    public static void updateCommonCompanyName(String newCompanyName) {
        commonCompanyName = newCompanyName;
    }

    // Static method to get the common company name
    public static String getCommonCompanyName() {
        return commonCompanyName;
    }

    public static void main(String[] args) {
        // Creating employee objects
        Employee emp1 = new Employee("John", 101, 50000);
        Employee emp2 = new Employee("Alice", 102, 55000);

        // Displaying initial employee details
        emp1.displayEmpDetails();
        System.out.println("-----------------------------------------------");
        emp2.displayEmpDetails();
        System.out.println("-----------------------------------------------");
        // Updating the salary of emp1
        System.out.println("Updating the salary of " + emp1.name);
        emp1.updateSalary(52000);

        System.out.println("-----------------------------------------------");
        // Displaying updated employee details
        emp1.displayEmpDetails();
        System.out.println("-----------------------------------------------");
        emp2.displayEmpDetails();

        System.out.println("-----------------------------------------------");
        // Updating the common company name
        System.out.println("Updating the common company name to ABC Corp");
        Employee.updateCommonCompanyName("ABC Corp");

        // Displaying the common company name
        System.out.println("Common Company Name: " + Employee.getCommonCompanyName());
    }
}

