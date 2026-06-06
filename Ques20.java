import java.util.Scanner;

public class Ques20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number:");
        long n = in.nextLong(); 
        long maxPrime = -1;
        while (n % 2 == 0) {
            maxPrime = 2;
            n = n / 2;
        }
        for (long i = 3; i <= Math.sqrt(n); i = i + 2) {
            while (n % i == 0) {
                maxPrime = i;
                n = n / i;
            }
        }
        if (n > 2) {
            maxPrime = n;
        }

        if (maxPrime == -1) {
            System.out.println("Please enter a number greater than 1.");
        } else {
            System.out.println("The highest prime factor is: " + maxPrime);
        }
    }
}