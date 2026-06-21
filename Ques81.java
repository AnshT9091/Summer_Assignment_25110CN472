import java.util.Scanner;

public class Ques81{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        
        int length = 0;
        char[] charArray = str.toCharArray();
        
        // Loop through each character in the array
        for (char c : charArray) {
        }
        
        System.out.println("The length of the string is: " + length);
        
        scanner.close();
    }
}
