import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter details for Employee:");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Age: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.print("Designation: ");
        String designation = scanner.nextLine();
        System.out.print("Salary: ");
        double salary = Double.parseDouble(scanner.nextLine());

        // Create Employee objects using the constructor
        Employee emp1 = new Employee(name, age, designation, salary);

        // Close the scanner
        scanner.close();

        // Print employee details
        System.out.println("\nEmployee details:");
        printEmployeeDetails(emp1);

        // Update employee details using setters
        emp1.setSalary(800000.0);
        emp1.setAge(29);

        // Print updated employee details
        System.out.println("\nUpdated Employee:");
        printEmployeeDetails(emp1);

    }

    public static void printEmployeeDetails(Employee emp) {
        System.out.println("Name: " + emp.getName());
        System.out.println("Age: " + emp.getAge());
        System.out.println("Designation: " + emp.getDesignation());
        System.out.println("Salary: " + emp.getSalary());
    }
}
