class Solution {
    public int longestValidParentheses(String s) {
        int mLen=0;
        Stack<Integer>stack=new Stack<>();
        stack.push(-1);
        int len=s.length();
        for(int i=0;i<len;i++){
            if(s.charAt(i)=='('){
               stack.push(i);
            }
            else{
                stack.pop();
                if(stack.empty()){
                    stack.push(i);
                }
                else{
                    mLen=Math.max(mLen,i-stack.peek());
                }
            }
        }
        return mLen;
    }
}
