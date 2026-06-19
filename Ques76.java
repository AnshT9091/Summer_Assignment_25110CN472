import java.util.Scanner;
public class Ques76{
    public static void main(){
        System.out.println("Enter the row and column of arr1");
        Scanner in= new Scanner(System.in);
        int r= in.nextInt();
        int c= in.nextInt();
        int[][] arr1= new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr1[i][j]=in.nextInt();
            }
        }
        int sum=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(i==j){
                    sum=sum+arr1[i][j];
                }
            }
        }
        System.out.println(sum);
        
    }
}