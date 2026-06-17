import java.util.ArrayList;
import java.util.Scanner;

public class Ques66 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        // --- Taking User Input ---
        System.out.println("Enter elements of first array");
        String[] input1 = in.nextLine().split(" ");
        
        System.out.println("Enter elements of second array");
        String[] input2 = in.nextLine().split(" ");
        
        ArrayList<Integer> result = new ArrayList<>();
        
        // Process the first array
        for (String s : input1) {
            if (!s.trim().isEmpty()) { 
                int num = Integer.parseInt(s);
                if (!result.contains(num)) {
                    result.add(num);
                }
            }
        }
        for (String s : input2) {
            if (!s.trim().isEmpty()) {
                int num = Integer.parseInt(s);
                if (!result.contains(num)) {
                    result.add(num);
                }
            }
        }
        System.out.println("\nUnion of the arrays: " + result);
    }
}