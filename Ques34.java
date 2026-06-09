import java.util.Scanner;

public class Ques34{
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter number of row");
        int rows = in.nextInt();
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
