/* Given the root of a binary tree, return the level order traversal of its nodes' values. (i.e., from left to right, level by level).
Example 1:
Input: root = [3,9,20,null,null,15,7]
Output: [[3],[9,20],[15,7]]
Example 2:
Input: root = [1]
Output: [[1]]
Example 3:
Input: root = []
Output: []
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

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
      if(root==null){
             return new ArrayList<>();
      }
          List<List<Integer>>output= new ArrayList<>();
          Queue<TreeNode>queue=new LinkedList<>();
          queue.offer(root);
          while(!queue.isEmpty()){
            int size=queue.size();
            List<Integer>list=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode node=queue.poll();
                list.add(node.val);
                if(node.left!=null){
                  queue.offer(node.left);
                }
                if(node.right!=null){
                  queue.offer(node.right);
                }
            }
            output.add(list);
          }
          return output;
    }
}
