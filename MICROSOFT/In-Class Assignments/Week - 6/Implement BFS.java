class Solution {
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        Queue<Integer> q=new LinkedList<>();
        boolean[] varr=new boolean[V];
        varr[0]=true;
        q.add(0);
        ArrayList<Integer> ans=new ArrayList<>();
        while(!q.isEmpty()){
            int val=q.poll();
            ans.add(val);
            Iterator<Integer> it=adj.get(val).listIterator();
            while(it.hasNext()){
                int X=it.next();
                if(!varr[X]){
                    varr[X]=true;
                    q.add(X);
                }
            }
        }
        return ans;
    }
}
