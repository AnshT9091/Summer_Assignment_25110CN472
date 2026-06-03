import java.util.Scanner;

public class Ques9{
    public static void main(){
        System.out.println("Enter the number to check");
        Scanner in= new Scanner(System.in);
        int num=in.nextInt();
        int c=2;
        boolean isPrime=true;
        while(num<=1){
            System.out.println("Not prime");
        }
        while(c*c<=num){
            if(num%c==0){
                isPrime=false;
            }
            c++;
        }
        if(isPrime){
            System.out.println(" The number isPrime");
        }
        else{
            System.out.println("Not a  prime number");
        }

    }
        

    }
