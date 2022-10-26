class Solution {
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] visit=new boolean[V];
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<V;i++){
            if(!visit[i]){
                Dfs(visit,adj,i,ans);
            }
        }
        return ans;
    }
    public void Dfs(boolean[] visit,ArrayList<ArrayList<Integer>> adj,int N,ArrayList<Integer> ans){
        visit[N]=true;
        ans.add(N);
        for(int i:adj.get(N)){
            if(!visit[i]){
                Dfs(visit,adj,i,ans);
            }
        }
    }
}
