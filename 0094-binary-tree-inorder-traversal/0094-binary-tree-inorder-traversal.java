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
    public List<Integer> inorderTraversal(TreeNode root) {
       in(root);
       return ans;
        
    }
   List<Integer> ans = new ArrayList<>();
    public void in(TreeNode node){
        if(node == null) return;
        
        in(node.left);
        ans.add(node.val);
        in(node.right);
    }
    }
