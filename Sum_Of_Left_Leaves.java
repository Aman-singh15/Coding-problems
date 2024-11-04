// Given the root of a binary tree, return the sum of all left leaves.
// A leaf is a node with no children. A left leaf is a leaf that is the left child of another node.
/*
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
class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }
        
        int count = 0;
        
        // Check if root.left exists and is a leaf node
        if (root.left != null && root.left.left == null && root.left.right == null) {
            count += root.left.val;
        }
        
        // Recursively calculate the sum of left leaves in left and right subtrees
        count += sumOfLeftLeaves(root.left);
        count += sumOfLeftLeaves(root.right);
        
        return count;
    }
}
