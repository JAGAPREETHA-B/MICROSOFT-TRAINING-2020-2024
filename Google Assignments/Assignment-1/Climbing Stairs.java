import java.util.Scanner;
class Main{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] cli=new int[n+3];
    cli[1]=1;
    cli[2]=2;
    for(int i=3;i<=n;i++){
      cli[i]=cli[i-1]+cli[i-2];
    }
    System.out.print(cli[n]);
  }
}
