import java.util.Scanner;
public class Ques80{
    public static void main(){
        System.out.println("Enter the row and column of arr1");
        Scanner in= new Scanner(System.in);
        int r1= in.nextInt();
        int c1= in.nextInt();
        int[][] arr1= new int[r1][c1];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                arr1[i][j]=in.nextInt();
            }
        }
        int sum=0;
        for(int j=0;j<r1;j++){
            int colsum=0;
            for(int i=0;i<c1;i++){
              sum=sum+arr1[i][j];
            }
            System.out.println(sum);
        }

    }
}
