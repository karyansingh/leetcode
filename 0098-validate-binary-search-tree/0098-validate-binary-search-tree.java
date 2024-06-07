class Solution {
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean isValidBST(TreeNode root, long minVal, long maxVal) {
        if (root == null) {
            return true;
        }
        
        if (root.val <= minVal || root.val >= maxVal) {
            return false;
        }
        
        // For the left subtree, the maximum value should be updated to the parent node's value
        // For the right subtree, the minimum value should be updated to the parent node's value
        return isValidBST(root.left, minVal, root.val) && isValidBST(root.right, root.val, maxVal);
    }
}
