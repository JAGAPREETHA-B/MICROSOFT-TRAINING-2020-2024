
import java.util.Scanner;
class Main{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
      int N=sc.nextInt();
      int[][] mat=new int[N][N];
      for(int i=0;i<N;i++){
        for(int j=0;j<=i;j++){
          if(j==0||j==i){ 
            mat[i][j]=1;
          }             
          else{
            mat[i][j]=mat[i-1][j-1]+mat[i-1][j];
          }
        }
      }
      for(int i=0;i<N;i++){
        for(int j=0;j<=i;j++){
          System.out.print(mat[i][j]+" ");
        }
        System.out.println();
      }
  }
}
