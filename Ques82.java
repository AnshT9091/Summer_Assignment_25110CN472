import java.util.Scanner;

public class Ques82 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter a string to reverse: ");
        String original = in.nextLine();
        char[] chars = original.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            
            left++;  // Move forward
            right--; // Move backward
        }
        
        // Convert the modified array back into a string
        String reversed = new String(chars);
        System.out.println("Reversed string: " + reversed);
    }
}