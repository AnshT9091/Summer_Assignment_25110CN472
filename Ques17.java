import java.util.Scanner;
public class Ques17{
    public static void main(String[] args){
        Scanner in= new Scanner (System.in);
        System.out.println("Enter the number");
        int n = in.nextInt();
        int sum=0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                System.out.println(i);
                sum=sum+i;
            }
        }
        if(sum==n){
            System.out.println("The number is an perfect number");
        }
        else{
            System.out.println("The number is not an perfect number");
        }

    }
}