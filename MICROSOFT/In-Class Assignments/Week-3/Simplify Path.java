class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack=new Stack<>();
        String str[]=path.split("/");
        int len=str.length;
        for(int i=0;i<len;i++){
            if(!stack.empty()&&str[i].equals("..")){
                stack.pop();
            }
            else if(!(str[i].equals(".")) && !(str[i].equals("..")) && !(str[i].equals(""))){
                stack.push(str[i]);
            }
        }
        if(stack.isEmpty()){
            return "/";
        }
        else{
            String s="";
            while(!(stack.isEmpty())){
                s="/"+stack.pop()+s;
            }
            return s;
        }
    }
}
