class Solution {
    int Max=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        mps(root);
        return Max;
    }
    public int mps(TreeNode root){
        if(root==null){
            return 0;
        }
        int l_max=Math.max(0,mps(root.left));
        int r_max=Math.max(0,mps(root.right));
        Max=Math.max(Max,l_max+r_max+root.val);
        return Math.max(l_max+root.val,r_max+root.val);
    }
}
