import java.util.Scanner;
class Main{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
      if(x<2){
        System.out.print(x);
      }
      int s=1,e=x/2,mid;
      while(s<=e){
        mid=(s+e)/2;
        if((long)mid*mid>x){
          e=mid-1;
        }
        else{
          s=mid+1;
        }
      }
      System.out.print(e);
    }
}
