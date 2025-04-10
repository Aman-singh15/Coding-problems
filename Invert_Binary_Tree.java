
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */


// Time Complexity in all 3 approaches is O(n) and space is O(h) where h is height of tree.
class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root==null){
          return root;
        }
        //Approach 1:-using helper 
    //     TreeNode node=new TreeNode(root.val);
    //     TreeNode temp=node;
    //     invert(root,temp);
    //     return node;
    // }
    // public void invert(TreeNode root,TreeNode temp){
    //   if(root==null){
    //       return ;
    //   }
    //   if(root.right!=null){
    //   temp.left= new TreeNode(root.right.val);
    //     invert(root.right,temp.left);
    //   }
    //   if(root.left!=null){
    //   temp.right= new TreeNode(root.left.val);
    //        invert(root.left,temp.right);
    //   }

    // Approach 2:-
        TreeNode node= new TreeNode(root.val);
        node.left = invertTree(root.right);
        node.right = invertTree(root.left);
         return node;

    }
}

// Appraoch 3:- Using in-place technique with help of swap technique to left to right and viceversa and call for both left and right node.
