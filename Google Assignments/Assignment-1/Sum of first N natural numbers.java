import java.util.Scanner;
class Main{  
  public static void main(String[] args){  
    Scanner sc = new Scanner(System.in);
    int N=sc.nextInt();
    int sum = 0;  
    for(int i=1;i<=N;i++){  
      sum=sum+i;  
    }  
    System.out.println("Sum of first N natural numbers is : " +sum);  
  }  
}  
