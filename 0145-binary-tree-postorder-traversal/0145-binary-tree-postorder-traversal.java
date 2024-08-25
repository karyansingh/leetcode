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
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        postorderTraversalRecursive(root, result);
        return result;
    }
    
    private void postorderTraversalRecursive(TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }
        
        postorderTraversalRecursive(node.left, result); // Visit left subtree
        postorderTraversalRecursive(node.right, result); // Visit right subtree
        result.add(node.val); // Visit root node
    }
}
