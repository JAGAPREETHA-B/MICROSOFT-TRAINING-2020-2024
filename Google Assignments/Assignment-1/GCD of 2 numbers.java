import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in );
    int x=sc.nextInt();
    int y=sc.nextInt();
    int val=0;
    while(y!=0){
      int temp=y;
      y=x%y;
      x=temp; 
    }
    val=x;
    System.out.print("GCD of two numbers is "+val);
  }
}
