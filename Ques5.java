
import java.util.Scanner;

public class Ques5 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the number");
        int num= input.nextInt();
        int rev=0;
        int x;
        while(num>0){
            x= num%10;
            rev=rev+x;
            num=num/10;
        }
        System.out.println("The sum of the digits of this number is "+rev);
        input.close();
    }
}