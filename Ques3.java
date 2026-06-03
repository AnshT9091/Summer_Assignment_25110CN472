
import java.util.Scanner;

public class Ques3 {

    public static void main(String[] args) {
        // QUESTION 3:-- TO FIND THE FACTORIAL OF A NUMBER
        System.out.println("Enter the number you want to find the factorial of:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
        sc.close();
    }

}
