class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
         List<List<Integer>> res=new ArrayList<>();
         ps(root,targetSum,new ArrayList(),res);
        return res;
    }
    public void ps(TreeNode root,int tsum,List<Integer> path,List<List<Integer>> res){
        if(root==null){
            return;
        }
        path.add(root.val);
        if(root.left==null && root.right==null && tsum==root.val){
            res.add(path);
        }
        ps(root.left,tsum-root.val,new ArrayList(path),res);
        ps(root.right,tsum-root.val,new ArrayList(path),res);
    }
}
