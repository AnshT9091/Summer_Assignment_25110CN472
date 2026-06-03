import java.util.Scanner;
public class Ques11{
    public static void main(String[] args){
        Scanner in= new Scanner (System.in);
        System.out.println("Enter the numbers");
        int num1= in.nextInt();
        int num2=in.nextInt();
        while(num2!=0){
            int temp=num2;
            num2=num1%num2;
            num1=temp;
        }
        System.out.printf("The gcd is %d",num1);

    }
}
