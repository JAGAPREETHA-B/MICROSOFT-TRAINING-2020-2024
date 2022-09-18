class Solution {
    public Node copyRandomList(Node head) {
        if(head==null){
            return null;
        }
        HashMap<Node,Node> hash = new HashMap<>();
        Node n1=head;
        Node res=new Node(n1.val);
        hash.put(n1,res);
        n1 = n1.next;
        Node n2=res;
        for(;n1!= null;){
            n2.next = new Node(n1.val);
            hash.put(n1,n2.next);
            n1 = n1.next;
            n2 = n2.next;
        }
        n1 = head;
        n2 = res;
        for(;n1 != null;){
            n2.random = hash.get(n1.random);
            n1 = n1.next;
            n2 = n2.next;
        }
        return res;
    }
}
