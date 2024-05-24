import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorderTraversalRecursive(root, result);
        return result;
    }
    
    private void inorderTraversalRecursive(TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }
        inorderTraversalRecursive(node.left, result); // Visit left subtree
        result.add(node.val); // Visit root node
        inorderTraversalRecursive(node.right, result); // Visit right subtree
    }
}
