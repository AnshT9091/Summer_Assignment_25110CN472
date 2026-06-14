import java.util.Scanner;
public class Ques54{
    public static void main(){
        System.out.println("Enter the element");
        Scanner in= new Scanner(System.in);
        int x= in.nextInt();
        int[] arr= new int[x];
        int count=0;
        for(int i=0;i<x;i++){
            arr[i]=in.nextInt();
        }
        System.out.println("Enter the number to find the frequency off");
        int val= in.nextInt();
        for(int i=0;i<x;i++){
            if(arr[i]==val){
                count++;
                
            }
        }
        System.out.println(count);

    }
}