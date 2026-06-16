import java.util.Scanner;

public class Ques62 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int maxFreq = 0;
        int maxFreqElement = arr[0];
        for (int i = 0; i < arr.length; i++) {
            int currentFreq = 1; 
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    currentFreq++;
                }
            }
            if (currentFreq > maxFreq) {
                maxFreq = currentFreq;
                maxFreqElement = arr[i];
            }
        }
        System.out.println("The element with the maximum frequency is: " + maxFreqElement);
    }
}