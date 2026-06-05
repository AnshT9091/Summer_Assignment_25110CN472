import java.util.Scanner;
public class Ques16{
    public static void main(String[] args){
        Scanner in= new Scanner (System.in);
        System.out.println("Enter the number");
        int num1=in.nextInt();
        int num2=in.nextInt();
        int count=0;
        int temp;
        for(int i=num1;i<=num2;i++){
            temp=i;
            while(temp!=0){
                temp=temp/10;
                count++;
            }
            temp=i;
            int sum=0;
            while(temp!=0){
                int a= temp%10;
                sum=(int) (sum+Math.pow(a,count));
                temp=temp/10;
                
            }
            if(sum==i){
                System.out.println(i);
            }
             count=0;
        }
    }
}