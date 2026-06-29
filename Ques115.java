import java.util.Scanner;

public class Ques115 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (true) {
            // Display the menu
            System.out.println("\n================================");
            System.out.println("    STRING OPERATIONS SYSTEM    ");
            System.out.println("================================");
            System.out.println("1. Reverse a String");
            System.out.println("2. Check for Palindrome");
            System.out.println("3. Count Vowels and Consonants");
            System.out.println("4. Convert Case (Upper/Lower)");
            System.out.println("5. Check Substring Presence");
            System.out.println("6. Exit");
            System.out.println("================================");
            System.out.print("Enter your choice (1-6): ");

            // Safe input handling to prevent mismatch exceptions
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine(); // Clear the newline character from the buffer
            } else {
                System.out.println("\n❌ Invalid input! Please enter a number.");
                scanner.nextLine(); // Clear the invalid text from the buffer
                continue;
            }

            // Handle Exit condition immediately
            if (choice == 6) {
                System.out.println("\nThank you for using the String Operations System. Goodbye! 👋");
                break;
            }

            String userStr;
            
            // Handle Menu Options
            switch (choice) {
                case 1:
                    System.out.print("\nEnter the string to reverse: ");
                    userStr = scanner.nextLine();
                    // StringBuilder is the most efficient way to reverse a string in Java
                    String reversed = new StringBuilder(userStr).reverse().toString();
                    System.out.println("👉 Reversed String: " + reversed);
                    break;
                    
                case 2:
                    System.out.print("\nEnter the string to check: ");
                    userStr = scanner.nextLine();
                    
                    // Clean string: remove spaces using Regex and convert to lowercase
                    String cleanedStr = userStr.replaceAll("\\s+", "").toLowerCase();
                    String reversedCleanStr = new StringBuilder(cleanedStr).reverse().toString();
                    
                    if (cleanedStr.equals(reversedCleanStr)) {
                        System.out.println("👉 Result: Yes, it is a Palindrome!");
                    } else {
                        System.out.println("👉 Result: No, it is not a Palindrome.");
                    }
                    break;
                    
                case 3:
                    System.out.print("\nEnter the string: ");
                    userStr = scanner.nextLine();
                    int vCount = 0, cCount = 0;
                    
                    String lowerCaseStr = userStr.toLowerCase();
                    for (int i = 0; i < lowerCaseStr.length(); i++) {
                        char ch = lowerCaseStr.charAt(i);
                        // Check if the character is an English letter
                        if (ch >= 'a' && ch <= 'z') {
                            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                                vCount++;
                            } else {
                                cCount++;
                            }
                        }
                    }
                    System.out.println("👉 Vowels: " + vCount);
                    System.out.println("👉 Consonants: " + cCount);
                    break;
                    
                case 4:
                    System.out.print("\nEnter the string: ");
                    userStr = scanner.nextLine();
                    
                    System.out.println("👉 Uppercase: " + userStr.toUpperCase());
                    System.out.println("👉 Lowercase: " + userStr.toLowerCase());
                    break;
                    
                case 5:
                    System.out.print("\nEnter the main string: ");
                    String mainStr = scanner.nextLine();
                    System.out.print("Enter the substring to search for: ");
                    String subStr = scanner.nextLine();
                    
                    if (mainStr.contains(subStr)) {
                        System.out.println("👉 Success: '" + subStr + "' was found in the string!");
                    } else {
                        System.out.println("👉 Notice: '" + subStr + "' was NOT found in the string.");
                    }
                    break;
                    
                default:
                    System.out.println("\n❌ Invalid choice! Please enter a number between 1 and 6.");
            }
        }
        
        scanner.close(); // Prevent memory leaks by closing the Scanner
    }
}