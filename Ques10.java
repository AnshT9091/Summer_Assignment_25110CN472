//TO PRINT THE PRIME NUMBER FROM A TO B
import java.util.Scanner;
public class Ques10{
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the range a and b");
        int a= in.nextInt();
        int b=in.nextInt();
        for(int i=a;i<=b;i++){
            int c=2;
            boolean IsPrime=true;
            while(i<=1){
                IsPrime=false;
            }
            while(c*c<=i){
                if(i%c==0){
                    IsPrime=false;
                }
                c++;
            }
            if(IsPrime){
                System.out.println(i);
            }
        }





    }

}
