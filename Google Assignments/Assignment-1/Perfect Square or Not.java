import java.util.Scanner;  
class Main{  
  public static void main(String[] args){  
    Scanner sc=new Scanner(System.in);  
    int N=sc.nextInt();   
    double val=Math.sqrt(N);   
    if(val==(int)val){  
      System.out.print(N+" is a perfect square");  
    }  
    else{  
      System.out.print(N+" is not a perfect square");  
    }  
  }  
}  
