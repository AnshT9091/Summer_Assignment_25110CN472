import java.util.Scanner;
public class Ques12{
    public static void main(String[] args){
        Scanner in= new Scanner (System.in);
        System.out.println("Enter the numbers");
        int num1= in.nextInt();
        int num2=in.nextInt();
        int x= num1;
        int y=num2;
        while(y!=0){
            int temp=y;
            y=x%y;
            x=temp;
        }
        int gcd=x;
        int lcm=(num1*num2)/gcd;
        System.out.printf("THE LCM IS %d",lcm);

    }
}
