import java.util.Scanner;
class Main{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    int len=str.length();
    int[] freqArr= new int[26];
    for (int i=0;i<len;i++){
      freqArr[str.charAt(i)-'a']++;
    }
    for (int i=0;i<len;i++) {
      if(freqArr[str.charAt(i)-'a']>0){
          System.out.print(str.charAt(i));
          System.out.print(freqArr[str.charAt(i)-'a']+" ");
          freqArr[str.charAt(i)-'a'] = 0;
      }
    }
  }
}
