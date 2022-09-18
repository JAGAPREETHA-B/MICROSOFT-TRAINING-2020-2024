class Solution {
    public ListNode deleteDuplicates(ListNode head) {
    ListNode rd = head;
    if(rd == null){
        return rd;
    }
    while(rd.next != null){
         if(rd.val==rd.next.val){
              rd.next=rd.next.next;
         }
         else{
              rd = rd.next;
         }
    }
    return head;
    }
}
