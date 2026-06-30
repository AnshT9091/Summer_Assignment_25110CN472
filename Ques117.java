import java.util.Scanner;

public class Ques117 {
    // Define maximum capacity for the system
    static final int MAX_STUDENTS = 100;
    
    // Parallel arrays to store student data
    static String[] names = new String[MAX_STUDENTS];
    static String[] rollNumbers = new String[MAX_STUDENTS];
    static String[] courses = new String[MAX_STUDENTS];
    
    // Counter to track the current number of students
    static int studentCount = 0;
    
    // Scanner for user input
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;

        System.out.println("--- Welcome to the Student Record System ---");

        while (running) {
            System.out.println("\nSelect an option:");
            System.out.println("1. Add a new student");
            System.out.println("2. Display all students");
            System.out.println("3. Search for a student by Roll Number");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");

            String choiceInput = scanner.nextLine();
            
            switch (choiceInput) {
                case "1":
                    addStudent();
                    break;
                case "2":
                    displayStudents();
                    break;
                case "3":
                    searchStudent();
                    break;
                case "4":
                    running = false;
                    System.out.println("Exiting the system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
        scanner.close();
    }

    // Method to add a new student
    private static void addStudent() {
        if (studentCount >= MAX_STUDENTS) {
            System.out.println("System is full! Cannot add more students.");
            return;
        }

        System.out.print("Enter Student Name: ");
        names[studentCount] = scanner.nextLine();

        System.out.print("Enter Roll Number: ");
        rollNumbers[studentCount] = scanner.nextLine();

        System.out.print("Enter Course: ");
        courses[studentCount] = scanner.nextLine();

        studentCount++;
        System.out.println("Student added successfully!");
    }

    // Method to display all saved students
    private static void displayStudents() {
        if (studentCount == 0) {
            System.out.println("No records found. The system is empty.");
            return;
        }

        System.out.println("\n--- List of Students ---");
        System.out.printf("%-20s %-15s %-20s\n", "Name", "Roll Number", "Course");
        System.out.println("-------------------------------------------------------");
        
        for (int i = 0; i < studentCount; i++) {
            System.out.printf("%-20s %-15s %-20s\n", names[i], rollNumbers[i], courses[i]);
        }
    }

    // Method to search for a student using their roll number
    private static void searchStudent() {
        if (studentCount == 0) {
            System.out.println("No records to search. The system is empty.");
            return;
        }

        System.out.print("Enter the Roll Number to search: ");
        String searchRoll = scanner.nextLine();
        boolean found = false;

        for (int i = 0; i < studentCount; i++) {
            // Using .equals() to compare String values
            if (rollNumbers[i].equals(searchRoll)) {
                System.out.println("\n--- Student Found ---");
                System.out.println("Name: " + names[i]);
                System.out.println("Roll Number: " + rollNumbers[i]);
                System.out.println("Course: " + courses[i]);
                found = true;
                break; // Stop searching once found
            }
        }

        if (!found) {
            System.out.println("Student with Roll Number " + searchRoll + " not found.");
        }
    }
}