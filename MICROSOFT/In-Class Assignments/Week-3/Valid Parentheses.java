class Solution {
    public boolean isValid(String s) {
        HashMap<Character,Character> map=new HashMap<>();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(map.containsKey(ch)){
                char te=stack.empty()?' ':stack.pop();
                if(te!=map.get(ch)){
                    return false;
                }
            }
            else{
                stack.push(ch);
            }
        }
        return stack.empty();
    }
}
