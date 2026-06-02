import java.util.Scanner;

public class Ques7 {

    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner input= new Scanner(System.in);
        int num=input.nextInt();
        int prod=1;
        int a;
        while(num!=0){
            a=num%10;
            prod=prod*a;
            num=num/10;
        } 
        System.out.println("The product of the digits is"+prod);
        input.close();
    }
}

