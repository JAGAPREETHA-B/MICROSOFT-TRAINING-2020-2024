class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null){
            return head;}
        int j=0;
        ListNode temp=head;
        while(temp!=null){
            temp=temp.next;
            j++;}
        k=k%j;
        if(k==0){
            return head;}
        ListNode s=head,f=head;
        for(int i=0;i<k;i++){
            f=f.next;
        }
        while(f.next!=null){
            s=s.next;
            f=f.next;}
        temp=s.next;
        s.next = null;
        f.next = head;
        head = temp;
        return head;
    }
}
