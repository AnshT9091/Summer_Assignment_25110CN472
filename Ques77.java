import java.util.Scanner;
public class Ques77{
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
        System.out.println("Enter the row and column of arr2");
        int r2= in.nextInt();
        int c2= in.nextInt();
        int[][] arr2= new int[r2][c2];
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                arr2[i][j]=in.nextInt();
            }
        }
        int[][] prod= new int[r1][c2];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                for(int k=0;k<c1;k++){
                    prod[i][j]= arr1[i][k]*arr2[k][j];
                } 
            }
        }
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                System.out.println(prod[i][j]);
            }
        }

    }
}
