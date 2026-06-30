import java.util.ArrayList;
import java.util.Scanner;

// The Employee class represents a single employee's data
class Employee {
    // Private fields (Encapsulation) protect the data
    private int id;
    private String name;
    private String department;
    private double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    // Getters to access the private fields safely
    public int getId() { return id; }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }

    // Overriding toString() allows us to easily print the object
    @Override
    public String toString() {
        return String.format("ID: %-5d | Name: %-15s | Dept: %-15s | Salary: $%.2f", 
                             id, name, department, salary);
    }
}

public class Ques119 {
    // ArrayList to store an unlimited number of Employee objects
    static ArrayList<Employee> employees = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;

        System.out.println("--- Mini Employee Management System ---");

        while (running) {
            System.out.println("\nSelect an option:");
            System.out.println("1. Add Employee");
            System.out.println("2. View All Employees");
            System.out.println("3. Search Employee by ID");
            System.out.println("4. Remove Employee by ID");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    addEmployee();
                    break;
                case "2":
                    viewEmployees();
                    break;
                case "3":
                    searchEmployee();
                    break;
                case "4":
                    removeEmployee();
                    break;
                case "5":
                    running = false;
                    System.out.println("Exiting the system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }
        scanner.close();
    }

    // Method to add a new employee
    private static void addEmployee() {
        try {
            System.out.print("Enter Employee ID: ");
            int id = Integer.parseInt(scanner.nextLine()); // Parse string to int safely

            System.out.print("Enter Employee Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Department: ");
            String department = scanner.nextLine();

            System.out.print("Enter Salary: ");
            double salary = Double.parseDouble(scanner.nextLine()); // Parse string to double safely

            // Add the new Employee object to the ArrayList
            employees.add(new Employee(id, name, department, salary));
            System.out.println("Employee added successfully!");

        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format. Please enter numbers for ID and Salary.");
        }
    }

    // Method to display all employees
    private static void viewEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees found. The system is empty.");
            return;
        }

        System.out.println("\n--- Employee List ---");
        for (Employee emp : employees) {
            // This automatically calls the toString() method we defined in the Employee class
            System.out.println(emp);
        }
    }

    // Method to search for an employee by their ID
    private static void searchEmployee() {
        if (employees.isEmpty()) {
            System.out.println("No employees to search.");
            return;
        }

        try {
            System.out.print("Enter Employee ID to search: ");
            int searchId = Integer.parseInt(scanner.nextLine());

            for (Employee emp : employees) {
                if (emp.getId() == searchId) {
                    System.out.println("\n--- Employee Found ---");
                    System.out.println(emp);
                    return; // Exit method once found
                }
            }
            System.out.println("Employee with ID " + searchId + " not found.");

        } catch (NumberFormatException e) {
            System.out.println("Error: ID must be a number.");
        }
    }

    // Method to remove an employee
    private static void removeEmployee() {
        if (employees.isEmpty()) {
            System.out.println("No employees to remove.");
            return;
        }

        try {
            System.out.print("Enter Employee ID to remove: ");
            int removeId = Integer.parseInt(scanner.nextLine());

            for (int i = 0; i < employees.size(); i++) {
                if (employees.get(i).getId() == removeId) {
                    // Remove the employee at index i
                    employees.remove(i);
                    System.out.println("Employee removed successfully!");
                    return; // Exit method once removed
                }
            }
            System.out.println("Employee with ID " + removeId + " not found.");

        } catch (NumberFormatException e) {
            System.out.println("Error: ID must be a number.");
        }
    }
}