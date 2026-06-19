import java.util.Scanner;
public class Ques73{
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
        int[][] arr2= new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr2[i][j]=in.nextInt();
            }
        }
        int[][] sum= new int[r][c];
         for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                sum[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        System.out.println("The sum of the matrix is");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.println(sum[i][j]);
            }
        }
    }
}
