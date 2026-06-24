import java.util.Scanner;

public class Ques102
 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt(); // Reads the user's input
        
        // The core logic: check if the age is 18 or older
        if (age >= 18) {
            System.out.println("You are eligible to vote!");
        } else {
            System.out.println("You are not eligible to vote yet.");
        }
    }
}