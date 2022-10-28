class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTree(preorder,inorder,0,inorder.length-1,0);
    }
    public TreeNode buildTree(int[] preorder,int[] inorder,int s,int e,int i){
        if(s>e){
            return null;
        }
        TreeNode root=new TreeNode(preorder[i]);
        int io=s;
        while(preorder[i]!=inorder[io]){
            io++;
        }
        root.left=buildTree(preorder,inorder,s,io-1,i+1);
        root.right=buildTree(preorder,inorder,io+1,e,i+io-s+1);
        return root;
    }
}
