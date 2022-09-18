import java.util.Scanner;
class Main{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    int n = x;
    int a;
    int b=0;
    while(x!=0){
      a = x%10;
      x = x/10;
      b = a+(b*10);
    }
    System.out.print(Math.abs(b)==n);
  }         
}
