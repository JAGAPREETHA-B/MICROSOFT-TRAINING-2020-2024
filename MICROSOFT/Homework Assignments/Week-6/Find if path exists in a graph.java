class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        for(int i=0;i<n;i++){
            al.add(new ArrayList<>());
        }
        for(int i=0 ; i<edges.length ; i++){
            int a=edges[i][0];
            int b=edges[i][1];
            al.get(a).add(b);
            al.get(b).add(a);
        }
        boolean[] visited=new boolean[n];
        Dfs(source,al,visited,destination);
        return (visited[source] && visited[destination]);
    }
    public void Dfs(int s,ArrayList<ArrayList<Integer>> al,boolean[] visited,int d){
        visited[s]=true; 
        for(int j:al.get(s)){
            if(!visited[j]){
                Dfs(j,al,visited,d);
            }
        }
    }
}
