class Solution {
     public int nNode=0;
     public ListNode removeNthFromEnd(ListNode head, int n) {
     if(head==null){
         return head;
     }
     head.next = removeNthFromEnd(head.next, n);
     nNode++;
     if(nNode==n){
         return head.next;
     }
    return head;
     }
}
