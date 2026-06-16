import java.util.Scanner;

public class Ques63 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of elements");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter  elements");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        // 3. Take the target sum
        System.out.print("Enter the target sum");
        int targetSum = in.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == targetSum) {
                    System.out.println("Pair found(" + arr[i] + ", " + arr[j] + ")");
                }
            }
        }
    }
}