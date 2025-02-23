/*Given two integer arrays, preorder and postorder where preorder is the preorder traversal of a binary tree of distinct values and postorder is the postorder traversal of the same tree, reconstruct and return the binary tree.
If there exist multiple answers, you can return any of them.
Example 1:
Input: preorder = [1,2,4,5,3,6,7], postorder = [4,5,2,6,7,3,1]
Output: [1,2,3,4,5,6,7]
Example 2:
Input: preorder = [1], postorder = [1]
Output: [1]
Constraints:
1 <= preorder.length <= 30
1 <= preorder[i] <= preorder.length
All the values of preorder are unique.
postorder.length == preorder.length
1 <= postorder[i] <= postorder.length
All the values of postorder are unique.
It is guaranteed that preorder and postorder are the preorder traversal and postorder traversal of the same binary tree.

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
// import java.util.*;
// class Solution {
//     int preIndex = 0;
//     int postIndex = 0;

//     public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
//         return buildTree(preorder, postorder);
//     }

//     private TreeNode buildTree(int[] preorder, int[] postorder) {
//         TreeNode root = new TreeNode(preorder[preIndex++]);

//         if (root.val != postorder[postIndex]) { 
//             root.left = buildTree(preorder, postorder);
//         }
//         if (root.val != postorder[postIndex]) { 
//             root.right = buildTree(preorder, postorder);
//         }
        
//         postIndex++; 
//         return root;
//     }
// }

class Solution {
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        return constructHelper(preorder, postorder, 0, preorder.length - 1, 0, postorder.length - 1);
    }

    private TreeNode constructHelper(int[] preorder, int[] postorder, int preStart, int preEnd, int postStart, int postEnd) {
        if (preStart > preEnd || postStart > postEnd) {
            return null;
        }

        TreeNode root = new TreeNode(preorder[preStart]);
        if (preStart == preEnd) {
            return root;
        }
        int leftRootVal = preorder[preStart + 1];
        int index = postStart;
        while (postorder[index] != leftRootVal) {
            index++;
        }
        int leftSize = index - postStart + 1;
        root.left = constructHelper(preorder, postorder, preStart + 1, preStart + leftSize, postStart, index);
        root.right = constructHelper(preorder, postorder, preStart + leftSize + 1, preEnd, index + 1, postEnd - 1);

        return root;
    }
}
