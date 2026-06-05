import java.util.Scanner;
public class Ques15{
    public static void main(String[] args){
        System.out.println("Enter the number: ");
        Scanner in= new Scanner (System.in);
        int num=in.nextInt();
        int count=0;
        int temp = num;
        while(temp!=0){
            temp=temp/10;
            count++;
        }
        temp=num;
        int sum=0;
        while(temp!=0){
            int a= temp%10;
            sum=(int) (sum+Math.pow(a,count));
            temp=temp/10;
            
        }
        if(sum==num){
            System.out.println("The number is an Armstrong");
        }
        else{
            System.out.println("The number is not an Armstrong");
        }

        

    }
}

    

