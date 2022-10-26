class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int len=rooms.size();
        Queue<Integer> q=new LinkedList<>();
        boolean[] visit=new boolean[len];
        visit[0]=true;
        q.add(0);
        while(!q.isEmpty()){
            int val=q.poll();
            for(int i=0;i<rooms.get(val).size();i++){
                int j=rooms.get(val).get(i);
                if(!visit[j]){
                    visit[j]=true;
                    q.add(j);
                }
            }
        }
        for(boolean k:visit){
            if(!k){
                return false;
            }
        }
        return true;
    }
}
