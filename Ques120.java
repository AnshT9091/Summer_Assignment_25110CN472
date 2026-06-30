import java.util.Scanner;

public class Ques120 {
    // 1. ARRAYS: Parallel arrays to store contact information
    static final int MAX_CONTACTS = 100;
    static String[] names = new String[MAX_CONTACTS];
    static String[] phoneNumbers = new String[MAX_CONTACTS];
    static String[] emails = new String[MAX_CONTACTS];
    
    // Global tracker for the number of saved contacts
    static int contactCount = 0;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Pre-load some sample data using a function
        loadSampleData();
        
        boolean isRunning = true;

        System.out.println("=========================================");
        System.out.println("   Welcome to the Contact Manager Pro    ");
        System.out.println("=========================================");

        while (isRunning) {
            System.out.println("\n--- Main Menu ---");
            System.out.println("1. Add New Contact");
            System.out.println("2. View All Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");
            System.out.print("Choose an option (1-5): ");

            String choice = scanner.nextLine();

            // 2. FUNCTIONS: The main menu simply routes to specific methods
            switch (choice) {
                case "1":
                    addContact();
                    break;
                case "2":
                    displayAllContacts();
                    break;
                case "3":
                    searchContact();
                    break;
                case "4":
                    deleteContact();
                    break;
                case "5":
                    isRunning = false;
                    System.out.println("Exiting system. Have a great day!");
                    break;
                default:
                    System.out.println("Invalid input. Please choose a valid number.");
            }
        }
        scanner.close();
    }

    // --- PROJECT FUNCTIONS ---

    // Function to initialize the system with dummy data
    private static void loadSampleData() {
        names[0] = "Alice Smith";
        phoneNumbers[0] = "555-0101";
        emails[0] = "alice@example.com";
        
        names[1] = "Bob Johnson";
        phoneNumbers[1] = "555-0202";
        emails[1] = "bob@example.com";
        
        contactCount = 2;
    }

    // Function to add a new contact
    private static void addContact() {
        if (contactCount >= MAX_CONTACTS) {
            System.out.println("Error: Contact book is full!");
            return;
        }

        System.out.print("Enter full name: ");
        names[contactCount] = scanner.nextLine();

        System.out.print("Enter phone number: ");
        phoneNumbers[contactCount] = scanner.nextLine();

        System.out.print("Enter email address: ");
        emails[contactCount] = scanner.nextLine();

        contactCount++;
        System.out.println("Success! Contact added.");
    }

    // Function to display all existing contacts
    private static void displayAllContacts() {
        if (contactCount == 0) {
            System.out.println("Your contact book is empty.");
            return;
        }

        System.out.println("\n--- Contact List ---");
        System.out.printf("%-20s %-15s %-25s\n", "Name", "Phone", "Email");
        System.out.println("---------------------------------------------------------------");
        
        for (int i = 0; i < contactCount; i++) {
            // Function utilizing arguments for formatted output
            print