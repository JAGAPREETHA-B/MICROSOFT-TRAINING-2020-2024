class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        while(head!=null){
            ListNode nn=head.next;
            head.next=prev;
            prev=head;
            head=nn;
            
        }
        return prev;
    }
}
