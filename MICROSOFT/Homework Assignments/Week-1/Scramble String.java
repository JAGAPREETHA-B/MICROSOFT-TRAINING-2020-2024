class Solution {
    public HashMap<String,Boolean> hm= new HashMap<>();
    public boolean isScramble(String s1, String s2) {
        String str=s1+" "+s2; 
        if (hm.containsKey(str)){
            return hm.get(str);
        }
        int len=s1.length();
        if(s1.equals(s2)){
            return true;     
        }
        if(len<=1){
            return false;                   
        }
        for(int i=1;i<len;i++){
            if(isScramble(s1.substring(0,i),s2.substring(0,i)) && isScramble(s1.substring(i),s2.substring(i))|| isScramble(s1.substring(0,i),s2.substring(len-i)) && isScramble(s1.substring(i),s2.substring(0,len-i))){
            hm.put(str,true);
            return true;
            }
        }
        hm.put(str,false);
        return false;
    }
}
