class Solution {
    public ListNode reverseList(ListNode head){
        return rl(head,null);
    }
    public ListNode rl(ListNode head,ListNode nn){
        if(head==null){
            return nn;
        }
        ListNode curr=head.next;
        head.next=nn;
        return rl(curr,head);
    }
}
