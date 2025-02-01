/*Given the root of a binary tree, return the zigzag level order traversal of its nodes' values. (i.e., from left to right, then right to left for the next level and alternate between).
Example 1:
Input: root = [3,9,20,null,null,15,7]
Output: [[3],[20,9],[15,7]]
Example 2:
Input: root = [1]
Output: [[1]]
Example 3:
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


// class Solution {
//     public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
//         if(root==null){
//           return new ArrayList<>();
//         }
//         List<List<Integer>>output=new ArrayList<>();
//         Queue<TreeNode>queue=new LinkedList<>();
//         queue.offer(root);
//         int k=0;
//         while(!queue.isEmpty()){
//           List<Integer>list=new ArrayList<>();
//           int size=queue.size();
//           for(int i=0;i<size;i++){
//             TreeNode node=queue.poll();
//             list.add(node.val);
//             if(k%2==0){
//                if(node.right!=null){
//                   queue.offer(node.right);
//                }
//                if(node.left!=null){
//                 queue.offer(node.left);
//                }
//             }else{
//                if(node.left!=null){
//                   queue.offer(node.left);
//                }
//                if(node.right!=null){
//                 queue.offer(node.right);
//                }
//             }

//           }
//             output.add(list);
//             k++;
//         }
//         return output;
//     }
// }
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        
        List<List<Integer>> output = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int k = 0; // Level
        
        while (!queue.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            int size = queue.size();
            
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                list.add(node.val);
                
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            if (k % 2 != 0) { // on k is odd zigzag effect came see example
                Collections.reverse(list);
            }
            
            output.add(list);
            k++;  
        }
        return output;
    }
}
