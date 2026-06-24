import java.util.Scanner;

public class Ques104 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        
        // Array holding the questions and multiple choice options
        String[] questions = {
            "1. What is the capital of France?\nA. Berlin  B. Madrid  C. Paris  D. Rome",
            "2. What is 5 + 7?\nA. 12  B. 10  C. 14  D. 15",
            "3. Which planet is known as the Red Planet?\nA. Venus  B. Mars  C. Jupiter  D. Saturn"
        };
        
        // Array holding the correct answers that match up with the questions above
        char[] answers = {'C', 'A', 'B'};
        
        System.out.println("Welcome to the Simple Quiz!");
        
        // Loop through each question
        for (int i = 0; i < questions.length; i++) {
            System.out.println("\n" + questions[i]);
            System.out.print("Your answer (A/B/C/D): ");
            
            // Read the user's input, convert to uppercase, and grab the first letter
            char guess = scanner.next().toUpperCase().charAt(0);
            
            // Check if the guess matches the correct answer
            if (guess == answers[i]) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong! The correct answer was " + answers[i]);
            }
        }
        
        // Display final score
        System.out.println("\nQuiz Over! Your final score is: " + score + "/" + questions.length);
        
        scanner.close();
    }
}