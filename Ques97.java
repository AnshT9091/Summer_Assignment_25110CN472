import java.util.Arrays;

public class Ques97 {

    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        int[] mergedArray = new int[n + m];

        // Pointers for arr1, arr2, and mergedArray respectively
        int i = 0, j = 0, k = 0;

        // Traverse both arrays simultaneously
        while (i < n && j < m) {
            // Compare elements and add the smaller one to mergedArray
            if (arr1[i] <= arr2[j]) {
                mergedArray[k] = arr1[i];
                i++;
            } else {
                mergedArray[k] = arr2[j];
                j++;
            }
            k++;
        }

        // If there are remaining elements in arr1, append them
        while (i < n) {
            mergedArray[k] = arr1[i];
            i++;
            k++;
        }

        // If there are remaining elements in arr2, append them
        while (j < m) {
            mergedArray[k] = arr2[j];
            j++;
            k++;
        }

        return mergedArray;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 3, 5, 7};
        int[] array2 = {2, 4, 6, 8, 10};

        int[] result = mergeArrays(array1, array2);

        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));
        System.out.println("Merged Array: " + Arrays.toString(result));
    }
}