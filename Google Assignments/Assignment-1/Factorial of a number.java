import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt(),fact=1;
    for(int i=1;i<=N;i++){
      fact=fact*i;
    }
    System.out.println("Factorial of "+N+" is : "+fact);
  }
}
