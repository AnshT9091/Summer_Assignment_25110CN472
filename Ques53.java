import java.util.Scanner;
public class Ques53{
    public static void main(){
        System.out.println("Enter the element");
        Scanner in= new Scanner(System.in);
        int x= in.nextInt();
        int[] arr= new int[x];
        for(int i=0;i<x;i++){
            arr[i]=in.nextInt();
        }
        System.out.println("Enter the value to search");
        int sear= in.nextInt();
        for(int i=0;i<x;i++){
                if(arr[i]==sear){
                    System.out.println("The element is at index "+i);
                }
        }
    
    }
}