class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap();
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        Queue<Integer> q=new PriorityQueue<>((l1,l2)->map.get(l2)-map.get(l1));
        for(int nm:map.keySet()){
            q.add(nm);
        }
        int[] res=new int[k];
        for(int i=k-1;i>=0;--i){
            res[i]=q.poll();
        }
        return res;
    }
}
