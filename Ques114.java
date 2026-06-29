import java.util.Scanner;

public class Ques114{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Define a fixed-capacity array and a variable to track the current number of elements
        int capacity = 100;
        int[] arr = new int[capacity];
        int size = 0; 
        int choice;

        System.out.println("Welcome to the Array Operations System!");

        do {
            // Displaying the menu
            System.out.println("\n--- Array Operations Menu ---");
            System.out.println("1. Input Array Elements");
            System.out.println("2. Display Array");
            System.out.println("3. Insert an Element");
            System.out.println("4. Delete an Element");
            System.out.println("5. Search for an Element");
            System.out.println("6. Exit");
            System.out.print("Enter your choice (1-6): ");
            
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Input Array Elements
                    System.out.print("How many elements do you want to enter? (Max " + capacity + "): ");
                    int numElements = scanner.nextInt();
                    
                    if (numElements > capacity || numElements < 0) {
                        System.out.println("Invalid size!");
                    } else {
                        System.out.println("Enter " + numElements + " elements:");
                        for (int i = 0; i < numElements; i++) {
                            arr[i] = scanner.nextInt();
                        }
                        size = numElements;
                        System.out.println("Array populated successfully.");
                    }
                    break;

                case 2:
                    // Display Array
                    if (size == 0) {
                        System.out.println("The array is currently empty.");
                    } else {
                        System.out.print("Array elements: [");
                        for (int i = 0; i < size; i++) {
                            System.out.print(arr[i] + (i < size - 1 ? ", " : ""));
                        }
                        System.out.println("]");
                    }
                    break;

                case 3:
                    // Insert an Element
                    if (size == capacity) {
                        System.out.println("Array is full! Cannot insert new elements.");
                        break;
                    }
                    
                    System.out.print("Enter the position (1 to " + (size + 1) + ") to insert: ");
                    int insertPos = scanner.nextInt();
                    
                    if (insertPos < 1 || insertPos > size + 1) {
                        System.out.println("Invalid position!");
                    } else {
                        System.out.print("Enter the value to insert: ");
                        int insertValue = scanner.nextInt();
                        
                        // Shift elements to the right to make space
                        for (int i = size - 1; i >= insertPos - 1; i--) {
                            arr[i + 1] = arr[i];
                        }
                        // Insert the new value and increase the size
                        arr[insertPos - 1] = insertValue;
                        size++;
                        System.out.println("Element inserted successfully.");
                    }
                    break;

                case 4:
                    // Delete an Element
                    if (size == 0) {
                        System.out.println("The array is empty! Nothing to delete.");
                        break;
                    }
                    
                    System.out.print("Enter the position (1 to " + size + ") to delete: ");
                    int deletePos = scanner.nextInt();
                    
                    if (deletePos < 1 || deletePos > size) {
                        System.out.println("Invalid position!");
                    } else {
                        int deletedValue = arr[deletePos - 1];
                        
                        // Shift elements to the left to fill the gap
                        for (int i = deletePos - 1; i < size - 1; i++) {
                            arr[i] = arr[i + 1];
                        }
                        // Decrease the size
                        size--;
                        System.out.println("Element " + deletedValue + " deleted successfully.");
                    }
                    break;

                case 5:
                    // Search for an Element (Linear Search)
                    if (size == 0) {
                        System.out.println("The array is empty! Nothing to search.");
                        break;
                    }
                    
                    System.out.print("Enter the value to search for: ");
                    int searchValue = scanner.nextInt();
                    boolean found = false;
                    
                    for (int i = 0; i < size; i++) {
                        if (arr[i] == searchValue) {
                            System.out.println("Element " + searchValue + " found at position " + (i + 1) + " (index " + i + ").");
                            found = true;
                            break;
                        }
                    }
                    
                    if (!found) {
                        System.out.println("Element not found in the array.");
                    }
                    break;

                case 6:
                    // Exit
                    System.out.println("Exiting the Array Operations System. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Please select a valid option from the menu.");
            }

        } while (choice != 6);
    }
}