import java.util.Scanner;

public class Ques6 {

    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int rev = 0;
        int x;
        while (num != 0) {
            x = num % 10;
            rev = rev * 10 + x;
            num = num / 10;
        }
        System.out.println("The reversed number is" + rev);
        in.close();
    }
}
