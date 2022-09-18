class Solution {
    public String sortSentence(String s) {
        String[] str=s.split(" ");
        String[] op=new String[str.length];
        int val;
        for(int i=0;i<str.length;i++){
            val=str[i].charAt(str[i].length()-1)-'0';
            op[val-1]=str[i].substring(0,str[i].length()-1);
        }
        String n="";
        for(int i=0;i<op.length;i++){
            n+=op[i];
            if(i!=op.length-1){
                n+=" ";
            }
        }
        return n;
    }
}
