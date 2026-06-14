import java.util.Scanner;

public class Ques56 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the total number of elements: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter the " + n + " elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.print("Duplicate elements found: ");
        boolean foundAnyDuplicate = false;
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (visited[i] == true) {
                continue;
            }

            boolean isDuplicate = false;
            for (int j = i + 1; j < n; j++) {
                if (numbers[i] == numbers[j]) {
                    isDuplicate = true;
                    visited[j] = true;
                }
            }
            if (isDuplicate) {
                System.out.print(numbers[i] + " ");
                foundAnyDuplicate = true;
            }
        }
        if (!foundAnyDuplicate) {
            System.out.print("None");
        }
        System.out.println(); 
       
    }
}