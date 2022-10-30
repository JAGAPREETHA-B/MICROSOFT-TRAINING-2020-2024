class Solution{
        ListNode res= null;
        public ListNode reverseBetween(ListNode head, int left, int right){
        if (left==1){ 
            head = rev(head,right);
            return head;
        }
        head.next = reverseBetween(head.next, left - 1, right - 1);
        return head;
    }
    public ListNode rev(ListNode head, int n) {
        if (n == 1) {
            res=head.next;//5
            return head;
        }
        ListNode fin= rev(head.next,n - 1);
        head.next.next = head;
        head.next = res;
        return fin;
    }
}
