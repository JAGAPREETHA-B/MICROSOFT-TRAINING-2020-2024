class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode nn=new ListNode(0);
        ListNode nn1=nn;
        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
                nn1.next=list1;
                list1=list1.next;
            }
            else{
                nn1.next=list2;
                list2=list2.next;
            }
            nn1=nn1.next;
        }
        if(list1!=null){
            nn1.next=list1;
        }
        else{
            nn1.next=list2;
        }
        return nn.next;
    }
}
