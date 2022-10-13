class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists==null || lists.length==0){
            return null;
        }
           ListNode head=new ListNode(0);
            ListNode curr=head;
            List<Integer> list=new ArrayList<>();
            for(ListNode lt:lists){
                while(lt!=null){
                    list.add(lt.val);
                    lt=lt.next;
                }
            }
            Collections.sort(list);
            for(int val:list){
                curr.next=new ListNode(val);
                curr=curr.next;
            }
            
        return head.next;
    }
}
