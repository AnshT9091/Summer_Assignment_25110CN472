import java.util.Scanner;

public class Ques61 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the total number of elements ");
        int n = in.nextInt();

        int[] arr = new int[n -1];
       
        int actualSum = 0; 
        for (int i = 0; i < n - 1; i++) {
            arr[i] = in.nextInt();
            actualSum += arr[i]; 
        }
        int expectedSum = (int) n * (n + 1) / 2;
        int missingNumber = expectedSum - actualSum;

        System.out.println("The missing number is: " + missingNumber);
    }
}
