import java.util.Scanner;

public class Ques21 {
    public static void main(String[] args) {
        System.out.println("Enter the value number");
        Scanner in= new Scanner(System.in);
        int x= in.nextInt();
        int ans = fact(x);
        System.out.println(ans);

    }
    static int fact(int n){
        if(n==0){
            return 1;
        }
        else{
            return (n)*fact(n-1);
        }
    }
}