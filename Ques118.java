import java.util.Scanner;

// The Book class acts as a blueprint for each book in the library
class Book {
    String title;
    String author;
    boolean isAvailable;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true; // Books are available by default when added
    }
}

public class Ques118 {
    // Array to store Book objects
    static final int MAX_BOOKS = 100;
    static Book[] library = new Book[MAX_BOOKS];
    static int bookCount = 0;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;
        
        System.out.println("--- Welcome to the Mini Library System ---");

        while (running) {
            System.out.println("\nSelect an option:");
            System.out.println("1. Add a Book");
            System.out.println("2. Display Available Books");
            System.out.println("3. Borrow a Book");
            System.out.println("4. Return a Book");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    addBook();
                    break;
                case "2":
                    displayAvailableBooks();
                    break;
                case "3":
                    borrowBook();
                    break;
                case "4":
                    returnBook();
                    break;
                case "5":
                    running = false;
                    System.out.println("Exiting the library. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }
        scanner.close();
    }

    // Method to add a new book to the library
    private static void addBook() {
        if (bookCount >= MAX_BOOKS) {
            System.out.println("The library is full! Cannot add more books.");
            return;
        }

        System.out.print("Enter Book Title: ");
        String title = scanner.nextLine();

        System.out.print("Enter Author Name: ");
        String author = scanner.nextLine();

        // Create a new Book object and store it in the array
        library[bookCount] = new Book(title, author);
        bookCount++;
        
        System.out.println("Book added successfully!");
    }

    // Method to display all books currently available to borrow
    private static void displayAvailableBooks() {
        if (bookCount == 0) {
            System.out.println("The library has no books yet.");
            return;
        }

        System.out.println("\n--- Available Books ---");
        boolean foundAvailable = false;
        
        for (int i = 0; i < bookCount; i++) {
            if (library[i].isAvailable) {
                System.out.println((i + 1) + ". " + library[i].title + " by " + library[i].author);
                foundAvailable = true;
            }
        }

        if (!foundAvailable) {
            System.out.println("All books are currently borrowed out.");
        }
    }

    // Method to borrow a book
    private static void borrowBook() {
        System.out.print("Enter the exact title of the book you want to borrow: ");
        String searchTitle = scanner.nextLine();
        
        for (int i = 0; i < bookCount; i++) {
            // Check if the title matches (ignoring uppercase/lowercase differences)
            if (library[i].title.equalsIgnoreCase(searchTitle)) {
                if (library[i].isAvailable) {
                    library[i].isAvailable = false; // Update status
                    System.out.println("You have successfully borrowed: " + library[i].title);
                } else {
                    System.out.println("Sorry, that book is currently checked out.");
                }
                return; // Exit the method once the book is found
            }
        }
        System.out.println("Book not found in our catalog.");
    }

    // Method to return a book
    private static void returnBook() {
        System.out.print("Enter the exact title of the book you are returning: ");
        String searchTitle = scanner.nextLine();
        
        for (int i = 0; i < book