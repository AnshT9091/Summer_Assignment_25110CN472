import java.util.Scanner;
public class Ques8 {

    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner in= new Scanner(System.in);
        int num = in.nextInt();
        int temp =num;
        int rev=0;
        int n;
        while(temp!=0){
            n=temp%10;
            rev=rev*10+n;
            temp=temp/10;
        }
        
        if(rev==num){
            System.out.println("The number is an palindrome");
        }
        else{
            System.out.println("NOT PALINDROME");
        }
        in.close();



    }
}
