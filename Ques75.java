import java.util.Scanner;
public class Ques75{
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
        int[][] trans= new int[c][r];
         for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                trans[i][j]=arr1[j][i];
            }
        }
        System.out.println("The matrix transpose is given as");
         for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                System.out.println(trans[i][j]);
            }
        }


    }
}
