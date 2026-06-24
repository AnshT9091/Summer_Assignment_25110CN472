import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100.");
        int secretNumber = random.nextInt(100) + 1;
        
        int attempts = 0;
        boolean isGuessed = false;
        while (!isGuessed) {
            System.out.print("Enter your guess: ");
            
            try {
                int userGuess = scanner.nextInt();
                attempts++;
                if (userGuess < secretNumber) {
                    System.out.println("Too low! Try again.");
                } else if (userGuess > secretNumber) {
                    System.out.println("Too high! Try again.");
                } else {
                    isGuessed = true;
                    System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                }
                
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a whole number.");
                
                scanner.next(); 
            }
        }
    }
}
