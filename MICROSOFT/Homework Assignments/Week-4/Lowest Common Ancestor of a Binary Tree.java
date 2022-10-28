class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null){
            return null;
        }
        if(p==root|| q==root){
            return root;
        }
        TreeNode lt=lowestCommonAncestor(root.left,p,q);
        TreeNode rt=lowestCommonAncestor(root.right,p,q);
        if(lt!=null && rt!=null){
            return root;
        }
        if(lt!=null){
            return lt;
        }
        else{
            return rt;
        }
    }
}
