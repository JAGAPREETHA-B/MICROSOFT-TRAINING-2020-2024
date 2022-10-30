class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> hm=new HashMap<>();
        int len=s.length(),ctr=0,k=0;
        for(char c:s.toCharArray()){
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        StringBuilder sb=new StringBuilder();
        List<Character> l=new ArrayList<>(hm.keySet());
        l.sort((x,y)->hm.get(y)-hm.get(x));
        for(char c:l){
            for(int i=0;i<hm.get(c);i++){
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
