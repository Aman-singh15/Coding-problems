/* 
     Given the root of a binary tree and an integer targetSum, return true if the tree has a root-to-leaf path such that adding up all the values along the path equals targetSum.

A leaf is a node with no children.
*/
     class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null && targetSum==0){
            return false;
        }
        int count=0;
        return hasPathSum(root,targetSum,count);
    }
     public boolean hasPathSum(TreeNode root, int targetSum,int count){
         if(root==null){
            return false;
        }
        count+=root.val;
        if(count==targetSum && root.left==null && root.right==null){
            return true;        
        }
        boolean leftcount=hasPathSum(root.left,targetSum,count);
        boolean rightcount=hasPathSum(root.right,targetSum,count);
        return leftcount || rightcount;                     
     } 
}
