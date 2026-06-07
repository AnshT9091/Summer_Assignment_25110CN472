import java.util.Scanner;

public class Ques23 {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner in= new Scanner(System.in);
        int x=in.nextInt();
        int ans= sumdigi(x);
        System.out.println(ans);
    }
    static int sumdigi(int n){
        if (n == 0) {
            return 0;
        } 
        else {
            return (n % 10) + sumdigi(n / 10);
        }
    }

}
