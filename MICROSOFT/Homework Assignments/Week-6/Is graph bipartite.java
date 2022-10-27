class Solution {
    public boolean isBipartite(int[][] graph) {
        int len=graph.length;
        int[] color=new int[len];
        for(int i=0;i<len;i++){
            if(color[i]==0){
                Queue<Integer> q=new LinkedList<>();
                q.add(i);
                color[i]=1;
                while(!q.isEmpty()){
                    int val=q.poll();
                    for(int k:graph[val]){
                        if(color[k]==color[val]){
                            return false;
                        }
                        else if(color[k]==0){
                            q.add(k);
                            color[k]=-color[val];
                        }
                    }
                }
            }
        }
        return true;
    }
}
