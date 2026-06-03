import java.util.Scanner;

public class Ques1 {

    public static void main(String[] args) {
        System.out.println("Enter the number of terms");
        Scanner sc = new Scanner(System.in);
        // QUESTION 1:-- TO FIND THE SUM OF THE N TERMS
        int n = sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.println(sum);
    
    }
}
