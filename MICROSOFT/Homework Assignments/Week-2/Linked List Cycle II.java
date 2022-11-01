public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null){
            return null;
        }
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                fast=head;
                while(fast!=slow){
                    slow=slow.next;
                    fast=fast.next;
                }
                return fast;
            }
        }
        return null;
    }
}
