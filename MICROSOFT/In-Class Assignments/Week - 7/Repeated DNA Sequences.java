class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set v=new HashSet();
        Set rs=new HashSet();
        for(int i=0;i+9<s.length();i++){
            String tl=s.substring(i,i+10);
            if(!v.add(tl)){
                rs.add(tl);
            }
        }
        return new ArrayList(rs);
    }
}
