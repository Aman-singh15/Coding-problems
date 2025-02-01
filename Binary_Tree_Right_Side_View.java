/*Given the root of a binary tree, imagine yourself standing on the right side of it, return the values of the nodes you can see ordered from top to bottom.
Example 1:
Input: root = [1,2,3,null,5,null,4]
Output: [1,3,4]
Explanation:
Example 2:
Input: root = [1,2,3,4,null,null,null,5]
Output: [1,3,4,5]
Explanation:
Example 3:
Input: root = [1,null,3]
Output: [1,3]
Example 4:
Input: root = []
Output: []


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
    public List<Integer> rightSideView(TreeNode root) {
        if (root == null) {
          return new ArrayList<>();
        }
        List<Integer>ans=new ArrayList<>();
        Queue<TreeNode>queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
          int size=queue.size();
          int right= 0;
          for(int i=0;i<size;i++){
             TreeNode node=queue.poll();
          //  right =node.val;
            if (i == size - 1) {  // Adding only the last node to the ans for Right
              ans.add(node.val);  
            }
            if(node.left!=null){
                queue.offer(node.left);
            }
            if(node.right!=null){
                 queue.offer(node.right);
            }
          }
         // ans.add(right);
        }
        return ans;
    }
}
