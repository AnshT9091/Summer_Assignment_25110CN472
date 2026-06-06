import java.util.Scanner;
public class Ques18{
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the number");
        int n= in.nextInt();
        int sum=0;
        int temp= n;
        int x;
        while(temp!=0) {
            int fact=1;
            x= temp%10;
            for(int i=1;i<=x;i++){
                fact=fact*i;
            }
            sum=sum+fact;
            temp=temp/10;
        }
            if(sum==n){
                System.out.println("The number is an strong number");
            }
            else{
                System.out.println("The number is NOT strong number");
            }

    }
}

        