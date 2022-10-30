class Solution {
    public int calculate(String s) {
        if(s==null || s.isEmpty()){
            return 0;
        }
        int len=s.length();
        Stack<Integer> sk=new Stack<Integer>();
        int cn=0;
        char op='+';
        for(int i=0;i<len;i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                cn=(cn*10)+(ch-'0');
            }
            if(!Character.isDigit(ch)&&!Character.isWhitespace(ch)||i==len-1){
                if(op=='-'){
                    sk.push(-cn);
                }
                else if(op=='+'){
                    sk.push(cn);
                }
                else if(op=='*'){
                    sk.push(sk.pop()*cn);
                }
                else if(op=='/'){
                    sk.push(sk.pop()/cn);
                }
                op=ch;
                cn=0;
            }
        }
        int ans=0;
        while(!sk.isEmpty()){
            ans+=sk.pop();
        }
        return ans;
    }
}
