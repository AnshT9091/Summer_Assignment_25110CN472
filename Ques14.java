import java.util.Scanner;
public class Ques14{
    public static void main(String[] args){
        System.out.println("Enter a number: ");
        Scanner in= new Scanner(System.in);
        int n= in.nextInt();
        int a=0;
        int b=1;
        int c;
        for(int i=0;i<n;i++){
            c=a+b;
            a=b;
            b=c;

        }
        System.out.println("The "+n+"th term of the Fibonacci series is: "+a);
    }
}