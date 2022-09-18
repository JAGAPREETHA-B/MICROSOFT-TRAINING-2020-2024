class Main{    
    public static void main(String[] args) {    
        String str= "madam";    
        boolean val=true; 
        int len=str.length();
        for(int i=0;i<len/2;i++){    
          if(str.charAt(i)!=str.charAt(len-i-1)){
            val=false;    
            break;    
          } 
        }    
        if(val){   
          System.out.print("Given string is Palindrome");  
        }
        else{   
            System.out.print("Given string is not a Palindrome"); 
        }
    }    
}    
