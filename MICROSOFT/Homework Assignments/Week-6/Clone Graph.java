class Solution {
    Map<Node,Node> map=new HashMap<>();
    public Node cloneGraph(Node node) {
        if(node==null){
            return null;
        }
        if(map.containsKey(node)){
            return map.get(node);
        }
        Node curr=new Node(node.val,new ArrayList<Node>());
        map.put(node,curr);
        for(Node nbr:node.neighbors){
            curr.neighbors.add(cloneGraph(nbr));
        }
        return map.get(node);
    }
}
