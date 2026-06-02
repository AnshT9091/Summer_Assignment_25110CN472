
import java.util.Scanner;

public class Ques2 {

    public static void main(String[] args) {
        System.out.println("Enter the number of which you want to print the table");
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int res;
        for(int i=1;i<=10;i++){
            res=num*i;
            System.out.println(res);
        }
        sc.close();

    }
    
}
