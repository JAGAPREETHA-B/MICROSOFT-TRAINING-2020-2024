class Solution {
    public int lengthOfLongestSubstring(String s) {
        int count=0,i=0,j=0;
        int len=s.length();
        HashSet<Character> hs=new HashSet<>();
        while(i<len && j<len){
            if(!hs.contains(s.charAt(j))){
                hs.add(s.charAt(j));
                j++;
                count=Math.max(count,j-i);
            }
            else{
                hs.remove(s.charAt(i));
                i++;
            }
        }
        return count;
    }
}
