import java.util.Scanner;

public class Ques67 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of elements in the first array: ");
        int size1 = in.nextInt();
        int[] arr1 = new int[size1];
        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < size1; i++) {
            arr1[i] = in.nextInt();
        }
        System.out.print("Enter the number of elements in the second array: ");
        int size2 = in.nextInt();
        int[] arr2 = new int[size2];
        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < size2; i++) {
            arr2[i] = in.nextInt();
        }
        int maxSize = (size1 < size2) ? size1 : size2;
        int[] temp= new int[maxSize];
        int count = 0;
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                if (arr1[i] == arr2[j]) {
                    boolean isDuplicate = false;
                    for (int k = 0; k < count; k++) {
                        if (temp[k] == arr1[i]) {
                            isDuplicate = true;
                        }
                    }
                    if (!isDuplicate) {
                        temp[count] = arr1[i];
                        count++;
                    }
                    break; 
                }
            }
        }
        System.out.print("\nIntersection of the arrays: ");
        if (count == 0) {
            System.out.println("No common elements found.");
        } else {
            for (int i = 0; i < count; i++) {
                System.out.print(temp[i] + " ");
            }
            System.out.println();
        }
    }
}


