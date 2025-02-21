/*Given a binary tree with the following rules:
root.val == 0
For any treeNode:
If treeNode.val has a value x and treeNode.left != null, then treeNode.left.val == 2 * x + 1
If treeNode.val has a value x and treeNode.right != null, then treeNode.right.val == 2 * x + 2
Now the binary tree is contaminated, which means all treeNode.val have been changed to -1.
Implement the FindElements class:
FindElements(TreeNode* root) Initializes the object with a contaminated binary tree and recovers it.
bool find(int target) Returns true if the target value exists in the recovered binary tree.
Example 1:
Input
["FindElements","find","find"]
[[[-1,null,-1]],[1],[2]]
Output
[null,false,true]
Explanation
FindElements findElements = new FindElements([-1,null,-1]); 
findElements.find(1); // return False 
findElements.find(2); // return True 
Example 2:
Input
["FindElements","find","find","find"]
[[[-1,-1,-1,-1,-1]],[1],[3],[5]]
Output
[null,true,true,false]
Explanation
FindElements findElements = new FindElements([-1,-1,-1,-1,-1]);
findElements.find(1); // return True
findElements.find(3); // return True
findElements.find(5); // return False
Example 3:
Input
["FindElements","find","find","find","find"]
[[[-1,null,-1,-1,null,-1]],[2],[3],[4],[5]]
Output
[null,true,false,false,true]
Explanation
FindElements findElements = new FindElements([-1,null,-1,-1,null,-1]);
findElements.find(2); // return True
findElements.find(3); // return False
findElements.find(4); // return False
findElements.find(5); // return True
 

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

// Approach 1:-
// class FindElements {
//   TreeNode recovered;
//   HashSet<Integer>value;
//     public FindElements(TreeNode root) {
//         recovered=root;
//         value= new HashSet<>();
//         recoverhelper(recovered,0);
//     }
//     public void recoverhelper(TreeNode node, int values){
//       if(node==null){
//          return;
//       }
//          node.val=values;
//          value.add(values);
//          recoverhelper(node.left,2*values+1);
//          recoverhelper(node.right,2*values+2);
//     }
    
//     public boolean find(int target) {
//         return value.contains(target);
//     }
// }



class FindElements {
       HashSet<Integer>value;
    public FindElements(TreeNode root) {
        value=new HashSet<>();
        root.val=0;
        value.add(root.val);
        TreeRecover(root);
    }

    public void TreeRecover(TreeNode node){
        value.add( node.val);
       if(node.left!=null){
          node.left.val=2 * node.val + 1;
          TreeRecover(node.left);
       }
       if(node.right!=null){
          node.right.val=2 * node.val + 2;
           TreeRecover(node.right);
       }
    }

    public boolean find(int target) {
         return value.contains(target);
    }
}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */
