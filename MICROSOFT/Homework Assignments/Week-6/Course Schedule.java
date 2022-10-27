class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int len = prerequisites.length;
        if(len==0){
            return true;
        }
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            list.add(new ArrayList<Integer>());
        }
        for(int i=0;i<len;i++) {
            list.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }
        int[] visit=new int[numCourses];
        for(int i=0;i<numCourses;i++) {
            if(!Dfs(list,visit,i)){
                return false;  
            } 
        }
        return true;
    }
    public boolean Dfs(List<List<Integer>> list,int[] visit,int n){
         visit[n]=1;
         List<Integer> ac =list.get(n);
         for(int i=0;i<ac.size();i++) {
            int c=ac.get(i);
            if(visit[c]==1){
                return false;
            }
            if(visit[c]==0) {
                if(!Dfs(list,visit,c)){
                    return false;
                }
            }
        }
        visit[n]=2;
        return true;
    }
    
}
