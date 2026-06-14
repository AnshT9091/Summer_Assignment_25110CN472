import java.util.Scanner;
public class Ques55{
    public static void main(){
        System.out.println("Enter the element");
        Scanner in= new Scanner(System.in);
        int x= in.nextInt();
        int[] arr= new int[x];
        for(int i=0;i<x;i++){
            arr[i]=in.nextInt();
        }
        int l = Integer.MIN_VALUE;
        int sl = Integer.MIN_VALUE;

        // 4. Loop through the array to find the values
        for (int i = 0; i < x; i++) {
            // If we find a new largest number
            if (arr[i] > l) {
                sl = l; // The old largest becomes the second largest
                l = arr[i];    // Update the new largest
            } 
            else if (arr[i] > sl && arr[i] != l) {
                sl = arr[i];
            }
        }
        if (sl == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element");
        } else {
            System.out.println("The second largest element is: " + sl);
        }
    }
}
    
