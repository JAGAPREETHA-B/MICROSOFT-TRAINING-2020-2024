class KthLargest {
    
    PriorityQueue<Integer> p_queue=new PriorityQueue<>();
    int n;
    public KthLargest(int k, int[] nums) {
        n=k;
        int len=nums.length;
        for(int i=0;i<len;i++){
            add(nums[i]);
        }
    }
    
    public int add(int val) {
        p_queue.add(val);
        if(p_queue.size()>n){
            p_queue.poll();
        }
        return p_queue.peek();
    }
}
