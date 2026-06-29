import java.util.Scanner;

public class Ques113 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        double num1, num2, result;

        System.out.println("Welcome to the Java Calculator!");

        do {
            // Displaying the menu
            System.out.println("\n--- Calculator Menu ---");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            
            choice = scanner.nextInt();

            // Check if the user wants to exit before asking for numbers
            if (choice == 5) {
                System.out.println("Exiting the calculator. Goodbye!");
                break;
            }

            // Validate input for menu range
            if (choice < 1 || choice > 5) {
                System.out.println("Invalid choice! Please select a valid option from the menu.");
                continue; // Skip the rest of the loop and show the menu again
            }

            // Taking number inputs
            System.out.print("Enter the first number: ");
            num1 = scanner.nextDouble();
            System.out.print("Enter the second number: ");
            num2 = scanner.nextDouble();

            // Performing the calculation based on user choice
            switch (choice) {
                case 1:
                    result = num1 + num2;
                    System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
                    break;
                case 2:
                    result = num1 - num2;
                    System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
                    break;
                case 3:
                    result = num1 * num2;
                    System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
                    break;
                case 4:
                    // Handling division by zero
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
                    } else {
                        System.out.println("Error: Cannot divide by zero!");
                    }
                    break;
            }

        } while (choice != 5);

        // Close the scanner to prevent memory leaks
        scanner.close();
    }
}