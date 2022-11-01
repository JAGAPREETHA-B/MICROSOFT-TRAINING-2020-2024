class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dup=new ListNode();
        dup.next=head;
        ListNode nn=dup;
        while(nn!=null){
            ListNode s=nn.next;
            ListNode e=null;
            if(s!=null){
                e=s.next;
            }
            if(e!=null){
                ListNode en=e.next;
                e.next=s;
                nn.next=e;
                s.next=en;
                nn=s;
            }
            else{
                break;
            }
        }
        return dup.next;
    }
}
