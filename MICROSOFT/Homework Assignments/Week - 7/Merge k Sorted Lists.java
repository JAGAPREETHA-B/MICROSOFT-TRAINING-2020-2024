class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(ListNode l:lists){
            while(l!=null){
                pq.add(l.val); 
                l=l.next;
            }
        }
        ListNode res=new ListNode(0);
        ListNode curr=res;
        if(pq.size()==0){
            return null;
        }
        else{
            while(pq.size()>0){
                curr.next=new ListNode(pq.poll());
                curr=curr.next;
            }
        }
        return res.next;   
    }
}
