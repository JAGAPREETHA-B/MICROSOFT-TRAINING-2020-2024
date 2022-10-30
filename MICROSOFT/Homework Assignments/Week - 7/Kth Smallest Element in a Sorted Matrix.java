//brute force
class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int len=matrix.length;
        int[] res=new int[len*len];
        int n=0;
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                res[n++]=matrix[i][j];
            }
        }
        Arrays.sort(res);
        int ans=res[k-1];
        return ans;
    }
}

_________________________________________________________________________________________________________

//priority queue
class Solution {
    public int kthSmallest(int[][] matrix, int k){
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        int len=matrix.length;
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                pq.add(matrix[i][j]);
                if(pq.size()>k){
                    pq.poll();
                }
            }
        }
        return pq.peek();
    }
}
