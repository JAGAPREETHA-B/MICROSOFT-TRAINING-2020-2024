import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in );
    int x=sc.nextInt();
    int y=sc.nextInt();
    int val=(x>y)?x:y;
    for(int i=val;i<=x*y;i+=val){
      if(i%x==0 && i%y==0){
          System.out.print("LCM of two  numbers is "+i);
      
      break;
      }
    }
  }
}
