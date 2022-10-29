class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList());
        }
        int len=prerequisites.length;
        for(int i=0;i<len;i++){
            adj.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }
        List<Integer> res=new ArrayList<>();
        if(cycleDetect(adj,numCourses)){
                return res.stream().mapToInt(Integer::intValue).toArray(); 
        }
        Stack<Integer> stack=new Stack<>();
        boolean[] visited=new boolean[numCourses];
        for(int i=0;i<numCourses;i++){
            if(!visited[i]){
                Dfs_Check(visited,adj,stack,i);
            }
        }
        while(!stack.isEmpty()){
            res.add(stack.pop());
        }
        return res.stream().mapToInt(Integer::intValue).toArray();
    }
        public void Dfs_Check(boolean[] visited,List<List<Integer>> adj,Stack<Integer> stack,int k){
            visited[k]=true;
            for(int i=0;i<adj.get(k).size();i++){
                if(!visited[adj.get(k).get(i)]){
                    Dfs_Check(visited,adj,stack,adj.get(k).get(i));
                }
            }
            stack.push(k);
        }
        public boolean cycleDetect(List<List<Integer>> adj,int n){
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                if(arr[i]==0){
                    if(detect(adj,arr,i)){
                        return true;
                    }
                }
            }
            return false;
        }
        public boolean detect(List<List<Integer>> adj,int[] arr,int k){
            if(arr[k]==2){
                return true;
            }
            arr[k]=2;
            for(int i:adj.get(k)){
                if(arr[i]!=1){
                    if(detect(adj,arr,i)){
                        return true;
                    }
                }
            }
            arr[k]=1;
            return false;
        }
}
