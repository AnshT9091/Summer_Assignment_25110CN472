import java.util.Scanner;

public class Ques24 {
    public static int  reverse(int n) {
        if (n < 10) {
            return n;
        }
        else {
            int power = (int) Math.log10(n);
            int lastDigit = n % 10;
            return lastDigit * (int) Math.pow(10, power) + reverse(n / 10);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter a number to reverse:");
        int number = in.nextInt();
        
        // Call our recursive method
        int result = reverse(number);
        
        System.out.println(result);
    }
}
