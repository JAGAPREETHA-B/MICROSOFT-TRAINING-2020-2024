class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res=new ArrayList<String>();
        if(root!=null){
            btPath(root,"",res);
        }
        return res;
    }
    public void btPath(TreeNode root,String path,List<String> res){
        if(root.left==null && root.right==null){
            res.add(path+root.val);
        }
        if(root.left!=null){
            btPath(root.left,path+root.val+"->",res);
        }
        if(root.right!=null){
            btPath(root.right,path+root.val+"->",res);
        }
    }
}
